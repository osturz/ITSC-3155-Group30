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
        gamesList.add(new Games("Fortnite", 24.99,new ArrayList<>(Arrays.asList("Action","Multiplayer")),"Fortnite is a survival game where 100 players fight against each other in player versus player combat to be the last one standing. It is a fast-paced, action-packed game, not unlike The Hunger Games, where strategic thinking is a must in order to survive."));
        gamesList.add(new Games("Counter-Strike: Global Offensive", 14.99,new ArrayList<>(Arrays.asList("Action","Multiplayer")),"Global Offensive, like prior games in the Counter-Strike series, is an objective-based, multiplayer first-person shooter. ... At the end of each round, players are rewarded based on their individual performance with in-game currency to spend on other weapons or utility in subsequent rounds."));
        gamesList.add(new Games("Minecraft", 9.99,new ArrayList<>(Arrays.asList("Open World","Multiplayer")),"In Minecraft, players explore a blocky, procedurally-generated 3D world, and may discover and extract raw materials, craft tools, build structures or earthworks, and depending on game mode, can fight computer-controlled \"mobs\", as well as either cooperate with or compete against other players in the same world. These modes include a survival mode, in which players must acquire resources to build the world and maintain health, and a creative mode, where players have unlimited resources. Players can modify the game to create new gameplay mechanics, items, and assets."));
        gamesList.add(new Games("Rust", 39.99,new ArrayList<>(Arrays.asList("Open World","Multiplayer")),"The objective of Rust is to survive in the wilderness using gathered or stolen materials. Players must successfully manage their hunger, thirst, and health, or risk dying. Despite the looming threat of bears and wolves, the primary menace is other players due to the game being solely multiplayer. Combat is accomplished through firearms and primitive weapons, such as bows. In addition, vehicles controlled by non-player characters will occasionally roam, attacking heavily-armed players. These can be defeated with persistence. Rust features crafting, though initially limited until the discovery of specific items in the game's open world. To stay protected, players must build bases or join clans to improve their chance of survival. Raiding is a major aspect of Rust and is done more frequently by large clans."));
        gamesList.add(new Games("League of Legends", 4.99,new ArrayList<>(Arrays.asList("Strategy","Multiplayer"))," In League of Legends, players assume the role of a \"champion\" with unique abilities and battle against a team of other player- or computer-controlled champions. The goal is usually to destroy the opposing team's \"Nexus\", a structure that lies at the heart of a base protected by defensive structures, although other distinct game modes exist as well with varying objectives, rules, and maps. Each League of Legends match is discrete, with all champions starting off relatively weak but increasing in strength by accumulating items and experience over the course of the game."));
        gamesList.add(new Games("Monopoly", 9.99,new ArrayList<>(Arrays.asList("Board Game")),"Monopoly is a board game currently published by Hasbro. In the game, players roll two six-sided dice to move around the game board, buying and trading properties, and developing them with houses and hotels. Players collect rent from their opponents, with the goal being to drive them into bankruptcy. Money can also be gained or lost through Chance and Community Chest cards, and tax squares; players can end up in jail, which they cannot move from until they have met one of several conditions."));
        gamesList.add(new Games("Tetris", 3.99,new ArrayList<>(Arrays.asList("Board Game")),"Tetris challenges the player to create complete lines by moving differently-shaped pieces – the tetrominoes, which scroll from the top to bottom of the playing field. The completed lines disappear and grant the player points, and the player can proceed to fill the vacated spaces. The game ends when the playing field is filled to the point that additional pieces can no longer descend. The longer the player can delay this inevitable outcome, the higher their score will be."));
        gamesList.add(new Games("World of Warcraft", 49.99,new ArrayList<>(Arrays.asList("Strategy","Action","Multiplayer")),"World of Warcraft (WoW) is a massively multiplayer online role-playing game (MMORPG) released in 2004 by Blizzard Entertainment. It is the fourth released game set in the Warcraft fantasy universe.[3] World of Warcraft takes place within the Warcraft world of Azeroth, approximately four years after the events at the conclusion of Blizzard's previous Warcraft release, Warcraft III: The Frozen Throne.[4] "));
        gamesList.add(new Games("Chess", 14.99,new ArrayList<>(Arrays.asList("Board Game","Strategy")),"Chess is a two-player strategy board game played on a checkered board with 64 squares arranged in an 8×8 grid."));
        gamesList.add(new Games("Checkers", 9.99,new ArrayList<>(Arrays.asList("Board Game","Strategy")),"Checkers is a group of strategy board games for two players which involve diagonal moves of uniform game pieces and mandatory captures by jumping over opponent pieces."));
        gamesList.add(new Games("Battleship", 9.99,new ArrayList<>(Arrays.asList("Board Game","Strategy")),"Battleship is a strategy type guessing game for two players. It is played on ruled grids (paper or board) on which each player's fleet of ships (including battleships) are marked. The locations of the fleets are concealed from the other player. Players alternate turns calling \"shots\" at the other player's ships, and the objective of the game is to destroy the opposing player's fleet."));
        gamesList.add(new Games("Uno", 4.99,new ArrayList<>(Arrays.asList("Board Game")),"Uno is an American shedding-type card game that is played with a specially printed deck. The game's general principles put it into the Crazy Eights family of card games, and it is similar to the traditional European game Mau-Mau."));
        gamesList.add(new Games("Scrabble", 14.99,new ArrayList<>(Arrays.asList("Board Game","Strategy")),"Scrabble is a word game in which two to four players score points by placing tiles, each bearing a single letter, onto a game board divided into a 15×15 grid of squares. The tiles must form words that, in crossword fashion, read left to right in rows or downward in columns, and be included in a standard dictionary or lexicon."));
        gamesList.add(new Games("Call of Duty", 39.99,new ArrayList<>(Arrays.asList("Action","Multiplayer")),"Call of Duty is a first-person shooter video game franchise published by Activision. Starting out in 2003, it first focused on games set in World War II. However, over time, the series has seen games set in modern times, the midst of the Cold War, futuristic worlds, and outer space. "));
        gamesList.add(new Games("Battlefield", 39.99,new ArrayList<>(Arrays.asList("Action","Multiplayer")),"Battlefield is a series of first-person shooter video games that started out on Microsoft Windows and OS X with Battlefield 1942, which was released in 2002. The series is developed by Swedish company EA DICE and is published by American company Electronic Arts. The series features a particular focus on large maps, teamwork and vehicle warfare. The PC games in the series are mainly focused on online multiplayer."));
        gamesList.add(new Games("Life", 19.99,new ArrayList<>(Arrays.asList("Board Game")),"Life is a board game originally created in 1860 by Milton Bradley, as The Checkered Game of Life. The Game of Life was America's first popular parlor game.[1] The game simulates a person's travels through his or her life, from college to retirement, with jobs, marriage, and possible children along the way. Two to four or six players can participate in one game."));
        gamesList.add(new Games("Sims", 29.99,new ArrayList<>(Arrays.asList("Open World","Singleplayer")),"The games in the Sims series are largely sandbox games, in that they lack any defined goals (except for some later expansion packs and console versions which introduced this gameplay style). The player creates virtual people called \"Sims,\" places them in houses and helps direct their moods and satisfy their desires. Players can either place their Sims in pre-constructed homes or build them themselves. Each successive expansion pack and game in the series augmented what the player could do with their Sims."));
        gamesList.add(new Games("Grand Theft Auto", 44.99,new ArrayList<>(Arrays.asList("Action","Multiplayer")),"The first game encompassed three fictional cities, while subsequent titles tend to emphasise a single setting. Gameplay focuses on an open world where the player can choose missions to progress an overall story, as well as engaging in side activities, all consisting of action-adventure, driving, third-person shooting, carjacking, occasional role-playing, stealth and racing elements. The series focuses on many different protagonists who attempt to rise through the ranks of the criminal underworld, although their motives for doing so vary in each game.s"));
        gamesList.add(new Games("Animal Crossing", 14.99,new ArrayList<>(Arrays.asList("Open World","Multiplayer")),"Animal Crossing[a] is a social simulation video game series developed and published by Nintendo and created by Katsuya Eguchi.[1][2][3] In Animal Crossing, the player character is a human who lives in a village inhabited by various anthropomorphic animals, carrying out various activities such as fishing, bug catching, and fossil hunting. The series is notable for its open-ended gameplay and extensive use of the video game console's internal clock and calendar to simulate real passage of time."));
        gamesList.add(new Games("FIFA 20", 39.99,new ArrayList<>(Arrays.asList("Sports","Multiplayer")),"FIFA 20 is a football simulation video game published by Electronic Arts as part of the FIFA series.[2] It is the 27th installment in the FIFA series, and was released on 27 September 2019 for Microsoft Windows, PlayStation 4, Xbox One, and Nintendo Switch.[3]"));
        gamesList.add(new Games("Madden 20", 34.99,new ArrayList<>(Arrays.asList("Sports","Multiplayer")),"Madden NFL 20 is an American football video game based on the National Football League (NFL), developed by EA Tiburon and published by Electronic Arts. The latest installment in the long-running Madden NFL series, the game was released for PlayStation 4, Xbox One, and Microsoft Windows on August 2, 2019. It features Kansas City Chiefs quarterback Patrick Mahomes as the cover athlete"));
        gamesList.add(new Games("Halo", 39.99,new ArrayList<>(Arrays.asList("Action","Multiplayer")),"Halo is a military science fiction media franchise centered on a series of video games managed and developed by 343 Industries, a division of Xbox Game Studios. Halo was originally developed by Bungie Studios. The series centers on an interstellar war between humanity and an alliance of aliens known as the Covenant. The Covenant, led by their religious leaders called the Prophets, worship an ancient civilization known as the Forerunners, who perished while defeating the parasitic Flood."));
        gamesList.add(new Games("Mario Kart", 9.99,new ArrayList<>(Arrays.asList("Racing","Multiplayer")),"ario Kart[a] is a series of go-kart-style racing video games developed and published by Nintendo as spin-offs from its trademark Super Mario series. The first in the series, Super Mario Kart, was launched in 1992 on the Super Nintendo Entertainment System to critical and commercial success.[1]"));
    }
}
