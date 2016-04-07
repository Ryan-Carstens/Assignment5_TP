package za.ac.cput.rcarstens.factories;

import za.ac.cput.rcarstens.domain.Recruit;

/**
 * Created by sanXion on 2016/04/03.
 */
public interface RecruitFactory {
    Recruit createRecruit(String southAfricanID, String firstName, String lastName);
}
