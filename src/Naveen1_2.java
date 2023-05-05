import java.util.Scanner;
public class Naveen1_2 {
    public static int smalest(String s){
        int n=s.length();
        int c=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' ||s.charAt(i)=='o' || s.charAt(i)=='u'){
                c++;
            }
        }
        return c;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(smalest(str));
    }
}
