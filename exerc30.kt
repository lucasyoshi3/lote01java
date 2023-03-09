package algoritmos;
import javax.swing.JOptionPane;


public class Algoritmos{

    public static int bissexto(int i,int anos){
        if ((i%4==0 & anos%100==0)|(anos%400==0)){
            i=0;
        }else{
            i=1;
        }
        return i;
    }

    public static void main(String[] args){
        int nasc[]=new int[3];  /*0=dia; 1=mes; 2=ano*/
        int atual[]=new int[3];
        int dias,anos,i,meses;
        nasc[0]=Integer.parseInt(JOptionPane.showInputDialog("Dia de nascimento:"));
        nasc[1]=Integer.parseInt(JOptionPane.showInputDialog("Mes de nascimento:"));
        nasc[2]=Integer.parseInt(JOptionPane.showInputDialog("Ano de nascimento:"));
        atual[0]=Integer.parseInt(JOptionPane.showInputDialog("Dia atual:"));
        atual[1]=Integer.parseInt(JOptionPane.showInputDialog("Mes atual:"));
        atual[2]=Integer.parseInt(JOptionPane.showInputDialog("Ano atual:"));
        anos=0;
        for(i=nasc[2]+1;i<atual[2];i++){
            anos=anos+1;
        }
        meses=12-nasc[1]+atual[1];
        i=nasc[2];
        bissexto(i,anos);
        i=bissexto(i,anos);
        dias=0;
        
        if(nasc[1]==1|nasc[1]==3|nasc[1]==5|nasc[1]==7|nasc[1]==8|nasc[1]==10|nasc[1]==12){
            dias=31-nasc[0];
        }else if(nasc[1]==4|nasc[1]==6|nasc[1]==9|nasc[1]==11){
            dias=30-nasc[0];
        }
        if(nasc[1]==2 & i==0){
            dias=29-nasc[0];
        }else if((nasc[1]==2) & (i==1)){
            dias=28-nasc[0];
        }
        
        i=atual[2];
        bissexto(i,anos);
        i=bissexto(i,anos);
        dias=dias+atual[0];

        if((dias>=31)&(nasc[1]==1|nasc[1]==3|nasc[1]==5|nasc[1]==7|nasc[1]==8|nasc[1]==10|nasc[1]==12)){
            meses=meses+1;
            dias=dias-31;
            if (meses>12){
                meses=0;
                anos=anos+1;
            }
        }else if((dias>=30)&(nasc[1]==4|nasc[1]==6|nasc[1]==9|nasc[1]==11)){
            meses=meses+1;
            dias=dias-30;
        }
        if(dias>=29 & (nasc[1]==2 & i==0)){
            meses=meses+1;
            dias=dias-29;
        }else if((dias>=28) &(nasc[1]==2 &i==1)){
            meses=meses+1;
            dias=dias-28;
        }
        if(meses>12){
            meses=meses-12;
            anos=anos+1;
        }
        JOptionPane.showMessageDialog(null,dias+" dias "+meses+" meses "+anos+" anos de vida");
    }   
}