/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author aviti
 */
public class Airliner {
    private String airlinerName;
    private int airlinerID;
    private int airlinerPhonenumber;
    private String airlinerDescription;

    public String getAirlinerDescription() {
        return airlinerDescription;
    }

    public void setAirlinerDescription(String airlinerDescription) {
        this.airlinerDescription = airlinerDescription;
    }

    public void setAirlinerID(int airlinerID) {
        this.airlinerID = airlinerID;
    }

    public int getAirlinerID() {
        return airlinerID;
    }

    public String getAirlinerName() {
        return airlinerName;
    }

    public void setAirlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }

    

    public int getAirlinerPhonenumber() {
        return airlinerPhonenumber;
    }

    public void setAirlinerPhonenumber(int airlinerPhonenumber) {
        this.airlinerPhonenumber = airlinerPhonenumber;
    }
    
    @Override
    public String toString() {
        return airlinerName;
    }
    
}
