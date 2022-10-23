package jessie.leslie.project.controllers;

import jessie.leslie.project.entity.UserBean;
import jessie.leslie.project.entity.UserRes;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //@Controller + @ResponseBody

@RequestMapping("/hello")

public class hellocontroller {
    @RequestMapping("/world")
    public UserRes sayHi(){
        UserRes userRes = new UserRes();
//        userRes.Verified = false;
        userRes.Success = false;
        userRes.AlreadyRegistered = false;
        return userRes;
    }
}
