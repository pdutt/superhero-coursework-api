package SuperheroCoursework.com.service;

import org.springframework.stereotype.Service;

@Service
public class ContentService {

    String id;
    String content;
    String unit;

    public String getContent() {
        return content;
    }

    public String getUnit() {
        return unit;
    }

    public String getId() {
        return id;
    }

    public String mapContent(String request) {
        return "Mapped Content";
    }

    public void saveModule(String content) {

    }
}
