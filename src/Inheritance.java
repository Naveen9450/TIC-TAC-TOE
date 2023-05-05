class Shape{
    public void area(){
        System.out.println("Display area of shape");
    }
}
class Triangle extends Shape{
    public void area(int h,int b){
        System.out.println((1/2)*b*h);
    }
}
public class Inheritance {
    public static void main(String [] args){
        Triangle s1 = new Triangle();
        s1.area(20,2);

    }
}
