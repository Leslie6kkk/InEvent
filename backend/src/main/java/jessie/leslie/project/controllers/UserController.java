package jessie.leslie.project.controllers;
import jessie.leslie.project.entity.UserRes;
import jessie.leslie.project.service.UserService;
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


    @RequestMapping(value = "/signup",method = RequestMethod.POST)
    public UserRes signUp(String Email, String Password){
        System.out.println(Email);
        //There's something wrong with user's input
        if (Email.equals("") || Password.equals("")){
            UserRes resError = new UserRes(false,false);
            return resError;
        } else {
            UserRes res = userService.SignUp(Email, Password);
            return res;
        }
    }
//    @ResponseBody
//    @RequestMapping(value = "/signup",method = RequestMethod.POST)
//    public String updateAttr(@RequestBody Map<String, String> map) {
//        if(map.containsKey("Email")) {
//            String email = map.get("Email");
//            System.out.println(email);
//        }
//        if(map.containsKey("Password")) {
//            String objname = map.get("Password").toString();
//        }
//        // 操作 ...
//        return "success";
//    }

    @RequestMapping(value = "/signin",method = RequestMethod.POST)
    public UserRes signIn(String Email,String Password){
        //There's something wrong with user's input
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
