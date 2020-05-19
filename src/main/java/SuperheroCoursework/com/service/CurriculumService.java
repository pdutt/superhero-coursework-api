package SuperheroCoursework.com.service;

import SuperheroCoursework.com.impl.dao.CurriculumDao;

public class CurriculumService {

    public CurriculumDao curriculumDao = new CurriculumDao();

    public String mapContent(String request) {
        return "Mapped Content";
    }

    public void saveModule(String content) {

    }

    public void executeJson() throws Exception {
        curriculumDao.ingestJson();
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
