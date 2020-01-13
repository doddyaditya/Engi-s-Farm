import java.util.*;
public class Barn extends Land{
    /**
     * Constructor default Barn
     */
    public Barn(){
        super();
    }

    /**
     * Constructor user defined Barn
     * @param X
     * @param Y
     * @param _statusGrass
     */
    public Barn(int X, int Y, boolean _statusGrass){
        super(X,Y,_statusGrass);
    }
    /**
     * @return 1
     */
    public int Check(){
        return 1;
    }
    /**
     * @return "@ " or "x "
     */
    public String toString(){
        if (super.getGrass()){
            return "@ ";
        } else {
            return "x ";
        }
    }
    public static void main (String[] args){
        Barn B1 = new Barn(2,1,true);
        System.out.println(B1);
    }
}