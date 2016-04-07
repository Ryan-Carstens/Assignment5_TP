package za.ac.cput.rcarstens.factories;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.rcarstens.domain.DetailsCheck;
import za.ac.cput.rcarstens.factories.Impl.DetailsCheckFactoryImpl;

/**
 * Created by sanXion on 2016/04/07.
 */
public class DetailsCheckTest {

    private DetailsCheckFactory detailsCheckFactory;
    private DetailsCheck detailsCheck;

    @Before
    public void setUp() throws Exception
    {
        detailsCheckFactory = DetailsCheckFactoryImpl.getInstance();
        detailsCheck = detailsCheckFactory.createDetailsCheck(true);
    }

    @Test
    public void testCreateDetailsCheck() throws Exception
    {
        Assert.assertEquals(detailsCheck.getResponse(), true);

    }

    @Test
    public void testUpdateDetailsCheck() throws Exception
    {
        DetailsCheck updateDetailsCheck = new DetailsCheck.Builder().copy(detailsCheck).response(false).build();
        Assert.assertEquals(updateDetailsCheck.getResponse(),false);
    }
}
