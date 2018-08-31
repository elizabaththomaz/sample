import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by user on 24/7/18.
 */
public class AdditionTest {
    Addition obj = new Addition();

    @Test
    public void testadd() {
        Assert.assertEquals(8,obj.add(5,3));
    }
    @Before
    public void init(){
        obj=new Addition();
    }
    }

