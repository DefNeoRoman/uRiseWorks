package answersToInterview.reflection;

import java.lang.reflect.Field;

public class ModifyingPrivateFields {
    public static void main(String[] args) throws Exception {
        WithPrivateField pf = new WithPrivateField();

        Field f = pf.getClass().getDeclaredField("i");
        f.setAccessible(true);
        f.setInt(pf, 47);
        System.out.println(pf);

        f = pf.getClass().getDeclaredField("s");
        f.setAccessible(true);
        f.set(pf, "MODIFY S");
        System.out.println(pf);


        f = pf.getClass().getDeclaredField("s2");
        f.setAccessible(true);
        f.set(pf, "MODIFY S2");
        System.out.println(pf);
    }

}
