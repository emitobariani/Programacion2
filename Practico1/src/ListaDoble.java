public class ListaDoble<T> extends ListaEnlazada<T> {
    public ListaDoble() {
        super();
    }

    @Override
    public void addFirst(T value) {
        Nodo<T> nuevoNodo =  new Nodo(value);
        Nodo<T> aux = getPrimero();
        aux.setAnterior(nuevoNodo);
        setPrimero(nuevoNodo);
        getPrimero().setSiguiente(aux);
        size++;
    }

    @Override
    public void add(T value) {
        if (getPrimero() == null) {
            Nodo<T> nuevonodo = new Nodo(value);
            setPrimero(nuevonodo);
            setUltimo(nuevonodo);
            size++;

        } else {
            Nodo<T> aux = getUltimo();
            Nodo<T> nuevonodo = new Nodo(value);
            nuevonodo.setAnterior(aux);
            aux.setSiguiente(nuevonodo);
            setUltimo(nuevonodo);
            size++;

        }
    }

    @Override
    public void addLast(T value) {
        Nodo<T> nuevoNodo =  new Nodo(value);
        Nodo<T> aux = getUltimo();
        nuevoNodo.setAnterior(aux);
        setUltimo(nuevoNodo);
        aux.setSiguiente(nuevoNodo);
        size++;

    }

    @Override
    public void remove(int position) {
        Nodo<T> anterior;
        Nodo<T> posterior;
        if (position < getSize()) {
            anterior = get(position).getAnterior();
            posterior = get(position).getSiguiente();
            if(posterior !=null){
                anterior.setSiguiente(posterior);
                posterior.setAnterior(anterior);
                size--;
                }else{setUltimo(anterior); size--;}
            } else {
            System.out.println("El valor esta fuera de rango");
        }

    }
}
