/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author aviti
 */
public class AirlinerDirectory {
    
    
    private ArrayList<Airliner>airlinerDirect;
    
    
    
    
   public  AirlinerDirectory(){
   
   airlinerDirect = new ArrayList<Airliner>();
   
   
   
   
   
   }

    public ArrayList<Airliner> getAirlinerDirect() {
        return airlinerDirect;
    }
    
    
    
    public Airliner addAirliners() {
        Airliner a = new Airliner();
        airlinerDirect.add(a);
        return a;
    }
    
    public void removeAirliners(Airliner a) {
        airlinerDirect.remove(a);
    }
    
  
    
    
    
}
