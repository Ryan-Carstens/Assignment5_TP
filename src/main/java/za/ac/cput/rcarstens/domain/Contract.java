package za.ac.cput.rcarstens.domain;

/**
 * Created by rcarstens on 2016/04/07.
 */
public abstract class Contract {
    private int ContractNum;
    private int IdCheckNum;
    private int DetailsCheckNum;
    public Contract nextContract;

    public void setNextContract(Contract nextContract)
    {
        this.nextContract = nextContract;
    }

    public int getContractNum() {
        return ContractNum;
    }

    public int getDetailsCheckNum() {
        return DetailsCheckNum;
    }

    public int getIdCheckNum() {
        return IdCheckNum;
    }

    public abstract String contractType(String type);
}
