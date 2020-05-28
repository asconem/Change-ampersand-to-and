import java.util.ArrayList;
import java.util.List;

public class ReplacementWithList {

    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("Romeo & Juliet\n boy & girl");
        strList.add("Mike & Ike");
        strList.add("Trey and Mike");
        System.out.println(removeAmpersandWithList(strList));
    }

    public static List<String> removeAmpersandWithList(List<String> newList) {
        List<String> modifiedList = new ArrayList<>();
        for(String element: newList){
            modifiedList.add(Replacement.removeAmpersandWithReplace(element));
        }
        return modifiedList;
    }
}
