import java.awt.event.*;  
import javax.swing.*;    
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.imageio.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.GridLayout;

public class MapGUI extends JFrame{
    JPanel p = new JPanel();
    Icon Icons[][] = new Icon[12][12];
    PlayerIcon PIcons;
    AnimalIcon AIcons[] = new AnimalIcon[20];
    Border border = BorderFactory.createLineBorder(Color.black,2);

    public static void main(String args[]){
        ListBinatang lb=new ListBinatang();
        Kambing k1 = new Kambing(1,1);
        Sapi s1 = new Sapi(4,4);
        Sapi s2 = new Sapi(7,7);
        Kelinci ke1 = new Kelinci (3,9);
        Ayam ay1 = new Ayam(7,10);
        Domba do1= new Domba(8,2);
        Bebek b1 = new Bebek(5,5);
        lb.add(ke1);
        lb.add(s2);
        lb.add(ay1);
        lb.add(do1);
        lb.add(k1);
        lb.add(s1);
        lb.add(b1);
        
        Mixer Mix1 = new Mixer(1,10);
        Well Well1 = new Well(2,10);
        Truck Truck1 = new Truck(0,10);
        Player P1 = new Player(10,6,5,0);
        DagingBebek DB = new DagingBebek(15000);
        SusuSapi SS = new SusuSapi(5000);
        DagingDomba DD = new DagingDomba(10000);
        TelurBebek TB = new TelurBebek(3000);
        try {
            P1.getInventory().addProduct(DB);
            P1.getInventory().addProduct(DD);
            P1.getInventory().addProduct(TB);
            P1.getInventory().addProduct(SS);
        } catch (CustomException e){
            System.out.println(e);
        }
        Map<Cell> Map1 = new Map<Cell>(11);
        Map1.addData(new Coop(0,0,false));
        Map1.addData(new Coop(0,1,false));
        Map1.addData(new Coop(0,2,false));
        Map1.addData(new GrassLand(0,3,true));
        Map1.addData(new Barn(0,4,true));
        Map1.addData(new Barn(0,5,true));
        Map1.addData(new Barn(0,6,true));
        Map1.addData(new Barn(0,7,true));
        Map1.addData(new GrassLand(0,8,true));
        Map1.addData(new GrassLand(0,9,true));
        Map1.addData(Truck1);
         Map1.addData(new Coop(1,0,false));
        Map1.addData(new Coop(1,1,true));
        Map1.addData(new Coop(1,2,false));
        Map1.addData(new GrassLand(1,3,true));
        Map1.addData(new Barn(1,4,true));
        Map1.addData(new Barn(1,5,false));
        Map1.addData(new Barn(1,6,false));
        Map1.addData(new Barn(1,7,true));
        Map1.addData(new GrassLand(1,8,true));
        Map1.addData(new GrassLand(1,9,true));
        Map1.addData(Mix1);
        Map1.addData(new Coop(2,0,false));
        Map1.addData(new Coop(2,1,false));
        Map1.addData(new Coop(2,2,false));
        Map1.addData(new GrassLand(2,3,true));
        Map1.addData(new Barn(2,4,true));
        Map1.addData(new Barn(2,5,false));
        Map1.addData(new Barn(2,6,false));
        Map1.addData(new Barn(2,7,true));
        Map1.addData(new GrassLand(2,8,true));
        Map1.addData(new GrassLand(2,9,true));
        Map1.addData(Well1);
        Map1.addData(new GrassLand(3,0,true));
        Map1.addData(new GrassLand(3,1,true));
        Map1.addData(new GrassLand(3,2,true));
        Map1.addData(new GrassLand(3,3,true));
        Map1.addData(new Barn(3,4,true));
        Map1.addData(new Barn(3,5,false));
        Map1.addData(new Barn(3,6,false));
        Map1.addData(new Barn(3,7,true));
        Map1.addData(new GrassLand(3,8,true));
        Map1.addData(new GrassLand(3,9,true));
        Map1.addData(new GrassLand(3,10,true));
        Map1.addData(new GrassLand(4,0,true));
        Map1.addData(new GrassLand(4,1,true));
        Map1.addData(new GrassLand(4,2,true));
        Map1.addData(new GrassLand(4,3,true));
        Map1.addData(new Barn(4,4,true));
        Map1.addData(new Barn(4,5,false));
        Map1.addData(new Barn(4,6,false));
        Map1.addData(new Barn(4,7,true));
        Map1.addData(new GrassLand(4,8,true));
        Map1.addData(new GrassLand(4,9,true));
        Map1.addData(new GrassLand(4,10,true));
        Map1.addData(new GrassLand(5,0,true));
        Map1.addData(new GrassLand(5,1,true));
        Map1.addData(new GrassLand(5,2,true));
        Map1.addData(new GrassLand(5,3,true));
         Map1.addData(new Barn(5,4,true));
        Map1.addData(new Barn(5,5,true));
        Map1.addData(new Barn(5,6,true));
        Map1.addData(new Barn(5,7,true));
        Map1.addData(new GrassLand(5,8,true));
        Map1.addData(new GrassLand(5,9,true));
        Map1.addData(new GrassLand(5,10,true));
         Map1.addData(new GrassLand(6,0,true));
        Map1.addData(new GrassLand(6,1,true));
        Map1.addData(new GrassLand(6,2,true));
        Map1.addData(new GrassLand(6,3,true));
         Map1.addData(new GrassLand(6,4,true));
        Map1.addData(new GrassLand(6,5,true));
        Map1.addData(new GrassLand(6,6,true));
        Map1.addData(new GrassLand(6,7,true));
        Map1.addData(new GrassLand(6,8,true));
        Map1.addData(new GrassLand(6,9,true));
        Map1.addData(new GrassLand(6,10,true));
         Map1.addData(new GrassLand(7,0,true));
        Map1.addData(new GrassLand(7,1,false));
        Map1.addData(new GrassLand(7,2,false));
        Map1.addData(new GrassLand(7,3,false));
         Map1.addData(new GrassLand(7,4,false));
        Map1.addData(new GrassLand(7,5,false));
        Map1.addData(new GrassLand(7,6,false));
        Map1.addData(new GrassLand(7,7,false));
        Map1.addData(new GrassLand(7,8,false));
        Map1.addData(new GrassLand(7,9,false));
        Map1.addData(new GrassLand(7,10,true));
         Map1.addData(new GrassLand(8,0,true));
        Map1.addData(new GrassLand(8,1,false));
        Map1.addData(new GrassLand(8,2,false));
        Map1.addData(new GrassLand(8,3,false));
         Map1.addData(new GrassLand(8,4,false));
        Map1.addData(new GrassLand(8,5,false));
        Map1.addData(new GrassLand(8,6,false));
        Map1.addData(new GrassLand(8,7,false));
        Map1.addData(new GrassLand(8,8,false));
        Map1.addData(new GrassLand(8,9,false));
        Map1.addData(new GrassLand(8,10,true));
         Map1.addData(new GrassLand(9,0,true));
        Map1.addData(new GrassLand(9,1,false));
        Map1.addData(new GrassLand(9,2,false));
        Map1.addData(new GrassLand(9,3,false));
         Map1.addData(new GrassLand(9,4,false));
        Map1.addData(new GrassLand(9,5,false));
        Map1.addData(new GrassLand(9,6,false));
        Map1.addData(new GrassLand(9,7,false));
        Map1.addData(new GrassLand(9,8,false));
        Map1.addData(new GrassLand(9,9,false));
        Map1.addData(new GrassLand(9,10,true));
         Map1.addData(new GrassLand(10,0,true));
        Map1.addData(new GrassLand(10,1,true));
        Map1.addData(new GrassLand(10,2,true));
        Map1.addData(new GrassLand(10,3,true));
         Map1.addData(new GrassLand(10,4,true));
        Map1.addData(new GrassLand(10,5,true));
        Map1.addData(new GrassLand(10,6,true));
        Map1.addData(new GrassLand(10,7,true));
        Map1.addData(new GrassLand(10,8,true));
        Map1.addData(new GrassLand(10,9,true));
        Map1.addData(new GrassLand(10,10,true));
        new MapGUI(Map1,P1,Truck1,lb);
    }

