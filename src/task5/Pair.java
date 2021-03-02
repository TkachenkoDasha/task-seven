package task5;

public class Pair <K, V> {
    private K code;
    private V value;

    public Pair(K code, V value) {
        this.code = code;
        this.value = value;
    }

    public K getCode() {
        return code;
    }

    public void setCode(K code) {
        this.code = code;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Pair {" +
                "id=" + code +
                ", value=" + value +
                '}';
    }
}
