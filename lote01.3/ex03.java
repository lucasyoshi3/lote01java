import java.util.*;
public class ex03 {
    public static void main(String[] args){
        int vt1[]=new int[3];
        int vt2[]=new int[3];
        int vt3[]=new int[6];
        int i;
        Scanner e=new Scanner(System.in);
        System.out.println("VT1:");
        for(i=0;i<=5;i++){
            if(i<=2){
                vt1[i]=e.nextInt();
                vt3[i]=vt1[i];
            }else{
                if(i==3){
                    System.out.println("VT2:");
                }
                vt2[i-3]=e.nextInt();
                vt3[i]=vt2[i-3];
            }
        }
        System.out.println("VT3:");
        for(i=0;i<=5;i++){
            System.out.println(vt3[i]);
        }
    }
}
