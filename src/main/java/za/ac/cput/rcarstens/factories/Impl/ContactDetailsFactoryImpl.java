package za.ac.cput.rcarstens.factories.Impl;

import za.ac.cput.rcarstens.domain.ContactDetails;
import za.ac.cput.rcarstens.factories.ContactDetailsFactory;

import java.util.UUID;

/**
 * Created by sanXion on 2016/04/03.
 */
public class ContactDetailsFactoryImpl implements ContactDetailsFactory {
    private static ContactDetailsFactoryImpl factory = null;

    private  ContactDetailsFactoryImpl() {
    }
    public static ContactDetailsFactoryImpl getInstance(){
        if(factory ==null)
            factory = new ContactDetailsFactoryImpl();
        return factory;
    }

    public  ContactDetails createContactDetails(String homePhone, String cellPhone) {
        ContactDetails addressDetails = new  ContactDetails
                .Builder()
                .id(UUID.randomUUID().toString())
                .homePhone(homePhone)
                .cellPhone(cellPhone)
                .build();
        return addressDetails;
    }
}
