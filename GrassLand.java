import java.util.*;
/** 
 * Kelas GrassLand
 * Kelas turunan dari Land
 * Digunakan sebagai peta dari program utama
 * @author Doddy Aditya W. 13517008
 * @author Moch. Azhar Dhaiulhaq 13517048
 * @author M. Ivan Rahmansyah M. 13517143
 */
public class GrassLand extends Land{
    /**
     * Konstruktor Default
     */
    public GrassLand(){
        super();
    }
    /**
     * Konstruktor dengan parameter
     * @param X sebagai input absis
     * @param Y sebagai input ordinat
     * @param _statusGrass sebagai input isGrass
     */
    public GrassLand(int X, int Y, boolean _statusGrass){
        super(X,Y,_statusGrass);
    }
    /**
     * Method untuk mengecek GrassLand
     * @return 3 
     */
    public int Check(){
        return 3;
    }
    /**
     * Method untuk print GrassLand
     * @return "# " atau "- " 
     */
    public String toString(){
        if (super.getGrass()){
            return "# ";
        } else {
            return "- ";
        }
    }

    
}