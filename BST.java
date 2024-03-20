class BST<K extends Comparable<K>, V> {
    private Node<K, V> root;

    // Constructor de TreeBinary
    public BST() {
        this.root = null;
    }


    /**
     * @param key
     * @param value
     */
    public void insertar(K key, V value) {
        root = insertarRec(root, key, value);
    }

    private Node<K, V> insertarRec(Node<K, V> current, K key, V value) {
        if (current == null) {
            return new Node<K, V>(key, value);
        }

        int compareResult = key.compareTo(current.getKey());

        if (compareResult < 0) {
            current.setLeft(insertarRec(current.getLeft(), key, value));
        } else if (compareResult > 0) {
            current.setRight(insertarRec(current.getRight(), key, value));
        } else {
            // La clave ya existe, actualizamos su valor
            current.setValue(value);
        }

        return current;
    }

    /**
     * @param key
     * @return
     */
    public V buscar(K key) {
        return buscarRec(root, key);
    }

    private V buscarRec(Node<K, V> current, K key) {
        if (current == null) {
            return null;
        }

        int compareResult = key.compareTo(current.getKey());

        if (compareResult == 0) {
            return current.getValue();
        } else if (compareResult < 0) {
            return buscarRec(current.getLeft(), key);
        } else {
            return buscarRec(current.getRight(), key);
        }
    }
}