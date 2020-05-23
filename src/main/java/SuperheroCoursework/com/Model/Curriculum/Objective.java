package SuperheroCoursework.com.Model.Curriculum;

import java.util.HashMap;
import java.util.Map;

public class Objective {

    public HashMap<String, Module> modules;

    public Objective() {
        this.modules = new HashMap<>();
    }

    public Module getModule(String key) {
        return modules.get(key);
    }

    public void setModule(String key, Module value) {
        modules.put(key, value);
    }

    public HashMap<String, Module> getModules() {
        return modules;
    }
}
