package Practice.Pattern;

public class Patternn5 {
    public static void main(String[] args) {
        int num=4;

        for(int i=1 ; i<=num ; i++){
            for(int j=2 ; j<=i ; j++){
                System.out.print(" ");
            }
            for(int k=4 ; k>=i ; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
