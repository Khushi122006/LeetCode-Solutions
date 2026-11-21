
import java.util.ArrayList;

class Solution {
    public String removeStars(String s) {

        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '*') {
                list.remove(list.size() - 1);
            } 
            else {
                list.add(ch);
            }
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < list.size(); i++) {
            result.append(list.get(i));
        }

        return result.toString();
    }
}
