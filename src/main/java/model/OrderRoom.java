/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author ACER
 */
public class OrderRoom {
    
    private Room room;
    private Person person;
    private LocalDate startDate;
    private static int nVIP = 0;
    private static int nCLC = 0;
    private static int nNOR = 0;
    private static int nOrder = 0;
    
    public OrderRoom(){}
    
    public OrderRoom(Person person, Room room, LocalDate startDate)
    {
        this.person = person;
        this.room = room;
        this.startDate = startDate;
        
        if(room.getType().equalsIgnoreCase("VIP")) nVIP++;
        else if (room.getType().equalsIgnoreCase("CLC")) nCLC++;
        else nNOR++;
        
        nOrder++;
    }

    
    public Person getPerson()
    {
        return person;
    }
    
    public Room getRoom()
    {
        return room;
    }
    
    public LocalDate getDate()
    {
        return startDate;
    }
    
    public static int getVIP()
    {
        return nVIP;
    }
    
    public static int getCLC()
    {
        return nCLC;
    }
    
    public static int getNOR()
    {
        return nNOR;
    }
    
    public static int getOrder()
    {
        return nOrder;
    }
    
    public String getInfor()
    {
        return "Ma phong: " + room.getID() + " - Loai phong: " + room.getType() + " - Khach hang: " + person.getName() + " - Ngay thue: " + startDate.toString();
    }
    
}
