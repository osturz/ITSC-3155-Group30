/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author ostur
 * 3 classes so far, Main, Games, and Catalog
 * 
 * Main initializes the Jlist with all games, to later be manipulated by searches or filters
 * 
 * Implemented the sort by price filters so far, need to add category tags to individual games in order to implement the rest
 * 
 * When form window is opened, updates the current display to match the initial catalog, as well as converts Game objects to an array of strings
 * that display the price, and then the game name
 * 
 * Search button will search through the initial catalog for any substring matches, regardless of case
 * 
 * lowToHigh and highToLow will sort whatever the previous shown list of products into the corresponding order
 * 
 * Soon to implement is the category tags, need to make sure once the tags have been searched for, sorting by price will work correctly
 */
public class Main extends javax.swing.JFrame {
    
    private Catalog gameCatalog = new Catalog();
    private ArrayList<Games> currentDisplay = new ArrayList<>();
    private Cart cart = new Cart();
    //private ArrayList<Games> currentResults = new ArrayList<>();
    
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CartPage = new javax.swing.JFrame();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        cartDisplay = new javax.swing.JList<>();
        RemoveFromCart = new javax.swing.JButton();
        cartTotal = new javax.swing.JLabel();
        moreInfoPage = new javax.swing.JFrame();
        GameNameArea = new javax.swing.JLabel();
        GamePrice = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        GameDescrip = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        cartBalance = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        searchTextBox = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        highToLowCheck = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        lowToHighCheck = new javax.swing.JCheckBox();
        multiplayer = new javax.swing.JCheckBox();
        singleplayer = new javax.swing.JCheckBox();
        openworld = new javax.swing.JCheckBox();
        action = new javax.swing.JCheckBox();
        sports = new javax.swing.JCheckBox();
        racing = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        gameDisplay = new javax.swing.JList<>();
        MoreInfo = new javax.swing.JButton();
        addToCart = new javax.swing.JButton();

        CartPage.setMinimumSize(new java.awt.Dimension(500, 500));
        CartPage.setSize(new java.awt.Dimension(500, 500));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Smoke Cart");

        cartDisplay.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(cartDisplay);

