package SuperheroCoursework.com.service;

import SuperheroCoursework.com.Model.Profile;
import SuperheroCoursework.com.impl.dao.ProfileDao;

public class ProfileService {

    Profile profile;
    ProfileDao profileDao;

    public Profile getProfile(String username, String password) {


        return profileDao.getProfile(username, password);
    }

    public String findAvailableUnits() {
        return "";
    }
}
