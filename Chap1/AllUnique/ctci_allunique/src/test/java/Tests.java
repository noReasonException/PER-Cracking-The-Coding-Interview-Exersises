

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
@RunWith(Parameterized.class)
public class Tests {
    AllUnique u ;
    String test;
    @Parameterized.Parameters
    public static Collection<Object> data() {
        return Arrays.asList("aabbaa",
                            "1234aa",
                            "12344asd",
                            "1234564");
    }

    public Tests(String s) {
        this.test=s;
    }

    @Before
    public void init(){
        u=new AllUnique();
    }

    @Test
    public void testDuplicatestest(){
        assertFalse(u.withAdditionalDataStructure(test));
        assertFalse(u.withNoAdditionalDataStructure(test));
    }
}
