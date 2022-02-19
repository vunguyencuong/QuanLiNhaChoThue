/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ACER
 */
public class Room {
    public static int nId = 0;
    private String idRoom;
    private String nameRoom;
    private String typeRoom;
    private boolean havePerson;
    
    public Room(){}
    
    public Room(String nameRoom, String typeRoom)
    {
        this.nameRoom = nameRoom;
        this.typeRoom = typeRoom;
        
        nId++;
        String res = String.valueOf(nId);
        idRoom = "0".repeat(3 - res.length()) + res;
        
        havePerson = false;
    }
    
    public String getID()
    {
        return idRoom;
    }
    
    public String getName()
    {
        return nameRoom;
    }
    
    public String getType()
    {
        return typeRoom;
    }
    
    public String getInfor()
    {
        return "Ma Phong: " + idRoom + " - Ten Phong: " + nameRoom + " - Loai Phong: " + typeRoom;
    }
    
    public boolean havePerson()
    {
        return havePerson;
    }
    
    public void setName(String nameRoom)
    {
        this.nameRoom = nameRoom;
    }
    
    public void setType(String typeRoom)
    {
        this.typeRoom = typeRoom;
    }
    
    public void setHavePerson(boolean isHavePerson)
    {
        this.havePerson = isHavePerson;
    }
    
}
