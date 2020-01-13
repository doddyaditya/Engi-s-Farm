import javax.swing.*;
/**
 * Kelas Player
 * @author Doddy Aditya W. 13517008
 * @author Moch. Azhar Dhaiulhaq 13517048
 * @author M. Ivan Rahmansyah M. 13517143
 */
public class Player{
    private int Water;
    private int PosX;
    private int PosY;
    private char hadappemain;
    private int Money;
    private Bag Inventory;
    /**
     * Konstruktor Default
     */
    public Player(){
        Water = 0;
        PosX = 0;
        PosY = 0;
        Money = 0;
        hadappemain = 'U';
        Inventory = new Bag();
    }
    /**
     * Konstruktor dengan parameter
     * @param _water input water
     * @param _posX input absis
     * @param _posY input ordinat
     * @param _money input money
     */
    public Player(int _water, int _posX, int _posY, int _money){
        Water = _water;
        PosX = _posX;
        PosY = _posY;
        Money = _money;
        hadappemain = 'U';
        Inventory = new Bag();
    }
    /**
     * Method untuk mengembalikan bag dari player
     * @return Bag 
     */
    public Bag getInventory(){
        return Inventory;
    }
    /**
     * Method untuk mengembalikan PosX
     * @return PosX 
     */
    public int getPosX(){
        return PosX;
    }
    /**
     * Method untuk mengembalikan PosY
     * @return PosY 
     */
    public int getPosY(){
        return PosY;
    }
    /**
     * Method untuk set Water
     * @param angka 
     */
    public void setWater(int angka){
        this.Water = angka;
    }
    /**
     * Method untuk mengembalikan jumlah Water
     * @return Water
     */
    public int getWater(){
        return this.Water;
    }
    /**
     * Method untuk set Money
     * @param angka 
     */
    public void setMoney(int angka){
        this.Money = angka;
    }
    /**
     * Method untuk megembalikan jumlah money
     * @return Money
     */
    public int getMoney(){
        return this.Money;
    }
    /**
     * Method untuk set Hadap dari Player
     * @param hadap 
     */
    public void setHadapPemain(char hadap){
        this.hadappemain = hadap;
    }
    /**
     * Method untuk mendapatkan Hadap dari Player
     * @return hadappemain 
     */
    public char getHadapPemain(){
        return this.hadappemain;
    }
    /**
     * Method untuk Jalan Keatas
     * @param M1 sebagai Map
     * @param T1 sebagai Truck
     * @param lb sebagai ListBinatang
     */
    public void MoveUp(Map<Cell> M1,Truck T1, ListBinatang lb){
        if (M1.getData(this.getPosX() - 1,this.getPosY()).Check() == 4 || M1.getData(this.getPosX()-1,this.getPosY()).Check() == 5 || M1.getData(this.getPosX()-1,this.getPosY()).Check() == 6){
            System.out.println("Ada Fasilitas");
        } else if (getPosX() == 0){
            System.out.println("Notok");
        } else if (lb.exist(this.getPosX() - 1,this.getPosY())){
            System.out.println("Ada Hewan");
        } else {
            this.PosX = this.PosX - 1;
        }
        hadappemain = 'U';
        T1.inctic();
    }
    /**
     * Method untuk Jalan Ke bawah
     * @param M1 sebagai Map
     * @param T1 sebagai Truck
     * @param lb sebagai ListBinatang
     */
    public void MoveDown(Map<Cell> M1,Truck T1, ListBinatang lb){
        if (M1.getData(this.getPosX()+1,this.getPosY()).Check() == 4 || M1.getData(this.getPosX()+1,this.getPosY()).Check() == 5 || M1.getData(this.getPosX()+1,this.getPosY()).Check() == 6){
            System.out.println("Ada Fasilitas");
        } else if(getPosX() == M1.getBrs()-1){
            System.out.println("Notok");
        } else if (lb.exist(this.getPosX() + 1,this.getPosY())){
            System.out.println("Ada Hewan");
        }else {
            this.PosX = this.PosX + 1;
        }
        hadappemain = 'D';
        T1.inctic();
    }
    /**
     * Method untuk Jalan Ke kanan
     * @param M1 sebagai Map
     * @param T1 sebagai Truck
     * @param lb sebagai ListBinatang
     */
    public void MoveRight(Map<Cell> M1,Truck T1, ListBinatang lb){
        if (M1.getData(this.getPosX(),this.getPosY()+1).Check() == 4 || M1.getData(this.getPosX(),this.getPosY()+1).Check() == 5 || M1.getData(this.getPosX(),this.getPosY()+1).Check() == 6){
            System.out.println("Ada Fasilitas");
        } else if (getPosY() == M1.getKol()-1){
            System.out.println("Notok");
        } else if (lb.exist(this.getPosX() ,this.getPosY()+1)){
            System.out.println("Ada Hewan");
        }else {
            this.PosY = this.PosY + 1;
        }
        hadappemain = 'R';
        T1.inctic();
    }
    /**
     * Method untuk Jalan Ke kiri
     * @param M1 sebagai Map
     * @param T1 sebagai Truck
     * @param lb sebagai ListBinatang
     */
    public void MoveLeft(Map<Cell> M1, Truck T1, ListBinatang lb){
        if (M1.getData(this.getPosX(),this.getPosY()-1).Check() == 4 || M1.getData(this.getPosX(),this.getPosY()-1).Check() == 5 || M1.getData(this.getPosX(),this.getPosY()-1).Check() == 6){
            System.out.println("Ada Fasilitas");
        } else if (getPosY() == 0){
            System.out.println("Notok");
        } else if (lb.exist(this.getPosX(),this.getPosY()-1)){
            System.out.println("Ada Hewan");
        }else {
            this.PosY = this.PosY - 1;
        }
        T1.inctic();
        hadappemain = 'L';
    }
    /**
     * Method untuk Print Player
     */
    public void Print(){
        if(hadappemain=='U'){
            System.out.print("PU");
        } else if (hadappemain == 'L'){
            System.out.print("PL");
        } else if (hadappemain == 'R'){
            System.out.print("PR");
        } else {
            System.out.print("PD");
        }
    }
    /**
     * Method untuk Interact dengan object di sekitar player
     * @param M1 sebagai Map
     * @param T1 sebagai Truck
     * @param lb sebagai ListBinatang
     */
    public void Interact(Map<Cell> M1, Truck T1,ListBinatang lb){
        boolean Mixer = false;
        if(getHadapPemain() == 'U'){
            if(lb.exist(this.getPosX() - 1,this.getPosY())){
                lb.Search(this.getPosX() - 1,this.getPosY()).getProduk(getInventory());
            }

            
            else if (M1.getData(this.getPosX() - 1,this.getPosY()).Check() == 6){ // Interaksi dengan well
                //Interaksi dengan Well
                //Jumlah maksimum Air adalah 20
                if (getWater() + 10 < 20){
                    setWater(getWater() + 10);
                } else {
                    setWater(20);
                }
                System.out.println("Water : " + this.getWater());
            } else if (M1.getData(this.getPosX() - 1,this.getPosY()).Check() == 5){ // Interaksi dengan Truck
                if (T1.getTick() >= 5 /* && Cek isi Bag */){
                    //Kosongkan Bag
                    while(!this.getInventory().isEmptyBag()){
                        this.setMoney(this.getMoney() + this.getInventory().getFirstProduct().getHarga());
                        try {
                            this.getInventory().removeProduct(this.getInventory().getFirstProduct().getProductName());
                        } catch(CustomException e){
                            System.out.println(e);
                        }
                    }
                    T1.setTick(0);
                } else {
                    System.out.println("Truck sementara tidak dapat digunakan");
                }
            } else if (M1.getData(this.getPosX() - 1,this.getPosY()).Check() == 4){ // Interaksi dengan Mixer
                Mixer = true;
            }
        } else if (getHadapPemain() =='R'){
            if(lb.exist(this.getPosX() ,this.getPosY()+1)){
                lb.Search(this.getPosX() ,this.getPosY()+1).getProduk(getInventory());
            }

            
            else if (M1.getData(this.getPosX(),this.getPosY()+1).Check() == 6){ // Interaksi dengan well
                //Interaksi dengan Well
                //Jumlah maksimum Air adalah 20
                if (getWater() + 10 < 20){
                    setWater(getWater() + 10);
                } else {
                    setWater(20);
                }
            } else if (M1.getData(this.getPosX(),this.getPosY()+1).Check() == 5){ // Interaksi dengan Truck
                if (T1.getTick() >= 5 /* && Cek isi Bag */){
                    //Kosongkan Bag
                    while(!this.getInventory().isEmptyBag()){
                        this.setMoney(this.getMoney() + this.getInventory().getFirstProduct().getHarga());
                        try {
                            this.getInventory().removeProduct(this.getInventory().getFirstProduct().getProductName());
                        } catch(CustomException e){
                            System.out.println(e);
                        }
                    }
                    T1.setTick(0);
                } else {
                    System.out.println("Truck sementara tidak dapat digunakan");
                }
            } else if (M1.getData(this.getPosX(),this.getPosY()+1).Check() == 4){ // Interaksi dengan Mixer
                Mixer = true;
            }
        } else if (getHadapPemain() == 'L'){
            if(lb.exist(this.getPosX() ,this.getPosY()-1)){
                lb.Search(this.getPosX() ,this.getPosY()-1).getProduk(getInventory());
            }

        
            else if (M1.getData(this.getPosX(),this.getPosY()-1).Check() == 6){ // Interaksi dengan well
                //Interaksi dengan Well
                //Jumlah maksimum Air adalah 20
                if (getWater() + 10 < 20){
                    setWater(getWater() + 10);
                } else {
                    setWater(20);
                }
            } else if (M1.getData(this.getPosX(),this.getPosY()-1).Check() == 5){ // Interaksi dengan Truck
                if (T1.getTick() >= 5 /* && Cek isi Bag */){
                    //Kosongkan Bag
                    while(!this.getInventory().isEmptyBag()){
                        this.setMoney(this.getMoney() + this.getInventory().getFirstProduct().getHarga());
                        try {
                            this.getInventory().removeProduct(this.getInventory().getFirstProduct().getProductName());
                        } catch(CustomException e){
                            System.out.println(e);
                        }
                    }
                    T1.setTick(0);
                } else {
                    System.out.println("Truck sementara tidak dapat digunakan");
                }
            } else if (M1.getData(this.getPosX(),this.getPosY()-1).Check() == 4){ // Interaksi dengan Mixer
                Mixer = true;
            }
        } else if (getHadapPemain() == 'D'){
            if(lb.exist(this.getPosX() + 1,this.getPosY())){
                lb.Search(this.getPosX() + 1,this.getPosY()).getProduk(getInventory());
            }

            
            else if (M1.getData(this.getPosX() + 1,this.getPosY()).Check() == 6){ // Interaksi dengan well
                //Interaksi dengan Well
                //Jumlah maksimum Air adalah 20
                if (getWater() + 10 < 20){
                    setWater(getWater() + 10);
                } else {
                    setWater(20);
                }
            } else if (M1.getData(this.getPosX() + 1,this.getPosY()).Check() == 5){ // Interaksi dengan Truck
                if (T1.getTick() >= 5 /* && Cek isi Bag */){
                    //Kosongkan Bag
                    while(!this.getInventory().isEmptyBag()){
                        this.setMoney(this.getMoney() + this.getInventory().getFirstProduct().getHarga());
                        try {
                            this.getInventory().removeProduct(this.getInventory().getFirstProduct().getProductName());
                        } catch(CustomException e){
                            System.out.println(e);
                        }
                    }
                    T1.setTick(0);
                } else {
                    System.out.println("Truck sementara tidak dapat digunakan");
                }
            } else if (M1.getData(this.getPosX() + 1,this.getPosY()).Check() == 4){ // Interaksi dengan Mixer
                Mixer = true;
            }
        }
        if (Mixer){
                JFrame frame = new JFrame("Interact Mixer");
                ImageIcon menu = new ImageIcon("Menu.png");
                ImageIcon order = new ImageIcon("order.png");
                ImageIcon success = new ImageIcon("centang.png");
                ImageIcon fail = new ImageIcon("x.png");
                JOptionPane.showMessageDialog(frame,"Pilihan Resep : \n1. Rendang Kambing \n2. Rolade Sapi \n3. Sate Domba Telur Bebek \n4. Sate Kelinci Telur Bebek \n5. Martabak Ayam \n6. Bebek Peking\n","Available Recipe",JOptionPane.INFORMATION_MESSAGE,menu);
                String code = JOptionPane.showInputDialog(frame,"Enter Recipe :","Mixing Product",JOptionPane.INFORMATION_MESSAGE,order,null,"").toString();
                int count = 0;
                if (code.equals("Bebek Peking")){
                    if (getInventory().exist("Daging Bebek")){
                        count = count + 1;
                    }
                    if (getInventory().exist("Susu Sapi")){
                        count = count + 1;
                    }
                    if (count != 2){
                        //Gagal
                        JOptionPane.showMessageDialog(frame,"Menu Tidak Dapat Dibuat","Result",JOptionPane.INFORMATION_MESSAGE,fail);
                    } else {
                        //Berhasil
                        try {
                            getInventory().removeProduct("Daging Bebek");
                            getInventory().removeProduct("Susu Sapi");
                            BebekPeking BP = new BebekPeking(25000);
                            getInventory().addProduct(BP);
                        } catch(CustomException e){
                            System.out.println(e);
                        }
                        JOptionPane.showMessageDialog(frame,"Berhasil Membuat Menu","Result",JOptionPane.INFORMATION_MESSAGE,success);
                    }
                } else if (code.equals("Martabak Ayam")){
                    if (getInventory().exist("Telur Bebek")){
                        count = count + 1;
                    }
                    if (getInventory().exist("Daging Ayam")){
                        count = count + 1;
                    }
                    if (count != 2){
                        //Gagal
                        JOptionPane.showMessageDialog(frame,"Menu Tidak Dapat Dibuat","Result",JOptionPane.INFORMATION_MESSAGE,fail);
                    } else {
                        //Berhasil
                        try {
                            getInventory().removeProduct("Telur Bebek");
                            getInventory().removeProduct("Daging Sapi");
                            MartabakAyam MA = new MartabakAyam(23000);
                            getInventory().addProduct(MA);
                        } catch(CustomException e){
                            System.out.println(e);
                        }
                        JOptionPane.showMessageDialog(frame,"Berhasil Membuat Menu","Result",JOptionPane.INFORMATION_MESSAGE,success);
                    }
                    
                } else if (code.equals("Rendang Kambing")){
                    if (getInventory().exist("Daging Kambing")){
                        count = count + 1;
                    }
                    if (getInventory().exist("Susu Kambing")){
                        count = count + 1;
                    }
                    if (count != 2){
                        //Gagal
                        JOptionPane.showMessageDialog(frame,"Menu Tidak Dapat Dibuat","Result",JOptionPane.INFORMATION_MESSAGE,fail);
                    } else {
                        //Berhasil
                        try {
                            getInventory().removeProduct("Daging Kambing");
                            getInventory().removeProduct("Susu Kambing");
                            RendangKambing RK = new RendangKambing(30000);
                            getInventory().addProduct(RK);
                        } catch(CustomException e){
                            System.out.println(e);
                        }
                        JOptionPane.showMessageDialog(frame,"Berhasil Membuat Menu","Result",JOptionPane.INFORMATION_MESSAGE,success);
                    }
                } else if (code.equals("Rolade Sapi")){
                    if (getInventory().exist("Telur Ayam")){
                        count = count + 1;
                    }
                    if (getInventory().exist("Daging Sapi")){
                        count = count + 1;
                    }
                    if (count != 2){
                        //Gagal
                        JOptionPane.showMessageDialog(frame,"Menu Tidak Dapat Dibuat","Result",JOptionPane.INFORMATION_MESSAGE,fail);
                    } else {
                        //Berhasil
                        try {
                            getInventory().removeProduct("Daging Sapi");
                            getInventory().removeProduct("Telur Ayam");
                            RoladeSapi BP = new RoladeSapi(35000);
                            getInventory().addProduct(BP);
                        } catch(CustomException e){
                            System.out.println(e);
                        }
                        JOptionPane.showMessageDialog(frame,"Berhasil Membuat Menu","Result",JOptionPane.INFORMATION_MESSAGE,success);
                    }
                } else if (code.equals("Sate Domba Telur Bebek")){
                    if (getInventory().exist("Daging Domba")){
                        count = count + 1;
                    }
                    if (getInventory().exist("Telur Bebek")){
                        count = count + 1;
                    }
                    if (count != 2){
                        //Gagal
                        JOptionPane.showMessageDialog(frame,"Menu Tidak Dapat Dibuat","Result",JOptionPane.INFORMATION_MESSAGE,fail);
                    } else {
                        //Berhasil
                        try {
                            getInventory().removeProduct("Daging Domba");
                            getInventory().removeProduct("Telur Bebek");
                            SateDombaTelurBebek BP = new SateDombaTelurBebek(40000);
                            getInventory().addProduct(BP);
                        } catch(CustomException e){
                            System.out.println(e);
                        }
                        JOptionPane.showMessageDialog(frame,"Berhasil Membuat Menu","Result",JOptionPane.INFORMATION_MESSAGE,success);
                    }
                } else if (code.equals("Sate Kelinci Telur Bebek")){
                    if (getInventory().exist("Telur Bebek")){
                        count = count + 1;
                    }
                    if (getInventory().exist("Daging Kelinci")){
                        count = count + 1;
                    }
                    if (count != 2){
                        //Gagal
                        JOptionPane.showMessageDialog(frame,"Menu Tidak Dapat Dibuat","Result",JOptionPane.INFORMATION_MESSAGE,fail);
                    } else {
                        //Berhasil
                        try {
                            getInventory().removeProduct("Daging Kelinci");
                            getInventory().removeProduct("Telur Bebek");
                            SateKelinciTelurBebek BP = new SateKelinciTelurBebek(50000);
                            getInventory().addProduct(BP);
                        } catch(CustomException e){
                            System.out.println(e);
                        }
                        JOptionPane.showMessageDialog(frame,"Berhasil Membuat Menu","Result",JOptionPane.INFORMATION_MESSAGE,success);
                    }
                }
                System.out.println(code);
        }
    }
    /**
     * Method untuk Talk dengan binatang di sekitar
     * @param lb sebagai ListBinatang
     * @return String
     */
    public String Talk(ListBinatang lb){
        int PostX = -999;
        int PostY = -999;
        if(getHadapPemain() == 'U'){
            if(lb.exist(this.getPosX() - 1,this.getPosY())){
               PostX = this.getPosX() - 1;
               PostY = this.getPosY();
            }
        }
        else if(getHadapPemain() == 'R'){
            if(lb.exist(this.getPosX() ,this.getPosY()+1)){
                PostX = this.getPosX() ;
               PostY = this.getPosY() +1 ;
            }
        }
        else if(getHadapPemain() == 'L'){
            if(lb.exist(this.getPosX() ,this.getPosY()-1)){
                PostX = this.getPosX() ;
               PostY = this.getPosY()-1;
            }
        }
        else if(getHadapPemain() == 'D'){
            if(lb.exist(this.getPosX() + 1,this.getPosY())){
                PostX = this.getPosX() + 1;
               PostY = this.getPosY();
            }
        }
        if (PostX == -999 && PostY == -999){
            return "Tidak Valid";
        } else {
            return lb.Search(PostX ,PostY).sound();
        }
    }
    /**
     * Method untuk Kill Binatang yang ada di sekitar Player
     * @param lb sebagai ListBinatang
     */
    public void Kill(ListBinatang lb){
        String killedanimal = "nothing";
        if(getHadapPemain() == 'U'){
            if(lb.exist(this.getPosX() - 1,this.getPosY())){
                killedanimal = lb.Search(this.getPosX() - 1,this.getPosY()).getNama();
                lb.hapusbinatang(lb.Search(this.getPosX() - 1,this.getPosY()));
            }
        }
        else if(getHadapPemain() == 'R'){
            if(lb.exist(this.getPosX() ,this.getPosY()+1)){
                killedanimal = lb.Search(this.getPosX(),this.getPosY()+1).getNama();
                lb.hapusbinatang(lb.Search(this.getPosX() ,this.getPosY()+1));
            }
        }
        else if(getHadapPemain() == 'L'){
            if(lb.exist(this.getPosX() ,this.getPosY()-1)){
                killedanimal = lb.Search(this.getPosX(),this.getPosY()-1).getNama();
                lb.hapusbinatang(lb.Search(this.getPosX() ,this.getPosY()-1));
            }
        }
        else if(getHadapPemain() == 'D'){
            if(lb.exist(this.getPosX() + 1,this.getPosY())){
                killedanimal = lb.Search(this.getPosX() +1,this.getPosY()).getNama();
                lb.hapusbinatang(lb.Search(this.getPosX() + 1,this.getPosY()));
            }
        }
        if (killedanimal.equals("Sapi")){
            DagingSapi DS = new DagingSapi(20000);
            try{
                this.getInventory().addProduct(DS);
            } catch(CustomException e){
                System.out.println(e);
            }
        } else if (killedanimal.equals("Kambing")){
            DagingKambing DK = new DagingKambing(15000);
            try{
                this.getInventory().addProduct(DK);
            } catch(CustomException e){
                System.out.println(e);
            }
        } else if (killedanimal.equals("Ayam")){
            DagingAyam DA = new DagingAyam(8000);
            try{
                this.getInventory().addProduct(DA);
            } catch(CustomException e){
                System.out.println(e);
            }
        } else if (killedanimal.equals("Bebek")){
            DagingBebek DB = new DagingBebek(12000);
            try{
                this.getInventory().addProduct(DB);
            } catch(CustomException e){
                System.out.println(e);
            }
        } else if (killedanimal.equals("Domba")){
            DagingDomba DD = new DagingDomba(18000);
            try{
                this.getInventory().addProduct(DD);
            } catch(CustomException e){
                System.out.println(e);
            }
        } else if (killedanimal.equals("Kelinci")){
            DagingKelinci DKe = new DagingKelinci(11000);
            try{
                this.getInventory().addProduct(DKe);
            } catch(CustomException e){
                System.out.println(e);
            }
        }

    }
    /**
     * Method untuk menumbuhkan rumput di petak yang diinjak player
     * @param M1 sebagai Map
     * @param T1 sebagai Truck
     */
    public void Grow(Map<Cell> M1, Truck T1){
        if(getWater() == 0){
            System.out.println("Air habis. Silahkan diisi terlebih dahulu");
        }else if (M1.getData(getPosX(),getPosY()).getGrass()){
            System.out.println("Sudah ada rumput");
        } else {
            setWater(getWater() - 1);
            M1.getData(getPosX(),getPosY()).setGrass(true);
        }
    T1.inctic();
    }

    
}