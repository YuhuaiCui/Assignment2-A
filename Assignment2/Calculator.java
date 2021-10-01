class Calculator {
    int a = 1; //Quadratic "a"
    int b = 5; //Quadratic "b"
    int c = 6; //Quadratic "c"

    double x1 = 0; //The "x" coordinate of the first point
    double y1 = 0; //The "y" coordinate of the first point
    double x2 = 2; //The "x" coordinate of the second point
    double y2 = 3; //The "y" coordinate of the second point

    int x3 = 0; //The "x" coordinate of the first point
    int y3 = 0; //The "y" coordinate of the first point
    int x4 = 2; //The "x" coordinate of the second point
    int y4 = 3; //The "y" coordinate of the second point
    
    int n = 5; //Number of terms
    double k0 = 1; //First term
    double k1 = 5; //The nth term
    double i = 1; //How much it's increasing by
    
    double r = 2; //Common ratio
    double p = 3; //First term
    int k = 3; //Number of terms

    Calculator() {
        
    }
    
    void Display() {
        //quadratic formula
        System.out.println("QUADRATIC FORMULA");
        System.out.print("The solutions for " + a + "x^2 + " + b + "x + " + c + " are " + quad1());
        System.out.println(" and " + quad2() + "."); //Answer 2

        //slope
        System.out.println("");
        System.out.println("SLOPE FORMULA");
        System.out.println("A line connecting the points (" + (int) x1 + ", " + (int) y1 + ") and (" + (int) x2 + ", " + (int) y2 + ") has a slope of " + slope());

        //midpoint
        System.out.println("");
        System.out.println("MIDPOINT FORMULA");
        System.out.println("The midpoint between (" + x3 + ", " + y3 + ") and (" + x4 + ", " + y4 + ") is (" + midpointx() + ", " + midpointy() + ")");
        
        //arithmetic series
        System.out.println("");
        System.out.println("SUM OF AN ARITHMETIC SERIES");
        System.out.println("The sum of the first " + n + " terms of an arithmetic series that starts with " + k0);
        System.out.println(" and increases by " + i + " is " + sum());
        
        //geometric series
        System.out.println("");
        System.out.println("SUM OF A FINITE GEOMETRIC SERIES");
        System.out.println("The sum of the first " + k + " terms of a finite geometric series that starts with " + p); 
        System.out.print(" and increases by a rate of " + r + " is " + o());
    }
    
    double quad1() { //First answer to the quadratic equation
        return (-b + (Math.sqrt((Math.pow(b, 2)) - (4*a*c)))) / (2*a); //1st Answer
    }

    double quad2() { //Second answer to the quadratic equation
        return (-b - (Math.sqrt((Math.pow(b, 2)) - (4*a*c)))) / (2*a); //2nd Answer
    }

    double slope() { //The slope of the line that forms from the set of two points
        return (y2 - y1) / (x2 - x1);
    }
    
    double midpointx() { //x coordinate of the midpoint
        return (x1 + x2) / 2;
    }
    
    double midpointy() { //y coordinate of the midpoint
       return (y1 + y2) / 2;
    }
    
    double sum() { //Sum of the arithmetic series
        return (n * ((k0 + k1) / 2));
    }
    
    double o() { //Sum of the geometric series
        return (p * (1 - Math.pow(r,k))) / (1-r);
    }