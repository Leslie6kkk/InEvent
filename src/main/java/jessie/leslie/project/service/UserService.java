package jessie.leslie.project.service;
//SERVICE FOR SIGNUP
import jessie.leslie.project.controllers.UserController;
import jessie.leslie.project.entity.UserBean;
import jessie.leslie.project.entity.UserRes;
import jessie.leslie.project.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

//    public UserBean LoginIn(String username, String password) {
//        return userMapper.getInfo(username,password);
//    }


    public UserRes Signup(String email,String password){
        System.out.println("service");
        System.out.println(email);
        UserBean user = userMapper.findByEmail(email);
        UserRes userRes = new UserRes();
        userRes.Verified = false;
        userRes.Success = false;
        if (user != null) {
            userRes.AlreadyRegistered = true;
            userRes.Verified = user.verified;
        } else{
            UserBean usr = new UserBean();
            usr.setEmail(email);
            usr.setPassword(password);
            userRes.AlreadyRegistered = false;
            userMapper.save(usr);
            userRes.Success = true;
        }
        return userRes;
    }
    public UserRes Signin(String email,String password){
        UserBean user = userMapper.findByEmail(email);
        UserRes userRes = new UserRes();
        userRes.Verified = user.verified;
        if (user != null){
            userRes.AlreadyRegistered = true;
            if (email == user.getEmail() && password == user.getPassword()){
                userRes.Success = true;
            }else{
                userRes.Success = false;
            }
        }
        else{
            userRes.AlreadyRegistered = false;
            userRes.Success = false;
        }
        return userRes;
    }
}

