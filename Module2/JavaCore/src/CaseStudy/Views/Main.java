package CaseStudy.Views;

import CaseStudy.Models.Service;
import CaseStudy.Models.Villa;

import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Service villa = new Villa();
        villa.setId(UUID.randomUUID().toString().replace("-",""));

        System.out.print("Enter name service: ");
        villa.setNameService(input.nextLine());

        System.out.print("Enter area used: ");
        villa.setAreaUsed(input.nextDouble());

        System.out.print("Enter rental costs: ");
        villa.setRentalCosts(input.nextDouble());

        System.out.print("Enter max number of people: ");
        villa.setMaxNumberOfPeople(input.nextInt());
        input.nextLine(); //chống trôi lệnh

        System.out.print("Enter type rent: ");
        villa.setTypeRent(input.nextLine());

        System.out.print("Enter room standard: ");
        ((Villa)villa).setRoomStandard(input.nextLine());

        System.out.print("Enter convenient description: ");
        ((Villa)villa).setConvenientDescription(input.nextLine());

        System.out.print("Enter number of floors: ");
        ((Villa)villa).setNumberOfFloors(input.nextInt());

        System.out.print("Enter area pool: ");
        ((Villa)villa).setAreaPool(input.nextDouble());

        System.out.print("\nINFORMATION ABOUT VILLA: " + villa.showInfo());
    }
}
