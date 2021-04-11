package com.codervibe.tank;
/*
 * Created by Administrator on 2021/4/11  0011
 * DateTime:2021/04/11 11:07
 * Description:游戏窗口
 * Others:
 */

import javax.swing.*;
import java.awt.*;

/**
 * @author Administrator
 */
public class GameWindows extends JFrame {
    public GameWindows(){
        this.setSize(860,640);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("坦克大战 V1.0");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(new GamePanel());
    }
    static class GamePanel extends JPanel {
        @Override
        public void paint(Graphics g) {
            super.paint(g);//保留原来的paint,g相当于画笔
            g.drawString("坦克大战",430,320);
        }
    }
}
