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
        gamesList.add(new Games("Fortnite", 24.99,new ArrayList<>(Arrays.asList("Action","Multiplayer")),"Fortnite is a survival game where 100 players fight against each other in player \nversus player combat to be the last one standing. It is a fast-paced, \naction-packed game, not unlike The Hunger Games, where strategic thinking is \na must in order to survive."));
        gamesList.add(new Games("Counter-Strike: Global Offensive", 14.99,new ArrayList<>(Arrays.asList("Action","Multiplayer")),"Global Offensive, like prior games in the Counter-Strike series, is an \nobjective-based, multiplayer first-person shooter. ... At the end of each round, \nplayers are rewarded based on their individual performance with in-game \ncurrency to spend on other weapons or utility in subsequent rounds."));
        gamesList.add(new Games("Minecraft", 9.99,new ArrayList<>(Arrays.asList("Open World","Multiplayer")),"In Minecraft, players explore a blocky, procedurally-generated 3D world, and may \ndiscover and extract raw materials, craft tools, build structures or earthworks, \nand depending on game mode, can fight computer-controlled \"mobs\", \nas well as either cooperate with or compete against other \nplayers in the same world. These modes include a survival mode, \nin which players must acquire resources to build the world \nand maintain health, and a creative mode, where players have unlimited resources. \nPlayers can modify the game to create new gameplay mechanics, items, and assets."));
        gamesList.add(new Games("Rust", 39.99,new ArrayList<>(Arrays.asList("Open World","Multiplayer")),"The objective of Rust is to survive in the wilderness using gathered or stolen materials. \nPlayers must successfully manage their hunger, thirst, and health, or risk dying. \nDespite the looming threat of bears and wolves, the primary menace is other players \ndue to the game being solely multiplayer. \nCombat is accomplished through firearms and primitive weapons, such as bows. \nIn addition, vehicles controlled by non-player characters will occasionally roam, \nattacking heavily-armed players. These can be defeated with persistence. \nRust features crafting, though initially limited until the discovery of \nspecific items in the game's open world. To stay protected, players must build bases or \njoin clans to improve their chance of survival. Raiding is a major aspect of Rust and \nis done more frequently by large clans."));
        gamesList.add(new Games("League of Legends", 4.99,new ArrayList<>(Arrays.asList("Strategy","Multiplayer"))," In League of Legends, players assume the role of a \"champion\" \nwith unique abilities and battle against a team of other player- \nor computer-controlled champions. The goal is usually to destroy the opposing team's \n\"Nexus\", a structure that lies at the heart of a base \nprotected by defensive structures, although other distinct game modes exist \nas well with varying objectives, rules, and maps. \nEach League of Legends match is discrete, with all champions starting off \nrelatively weak but increasing in strength by accumulating items \nand experience over the course of the game."));
        gamesList.add(new Games("Monopoly", 9.99,new ArrayList<>(Arrays.asList("Board Game")),"Monopoly is a board game currently published by Hasbro. \nIn the game, players roll two six-sided dice to move around the game board, \nbuying and trading properties, and developing them with houses and hotels. \nPlayers collect rent from their opponents, \nwith the goal being to drive them into bankruptcy. \nMoney can also be gained or lost through Chance and Community Chest cards, \nand tax squares; players can end up in jail, which they cannot move from \nuntil they have met one of several conditions."));
        gamesList.add(new Games("Tetris", 3.99,new ArrayList<>(Arrays.asList("Board Game")),"Tetris challenges the player to create complete lines by moving \ndifferently-shaped pieces – the tetrominoes, which scroll \nfrom the top to bottom of the playing field. \nThe completed lines disappear and grant the player points, \nand the player can proceed to fill the vacated spaces. The game ends when the \nplaying field is filled to the point that additional pieces can no longer descend. \nThe longer the player can delay this inevitable outcome, \nthe higher their score will be."));
        gamesList.add(new Games("World of Warcraft", 49.99,new ArrayList<>(Arrays.asList("Strategy","Action","Multiplayer")),"World of Warcraft (WoW) is a massively multiplayer online role-playing game (MMORPG) released \nin 2004 by Blizzard Entertainment. It is the fourth released game set in the \nWarcraft fantasy universe.[3] World of Warcraft takes place within the Warcraft world of Azeroth, \napproximately four years after the events at the conclusion of Blizzard's previous Warcraft release, \nWarcraft III: The Frozen Throne.[4] "));
        gamesList.add(new Games("Chess", 14.99,new ArrayList<>(Arrays.asList("Board Game","Strategy")),"Chess is a two-player strategy board game played on \na checkered board with 64 squares arranged in an 8×8 grid."));
        gamesList.add(new Games("Checkers", 9.99,new ArrayList<>(Arrays.asList("Board Game","Strategy")),"Checkers is a group of strategy board games for two players \nwhich involve diagonal moves of uniform game pieces and \nmandatory captures by jumping over opponent pieces."));
        gamesList.add(new Games("Battleship", 9.99,new ArrayList<>(Arrays.asList("Board Game","Strategy")),"Battleship is a strategy type guessing game for two players. \nIt is played on ruled grids (paper or board) on which each player's \nfleet of ships (including battleships) are marked. \nThe locations of the fleets are concealed from the other player. \nPlayers alternate turns calling \"shots\" at the other player's ships, \nand the objective of the game is to destroy the opposing player's fleet."));
        gamesList.add(new Games("Uno", 4.99,new ArrayList<>(Arrays.asList("Board Game")),"Uno is an American shedding-type card game that is played \nwith a specially printed deck. The game's general principles put it into the \nCrazy Eights family of card games, and it is similar to the \ntraditional European game Mau-Mau."));
        gamesList.add(new Games("Scrabble", 14.99,new ArrayList<>(Arrays.asList("Board Game","Strategy")),"Scrabble is a word game in which two to four players score points by \nplacing tiles, each bearing a single letter, onto a game board \ndivided into a 15×15 grid of squares. The tiles must form \nwords that, in crossword fashion, read left to right in rows or \ndownward in columns, and be included in a standard dictionary or lexicon."));
        gamesList.add(new Games("Call of Duty", 39.99,new ArrayList<>(Arrays.asList("Action","Multiplayer")),"Call of Duty is a first-person shooter video game franchise published by Activision. \nStarting out in 2003, it first focused on games set in World War II. However, over time, \nthe series has seen games set in modern times, the midst of the Cold War, \nfuturistic worlds, and outer space. "));
        gamesList.add(new Games("Battlefield", 39.99,new ArrayList<>(Arrays.asList("Action","Multiplayer")),"Battlefield is a series of first-person shooter video games that started out \non Microsoft Windows and OS X with Battlefield 1942, which was released in 2002. \nThe series is developed by Swedish company EA DICE and is published by \nAmerican company Electronic Arts. The series features a particular focus on large maps, \nteamwork and vehicle warfare. The PC games in the series are mainly \nfocused on online multiplayer."));
        gamesList.add(new Games("Life", 19.99,new ArrayList<>(Arrays.asList("Board Game")),"Life is a board game originally created in 1860 by Milton Bradley, \nas The Checkered Game of Life. The Game of Life was America's first \npopular parlor game.[1] The game simulates a person's travels through his or her life, \nfrom college to retirement, with jobs, marriage, and possible children along the way. \nTwo to four or six players can participate in one game."));
        gamesList.add(new Games("Sims", 29.99,new ArrayList<>(Arrays.asList("Open World","Singleplayer")),"The games in the Sims series are largely sandbox games, \nin that they lack any defined goals (except for some later expansion packs and \nconsole versions which introduced this gameplay style). The player creates virtual people \ncalled \"Sims,\" places them in houses and helps direct their moods and satisfy their desires. \nPlayers can either place their Sims in pre-constructed homes or build them themselves. \nEach successive expansion pack and game in the series augmented what the \nplayer could do with their Sims."));
        gamesList.add(new Games("Grand Theft Auto", 44.99,new ArrayList<>(Arrays.asList("Action","Multiplayer")),"The first game encompassed three fictional cities, while subsequent \ntitles tend to emphasise a single setting. Gameplay focuses on an open world where \nthe player can choose missions to progress an overall story, \nas well as engaging in side activities, all consisting of action-adventure, \ndriving, third-person shooting, carjacking, occasional role-playing, stealth and racing elements. \nThe series focuses on many different protagonists who attempt to rise \nthrough the ranks of the criminal underworld, although their motives for \ndoing so vary in each game.s"));
        gamesList.add(new Games("Animal Crossing", 14.99,new ArrayList<>(Arrays.asList("Open World","Multiplayer")),"Animal Crossing[a] is a social simulation video game series developed \nand published by Nintendo and created by Katsuya Eguchi. \nIn Animal Crossing, the player character is a human who lives in a village \ninhabited by various anthropomorphic animals, carrying out various activities such as fishing, bug catching, \nand fossil hunting. The series is notable for its open-ended gameplay and extensive use of \nthe video game console's internal clock and calendar to simulate real passage of time."));
        gamesList.add(new Games("FIFA 20", 39.99,new ArrayList<>(Arrays.asList("Sports","Multiplayer")),"FIFA 20 is a football simulation video game published by \nElectronic Arts as part of the FIFA series.[2] It is the 27th installment in the \nFIFA series, and was released on 27 September 2019 for Microsoft Windows, \nPlayStation 4, Xbox One, and Nintendo Switch.[3]"));
        gamesList.add(new Games("Madden 20", 34.99,new ArrayList<>(Arrays.asList("Sports","Multiplayer")),"Madden NFL 20 is an American football video game based on the \nNational Football League (NFL), developed by EA Tiburon and published by Electronic Arts. \nThe latest installment in the long-running Madden NFL series, \nthe game was released for PlayStation 4, Xbox One, and Microsoft Windows on August 2, 2019. \nIt features Kansas City Chiefs quarterback Patrick Mahomes as the cover athlete"));
        gamesList.add(new Games("Halo", 39.99,new ArrayList<>(Arrays.asList("Action","Multiplayer")),"Halo is a military science fiction media franchise centered on a series of \nvideo games managed and developed by 343 Industries, a division of Xbox Game Studios. \nHalo was originally developed by Bungie Studios. The series centers on an interstellar war between \nhumanity and an alliance of aliens known as the Covenant. The Covenant, \nled by their religious leaders called the Prophets, worship an ancient civilization known as the Forerunners, \nwho perished while defeating the parasitic Flood."));
        gamesList.add(new Games("Mario Kart", 9.99,new ArrayList<>(Arrays.asList("Racing","Multiplayer")),"ario Kart[a] is a series of go-kart-style racing video games developed and published by Nintendo \nas spin-offs from its trademark Super Mario series. The first in the series, \nSuper Mario Kart, was launched in 1992 on the Super Nintendo Entertainment System to \ncritical and commercial success.[1]"));
    }
}
