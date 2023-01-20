package Java.LearningJava.Testing.jUnit;
import org.junit.Test;

import static Java.LearningJava.Testing.jUnit.calc.add;
import static org.junit.Assert.*;

public class calctest {
    @Test
    public void testcalc(){
        assertTrue("wrong!", 5==add(2, 3));
        assertTrue("wrong!", 6==add(3, 3));
    }
}
