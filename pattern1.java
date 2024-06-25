public class pattern1 {
    public static void main(String[] args) {
        int i;
        int j;
        int r =4;
        int c =5;
        System.out.println("Solid Rectangle");
        //outer loop
        for (i=1;i<=r;i++){
            //inner loop
            for(j=1;j<=c;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\nHollow Rectangle");
        //outer loop
        for (i=1;i<=r;i++){
            //inner loop
            for(j=1;j<=c;j++){
                //cell -> (r,c)
                if(i==1 || j==1 || i==r || j==c){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

//OUTPUT
/*Solid Rectangle
* * * * * 
* * * * * 
* * * * * 
* * * * * 
Hollow Rectangle
* * * * * 
*       * 
*       * 
* * * * * */
