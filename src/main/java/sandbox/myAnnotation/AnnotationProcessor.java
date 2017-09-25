package sandbox.myAnnotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public class AnnotationProcessor {
    public static void main(String[] args) {
        inspectService(LazyService.class);
        inspectService(SimpleService.class);
       // inspectService(String.class);
    }
    static void inspectService(Class<?> service){
        Object o = null;
        try {
            o = service.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        if(service.isAnnotationPresent(Service.class)){

            Method[] methods = service.getMethods();
          try {
              methods[0].invoke(o," вызов через рефлексию");
          } catch (IllegalAccessException e) {
              e.printStackTrace();
          } catch (InvocationTargetException e) {
              e.printStackTrace();
          }
      }
    }
}
