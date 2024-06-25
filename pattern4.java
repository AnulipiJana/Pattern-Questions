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
//OUTPUT
/*Floyd's Triangle
1
2 3 
4 5 6
7 8 9 10
11 12 13 14 15

0_1 Triangle
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
    */
