public class FarmProduct extends Product{
    private String ProductName; //Nama Product
    //Constructor default FarmProduct
    /**
     * Constructor default FarmProduct
     */
    public FarmProduct(){
        setIsFarmProduct();
    }
    //Constructor user defined FarmProduct
    /**
     * Constructor user defined FarmProduct
     * @param _Harga
     */
    public FarmProduct(int _Harga){
        setIsFarmProduct();
    }
    //Method setter ProductName
    /**
     * @param _ProductName
     */
    public void setProductName(String _ProductName){
        ProductName = _ProductName;
    }
    //Method getter ProductName
    /**
     * @return ProductName
     */
    public String getProductName(){
        return ProductName;
    }
}