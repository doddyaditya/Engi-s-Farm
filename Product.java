public abstract class Product implements Comparable<Product>{
    /**
     * int Harga untuk harga product
     */
    private int Harga; //Harga Product
    /**
     * boolean isFarmProduct untuk validasi FarmProduct
     */
    private boolean isFarmProduct; //Boolean untuk validasi FarmProduct
    /**
     * boolean isFarmProduct untuk validasi FarmProduct
     */
    private boolean isSideProduct; //Boolean untuk validasi SideProduct
    /**
     * Constructor default Product
     */
    public Product(){
        Harga = 0;
        isFarmProduct = false;
        isSideProduct = false;
    }
    //Constructor user defined Product
    /**
     * @param _Harga
     */
    public Product(int _Harga){
        Harga = _Harga;
        isFarmProduct = false;
        isSideProduct = false;
    }
    //Method getter Harga
    /**
     * @return Harga
     */
    public int getHarga(){
        return Harga;
    }
    //Method setter Harga
    /**
     * @param _Harga
     */
    public void setHarga(int _Harga){
        Harga = _Harga;
    }
    //Method setter isFarmProduct
    /**
     * 
     */
    public void setIsFarmProduct(){
        isFarmProduct = true;
    }
    //Method setter isSideProduct
    /**
     * 
     */
    public void setIsSideProduct(){
        isSideProduct = true;
    }
    //Method validasi FarmProduct
    /**
     * @return isFarmProduct
     */
    public boolean IsFarmProduct(){
        return isFarmProduct;
    }
    //Method validasi SideProduct
    /**
     * @return isSideProduct
     */
    public boolean IsSideProduct(){
        return isSideProduct;
    }
    //Method abstrat getter ProductName
    /**
     * @return ProductName
     */
    public abstract String getProductName();
    //Method overriding compareTo agar Product terurut sesuai abjad
    /**
     * Override method compareTo
     */
    @Override
    public int compareTo(Product _Product){
        int l1 = this.getProductName().length(); 
        int l2 = _Product.getProductName().length(); 
        int lmin = Math.min(l1, l2); 
        for (int i = 0; i < lmin; i++) { 
            int str1 = (int)this.getProductName().charAt(i); 
            int str2 = (int)_Product.getProductName().charAt(i);
            if (str1 != str2) { 
                return str1 - str2; 
            } 
        }
        if (l1 != l2) { 
            return l1 - l2; 
        } 
        else { 
            return 0; 
        }
    }
}