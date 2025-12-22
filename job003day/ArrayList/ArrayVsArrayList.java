package job003day.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {
    public static void main(String[] args) {
    //     //Declear array in normal array
    //     String[] friendsArray = new String[4];
    //     String[] friendsArray2 = {"John", "Crish", "Eric", "Lucke"};

    //     //Declear ArrayList 
    //     ArrayList<String> friendsArrayList = new ArrayList<>();
    //     ArrayList<String> friendsArrayList2 = new ArrayList<>(Arrays.asList("John","Crish","Eric","Luck D"));

        
        String[] friendsArray = {"John1", "Crish2", "Eric3", "Lucke4"};

        ArrayList<String> friendsArrayList = new ArrayList<>(Arrays.asList("John1","Crish2","Eric3","Luck D4"));

        System.out.println(friendsArray[3]);
        System.out.println(friendsArrayList.get(3));
        System.out.println(" ");

        System.out.println(friendsArray.length);
        System.out.println(friendsArrayList.size());
        System.out.println(" ");

        friendsArrayList.add("Kamrul");
        System.out.println(friendsArrayList.get(4));
        System.out.println(" ");

        friendsArray[0] = "Kuddosh";
        System.out.println(friendsArray[0]);
        friendsArrayList.set(0,"Haluwa1");
        System.out.println(friendsArrayList.get(0));
        System.out.println(" ");

        friendsArrayList.remove("Haluwa1");
        System.out.println(friendsArrayList.get(0));

        System.out.println(friendsArray);
        System.out.println(friendsArrayList);


    }
}
