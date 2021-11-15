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
        System.out.println("1.A továbblépéshez nyomd le az egyik billentyűt!");
        scanner.nextLine();
    }

    public void printNames() {
        System.out.println("A tárgyalók felsorolása a felvétel sorrendjében:");
        for (int i = 0; i< meetingRoomList.size(); i++) {
            System.out.println("A tárgyaló neve: "+meetingRoomList.get(i).getName());
        }
        System.out.println("2.A továbblépéshez nyomd le az egyik billentyűt!");
        scanner.nextLine();
    }

    public void printNamesReverse() {
        System.out.println("A tárgyalók felsorolása fordított sorrendben:");
        for (int i = meetingRoomList.size()-1; i>=0; i--) {
            System.out.println("A tárgyaló neve: "+meetingRoomList.get(i).getName());
        }
        System.out.println("3. A továbblépéshez nyomd le az egyik billentyűt!");
        scanner.nextLine();
    }

    public void printEvenNames() {
        System.out.println("Páros sorszámú tárgyalók felsorolása:");
        for (int i = 1; i< meetingRoomList.size(); i=i+2) {
            System.out.println("A tárgyaló neve: "+meetingRoomList.get(i).getName());
        }
        System.out.println("4.A továbblépéshez nyomd le az egyik billentyűt!");
        scanner.nextLine();
    }

    public void printAreas() {
        System.out.println("A tárgyalók felsorolása (név, hossz, szélesség, terület:");
        for (int i = 0; i< meetingRoomList.size(); i++) {
            System.out.println("A tárgyaló neve: "+meetingRoomList.get(i).getName()
                    +" hossza: "+meetingRoomList.get(i).getLength()+" m"
                    +" szélessége: "+meetingRoomList.get(i).getWidth()+" m"
                    +" területe: "+meetingRoomList.get(i).getLength()*meetingRoomList.get(i).getWidth()+" nm");
        }
        System.out.println("5.A továbblépéshez nyomd le az egyik billentyűt!");
        scanner.nextLine();
    }

    public void printMeetingRoomsWithName(String name) {
        for (int i = 0; i< meetingRoomList.size(); i++) {
            if (meetingRoomList.get(i).getName().equals(name)) {
                System.out.println("A keresett tárgyaló neve: "+meetingRoomList.get(i).getName()
                        +" hossza: "+meetingRoomList.get(i).getLength()+" m"
                        +" szélessége: "+meetingRoomList.get(i).getWidth()+" m"
                        +" területe: "+meetingRoomList.get(i).getLength()*meetingRoomList.get(i).getWidth()+" nm");
            }
        }
        System.out.println("6.A továbblépéshez nyomd le az egyik billentyűt!");
        scanner.nextLine();
    }

    public void printMeetingRoomsContains(String part) {
        for (int i = 0; i< meetingRoomList.size(); i++) {
            if (meetingRoomList.get(i).getName().contains(part)) {
                System.out.println("A keresett tárgyaló neve: "+meetingRoomList.get(i).getName()
                        +" hossza: "+meetingRoomList.get(i).getLength()+" m"
                        +" szélessége: "+meetingRoomList.get(i).getWidth()+" m"
                        +" területe: "+meetingRoomList.get(i).getLength()*meetingRoomList.get(i).getWidth()+" nm");
            }
        }
        System.out.println("7.A továbblépéshez nyomd le az egyik billentyűt!");
        scanner.nextLine();
    }

    public void printAreasLargerThan(int area) {
        System.out.println("A(z) "+area+" nm-nél nagyobb tárgyalók felsorolása");

        for (int i = 0; i< meetingRoomList.size(); i++) {
            if ( meetingRoomList.get(i).getLength()*meetingRoomList.get(i).getWidth() > area ) {
                System.out.println("A tárgyaló neve: "+meetingRoomList.get(i).getName()
                        +"   hossza: "+meetingRoomList.get(i).getLength()+" m"
                        +"   szélessége: "+meetingRoomList.get(i).getWidth()+" m"
                        +"   területe: "+meetingRoomList.get(i).getLength()*meetingRoomList.get(i).getWidth()+" nm");
            }
        }
        System.out.println("8.A továbblépéshez nyomd le az egyik billentyűt!");
        scanner.nextLine();
    }
}
