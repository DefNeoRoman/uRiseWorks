package sandbox.bankAccount;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//jps - команда которая показывает id процессов и сами процессы
public class Operations {
    private static final Logger log = LoggerFactory.getLogger(Operations.class);
    public static void main(String[] args) throws Exception {
        final Account a = new Account(1000);
        final Account b = new Account(2000);
        new Thread(() -> {
            try {
                transfer(a,b,500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
            transfer(b,a,300);
    }
    static void transfer(Account acc1, Account acc2, int amount) throws Exception{
        log.info("in method");
        if(acc1.getBalance()<amount){
            System.out.println("Недостаточно денег");
            throw new Exception();
        }
        synchronized (acc1){
            log.info("in first sync");
            Thread.sleep(1000);
            synchronized (acc2){
                log.info("in second sync");
                acc1.withDraw(amount);
                acc2.deposit(amount);
            }
        }

    }
}
