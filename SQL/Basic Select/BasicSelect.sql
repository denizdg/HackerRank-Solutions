--Revising the Select Query I:

SELECT * FROM CITY WHERE COUNTRYCODE = "USA" AND POPULATION > 100000

--Revising the Select Query II:

SELECT NAME FROM CITY WHERE COUNTRYCODE = 'USA' AND POPULATION > 120000;

--Select All:

SELECT * FROM CITY;

--Select By ID:

SELECT * FROM CITY WHERE ID = 1661;

--Japanese Cities' Attributes:

SELECT * FROM CITY WHERE COUNTRYCODE = 'JPN';

--Japanese Cities' Names:

SELECT NAME FROM CITY WHERE COUNTRYCODE = 'JPN';

--Weather Observation Station 1:

SELECT CITY, STATE FROM STATION;

--Weather Observation Station 3:

SELECT DISTINCT CITY FROM STATION WHERE (ID % 2) = 0;

--Weather Observation Station 4:

SELECT (COUNT(CITY) - COUNT(DISTINCT CITY)) FROM STATION;

--Weather Observation Station 6:

SELECT DISTINCT city FROM station WHERE city REGEXP "^[aeiou].*";

--Weather Observation Station 7:

SELECT DISTINCT CITY FROM STATION WHERE CITY REGEXP '[aeiou]$';

--Weather Observation Station 8: 

SELECT DISTINCT CITY FROM STATION WHERE CITY REGEXP '^[aeiou].*[aeiou]$'

--Weather Observation Station 9:

SELECT DISTINCT CITY FROM STATION WHERE CITY NOT REGEXP "^[aeiou].*";

--Weather Observation Station 10:

SELECT DISTINCT CITY FROM STATION WHERE CITY NOT REGEXP '[aeiou]$'

--Weather Observation Station 11:

SELECT DISTINCT CITY FROM STATION WHERE CITY NOT REGEXP '^[aeiou].*[aeiou]$'

--Weather Observation Station 12:

SELECT DISTINCT CITY FROM STATION WHERE CITY NOT REGEXP '^[aeiou].*' AND CITY NOT REGEXP '[aeiou]$'

--Higher Than 75 Marks:

SELECT NAME FROM STUDENTS WHERE MARKS > 75 ORDER BY RIGHT(NAME, 3), ID ASC;

--Employee Names:

SELECT NAME FROM EMPLOYEE ORDER BY NAME ASC;

--Employee Salaries:

SELECT NAME FROM EMPLOYEE WHERE SALARY > 2000 AND MONTHS < 10 ORDER BY EMPLOYEE_ID ASC;