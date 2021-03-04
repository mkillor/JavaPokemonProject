package com.company.killoran;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        //create before game menu
        //1. Continue
        //2. Start New game

        createdPokemon();//create a massive pokemonlist stored in arrayList and returned. Use method call and .get to retrieve individual pokemon.
        Person playerInformaion = getPlayerInfo(); //retrieve player info


        /*create in game menu
        * 1. Battle opponent
        * 2. Check all Pokemon health
        * 3. View beaten/caught pokemon
        * 4. Select single pokemon for next battle
        * 5. Save and Exit
        * */
        exitGameAndSaveData(playerInformaion);//menu item for quitting and saving info to text file.


    }



    public static ArrayList<Pokemon> createdPokemon()  {

        ArrayList<Pokemon> pokemonList = new ArrayList<>();
        Pokemon pokemon1 = new Pokemon("Squirtle",Type.WATER);
        Pokemon pokemon2 = new Pokemon("Charmander",Type.FIRE);
        Pokemon pokemon3 = new Pokemon("Bulb",Type.GRASS);

        pokemonList.add(pokemon1);
        pokemonList.add(pokemon2);
        pokemonList.add(pokemon3);

        return pokemonList;
    }

    public static Person getPlayerInfo(){
        Scanner input = new Scanner(System.in);
        Person person1 = null;
        System.out.println("Please input your name: ");
        String name = input.nextLine();
        System.out.println("Please input your age: ");
        int age = input.nextInt();
        input.nextLine();
        System.out.println("Please select your pokemon: Squirtle, Charmander, or Bulb");
        String selection = input.nextLine();
        if(selection.equals("Squirtle")) {
            person1 = new Person(name,age, createdPokemon().get(0));
        }
        if(selection.equals("Charmander")) {
            person1 = new Person(name,age, createdPokemon().get(1));
        }
        if (selection.equals("Bulb")){
            person1 = new Person(name,age, createdPokemon().get(2));
        }

        return person1;
    }

    public static void fileCreator() throws IOException {
        File myObj = new File("filename.txt");
        /*System.out.println("Successfully wrote to the file."); //testing file creation
        if (myObj.createNewFile()) {
            System.out.println("File created: " + myObj.getName());
        } else {
            System.out.println("File already exists.");
        }*/
    }

    public static void exitGameAndSaveData(Object a){
        try {
            fileCreator();
            writeToFile(a);

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void writeToFile(Object a) throws IOException {
        FileWriter myWriter = new FileWriter("filename.txt");
        System.out.println(a);
        myWriter.write(a.toString());
        myWriter.close();
    }


}