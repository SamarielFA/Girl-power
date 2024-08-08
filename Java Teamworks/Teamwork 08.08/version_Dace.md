
##
![image](https://github.com/user-attachments/assets/5e87f56f-e723-4218-b61d-78d2ed561a1b)

##
```java
package com.datorium.Datorium.API.Controllers;

import com.datorium.Datorium.API.DTOs.Message;
import com.datorium.Datorium.API.Services.MessageService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/message")
public class MessageController {
    private MessageService messageService;

    public MessageController() {
        messageService = new MessageService();
    }
    @PostMapping("/add") //localhost:8080/user/add
    public String add(@RequestBody Message message){
        return messageService.add(message);
    }
}```



##
```java
package com.datorium.Datorium.API.Services;

import com.datorium.Datorium.API.DTOs.Message;
import org.springframework.web.bind.annotation.RequestBody;

public class MessageService {
    public String add(@RequestBody Message message) {
        return "I love Spring Boot";
    }
}```


##
```java
package com.datorium.Datorium.API.DTOs;

public class Message {
    public String myMessage;
}```




