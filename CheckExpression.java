import java.util.ArrayList;

public class CheckExpression {
    BST<String,String> tree = new BST<>();
    
    public void insertDiccionary(ArrayList<String> diccionario){
        for (String linea : diccionario){
            String [] listaLinea = linea.split(", ",2);
            tree.insert(listaLinea[0],(listaLinea[1]));
        }
        tree.inOrder();
    }

    public String checkText(ArrayList<String> text){
        StringBuilder initialText = new StringBuilder();
        StringBuilder finalText = new StringBuilder();
        
        for (String linea :text){
            initialText.append(linea);
        }


        String initialTextString = initialText.toString();
        String [] partsString = initialTextString.split("\\s+");

        for (String part :partsString){
            String traduccion = tree.search(part); 
            if (traduccion != null) {
                finalText.append("*").append(traduccion); 
            } else {
                finalText.append("*").append(part).append("*"); 
            }
        }
        finalText.append(".");

        return finalText.toString();
    }



}
