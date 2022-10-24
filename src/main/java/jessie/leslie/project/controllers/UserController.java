package jessie.leslie.project.controllers;
import jessie.leslie.project.entity.UserRes;
import jessie.leslie.project.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
//import com.bcn.login_mybatis_demo.util.Result;
//import com.bcn.login_mybatis_demo.util.ResultUtil;

import javax.annotation.Resource;

@SuppressWarnings({"all"})
@RestController //@Controller + @ResponseBody
@RequestMapping("/user")

public class UserController {
    @Resource
    UserService userService;


    @RequestMapping(value = "/signup",method = RequestMethod.POST)
    public UserRes signUp(String Email,String Password){
        //There's something wrong with user's input
        if (Email.equals("") || Password.equals("")){
            UserRes resError = new UserRes(false,false);
            return resError;
        } else {
            UserRes res = userService.SignUp(Email, Password);
            return res;
        }
    }

    @RequestMapping(value = "/signin",method = RequestMethod.POST)
    public UserRes signIn(String Email,String Password){
        //There's something wrong with user's input
        if (Email.equals("") || Password.equals("")){
            UserRes resError = new UserRes(false,false);
            return resError;
        } else {
            System.out.println("here");
            UserRes res = userService.SignIn(Email, Password);
            return res;
        }
    }
}
