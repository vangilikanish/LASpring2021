/*
**QUESTION**
Find the errors or bugs in the following statements: 

int x = 5 

double = a; //assume a is declared already.

char 'f' = g; 

boolean b = "true";

**SOLUTION**

int x = 5;

double a = 2.0;

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
b = a / c; // (10)
b = (int) c / a; // (11)
d = c / a; // (12)

**SOLUTION**

(1) b = 5;
(2) d = 5.0;
(3) d = 5.42;
(4) b = error;
(5) b = 5;
(6) c = 10.0;
(7) c = 29.42
(8) c = 52.1
(9) b = 1
(10) b = error
(11) b = error
(12) d = 52.1/5

*/

/*
Whats you favorite food
Kanish - French Fries
Eli-  Pillsbury Cinnamon Rolls
Shaan - Sushi
Paul- skirt steak/sushi
anuj- pizza
Erick- steak
Kieran - Burritos
Bruce - Brazilian Food (Quiabo)
*/
