package classes;

public class Polymorphism {
    

    public /*abstract*/ class Animal {
        private String sound = "";

        public Animal(String sound){
            this.sound = sound;
        }

        public void Sound(String sound){
            System.out.println(sound);
        }
    }

    public class Bird extends Animal {
        private String birdSound = "cui";

        public Bird(String birdSound){
            super(birdSound);
            this.birdSound = birdSound;
        }

        @Override
        public void Sound(String birdSound){
            System.out.println(birdSound);
        }
    }

    public class Cat extends Animal {
        private String catSound = "miaw";

        public Cat(String catSound){
            super(catSound);
            this.catSound = catSound;
        }

        @Override
        public void Sound(String catSound){
            System.out.println(catSound);
        }
    }
}
