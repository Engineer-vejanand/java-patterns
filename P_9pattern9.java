public class P_9pattern9 {
    public static void main(String[] args) {
        int m=5;
        int n=5;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(j<=i && (i+j)%2!=0){
                    System.out.print(0);
                }
                if(j<=i && (i+j)%2==0){
                    System.out.print(1);
                }
                }
                System.out.println();
            }
        }
    }

    /*
     output
    1
    01
    101
    0101
    10101

     */
