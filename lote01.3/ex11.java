public class ex11 {
    public static void main(String args[]){
        int matriz[][]=new int[8][8];
        int i,x,y;
        for (i=0;i<=7;i++){
            for(x=i;x<=7-i;x++){
                for(y=i;y<=7-i;y++){
                    matriz[y][x]=i+1;
                }
            }
        }
        for(x=0;x<=7;x++){
            for(y=0;y<=7;y++){
                System.out.println(matriz[y][x]);
            }
        }
    }
}
