package Temp;

import java.io.File;  // Import the File class
import java.util.Scanner; // Import the Scanner class to read text files
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.AbstractList;


public class FileReader {
    void fileReader(AbstractList<Packet> list){
        try {
            File myObj = new File("received.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              int sequence_no = myReader.nextInt();
              String message =  myReader.nextLine();
              String newMessage = message.substring(1, message.length());
              
              Packet p = new Packet(sequence_no, newMessage);
              list.add(p);
            }
        
            myReader.close();
        }
        
         catch (FileNotFoundException e) {
         System.out.println("An error occurred.");
         e.printStackTrace();
        }
    }
}
