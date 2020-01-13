class Kelinci extends FarmAnimal implements MeatFarmAnimal{
    /**
     * Constructor Kelinci
     * @param x
     * @param y
     */
    public Kelinci(int x,int y){
        super(x,y,"Kelinci");
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
	 * @return "RIBIT!!!!!!"
	 */
	public String sound(){
        return "RIBIT!!!!!!";
    }//pure virtual untuk mengeluarkan suara hewan
	/**
	 *
	 */
	public void getProduk(Bag Bag1){
       System.out.println("Tidak Punya Produk");
    }
    /**
     * @return "Daging Domba"
     */
    public String Daging(){
        return "Daging Domba";
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
            System.out.print("KL");
        }
        else{
            System.out.print("K");
        }
    }    
}