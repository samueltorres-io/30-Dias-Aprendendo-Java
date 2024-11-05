public class Main {
    public static void main(String[] args) {
        
        String w0 = "Hello";
        String w1 = "World!";
        
        // Podemos usar '+' para concatenar dados;
        System.out.println(w0 + " " + w1);
        
        // Podemos tambem utilizar o recurso concat();
        System.out.println(w0.concat(w1));
        
        // Length
        String txt = w0 + " " + w1;
        System.out.println(txt.length());
        
        // Podemos entender uma string em java como um array de char, o que acontece e que a classe String encapsula esse array de caracteres char, tornando ele imutavel.
        System.out.println(txt.indexOf("W"));
        
        // Java Math
        System.out.println(Math.max(4, 2)); // Retorna o Maior numero;
        System.out.println(Math.min(3, 4)); // Retorna o Menor numero;
        System.out.println(Math.sqrt(64)); // Retorna a raiz quadrada;
        System.out.println(Math.abs(-4.7)); // Retorna o valor agora de forma positiva;
        System.out.println(Math.random()); // Retorna um valor aleatorio;
        
        // Random Numebers
        int randomNumber = (int)(Math.random() * 128);
        System.out.println(randomNumber);
        
        // Salvando 4 numeros aleatorios em um array
        int[] sequence;
        sequence = new int[4];
        
        for(int i = 0; i < 4; i++) {
            int randomNum = (int)(Math.random() * 99);
            sequence[i] = randomNum;
        }
        
        // Mostrando os numeros do array completo
        for(int i = 0; i < sequence.length; i++) {
            System.out.println(sequence[i]);
        }
        
        
    }
}