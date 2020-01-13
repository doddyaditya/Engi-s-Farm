import java.util.List;
import java.util.ArrayList;
/**
 * Kelas Generic Map 
 * @author Doddy Aditya W. 13517008
 * @author Moch. Azhar Dhaiulhaq 13517048
 * @author M. Ivan Rahmansyah M. 13517143
 * @param <T> Generik 
 */
public class Map<T> {
    private List<T> Data;
    private int NumKol;
    /**
     * Konstruktor Default
     */
    public Map(){
        Data = new ArrayList<>();
    }
    /**
     * Konstruktor Parameter 
     * @param Kol sebagai input Kolom matriks n*n
     */
    public Map(int Kol){
        NumKol = Kol;
        Data = new ArrayList<>();
    }
    /**
     * Method untuk mendapatkan Kolom Map
     * @return NumKol
     */
    public int getKol(){
        return NumKol;
    }
    /**
     * Method untuk mendapatkan Baris Map
     * @return Data.size()/NumKol
     */
    public int getBrs(){
        return Data.size()/NumKol;
    }
    /**
     * Method untuk menambahkan data pada Map
     * @param _Data sebagai Data
     */
    public void addData(T _Data){
        Data.add(_Data);
    }
    /**
     * Method untuk set Data pada peta dengan koordinat i,j
     * @param i sebagai absis
     * @param j sebagai ordinat
     * @param _Data sebagai data
     */
    public void setData(int i,int j, T _Data){
        int indeks = i*NumKol + j;
        Data.set(indeks,_Data);
    }
    /**
     * Mengambalikan data pada Map dengan koordinat i,j
     * @param i sebagai absis
     * @param j sebagai ordinat
     * @return T sesuai dengan objek yang dimasukkan
     */
    public T getData(int i , int j){
        int indeks = i*NumKol + j;
        return Data.get(indeks);
    }
    /**
     * Method untk print Map
     * @param P1 sebgai player
     */
    public void PrintMap(Player P1){
        for (int i=0; i < getBrs() ; i++){
            for (int j=0; j<getKol(); j++){
                if (P1.getPosX() == i && P1.getPosY() == j){
                    P1.Print();
                } else {
                    System.out.print(this.getData(i,j));
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }


}