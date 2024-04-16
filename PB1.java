import java.util.ArrayList;
import java.util.Collections;

public class PB1 {

    public ArrayList<String> swapFirstLast(ArrayList<String> list) {
        if (list != null && list.size() > 1) {
            Collections.swap(list, 0, list.size() - 1);
        }
        return list;
    }

    public static void main(String[] args) {
        PB1 swapper = new PB1();
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Primul");
        myList.add("Al doilea");
        myList.add("Ultimul");

        System.out.println("List: " + myList);
        myList = swapper.swapFirstLast(myList);
        System.out.println("Swap list: " + myList);
    }
}
