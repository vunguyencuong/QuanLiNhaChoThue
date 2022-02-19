/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import exception.Invalid;
import java.util.List;
import model.Room;

/**
 *
 * @author ACER
 */


public class Util {
    
    public static void checkPhone(String phone) throws Invalid
    {
        if(!phone.matches("d{10}"))
        {
            throw new Invalid("Sdt khong hop le!");
        }
    }
    
    public static boolean checkType(String type)
    {
        if(type == "SV" || type == "HGD" || type == "DN") return true;
        else return false;
    }
    
    public static void checkName(String name) throws Invalid
    {
        if(name.matches("W\\d"))
        {
            throw new Invalid("Ten khach hang khong hop le!");
        }
    }
    
    public static boolean checkRoom(String typeRoom)
    {
        if(typeRoom == "VIP" || typeRoom == "CLC" || typeRoom == "NOR") return true;
        else return false;
    }

    public static boolean checkEmptyRoom(List<Room> list)
    {
        for(Room i : list)
        {
            if(i.havePerson()) return true;
        }
        return false;
    }
    
    public static boolean checkEmptyVIP(List<Room> list)
    {
        for(Room i : list)
        {
            if(i.havePerson() && i.getType().equalsIgnoreCase("VIP")) return true;
        }
        return false;
    }
    
    public static boolean checkEmptyCLC(List<Room> list)
    {
        for(Room i : list)
        {
            if(i.havePerson() && i.getType().equalsIgnoreCase("CLC")) return true;
        }
        return false;
    }
    
    public static boolean checkEmptyNor(List<Room> list)
    {
        for(Room i : list)
        {
            if(i.havePerson() && i.getType().equalsIgnoreCase("NOR")) return true;
        }
        return false;
    }
   
}


