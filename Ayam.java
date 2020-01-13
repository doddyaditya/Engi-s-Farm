class Ayam extends FarmAnimal implements MeatFarmAnimal,EggFarmAnimal{
    /**
     * Constructor Ayam
     * @param x
     * @param y
     */
    public Ayam(int x,int y){
        super(x,y,"Ayam");
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
	 * @return "PETOKK!!!!!!"
	 */
	public String sound(){
        return "PETOKK!!!!!!";
    }//pure virtual untuk mengeluarkan suara hewan
	/**
	 *
	 */
	void getProduk(Bag Bag1){
        if(getAdaProduk()){
            try {
                TelurAyam ABC = new TelurAyam(5000);
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
     * @return "Daging Ayam"
     */
    public String Daging(){
        return "Daging Ayam";
    }
    /**
     * @return "Telur Ayam"
     */
    public String product(){
        return "Telur Ayam";
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