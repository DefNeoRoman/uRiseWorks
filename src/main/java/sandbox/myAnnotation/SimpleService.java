package sandbox.myAnnotation;
@Service(name = "SuperPuperSimple")
public class SimpleService {
    @Init
    public void initService(String s){

        System.out.println("init Service is worked in SimpleService"+s);
    }
}
