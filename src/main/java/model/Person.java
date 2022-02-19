/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ACER
 */
public class Person {
    public static int nId = 0;
    protected String mkh;
    protected String name;
    protected String address;
    protected String phone;
    protected String type;
    
    public Person(){}
    
    public Person(String name, String address, String phone, String type)
    {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.type = type;
        nId++;
        String res = String.valueOf(nId);
        mkh = "0".repeat(5 - res.length()) + res;
    }
    
    public String getMkh()
    {
        return mkh;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public String getPhone()
    {
        return phone;
    }
    
    public String getType()
    {
        return type;
    }
    
    public String getInfor()
    {
        return "MKH: " + mkh + "  - Ten: " + name + " - Dia chi: " + address + " - SDT: " + phone + " - Loai KH: " + type;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setAddress(String address)
    {
        this.address = address;
    }
    
    public void setPhone(String phone)
    {
        this.phone = phone;
    }
    
    public void setType(String type)
    {
        this.type = type;
    }
}
