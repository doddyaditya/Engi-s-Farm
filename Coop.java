import java.util.*;
/** 
 * Kelas Coop
 * Kelas turunan dari Land
 * Digunakan sebagai peta dari program utama
 * @author Doddy Aditya W. 13517008
 * @author Moch. Azhar Dhaiulhaq 13517048
 * @author M. Ivan Rahmansyah M. 13517143
 */
public class Coop extends Land{
    /**
     * Konstruktor Default
     */
    public Coop(){
        super();
    }
    /**
     * Konstruktor dengan parameter
     * @param X sebagai input absis
     * @param Y sebagai input ordinat
     * @param _statusGrass sebagai input isGrass
     */
    public Coop(int X, int Y, boolean _statusGrass){
        super(X,Y,_statusGrass);
    }
    /**
     * Method untuk mengecek Coop
     * @return 2 
     */
    public int Check(){
        return 2;
    }
    /**
     * Method untuk print Coop
     * @return "* " atau "o " 
     */
    public String toString(){
        if (super.getGrass()){
            return "* ";
        } else {
            return "o ";
        }
    }
    

}