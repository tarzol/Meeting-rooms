package meetingrooms;

import java.util.Scanner;

public class MeetingRoomController {

    Office office = new Office();
    public void runMenu() {
        MeetingRoomController meetingRoomController2 = new MeetingRoomController();
        meetingRoomController2.printMenu();
        Scanner scanner = new Scanner(System.in);

        String name;
        Boolean logOut = false;

        while (logOut == false ) {
            meetingRoomController2.printMenu();
            System.out.print("\nKérem adja meg a kiválasztott menüpont sorszámát:   ");
            int numberOfMenu = scanner.nextInt();

            switch (numberOfMenu) {
                case 1:
                    meetingRoomController2.readOffice();
                    break;
                case 2:
                    office.printNames();
                    break;
                case 3:
                    office.printNamesReverse();
                    break;
                case 4:
                    office.printEvenNames();
                    break;
                case 5:
                    office.printAreas();
                    break;
                case 6:
                    System.out.println("Add meg a tárgyaló nevét: ");
                    name = scanner.nextLine();
                    office.printMeetingRoomsWithName(name);
                    break;
                case 7:
                    System.out.println("Add meg a tárgyaló nevének egy részét: ");
                    name = scanner.nextLine();
                    office.printMeetingRoomsContains(name);
                    break;
                case 8:
                    System.out.println("Add meg a területet: ");
                    int area = scanner.nextInt();
                    office.printAreasLargerThan(area);
                    break;
                case 9:
                    logOut = true;
                    break;
            }
        }

    }

    public void printMenu() {
        System.out.println("1. Tárgyaló rögzítése\n" +
                "2. Tárgyalók sorrendben\n" +
                "3. Tárgyalók visszafele sorrendben\n" +
                "4. Minden második tárgyaló\n" +
                "5. Területek\n" +
                "6. Keresés pontos név alapján\n" +
                "7. Keresés névtöredék alapján\n" +
                "8. Keresés terület alapján\n" +
                "9. Kilépés");
    }

    public void readOffice() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Add meg a tárgyaló nevét: ");
        String name = scanner.nextLine();
        System.out.print("Add meg a tárgyaló hosszát: ");
        int length = scanner.nextInt();
        System.out.print("Add meg a tárgyaló szélességét: ");
        int width = scanner.nextInt();

        MeetingRoom meetingRoomNew = new MeetingRoom(name, length, width);
        office.addMeetingRoom(meetingRoomNew);
    }

    public static void main(String[] args) {

        MeetingRoomController meetingRoomController = new MeetingRoomController();
        meetingRoomController.runMenu();
        //meetingRoomController.printMenu();
    }
}
