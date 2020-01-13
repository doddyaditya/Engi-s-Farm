import java.util.*;
/** 
 * Kelas Abstract Facilities
 * Kelas turunan dari Cell
 * Digunakan sebagai peta dari program utama
 * @author Doddy Aditya W. 13517008
 * @author Moch. Azhar Dhaiulhaq 13517048
 * @author M. Ivan Rahmansyah M. 13517143
 */
abstract public class Facilities extends Cell{
    /**
     * Konstruktor Default untuk kelas facilities yang memanfaatkan konstruktor Cell
     */
    public Facilities(){
        super();
    }
    /**
     * Konstruktor dengan parameter dari kelas facilities
     * @param X sebagai input absis
     * @param Y sebagai input ordinat
     */
    public Facilities(int X, int Y){
        super(X,Y);
    }
    /**
     * Method abstract untuk mengecek dia termasuk Cell apa
     * @return int 
     */
    abstract public int Check();
    /** 
     * Method Abstract print objek 
     * @return String
     */
    abstract public String toString();
}