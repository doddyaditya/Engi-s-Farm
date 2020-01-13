import java.util.*;
/** 
 * Kelas Truck
 * Kelas turunan dari Facilities
 * Digunakan sebagai peta dari program utama
 * @author Doddy Aditya W. 13517008
 * @author Moch. Azhar Dhaiulhaq 13517048
 * @author M. Ivan Rahmansyah M. 13517143
 */
public class Truck extends Facilities{
    private int tick;
    /**
     * Konstruktor Default
     */
    public Truck(){
        super();
        tick = 5;
    }
    /**
     * Konstruktor dengan parameter
     * @param X sebagai input absis
     * @param Y sebagai input ordinat
     */
    public Truck(int X, int Y){
        super(X,Y);
        tick = 5;
    }
    /**
     * Method untuk set attribut tick
     * @param angka  sebagai tick
     */
    public void setTick(int angka){
        this.tick = angka;
    }
    /**
     * Method untuk mendapatkan attribute tick
     * @return tick
     */
    public int getTick(){
        return tick;
    }
    /**
     * Method untuk check Truck
     * @return 5 
     */
    public int Check(){
        return 5;
    }
    /**
     * Method untuk print Truck
     * @return "T " 
     */
    public String toString(){
        return "T ";
    }
    /**
     * Method untuk increment tick dari Truck
     */
    public void inctic(){
        this.tick++;
    }
}