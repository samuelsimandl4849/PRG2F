package lists;

import java.util.ArrayList;

public class Basics {

    public static void main(String[] args) {
        ArrayList<Integer> expansiveArray = new ArrayList<>();

        //pridavani
        expansiveArray.add(56);
        expansiveArray.add(1,3);
        expansiveArray.add(42);

        //vypsani
        //read-only:
        System.out.println(expansiveArray);

        //vypsani + ziskani prvku
        for (int i = 0; i < expansiveArray.size(); i++) {
            System.out.println(expansiveArray.get(i));
        }

        for (int i = 0; i < 20; i++) {
            expansiveArray.add(i*5);
        }
        System.out.println(expansiveArray);

        expansiveArray.isEmpty(); //=== expansiveArray.size() > 0
        System.out.println(expansiveArray.size());
        expansiveArray.remove(3);
        System.out.println(expansiveArray.size());
        System.out.println(expansiveArray);

//        expansiveArray.removeAll(ArrayList HERE);
        System.out.println(expansiveArray.indexOf(5));
        System.out.println(expansiveArray.lastIndexOf(50));

        expansiveArray.clear();
        System.out.println(expansiveArray);

    }
}
