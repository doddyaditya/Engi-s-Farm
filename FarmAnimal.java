public abstract class FarmAnimal{
    private int kelaparan;
    private int belumMakan;
    private int posX;
    private int posY;
    private static int n_FarmAnimal ;
    private boolean lapar;
    private String nama;
    private boolean adaProduk;
	/**
	 * Constructor FarmAnimal
	 * @param x
	 * @param y
	 * @param _nama
	 */
	public FarmAnimal(int x,int y,String _nama){
        kelaparan=5;
		belumMakan=0;
		posX=x;
		n_FarmAnimal++;
		posY=y;
		nama=_nama;
		lapar=false;
    }
	// ctor parameter, kelaparan=5
	//setter&getter
	/**
	 * @return kelaparan
	 */
	public int getKelaparan() {
        return kelaparan;
    }
	/**
	 * @param lapar
	 */
	public void setKelaparan(int lapar){
        kelaparan=lapar;
    }
    /**
     * @param _lapar
     */
    public void setLapar(boolean _lapar){
        lapar=_lapar;
    }
    /**
     * @return adaProduk
     */
    public boolean getAdaProduk() {
        return adaProduk;
    }
	/**
	 * @param produk
	 */
	public void setAdaProduk(Boolean produk){
        adaProduk=produk;
    }
	/**
	 * @return belumMakan
	 */
	public int getBelumMakan(){
        return belumMakan;
    }/**
     * @param _belumMakan
     */
    public void setBelumMakan(int _belumMakan){
        belumMakan=_belumMakan;
    }
	/**
	 * @return posX
	 */
	public int getPosX(){
        return posX;
    }
	/**
	 * @return posY
	 */
	public int getPosY(){
        return posY;
    }
	/**
	 * @param x
	 */
	public void setPosX(int x){
        posX=x;
    }
	/**
	 * @param y
	 */
	public void setPosY(int y){
        posY=y;
    }
	/**
	 * @return n_FarmAnimal
	 */
	public static int getN_FarmAnimal(){
        return n_FarmAnimal;
    }
	/**
	 * @return nama
	 */
	public String getNama(){
        return nama;
    }
	/**
	 * 
	 */
	public void cekStatus(){
        System.out.println("Jenis hewan = "+nama);
		System.out.println("Posisi hewan = "+ posX +","+ posY);
		System.out.println("Status Kelaparan= ");
		if(lapar){
			System.out.println("Lapar");
			System.out.println("Waktu Sampai Mati= "+belumMakan);
		}
		else{
			System.out.println("Tidak lapar");
			System.out.println("Waktu Sampai Kelaparan= "+ kelaparan);
		}
    }
    
	/**
	 * 
	 */
	public void update(){
        if(lapar){
			belumMakan-=1;
		}

		else{kelaparan-=1;
			}
		if(kelaparan==0&&!lapar){
			belumMakan=5;
			lapar=true;
		}
    }
    /**
     * @return lapar
     */
    public boolean isLapar(){
        return lapar;
    }
    abstract void moveright();//Pure virtual untuk pergerakan hewan
	abstract void moveup();//Pure virtual untuk pergerakan hewan
	abstract void movedown();//Pure virtual untuk pergerakan hewan
	abstract void moveleft();
	/**
	 * @return String
	 */
	abstract String sound();//pure virtual untuk mengeluarkan suara hewan
	abstract void getProduk(Bag Bag1);
	abstract void makan();//fungsi untuk makan
	abstract void print();
	

}