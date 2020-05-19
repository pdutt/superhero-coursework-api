package SuperheroCoursework.com.impl.dao;

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

   //TODO : Get json objects from Azure storageCloud
    public void connectToStorageAccount() {

    }

    public void ingestJson() throws Exception {
        JSONParser jsonParser = new JSONParser();
        try {
            FileReader f = new FileReader(CurriculumConstants.jsonFilePath);
            Object obj = jsonParser.parse(f);

            JSONObject JsonObject = (JSONObject) obj;
            Set<String> keySet = JsonObject.keySet();

            Iterator<String> itr = keySet.iterator();
            while (itr.hasNext()) {
                String curriculumTopics = itr.next();
                JSONObject transferObj = (JSONObject) JsonObject.get(curriculumTopics);
                Map transfer = ((Map) JsonObject.get(curriculumTopics));

                setJsonValues(transferObj, transfer);
            }

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

                Map val = ((Map) jsonObject.get(pair.getKey().toString()));
                Iterator<Map.Entry> itr3 = val.entrySet().iterator();

                //Map topics in modules
                while (itr3.hasNext()) {
                    Map.Entry pair2 = itr3.next();
                    System.out.println(pair2.getKey() + " : " + pair2.getValue());
                }
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
