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
public class AirlinerScheduleDirectory {
    
    
    private ArrayList<AirlinerSchedule>airlinerScheduleDirect;
    
    
    
    
    public AirlinerScheduleDirectory(){
    
    airlinerScheduleDirect= new ArrayList<AirlinerSchedule>();
    
   
    
    
    
    }

    public ArrayList<AirlinerSchedule> getAirlinerScheduleDirect() {
        return airlinerScheduleDirect;
    }

    public void setAirlinerScheduleDirect(ArrayList<AirlinerSchedule> airlinerScheduleDirect) {
        this.airlinerScheduleDirect = airlinerScheduleDirect;
    }
    
    
    
    
     public AirlinerSchedule addAirlinersschedule() {
        AirlinerSchedule a = new AirlinerSchedule();
        airlinerScheduleDirect.add(a);
        return a;
    }
    
    public void removeAirlinerSchedule(AirlinerSchedule a) {
        airlinerScheduleDirect.remove(a);
    }
    
    
    
    
    
    
    
    
}
