package SuperheroCoursework.com.Model.Curriculum;

import SuperheroCoursework.com.Model.Content;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Curriculum {

    List<Module> modules = new ArrayList<Module>();
    int curriculumId;
    String units;
    String gradeLevel;
    HashMap<String, Content> contentFinder;


}
