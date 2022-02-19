/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.OrderRoom;
import model.Person;
import model.Room;
import java.util.Scanner;
/**
 *
 * @author ACER
 */


public class Application {
    
    private Input input;
    private Output output;
    private Scanner sc;
    
    List<Person> listCustomer = new ArrayList<>();
    List<Room> listRoom = new ArrayList<>();
    List<OrderRoom> listOrder = new ArrayList<>();
    
    public Application()
    {
        input = new Input();
        output = new Output();
        sc = new Scanner(System.in);
    }
    
    public void Run()
    {
        while(true)
        {
            output.showMenu();
            switch(input.numChoice())
            {
                case 1->
                {
                    if(Util.checkEmptyRoom(listRoom))
                    {
                        Room room  = new Room();
                        output.showEmptyRoom(listRoom);
                        boolean soldOut = false;
                        listCustomer.add(input.inputPerson());
                        addCustomer:
                        while(true)
                        {
                            System.out.println("Loai phong (1.VIP, 2.CLC, 3.NOR): ");
                            int choice = Integer.parseInt(sc.nextLine());
                            if(choice == 1)
                            {
                                if(!Util.checkEmptyVIP(listRoom)) System.out.println("Phong VIP da het. Vui long chon lai!!!");
                                else
                                {
                                    soldOut = true;
                                    output.showEmptyRoomVIP(listRoom);
                                    System.out.println("Ma phong: ");
                                    String id = sc.nextLine();
                                    for(Room i : listRoom)
                                    {
                                        if(i.getID().equalsIgnoreCase(id))
                                        {
                                            i.setHavePerson(soldOut);
                                            listOrder.add(input.inputOrder(listCustomer.get(listCustomer.size()-1), room));
                                            break addCustomer;
                                        }
                                    }
                                }

                            }
                            else if(choice == 2)
                            {
                                if(!Util.checkEmptyCLC(listRoom)) System.out.println("Phong CLC da het. Vui long chon lai!!!");
                                else
                                {
                                    soldOut = true;
                                    output.showEmptyRoomCLC(listRoom);
                                    System.out.println("Ma phong: ");
                                    String id = sc.nextLine();
                                    for(Room i : listRoom)
                                    {
                                        if(i.getID().equalsIgnoreCase(id))
                                        {
                                            i.setHavePerson(soldOut);
                                            listOrder.add(input.inputOrder(listCustomer.get(listCustomer.size()-1), room));
                                            break addCustomer;
                                        }
                                    }
                                }
                            }
                            else if(choice == 3)
                            {
                                if(!Util.checkEmptyNor(listRoom)) System.out.println("Phong NOR da het. Vui long chon lai!!!");
                                else
                                {
                                    soldOut = true;
                                    output.showEmptyRoomNOR(listRoom);
                                    System.out.println("Ma phong: ");
                                    String id = sc.nextLine();
                                    for(Room i : listRoom)
                                    {
                                        if(i.getID().equalsIgnoreCase(id))
                                        {
                                            i.setHavePerson(soldOut);
                                            listOrder.add(input.inputOrder(listCustomer.get(listCustomer.size()-1), room));
                                            break addCustomer;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    else System.out.println("Phong da het!!! Hen gap ban lan sau!!!");
                }
                case 2->
                {
                    listRoom.add(input.inputRoom());
                }
                case 3->
                {
                    output.showCustomer(listCustomer);
                }
                case 4->
                {
                    if(listRoom.isEmpty())
                    {
                        System.out.println("Khong da het!!!");
                    }
                    else
                    {
                        System.out.println("Loai phong: ");
                        String type = sc.nextLine();
                        output.showSuitableRoom(listRoom, type);
                    }
                }
                case 5->
                {
                    
                }
                case 6->
                {
                    
                }
                case 0->
                {
                    System.out.println("=".repeat(5) + "Ket thuc chuong trinh" + "=".repeat(5));
                    return;
                }
                default->{
                    System.out.println("Vui long chon lai!!!");
                }
                    
            }
        }
    }
}
