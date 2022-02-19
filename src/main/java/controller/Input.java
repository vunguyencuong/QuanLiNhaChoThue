/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.Scanner;
import java.util.List;
import model.Person;
import model.Room;
import model.OrderRoom;
import controller.Util;
import exception.Invalid;
import java.time.LocalDate;
/**
 *
 * @author ACER
 */
public class Input {
    private Scanner sc;
    private Output output;
    
    public Input()
    {
        this.sc = new Scanner(System.in);
        this.output = new Output();
    }
    
    
    public Person inputPerson()
    {
        String name, address, phone, type;
        
        while(true)
        {
            System.out.print("Ten khach hang: ");
            name = sc.nextLine();
            try{
                Util.checkName(name);
                break;
            } catch(Invalid e)
            {
                System.out.println(e.getMessage());
                System.out.println("Vui long nhap lai!!!");
            }
        }
        
        System.out.print("Dia chi: ");
        address = sc.nextLine();
        
        while(true)
        {
            System.out.print("So dien thoai: ");
            phone = sc.nextLine();
            try {
                Util.checkPhone(phone);
                break;
            } catch(Invalid e){
                System.out.println(e.getMessage());
                System.out.println("Vui long nhap lai!!!");
            }  
        }
        
        while(true)
        {
            System.out.print("Loai khac hang (SV-Sinh vien, HGD-Ho gia dinh, DN-Doanh nghiep): ");
            type = sc.nextLine();
            if(Util.checkType(type)) break;
            else System.out.println("Vui long nhap lai!!!");
        }
        
        return new Person(name, address, phone, type);
    }
    
    public Room inputRoom()
    {
        String name, type;
        
        System.out.print("Ten phong: ");
        name = sc.nextLine();
        
        while(true)
        {
            System.out.print("Loai phong (VIP, CLC, NOR): ");
            type = sc.nextLine();
            if(Util.checkRoom(type)) break;
            else System.out.println("Vui long nhap lai!!!");
        }
        
        return new Room(name,type);
    }
    
    
    public OrderRoom inputOrder(Person person, Room room)
    {
        LocalDate date = LocalDate.now();
        return new OrderRoom(person,room,date);
    }
    
    
    
    
    public int numChoice()
    {
        return Integer.parseInt(sc.nextLine());
    }

}
