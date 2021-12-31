import java.util.*;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> n = new ArrayList<>();
        for (Character c : scanner.nextLine().toCharArray()) {
            n.add(c);
        }
        n.stream().sorted().forEach(new Consumer<Character>() {

            private ArrayList<Character> arr;
            private Character pr=null;
            private int position=-1;
            @Override
            public void accept(Character character) {
                position+=1;
                if(pr==null){
                    pr=character;
                    return;
                }
                if(pr.compareTo(character)==0){
                    arr.remove(position);
                    position-=2;
                    arr.remove(position+1);
                }
                pr=character;
            }
            public Consumer<Character> init(ArrayList<Character> arrayList){
                arr=arrayList;
                return this;
            }
        }.init(n));
        System.out.println(Arrays.toString(n.toArray()));

    }
}