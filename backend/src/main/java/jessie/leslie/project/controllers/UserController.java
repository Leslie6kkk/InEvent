package jessie.leslie.project.controllers;
import jessie.leslie.project.entity.UserBean;
import jessie.leslie.project.entity.UserRes;
import jessie.leslie.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
//import com.bcn.login_mybatis_demo.util.Result;
//import com.bcn.login_mybatis_demo.util.ResultUtil;

import javax.annotation.Resource;
import java.util.Map;

@SuppressWarnings({"all"})
@RestController //@Controller + @ResponseBody
@RequestMapping("/user")
@CrossOrigin
public class UserController {
    @Resource
    UserService userService;


    @PostMapping(value = "/signup")
    public UserRes signUp(@RequestBody(required=false) UserBean user){
        //There's something wrong with user's input
        String Email = user.getEmail();
        String Password = user.getPassword();
        if (Email.equals("") || Password.equals("")){
            UserRes resError = new UserRes(false,false);
            return resError;
        } else {
            UserRes res = userService.SignUp(Email, Password);
            return res;
        }
    }

    @PostMapping(value = "/signin")
    public UserRes signIn(@RequestBody(required=false) UserBean user){
        //There's something wrong with user's input
        String Email = user.getEmail();
        String Password = user.getPassword();
        if (Email.equals("") || Password.equals("")){
            UserRes resError = new UserRes(false,false);
            return resError;
        } else {
            UserRes res = userService.SignIn(Email, Password);
            return res;
        }
    }
    
    @RequestMapping(value = "/buildprofile",method = RequestMethod.POST)
    public UserRes buildProfile(String Email, String Intro, String Name){
        UserRes res = userService.BuildProfile(Email, Intro, Name);
        return res;
    }
}
