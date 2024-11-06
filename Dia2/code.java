// IF - ELSE

public class Main {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);
        
        if(args[0].equals("somar")) {
            sum(x, y);
        } else if (args[0].equals("subtrair")) {
            sub(x, y);
        } else if(args[0].equals("multiplicar")) {
            mul(x, y);
        } else if(args[0].equals("dividir")) {
            div(x, y);
        } else {
            System.out.println("Opcao invalida!");
        }
    }
    
    static void sum(int x, int y) {
        System.out.println(x + y);
    }
    
    static void sub(int x, int y) {
        System.out.println(x - y);
    }
    
    static void mul(int x, int y) {
        System.out.println(x * y);
    }
    
    static void div(int x, int y) {
        System.out.println(x / y);
    }
}


// SWITCH - CASE

public class Main {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);
        
        switch(args[0]) {
            case "somar":
                sum(x, y);
                break;
            case "subtrair":
                sub(x, y);
                break;
            case "multiplicar":
                mul(x, y);
                break;
            case "dividir":
                div(x, y);
                break;
            default:
                System.out.println("Opcao invalida!");
                break;
        }
    }
    
    static void sum(int x, int y) {
        System.out.println(x + y);
    }
    
    static void sub(int x, int y) {
        System.out.println(x - y);
    }
    
    static void mul(int x, int y) {
        System.out.println(x * y);
    }
    
    static void div(int x, int y) {
        System.out.println(x / y);
    }
}
