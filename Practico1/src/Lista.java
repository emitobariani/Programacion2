public interface Lista<T> {
    public void add(T value);
    public void remove( int position );
    public Nodo<T> get(int position);

}