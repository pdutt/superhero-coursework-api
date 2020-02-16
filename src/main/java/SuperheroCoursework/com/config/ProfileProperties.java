package SuperheroCoursework.com.config;

import SuperheroCoursework.com.Model.CurriculumPlan;

public class ProfileProperties {

    String firstName;
    String lastName;
    String profileId;
    String role;
    String access;
    CurriculumPlan curriculumPlan;

    public ProfileProperties(String firstName,  String lastName, String profileId, String role,
                      String access, CurriculumPlan curriculumPlan) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.profileId = profileId;
        this.role = role;
        this.access = access;
        this.curriculumPlan = curriculumPlan;
    }

}
