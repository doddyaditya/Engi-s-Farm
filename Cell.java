import java.util.*;
/** 
 * Kelas Abstrac Cell
 * Kelas ini berfungsi sebagai kelas abstract yang merupakan parent dari kelas Land dan Facilities
 * Digunakan sebagai peta dari program utama
 * @author Doddy Aditya W. 13517008
 * @author Moch. Azhar Dhaiulhaq 13517048
 * @author M. Ivan Rahmansyah M. 13517143
 */
abstract public class Cell{
    private int absis;
    private int ordinat;
    private boolean isGrass;
    /**
    * Constructor Default dari kelas Cell
     */
    public Cell(){
        absis = 0;
        ordinat = 0;
    }
    /**
    * Constructor dengan untuk kelas Cell
    * @param X sebagai absis
    * @param Y sebagai ordinat
    * 
     */
    public Cell(int X, int Y){
        absis = X;
        ordinat = Y;
    }
    /**
        *Setter untuk Absis 
        *@param X sebagai input absis
    */
    public void setAbsis(int X){
        absis = X;
    }
    /**
    * Getter untuk Absis
    * @return absis
     */
    public int getAbsis(){
        return absis;
    }
    /**
        Setter untuk Ordinat 
        * @param Y sebagai input ordinat
    */
    public void setOrdinat(int Y){
        ordinat = Y;
    }
    /**
    * Getter untuk Absis
    * @return ordinat
     */
    public int getOrdinat(){
        return ordinat;
    }
    /**
        Setter untuk grass 
        * @param _status sebagai input boolean Grass
    */
    public void setGrass(boolean _status){
        isGrass = _status;
    }
    /**
    * Getter untuk Absis
    * @return isGrass
     */
    public boolean getGrass(){
        return isGrass;
    }
    /**
    * Method Abstrac untuk mengembalikan sebuah integer yang menandakan dia kelas apa
    * @return integer
     */
    abstract public int Check();
    /**
    * Method abstrac untuk print object dari kelas ini
    * @return String
     */
    abstract public String toString();
}