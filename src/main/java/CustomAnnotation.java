import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface SnehaAnnotation{
    int value();
}
class Hello{
    @SnehaAnnotation(value = 10)
    public void  sayHello(){
        System.out.println("Hello annotation");
    }

}
public class CustomAnnotation {
    public static void main(String[] args) throws Exception {
        Hello h= new Hello();
        Method m= h.getClass().getMethod("sayHello");
        SnehaAnnotation sa= m.getAnnotation(SnehaAnnotation.class);
        System.out.println("value is :" +sa.value());

    }

}
