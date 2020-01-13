import java.util.*;
/** 
 * Kelas Mixer
 * Kelas turunan dari Facilities
 * Digunakan sebagai peta dari program utama
 * @author Doddy Aditya W. 13517008
 * @author Moch. Azhar Dhaiulhaq 13517048
 * @author M. Ivan Rahmansyah M. 13517143
 */
public class Mixer extends Facilities{
    /**
     * Konstruktor Default
     */
    public Mixer(){
        super();
    }
    /**
     * Konstruktor dengan parameter
     * @param X input absis
     * @param Y input ordinat
     */
    public Mixer(int X, int Y){
        super(X,Y);
    }
    /**
     * Method untuk cek Mixer
     * @return 4 
     */
    public int Check(){
        return 4;
    }
    /**
     * Method untuk print Mixer
     * @return  "M "
     */
    public String toString(){
        return "M ";
    }
    
}