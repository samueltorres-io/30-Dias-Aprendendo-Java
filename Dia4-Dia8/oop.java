// Crie um objeto Car chamado myCar. Chame os métodos fullThrottle()and speed() no myCarobjeto.

public class Main {
    
    public void fullThottle() {
        System.out.println("Aceleracao total");
    }
    
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }
    
    public static void main(String[] args) {
        Main myCar = new Main();
        
        myCar.fullThottle();
        myCar.speed(160);
        
    }
    
}


// static = significa que ele pode ser acessado sem criar um objeto da classe.
// public = so pode ser acessado por objetos.


// Construtor

public class Main {
    int x;
    
    // Construtor da classe
    public Main() {
        x = 5;
    }
    
    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println(myObj.x);
    }
    
}

// O nome do costrutor e correspondente ao nome da classe;
// O construtor e chamado quando um novo objeto e criado: Main();
// Toda classe tem um construtor! Se não definirmos um, o java cria por padrao, mas nao conseguiremos definir valores iniciais para o objeto.



