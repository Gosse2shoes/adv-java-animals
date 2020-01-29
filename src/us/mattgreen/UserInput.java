package us.mattgreen;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {
    public UserInput(ArrayList zoo) {

            System.out.println("What animal do you want to create?");
            System.out.println("1. Cat");
            System.out.println("2. Dog");
            System.out.println("3. Teacher");
            Scanner keyboard = new Scanner(System.in);
            int userPick = keyboard.nextInt();
            switch (userPick) {
                case 1:
                    createCat(zoo);
                    break;
                case 2:
                    createDog(zoo);
                    break;
                case 3:
                    createTeacher(zoo);
                    break;
                default:
                    System.out.println("Not a valid answer");
                    break;
            }
        }

        public static void createCat (ArrayList zoo) {
            boolean good = false;
            int number = -1;
                do{
                    good = true;
                    Scanner keyboard = new Scanner(System.in);
                    System.out.println("How many mice has the cat killed: ");
                    String mice = keyboard.nextLine();
                    try{
                        number = InputTypeVerifier.number(mice);
                    }
                    catch (EmptyInput i){
                        System.out.println("You cannot leave this empty");
                        good = false;
                    }
                    catch (IncorrectInput j){
                        System.out.println("This has to be a whole number");
                        good = false;
                    }
                    System.out.println("What is the cat's name: ");
                    String name = keyboard.nextLine();
                    Cat cat = new Cat(number, name);
                    zoo.add(cat);
                }while (!good);

        }

        public static void createDog (ArrayList zoo) {
            boolean good;
            int number = -1;
            do{
                good = true;
                Scanner keyboard = new Scanner(System.in);
                System.out.println("Is the dog friendly(please enter true or false): ");
                String friend = keyboard.nextLine();
                boolean friendly = false;
                keyboard.nextLine();
                try{
                    friendly = InputTypeVerifier.TorF(friend);
                }catch (EmptyInput i) {
                    System.out.println("You cannot leave this empty");
                    good = false;
                }catch (IncorrectInput j){
                    System.out.println("This has to be a whole number");
                    good = false;
                }
                System.out.println("What is the dog's name: ");
                String name = keyboard.nextLine();
                Dog dog = new Dog(friendly, name);
                zoo.add(dog);
            }while (!good);
        }

        public static void createTeacher (ArrayList zoo) {
            boolean good;
            int number = -1;
            do{
                good = true;
                Scanner keyboard = new Scanner(System.in);
                System.out.println("What is the age of the teacher: ");
                String age = keyboard.nextLine();
                try {
                    number = InputTypeVerifier.number(age);
                }catch(EmptyInput e){
                    System.out.println("You cannot leave this empty");
                    good = false;
                }catch (IncorrectInput i){
                    System.out.println("This has to be a whole number");
                    good = false;
                }
                System.out.println("What is the teacher's name: ");
                String name = keyboard.nextLine();
                Teacher teacher = new Teacher(number, name);
                zoo.add(teacher);
            }while (!good);
        }
    }
