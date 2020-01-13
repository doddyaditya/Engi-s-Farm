import java.util.*;
/** 
 * Kelas Abstract Land
 * Kelas turunan dari Cell
 * Digunakan sebagai peta dari program utama
 * @author Doddy Aditya W. 13517008
 * @author Moch. Azhar Dhaiulhaq 13517048
 * @author M. Ivan Rahmansyah M. 13517143
 */
abstract public class Land extends Cell{
    /**
     * Konstruktor default dari kelas Land
     */
    public Land(){
        super();
    }
    /**
     * Konstruktor dengan parameter
     * @param X sebagai input absis
     * @param Y sebagai input ordinat
     * @param _statusGrass sebagai input isGrass
     */
    public Land(int X, int Y, boolean _statusGrass){
        super(X,Y);
        super.setGrass(_statusGrass);
    }
    /**
     * Method abstract untuk mengecek jenis cell 
     * @return int
     */
    abstract public int Check();
    /**
     * Method abstract untuk print objek
     * @return String
     */
    abstract public String toString();
}