package CaseStudy.Commons;

import CaseStudy.Models.House;
import CaseStudy.Models.Room;
import CaseStudy.Models.Service;
import CaseStudy.Models.Villa;

import java.util.Scanner;

public class Validation {
    private static Scanner input;

    public static boolean isValidNameService(String inputString) {
        String regex = "^([\\p{Lu}]|([\\p{Lu}][\\p{Ll}]{1,}))([\\s]([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,6}$";
        return inputString.matches(regex);
    }

    public static boolean isValidFreeService(String srv) {
        String regex = "^massage|karaoke|food|drink|buffet|bbq$";
        return srv.matches(regex);
    }

    public static boolean isValidIdService(Service service, String str) {
        String pattern = "";
        if (service instanceof Villa) {
            pattern = "^SVVL-\\d{4}$";
        } else if (service instanceof House) {
            pattern = "^SVHO-\\d{4}$";
        } else if (service instanceof Room) {
            pattern = "^SVRO-\\d{4}$";
        }
        return str.matches(pattern);
    }

    //service parameter in this method must be fill to processing if else statement in isValidIdService()
    public static String getValidIdService(Service service, String errorNofitication) {
        input = new Scanner(System.in);
        String result = input.nextLine();
        if (!isValidIdService(service, result)) {
            System.out.print(
                    errorNofitication +
                            "\n    + Villa: SVVL-XXXX\n" +
                            "    + House: SVHO-XXXX\n" +
                            "    + Room: SVRO-XXXX\n" +
                            "=>  Enter service id: "
            );
            result = getValidIdService(service, errorNofitication); // recall method if input is invalid
        }
        return result;
    }

    public static String getValidNameService(String errorNotification) {
        input = new Scanner(System.in);
        String result = input.nextLine();
        if (!isValidNameService(result)) {
            System.out.print(errorNotification);
            result = getValidNameService(errorNotification);
        }
        return result;
    }

    public static String getValidFreeService(String errorNotification) {
        input = new Scanner(System.in);
        String result = input.nextLine();
        if (!isValidFreeService(result)) {
            System.out.println(errorNotification);
            result = getValidFreeService(errorNotification);
        }
        return result;
    }

    public static double getValidDoubleNumber(Double minNumber, String errorNotification) {
        input = new Scanner(System.in);
        double result = 0.0;
        try {
            result = Double.parseDouble(input.nextLine());
            if (minNumber != null && result <= minNumber) {
                throw new Exception(errorNotification);
            }
        } catch (Exception e) {
            System.err.println(errorNotification);
            result = getValidDoubleNumber(minNumber, errorNotification);
        }
        return result;
    }

}


//
//    public static Integer checkTypeInteger(String content, String errorMessage) {
//        while(true) {
//            try {
//                input = new Scanner(System.in);
//                System.out.println(content);
//                return input.nextInt();
//            } catch (Exception e) {
//                System.out.println(errorMessage);
//            }
//        }
//    }







































