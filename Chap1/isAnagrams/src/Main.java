import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(isAnagrams("hey","hy0"));
    }
    public static boolean isAnagrams(String a1,String a2){
        int h1,h2;
        char[] tmp1,tmp2;
        Arrays.sort(tmp1=a1.toCharArray());
        Arrays.sort(tmp2=a2.toCharArray());
        a1=Arrays.toString(tmp1);
        a2=Arrays.toString(tmp2);
        return a1.hashCode()==a2.hashCode();
    }
}
