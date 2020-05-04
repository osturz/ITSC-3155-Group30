
import java.util.*;

/*
 * This class will be for the cart feature
 * and will be in charge of handleing all of the 
 */

/**
 *
 * @author Howard Williams
 */
public class Cart {
    private ArrayList<Games> cart = new ArrayList<>();
    
    public void addToCart(Games game){
        cart.add(game);
        
    }
    
    public void removeFromCart(Games game){
        cart.remove(game);
    }
    
    public double calcValue(){
        double value = 0.0;
        
        for(int i = 0; i < cart.size(); i++){
            value += cart.get(i).getPrice();
        }
        
        return value;
    }
    
    public Games getGame(int i){
        Games g = cart.get(i);
        return g;
    }
    
    public int getSize(){
        return cart.size();
    }
    
    
    
    
}
