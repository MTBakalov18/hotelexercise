import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int option;
        Scanner s = new Scanner(System.in);
        ArrayList<Guest> Guest = new ArrayList<>();


        while (true) {

            System.out.println("Menu");
            System.out.println("1. Insert data");
            System.out.println("2. Print data");
            System.out.println("3. Print names and paid price");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            option = s.nextInt();

            switch (option) {
                case 1:
                    System.out.println();
                    Guest.add(insertData(s));
                    break;
                case 2:
                    System.out.println();
                    printData(Guest);
                    break;
                case 3:
                    System.out.println("Not done yet");
                    break;
                case 4:
                    break;
                default:
                    System.out.println();
                    System.out.println("Invalid option!");
            }
        }
    }

    public static void printData(ArrayList<Guest> Guest) {
        for (Guest h : Guest) {
            System.out.println(h.toString());
        }
    }

    public static Guest insertData(Scanner s) {

        String nothing = s.nextLine();
        String name;
        String id;
        int status;
        int nights;
        double beds;
        String city;


        System.out.print("Name: ");
        name = s.nextLine();
        System.out.print("ID: ");
        id = s.nextLine();
        System.out.print("relationship status: 1 for engaged or 2 for single: ");
        status = Integer.parseInt(s.nextLine());
        System.out.print("Nights: ");
        nights = Integer.parseInt(s.nextLine());
        System.out.print("Price for beds:");
        beds = Integer.parseInt(s.nextLine());
        System.out.print("City: ");
        city = s.nextLine();

        return new Guest(name, id, status, nights, beds, city);
    }

    }