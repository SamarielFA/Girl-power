#FIRST TASK
water_pokemon = pokemon_df[pokemon_df['Type 1'] == 'Water']
percentage_water = (len(water_pokemon) / len(pokemon_df)) * 100
print(f"Percentage of 'Water' type Pokémon: {percentage_water:.2f}%")


#SECOND TASK
pokemon_df['Speed'].min()
pokemon_df['Speed'].max()
pokemon_df['Speed'].mean()


#THIRD TASK
speed_80 = pokemon_df[pokemon_df['Speed'] >= 80]
print(len(speed_80))
plt.hist(speed_80["Speed"], color = 'pink', edgecolor = "green", alpha= 0.7) 
plt.title("Pokemons with Speed >= 80")
plt.xlabel("Speed")
plt.ylabel("Frequency")
plt.show()
