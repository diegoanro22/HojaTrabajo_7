import java.util.ArrayList;

public class CheckExpression {
    BST<String,String> tree = new BST<>();
    
    public void insertDiccionary(ArrayList<String> diccionario){
        for (String linea : diccionario){
            String [] listaLinea = linea.split(", ",2);
            tree.insertar(listaLinea[0],(listaLinea[1]));
        }
    }

    


}
