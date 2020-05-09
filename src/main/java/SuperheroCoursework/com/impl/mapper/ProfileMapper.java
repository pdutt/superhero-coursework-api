package SuperheroCoursework.com.impl.mapper;


import SuperheroCoursework.com.Model.Profile;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProfileMapper {
    public static Profile mapRow(final ResultSet resultSet) {
        try {
            Profile profile = new Profile();
            profile.setFirstName(resultSet.getString("FIRST_NAME"));
            profile.setLastName(resultSet.getString("LAST_NAME"));
            profile.setProfileId(resultSet.getString("PROFILE_ID"));
            profile.setRole(resultSet.getString("ROLE"));
            profile.setAccess(resultSet.getString("ACCESS"));
            profile.setCurriculumPlanId(resultSet.getInt("CURRICULUM_PLAN_ID"));
            return profile;
        } catch (SQLException e) {

            e.printStackTrace();
        }
    }
}
