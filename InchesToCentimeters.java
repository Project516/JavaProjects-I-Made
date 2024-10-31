import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This is a Inches to Centemeters converter!");
        int error = 0;
        while (error == 0) {
        System.out.println("write 1 for inches to centemeters or 2 for centemeters to inches!");
        int num = input.nextInt();
        if (num == 1) {
            System.out.println("Enter a number!");
            double inch = input.nextInt();
            inch= inch * 2.54;
             System.out.println(inch);
        } 
        if (num == 2) {
            System.out.println("Enter a number!");
            double cent = input.nextInt();
            cent= cent / 2.54;
            System.out.println(cent);
        } if (num > 2) {
            System.out.println("ERROR");
        }
        }
    }
}