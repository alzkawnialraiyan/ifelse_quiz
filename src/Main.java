import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int ans1, ans2, ans3, ans4, ans5;

        System.out.println("Please answer the following Questions");

        System.out.println("Question one:\n 7*8");
        ans1 = read.nextInt();
        if (ans1 == 7*8){
            System.out.println("Answer is correct");
        }else {
            System.out.println("Answer is wrong");
        }

        System.out.println("Question two:\n 2+6");
        ans2 = read.nextInt();
        if (ans2 == 2+6){
            System.out.println("Answer is correct");
        }else {
            System.out.println("Answer is wrong");
        }

        System.out.println("Question three:\n 20/5");
        ans3 = read.nextInt();
        if (ans3 == 20/5){
            System.out.println("Answer is correct");
        }else {
            System.out.println("Answer is wrong");
        }

        System.out.println("Question four:\n 45-12");
        ans4 = read.nextInt();
        if (ans4 == 45-12){
            System.out.println("Answer is correct");
        }else {
            System.out.println("Answer is wrong");
        }

        System.out.println("Question five:\n 30*2+3");
        ans5 = read.nextInt();
        if (ans5 == (30*2)+3){
            System.out.println("Answer is correct");
        }else {
            System.out.println("Answer is wrong");
        }

    }
}