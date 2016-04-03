package za.ac.cput.rcarstens.factories;

import za.ac.cput.rcarstens.domain.AddressDetails;

/**
 * Created by sanXion on 2016/04/03.
 */
public interface AddressDetailsFactory {
    AddressDetails createAddressDetails(String physicalAddress, String postalAddress);

}
