package kata.designPatterns;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class SingletonTest {

    @Test
    void cannotAccessConstructor() throws NoSuchMethodException {
        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
    }

    @Test
    void createdOnlyOneInstance() {
        Singleton firstInstance = Singleton.getInstance();
        Singleton secondInstance = Singleton.getInstance();
        Singleton thirdInstance = Singleton.getInstance();

        assertSame(firstInstance, secondInstance);
        assertSame(secondInstance, thirdInstance);
    }
}
