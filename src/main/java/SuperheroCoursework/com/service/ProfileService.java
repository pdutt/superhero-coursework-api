package SuperheroCoursework.com.service;

import SuperheroCoursework.com.Model.Profile;
import SuperheroCoursework.com.impl.dao.ProfileDao;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {

    ProfileDao profileDao = new ProfileDao();

    public Profile getProfile(String profileId) throws Exception {
        return profileDao.getProfile(profileId);
    }

    public String findAvailableUnits() {
        return "";
    }
}
