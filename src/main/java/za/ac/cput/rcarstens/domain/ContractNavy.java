package za.ac.cput.rcarstens.domain;

/**
 * Created by rcarstens on 2016/04/07.
 */
public class ContractNavy extends Contract {

    @Override
    public String contractType(String type)
    {
        if(type.equalsIgnoreCase("Navy"))
        {
            return "Contract Navy";
        }
        else
        {
            return nextContract.contractType(type);
        }
    }
}
