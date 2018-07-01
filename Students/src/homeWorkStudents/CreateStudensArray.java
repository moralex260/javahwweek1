package homeWorkStudents;

import java.util.Scanner;

public class CreateStudensArray {
    public static void main(String[] args) {


        int size;
        int size1;
        int j = 0;
        String b = "enter";
        Scanner in = new Scanner(System.in);
        String[][] studArr = new String[size = 4][size1 = 6];


        for (int i = 0; i < size; i++) {
            System.out.println("if you want to exit,right :0 or enter:enter");
            String ex = in.nextLine();
            if (ex.equals(b)) {

                System.out.println("enter name: ");
                String name = in.nextLine();
                studArr[i][j] = name;
                System.out.println("enter last name: ");
                String lastName = in.nextLine();
                studArr[i][j + 1] = lastName;
                System.out.println("enter age : ");
                String age = in.nextLine();
                studArr[i][j + 2] = age;
                System.out.println("sex: ");
                String sex = in.nextLine();
                studArr[i][j + 3] = sex;
                System.out.println("adress: ");
                String adress = in.nextLine();
                studArr[i][j + 4] = adress;


                System.out.println("Ваше имя: " + name + "   Ваш возраст: " + age);

            } else if (ex.equals("0")) {
                for (i = 0; i <= studArr.length; i++) {
                    for (j = 0; j < size1; j++) {
                        System.out.print(studArr[i][j] + "\t");
                    }
                }

                return;

            }
        }
    }
}
























