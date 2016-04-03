package za.ac.cput.rcarstens.factories.Impl;

import za.ac.cput.rcarstens.domain.AddressDetails;
import za.ac.cput.rcarstens.factories.AddressDetailsFactory;

import java.util.UUID;

/**
 * Created by sanXion on 2016/04/03.
 */

public class AddressDetailsFactoryImpl implements AddressDetailsFactory {

    private static AddressDetailsFactoryImpl factory = null;

    private  AddressDetailsFactoryImpl() {
    }
    public static AddressDetailsFactoryImpl getInstance(){
        if(factory ==null)
            factory = new AddressDetailsFactoryImpl();
        return factory;
    }

    public AddressDetails createAddressDetails(String physicalAddress, String postalAddress) {
        AddressDetails addressDetails = new AddressDetails
                .Builder()
                .id(UUID.randomUUID().toString())
                .physicalAddress(physicalAddress)
                .postalAddress(postalAddress)
                .build();
        return addressDetails;
    }
}
