public class Nodo<T> {
    private T value;

    private Nodo<T> anterior;
    private Nodo<T> siguiente;

    public Nodo(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo<T> getAnterior() {return anterior;}

    public void setAnterior(Nodo<T> anterior) {this.anterior = anterior;}
}
