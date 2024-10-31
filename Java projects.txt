import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter a grade");
        Scanner input = new Scanner(System.in);
        int grade1 = input.nextInt();
        System.out.println("Enter a second!");
        int grade2 = input.nextInt();
        System.out.println("One more!");
        int grade3 = input.nextInt();
        String score1 = "null";
        String score2 = "null";
        String score3 = "null";
        if (grade1 > 89) {
            score1 = "A";
        } else {
            if (grade1 > 79) {
                score1 = "B";
            }else {
                if (grade1 > 69) {
                    score1 = "C";
                }else {
                    score1 = "FAIL";
                }
            }
        }
         if (grade2 > 89) {
            score2 = "A";
        } else {
            if (grade2 > 79) {
                score2 = "B";
            }else {
                if (grade2 > 69) {
                    score2 = "C";
                }else {
                    score2 = "FAIL";
                }
            }
        }
        if (grade3 > 89) {
            score3 = "A";
        } else {
            if (grade3 > 79) {
                score3 = "B";
            }else {
                if (grade3 > 69) {
                    score3 = "C";
                }else {
                    score3 = "FAIL";
                }
            }
        }
        System.out.println(grade1 + " = " + score1);
        System.out.println(grade2 + " = " + score2);
        System.out.println(grade3 + " = " + score3);
    }
}