package Practice.Pattern;

public class Pattern7 {
    public static void main(String[] args) {
       int num=4;

       for(int i=1 ; i<=4 ; i++){
            for(int j=3 ; j>=i ; j--){
                System.out.print(" ");
            }
            for(int k=1 ; k<=(i*2-1) ; k++){
                System.out.print("*");
            }
            System.out.println();
       }
        
    }
}
