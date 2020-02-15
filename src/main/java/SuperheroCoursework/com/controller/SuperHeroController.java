package SuperheroCoursework.com.controller;

import SuperheroCoursework.com.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SuperHeroController {

    @Autowired
    ContentService contentService;

    @GetMapping("/content")
    public String getContent(@RequestParam String content){

        return contentService.mapContent(content);
    }

    @GetMapping("/units")
    public String getUnits(){

        return profileService.findAvailableUnits();
    }

    @GetMapping("/profile")
    public String getUnits(){

        return profileService.getProfile();
    }


}
