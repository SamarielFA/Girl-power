# Explore different filters and their combinations with SQL

```sql


SELECT * FROM Pets WHERE LENGTH(Name) = (SELECT MAX(LENGTH(Name)) FROM Pets); -- pets longest names
```
![image](https://github.com/user-attachments/assets/5c8fbc25-0e2d-44e0-ab41-856238849d94)

```sql

SELECT * FROM Pets WHERE LENGTH(Name) = (SELECT MIN(LENGTH(Name)) FROM Pets); -- pets shortest names
```
![image](https://github.com/user-attachments/assets/9b021a97-89df-4b3a-84cc-7d38deb1a7a2)

```sql
SELECT * FROM Pets WHERE Name GLOB 'A*d'; -- pets name starts with A and ends with d
```
![image](https://github.com/user-attachments/assets/a02a5375-cd72-4d35-a215-323350460adb)

```sql
SELECT DISTINCT Kind FROM Pets; -- to see all kind of pets in table
```
## to count each kind of pet
```sql
SELECT Kind, COUNT(*) AS CountOfKind
FROM Pets
GROUP BY Kind;
```

![image](https://github.com/user-attachments/assets/608381c2-6ca2-4a4f-980c-e8ba8c4b225c)

## to find the oldest bird 

```sql
--If there are multiple birds with the same maximum age, only one of them will be returned!
SELECT *
FROM Pets
WHERE Kind = 'Bird'
ORDER BY Age DESC
LIMIT 1;
```
![image](https://github.com/user-attachments/assets/f57181fc-2fef-4dbe-a2d9-12a97ace3ea0)

## maximum number of pets owned by a single owner 
```sql
SELECT OwnerID, COUNT(*) AS NumberOfPets
FROM Pets
GROUP BY OwnerID
ORDER BY NumberOfPets DESC
LIMIT 1;
```
![image](https://github.com/user-attachments/assets/635b9023-699f-4611-be41-2e41a424a765)

## who are those pets exactly ?
```sql
SELECT *
FROM Pets
WHERE OwnerID = (
    SELECT OwnerID
    FROM Pets
    GROUP BY OwnerID
    ORDER BY COUNT(*) DESC
    LIMIT 1
);
```

![image](https://github.com/user-attachments/assets/1ba261e4-903d-441e-ae94-13b54231ee95)


