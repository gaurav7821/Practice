package Practice.Pattern;

public class Pattern3 {
    public static void main(String[] args) {
        int num=4;

        for(int i=1 ; i<=num ; i++){
            for(int j=3 ; j>=i ; j--){
                System.out.print(" ");
            }
            for(int k=1 ; k<=i ; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
