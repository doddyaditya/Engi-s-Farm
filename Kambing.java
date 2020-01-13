class Kambing extends FarmAnimal implements MeatFarmAnimal,MilkFarmAnimal{
    /**
     * Constructor Kambing
     * @param x
     * @param y
     */
    public Kambing(int x,int y){
        super(x,y,"Kambing");
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
	 *@return "MBEEEEKK!!!!!!"
	 */
	public String sound(){
        return "MBEEEEKK!!!!!!";
    }//pure virtual untuk mengeluarkan suara hewan
	public void getProduk(Bag Bag1){
        if(getAdaProduk()){
            try {
                SusuKambing ABC = new SusuKambing(5000);
                setAdaProduk(false);
                Bag1.addProduct(ABC);
            } catch (Exception e) {
                System.out.println(e);
            }
        
        }
    }
    /**
     * @return "Susu Kambing"
     */
    public String product(){
        return "Susu Kambing";
        
    }
    /**
     * @return "Daging Kambing"
     */
    public String Daging(){
        return "Daging Kambing";
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