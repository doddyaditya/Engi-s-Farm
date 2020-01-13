import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.imageio.*;
import java.awt.*;

public class Icon extends JButton {
    ImageIcon grasslandwg,grasslandwog,barnwg,barnwog,coopwg,coopwog,well,truck,mixer;

    /**
     * @param code
     * @param isgrass
     */
    public Icon(int code, boolean isgrass){
        grasslandwg = new ImageIcon(this.getClass().getResource("GrassLand+grass.jpg"));
        grasslandwog = new ImageIcon(this.getClass().getResource("GrassLand-grass.jpg"));
        barnwg = new ImageIcon(this.getClass().getResource("Barn+grass.jpg"));
        barnwog = new ImageIcon(this.getClass().getResource("Barn-grass.jpg"));
        coopwg = new ImageIcon(this.getClass().getResource("Coop+grass.png"));
        coopwog = new ImageIcon(this.getClass().getResource("Coop-grass.png"));
        well = new ImageIcon(this.getClass().getResource("well.png"));
        truck = new ImageIcon(this.getClass().getResource("truck.png"));
        mixer = new ImageIcon(this.getClass().getResource("mixer.png"));
        
        if (code == 4 && isgrass){
            setIcon(mixer);
        } else if (code == 5 && isgrass){
            setIcon(truck);
        }else if (code == 6 && isgrass){
            setIcon(well);
        }else if (code == 1 && isgrass){
            setIcon(barnwg);
        } else if (code == 1 && !isgrass){
            setIcon(barnwog);
        }else if (code == 2 && !isgrass){
            setIcon(coopwog);
        } else if (code == 2 && isgrass){
            setIcon(coopwg);
        } else if (code == 3 && !isgrass){
            setIcon(grasslandwog);
        } else if (code == 3 && isgrass){
            setIcon(grasslandwg);
        }
        
    }

}