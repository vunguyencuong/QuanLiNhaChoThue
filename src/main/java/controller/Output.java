/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import model.Person;
import model.Room;

/**
 *
 * @author ACER
 */
public class Output {
    
    public Output(){}
    
    public void showMenu()
    {
        System.out.println("=".repeat(10) + "Menu" + "=".repeat(10));
        System.out.println("1.Them khach hang thue phong");
        System.out.println("2.Them phong");
        System.out.println("3.Liet ke khach hang");
        System.out.println("4.Liet ke phong co san");
        System.out.println("5.Thong ke");
        System.out.println("6.Ghi lai thong tin thue phong bang ten khach hang");
        System.out.println("7.Sap xep khach hang");
        System.out.println("0.Ket thuc chuong trinh");
    }
    
    public void showChoiceSort()
    {
        System.out.println("=".repeat(25));
        System.out.println("1.Ngay thue");
        System.out.println("2.Ten khach hang");
    }
    
    public void showCustomer(List<Person> listPerson)
    {
        System.out.println("=".repeat(25));
        for(Person i : listPerson)
        {
            System.out.println(i.getInfor());
        }
    }
    
    public void showEmptyRoom(List<Room> listRoom)
    {
        System.out.println("=".repeat(25));
        for(Room i : listRoom)
        {
            if(!i.havePerson()) System.out.println(i.getInfor());
        }
    }
    
    public void showEmptyRoomVIP(List<Room> listRoom)
    {
        System.out.println("=".repeat(25));
        for(Room i : listRoom)
        {
            if(!i.havePerson() && i.getType().equalsIgnoreCase("VIP")) i.getInfor();
        }
    }
    
    public void showEmptyRoomCLC(List<Room> listRoom)
    {
        System.out.println("=".repeat(25));
        for(Room i : listRoom)
        {
            if(!i.havePerson() && i.getType().equalsIgnoreCase("CLC")) i.getInfor();
        }
    }
    
    public void showEmptyRoomNOR(List<Room> listRoom)
    {
        System.out.println("=".repeat(25));
        for(Room i : listRoom)
        {
            if(!i.havePerson() && i.getType().equalsIgnoreCase("NOR")) i.getInfor();
        }
    }
    
    public void showSuitableRoom(List<Room> listRoom, String type)
    {
        System.out.println("=".repeat(25));
        for(Room i : listRoom)
        {
            if(!i.havePerson() && i.getType().equalsIgnoreCase(type)) System.out.println(i.getInfor());
        }
    }
}
