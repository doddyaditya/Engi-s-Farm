class Sapi extends FarmAnimal implements MeatFarmAnimal,MilkFarmAnimal{
    /**
     * Constructor Sapi
     * @param x
     * @param y
     */
    public Sapi(int x,int y){
        super(x,y,"Sapi");
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
	 * @return "MOOOOOOOO!!!!!!"
	 */
	public String sound(){
        return "MOOOOOOOO!!!!!!";
    }//pure virtual untuk mengeluarkan suara hewan
	public void getProduk(Bag Bag1){
        if(getAdaProduk()){
            try {
                SusuSapi ABC = new SusuSapi(5000);
                setAdaProduk(false);
                Bag1.addProduct(ABC);
            } catch (Exception e) {
                System.out.println(e);
            }
        
        }
    }
    /**
     * @return "Susu Sapi"
     */
    public String product(){
        return "Susu Sapi";
    }
    /**
     * @return "Daging Sapi"
     */
    public String Daging(){
        return "Daging Sapi";
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
            System.out.print("SL");
        }
        else{
            System.out.print("S");
        }
    }    
}