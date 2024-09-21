# Simulate a 1D simple random walk where at each step can be moving only up or down. How many steps ⏫  can you actually get?


```python
import numpy as np
import matplotlib.pyplot as plt
import random

n = 1000    # Defining number of steps

x = np.zeros(n)
up_steps = 0    # Counter to track how many steps up

for i in range(1, n):
  val = random.randint(1, 2)

  if val == 1:
    x[i] = x[i - 1] + 1   # dot moves x coordinate + 1 
    up_steps += 1         # increment the counter when moving up
  else:
    x[i] = x[i - 1] - 1   # dot moves x coordinate - 1

# Print the number of "up" steps
print(f'Number of steps up: {up_steps}')


plt.plot(x, color='blue')
plt.title('1D simple random walk')
plt.xlabel('Number of steps')
plt.grid(True)
plt.show()
```

![image](https://github.com/user-attachments/assets/a2d6db57-7301-452f-9375-8b2d8ddc5f2f)

