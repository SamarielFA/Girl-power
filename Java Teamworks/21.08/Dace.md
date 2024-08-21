
```sql


SELECT * FROM Pets WHERE LENGTH(Name) = (SELECT MAX(LENGTH(Name)) FROM Pets);
SELECT * FROM Pets WHERE LENGTH(Name) = (SELECT MIN(LENGTH(Name)) FROM Pets);
SELECT * FROM Pets WHERE Name GLOB 'A*d';
SELECT DISTINCT Kind FROM Pets; -- to see all kind of pets in table

-- to count each kind of pet 
SELECT Kind, COUNT(*) AS CountOfKind
FROM Pets
GROUP BY Kind;

![image](https://github.com/user-attachments/assets/8a2079bd-edc7-4cc0-b9ef-0cba2123462c)
