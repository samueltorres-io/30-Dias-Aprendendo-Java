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


