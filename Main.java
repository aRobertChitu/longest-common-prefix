
public class Main {
    public static void main(String[] args) {

    }

    public String longestCommonPrefix(String[] strs) {

        String initialValue = strs[0];
        for(String s: strs){
            while(!s.startsWith(initialValue)){
               initialValue =  initialValue.substring(0, initialValue.length() - 1);
            }
        }
        return initialValue;
    }
}