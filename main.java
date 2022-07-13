/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Temp;

import java.util.*;

public class main {
    public static void main(String args[])
    {
        FileReader f= new FileReader();         // file reader
        
        ArrayList<Packet> list = new ArrayList<>();         // Abstract list to store the data...
  
        // Use add() method to add elements in the list
        f.fileReader(list);           // read file and store data in the list....
  
        // Displaying the AbstractList
        
        list.sort(new PacketSortHelper());          // sort the list
        
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i).message);      // printin gthe correct message...
        }
        System.out.println();
    }   
}

