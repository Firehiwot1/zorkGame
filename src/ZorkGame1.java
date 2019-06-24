import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;
import java.util.Random;

public class ZorkGame1 {
    private static boolean SecreteRoom = false;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int room = 1;
        String answer;
        boolean flag = true;

        while (flag) {
            System.out.println("Enter the direction or type Q");
            answer = input.nextLine();
            if (answer.equalsIgnoreCase("Q")) {
                System.out.println("Thank you");
                flag = false;
                break;
            }

            switch (room) {
                case 1:
                    room = RoomNo1(answer);
                    //System.out.printf("You are in room %d\n", room);
                    break;

                case 2:
                    room = RoomNo2(answer);
                    // System.out.printf("You are in room %d\n", room);
                    break;

                case 3:
                    room = RoomNo3(answer);
                    break;
                case 4:
                    room = RoomNo4(answer);
                    break;
                case 5:
                    room = RoomNo5(answer);
                    break;
                case 6:
                    room = RoomNo6(answer);
                    break;
                case 7:
                    room = RoomNo7(answer);
                    break;
                case 8:
                    room = RoomNo8(answer);
                    break;

                default:
                    System.out.println("You are outside");
                    //Ghoest();
                    flag = false;
                    break;

            }

            if (flag)
                System.out.println("You are in room " + room);
            else
                break;
        }

        Ghoest();
    }

    public static int RoomNo1(String varDir) {


        System.out.println("I am in room 1");
        int ret = 1;

        if (varDir.equals("north")) {
            ret = 2;

        }
//        System.out.println("room1 return=" + ret);
//        return (ret);
        else if (varDir.equals("south")) {
            ret=0;


        }

        return (ret);
    }


    public static int RoomNo2(String varDir) {
        System.out.println("I am in room 2");
        if (varDir.equals("south")) {
            return (1);
        } else if (varDir.equals("west")) {
            return (3);
        } else if (varDir.equals("east")) {
            return (4);
        } else {
            return (2);
        }
    }


    public static int RoomNo3(String varDir) {
        System.out.println("I am in room 3");
        if (varDir.equals("east")) {
            return (2);
        } else if (varDir.equals("north")) {
            return (5);
        } else {
            return (3);
        }

    }


    public static int RoomNo4(String varDir) {
        System.out.println("I am in room 4");
        if (varDir.equals("west")) {
            return (2);
        } else if (varDir.equals("north")) {
            return (7);
        } else {
            return (3);
        }

    }

    public static int RoomNo5(String varDir) {
        System.out.println("I am in room 5");
        if (varDir.equals("south")) {
            return (3);
        } else {
            return (5);
        }
    }

    public static int RoomNo6(String varDir) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int rno;

        if (varDir.equals("east")) {

            if (SecreteRoom) {
                System.out.println("Do you want to go room 7 or 8?");
                String answer = input.nextLine();
                if (varDir.equals("7")) {
                    return (7);
                } else {
                    return (8);


                }

            } else {

                rno = rand.nextInt(4);
                System.out.println("rno" + rno);
                if (rno == 1) {
                    return (8);
                } else {
                    return (7);

                }
            }

        } else {
            return (6);
        }

    }


    public static int RoomNo7(String varDir) {
        System.out.println("I am in room 7");
        if (varDir.equals("west")) {
            return (6);
        } else if (varDir.equals("south")) {
            return (4);
        } else {
            return (7);
        }

    }


    public static int RoomNo8(String varDir) {
        System.out.println("I am in room 8");
        SecreteRoom = true;

        if (varDir.equals("west")) {
            return (6);
        } else {
            return (8);
        }
    }


        public static void Ghoest (){
            Random rand1 = new Random();

            System.out.println("I am outside");
            int ran = rand1.nextInt(4);
            System.out.println("ran" + ran);
            if (ran == 1) {
                System.out.println("Your are followed by Ghost");

            }
        }

}



