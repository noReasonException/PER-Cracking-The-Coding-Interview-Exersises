public class Main {

    public static void main(String[] args) {
        System.out.println(isRotationOf("waterbottle","erbottlewat"));
    }
    public static boolean isRotationOf(String str,String str2){
        return (str2+str2).contains(str);
    }
}
