public class P_3pattern3 {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            /*also here we put this
             for(int j=1;j<=i;j++){
                System.out.print("*");
             }
             System.out.println();
             */
            for(int j=1;j<=4;j++){
                if(i>=j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

/*output

*   
**  
*** 
****

 */
