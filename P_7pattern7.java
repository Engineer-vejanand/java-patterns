public class P_7pattern7 {
    public static void main(String[] args) {
    
        int m=5;
        for(int i=5;i>=1;i--){
            for(int j=1;j<=m;j++){
                if(j<=i){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}

/*
 output
12345
1234
123
12
1

 */
