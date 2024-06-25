public class pattern3 {
    public static void main(String[] args) {
        int i , j;
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
System.out.println();
        for(i=5;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

System.out.println();
        for(i=1;i<=5;i++){
            //space
            for(j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            //for *
            for(j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
//OUTPUT
/*1
12
123
1234
12345

12345
1234
123
12
1

    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5
    */
