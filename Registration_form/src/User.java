/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shortcourse
 */
class User {
    
    private int Idno;
    private String name,  address, email , contact, bdate;
    
    public User (int Idno, String name, String address, String email, String contact, String bdate)
    {
            this.Idno = Idno;
            this.name = name;
            this.address = address;
            this.email = email;
            this.contact = contact;
            this.bdate = bdate;
                   
    }
    
    public int getIdno(){
    
    return Idno;
    }
    
    public String getname(){
    
    return name;
    }
    
     public String getaddress(){
    
    return address;
    }
     
    public String getemail(){
    
    return email;
    }
     
    public String getcontact(){
    
    return contact;
    }
     
    
     public String getbdate(){
    
    return bdate;
    
    }
    
}
