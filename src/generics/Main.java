package generics;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        Box box = new Box(50);
        Box box1 = new Box("String");
        box1.setObject(2);
        if (box1.getObject() instanceof Integer && box.getObject() instanceof Integer) {
            int result = (Integer) box.getObject() + (Integer) box1.getObject();
            System.out.println(result);
        }

        BoxGen<Integer> integerBoxGen = new BoxGen<>(3);
        BoxGen<Integer> integerBoxGen1 = new BoxGen<>(4);

        NumberBox<Integer> numberBox = new NumberBox<>(new Integer[]{2,5,6,5,3});
        NumberBox<Double> numberBox1 = new NumberBox<>(new Double[]{2.5,5.1,6.6,5.8,3.3});
        System.out.println(numberBox.average());
        System.out.println(numberBox.compare(numberBox1));

    }

}
