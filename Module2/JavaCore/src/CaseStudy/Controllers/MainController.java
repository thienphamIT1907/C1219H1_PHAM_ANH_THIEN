package CaseStudy.Controllers;

import CaseStudy.Models.House;
import CaseStudy.Models.Room;
import CaseStudy.Models.Service;
import CaseStudy.Models.Villa;
import CaseStudy.Commons.configFileCSV;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class MainController {
    private static Scanner input = new Scanner(System.in);
    private static ArrayList<Villa> villaArrayList = new ArrayList<>();
    private static ArrayList<House> houseArrayList = new ArrayList<>();
    private static ArrayList<Room> roomArrayList = new ArrayList<>();

    public static void displayMainMenu() {
        System.out.print(
                "\n---MAIN MENU---\n" +
                        "1. Add new service\n" +
                        "2. Show service\n" +
                        "3. Add new customer\n" +
                        "4. Show information of customer\n" +
                        "5. Add new booking\n" +
                        "6. Show information of employee\n" +
                        "7. Exit\n" +
                        "Your select: "
        );

        switch (input.nextInt()) {
            case 1:
                addNewServices();
                break;
            case 2:
                showServices();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                System.exit(-1);
            default:
                System.out.print("Input invalid !");
                backPreviousMenu();
                break;
        }
    }

    private static void backPreviousMenu() {
        System.out.print("Press any key to continue...");
        input.nextLine();
        System.out.println("\n=========================");
        displayMainMenu();
    }

    private static void addNewServices() {
        System.out.print(
                "=========================\n" +
                        "\nMENU 1 - ADD NEW SERVICES:\n" +
                        "1. Add new Villa\n" +
                        "2. Add new House\n" +
                        "3. Add new Room\n" +
                        "4. Back to previous menu\n" +
                        "5. Exit\n" +
                        "Your select: "
        );

        switch (input.nextInt()) {
            case 1:
                addNewVilla();
                break;
            case 2:
                addNewHouse();
                break;
            case 3:
                addNewRoom();
                break;
            case 4:
                System.out.println("\n=========================");
                displayMainMenu();
                break;
            case 5:
                System.exit(-1);
                break;
            default:
                System.out.print("Input invalid !");
                backPreviousMenu();
                break;
        }

    }

    //Warning: When you have error, please check this block first !
    private static void createService(Service service) {
        service.setId(UUID.randomUUID().toString().replace("-", ""));

        input.nextLine();
        System.out.print("Enter name service: ");
        service.setNameService(input.nextLine());

        System.out.print("Enter area used: ");
        service.setAreaUsed(input.nextDouble());

        System.out.print("Enter rental costs: ");
        service.setRentalCosts(input.nextDouble());

        System.out.print("Enter max number of people: ");
        service.setMaxNumberOfPeople(input.nextInt());
        input.nextLine(); //chống trôi lệnh

        System.out.print("Enter type rent: ");
        service.setTypeRent(input.nextLine());
    }

    //Warning: When you have error, please check this block first !
    private static void addNewVilla() {
        Villa villa = new Villa();
        createService(villa);

        System.out.print("Enter room standard: ");
        villa.setRoomStandard(input.nextLine());

        System.out.print("Enter convenient description: ");
        villa.setConvenientDescription(input.nextLine());

        System.out.print("Enter area pool: ");
        villa.setAreaPool(input.nextDouble());

        System.out.print("Enter number of floors: ");
        villa.setNumberOfFloors(input.nextInt());

        villaArrayList.add(villa);

        configFileCSV.writeVillaCSVFile(villaArrayList);
        System.out.println("--------------------------------------------------------------");
        System.out.println("Add new VILLA has name " + "[" + villa.getNameService().toUpperCase() + "]" + " complete!");
        input.nextLine();
        backPreviousMenu();
    }

    private static void addNewHouse() {
        House house = new House();
        createService(house);

        System.out.print("Enter room standard: ");
        house.setRoomStandard(input.nextLine());

        System.out.print("Enter convenient description: ");
        house.setConvenientDescription(input.nextLine());

        System.out.print("Enter number of floors: ");
        house.setNumberOfFloors(input.nextInt());

        houseArrayList.add(house);

        configFileCSV.writeHouseCSVFile(houseArrayList);
        System.out.println("--------------------------------------------------------------");
        System.out.println("Add new HOUSE has name " + "[" + house.getNameService().toUpperCase() + "]" + " complete!");
        input.nextLine();
        backPreviousMenu();
    }

    private static void addNewRoom() {
        Room room = new Room();
        createService(room);

        System.out.print("Enter room standard: ");
        room.setFreeService(input.nextLine());

        roomArrayList.add(room);

        configFileCSV.writeRoomCSVFile(roomArrayList);
        System.out.println("--------------------------------------------------------------");
        System.out.println("Add new ROOM has name " + "[" + room.getNameService().toUpperCase() + "]" + " complete!");
        input.nextLine();
        backPreviousMenu();
    }

    private static void showServices() {
        System.out.print(
                "=========================\n" +
                        "\nMENU 2 - SHOW SERVICES:\n" +
                        "1. Show all Villa\n" +
                        "2. Show all House\n" +
                        "3. Show all Room\n" +
                        "4. Show all name Villa not duplicate\n" +
                        "5. Show all name House not duplicate\n" +
                        "6. Show all name Room not duplicate\n" +
                        "7. Back to menu\n" +
                        "8. Exit\n" +
                        "Your select: "
        );

        switch (input.nextInt()) {
            case 1:
                showAllVilla();
                break;
            case 2:
                showAllHouse();
                break;
            case 3:
                showAllRoom();
                break;
            case 4:
                showAllVillaNotDuplicate();
                break;
            case 5:
                showAllHouseNotDuplicate();
                break;
            case 6:
                showAllRoomNotDuplicate();
                break;
            case 7:
                displayMainMenu();
                break;
            case 8:
                System.exit(-1);
                break;
            default:
                System.out.print("Input invalid !");
                backPreviousMenu();
                break;
        }
    }

    private static void showAllVilla() {
        ArrayList<Villa> villaArrayListShow = configFileCSV.readVillaCSVFile();
        villaArrayListShow.forEach(villa -> {
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=");
            System.out.println(villa.showInfo() + "\n");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=");
        });
        input.nextLine();
        displayMainMenu();
        System.out.println();
    }

    private static void showAllHouse() {
        ArrayList<House> houseArrayListShow = configFileCSV.readHouseCSVFile();
        houseArrayListShow.forEach(house -> {
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=");
            System.out.println(house.showInfo() + "\n");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=");
        });
        input.nextLine();
        displayMainMenu();
        System.out.println();
    }

    private static void showAllRoom() {
        ArrayList<Room> roomArrayListShow = configFileCSV.readRoomCSVFile();
        roomArrayListShow.forEach(room -> {
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=");
            System.out.println(room.showInfo() + "\n");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=");
        });
        input.nextLine();
        displayMainMenu();
        System.out.println();
    }

    private static void showAllVillaNotDuplicate() {

    }

    private static void showAllHouseNotDuplicate() {

    }

    private static void showAllRoomNotDuplicate() {

    }


//    private static void showDemo() {
//        ArrayList<Villa> VillaSavedFile = new ArrayList<>();
//        VillaSavedFile  = configFileCSV.readVillaCSVFile();
//        for(Villa villa: VillaSavedFile) {
//            System.out.println("test: " + villa.getConvenientDescription());
//            System.out.println("test: " + villa.getTypeRent());
//            System.out.println("test: " + villa.getRoomStandard());
//            System.out.println("---------------------------");
//        }
//        System.out.print("Press any key to continue...");
//        input.nextLine();
//        displayMainMenu();
//    }

}
