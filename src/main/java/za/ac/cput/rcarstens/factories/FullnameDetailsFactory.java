package za.ac.cput.rcarstens.factories;

import za.ac.cput.rcarstens.domain.FullnameDetails;

/**
 * Created by sanXion on 2016/04/03.
 */
public interface FullnameDetailsFactory {
    FullnameDetails createFullnameDetails(String firstname, String lastname);
}
