import java.util.Random;

public class Main {
    public static void main(String[] args) {
        
        // Teste de geracao de Salt com tamanho personalisado para testes sobre lacos de repeticao e array.
        
        salt(10);
        
        
    }
    
    static void salt(int tamanhoSalt) {
        String[] sequenceSalt;
        sequenceSalt = new String[tamanhoSalt];
        
        String[] options = {"!", "@", "a", "A", "$", "g", "N"};
        
        for(int x = 0; x < tamanhoSalt; x++) {
            int aux = (int)(Math.random() * options.length);
            sequenceSalt[x] = options[aux];
        }
        
        for(int x = 0; x < sequenceSalt.length; x++) {
            System.out.println(sequenceSalt[x]);
        }
    }
}