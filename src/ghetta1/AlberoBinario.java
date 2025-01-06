package ghetta1;

public class AlberoBinario<T extends Comparable<T>> {

    private T data1;
    private AlberoBinario<T> sinistra;
    private AlberoBinario<T> destra;
    private AlberoBinario<T> root;

    public T getData1() {
        return data1;
    }

    public void setData1(T data1) {
        this.data1 = data1;
    }

    public AlberoBinario<T> getLeft() {
        return sinistra;
    }

    public void setLeft(AlberoBinario<T> sinistra) {
        this.sinistra = sinistra;
    }

    public AlberoBinario<T> getRight() {
        return destra;
    }

    public void setRight(AlberoBinario<T> destra) {
        this.destra = destra;
    }

    public AlberoBinario(T data) {
        this.data1 = data;
    }

    public void inserisci(AlberoBinario<T> nodo) {
        root = inserisciR(root, nodo);
    }

    private AlberoBinario<T> inserisciR(AlberoBinario<T> root, AlberoBinario<T> nodo) {
        T data = nodo.data1;

        if (root == null) {
            root = nodo;
            return root;
        } else if (data.compareTo(root.data1) < 0) {
            root.sinistra = inserisciR(root.sinistra, nodo);
        } else {
            root.destra = inserisciR(root.destra, nodo);
        }

        return root;
    }

    public void info() {
        infoR(root);
    }

    private void infoR(AlberoBinario<T> root) {
        if (root != null) {
            infoR(root.sinistra);
            System.out.println(root.data1);
            infoR(root.destra);

        }
    }

    public boolean ricerca(T data) {       
        return ricercaR(root, data);
    }

    private boolean ricercaR(AlberoBinario<T> root, T data) {
        if (root == null) {
            return false;
        } else if (root.data1.equals(data)) {
            return true;
        } else if (root.data1.compareTo(data) > 0) {
            return ricercaR(root.sinistra, data);
        } else {
            return ricercaR(root.destra, data);
        }
    }

    public static void main(String[] args) {
        AlberoBinario<Integer> albero = new AlberoBinario<>(0);
        albero.inserisci(new AlberoBinario<>(5)); 
        albero.inserisci(new AlberoBinario<>(1));
        albero.inserisci(new AlberoBinario<>(9));
        albero.inserisci(new AlberoBinario<>(2));
        albero.inserisci(new AlberoBinario<>(7));
        albero.inserisci(new AlberoBinario<>(3));
        albero.inserisci(new AlberoBinario<>(6));
        albero.inserisci(new AlberoBinario<>(4));
        albero.inserisci(new AlberoBinario<>(8));
        System.out.println(albero.ricerca(11));
        albero.info();
    }
}


