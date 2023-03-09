package algoritmos;

public class Algoritmos{
    public static void main(String[] args){
        int ana,maria,cta;
        ana=110;
        maria=150;
        cta=0;
        maior(ana,maria,cta);
        cta=maior(ana,maria,cta);
        System.out.println(cta);
    }

    public static int maior(int a,int m,int c){
        if (a<m){
            c=c+1;
            a=a+3;
            m=m+2;
            maior(a,m,c);
        }
            return c;
    }
}