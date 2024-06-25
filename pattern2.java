public class pattern2 {
    public static void main(String[] args) {
        int i , j;
        int r=4;
        System.out.print("Half Pyramid\n");
        for(i=1;i<=r;i++){
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\nInverted Half Pyramid");
        for(i=r;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n180 rotate Inverted Half Pyramid");
        for(i=1;i<=r;i++){
            for (j=1;j<=r-i;j++){
                System.out.print("  ");
            }
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
