package labs.lab1;

class Equation{

    // part 1
    private int a;
    private int b;
    private int c;

    public Equation(int aA, int aB, int aC){
        a = aA;
        b = aB;
        c = aC;
        coefficientSet();
        reduceEquation();
    }

    public void coefficientSet(){
        if(b < 0){
            a = -a;
            b = -b;
            c = -c;
        }
    }
    public void reduceEquation(){
        int reducer = gcd3(a, b, c);
        a = a / reducer;
        b = b / reducer;
        c = c / reducer;
    }


    private int gcd(int a, int b){
        if(a<0){
            a=a*-1;
        }
        if(b<0){
            b=b*-1;
        }
        if (a == 0) 
            return b; 
        return gcd(b % a, a);

    }
    private int gcd3(int a, int b, int c){
        int q= gcd(gcd(a, b), c);
        if(q == 0){
            return 1;
        }
        return q;
    }
    // part 1

    public Equation equation_add(Equation aEquation){
        int newA = this.a + aEquation.getA();
        int newB = this.b + aEquation.getB();
        int newC = this.c + aEquation.getC();
        Equation temp = new Equation(newA, newB, newC);
        return temp;
    }
    public int getA(){
        return this.a;
    }
    public int getB(){
        return this.b;
    }
    public int getC(){
        return this.c;
    }
    public Equation equation_sub(Equation aEquation){
        int newA = this.a - aEquation.getA();
        int newB = this.b - aEquation.getB();
        int newC = this.c - aEquation.getC();
        Equation tempEquation = new Equation(newA, newB, newC);   
        return tempEquation;
    }
    public String toString(){
        if(b == 0){
            return a + " = " + c;
        }
        else if(c == 0){
            return a + " = " + b + "x";
        }
        return a + " = " + b + "x +" + c;
    }
    public boolean equals(Object aObject){
        Equation aEquation = (Equation) aObject;
        if(gcd3(a, b , c) == gcd3(aEquation.a, aEquation.b, aEquation.c)){
            return true;
        }
        return false;
    }
}


