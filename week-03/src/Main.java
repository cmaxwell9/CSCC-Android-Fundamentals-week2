/**
 * Created by Clint on 2/4/2016.
 */
public class Main {
    static  int getUserFarenheit() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter a Fahrenteit tempature");
        String userInput = scanner.nextLine();
        return Double.parseDouble(userInput);


        
    }

    static double fToC(double fTemp){
        return 5.0/9 * (fTemp -32);
    }
    static void display(double cTemp ){
        System.out.println(("The celsius temperature is " + cTemp));
    }

    public static void main(String[] args) {
      double fTemp=getUserFarenheit();
        while (fTemp >= -460){
            double cTemp = fToC(fTemp);
            display(cTemp);
        };




    }
}
