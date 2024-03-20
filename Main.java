import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        CheckExpression checkexpression = new  CheckExpression();


        Archivo diccionariotxt = new Archivo("diccionario.txt");
        Archivo textotxt = new Archivo("diccionario.txt");
        ArrayList<String> diccionario = null;
        ArrayList<String> texto = null;

        try{
            diccionario = diccionariotxt.leerArchivo();
            texto = textotxt.leerArchivo();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

        checkexpression.insertDiccionary(diccionario);


    }

}
