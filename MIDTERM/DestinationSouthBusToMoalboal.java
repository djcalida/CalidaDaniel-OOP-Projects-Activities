import java.util.Scanner;

public class DestinationSouthBusToMoalboal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Default Route:\nCebu City (Start)\nMinglanilla (Route 1)\nSan Fernando (Route 2)\nCarcar (Route 3)\nBarili (Route 4.1)\nDumanjug (Route 4.1.1)\nRonda (Route 4.1.2)\nMoalboal (End)");
        System.out.print("\nIs Carcar via Barili obstructed? (1 = Yes, 0 = No): ");
        int isBariliObstructed = scan.nextInt();
        
        //Check if Carcar via Barili obstructed 
        if (isBariliObstructed == 0) {
            double distanceCarcarViaBarili = 86.7; //Constant Value of the Distance from Cebu City (Start)\nMinglanilla (Route 1)\nSan Fernando (Route 2)\nCarcar (Route 3)\nBarili (Route 4.1)\nDumanjug (Route 4.1.1)\nRonda (Route 4.1.2)\nMoalboal (End)..
            double speed = getInputSpeed(scan); //Scan after if the user type 0 (NO) if Carcar via Barili obstructed. 
            System.out.println("\nRecommended Route:\nCebu City (Start)\nMinglanilla (Route 1)\nSan Fernando (Route 2)\nCarcar (Route 3)\nBarili (Route 4.1)\nDumanjug (Route 4.1.1)\nRonda (Route 4.1.2)\nMoalboal (End)");
            calculateEstTOA(distanceCarcarViaBarili, speed); //Set to the method private static void calculateEstTOA() to calculate the ETA..
            
            
        } else {
            System.out.println("\nDefault Route:\nCebu City (Start)\nMinglanilla (Route 1)\nSan Fernando (Route 2)\nCarcar (Route 3)\nSibonga (Route 4.2)\nDumanjug (Route 4.2.1)\nRonda (Route 4.2.2)\nMoalboal (End)");
            System.out.print("\nIs Carcar via Sibonga via Dumanjug obstructed? (1 = Yes, 0 = No): ");
            int isSibongaViaDumanjugObstructed = scan.nextInt();

            if (isSibongaViaDumanjugObstructed == 0) {
                double distanceCarcarViaSibongaViaDumanjug = 95.4; //Constant Value of the Distance from Cebu City (Start)\nMinglanilla (Route 1)\nSan Fernando (Route 2)\nCarcar (Route 3)\nSibonga (Route 4.2)\nDumanjug (Route 4.2.1)\nRonda (Route 4.2.2)\nMoalboal (End)");
                double speed = getInputSpeed(scan);
                System.out.println("\nRecommended Route:\nCebu City (Start)\nMinglanilla (Route 1)\nSan Fernando (Route 2)\nCarcar (Route 3)\nSibonga (Route 4.2)\nDumanjug (Route 4.2.1)\nRonda (Route 4.2.2)\nMoalboal (End)");
                calculateEstTOA(distanceCarcarViaSibongaViaDumanjug, speed); //Set to the method private static void calculateEstTOA() to calculate the ETA..
                
            } else {
               System.out.println("\nDefualt Route:\nCebu City (Start)\nMinglanilla (Route 1)\nSan Fernando (Route 2)\nCarcar (Route 3)\nSibonga (Route 4.3)\nArgao (Route 4.3.1)\nAlcantara (Route 4.3.2)\nRonda (Route 4.3.3)\nMoalboal (End)");
               double distanceCarcarViaSibongaViaArgaoViaAlcantarViaRonda = 94.4; //Constant Value of the Distance from Cebu City (Start)\nMinglanilla (Route 1)\nSan Fernando (Route 2)\nCarcar (Route 3)\nSibonga (Route 4.3)\nArgao (Route 4.3.1)\nAlcantara (Route 4.3.2)\nRonda (Route 4.3.3)\nMoalboal (End)");
               double speed = getInputSpeed(scan);
               System.out.println("\nRecommended Route:\nCebu City (Start)\nMinglanilla (Route 1)\nSan Fernando (Route 2)\nCarcar (Route 3)\nSibonga (Route 4.3)\nArgao (Route 4.3.1)\nAlcantara (Route 4.3.2)\nRonda (Route 4.3.3)\nMoalboal (End)");
               calculateEstTOA(distanceCarcarViaSibongaViaArgaoViaAlcantarViaRonda, speed); //Set to the method private static void calculateEstTOA() to calculate the ETA..
               }
          }
    }
    //Method to scan what the driver speed in kph
    private static double getInputSpeed(Scanner scanner) {
        System.out.print("\nInput Speed in kph: ");
        return scanner.nextDouble();
    }
    //Enable to calculate the Estimated Time of Arrival
    private static void calculateEstTOA(double distance, double speed) {
        System.out.println("\nDistance: " + distance + " km");
        System.out.println("Speed: "+speed); //Display the speed
        double estTOA = distance / speed;
        convertDecimalHours(estTOA);
    }
    //Enable to print Hours, Minutes, and Seconds
    private static void convertDecimalHours(double decimalHours) {
        int hours = (int) decimalHours;
        double decimalMinutes = (decimalHours - hours) * 60;
        int minutes = (int) decimalMinutes;
        int seconds = (int) ((decimalMinutes - minutes) * 60);

        System.out.println("Estimated TOA: " + hours + " hour/s " + minutes + " minute/s " + seconds + " second/s.");
    }
}