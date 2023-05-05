class Pe {
    String color;

    public void printColor() {
        System.out.println("The color of this Pen is " + this.color);
    }
}


public class Naveen1_3OOps {
    public static void main(String []args) {
        Pe p1 = new Pe();
        p1.color = "blue";


        Pe p2 = new Pe();
        p2.color = "black";


        Pe p3 = new Pe();
        p3.color = "red";


        p1.printColor();
        p2.printColor();
        p3.printColor();
    }
}
