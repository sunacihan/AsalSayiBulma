

public class Main {
    public static void main(String[] args) {




        for (int i=2; i<=100;i++){
            int durum=1;
            for(int j=2; j<=(i/2);j++){
            if(i%j==0){
                    durum=0;
                    break;
                }
            }
            if(durum==1){
                System.out.println(i);
            }

        }
    }
}