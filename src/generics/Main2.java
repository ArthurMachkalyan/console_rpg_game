package generics;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {

    }

    public static <T> void copyElement(ArrayList<? extends T> src, ArrayList<? super T> dst ) {
        for (int i = 0; i < src.size(); i++) {
            dst.add(src.get(i));
        }
    }

}
