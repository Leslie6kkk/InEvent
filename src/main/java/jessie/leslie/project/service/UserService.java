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

    public UserRes SignUp(String email,String password){
        UserBean user = userMapper.findByEmail(email);
        UserRes userRes = new UserRes(false, false);
        if (user != null) {
            //already registered
            userRes.AlreadyRegistered = true;
        } else {
            //register successfully
            userRes.Success = true;
            UserBean usr = new UserBean();
            usr.setEmail(email);
            usr.setPassword(password);
            userMapper.save(usr);
        }
        return userRes;
    }
    public UserRes SignIn(String email,String password){
        UserBean user = userMapper.findByEmail(email);
        UserRes userRes = new UserRes(false, false);
        if (user != null){
            userRes.AlreadyRegistered = true;
            if (password.equals(user.getPassword())){
                //login successfully
                userRes.Success = true;
            } else {
                //password is not correct
                userRes.Success = false;
            }
        } else {
            //email doesn't in the db
            userRes.AlreadyRegistered = false;
            userRes.Success = true;
        }
        return userRes;
    }
}

