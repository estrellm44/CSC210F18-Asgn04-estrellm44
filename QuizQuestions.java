package edu.sunyulster.meldiesestrella.roadquiz;

/**
 * Created by meldiesestrella on 10/2/18.
 */

public class QuizQuestions {

    public static String[] Questions = new String [] {
            "What is the correct name for the sign?",
            "What is the correct name for the sign?",
            "What is the correct name for the sign?",
            "What is the correct name for the sign?",
            "What is the correct name for the sign?",
            "What is the correct name for the sign?",
            "What is the correct name for the sign?",
            "What is the correct name for the sign?",
            "What is the correct name for the sign?"
    };

    public static int[] Images = new int [] {
            R.drawable.d9_5, R.drawable.r1_1, R.drawable.r3_5a, R.drawable.r8_3a,
            R.drawable.rl_100, R.drawable.w10_1, R.drawable.w1_15, R.drawable.w11_1,
            R.drawable.d9_3
    };

    private static String Choices [][] = {
            {"Stop", "No Parking", "Handicapped Accesible Facility"},
            {"Railroad Crossing Ahead","Straight Ahead Only", "Stop"},
            {"Bicycle Crossing", "Straight Ahead Only", "Hiking Trail"},
            {"Stop", "Very Sharp Curve Ahead", "No Parking"},
            {"Tent Camping", "Hiking Trail", "Bicycle Crossing"},
            {"Hiking Trail", "Straight Ahead Only", "Railroad Crossing Ahead"},
            {"Handicapped Accesible Facility", "Very Sharp Curve Ahead", "Bicycle Crossing"},
            {"Stop", "Bicycle Crossing", "Railroad Crossing Ahead"},
            {"Tent Camping", "Handicapped Accesible Facility", "Straight Ahead Only"},
    };
    // public static boolean[] answers = new boolean[]{
    //       true, false, false, false, true, true, false, true, true
    //};

    public static String getChoice1 (int i){
        String choice0 = Choices[i][0];
        return choice0;
    }

    public static String getChoice2 (int i){
        String choice1 = Choices[i][1];
        return choice1;
    }

    public static String getChoice3 (int i){
        String choice3 = Choices[i][2];
        return choice3;
    }

    public static String Answers[] = {"Handicapped Accesible Facility",
            "Stop",
            "Straight Ahead Only",
            "No Parking",
            "Hiking Trail",
            "Railroad Crossing Ahead",
            "Very Sharp Curve Ahead",
            "Bicycle Crossing",
            "Tent Camping"};

}