import com.mycompany.ordenacao.EntradaDeDados;
import com.mycompany.ordenacao.Menu;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        EntradaDeDados entraDados = new EntradaDeDados();
        entraDados.obterVetor();

        Menu nvMenu = new Menu();
        nvMenu.exibirMenu();
    }
}
