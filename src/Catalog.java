/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author ostur
 */
public class Catalog {
    private ArrayList<Games> gamesList = new ArrayList<>();
    
    public Catalog(){
        createGames();
    }
    
    public void addGame(Games game){
        gamesList.add(game);
    }
    
    public int catalogSize(){
        return gamesList.size();
    }
    
    public Games getGame(int index){
        return gamesList.get(index);
    }
    
    public String[] getNames(){
        String[] names = new String[gamesList.size()];
        
        for(int i = 0; i < gamesList.size(); i++){
            //names[i] = gamesList.get(i).getName().concat(gamesList.get(i).getPriceString());
            if(gamesList.get(i).getPriceString().length() == 5){
                names[i] = gamesList.get(i).getPriceString().concat("    " + gamesList.get(i).getName());
            }
            else{
                names[i] = gamesList.get(i).getPriceString().concat("      " + gamesList.get(i).getName());
            }
        }
        return names;
    }
    
    public String[] searchResults(String searchString){
        String[] results;
        int resultCount = 0;
        for(int i = 0; i < gamesList.size(); i++){
            if(gamesList.get(i).getName().toLowerCase().contains(searchString.toLowerCase())){
                resultCount++;
            }
        }
        results = new String[resultCount];
        int index = 0;
        for(int i = 0; i < gamesList.size(); i++){
            if(gamesList.get(i).getName().toLowerCase().contains(searchString.toLowerCase())){
                results[index] = gamesList.get(i).getName();
                index++;
            }
        }
        
        for(int i = 0; i < results.length; i++) {
            if(gameByName(results[i]).getPriceString().length() == 5){
                results[i] = gameByName(results[i]).getPriceString().concat("    " + results[i]);
            }
            else {
                results[i] = gameByName(results[i]).getPriceString().concat("      " + results[i]);
            }
        }
        return results;
    }
    
    public Games gameByName(String name){
        
        Games returnGame = null;
        //test
        //System.out.println(name);
        for(int i = 0; i < gamesList.size(); i++){
            if(gamesList.get(i).getName().equals(name)){
                System.out.println(gamesList.get(i).getName());
                returnGame = gamesList.get(i);
            }
        }
        return returnGame;
    }
    
    public int getSize(){
        return gamesList.size();
    }
    
    public ArrayList<Games> getGamesOfTag(ArrayList<Games> current, String tag){
        ArrayList<Games> results = new ArrayList<>();
        
        for(int i = 0; i < current.size(); i++){
            if(current.get(i).getTags().contains(tag)){
                results.add(current.get(i));
            }
        }
        
        return results;
    }
    
    ArrayList<String> test = new ArrayList<>(Arrays.asList("Action","Multiplayer"));
    
    
    public void createGames(){
        gamesList.add(new Games("Fortnite", 24.99,new ArrayList<>(Arrays.asList("Action","Multiplayer"))));
        gamesList.add(new Games("Counter-Strike: Global Offensive", 14.99,new ArrayList<>(Arrays.asList("Action","Multiplayer"))));
        gamesList.add(new Games("Minecraft", 9.99,new ArrayList<>(Arrays.asList("Open World","Multiplayer"))));
        gamesList.add(new Games("Rust", 39.99,new ArrayList<>(Arrays.asList("Open World","Multiplayer"))));
        gamesList.add(new Games("League of Legends", 4.99,new ArrayList<>(Arrays.asList("Strategy","Multiplayer"))));
        gamesList.add(new Games("Monopoly", 9.99,new ArrayList<>(Arrays.asList("Board Game"))));
        gamesList.add(new Games("Tetris", 3.99,new ArrayList<>(Arrays.asList("Board Game"))));
        gamesList.add(new Games("World of Warcraft", 49.99,new ArrayList<>(Arrays.asList("Strategy","Action","Multiplayer"))));
        gamesList.add(new Games("Chess", 14.99,new ArrayList<>(Arrays.asList("Board Game","Strategy"))));
        gamesList.add(new Games("Checkers", 9.99,new ArrayList<>(Arrays.asList("Board Game","Strategy"))));
        gamesList.add(new Games("Battleship", 9.99,new ArrayList<>(Arrays.asList("Board Game","Strategy"))));
        gamesList.add(new Games("Uno", 4.99,new ArrayList<>(Arrays.asList("Board Game"))));
        gamesList.add(new Games("Scrabble", 14.99,new ArrayList<>(Arrays.asList("Board Game","Strategy"))));
        gamesList.add(new Games("Call of Duty", 39.99,new ArrayList<>(Arrays.asList("Action","Multiplayer"))));
        gamesList.add(new Games("Battlefield", 39.99,new ArrayList<>(Arrays.asList("Action","Multiplayer"))));
        gamesList.add(new Games("Life", 19.99,new ArrayList<>(Arrays.asList("Board Game"))));
        gamesList.add(new Games("Sims", 29.99,new ArrayList<>(Arrays.asList("Open World","Singleplayer"))));
        gamesList.add(new Games("Grand Theft Auto", 44.99,new ArrayList<>(Arrays.asList("Action","Multiplayer"))));
        gamesList.add(new Games("Animal Crossing", 14.99,new ArrayList<>(Arrays.asList("Open World","Multiplayer"))));
        gamesList.add(new Games("FIFA 2020", 39.99,new ArrayList<>(Arrays.asList("Sports","Multiplayer"))));
        gamesList.add(new Games("Madden", 34.99,new ArrayList<>(Arrays.asList("Sports","Multiplayer"))));
        gamesList.add(new Games("Halo", 39.99,new ArrayList<>(Arrays.asList("Action","Multiplayer"))));
        gamesList.add(new Games("Mario Kart", 9.99,new ArrayList<>(Arrays.asList("Racing","Multiplayer"))));
    }
}
