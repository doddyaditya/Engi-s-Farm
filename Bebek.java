class Bebek extends FarmAnimal implements MeatFarmAnimal,EggFarmAnimal{
    /**
     * Constructor Bebek
     * @param x
     * @param y
     */
    public Bebek(int x,int y){
        super(x,y,"Bebek");
    }
    /**
     *
     */
    public void moveright(){
        setPosY(getPosY()+1);

    }//Pure virtual untuk pergerakan hewan
	/**
	 *
	 */
	public void moveup(){
        setPosX(getPosX()-1);

    }//Pure virtual untuk pergerakan hewan
	/**
	 *
	 */
	public void movedown(){
        setPosX(getPosX()+1);

    }//Pure virtual untuk pergerakan hewan
	/**
	 *
	 */
	public void moveleft(){
        setPosY(getPosY()-1);

    }
	/**
	 * @return "KWEKKWEK!!!!!!"
	 */
	public String sound(){
        return "KWEKKWEK!!!!!!";
    }//pure virtual untuk mengeluarkan suara hewan
	/**
	 *
	 */
	void getProduk(Bag Bag1){
        if(getAdaProduk()){
            try {
                TelurBebek ABC = new TelurBebek(5000);
                setAdaProduk(false);
                Bag1.addProduct(ABC);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        else{
         System.out.println("Tidak Punya Produk");
            }
    }
    /**
     * @return "Telur Bebek"
     */
    public String product(){
        return"Telur Bebek";
    }
    /**
     *@return "Daging Bebek"
     */
    public String Daging(){
        return "Daging Bebek";
    }
	/**
	 *
	 */
	public void makan(){
        setBelumMakan(0);
		setLapar(false);
		setKelaparan(5);
        setAdaProduk(true);
    }
        //fungsi untuk makan
	/**
	 *
	 */
	public void print(){
        if(isLapar()){
            System.out.print("BL");
        }
        else{
            System.out.print("B");
        }
    }    
}