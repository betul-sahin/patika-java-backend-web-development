package donguler;

public class ElmasSekliYazdirma {
    public static void main(String[] args) {
        int n = 10;
        int i, j;

        for(i=1; i<=n; i++){

            for(j=i; j<n; j++){
                System.out.print(" ");
            }

            for(j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }

            System.out.println();
        }

        for(i=n; i>=1; i--){

            for(j=i; j<n; j++){
                System.out.print(" ");
            }

            for(j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
