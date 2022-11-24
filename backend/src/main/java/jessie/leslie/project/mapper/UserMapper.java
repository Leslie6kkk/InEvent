package jessie.leslie.project.mapper;
// used to handle database operations-- mongodb instructions appears here
// mapper - service - controller

import jessie.leslie.project.entity.UserBean;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends MongoRepository<UserBean, String>{
    UserBean findByEmail(String email);
//    @Query("{name:'?0'}")
//    GroceryItem findItemByName(String name);
//
//    @Query(value="{category:'?0'}", fields="{'name' : 1, 'quantity' : 1}")
//    List<GroceryItem> findAll(String category);
//
//    public long count();
//    @Query("{name:'?0'}")
//    UserBean findByEmail(String email);
//
//    UserBean saveInfo(String email, String password);

}

