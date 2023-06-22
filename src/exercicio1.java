import com.sun.jdi.VMOutOfMemoryException;

import java.util.Scanner;
import javax.swing.*;
public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senhaDeAcesso;
        senhaDeAcesso= Integer.parseInt(senhaDoAcesso("digite o acesso"));

        while (senhaDeAcesso != 2002){
            mostrarMensagem("Acesso Incorreto");
            senhaDeAcesso= Integer.parseInt(senhaDoAcesso("digite o acesso novamente"));


        }

        mostrarMensagem("Acesso Correto");



    }
    public static String senhaDoAcesso(String mensagem){
        return JOptionPane.showInputDialog(null, mensagem);
    }
    public static void mostrarMensagem(String mensagem){
        JOptionPane.showMessageDialog(null, mensagem);
    }

}
