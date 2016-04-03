package za.ac.cput.rcarstens.factories;

import za.ac.cput.rcarstens.domain.ContactDetails;

/**
 * Created by sanXion on 2016/04/03.
 */
public interface ContactDetailsFactory {
    ContactDetails createContactDetails(String homePhone, String cellPhone);
}
