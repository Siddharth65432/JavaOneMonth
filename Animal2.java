public abstract class Animal2{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public abstract void move();

    public abstract void makeSound();

    public void asPet() {
        System.out.println("Can be considered as a pet.");
    }

    public void asProtective() {
        System.out.println("Can be used for protection.");
    }

    public void asBeautiful() {
        System.out.println("Considered beautiful.");
    }

    public void asDangerous() {
        System.out.println("Can be dangerous.");
    }
}

class Dog extends Animal2 {
    @Override
    public void move() {
        System.out.println("Dog is running.");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog is barking.");
    }

    @Override
    public void asPet() {
        super.asPet();
        System.out.println("Loyal and friendly companions.");
    }

    @Override
    public void asProtective() {
        super.asProtective();
        System.out.println("Often used for guarding homes.");
    }
}

class Fish extends Animal2 {
    @Override
    public void move() {
        System.out.println("Fish is swimming.");
    }

    @Override
    public void makeSound() {
        System.out.println("Fish does not make sound.");
    }
}

class Bird extends Animal2 {
    @Override
    public void move() {
        System.out.println("Bird is flying.");
    }

    @Override
    public void makeSound() {
        System.out.println("Bird is chirping.");
    }

    @Override
    public void asBeautiful() {
        super.asBeautiful();
        System.out.println("Known for their colorful plumage and melodious songs.");
    }
}

class Snake extends Animal2 {
    @Override
    public void move() {
        System.out.println("Snake is crawling.");
    }

    @Override
    public void makeSound() {
        System.out.println("Snake hisses.");
    }

    @Override
    public void asDangerous() {
        super.asDangerous();
        System.out.println("Venomous and can pose a threat.");
    }
}

class Deer extends Animal2 {
    @Override
    public void move() {
        System.out.println("Deer is running.");
    }

    @Override
    public void makeSound() {
        System.out.println("Deer is making a gentle call.");
    }

    @Override
    public void asPet() {
        System.out.println("Wild animals, not typically kept as pets.");
    }

    @Override
    public void asDangerous() {
        System.out.println("Can be dangerous if provoked.");
    }

    @Override
    public void asBeautiful() {
        super.asBeautiful();
        System.out.println("Graceful and elegant creatures.");
    }
}

class Tiger extends Animal2 {
    @Override
    public void move() {
        System.out.println("Tiger is prowling.");
    }

    @Override
    public void makeSound() {
        System.out.println("Tiger is roaring.");
    }

    @Override
    public void asDangerous() {
        super.asDangerous();
        System.out.println("Apex predators and should be approached with caution.");
    }
}

     class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Jeremy");
        System.out.println(dog.getName());
        dog.move();
        dog.makeSound();
        dog.asPet();
        dog.asProtective();

        Fish fish = new Fish();
        fish.setName("MariGold");
        System.out.println(fish.getName());
        fish.move();
        fish.makeSound();
        fish.asPet();

        Bird bird = new Bird();
        bird.setName("Ferido");
        System.out.println(bird.getName());
        bird.move();
        bird.makeSound();
        bird.asPet();
        bird.asBeautiful();

        Snake snake = new Snake();
        snake.setName("Python");
        System.out.println(snake.getName());
        snake.move();
        snake.makeSound();
        snake.asDangerous();

        Deer deer = new Deer();
        deer.setName("Kanna");
        System.out.println(deer.getName());
        deer.move();
        deer.makeSound();
        deer.asPet();
        deer.asBeautiful();

        Tiger tiger = new Tiger();
        tiger.setName("Bagheer");
        System.out.println(tiger.getName());
        tiger.move();
        tiger.makeSound();
        tiger.asDangerous();
    }
}