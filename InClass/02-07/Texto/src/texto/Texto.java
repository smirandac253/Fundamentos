package texto;

public class Texto {

    public static void main(String[] args) {

        String word = "Texto Ejemplo numero uno";
        String[] arrayWord = word.split(" ");
        String back = "";
        for (int i = arrayWord.length -1; i>=0; i--) {
            
            System.out.println(i);
        }

    }

}
