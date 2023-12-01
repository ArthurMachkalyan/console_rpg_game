package generics;

public class NumberBox <N extends Number> {
    private N[] ns;

    public NumberBox(N[] ns) {
        this.ns = ns;
    }

    public double average() {
        double d = 0;
        for (N number : ns) {
            d += number.doubleValue();
        }
        return d / this.ns.length;
    }

    public boolean compare(NumberBox<?> anotherBox) {
        return Math.abs(this.average() - anotherBox.average()) < 0.0001f;
    }
}
