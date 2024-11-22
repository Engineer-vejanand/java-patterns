public class P_10pattern10 {
    public static void main(String[] args) {
        //butterfly pattern
        int m=8;
        int n=4;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=8;j++){
                if(j<=i || j>=m){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            m=m-1;
            System.out.println();
        }
        for(int i=4;i>=1;i--){
           for(int j =1;j<=8;j++){
            if(j<=i|| j>=n){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
           } 
           n=n+1;
           System.out.println();
        }
    }
}

/*
 output
*      *
**    **
***  ***
********
********
*** ****
**   ***
*     **   

 */