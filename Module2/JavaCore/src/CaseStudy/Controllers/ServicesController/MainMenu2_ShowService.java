package CaseStudy.Controllers.ServicesController;

import CaseStudy.Commons.Config_Services_CSV.configHouseCSV;
import CaseStudy.Commons.Config_Services_CSV.configRoomCSV;
import CaseStudy.Commons.Config_Services_CSV.configVillaCSV;
import CaseStudy.Models.House;
import CaseStudy.Models.Room;
import CaseStudy.Models.Villa;

import java.util.ArrayList;
import java.util.Scanner;

import static CaseStudy.Controllers.MainController.displayMainMenu;
import static CaseStudy.Controllers.ServicesController.BackPreviousMenu.backPreviousMenu;

public class MainMenu2_ShowService<E> {
    private static Scanner input = new Scanner(System.in);

    public static void showServices() {
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
                showAllVilla();//done
                break;
            case 2:
                showAllHouse();//done
                break;
            case 3:
                showAllRoom();//done
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
        ArrayList<Villa> villaArrayListToShow = configVillaCSV.readVillaCSVFile();
        System.out.println("=================[ALL VILLA LIST]=================");
        villaArrayListToShow.forEach(villa -> {
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=");
            System.out.println(villa.showInfo() + "\n");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=");
        });
        input.nextLine();
        displayMainMenu();
        System.out.println();
    }

    private static void showAllHouse() {
        ArrayList<House> houseArrayListShow = configHouseCSV.readHouseCSVFile();
        System.out.println("=================[ALL HOUSE LIST]=================");
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
        ArrayList<Room> roomArrayListShow = configRoomCSV.readRoomCSVFile();
        System.out.println("=================[ALL ROOM LIST]=================");
        roomArrayListShow.forEach(room -> {
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=");
            System.out.println(room.showInfo() + "\n");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=");
        });
        input.nextLine();
        displayMainMenu();
        System.out.println();
    }

//    private static void loop(ArrayList<Service> arrayList) {
//        arrayList.forEach(e -> {
//            System.out.println(e.showInfo());
//        });
//    }

    private static void showAllVillaNotDuplicate() {

    }

    private static void showAllHouseNotDuplicate() {

    }

    private static void showAllRoomNotDuplicate() {

    }
}
