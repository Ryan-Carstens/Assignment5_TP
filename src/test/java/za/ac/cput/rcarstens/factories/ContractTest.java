package za.ac.cput.rcarstens.factories;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.rcarstens.domain.Contract;
import za.ac.cput.rcarstens.domain.ContractAirforce;
import za.ac.cput.rcarstens.domain.ContractArmy;
import za.ac.cput.rcarstens.domain.ContractNavy;

/**
 * Created by sanXion on 2016/04/07.
 */
public class ContractTest {
    Contract contractAirforce;
    Contract contractArmy;
    Contract contractNavy;

    @Before
    public void setUp() throws Exception
    {
        contractAirforce = new ContractAirforce();
        contractArmy = new ContractArmy();
        contractNavy = new ContractNavy();
    }

    @Test
    public void testContractAirforce() throws Exception
    {
       Assert.assertSame(contractAirforce.contractType("airforce"),"Contract Airforce");
    }

    @Test
    public void testContractArmy() throws Exception
    {
        Assert.assertSame(contractArmy.contractType("army"),"Contract Army");
    }

    @Test
    public void testContractNavy() throws Exception
    {
        Assert.assertSame(contractNavy.contractType("navy"),"Contract Navy");
    }
}
