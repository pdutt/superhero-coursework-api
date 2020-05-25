package SuperheroCoursework.com.controller;

import SuperheroCoursework.com.Model.Curriculum.Curriculum;
import SuperheroCoursework.com.Model.Profile;
import SuperheroCoursework.com.service.ContentService;
import SuperheroCoursework.com.service.CurriculumService;
import SuperheroCoursework.com.service.ProfileService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

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
    public ResponseEntity<Profile> getProfile(@RequestParam String profileId) throws Exception {

        Profile profile = profileService.getProfile(profileId);
        return new ResponseEntity<>(profile, HttpStatus.OK);
    }

    @GetMapping("/objectives")
    public String getObjective(@RequestParam String objectiveName) {
        return curriculumService.findObjective(objectiveName);
    }

    @GetMapping("/curriculum")
    public ResponseEntity<Curriculum> getCurriculum(@RequestParam String curriculumId) throws Exception {
        File f=new File("Curriculum_data.json");
        String h = f.getAbsolutePath();
        return new ResponseEntity<>(curriculumService.getCurriculum(), HttpStatus.OK);

    }

}

