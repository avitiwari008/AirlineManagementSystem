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
public class CustomerDirectory {
    
    
    
    private ArrayList<Customer>customerDirect;
    
    
    
    
    
    public CustomerDirectory(){
    
    
    customerDirect=new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomerDirect() {
        return customerDirect;
    }

    public void setCustomerDirect(ArrayList<Customer> customerDirect) {
        this.customerDirect = customerDirect;
    }
    
    
    
    public Customer addcustomerDirect() {
        Customer a = new Customer();
        customerDirect.add(a);
        return a;
    }
    
    public void removecustomerDirect(Customer a) {
        customerDirect.remove(a);
    }
    
    
    
    
    
    
    
    
    
    
}
