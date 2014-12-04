package boletin10.pkg2;

import javax.swing.JOptionPane;

public class Xogo {

    private int tryes;
    private int num;

    public int numtryes() {

        String intentos = JOptionPane.showInputDialog("introduce nº de intentos");
        tryes = Integer.parseInt(intentos);
        return tryes;
    }

    public int seeNum() {

        do {
            double random = Math.random()*50+1;
            num = (int) random;
        } while (num < 1 || num > 50);
        return num;
    }

    public void xogarAdiv() {
        int contador;
        String solucion = JOptionPane.showInputDialog("adiviña nº entre 1 e 50");
        int sol = Integer.parseInt(solucion);
       num=this.seeNum();
        for (contador = 1; contador < tryes && sol != num; contador++) {
            int dif = Math.abs(num - sol);
            if (dif >= 20) {
                JOptionPane.showMessageDialog(null, +sol + "  Moi lonxe");
            } else {
                if ((dif <= 20) && dif >= 10) {
                    JOptionPane.showMessageDialog(null, +sol + "  Lonxe");

                } else {
                    if ((dif < 10) && dif > 5) {
                        JOptionPane.showMessageDialog(null, +sol + "  Preto");
                    } else {
                        if (dif <= 5) {
                            JOptionPane.showMessageDialog(null, +sol + "  Moi preto");
                        }
                    }
                }
            }
            do {
                String solucionn = JOptionPane.showInputDialog("adiviña nº entre 1 e 50");
                sol = Integer.parseInt(solucionn);
            } while (sol > 50 || sol < 0);
        }
            if (sol == num) {
                JOptionPane.showMessageDialog(null, "YOU WIN");
            }
            if (contador == tryes) {
                JOptionPane.showMessageDialog(null, "YOU LOSE");
            }

        }
    }

