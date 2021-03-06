package SuperheroCoursework.com.service;

import SuperheroCoursework.com.Model.Curriculum.Curriculum;
import SuperheroCoursework.com.impl.dao.CurriculumDao;
import net.minidev.json.JSONObject;
import org.json.simple.JSONArray;

public class CurriculumService {

    public CurriculumDao curriculumDao = new CurriculumDao();

    public String mapContent(String request) {
        return "Mapped Content";
    }

    public void saveModule(String content) {

    }

    public Curriculum getCurriculum () throws Exception {
        return curriculumDao.ingestJson();
    }

    public JSONArray getCurriculumJson() throws Exception {
        JSONObject obj = curriculumDao.getCurriculumJson();
        JSONArray jsonArray = new JSONArray();
        jsonArray.add(obj);
        return jsonArray;
    }

    public String findObjective(String objectiveName) {
        if (doesExist(objectiveName)) {
            //call dao layer and filter by content for certain objective
            return curriculumDao.getObjectiveByName(objectiveName);
        }
        //TODO: Throw exception
        return null;
    }

    private boolean doesExist (String objectiveName) {
        //TODO: call Curriculum Dao to check
        return true;
    }
}
