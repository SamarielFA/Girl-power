## 1. Create UserController endpoint to get all users


### UserController.java


``` java
@GetMapping("/all") //localhost:8080/user/all
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
```



## 2. Create a UserService method to get all users

### UserService.java


``` java
public List<User> getAllUsers() {
        return userRepo.getAllUsers();
    }
```

## 3. Create a userRepository method to get all users
### UserRepo.java
```java

import java.util.ArrayList;
import java.util.List;

public List<User> getAllUsers() {
        return users;
    }
```


## 4. Add user with a postman

![image](https://github.com/user-attachments/assets/46521ad9-5334-4a1c-8db2-de75284d41d2)


## Try to get all the users with GET method
## Repeat step 4 and 5
![image](https://github.com/user-attachments/assets/7d7b7bb2-10a4-421c-bddc-c519d6283f9c)


