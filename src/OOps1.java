class Student1{
    String name1;
    int age1;
    Student1(String name1,int age1){
        this.name1=name1;
        this.age1=age1;
    }
    public void printnam(){
        System.out.println(name1);
        System.out.println(age1);
    }
}
public class OOps1 {
    public static void main(String[] args){
        Student1 s1 = new Student1("Blue",8);
        s1.printnam();
    }
}
