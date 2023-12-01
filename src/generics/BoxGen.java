package generics;

public class BoxGen <T> {
     private T obj;

    public BoxGen(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
    public void setObj(T obj) {
        this.obj = obj;
    }
}
