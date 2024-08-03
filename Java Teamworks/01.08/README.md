## Teamwork
1. Send a POST request

public ResultItem sendItem(Item item)

2. You should send one object and receive a different object with different data

3. Test it out POSTMAN


## Code
DatoriumApiApplication.java
```java

@PostMapping("/recipe")
    public Food recipe(@RequestBody Ingredients ingredients){
        if(ingredients.pasta.equals("spaghetti") && ingredients.sauce.equals("pesto")){
            var food = new Food();
            food.dish = "Pesto pasta";
            return food;
        }else if (ingredients.pasta.equals("macaroni") && ingredients.sauce.equals("creamy cheese")) {
            var food = new Food();
            food.dish = "Mac and cheese";
            return food;
        }

        return null;
    }
```

Ingredients.java
```java

package com.datorium.Datorium.API;

public class Ingredients {
    public String pasta;
    public String sauce;
}
```

Food.java
```java

package com.datorium.Datorium.API;

public class Food {
    public String dish;
}
```

Postman
![image](https://github.com/user-attachments/assets/ea932cb5-439a-45fc-b501-d520a9518c78)


