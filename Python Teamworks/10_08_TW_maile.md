# Teamwork
Task: Visualizing the correlation of Attack and Defense variables of two Types: Grass and Water Type 1 Pokémon.
1. Create two DataFrame Grass and Water
2. Create the regression plots for each (Grass and Water)
3. Calculate the Pearson correlation for each DataFrame (variables: Attack and Defense)
4. Explain to each other what do you see and what it means.

Code
```python
import pandas as pd
import matplotlib.pyplot as plt

pokemon_df = pd.read_csv('/content/Pokemon.csv')
```
1. Create two DataFrame Grass and Water
```python
grass_df = pokemon_df[pokemon_df['Type 1'] == 'Grass']
water_df = pokemon_df[pokemon_df['Type 1'] == 'Water']
```

```python
# Create the regression plots for each (Grass and Water)

import seaborn as sns

sns.regplot(
    data=grass_df, x='Attack', y="Defense",
    ci=99, marker="x", color=".3", line_kws=dict(color="green"),
)

sns.regplot(
    data=water_df, x='Attack', y="Defense",
    ci=99, marker="x", color=".3", line_kws=dict(color="blue"),
)
```

```python
# Calculate the Pearson correlation for each DataFrame (variables: Attack and Defense)

correlation3 = grass_df['Attack'].corr(grass_df['Defense'])
correlation4 = water_df['Attack'].corr(water_df['Defense'])

print('Grass correlation is:', correlation3)
print('Water correlation is:', correlation4)
```

```python
# Explain to each other what do you see and what it means.
# There is moderate correlation for both water and grass regarding Attack and Defernce. 
```

![image](https://github.com/user-attachments/assets/cd279426-3dea-46a5-913b-c48414b05cea)
