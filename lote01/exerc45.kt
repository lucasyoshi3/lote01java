package algoritmos;

public class Algoritmos{
    public static void main(String[] args){
        System.out.println(sequencia());
        
    }

    public static float sequencia(){
        float seq,cta;
        seq=0;
        for(cta=1;cta<=15;cta++){
            if (cta%2==0){
                seq=seq-(cta/(cta*cta));
            }else{
                seq=seq+(cta/(cta*cta));
            }
        }
        return seq;
    }
}