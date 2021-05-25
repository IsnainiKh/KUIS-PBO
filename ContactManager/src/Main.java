
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GF63-9RCX
 */
public class Main {
     public static void main(String [] args){
     
        ContactManager MyContactManager = new ContactManager();
        String name, phoneNumber,email;
      
        name = "Ara";
        phoneNumber = "+628-22-1390";
        email = "ara@gmail.com";
        Contact contact1 = new Contact(name ,email, phoneNumber);
        MyContactManager.addContact(contact1);

        name = "Aka";
        phoneNumber = "+6288-234-567";
        email = "aka@gmail.com";
        Contact contact2 = new Contact(name ,email, phoneNumber);
        MyContactManager.addContact(contact2);
        
        name = "Meow";
        phoneNumber = "+628-444-231";
        email = "meow@gmail.com";
        Contact contact3 = new Contact(name ,email, phoneNumber);
        MyContactManager.addContact(contact3);
        
        name = "Abu";
        phoneNumber = "0452-356-2435";
        email = "abu@gmail.com";
        Contact contact4 = new Contact(name ,email, phoneNumber);
        MyContactManager.addContact(contact4);
        
        name = "Milki";
        phoneNumber = "0348-134-9220";
        email = "milki@gmail.com";
        Contact contact5 = new Contact(name ,email, phoneNumber);
        MyContactManager.addContact(contact5);
       
        do{
        
        Scanner input = new Scanner(System.in);
        System.out.print("Search name   = "); name = input.nextLine();
        name = name.toLowerCase();
        
        Contact result = MyContactManager.searchContact(name);
        if(result == null){
            System.out.println("\n"  + "contact not found" + "\n");
        }
        else{
            System.out.println("looking for " +name+"'s"+ " contact \n");
            System.out.println("Nama    :" + result.getName());
            System.out.println("Nomor   :" + result.getPhoneNumber());
            System.out.println("Email   :" + result.getEmail() + "\n");
        }
        
        char again;
        System.out.print("Search Again? (y/n) : ");
        again = input.next().charAt(0);
        if(again == 'y' || again == 'Y'){
            
        }
        else{
            System.exit(0);
        }
        }while(true);
     
     }
}
