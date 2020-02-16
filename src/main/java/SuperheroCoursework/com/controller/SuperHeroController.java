package SuperheroCoursework.com.controller;

import SuperheroCoursework.com.Model.Profile;
import SuperheroCoursework.com.service.ContentService;
import SuperheroCoursework.com.service.CurriculumService;
import SuperheroCoursework.com.service.ProfileService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class SuperHeroController {

    public ContentService contentService = new ContentService();
    public ProfileService profileService = new ProfileService();
    public CurriculumService curriculumService = new CurriculumService();

    @GetMapping("/content")
    public String getContent(@RequestParam String content){

        return contentService.mapContent(content);
    }

    @GetMapping("/units")
    public String getUnits(){

        return profileService.findAvailableUnits();
    }

    @GetMapping("/profile")
    public Profile getProfile(@RequestParam String username, @RequestParam String password){

        return profileService.getProfile(username, password);
    }

    @GetMapping("/objectives")
    public String getObjective(@RequestParam String objectiveName) {
        return curriculumService.findObjective(objectiveName);
    }

}

