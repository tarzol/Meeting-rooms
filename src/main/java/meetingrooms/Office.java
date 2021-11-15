package meetingrooms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Office {
    Scanner scanner = new Scanner(System.in);
    List<MeetingRoom> meetingRoomList = new ArrayList<>();

    public void addMeetingRoom (MeetingRoom meetingRoom) {
        meetingRoomList.add(meetingRoom);
        System.out.println("lista hossza: "+meetingRoomList.size());
        System.out.print("Név: "+meetingRoomList.get(0).getName());
        System.out.print(" "+meetingRoomList.get(0).getLength());
        System.out.println("  "+meetingRoomList.get(0).getWidth()+"  ");
        System.out.println("1.A továbblépéshez nyomd le az egyik billentyűt!");
        scanner.nextLine();
    }

    public void printNames() {
        System.out.println("lista hossza: "+meetingRoomList.size());
        for (int i = 0; i< meetingRoomList.size(); i++) {
            System.out.println("A tárgyaló adatai: "+meetingRoomList.get(i).getName()
                    +meetingRoomList.get(i).getLength()+meetingRoomList.get(i).getWidth());
        }
        System.out.println("2.A továbblépéshez nyomd le az egyik billentyűt!");
        scanner.nextLine();

    }

    public void printNamesReverse() {
        for (int i = meetingRoomList.size()-1; i>=0; i--) {
            System.out.println("A tárgyaló adatai: "+meetingRoomList.get(i).getName()
                    +meetingRoomList.get(i).getLength()+meetingRoomList.get(i).getWidth());
        }
        System.out.println("3. A továbblépéshez nyomd le az egyik billentyűt!");
        scanner.nextLine();

    }

    public void printEvenNames() {
        for (int i = 1; i< meetingRoomList.size(); i=i+2) {
            System.out.println("A páros számú tárgyaló neve: "+meetingRoomList.get(i).getName());
        }
        System.out.println("2.A továbblépéshez nyomd le az egyik billentyűt!");
        scanner.nextLine();
    }

    public void printAreas() {
        for (int i = 0; i< meetingRoomList.size(); i++) {
            System.out.println("A tárgyaló adatai: "+meetingRoomList.get(i).getName()
                    +meetingRoomList.get(i).getLength()+meetingRoomList.get(i).getWidth());
        }
        System.out.println("2.A továbblépéshez nyomd le az egyik billentyűt!");
        scanner.nextLine();
    }

    public void printMeetingRoomsWithName(String name) {

    }

    public void printMeetingRoomsContains(String part) {

    }

    public void printAreasLargerThan(int area) {
        for (int i = 0; i< meetingRoomList.size(); i++) {
            if ( meetingRoomList.get(i).getLength()*meetingRoomList.get(i).getWidth() > area ) {
                System.out.println("A tárgyaló adatai: "+meetingRoomList.get(i).getName()
                        +meetingRoomList.get(i).getLength()+meetingRoomList.get(i).getWidth());
            }
        }
        System.out.println("8.A továbblépéshez nyomd le az egyik billentyűt!");
        scanner.nextLine();
    }
}
