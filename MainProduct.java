import java.util.*;
public class MainProduct{
    public static void main(String args[]){
        DagingAyam enak = new DagingAyam(105000);
        MartabakAyam enak2 = new MartabakAyam(11000);
        RendangKambing enak3 = new RendangKambing(15000);
        Bag y = new Bag();
        System.out.println(y.getQuantity("Daging Ayam"));
        y.addProduct(enak2);
        y.addProduct(enak);
        y.addProduct(enak3);
        y.addProduct(enak2);
        System.out.println(y.getQuantity("Daging Ayam"));
        System.out.println(y.getQuantity("Martabak Ayam"));
        System.out.println(y.getQuantity("Rendang Kambing"));
        Collections.sort(y.getBag());
        y.print();
        y.removeProduct("Martabak Ayam");
        y.print();
    } 
}