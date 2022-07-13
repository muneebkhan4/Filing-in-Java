package Temp;
import java.util.*;

public class Packet{
    int sequenceNo;     // message and sequnece number
    String message;
    
    public
    Packet(){} 
    
    Packet(int seNo, String mess)
    {
        this.sequenceNo = seNo;
        this.message = mess;
    }   
}

// Helper class extending Compatator interface
class PacketSortHelper implements Comparator<Packet> {
    // Used for sorting in ascending order of
    // roll number
    @Override
    public int compare(Packet a, Packet b)          // helps in comparison...
    {
        return a.sequenceNo - b.sequenceNo;
    }
}
