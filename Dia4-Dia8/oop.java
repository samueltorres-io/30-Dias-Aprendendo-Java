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


// Podemos passar parametros para o construtor:

public class Main {
    String name;
    
    // Construtor da classe
    public Main(String newName) {
        name = newName;
    }
    
    public static void main(String[] args) {
        Main myObj = new Main("Samuel Torres Fernandes");
        System.out.println(myObj.name);
    }
    
}


// Encapsulamento (getters e setters)

class Person {
// Quando definirmos a classe Person como public, devemos criar um novo arquivo para essa classe chamado Person.java e escrever essa classe nesse arquivo. Mas para ussar em uma ide online de java basica, podemos apenas criar a classe e deixar que o java anexe um parametro default a essa classe.
    private String name;
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        
        person.setName("Test");
        System.out.println(person.getName());
    }
}



// Heranca

// Heranca (subclasses e superclasses)
// extends para herdar uma classe.

public class Main {
    public static void main(String[] args) {
        Boy samuel = new Boy();
        
        samuel.say("Hello World!");
        
        samuel.setAge(19);
        samuel.say("I am " + samuel.getAge() + " years old.");
        
    }
}

class Person {
    protected String nationality = "Brazilian";
    public void say(String phrase) {
        System.out.println(phrase);
    }
}

class Boy extends Person {
    private int age = 18;
    
    public int getAge() {
        return this.age;
    }
    
    public void setAge(int newAge) {
        this.age = newAge;
    }
}



// Polimorfismo

class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

class Main {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();  // Create a Animal object
    Animal myPig = new Pig();  // Create a Pig object
    Animal myDog = new Dog();  // Create a Dog object
    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
  }
}



abstract class Person {
    
    // O metodo abstrato e declarado dentro do metodo abstrato mas nao tem implementacao nessa classe, apenas em uma subclasse herdada da superclasse. Isso significa que o metodo abstrato nao faz nada, pois a intencao e ele ser implementado na classe herdada.
    public abstract void gritar();
    
    public void dormir() {
        System.out.println("Zzz...");
    }
}

class Man extends Person {
    public void gritar() {
        System.out.println("Homem gritando: Haaaaaaaaaaaa");
    }
}

public class Main {
    public static void main(String[] args) {
        Man samuka = new Man();
        
        samuka.gritar();
        
    }
}
