package com.company.killoran;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        ArrayList<Pokemon> arrayList = new ArrayList<>();
        //create before game menu
        //1. Continue
        //2. Start New game

        createdPokemon(arrayList);//create a massive list in method
        Person playerInformaion = getPlayerInfo(arrayList); //retrieve player info


        /*create in game menu
        * 1. Battle opponent
        * 2. Check all Pokemon health
        * 3. View beaten/caught pokemon
        * 4. Select single pokemon for next battle
        * 5. Save and Exit
        * */
        exitGameAndSaveData(playerInformaion);//menu item for quitting and saving info to text file.


    }



    public static ArrayList<Pokemon> createdPokemon(ArrayList a)  {

        Pokemon pokemon1 = new Pokemon("Squirtle",Type.WATER);
        Pokemon pokemon2 = new Pokemon("Charmander",Type.FIRE);
        Pokemon pokemon3 = new Pokemon("Bulb",Type.GRASS);
        a.add(pokemon1);
        a.add(pokemon2);
        a.add(pokemon3);
        //writeToFile(a);
        return a;
    }

    public static Person getPlayerInfo(ArrayList<Pokemon> a){
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
            person1 = new Person(name,age, a.get(0));
        }
        if(selection.equals("Charmander")) {
            person1 = new Person(name,age, a.get(1));
        }
        if (selection.equals("Bulb")){
            person1 = new Person(name,age, a.get(2));
        }

        return person1;
    }

    public static void fileCreator() throws IOException {
        File myObj = new File("filename.txt");
        /*System.out.println("Successfully wrote to the file.");
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
        myWriter.write(a.toString());
        myWriter.close();
    }


}