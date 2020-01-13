import java.util.*;
class ListBinatang{
    private List<FarmAnimal> listBinatang ;
    /**
     * Constructor ListBinatang
     */
    ListBinatang(){
        listBinatang=new ArrayList<FarmAnimal>();
    }
    /**
     * @param a
     */
    public void add(FarmAnimal a){
        listBinatang.add(a);
    }
    /**
     * @param a
     */
    public void hapusbinatang(FarmAnimal a){
        listBinatang.remove(a);
    }
    /**
     * @return True/False
     */
    public boolean checkEmpty(){
        return listBinatang.isEmpty();
    }
    /**
     * @param x
     * @param y
     * @return a
     */
    public boolean exist(int x,int y){
        boolean a=false;
        int i=0;
        while(i<listBinatang.size()&&!a){
            if(listBinatang.get(i).getPosX()==x&&listBinatang.get(i).getPosY()==y){
                a=true;
               break;
            }
            i++;
        }
        return a;
    }
    /**
     * @param x
     * @param y
     * @return null or Binatang
     */
    public FarmAnimal Search(int x,int y){
        boolean a=false;
        int i=0;
        while(i<listBinatang.size()&&!a){
            if(listBinatang.get(i).getPosX()==x&&listBinatang.get(i).getPosY()==y){
                a=true;
               break;
            }
            i++;
        }
        if(!a){
            return null;
        }
        else{
            return listBinatang.get(i);
        }
        
    }
    /**
     * @param Map1
     * @param P1
     */
    public void updateHewan(Map<Cell> Map1,Player P1){
        for(int i =0; i<listBinatang.size();i++){
            listBinatang.get(i).update();
            Random r = new Random();
            int x;
            x=r.nextInt((5 - 0) + 1) + 0;
            switch(x){
                case 0:
                    if(!exist(listBinatang.get(i).getPosX()-1, listBinatang.get(i).getPosY())&&listBinatang.get(i).getPosX()!=0&&listBinatang.get(i).getPosX()-1!=P1.getPosX()&&Map1.getData(listBinatang.get(i).getPosX()- 1,listBinatang.get(i).getPosY()).Check() == 6 ){
                       
                    listBinatang.get(i).moveup();
                    }
                    break;

                case 1:
                if(!exist(listBinatang.get(i).getPosX()+1, listBinatang.get(i).getPosY())&&listBinatang.get(i).getPosX()<Map1.getBrs()-1&&listBinatang.get(i).getPosX()+1!=P1.getPosX()){
                    listBinatang.get(i).movedown();
                }
                    break;
                case 2:
                if(!exist(listBinatang.get(i).getPosX(), listBinatang.get(i).getPosY()+1)&&listBinatang.get(i).getPosY()<Map1.getKol()-1&&listBinatang.get(i).getPosY()+1!=P1.getPosY()&&Map1.getData(listBinatang.get(i).getPosX()- 1,listBinatang.get(i).getPosY()).Check() != 6&&Map1.getData(listBinatang.get(i).getPosX()- 1,listBinatang.get(i).getPosY()).Check() != 4&&Map1.getData(listBinatang.get(i).getPosX()- 1,listBinatang.get(i).getPosY()).Check() != 5){

                    listBinatang.get(i).moveright();
                }
                    break;
                case 3:
                if(!exist(listBinatang.get(i).getPosX(), listBinatang.get(i).getPosY()-1)&&listBinatang.get(i).getPosY()!=0&&listBinatang.get(i).getPosY()-1!=P1.getPosY()){
                    listBinatang.get(i).moveleft();
                }
                    break;

            }
            
            if(Map1.getData(listBinatang.get(i).getPosX(),listBinatang.get(i).getPosY()).getGrass()&&listBinatang.get(i).isLapar()){
                listBinatang.get(i).makan();
                Map1.getData(listBinatang.get(i).getPosX(),listBinatang.get(i).getPosY()).setGrass(false);;
            }
            if(listBinatang.get(i).getBelumMakan()==-1){
                listBinatang.remove(i);
                i--;
            }
        }
    }

    }