    public MapGUI(Map<Cell> M1, Player P1,Truck T1,ListBinatang lb){
        /*JFrame*/
        super("MapGUI");
        setSize(800,600);
        getContentPane().setLayout(null);
        setResizable(false);
        p.setBorder(border);
        p.setBounds(25,25,500,500);
        p.setLayout(new GridLayout(M1.getBrs(),M1.getKol()));
        int k = 0;
        for (int i=0; i < M1.getBrs(); i++){
            for (int j=0; j<M1.getKol();j++){
                if (P1.getPosX() == i && P1.getPosY() == j){
                    PIcons = new PlayerIcon(M1.getData(i,j).Check(),M1.getData(i,j).getGrass(),P1.getHadapPemain());
                    p.add(PIcons);
                } else if (lb.exist(i,j)) {
                    AIcons[k] = new AnimalIcon(lb.Search(i,j).getNama(), M1.getData(i,j).Check(),M1.getData(i,j).getGrass(),lb.Search(i,j).isLapar());
                    p.add(AIcons[k]);
                    k= k+1;
                }else if (M1.getData(i,j).Check() == 4 || M1.getData(i,j).Check() == 5 || M1.getData(i,j).Check() == 6 ){
                    Icons[i][j] = new Icon(M1.getData(i,j).Check(),true);
                    p.add(Icons[i][j]);
                } else {
                    Icons[i][j] = new Icon(M1.getData(i,j).Check(),M1.getData(i,j).getGrass());
                    p.add(Icons[i][j]);
                }
                
            }
        }
        add(p);
        /* Membuat Water JLabel */
        ImageIcon iconW = new ImageIcon(this.getClass().getResource("WaterIcon.png"));
        JLabel WaterLabel1 = new JLabel();
        WaterLabel1.setBounds(530,25,30,30);
        WaterLabel1.setIcon(iconW);
        WaterLabel1.setOpaque(true);
        JLabel WaterLabel = new JLabel();
        WaterLabel.setBounds(570,25,200,30);
        WaterLabel.setForeground(Color.black);
        WaterLabel.setBackground(Color.white);
        WaterLabel.setBorder(border);
        WaterLabel.setOpaque(true);
        WaterLabel.setText(Integer.toString(P1.getWater()));
        WaterLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(WaterLabel);
        add(WaterLabel1);

        /* Membuat Money JLabel */
        ImageIcon iconM = new ImageIcon(this.getClass().getResource("MoneyIcon.png"));
        JLabel MoneyLabel1 = new JLabel();
        MoneyLabel1.setBounds(530,70,30,30);
        MoneyLabel1.setIcon(iconM);
        MoneyLabel1.setOpaque(true);
        JLabel MoneyLabel = new JLabel();
        MoneyLabel.setBounds(570,70,200,30);
        MoneyLabel.setForeground(Color.black);
        MoneyLabel.setBackground(Color.white);
        MoneyLabel.setBorder(border);
        MoneyLabel.setOpaque(true);
        MoneyLabel.setText(Integer.toString(P1.getMoney()));
        MoneyLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(MoneyLabel);
        add(MoneyLabel1);

        /* Membuat Bag JLabel */
        ImageIcon iconB = new ImageIcon(this.getClass().getResource("BagIcon.png"));
        JLabel BagLabel1 = new JLabel();
        BagLabel1.setBounds(530,115,30,30);
        BagLabel1.setIcon(iconB);
        BagLabel1.setOpaque(true);
        JLabel BagLabel = new JLabel();
        BagLabel.setBounds(570,115,200,30);
        BagLabel.setForeground(Color.black);
        BagLabel.setBackground(Color.white);
        BagLabel.setBorder(border);
        BagLabel.setOpaque(true);
        BagLabel.setText(Integer.toString(P1.getInventory().getCapacity()));
        BagLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(BagLabel);
        add(BagLabel1);

        /* Membuat Input JLabel*/
        JTextField InputLabel = new JTextField("Input Command");
        InputLabel.setBounds(530,160,240,40);
        InputLabel.setHorizontalAlignment(SwingConstants.CENTER);
        InputLabel.setForeground(Color.black);
        InputLabel.setBackground(Color.white);
        InputLabel.setBorder(border);
        add(InputLabel);

        /* Membuat Input JLabel*/
        JTextArea Label2 = new JTextArea();
        Label2.setText(P1.getInventory().print());
        JScrollPane Scroll = new JScrollPane(Label2);
        Scroll.setBounds(530,250,240,200);
        Scroll.setForeground(Color.black);
        Scroll.setBackground(Color.white);
        Scroll.setBorder(border);
        add(Scroll);
        
        /*Membuat JButton */
        JButton ExeButton = new JButton("Execute");
        ExeButton.setBounds(530,205,240,40);
        ExeButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                    p.removeAll();
                    String command = InputLabel.getText();
                    if (lb.checkEmpty()){
                        JFrame f = new JFrame();
                        JOptionPane.showMessageDialog(f,"Permainan Selesai!");
                    }else if (command.equals("PlayerUp")){
                        P1.MoveUp(M1,T1,lb);
                    } else if (command.equals("PlayerDown")){
                        P1.MoveDown(M1,T1,lb);
                    } else if (command.equals("PlayerRight")){
                        P1.MoveRight(M1,T1,lb);
                    } else if (command.equals("PlayerLeft")){
                        P1.MoveLeft(M1,T1,lb);
                    } else if (command.equals("Interact")){
                        P1.Interact(M1,T1,lb);
                    } else if (command.equals("Grow")){
                        P1.Grow(M1,T1);
                        WaterLabel.setText(Integer.toString(P1.getWater()));
                    } else if (command.equals("Kill")){
                        P1.Kill(lb);
                    } else if (command.equals("Talk")){
                        JFrame f = new JFrame();
                        ImageIcon talk = new ImageIcon("talk.png");
                        JOptionPane.showMessageDialog(f,P1.Talk(lb),"Animal Talk",JOptionPane.INFORMATION_MESSAGE,talk);
                    } else if (command.equals("Exit")){
                        JFrame f = new JFrame();
                        JOptionPane.showMessageDialog(f,"Permainan Selesai!");
                    }
                    lb.updateHewan(M1,P1);
                
                
               
                    int k = 0;
                    for (int i=0; i < M1.getBrs(); i++){
                        for (int j=0; j<M1.getKol();j++){
                            if (P1.getPosX() == i && P1.getPosY() == j){
                                PIcons = new PlayerIcon(M1.getData(i,j).Check(),M1.getData(i,j).getGrass(),P1.getHadapPemain());
                                p.add(PIcons);
                            } else if (lb.exist(i,j)) {
                                AIcons[k] = new AnimalIcon(lb.Search(i,j).getNama(), M1.getData(i,j).Check(),M1.getData(i,j).getGrass(),lb.Search(i,j).isLapar());
                                p.add(AIcons[k]);
                                k= k+1;
                            }else if (M1.getData(i,j).Check() == 4 || M1.getData(i,j).Check() == 5 || M1.getData(i,j).Check() == 6 ){
                                Icons[i][j] = new Icon(M1.getData(i,j).Check(),true);
                                p.add(Icons[i][j]);
                            } else {
                                Icons[i][j] = new Icon(M1.getData(i,j).Check(),M1.getData(i,j).getGrass());
                                p.add(Icons[i][j]);
                            }
                            
                        }
                    }
                    BagLabel.setText(Integer.toString(P1.getInventory().getCapacity()));
                    WaterLabel.setText(Integer.toString(P1.getWater()));
                    MoneyLabel.setText(Integer.toString(P1.getMoney()));
                    Label2.setText(P1.getInventory().print());
                    p.revalidate();
                               
            }
        });
        add(ExeButton);

        setVisible(true);
    }

    
}