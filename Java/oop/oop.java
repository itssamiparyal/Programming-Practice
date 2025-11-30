package oop;
class Rectangle{
    int length;
    int breadth;
    public String company;
    int clacArea(){
        return length*breadth;
    }
    int clacPermiter(){
        return 2*(length + breadth);
    }
}
class oop{
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        rect1.length = 3;
        rect1.breadth = 4;
        System.out.println("The area is "+ rect1.clacArea());
        System.out.println("The perimeter is "+ rect1.clacPermiter());
        Rectangle rect2 = new Rectangle();
        rect2.length = 1;
        rect2.breadth = 1;
        System.out.println("The area is "+ rect2.clacArea());
        System.out.println("The perimeter is "+ rect2.clacPermiter());
    }
}

/* 
calculator
properties/ attribute(variable)
1> size
2> shape
3> color
4> company
variables
operators
5> material
behaviour(function)
1> simple operations like add, sub, multi, divison.
2> complex operations like square, square root , logemtric 
3> bodmas solving 
4> trigomatic function like sin, cos tan
*/ 