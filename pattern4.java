public class pattern4 {
    public static void main(String[] args) {
        int i , j;
        int r = 5;
        int c = 0;
        System.out.println("Floyd's Triangle");

        for(i=1;i<=r;i++){
            for(j=1;j<=i;j++){
                c++;
                System.out.print(c+" ");
            }
            System.out.println();
        }

        System.out.println("0_1 Triangle");
        for(i=1;i<=r;i++){
            for(j=1;j<=i;j++){
                int sum = i+j;
                if(sum%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
