package yonmoyonmo.wonmocyberschool.com.src.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yonmoyonmo.wonmocyberschool.com.src.entities.Wonmo;
import yonmoyonmo.wonmocyberschool.com.src.repositories.JpaWonmoRepository;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    JpaWonmoRepository wonmoRepo;

    @PostMapping("/wonmo")
    public String testAddWonmo(HttpServletRequest request, @RequestBody Wonmo newWonmo){

        wonmoRepo.save(newWonmo);

        return "";
    }

}
