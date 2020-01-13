class Domba extends FarmAnimal implements MeatFarmAnimal{
    /**
     * Constructor Domba
     * @param x
     * @param y
     */
    public Domba(int x,int y){
        super(x,y,"Domba");
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
	 * @return "BIRIBIRI!!!!!!"
	 */
	public String sound(){
        return "BIRIBIRI!!!!!!";
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