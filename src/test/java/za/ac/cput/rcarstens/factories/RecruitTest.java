package za.ac.cput.rcarstens.factories;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.rcarstens.domain.Recruit;
import za.ac.cput.rcarstens.factories.Impl.RecruitFactoryImpl;

/**
 * Created by sanXion on 2016/04/07.
 */
public class RecruitTest {

    private RecruitFactory recruitFactory;
    private Recruit recruit;

    @Before
    public void setUp() throws Exception
    {
        recruitFactory = RecruitFactoryImpl.getInstance();
        recruit = recruitFactory.createRecruit("9004275201088", "Rob", "Ash");
    }

    @Test
    public void testCreateRecruit() throws Exception
    {
        //Assert.assertEquals(recruit.getSouthAfricanID(),"9004275201088");
        Assert.assertEquals(recruit.getFirstName(),"Rob");
        //Assert.assertEquals(recruit.getLastName(),"Ash");
    }

    @Test
    public void testUpdateRecruit() throws Exception
    {
        Recruit updateRecruit = new Recruit.Builder().copy(recruit).firstName("Cracks").build();
        Assert.assertEquals(updateRecruit.getFirstName(),"Cracks");
    }
}
