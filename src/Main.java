//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

class Main implements ActionListener {
    JFrame jfrm = new JFrame("Определитель растений Тюменской области");
    KeyIDFamilie keyIDFam;
    JLabel jlab;
    JButton familieIDButton;
    JButton speciesIDButton;
    JButton exitButton;

    Main() {
        this.jfrm.setLayout(new GridLayout(4, 1, 50, 50));
        this.jfrm.setSize(480, 600);
        this.jfrm.setDefaultCloseOperation(3);
        this.jfrm.setLocationRelativeTo((Component)null);
        this.jlab = new JLabel("<html>Электронная версия Определителя сосудистых растений Тюменской области (В.АГлазунов, Н.И. Науменко, Н.В. Хозяинова; гл. ред. Н.И. Науменко; ТюмНЦ СО РАН, Тюменский филиалООО \"Газпром проектирование\". - Тюмень: ООО \"РГ\"Проспект\", 2017. - 744 с., 40 с. ил.- 1700 экз. ISBN 978-5-98100-190-1)");
        this.jfrm.add(this.jlab);
        this.familieIDButton = new JButton("Определить семейство");
        this.familieIDButton.addActionListener(this);
        this.familieIDButton.setActionCommand("familie");
        this.speciesIDButton = new JButton("Определить род и вид (в разработке)");
        this.speciesIDButton.addActionListener(this);
        this.speciesIDButton.setActionCommand("species");
        this.exitButton = new JButton("Выйти");
        this.exitButton.addActionListener(this);
        this.exitButton.setActionCommand("exit");
        this.jfrm.add(this.familieIDButton);
        this.jfrm.add(this.speciesIDButton);
        this.jfrm.add(this.exitButton);
        this.jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Main();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("exit")) {
            this.jfrm.dispose();
        } else if (e.getActionCommand().equals("familie")) {
            this.keyIDFam = new KeyIDFamilie();
            this.jfrm.setVisible(false);
            this.jfrm.dispose();
        }

    }
}
