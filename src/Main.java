import com.sun.jdi.connect.Connector;

import java.util.Scanner;
public class Main {
    public static void main(String args[]) {

//First exercise
        Scanner month = new Scanner(System.in);
        System.out.println("Please enter month number and I will guess the month ");
        int monthNumber = month.nextInt();

        String seasonWinter = "Winter";
        String seasonSpring = "Spring";
        String seasonSummer = "Summer";
        String seasonAutumn = "Autumn";


        if (monthNumber == 12 && monthNumber < 3){
            System.out.println("It is Winter");
        }
        else if (monthNumber >= 3 && monthNumber < 6){
            System.out.println("It is Spring");
        }
        else if (monthNumber >=6 && monthNumber < 9){
            System.out.println("It is Summer");
        }
        else if (monthNumber >=9 && monthNumber < 12){
            System.out.println("It is Autumn");
        }
        else {
            System.out.println("It is not a month number ");
        }

//Second exercise

        String[] favoriteSinger;
        favoriteSinger = new String [5];
        favoriteSinger[0] = "Rihanna";
        favoriteSinger[1] = "Eminem";
        favoriteSinger[2] = "Bruno Mars";
        favoriteSinger[3] = "Sia";
        favoriteSinger[4] = "Sam Smith";
//Third exercise

        int [] myArrayFirst = { 1 , 2};

        int [] myArraySecond = { 3 , 4};

        int [] myArrayThird = { 5 , 6 };

        System.out.println(myArrayFirst[0] +" "+ myArrayFirst[1]);
        System.out.println(myArraySecond[0] +" "+ myArraySecond[1]);
        System.out.println(myArrayThird[0] +" "+ myArrayThird[1]);

    }

    Phone Iphone = new Phone(4768604, "Iphone", 0.6);
    Phone Samsung = new Phone (38529582, "Samsung");

    Samsung.getModel();
    Iphone.callNumber(254852);


    }

