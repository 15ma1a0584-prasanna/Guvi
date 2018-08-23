import java.util.HashMap;
import java.util.Map;
import java.util.*;
 
class IsomorphicString6 {
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	String str1=sc.next();
    	String str2=sc.next();
        checkIfIsoMorphic(str1,str2);
    }
 
    private static void checkIfIsoMorphic(String s1, String s2) {
        if (s1.length() == s2.length()) {
            s1 = s1.toLowerCase();
            s2 = s2.toLowerCase();
            if (s1.equals(s2)) {
                System.out.println("yes");
            } else {
                boolean isomorphic = true;
                Map<Character, Character> map = new HashMap<Character, Character>(
                        0);
                for (int i = 0; i < s1.length(); i++) {
                    char c1 = s1.charAt(i);
                    char c2 = s2.charAt(i);
                    if (map.containsKey(c1)) {
                        if (map.get(c1) != c2) {
                            isomorphic = false;
                            break;
                        }
                    } else {
                        if (map.containsValue(c2)) 
                        {
                            isomorphic = false;
                            break;
                        } else {
                            map.put(c1, c2);
                        }
                    }
                }
                if (isomorphic) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        } else {
            System.out.println("no");
        }
    }
}
