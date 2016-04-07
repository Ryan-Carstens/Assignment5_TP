package za.ac.cput.rcarstens.factories;

import za.ac.cput.rcarstens.domain.RegistrationEntry;

/**
 * Created by sanXion on 2016/04/03.
 */
public interface RegistrationEntryFactory {
    RegistrationEntry createRegistrationEntry(String southAfricanID, String gender, String placementChoice);

}
