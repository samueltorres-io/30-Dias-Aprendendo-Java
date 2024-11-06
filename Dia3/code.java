public class Main {
    public static void main(String[] args) {
        
        // While
        int x = 10;
        while(x < 15) {
            System.out.println(x);
            x++;
        }
        
        // Do While
        x = 10;
        do {
            System.out.println(x);
            x++;
        } while(x<15);
        
        // For
        for(x = 0; x <= 4; x++) {
            System.out.println((x+1) + ": " + x);
        }
        
        // For-Each
        String[] peoples = {"Alice", "Erik", "Lucas", "Jonathan"};
        for(String i : peoples) {
            System.out.println(i);
            // Percorre cada elemento do array e retornamos cada elemento por vez;
        }
        
        // Break and Continue
        for(x = 0; x < 40; x++) {
            if(x%2 == 0) {
                System.out.println("Par");
                continue;
            } else {
                System.out.println("Impar");
                continue;
            }
        }
        
        
        // Fibonalcci Sequencia
        // C = A + B
        // A = B
        // B = C
        
        int n0 = 21, n1=1, n2=n1, n3=0;
        while(n0 > n3) {
            n3 = n1 + n2;
            if(n3 > n0) {
                System.out.println("Nao esta!");
                break;
            }
            if(n3 == n0) {
                System.out.println("Esta!");
                break;
            }
            n1 = n2;
            n2 = n3;
        }
        
    }
}