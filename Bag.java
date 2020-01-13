import java.util.LinkedList;
import java.util.ListIterator;

class Bag{
    /**
     * Kapasitas maksimum Bag
     */
    private int Capacity; //Kapasitas maksimum Bag
    /**
     * LinkedList of Product
     */
    private LinkedList<Product> Products; //LinkedList of Product
    //Constructor default Bag
    /**
     * Constructor default Bag
     */
    public Bag(){
        Capacity = 15; //Default
        Products = new LinkedList<>();
    }
    //Constructor user defined Bag
    /**
     * Constructor user defined Bag
     * @param _Capacity
     */
    public Bag(int _Capacity){
        Capacity = _Capacity;
        Products = new LinkedList<>();
    }
    //Method untuk mendapatkan kapasitas Bag yang tersisa
    /**
     * @return Capacity
     */
    public int getCapacity(){
        return Capacity;
    }
    //Method untuk validasi apakah Bag tersebut kosong
    /**
     * @return True/False
     */
    public boolean isEmptyBag(){
        return Products.isEmpty();
    }
     /**
     * @param name
     * @return found
     */
    public boolean exist(String name){
        int jumlah = 15 - this.getCapacity();
        boolean found = false;
        for (int i=0 ; i<jumlah; i++){
            if (getBag().get(i).getProductName().equals(name)){
                found = true;
            }
        }
        return found;
    } 
    //Method untuk mendapatkan kuantitas produk tertentu dari dalam Bag
    /**
     * @param _ProductName
     * @return count
     * @throws CustomException
     */
    public int getQuantity(String _ProductName) throws CustomException{
        if(!isEmptyBag()){
            ListIterator<Product> ltr = null;
            int count = 0;
            ltr = Products.listIterator(0);
            while(ltr.hasNext()){
                if(ltr.next().getProductName() == _ProductName){
                    count++;
                }
            }
            if(count==0){
                throw new CustomException("CustomException : Product is not found in bag while getQuantity");
            }
            return count;
        }else{
            throw new CustomException("CustomException : Bag is empty while getQuantity");
        }
    }
    //Method untuk mendapatkan Products
    /**
     * @return Products
     */
    public LinkedList<Product> getBag(){
        return Products;
    }

    /**
     * @return FirstProduct
     */
    public Product getFirstProduct(){
        return (this.getBag().get(0));
    }
    //Method untuk menambahkan sebuah product ke dalam Bag
    /**
     * @param X
     * @throws CustomException
     */
    public void addProduct(Product X) throws CustomException{
        if(Capacity>0){
            Products.add(X);
            Capacity--;
        }else{
            throw new CustomException("CustomException : Insufficient space while addProduct");
        }
    }
    //Method untuk menghapus sebuah product dari dalam Bag
    /**
     * @param _ProductName
     * @throws CustomException
     */
    public void removeProduct(String _ProductName) throws CustomException{
        if(!isEmptyBag()){
            ListIterator<Product> ltr = null;
            int count = 0;
            ltr = Products.listIterator(0);
            boolean found = false;
            while(ltr.hasNext() && !found){
                if(ltr.next().getProductName() == _ProductName){
                    found = true;
                    Products.remove(count);
                    Capacity++;
                }
                count++;
            }
            if(!found){
                throw new CustomException("CustomException : Product is not found in bag while removeProduct");
            }
        }else{
            throw new CustomException("CustomException : Bag is empty while removeProduct");
        }
    }
    //Method overriding print
    /**
     * @return temp
     */
    public String print(){
        String temp = "=================================" + "\n" + "                             INVENTORY                           " + "\n" + "=================================" + "\n";
        if(!isEmptyBag()){
            ListIterator<Product> ltr = null; 
            ltr = Products.listIterator(0);
            int idx = 1;
            while(ltr.hasNext()){
                Product x = ltr.next();
                temp = temp + "[" + Integer.toString(idx) + "] " + "Nama Produk : " + x.getProductName() + "\n";
                if(idx<10){
                    temp = temp + "     " + "Harga Produk : "+ Integer.toString(x.getHarga()) + "\n";
                }else{
                    temp = temp + "        " + "Harga Produk : "+ Integer.toString(x.getHarga()) + "\n";
                }
                idx++;
            }
        } else {
            temp = temp + "Inventory Kosong \n";
        }
        return temp;
    }

    public static void main(String[] args){
        Bag test = new Bag();
        DagingSapi sa = new DagingSapi(2000);
        DagingBebek DB = new DagingBebek(20000);
        try {
            test.addProduct(sa);
            test.addProduct(DB);
            test.removeProduct(test.getFirstProduct().getProductName());
        } catch(CustomException e){
            System.out.println(e);
        }
        if (test.exist("Daging Bebek")){
            System.out.println("Azhar");
        } else {
            System.out.println("Dhiaulhaq");
        }
        System.out.print(test.print());
        
        
        
    }
}