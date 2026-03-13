import java.util.Scanner;

class calc {

    public static void main(String[] args){
        String calc_Asci = " _____________________\n" +
                "|  _________________  |\n" +
                "| | Hej!           0. | |\n" +
                "| |_________________| |\n" +
                "|  ___ ___ ___   ___  |\n" +
                "| | 7 | 8 | 9 | | + | |\n" +
                "| |___|___|___| |___| |\n" +
                "| | 4 | 5 | 6 | | - | |\n" +
                "| |___|___|___| |___| |\n" +
                "| | 1 | 2 | 3 | | x | |\n" +
                "| |___|___|___| |___| |\n" +
                "| | . | 0 | = | | / | |\n" +
                "| |___|___|___| |___| |\n" +
                "|_____________________|";
        System.out.println(calc_Asci);
        Scanner myObj = new Scanner(System.in);
        System.out.println("Skriv in ett nummer");
        int userNumber = myObj.nextInt();
        Scanner myObj1 = new Scanner(System.in);
        System.out.println("Du valde " + userNumber + " Skriv in ett nummer till för att plussa ihop dom");
        int userNumber1 = myObj1.nextInt();
        int sum = userNumber + userNumber1;
        System.out.println(userNumber + "+" + userNumber1 + " = "+sum
        );

    }

}
