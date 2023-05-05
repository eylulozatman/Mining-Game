/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mining_game;

/**
 *
 * @author DELL
 */
public class CharControls 
{
   boolean takeBoxExtra = true;

    public boolean isTakeBoxExtra() {
        return takeBoxExtra;
    }

    public void setTakeBoxExtra(boolean takeBoxExtra) {
        this.takeBoxExtra = takeBoxExtra;
    }
   
   
    public void JennyControls(game_screen gs)
    {
        
        
        
        
        if(gs.sh.isbox == true && isTakeBoxExtra() == true)
        {    System.out.print("box true");
            gs.setDiatot(gs.getDiatot()+2);
            gs.getExtralbl().setText("+2 diamont");
             gs.getDialbl().setText(String.valueOf(gs.getDiatot()));
             setTakeBoxExtra(false);
                   
        }
        else if (isTakeBoxExtra() == false)
        {
             gs.getExtralbl().setText("");
        }
        
        java.util.Random x = new java.util.Random();
         int n = 1 + x.nextInt(10);
         int num = 1 + x.nextInt(10);
         String numm = String.valueOf(num);
         
       
        if(gs.count < 3)
        {
            gs.count++;
            if(n <= 5)
            {
                gs.setIrontot(gs.getIrontot() + num); 
                gs.getIronlbl().setText(String.valueOf(gs.getIrontot()));
             
            }
            else if(n <= 8 && n > 5)
            {
                gs.setCoptot(gs.getCoptot() + num);
              gs.getCoplbl().setText(String.valueOf(gs.getCoptot()));
            }
            else
            {
                 gs.setDiatot(gs.getDiatot() + num);
              gs.getDialbl().setText(String.valueOf(gs.getDiatot()));
             
            }
               
        }
    }
    public void JoeControls(game_screen gs)      
    {
        if(gs.sh.isbox == true)
        {
            gs.setDiatot(gs.getDiatot()+2);
            gs.getExtralbl().setText("+2 diamont");
             gs.getDialbl().setText(String.valueOf(gs.getDiatot()));
            
        }
      java.util.Random x = new java.util.Random();
         int n = 1 + x.nextInt(10);
         int num = 1 + x.nextInt(10);
         String numm = String.valueOf(num);
   
       
        if(gs.count < 3)
        {
            gs.count++;
            if(n <= 5)
            {
                 gs.setIrontot(gs.getIrontot() + num); 
                gs.getIronlbl().setText(String.valueOf(gs.getIrontot()));
              
            }
            else if(n < 8 && n > 5)
            {
                gs.setCoptot(gs.getCoptot() + num);
              gs.getCoplbl().setText(String.valueOf(gs.getCoptot()));
            }
            else
            {
                   gs.setDiatot(gs.getDiatot() + num);
              gs.getDialbl().setText(String.valueOf(gs.getDiatot()));
            }
               
        }   
    }
    public void RosieControls(game_screen gs)
    {
        if(gs.sh.isbox == true)
        {
            gs.setDiatot(gs.getDiatot()+2);
            gs.getExtralbl().setText("+2 diamont");
             gs.getDialbl().setText(String.valueOf(gs.getDiatot()));
            
        }
         java.util.Random x = new java.util.Random();
         int n = 1 + x.nextInt(10);
         int num = 1 + x.nextInt(10);
         String numm = String.valueOf(num);
        
      
        if(gs.count < 3)
        {
            gs.count++;
            if(n < 3)
            {
                   gs.setIrontot(gs.getIrontot() + num); 
                gs.getIronlbl().setText(String.valueOf(gs.getIrontot()));
              
            }
            else if(n <= 7 && n >= 3)
            {
                gs.setCoptot(gs.getCoptot() + num);
              gs.getCoplbl().setText(String.valueOf(gs.getCoptot()));
            }
            else
            {
                gs.setDiatot(gs.getDiatot() + num);
              gs.getDialbl().setText(String.valueOf(gs.getDiatot()));
            }
               
        }
    }
    public void MaxControls(game_screen gs)      
    {
        if(gs.sh.isbox == true)
        {
            gs.setDiatot(gs.getDiatot()+2);
            gs.getExtralbl().setText("+2 diamont");
             gs.getDialbl().setText(String.valueOf(gs.getDiatot()));
            
        }
         java.util.Random x = new java.util.Random();
         int n = 1 + x.nextInt(10);
         int num = 1 + x.nextInt(10);
         int dianum = 1 + x.nextInt(12);
         String numm = String.valueOf(num);
  
       
        if(gs.count < 3)
        {
            gs.count++;
            if(n <= 5)
            {
               gs.setIrontot(gs.getIrontot() + num); 
                gs.getIronlbl().setText(String.valueOf(gs.getIrontot()));
            }
            else if(n < 8 && n > 5)
            {
                  gs.setCoptot(gs.getCoptot() + num);
              gs.getCoplbl().setText(String.valueOf(gs.getCoptot()));
            }
            else
            {
                gs.setDiatot(gs.getDiatot() + num);
              gs.getDialbl().setText(String.valueOf(gs.getDiatot()));
            }
               
        }
    }
           
    
}
