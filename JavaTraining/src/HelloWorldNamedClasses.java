/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrei
 */
public class HelloWorldNamedClasses {
    

    // define constants for languages

    //static final int ENGLISH = 0;

    //static final int FRENCH =1;

    //static final int SPANISH =2;



    /**

     * enumeration of languages to prevent bad argument values

     */

    public enum LANGUAGES {ENGLISH, FRENCH,SPANISH}

    

    // Inner interface HelloWorld

    interface HelloWorld {

        public void greet();

        public void greetSomeone(String someone);

    }

    // Method sayHello prints 

    public void sayHello(LANGUAGES language) {



        // Local class EnglishGreetings implemented in the method sayHello()

        class EnglishGreeting implements HelloWorld {

            String name = "world";

            @Override

            public void greet() {

                greetSomeone("world");

            }

            @Override

            public void greetSomeone(String someone) {

                name = someone;

                System.out.println("Hello " + name);

            }

        } // end of EnglishGreeting local class

        // create an EnglishGreeting object/instance 

        HelloWorld englishGreeting = new EnglishGreeting();

        // !!!! create a new local class that greets in French language !!!!

        class frenchGreeting implements HelloWorld{

        

            String name = "tout le monde";

            @Override

            public void greet() {

                greetSomeone("tout le monde");

            }

            @Override

            public void greetSomeone(String someone) {

                name = someone;

                System.out.println("Salut " + name);

            }

        }
        // !!!!! creating a new frenchGreeting object !!!!!!!!
        HelloWorld frenchGreeting = new frenchGreeting();

        // !!!! create a new  local class for Spanish language !!!!

        class spanishGreeting implements HelloWorld{

        

            String name = "mundo";

            @Override

            public void greet() {

                greetSomeone("mundo");

            }

            @Override

            public void greetSomeone(String someone) {

                name = someone;

                System.out.println("Hola, " + name);

            } // end of anonymous class

        }
        //creating a new spanishGreeting object !!!!!!!!!!! 
        HelloWorld spanishGreeting = new spanishGreeting();

        switch (language) {

            case ENGLISH:

                englishGreeting.greet();

                break;

            case FRENCH:

                frenchGreeting.greetSomeone("Fred");

                break;

            case SPANISH:

                spanishGreeting.greet();

                break;

            default:

                System.out.println("You should take Nobel Price!");

                break;

        }

    }

    // main method

    public static void main(String... args) {

        HelloWorldNamedClasses myApp = new HelloWorldNamedClasses();

        myApp.sayHello(LANGUAGES.ENGLISH);

        //myApp.sayHello(LANGUAGES.FRENCH);

        myApp.sayHello(LANGUAGES.SPANISH);

        //myApp.sayHello(10);

        myApp.sayHello(LANGUAGES.SPANISH);

    }            

}

    

