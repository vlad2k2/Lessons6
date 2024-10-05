package app;

public class Lessons6Solutions {

    static int numberInOrder = 1;

    public static void main(String[] args){
        int sum = 0;
        int i;

        for(i = 1; i <= 6; i++){
            sum = sum + i;
            System.out.printf("%d) Num is %d, sum is %d %n", numberInOrder++, i, sum);

        }
        int a = sum;
        while (true){
            System.out.print("-");
            a--;
            if(a == 0){
                break;
            }
        }
        System.out.println();
        System.out.printf("Sum of numbers is %d \n", sum);

    }

}
