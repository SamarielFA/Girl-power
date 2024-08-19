## CheeseShopController.java

```java
package com.datorium.Datorium.API.Controllers;
import com.datorium.Datorium.API.DTOs.UpdateCheeseDTO;
import com.datorium.Datorium.API.DTOs.Cheese;
import com.datorium.Datorium.API.Services.CheeseShopService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
@RequestMapping("/cheese")
public class CheeseShopController {
    private CheeseShopService cheeseShopService;
    public CheeseShopController(){
        cheeseShopService  = new CheeseShopService();
    }


    @PostMapping("/add") //localhost:8080/cheese/add
    public int add(@RequestBody Cheese cheese){
           return cheeseShopService.add(cheese);
    }
    @GetMapping("/getall") //localhost:8080/cheese/getall
    public List<Cheese> getAll(){
        return cheeseShopService.getAll();
    }

    @PostMapping("/update")
    public Cheese update(@RequestBody UpdateCheeseDTO updateCheeseDTO){
        return cheeseShopService.update(updateCheeseDTO.cheeseId, updateCheeseDTO.cheese);
    }
}
```


## CheeseShopService.java

```java

package com.datorium.Datorium.API.Services;
import com.datorium.Datorium.API.DTOs.Cheese;
import com.datorium.Datorium.API.Repo.CheeseShopRepository;

import java.util.ArrayList;

public class CheeseShopService {
    private CheeseShopRepository  cheeseShopRepository;
    public CheeseShopService() {
        cheeseShopRepository = new CheeseShopRepository();

    }
    public int add(Cheese cheese) {
        return cheeseShopRepository.add(cheese);
    }
    public List<Cheese> getAll() {
        return cheeseShopRepository.getAll();
    }
    public Cheese update(int cheeseId, Cheese updateCheeseDTO) {
        return cheeseShopRepository.update(cheeseId,updateCheeseDTO);
    }
}
 ```

## UpdateCheeseDTO.java

```java
package com.datorium.Datorium.API.DTOs;

public class UpdateCheeseDTO {
    public Cheese cheese;
    public int cheeseId;

}
```
## CheeseShopRepository.java

```java
package com.datorium.Datorium.API.Repo;
import com.datorium.Datorium.API.DTOs.Cheese;
import java.util.ArrayList;
import java.util.List;

public class CheeseShopRepository {
    private ArrayList<Cheese> allCheese = new ArrayList<>();

    public int add (Cheese cheese) {
        allCheese.add(cheese);
        return allCheese.size();
    }
    public List<Cheese> getAll() {
        return allCheese;
    }
    public Cheese update(int cheeseId, Cheese updateCheeseDTO){
        var cheese = allCheese.get(cheeseId);
        cheese.name = updateCheeseDTO.name;
        return cheese;
    }
}
```

## Cheese.java

```java
package com.datorium.Datorium.API.DTOs;

public class Cheese {
    public String name;
}
```

## 1. add

![image](https://github.com/user-attachments/assets/3ff209ed-700a-4329-a300-8b17f2cc80ff)

## 2. get

![image](https://github.com/user-attachments/assets/d06865a5-fbee-4266-a498-8186322721c2)

## 3.update

![image](https://github.com/user-attachments/assets/d3a6dd5c-7be4-4ee6-825c-8e6b6c9027c4)

## 4.get 
![image](https://github.com/user-attachments/assets/f5cd1d8d-6898-4355-8fa5-8252a42feb45)











