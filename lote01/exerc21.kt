package algoritmos;
import javax.swing.JOptionPane;

public class Algoritmos{
    public static void main(String[] args){
        int bi[];
        bi=new int[4];
        int i;
        for (i=0;i<4;i++){
            bi[i]=Integer.parseInt(JOptionPane.showInputDialog("Nota do "+(i+1)+" bimestre"));
        }
        media(bi);
    }
    
    public static void media(int bi[]){
        float media = 0;
        int i;
        for (i=0;i<4;i++){
            media=(bi[i])+media;
        }
        media=media/4;
        if (media>=6){
            System.out.println("Aprovado");
        }else if(media>3){
            System.out.println("Exame");
        }else{
            System.out.println("Reprovado");
        }
    }
}