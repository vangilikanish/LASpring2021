/*
**QUESTION**
Find the errors or bugs in the following statements: 

int x = 5 

double = a; //assume a is declared already.

char 'f' = g; 

boolean b = "true";

**SOLUTION**

int x = 5;

double a = 0.25;

char f = 'g';

boolean b = true;

*/


/*
**QUESTION**
What is the value of each of a, b, c, and d at locations 1, 2, 3, ..., 12? Why? (See Recitation3.docx)

int a = 5;
int b;
double c = 5.42;
double d;
b = a; // (1) 
d = a; // (2)
d = c; // (3)
b = c; // (4)
b = (int) c; // (5)
c = a + b; // (6)
c = d + a * b; // (7)
c = (d + a)*b; // (8)
b = a / a; // (9)
b = a / c; // (1)
b = (int) c / a; // (11)
b = 52/5
b = some double value 
error

b = (int)((int) c / a); // (11)
b = (int)(52/5)

b = (int)(c/a);

d = c / a; // (12)

**SOLUTION**

(1) - b = 5, a = 5, c = 5.42
(2) - d = 5.0, a = 5
(3) - d = 5.42, c = 5.42
(4) - error
(5) - b = 5
(6) - c = 10.0
(7) - c = 30.42
(8) - c = 52.1
(9) - b = 1
(10) - error
(11) - error 
(12) - 10.42

*/


/*

Whats you favorite food
Kanish - french fries
Atharva B. - ice cream
Hasim - Buffalo Wings
John Leng - mediteranean food   
Alexander- Pizza
Ketan - Chicken 
Ethan - Chicken Parmesan Sub
Shane - BBQ Steamed Pork Buns
Anthony-  Garlic Parm Wings    
Jingyan - fried chicken wings
*/
