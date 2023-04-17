public class Main {

    public static void main(String[] args) {

        ListaEnlazada<Integer> lista1 = new ListaEnlazada<Integer>();
        lista1.add(22);
        System.out.println(lista1.getPrimero().getValue());
        lista1.add(144);
        lista1.add(1222);
        lista1.add(17689);
        //System.out.println(lista1.getUltimo().getValue());
        //System.out.println(lista1.get(2).getValue());
        //lista1.remove(2);
        System.out.println(lista1.getUltimo().getValue());
        //System.out.println(lista1.existeNodo(17689));
        lista1.addLast(1);
        System.out.println(lista1.get(3).getSiguiente().getValue());
        ListaCircular<Integer> l = new ListaCircular<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        //System.out.println(l.getSize());
        //l.remove(5);
        //System.out.println(l.getUltimo().getValue());
        //System.out.println(l.getPrimero().getValue());
        //l.addFirst(99);
        //System.out.println(l.getPrimero().getAnterior().getValue());
        System.out.println(l.get(8).getValue());

    }
}