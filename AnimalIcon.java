import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.imageio.*;
import java.awt.*;

public class AnimalIcon extends JButton{
    ImageIcon chicken1, chicken2,chicken3,chicken4,chicken5,chicken6,chicken7,chicken8,chicken9,chicken10,chicken11,chicken12,cow1,cow2,cow3,cow4,cow5,cow6,cow7,cow8,cow9,cow10,cow11,cow12,duck1,duck2,duck3,duck4,duck5,duck6,duck7,duck8,duck9,duck10,duck11,duck12,goat1,goat2,goat3,goat4,goat5,goat6,goat7,goat8,goat9,goat10,goat11,goat12,lamb1,lamb2,lamb3,lamb4,lamb5,lamb6,lamb7,lamb8,lamb9,lamb10,lamb11,lamb12,rabbit1,rabbit2,rabbit3,rabbit4,rabbit5,rabbit6,rabbit7,rabbit8,rabbit9,rabbit10,rabbit11,rabbit12;

    /**
     * @param nama
     * @param code
     * @param isgrass
     * @param lapar
     */
    public AnimalIcon(String nama,int code, boolean isgrass,boolean lapar){
        chicken1 = new ImageIcon(this.getClass().getResource("Grassland+grass+chicken.png"));
        chicken2 = new ImageIcon(this.getClass().getResource("Grassland-grass+chicken.png"));
        chicken3 = new ImageIcon(this.getClass().getResource("Barn+grass+chicken.png"));
        chicken4 = new ImageIcon(this.getClass().getResource("Barn-grass+chicken.png"));
        chicken5 = new ImageIcon(this.getClass().getResource("Coop+grass+chicken.png"));
        chicken6 = new ImageIcon(this.getClass().getResource("Coop-grass+chicken.png"));
        chicken7 = new ImageIcon(this.getClass().getResource("Grassland+grass+chicken+!.png"));
        chicken8 = new ImageIcon(this.getClass().getResource("Grassland-grass+chicken+!.png"));
        chicken9 = new ImageIcon(this.getClass().getResource("Barn+grass+chicken+!.png"));
        chicken10 = new ImageIcon(this.getClass().getResource("Barn-grass+chicken+!.png"));
        chicken11 = new ImageIcon(this.getClass().getResource("Coop+grass+chicken+!.png"));
        chicken12 = new ImageIcon(this.getClass().getResource("Coop-grass+chicken+!.png"));
        cow1 = new ImageIcon(this.getClass().getResource("Grassland+grass+cow.png"));
        cow2 = new ImageIcon(this.getClass().getResource("Grassland-grass+cow.png"));
        cow3 = new ImageIcon(this.getClass().getResource("Barn+grass+cow.png"));
        cow4 = new ImageIcon(this.getClass().getResource("Barn-grass+cow.png"));
        cow5 = new ImageIcon(this.getClass().getResource("Coop+grass+cow.png"));
        cow6 = new ImageIcon(this.getClass().getResource("Coop-grass+cow.png"));
        cow7 = new ImageIcon(this.getClass().getResource("Grassland+grass+cow+!.png"));
        cow8 = new ImageIcon(this.getClass().getResource("Grassland-grass+cow+!.png"));
        cow9 = new ImageIcon(this.getClass().getResource("Barn+grass+cow+!.png"));
        cow10 = new ImageIcon(this.getClass().getResource("Barn-grass+cow+!.png"));
        cow11 = new ImageIcon(this.getClass().getResource("Coop+grass+cow+!.png"));
        cow12 = new ImageIcon(this.getClass().getResource("Coop-grass+cow+!.png"));
        duck1 = new ImageIcon(this.getClass().getResource("Grassland+grass+duck.png"));
        duck2 = new ImageIcon(this.getClass().getResource("Grassland-grass+duck.png"));
        duck3 = new ImageIcon(this.getClass().getResource("Barn+grass+duck.png"));
        duck4 = new ImageIcon(this.getClass().getResource("Barn-grass+duck.png"));
        duck5 = new ImageIcon(this.getClass().getResource("Coop+grass+duck.png"));
        duck6 = new ImageIcon(this.getClass().getResource("Coop-grass+duck.png"));
        duck7 = new ImageIcon(this.getClass().getResource("Grassland+grass+duck+!.png"));
        duck8 = new ImageIcon(this.getClass().getResource("Grassland-grass+duck+!.png"));
        duck9 = new ImageIcon(this.getClass().getResource("Barn+grass+duck+!.png"));
        duck10 = new ImageIcon(this.getClass().getResource("Barn-grass+duck+!.png"));
        duck11 = new ImageIcon(this.getClass().getResource("Coop+grass+duck+!.png"));
        duck12 = new ImageIcon(this.getClass().getResource("Coop-grass+duck+!.png"));
        goat1 = new ImageIcon(this.getClass().getResource("Grassland+grass+goat.png"));
        goat2 = new ImageIcon(this.getClass().getResource("Grassland-grass+goat.png"));
        goat3 = new ImageIcon(this.getClass().getResource("Barn+grass+goat.png"));
        goat4 = new ImageIcon(this.getClass().getResource("Barn-grass+goat.png"));
        goat5 = new ImageIcon(this.getClass().getResource("Coop+grass+goat.png"));
        goat6 = new ImageIcon(this.getClass().getResource("Coop-grass+goat.png"));
        goat7 = new ImageIcon(this.getClass().getResource("Grassland+grass+goat+!.png"));
        goat8 = new ImageIcon(this.getClass().getResource("Grassland-grass+goat+!.png"));
        goat9 = new ImageIcon(this.getClass().getResource("Barn+grass+goat+!.png"));
        goat10 = new ImageIcon(this.getClass().getResource("Barn-grass+goat+!.png"));
        goat11 = new ImageIcon(this.getClass().getResource("Coop+grass+goat+!.png"));
        goat12 = new ImageIcon(this.getClass().getResource("Coop-grass+goat+!.png"));
        lamb1 = new ImageIcon(this.getClass().getResource("Grassland+grass+lamb.png"));
        lamb2 = new ImageIcon(this.getClass().getResource("Grassland-grass+lamb.png"));
        lamb3 = new ImageIcon(this.getClass().getResource("Barn+grass+lamb.png"));
        lamb4 = new ImageIcon(this.getClass().getResource("Barn-grass+lamb.png"));
        lamb5 = new ImageIcon(this.getClass().getResource("Coop+grass+lamb.png"));
        lamb6 = new ImageIcon(this.getClass().getResource("Coop-grass+lamb.png"));
        lamb7 = new ImageIcon(this.getClass().getResource("Grassland+grass+lamb+!.png"));
        lamb8 = new ImageIcon(this.getClass().getResource("Grassland-grass+lamb+!.png"));
        lamb9 = new ImageIcon(this.getClass().getResource("Barn+grass+lamb+!.png"));
        lamb10 = new ImageIcon(this.getClass().getResource("Barn-grass+lamb+!.png"));
        lamb11 = new ImageIcon(this.getClass().getResource("Coop+grass+lamb+!.png"));
        lamb12 = new ImageIcon(this.getClass().getResource("Coop-grass+lamb+!.png"));
        rabbit1 = new ImageIcon(this.getClass().getResource("Grassland+grass+rabbit.png"));
        rabbit2 = new ImageIcon(this.getClass().getResource("Grassland-grass+rabbit.png"));
        rabbit3 = new ImageIcon(this.getClass().getResource("Barn+grass+rabbit.png"));
        rabbit4 = new ImageIcon(this.getClass().getResource("Barn-grass+rabbit.png"));
        rabbit5 = new ImageIcon(this.getClass().getResource("Coop+grass+rabbit.png"));
        rabbit6 = new ImageIcon(this.getClass().getResource("Coop-grass+rabbit.png"));
        rabbit7 = new ImageIcon(this.getClass().getResource("Grassland+grass+rabbit+!.png"));
        rabbit8 = new ImageIcon(this.getClass().getResource("Grassland-grass+rabbit+!.png"));
        rabbit9 = new ImageIcon(this.getClass().getResource("Barn+grass+rabbit+!.png"));
        rabbit10 = new ImageIcon(this.getClass().getResource("Barn-grass+rabbit+!.png"));
        rabbit11 = new ImageIcon(this.getClass().getResource("Coop+grass+rabbit+!.png"));
        rabbit12 = new ImageIcon(this.getClass().getResource("Coop-grass+rabbit+!.png"));
        
        if (nama.equals("Ayam")){
            if (code == 3  && isgrass && !lapar){
                setIcon(chicken1);
            } else if (code == 3 && !isgrass && !lapar){
                setIcon(chicken2);
            } else if (code == 1 && isgrass && !lapar){
                setIcon(chicken3);
            } else if (code == 1 && !isgrass && !lapar){
                setIcon(chicken4);
            } else if (code == 2 && isgrass && !lapar){
                setIcon(chicken5);
            } else if (code == 2 && !isgrass && !lapar){
                setIcon(chicken6);
            } else if (code == 3  && isgrass && lapar){
                setIcon(chicken7);
            } else if (code == 3 && !isgrass && lapar){
                setIcon(chicken8);
            } else if (code == 1 && isgrass && lapar){
                setIcon(chicken9);
            } else if (code == 1 && !isgrass && lapar){
                setIcon(chicken10);
            } else if (code == 2 && isgrass && lapar){
                setIcon(chicken11);
            } else if (code == 2 && !isgrass && lapar){
                setIcon(chicken12);
            }
        } else if (nama.equals("Sapi")){
            if (code == 3  && isgrass && !lapar){
                setIcon(cow1);
            } else if (code == 3 && !isgrass && !lapar){
                setIcon(cow2);
            } else if (code == 1 && isgrass && !lapar){
                setIcon(cow3);
            } else if (code == 1 && !isgrass && !lapar){
                setIcon(cow4);
            } else if (code == 2 && isgrass && !lapar){
                setIcon(cow5);
            } else if (code == 2 && !isgrass && !lapar){
                setIcon(cow6);
            } else if (code == 3  && isgrass && lapar){
                setIcon(cow7);
            } else if (code == 3 && !isgrass && lapar){
                setIcon(cow8);
            } else if (code == 1 && isgrass && lapar){
                setIcon(cow9);
            } else if (code == 1 && !isgrass && lapar){
                setIcon(cow10);
            } else if (code == 2 && isgrass && lapar){
                setIcon(cow11);
            } else if (code == 2 && !isgrass && lapar){
                setIcon(cow12);
            }
        } else if (nama.equals("Bebek")){
            if (code == 3  && isgrass && !lapar){
                setIcon(duck1);
            } else if (code == 3 && !isgrass && !lapar){
                setIcon(duck2);
            } else if (code == 1 && isgrass && !lapar){
                setIcon(duck3);
            } else if (code == 1 && !isgrass && !lapar){
                setIcon(duck4);
            } else if (code == 2 && isgrass && !lapar){
                setIcon(duck5);
            } else if (code == 2 && !isgrass && !lapar){
                setIcon(duck6);
            } else if (code == 3  && isgrass && lapar){
                setIcon(duck7);
            } else if (code == 3 && !isgrass && lapar){
                setIcon(duck8);
            } else if (code == 1 && isgrass && lapar){
                setIcon(duck9);
            } else if (code == 1 && !isgrass && lapar){
                setIcon(duck10);
            } else if (code == 2 && isgrass && lapar){
                setIcon(duck11);
            } else if (code == 2 && !isgrass && lapar){
                setIcon(duck12);
            }
        } else if (nama.equals("Kambing")){
            if (code == 3  && isgrass && !lapar){
                setIcon(goat1);
            } else if (code == 3 && !isgrass && !lapar){
                setIcon(goat2);
            } else if (code == 1 && isgrass && !lapar){
                setIcon(goat3);
            } else if (code == 1 && !isgrass && !lapar){
                setIcon(goat4);
            } else if (code == 2 && isgrass && !lapar){
                setIcon(goat5);
            } else if (code == 2 && !isgrass && !lapar){
                setIcon(goat6);
            } else if (code == 3  && isgrass && lapar){
                setIcon(goat7);
            } else if (code == 3 && !isgrass && lapar){
                setIcon(goat8);
            } else if (code == 1 && isgrass && lapar){
                setIcon(goat9);
            } else if (code == 1 && !isgrass && lapar){
                setIcon(goat10);
            } else if (code == 2 && isgrass && lapar){
                setIcon(goat11);
            } else if (code == 2 && !isgrass && lapar){
                setIcon(goat12);
            }
        } else if (nama.equals("Domba")){
            if (code == 3  && isgrass && !lapar){
                setIcon(lamb1);
            } else if (code == 3 && !isgrass && !lapar){
                setIcon(lamb2);
            } else if (code == 1 && isgrass && !lapar){
                setIcon(lamb3);
            } else if (code == 1 && !isgrass && !lapar){
                setIcon(lamb4);
            } else if (code == 2 && isgrass && !lapar){
                setIcon(lamb5);
            } else if (code == 2 && !isgrass && !lapar){
                setIcon(lamb6);
            } else if (code == 3  && isgrass && lapar){
                setIcon(lamb7);
            } else if (code == 3 && !isgrass && lapar){
                setIcon(lamb8);
            } else if (code == 1 && isgrass && lapar){
                setIcon(lamb9);
            } else if (code == 1 && !isgrass && lapar){
                setIcon(lamb10);
            } else if (code == 2 && isgrass && lapar){
                setIcon(lamb11);
            } else if (code == 2 && !isgrass && lapar){
                setIcon(lamb12);
            }
        } else if (nama.equals("Kelinci")){
             if (code == 3  && isgrass && !lapar){
                setIcon(rabbit1);
            } else if (code == 3 && !isgrass && !lapar){
                setIcon(rabbit2);
            } else if (code == 1 && isgrass && !lapar){
                setIcon(rabbit3);
            } else if (code == 1 && !isgrass && !lapar){
                setIcon(rabbit4);
            } else if (code == 2 && isgrass && !lapar){
                setIcon(rabbit5);
            } else if (code == 2 && !isgrass && !lapar){
                setIcon(rabbit6);
            } else if (code == 3  && isgrass && lapar){
                setIcon(rabbit7);
            } else if (code == 3 && !isgrass && lapar){
                setIcon(rabbit8);
            } else if (code == 1 && isgrass && lapar){
                setIcon(rabbit9);
            } else if (code == 1 && !isgrass && lapar){
                setIcon(rabbit10);
            } else if (code == 2 && isgrass && lapar){
                setIcon(rabbit11);
            } else if (code == 2 && !isgrass && lapar){
                setIcon(rabbit12);
            }
        } else {
            System.out.println("Hewan Tidak AdA");
        }
    
        
    }

}