package za.ac.cput.rcarstens.domain;

/**
 * Created by rcarstens on 2016/04/07.
 */
public class ContractAirforce extends Contract {

    @Override
    public String contractType(String type)
    {
        if(type.equalsIgnoreCase("Airforce"))
        {
            return "Contract Airforce";
        }
        else
        {
            return nextContract.contractType(type);
        }
    }
}
