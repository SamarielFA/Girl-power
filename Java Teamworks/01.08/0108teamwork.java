
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