        RemoveFromCart.setText("Remove From Cart");
        RemoveFromCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveFromCartActionPerformed(evt);
            }
        });

        cartTotal.setText("Cart: $ 0.00");

        javax.swing.GroupLayout CartPageLayout = new javax.swing.GroupLayout(CartPage.getContentPane());
        CartPage.getContentPane().setLayout(CartPageLayout);
        CartPageLayout.setHorizontalGroup(
            CartPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartPageLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(CartPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CartPageLayout.createSequentialGroup()
                        .addComponent(RemoveFromCart)
                        .addGap(1, 1, 1))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(CartPageLayout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(cartTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        CartPageLayout.setVerticalGroup(
            CartPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CartPageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CartPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cartTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RemoveFromCart)
                .addContainerGap(183, Short.MAX_VALUE))
        );

        moreInfoPage.setMinimumSize(new java.awt.Dimension(500, 350));
        moreInfoPage.setResizable(false);

        GameNameArea.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        GameNameArea.setText("GameName");

        GamePrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        GamePrice.setText("GamePrice");

        GameDescrip.setEditable(false);
        GameDescrip.setBackground(new java.awt.Color(240, 240, 240));
        GameDescrip.setColumns(20);
        GameDescrip.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        GameDescrip.setRows(5);
        GameDescrip.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        GameDescrip.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane3.setViewportView(GameDescrip);

        javax.swing.GroupLayout moreInfoPageLayout = new javax.swing.GroupLayout(moreInfoPage.getContentPane());
        moreInfoPage.getContentPane().setLayout(moreInfoPageLayout);
        moreInfoPageLayout.setHorizontalGroup(
            moreInfoPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(moreInfoPageLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(moreInfoPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GamePrice)
                    .addComponent(GameNameArea))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        moreInfoPageLayout.setVerticalGroup(
            moreInfoPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(moreInfoPageLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(GameNameArea, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GamePrice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Smoke");

        cartBalance.setText("Cart: $0.00");

        jButton1.setText("Visit Cart");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisitCart(evt);
            }
        });

        jLabel3.setText("Search:");

        searchTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextBoxActionPerformed(evt);
            }
        });

        jButton2.setText("Go");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonPressed(evt);
            }
        });

        highToLowCheck.setText("Price: High to Low");
        highToLowCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                highToLowCheckActionPerformed(evt);
            }
        });

        jLabel4.setText("Filters");

        lowToHighCheck.setText("Price: Low to High");
        lowToHighCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lowToHighCheckActionPerformed(evt);
            }
        });

        multiplayer.setText("Multiplayer Capable");
        multiplayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplayerActionPerformed(evt);
            }
        });

        singleplayer.setText("Singleplayer Only");
        singleplayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singleplayerActionPerformed(evt);
            }
        });

        openworld.setText("Open World");

        action.setText("Action");

        sports.setText("Sports");

        racing.setText("Racing");

        jButton3.setText("Apply Filters");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        gameDisplay.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(gameDisplay);

        MoreInfo.setText("More Info");
        MoreInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoreInfoActionPerformed(evt);
            }
        });

        addToCart.setText("Add to Cart");
        addToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))
                            .addComponent(sports))
                        .addGap(58, 58, 58)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(cartBalance)
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(21, 21, 21))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(racing)
                                    .addComponent(jButton3)
                                    .addComponent(highToLowCheck)
                                    .addComponent(action)
                                    .addComponent(openworld)
                                    .addComponent(singleplayer)
                                    .addComponent(multiplayer)
                                    .addComponent(lowToHighCheck))
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(MoreInfo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(addToCart)))))
                        .addGap(0, 141, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cartBalance)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(searchTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2)))
                .addGap(28, 28, 28)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(highToLowCheck)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lowToHighCheck)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(multiplayer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(singleplayer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(openworld)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(action)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sports)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(racing)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MoreInfo)
                            .addComponent(addToCart))))
                .addContainerGap(138, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTextBoxActionPerformed

    private void highToLowCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_highToLowCheckActionPerformed
        if(lowToHighCheck.isSelected()){
            lowToHighCheck.setSelected(false);
        }
    }//GEN-LAST:event_highToLowCheckActionPerformed

    private void addToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartActionPerformed
        // TODO add your handling code here:
        //cart.addToCart(currentDisplay);
        
        if(!(gameDisplay.getSelectedValue() == null)){
            String gameName = gameDisplay.getSelectedValue();
            gameName = despaceGameString(gameName);
            Games selectedGame = gameCatalog.gameByName(gameName);
            
            cart.addToCart(selectedGame);
            cartBalance.setText("Cart: $" + cart.calcValue());
            cartTotal.setText("Cart: $" + cart.calcValue());
        }
        
    }//GEN-LAST:event_addToCartActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for(int i = 0; i < gameCatalog.getSize(); i++){
            currentDisplay.add(gameCatalog.getGame(i));
        }
        
        gameDisplay.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = gameCatalog.getNames();
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        
       
    }//GEN-LAST:event_formWindowOpened

    private void SearchButtonPressed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonPressed
        String searchString = searchTextBox.getText();
        String[] results = gameCatalog.searchResults(searchString);
        gameDisplay.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = results;
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
    }//GEN-LAST:event_SearchButtonPressed

    private void lowToHighCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lowToHighCheckActionPerformed
        
        if(highToLowCheck.isSelected()){
            highToLowCheck.setSelected(false);
        }
        
    }//GEN-LAST:event_lowToHighCheckActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        searchTextBox.setText("");
        
        //reset
        currentDisplay = new ArrayList<>();
        for(int i = 0; i < gameCatalog.getSize(); i++){
            currentDisplay.add(gameCatalog.getGame(i));
        }
        
        //restartJList();
        
        //multiplayer filter
        if(multiplayer.isSelected()){
            currentDisplay = gameCatalog.getGamesOfTag(currentDisplay, "Multiplayer");
            //updateJList();
        }
        
        if(singleplayer.isSelected()){
            currentDisplay = gameCatalog.getGamesOfTag(currentDisplay, "Singleplayer");
            //updateJList();
        }
        
        if(openworld.isSelected()){
            currentDisplay = gameCatalog.getGamesOfTag(currentDisplay, "Open World");
        }
        
        if(action.isSelected()) {
            currentDisplay = gameCatalog.getGamesOfTag(currentDisplay, "Action");
        }
        
        if(sports.isSelected()) {
            currentDisplay = gameCatalog.getGamesOfTag(currentDisplay, "Sports");
        }
        
        if(racing.isSelected()) {
            currentDisplay = gameCatalog.getGamesOfTag(currentDisplay, "Racing");
        }
        
        if(!highToLowCheck.isSelected() && !lowToHighCheck.isSelected()){
            updateJList(currentDisplay);
        }else{
        //restartJList();
        int size = currentDisplay.size();
        
        //if(highToLowCheck.isSelected() || lowToHighCheck.isSelected()){
            
            ArrayList<Games> copy = new ArrayList<>();
            for(int i = 0; i < size; i++){
                copy.add(currentDisplay.get(i));
            }
            PriceCompare priceCompare = new PriceCompare();
            
            if(lowToHighCheck.isSelected()){
                copy.sort(priceCompare);
                
                /*
                for(int i = 0; i < size; i++){
                    newList[i] = copy.get(i).getName();
                }
                */
                
                String[] newList = getNamesAndPrice(copy);
                /*
                jList1.setModel(new javax.swing.AbstractListModel<String>() {
                    String[] strings = newList;
                    public int getSize() { return strings.length; }
                    public String getElementAt(int i) { return strings[i]; }
                });
                */
                updateJList(copy);
            } 
            else {
                copy.sort(priceCompare);
                String[] list = getNamesAndPrice(copy);
                int index = 0;
                String[] realList = new String[list.length];
                for(int i = list.length-1; i >= 0; i--){
                    realList[i] = list[index];
                    index++;
                }
                ArrayList<Games> copy2 = new ArrayList<>();
                
                for(int i = copy.size()-1; i >= 0; i--) {
                    copy2.add(copy.get(i));
                    
                }
                /*
                jList1.setModel(new javax.swing.AbstractListModel<String>() {
                    String[] strings = realList;
                    public int getSize() { return strings.length; }
                    public String getElementAt(int i) { return strings[i]; }
                });
                */
                updateJList(copy2);
            }
            
            
            
        //}
            
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void multiplayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplayerActionPerformed
        // TODO add your handling code here:
        
        if(singleplayer.isSelected()){
            singleplayer.setSelected(false);
        }
    }//GEN-LAST:event_multiplayerActionPerformed

    private void singleplayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singleplayerActionPerformed
        // TODO add your handling code here:
        
        if(multiplayer.isSelected()){
            multiplayer.setSelected(false);
        }
    }//GEN-LAST:event_singleplayerActionPerformed

    private void VisitCart(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisitCart
        String[] gameNames = new String[cart.getSize()];
        CartPage.setVisible(true); 
        for(int i = 0; i < cart.getSize(); i++){
            gameNames[i] = cart.getGame(i).getName();
        } 
        cartDisplay.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = gameNames;
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        
    }//GEN-LAST:event_VisitCart

    private void RemoveFromCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveFromCartActionPerformed
        if(cartDisplay.getSelectedValue() != null){
            String gameName = cartDisplay.getSelectedValue();
            Games selectedGame = gameCatalog.gameByName(gameName);
            
            cart.removeFromCart(selectedGame);
            cartBalance.setText("Cart: $" + cart.calcValue());
            cartTotal.setText("Cart: $" + cart.calcValue());
            
            String[] gameNames = new String[cart.getSize()];
            for(int i = 0; i < cart.getSize(); i++){
                gameNames[i] = cart.getGame(i).getName();
            } 
            cartDisplay.setModel(new javax.swing.AbstractListModel<String>() {
                String[] strings = gameNames;
                public int getSize() { return strings.length; }
                public String getElementAt(int i) { return strings[i]; }
            });
            
        }
    }//GEN-LAST:event_RemoveFromCartActionPerformed

    private void MoreInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoreInfoActionPerformed
        moreInfoPage.setVisible(true);
        if(!(gameDisplay.getSelectedValue() == null)){
            String gameName = gameDisplay.getSelectedValue();
            gameName = despaceGameString(gameName);
            Games selectedGame = gameCatalog.gameByName(gameName);
            
            GameNameArea.setText(selectedGame.getName());
            GamePrice.setText(selectedGame.getPriceString());
            GameDescrip.setText(selectedGame.getDescription());
        }
    }//GEN-LAST:event_MoreInfoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
                //test game menu
                
            }
        });
    }
    
    /*
    public ArrayList<Games> getCurrentResults(){
        int sizeResults = jList1.getModel().getSize();
        String[] stringResults = new String[sizeResults];
        ArrayList<Games> currentGames = new ArrayList<>(sizeResults);
        
        //test
        System.out.println(sizeResults);
        
        
        
        for(int i = 0; i < sizeResults; i++){
            stringResults[i] = jList1.getModel().getElementAt(i);
        }
        
        //test
        for(int i = 0; i < sizeResults; i++){
            System.out.println(stringResults[i]);
        }
        
        
        for(int i = 0; i < sizeResults; i++){
            currentGames.add(gameCatalog.gameByName(stringResults[i]));
        }
        
        return currentGames;
        
    }
    */
    public String[] getNamesAndPrice(ArrayList<Games> list){
        String[] names = new String[list.size()];
        
        for(int i = 0; i < list.size(); i++){
            //names[i] = gamesList.get(i).getName().concat(gamesList.get(i).getPriceString());
            if(list.get(i).getPriceString().length() == 5){
                names[i] = list.get(i).getPriceString().concat("    " + list.get(i).getName());
            }
            else{
                names[i] = list.get(i).getPriceString().concat("      " + list.get(i).getName());
            }
        }
        return names;
    }
    //?
    public void updateJList(ArrayList<Games> dis){
        String[] displayStrings = getNamesAndPrice(dis);

        
        gameDisplay.setModel(new javax.swing.AbstractListModel<String>() {
                String[] strings = displayStrings;
                public int getSize() { return strings.length; }
                public String getElementAt(int i) { return strings[i]; }
        });
    }
    //?
    public void restartJList() {
        gameDisplay.setModel(new javax.swing.AbstractListModel<String>() {
                String[] strings = new String[]{""};
                public int getSize() { return strings.length; }
                public String getElementAt(int i) { return strings[i]; }
        });
    }
    
    public String despaceGameString(String listVal) {
        
        int spaceIndex = listVal.indexOf(" ");
        listVal = listVal.substring(spaceIndex);
        listVal = listVal.trim();
        
        return listVal;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame CartPage;
    private javax.swing.JTextArea GameDescrip;
    private javax.swing.JLabel GameNameArea;
    private javax.swing.JLabel GamePrice;
    private javax.swing.JButton MoreInfo;
    private javax.swing.JButton RemoveFromCart;
    private javax.swing.JCheckBox action;
    private javax.swing.JButton addToCart;
    private javax.swing.JLabel cartBalance;
    private javax.swing.JList<String> cartDisplay;
    private javax.swing.JLabel cartTotal;
    private javax.swing.JList<String> gameDisplay;
    private javax.swing.JCheckBox highToLowCheck;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JCheckBox lowToHighCheck;
    private javax.swing.JFrame moreInfoPage;
    private javax.swing.JCheckBox multiplayer;
    private javax.swing.JCheckBox openworld;
    private javax.swing.JCheckBox racing;
    private javax.swing.JTextField searchTextBox;
    private javax.swing.JCheckBox singleplayer;
    private javax.swing.JCheckBox sports;
    // End of variables declaration//GEN-END:variables
}

class PriceCompare implements Comparator<Games> {
    @Override
    public int compare(Games g1, Games g2){
        if(g1.getPrice() > g2.getPrice()) return 1;
        if(g2.getPrice() > g1.getPrice()) return -1;
        else return 0;
                
    }    
}
