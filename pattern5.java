public class pattern5 {
    public static void main(String[] args) {
        int i,j;
        int r = 5;
        //upper half
        for (i=1;i<=r;i++){
            //first part *
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            //space
            for(j=1;j<=2*(r-i);j++){
                System.out.print("  ");
            }
            //second part *
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //lower half
        for (i=r;i>=1;i--){
            //first part *
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            //space
            for(j=1;j<=2*(r-i);j++){
                System.out.print("  ");
            }
            //second part *
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
