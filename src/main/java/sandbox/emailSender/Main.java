package sandbox.emailSender;

public class Main {
    //private static com.devcolibri.tls.Sender tlsSender = new com.devcolibri.tls.Sender("<ваш email на gmail>", "<ваш пароль>");
    private static SslSender sslSender = new SslSender("d89056411060@yandex.ru", "пароль");

    public static void main(String[] args){
       // tlsSender.send("This is Subject", "TLS: This is text!", "support@devcolibri.com", "alex@devcolibri.com");
        sslSender.send("This is Subject", "SSL: This is text!", "d89056411060@yandex.ru", "romangaponov25@gmail.com");
    }

}
