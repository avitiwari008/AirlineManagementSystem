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
public class TravelAgent {
    
    
    
    private String customer;
    private AirlinerDirectory airlinerDirectory;
    private CustomerDirectory customerDirectory;

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
  

    
    
    public TravelAgent(){
    airlinerDirectory = new AirlinerDirectory();
    customerDirectory = new CustomerDirectory();
    
    
    }
    
    
    public AirlinerDirectory getAirlinerDirectory() {
        return airlinerDirectory;
    }

    public void setAirlinerDirectory(AirlinerDirectory airlinerDirectory) {
        this.airlinerDirectory = airlinerDirectory;
    }

    

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }
    
    
    
    
    
  /*  public TravelAgent searchFlights(String airlinerName) {
        
        for(TravelAgent p : this.airlinerDirectory) {
            if(p.getModelNumber() == id) {
                return p;
            }
        }
        return null;
    }*/
    
    
    
    
    
    
    
    
    
    
}
