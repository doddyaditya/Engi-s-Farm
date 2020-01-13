import java.util.*;
/** 
 * Kelas Well
 * Kelas turunan dari Facilities
 * Digunakan sebagai peta dari program utama
 * @author Doddy Aditya W. 13517008
 * @author Moch. Azhar Dhaiulhaq 13517048
 * @author M. Ivan Rahmansyah M. 13517143
 */
public class Well extends Facilities{
    /**
     * Konstruktor Default
     */
    public Well(){
        super();
    }
    /**
     * Konsturktor dengan parameter
     * @param X sebagai input absis
     * @param Y sebagai input ordinat
     */
    public Well(int X, int Y){
        super(X,Y);
    }
    /**
     * Method untuk check well
     * @return 6
     */
    public int Check(){
        return 6;
    }
    /**
     * Method untuk print Well
     * @return "W " 
     */
        public String toString(){
        return "W ";
    }

}