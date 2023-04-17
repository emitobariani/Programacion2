public class ListaEnlazada<T> implements Lista<T> {
    public ListaEnlazada() {
        super();
    }

    private Nodo<T> primero;

    private Nodo<T> ultimo;

    public int size = 0;

    public Nodo<T> getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo<T> primero) {
        this.primero = primero;
    }

    public Nodo<T> getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo<T> ultimo) {
        this.ultimo = ultimo;
    }

    public int getSize() {
        return this.size;
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
            aux.setSiguiente(nuevonodo);
            setUltimo(nuevonodo);
            size++;

        }
    }

    @Override
    public void remove(int position) {
        Nodo<T> anterior;
        Nodo<T> posterior;
        if (position < getSize()) {  // Revisa si el indice buscado esta dentro del tamaño de la lista
            anterior = get(position - 1); // Guardamos el nodo anterior al buscado
            if (get(position + 1) != null) {
                posterior = get(position + 1);//Guardamos el nodo posterior al nodo que queremos remover
                anterior.setSiguiente(posterior);//Linkeamos los nodos anteriores y posteriores al nodo que queremos remover para mantener unida la lista
                size--;
            } else {
                setUltimo(anterior);
                size--;
            }//En caso de que el nodo que eliminaremos sea el ultimo, seteamos el nodo anterior como ultimo.
        } else {
            System.out.println("El valor esta fuera de rango");// Marca que el valor esta fuera de rango, hay que cambiarlo por exception.
        }

    }

    @Override
    public Nodo<T> get(int postion){
        int contador = 0;// inicializamos un contador
        Nodo<T> aux = getPrimero();
        while (aux != null) { //Hacemos un loop por la lista
            if (contador == postion) {// cuando en el contador sae igual a la posicion hacemos break
                break;
            } else {
                aux = aux.getSiguiente();
                contador++;
            }
        }
        return aux;//retornamos el nodo en la posicion
    }

    public boolean existeNodo(T value){
        boolean result = false;
        Nodo<T> aux = getPrimero();
        while(aux != null){
            if(aux.getValue().equals(value)){
                result = true;
                break;
            }
            else{aux = aux.getSiguiente();}
        }
        return result;
    }

    public void addFirst(T value){
        Nodo<T> nuevoNodo =  new Nodo(value);
        Nodo<T> aux = getPrimero();
        setPrimero(nuevoNodo);
        getPrimero().setSiguiente(aux);
        size++;
    }
    public void addLast(T value){
        Nodo<T> nuevoNodo =  new Nodo(value);
        Nodo<T> aux = getUltimo();
        setUltimo(nuevoNodo);
        aux.setSiguiente(nuevoNodo);
        size++;
    }
}

