package jessie.leslie.project.entity;
// entity...... used to define properties of an entity

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//set and get id, username, and password
@Data
@AllArgsConstructor
@NoArgsConstructor
//@Document(collection = "user")
public class UserBean  {

    private String email;
    private String username; // default = None
    private String password;
    public Boolean verified; // If the user has passed email authentication

    public UserBean(String email, String password){
        this.email = email;
        this.password = password;
        this.verified = false;
    }

//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }

    public String getName() {
        return username;
    }

    public void setName(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

