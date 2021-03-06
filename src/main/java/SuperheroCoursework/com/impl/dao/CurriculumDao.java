package SuperheroCoursework.com.impl.dao;

import SuperheroCoursework.com.Model.Curriculum.Curriculum;
import SuperheroCoursework.com.Model.Curriculum.Module;
import SuperheroCoursework.com.Model.Curriculum.Objective;
import SuperheroCoursework.com.constants.CurriculumConstants;
import lombok.extern.slf4j.Slf4j;
import net.minidev.json.JSONObject;
import net.minidev.json.parser.JSONParser;
import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
public class CurriculumDao {

    public Curriculum curriculum = new Curriculum();
    public Objective objective;
    public Module module;

   //TODO : Get json objects from Azure storageCloud
    public JSONObject getCurriculumJson() throws Exception {
        JSONParser jsonParser = new JSONParser();
        try {
            FileReader f = new FileReader(CurriculumConstants.jsonFilePath);
            Object obj = jsonParser.parse(f);
            JSONObject JsonObject = (JSONObject) obj;
            return JsonObject;
        }
        catch (Exception ex) {
            throw new Exception();
        }
    }

    public Curriculum ingestJson() throws Exception {
        JSONParser jsonParser = new JSONParser();
        try {
            FileReader f = new FileReader(CurriculumConstants.filePath);
            Object obj = jsonParser.parse(f);

            JSONObject JsonObject = (JSONObject) obj;
            Map curriculumObj = JsonObject;
            Iterator<Map.Entry> itr1 = curriculumObj.entrySet().iterator();

            while (itr1.hasNext()) {
                Map.Entry header = itr1.next();

                if (header.getKey().equals(CurriculumConstants.CURRICULUM_ID)) {
                    curriculum.setCurriculumId(header.getValue().toString());
                }
                else {
                    JSONObject transferObj = (JSONObject) JsonObject.get(header.getKey().toString());
                    Map transfer = ((Map) JsonObject.get(header.getKey().toString()));

                    objective = new Objective();

                    setJsonValues(transferObj, transfer);
                    curriculum.setObjective(header.getKey().toString(), objective);
                }
            }
            return curriculum;

        } catch (Exception ex) {
            throw new Exception ("Wasn't able to extract json object.");
        }

    }

    public void setJsonValues(JSONObject jsonObject, final Map map) throws Exception{
        try {
            // iterating address Map
            Iterator<Map.Entry> itr1 = map.entrySet().iterator();
            while (itr1.hasNext()) {
                //Map Transfer modules
                Map.Entry pair = itr1.next();
                module = new Module();
                module.setModuleName(pair.getValue().toString());

                Map val = ((Map) jsonObject.get(pair.getKey().toString()));
                Iterator<Map.Entry> itr3 = val.entrySet().iterator();

                //Map topics in modules
                while (itr3.hasNext()) {
                    Map.Entry pair2 = itr3.next();
                    System.out.println(pair2.getKey() + " : " + pair2.getValue());
                    module.addTopic(pair2.getValue().toString());
                }
                objective.setModule(pair.getKey().toString(), module);
                System.out.println(pair.getKey() + " : " + pair.getValue());
            }
        }
        catch(Exception ex){
            throw new Exception ("Wasn't able to parse modules.");
            }
    }
    //example
    public String getObjectiveByName(String objectiveName) {
        //TODO: use query
        return null;

    }
}
