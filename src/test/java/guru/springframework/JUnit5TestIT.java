package guru.springframework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class JUnit5TestIT {

    @Test
    void someTestforJUnit5() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
        Assertions.assertEquals("Hello World", javaHelloWorld.getHello());
    }
}
