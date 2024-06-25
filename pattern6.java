public class pattern6 {
    public static void main(String[] args) {
        int i , j;
        int r= 5;
        for(i=1;i<=r;i++){
            //space
            for(j=1;j<=(r-i);j++){
                System.out.print("  ");
            }
            //star
            for(j=1;j<=r;j++){
                System.out.print("* ");
            }
        System.out.println();
        }
    }
}
//OUTPUT
/*
        * * * * * 
      * * * * *
    * * * * *
  * * * * *
* * * * *
    */
