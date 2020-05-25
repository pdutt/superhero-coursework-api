package SuperheroCoursework.com.Model.Curriculum;

import SuperheroCoursework.com.Model.Content;

import java.util.ArrayList;
import java.util.HashMap;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Curriculum {

    String curriculumId;
    HashMap<String, Objective> objectives;

    public Curriculum (){
        this.objectives = new HashMap<>();
    }

    public Objective getObjective(String key) {
        return objectives.get(key);
    }

    public void setObjective(String key, Objective value) {
        objectives.put(key, value);
    }

    public HashMap<String, Objective> getObjectives() {
        return objectives;
    }

    public void setCurriculumId (String curriculumId) {
        this.curriculumId = curriculumId;
    }

    public String getCurriculumId() {
        return curriculumId;
    }


}
