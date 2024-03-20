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
    public void insert(K key, V value) {
        root = insertRec(root, key, value);
    }

    private Node<K, V> insertRec(Node<K, V> current, K key, V value) {
        if (current == null) {
            return new Node<K, V>(key, value);
        }

        int compareResult = key.compareTo(current.getKey());

        if (compareResult < 0) {
            current.setLeft(insertRec(current.getLeft(), key, value));
        } else if (compareResult > 0) {
            current.setRight(insertRec(current.getRight(), key, value));
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
    public V search(K key) {
        return searchRec(root, key);
    }

    private V searchRec(Node<K, V> current, K key) {
        if (current == null) {
            return null;
        }

        int compareResult = key.compareTo(current.getKey());

        if (compareResult == 0) {
            return current.getValue();
        } else if (compareResult < 0) {
            return searchRec(current.getLeft(), key);
        } else {
            return searchRec(current.getRight(), key);
        }
    }
}