## Teamwork
1. Create MessageController.java
2. Create MessageService.java
3. Create Message.java
4. In message controller, create an endpoint, which uses both MessageService and Message.java
5. HELP YOUR TEAMMATES TO GET EVERYTHING WORKING pls (including UserController/Service etc)

## Code
MessageController.java
```java
package com.datorium.Datorium.API.Controllers;


import com.datorium.Datorium.API.DTOs.Message;
import com.datorium.Datorium.API.Services.MessageService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class  MessageController {
    private MessageService messageService;
    public MessageController() {
        messageService = new MessageService();
    }


    @PostMapping("/write")
    public String write(@RequestBody Message message){
        return messageService.add(message);
    }
}
```

Message.java
```java
package com.datorium.Datorium.API.DTOs;

public class Message {
    public String name;
}
```

MessageService.java
```java
package com.datorium.Datorium.API.Services;

import com.datorium.Datorium.API.DTOs.Message;

public class MessageService {

    public String add(Message message) {
        return "Wow! You made it!";
    }
}
```

![image](https://github.com/user-attachments/assets/18039c2e-b20a-4dfb-8c6f-b4cc7c4ceb73)


