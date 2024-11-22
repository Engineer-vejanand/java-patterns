public class P_8pattern8 {
    public static void main(String[] args) {
        int m=5;
        int n=5;
        int num =1;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(j<=i){
                    System.out.print(num+" ");
                    num++;
                }
            }
            System.out.println();
        }
    }
}

/*
 output
1 
2 3
4 5 6
7 8 9 10
11 12 13 14 15

 */
