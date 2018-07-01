package homeWorkStudents;

import java.util.Arrays;
import java.util.Scanner;

public class MenuForDatabase extends CreateStudensArray {
    public static void main(String[] args) {

    }
        private static final int EXIT = 0;
        private static final int ADD = 1;
        private static final int CHOOSE = 2;

        public static void display () {
            System.out.println("M E N U \n" + " 0 - Exit \n" + " 1 - Add student \n" + " 2 - Choose student \n");
        }

        public static void menu () {
            Scanner scanner = new Scanner(System.in);
            display();
            while (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                switch (choice) {
                    case EXIT: {
                        System.out.println("BYE");
                        System.exit(0);
                        break;
                    }
                    case ADD: {

                        break;
                    }
                    case CHOOSE: {
                        System.out.println("look students list:");
                        for (int i = 0; i <= studArr.length; i++) {
                            System.out.print(studArr[i][0] + "\t");
                        }
                        System.out.println("enter lastname from students list:");
                        String lastname = scanner.nextLine();
                        for(i=0;i<studArr.length;i++){
                         if  ( studArr[i].equals(lastname)) {

                             System.out.println("Student with chosen lastname: ");
                             System.out.println(Arrays.deepToString(studArr));

                             display();
                         }
                        }
                        // як вивести з двумерного масссива?
                        break;
                    }


                    default:
                        System.out.println("Your choice is wrong");
                        display();
                        break;
                }
            }
        }
    }

