package jessie.leslie.project.controllers;

import jessie.leslie.project.entity.UserBean;
import jessie.leslie.project.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Controller
public class LoginController {
    //将Service注入Web层
//    @Resource
//    UserService userService;
//
//    //实现登录
//    @RequestMapping("/login")
//    public String show(){
//        return "login";
//    }
//    @RequestMapping(value = "/loginIn",method = RequestMethod.POST)
//    public String login(String username,String password){
//        UserBean userBean = userService.LoginIn(username, password);
//        log.info("name:{}",username);
//        log.info("password:{}",password);
//        if(userBean!=null){
//            return "redirect:/index.html";
//        }else {
//            return "error";
//        }
//    }
//    @RequestMapping("/index.html")
//    public String mainPage(){
//        return "index";
//    }
//    @RequestMapping("/signup")
//    public String disp(){
//        return "signup";
//    }
//
//    //实现注册功能
//    @RequestMapping(value = "/register",method = RequestMethod.POST)
//    public String signUp(String username,String password){
//        UserService.Insert(username, password);
//        return "success";
//    }
}


