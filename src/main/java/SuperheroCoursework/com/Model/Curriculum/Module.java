package SuperheroCoursework.com.Model.Curriculum;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Module {

    String moduleName;
    List<String> topics;

    public Module() {
        this.topics = new ArrayList<>();
    }
    public void addTopic(String topic) {
        topics.add(topic);
    }

    public List<String> getTopics() {
        return topics;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }


}
