import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * An example of Java style spring bean configuration.
 */
@Configuration
public class HelloWorldJavaConfig {

    @Bean(name="helloWorld")
    public IHelloWorld helloWorld() {
        //return new HelloWorldImpl().setHello("Hello World, java config style");
        HelloWorldImpl helloWorldImpl = new HelloWorldImpl();
        //helloWorldImpl.setHello("Hello World, java config style");
        return helloWorldImpl;
    }

}
