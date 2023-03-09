package algoritmos;
import java.util.*;

public class Algoritmos{
    public static void main(String[] args){
        int a,b;
        int sub;
        Scanner e=new Scanner(System.in);
        System.out.println("Num a:");
        a=e.nextInt();
        System.out.println("Num b:");
        b=e.nextInt();
        sub=s(a,b);
        System.out.println(sub);
    }

public static int s(int a,int b){
    int sub;
    if (a<b){
      sub=b-a; 
    }else{
       sub=a-b; 
    }
    return sub;
}
}