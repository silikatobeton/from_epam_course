import java.util.Objects;
import java.util.Optional;

public class Pair<K,V> {

    private   K key;
  private V value;

  public static<K,V> Pair of(K key, V value){

      return new Pair<>(key, value);
     }

     private Pair(K key, V value) {
        this.key=key;
        this.value=value;
    }

    public K getFirst() {
        return key;
    }

    public V getSecond() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pair<?, ?> pair = (Pair<?, ?>) o;

        if (!Objects.equals(key, pair.key)) return false;
        return Objects.equals(value, pair.value);
    }

    @Override
    public int hashCode() {
        int result = key != null ? key.hashCode() : 0;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }


}


