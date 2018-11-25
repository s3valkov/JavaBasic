import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String planet = scanner.nextLine().toLowerCase();
        int daysStayed = Integer.parseInt(scanner.nextLine());

        if (planet.equals( "mercury"))
        {
            if (daysStayed <= 7)
            {
                double distance = 0.61;
                double sumDist = distance * 2;
                double totalDays = (sumDist * 226) + daysStayed;
                System.out.printf("Distance: %.02f%n" , sumDist);
                System.out.printf("Total number of days: %.02f%n" , totalDays);
            }
            else
            {
                System.out.printf("Invalid numbers of days!");
            }

        }
        else if (planet.equals("venus"))
        {
            if (daysStayed <= 14)
            {
                double distance = 0.28;
                double sumDist = distance * 2;
                double totalDays = (sumDist * 226) + daysStayed;
                System.out.printf("Distance: %.02f%n" , sumDist);
                System.out.printf("Total number of days: %.02f%n" , totalDays);
            }
            else
            {
                System.out.printf("Invalid numbers of days!");
            }
        }
        else if (planet.equals("mars"))
        {
            if (daysStayed <= 20)
            {
                double distance = 0.52;
                double sumDist = distance * 2;
                double totalDays = (sumDist * 226) + daysStayed;
                System.out.printf("Distance: %.02f%n" , sumDist);
                System.out.printf("Total number of days: %.02f%n" , totalDays);
            }
            else
            {
                System.out.printf("Invalid numbers of days!");
            }
        }
        else if (planet.equals("jupiter"))
        {
            if (daysStayed <= 5)
            {
                double distance = 4.2;
                double sumDist = distance * 2;
                double totalDays = (sumDist * 226) + daysStayed;
                System.out.printf("Distance: %.02f%n" , sumDist);
                System.out.printf("Total number of days: %.02f%n" , totalDays);
            }
            else
            {
                System.out.printf("Invalid numbers of days!");
            }
        }
        else if (planet.equals("saturn"))
        {
            if (daysStayed <= 3)
            {
                double distance = 8.52;
                double sumDist = distance * 2;
                double totalDays = (sumDist * 226) + daysStayed;
                System.out.printf("Distance: %.02f%n" , sumDist);
                System.out.printf("Total number of days: %.02f%n" , totalDays);
            }
            else
            {
                System.out.printf("Invalid numbers of days!");
            }
        }
        else if (planet.equals("uranus"))
        {
            if (daysStayed <= 3)
            {
                double distance = 18.21;
                double sumDist = distance * 2;
                double totalDays = (sumDist * 226) + daysStayed;
                System.out.printf("Distance: %.02f%n" , sumDist);
                System.out.printf("Total number of days: %.02f%n" , totalDays);
            }
            else
            {
                System.out.printf("Invalid numbers of days!");
            }
        }
        else if (planet.equals("neptune"))
        {
            if (daysStayed <= 2)
            {
                double distance = 29.09;

                double sumDist = distance * 2;
                double totalDays = (sumDist * 226) + daysStayed;
                System.out.printf("Distance: %.02f%n" , sumDist);
                System.out.printf("Total number of days: %.02f%n" , totalDays);
            }
            else
            {
                System.out.printf("Invalid numbers of days!");
            }
        }

        if (!(planet.equals("mercury") || planet.equals("venus") || planet.equals("mars") || planet.equals("jupiter") || planet.equals("saturn") || planet.equals("uranus") || planet.equals("neptune")))
        {
            System.out.printf("Invalid planet name!");
        }



        }


    }

