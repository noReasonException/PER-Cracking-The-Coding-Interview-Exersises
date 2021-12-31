import java.security.InvalidParameterException;
import java.util.HashMap;

public class AllUnique {
    public boolean withNoAdditionalDataStructure(String str){
        SimpleBST<Character> tester = new SimpleBST<>();
        for (Character ch :str.toCharArray()) {
            try {
                tester.insert(ch);

            }catch (InvalidParameterException e){
                return false;
            }
        }
        return true;
    }
    public  boolean withAdditionalDataStructure(String str){
        HashMap<Character,String> tester = new HashMap<>();
        for (Character ch :str.toCharArray()) {
            if(tester.containsKey(ch))return false;
            tester.put(ch,"justAKey!");
        }return true;
    }
}


/***
 * Simple BST tree in order to bypass the <No Additional Data structure>
 * @param <T> the type of data
 */
class SimpleBST<T extends Comparable<T>> {
    class Node<Data extends Comparable<T>>{
        Node left,right;
        Data data;

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public Data getData() {
            return data;
        }

        public void setData(Data data) {
            this.data = data;
        }

        public Node(Data data) {
            this.data = data;
        }
    }
    private Node<T> root=null;

    /***
     * inserts a new value into BST
     * throws InvalidParameterException in case of existing already
     * @param data the value to enter
     * @return true on success
     */
    public boolean insert(T data){
        if(root==null){
            root=new Node<T>(data);
            return true;
        }
        else return _insert(root,data);
    }
    public boolean _insert(Node<T> curr,T data){
        Node<T> tmp=null;
        int cmp;
        if(((cmp=curr.data.compareTo(data))<0)){
            if((tmp=curr.getLeft())!=null){
                return _insert(tmp,data);
            }else {
                curr.setLeft(new Node<T>(data));
                return true;
            }

        }
        else if(cmp>0){
            if((tmp=curr.getRight())!=null){
                return _insert(tmp,data);
            }
            else {
                curr.setRight(new Node<T>(data));
                return true;
            }
        }
        else throw new InvalidParameterException("Value Already Exists!");
    }
}