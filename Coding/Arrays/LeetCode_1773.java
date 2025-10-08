import java.util.List;

public class LeetCode_1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;

        int index = 0;
        if(ruleKey.equals("type")) index = 0;
        if(ruleKey.equals("color")) index = 1;
        if(ruleKey.equals("name")) index = 2;

        for(List<String> i : items){
            if(ruleValue.equals(i.get(index))) count++;
        }

        // for(List<String> i : items){
        //     if ((ruleKey.equals("type"))&&(i.get(0).equals(ruleValue))) count++;
        //     else if ((ruleKey.equals("color"))&&(i.get(1).equals(ruleValue))) count++;
        //     else if ((ruleKey.equals("name"))&&(i.get(2).equals(ruleValue))) count++;
        // }
        return count;
    }
}