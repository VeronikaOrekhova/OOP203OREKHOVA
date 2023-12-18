import java.io.Serializable;
// Обобщенный класс с тремя параметрами

class MyClass<T extends Comparable<T>, V extends Animal & Serializable, K extends Double> {
    private T t;
    private V v;
    private K k;

    public MyClass(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    public void printClassNames() {
        System.out.println("T: " + t.getClass().getSimpleName());
        if (v != null) {
            System.out.println("V: " + v.getClass().getSimpleName());
        }
        System.out.println("K: " + k.getClass().getSimpleName());
    }
}