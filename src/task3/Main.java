package task3;

import java.util.*;

public class Main {
        public static class FavoriteClasses<T, V, E> {
            private T favorite1;
            private V favorite2;
            private E favorite3;

            FavoriteClasses(T fav1, V fav2, E fav3) {
                this.favorite1 = fav1;
                this.favorite2 = fav2;
                this.favorite3 = fav3;
            }
            public T getFav1() {
                return(this.favorite1);
            }
            public V getFav2() {
                return(this.favorite2);
            }
            public E getFav3() {
                return(this.favorite3);
            }
        }
        public static void main(String[] args) {
            List<Double> r = new ArrayList<>();
            r.add(6.3);
            r.add(5.9);
            FavoriteClasses<String, Integer, Double> a = new FavoriteClasses<>("Hello", 67, r.get(0));
            System.out.println("My favorites are " + a.getFav1() + ", " + a.getFav2() + ", and " + a.getFav3() + ".");
        }
}
