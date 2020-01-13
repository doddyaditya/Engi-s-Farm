public class SideProduct extends Product{
    private String ProductName; //Nama Product
    //Constructor default SideProduct
    /**
     * Constructor default SideProduct
     */
    public SideProduct(){
        setIsSideProduct();
    }
    //Constructor user defined SideProduct
    /**
     * Constructor user defined SideProduct
     * @param _Harga
     */
    public SideProduct(int _Harga){
        setIsSideProduct();
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