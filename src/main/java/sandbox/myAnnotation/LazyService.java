package sandbox.myAnnotation;
@Service(name = "VeryLazy")
public class LazyService {
    @Init(suppressException = true)
    public void lazyInit(String s) throws Exception{
        System.out.println("lazyInit is worked in LazyService"+s);
    }
}
