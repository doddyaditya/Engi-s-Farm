import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.imageio.*;
import java.awt.*;

public class PlayerIcon extends JButton {
    ImageIcon grasslandwgPU,grasslandwogPU,barnwgPU,barnwogPU,coopwgPU,coopwogPU,grasslandwgPR,grasslandwogPR,barnwgPR,barnwogPR,coopwgPR,coopwogPR,grasslandwgPD,grasslandwogPD,barnwgPD,barnwogPD,coopwgPD,coopwogPD,grasslandwgPL,grasslandwogPL,barnwgPL,barnwogPL,coopwgPL,coopwogPL;

    /**
     * @param code
     * @param isgrass
     * @param hadap
     */
    public PlayerIcon(int code, boolean isgrass,char hadap){
        /* Player UP*/
        grasslandwgPU = new ImageIcon(this.getClass().getResource("GrassLand+grass+PU.png"));
        grasslandwogPU = new ImageIcon(this.getClass().getResource("GrassLand-grass+PU.png"));
        barnwgPU = new ImageIcon(this.getClass().getResource("Barn+grass+PU.png"));
        barnwogPU = new ImageIcon(this.getClass().getResource("Barn-grass+PU.png"));
        coopwgPU = new ImageIcon(this.getClass().getResource("Coop+grass+PU.png"));
        coopwogPU = new ImageIcon("Coop-grass+PU.png");
        /*Player Left*/
        grasslandwgPL = new ImageIcon(this.getClass().getResource("GrassLand+grass+PL.png"));
        grasslandwogPL = new ImageIcon(this.getClass().getResource("GrassLand-grass+PL.png"));
        barnwgPL = new ImageIcon(this.getClass().getResource("Barn+grass+PL.png"));
        barnwogPL = new ImageIcon(this.getClass().getResource("Barn-grass+PL.png"));
        coopwgPL = new ImageIcon(this.getClass().getResource("Coop+grass+PL.png"));
        coopwogPL = new ImageIcon(this.getClass().getResource("Coop-grass+PL.png"));
        /*Player Down*/
        grasslandwgPD = new ImageIcon(this.getClass().getResource("GrassLand+grass+PD.png"));
        grasslandwogPD = new ImageIcon(this.getClass().getResource("GrassLand-grass+PD.png"));
        barnwgPD = new ImageIcon(this.getClass().getResource("Barn+grass+PD.png"));
        barnwogPD = new ImageIcon(this.getClass().getResource("Barn-grass+PD.png"));
        coopwgPD = new ImageIcon(this.getClass().getResource("Coop+grass+PD.png"));
        coopwogPD = new ImageIcon(this.getClass().getResource("Coop-grass+PD.png"));
        /* Player Right*/
        grasslandwgPR = new ImageIcon(this.getClass().getResource("GrassLand+grass+PR.png"));
        grasslandwogPR = new ImageIcon(this.getClass().getResource("GrassLand-grass+PR.png"));
        barnwgPR = new ImageIcon(this.getClass().getResource("Barn+grass+PR.png"));
        barnwogPR = new ImageIcon(this.getClass().getResource("Barn-grass+PR.png"));
        coopwgPR = new ImageIcon(this.getClass().getResource("Coop+grass+PR.png"));
        coopwogPR = new ImageIcon(this.getClass().getResource("Coop-grass+PR.png"));
        /* CONDITION */
        if (code == 1 && isgrass && hadap =='U'){
            setIcon(barnwgPU);
        } else if (code == 1 && !isgrass && hadap =='U'){
            setIcon(barnwogPU);
        }else if (code == 2 && !isgrass && hadap == 'U'){
            setIcon(coopwogPU);
        } else if (code == 2 && isgrass && hadap == 'U'){
            setIcon(coopwgPU);
        } else if (code == 3 && !isgrass && hadap == 'U'){
            setIcon(grasslandwogPU);
        } else if (code == 3 && isgrass && hadap == 'U'){
            setIcon(grasslandwgPU);
        } else if (code == 1 && isgrass && hadap =='R'){
            setIcon(barnwgPR);
        } else if (code == 1 && !isgrass && hadap =='R'){
            setIcon(barnwogPR);
        }else if (code == 2 && !isgrass && hadap == 'R'){
            setIcon(coopwogPR);
        } else if (code == 2 && isgrass && hadap == 'R'){
            setIcon(coopwgPR);
        } else if (code == 3 && !isgrass && hadap == 'R'){
            setIcon(grasslandwogPR);
        } else if (code == 3 && isgrass && hadap == 'R'){
            setIcon(grasslandwgPR);
        } else if (code == 1 && isgrass && hadap =='D'){
            setIcon(barnwgPD);
        } else if (code == 1 && !isgrass && hadap =='D'){
            setIcon(barnwogPD);
        }else if (code == 2 && !isgrass && hadap == 'D'){
            setIcon(coopwogPD);
        } else if (code == 2 && isgrass && hadap == 'D'){
            setIcon(coopwgPD);
        } else if (code == 3 && !isgrass && hadap == 'D'){
            setIcon(grasslandwogPD);
        } else if (code == 3 && isgrass && hadap == 'D'){
            setIcon(grasslandwgPD);
        } else if (code == 1 && isgrass && hadap =='L'){
            setIcon(barnwgPL);
        } else if (code == 1 && !isgrass && hadap =='L'){
            setIcon(barnwogPL);
        }else if (code == 2 && !isgrass && hadap == 'L'){
            setIcon(coopwogPL);
        } else if (code == 2 && isgrass && hadap == 'L'){
            setIcon(coopwgPL);
        } else if (code == 3 && !isgrass && hadap == 'L'){
            setIcon(grasslandwogPL);
        } else if (code == 3 && isgrass && hadap == 'L'){
            setIcon(grasslandwgPL);
        }
        
          
    }

}