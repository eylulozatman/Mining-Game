/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mining_game;

/**
 *
 * @author DELL
 */
public class Screens {
   
    
    
    shop s;
    convert_screen cs;

    public Screens() 
    {
    }

    public shop getS() {
        return s;
    }

    public void setS(shop s) {
        this.s = s;
    }

    public convert_screen getCs() {
        return cs;
    }

    public void setCs(convert_screen cs) {
        this.cs = cs;
    }
    
   
   
    public shop createShopScreen(game_screen gs)
    {
          s = new shop(gs);
          
          return getS();
         
    }
    public convert_screen createcs(game_screen gs)
    {
          cs = new convert_screen(gs);
        
        return getCs();
        
    }
    
    
    
    

   
    
   void  printShopScreen()
    {
       
       s.setVisible(true);
    }
  
   void printConvertScreen()
   {
     
       cs.setVisible(true);
   }
    
}
