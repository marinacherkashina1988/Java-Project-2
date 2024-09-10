package org.example;

import java.sql.SQLOutput;

public class ZooEcosystem {

    public interface AnimalBehavior {
        public void eat();
        public void sleep();
        public void makeSound();

        abstract class Animal implements AnimalBehavior {
            abstract void displayInformation();
        }

        public class Mammal extends Animal {
            @Override
            public void eat() {}
            public void sleep() {}
            public void makeSound() {}
            void displayInformation() {}
        }

        public class Lion extends Mammal {
            public void eat() {System.out.println("Lions like meat");}
            public void sleep() {System.out.println("Lions sleep any time they want");}
            public void makeSound() {System.out.println("Lion's roar is scary");}
            void displayInformation() {
                eat();
                sleep();
                makeSound();}
        }

        public class Elephant extends Mammal {
            public void eat() {System.out.println("Elephants eat plants");}
            public void sleep() {System.out.println("Elephants sleep in the night");}
            public void makeSound() {System.out.println("Elephant's sound is called a trumpet");}
            void displayInformation() {
                eat();
                sleep();
                makeSound();}
        }

        public class Bird extends Animal {
            @Override
            public void eat() {}
            public void sleep() {}
            public void makeSound() {}
            void displayInformation() {}
        }

        public class Parrot extends Bird {
            public void eat() {System.out.println("Parrots like seeds");}
            public void sleep() {System.out.println("Parrots need a lot of sleep");}
            public void makeSound() {System.out.println("Some parrots can speak");}
            void displayInformation() {
                eat();
                sleep();
                makeSound();}
        }

        public class Eagle extends Bird {
            public void eat() {System.out.println("Eagles hunt and eat their prey");}
            public void sleep() {System.out.println("Eagles sleep at the nest");}
            public void makeSound() {System.out.println("Eagles scream when defending their nests");}

            void displayInformation() {
                eat();
                sleep();
                makeSound();}
        }

        public static void main(String[] args) {

            Lion lion = new Lion();
            lion.displayInformation();
            System.out.println();

            Elephant elephant = new Elephant();
            elephant.displayInformation();
            System.out.println();

            Parrot parrot = new Parrot();
            parrot.displayInformation();
            System.out.println();

            Eagle eagle = new Eagle();
            eagle.displayInformation();

        }
    }
}
