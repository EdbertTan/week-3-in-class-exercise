import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExercise {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("red");
        colors.add("blue");
        colors.add("green");
        colors.add("black");
        colors.add("white");
        for (String i : colors){
            System.out.println(i);
        }
    }
}