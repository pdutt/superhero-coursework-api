package SuperheroCoursework.com.Model;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Profile {

    private String firstName;
    private String lastName;
    private String profileId;
    private String role;
    private String access;
    private int curriculumPlanId;

    public Profile () { }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setProfileId (String profileId) {
        this.profileId = profileId;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public void setCurriculumPlanId (int curriculumPlanId) {
        this.curriculumPlanId = curriculumPlanId;
    }

    public String getFirstName() { return firstName; }

    public String getLastName() {return lastName; }

    public String getProfileId() { return profileId; }

    public String getRole() { return role; }

    public String getAccess() { return access; }

    public int getCurriculumPlanId() { return curriculumPlanId; }

}
