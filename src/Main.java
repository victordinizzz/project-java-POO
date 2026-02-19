//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        User myUser = new User();
        Produto myProduto = new Produto();

        System.out.println("o Nome atual é " + myUser.getName());
        System.out.println("digite um nome");
        String name = scanner.nextLine();
        myUser.setName(name);
        System.out.println("o Nome atual é " + myUser.getName());
        System.out.println("o produto é" + myProduto.getNomeDoPod());
        System.out.println("escolha um nome para o produto");
        name = scanner.nextLine();
        myProduto.setNomeDoPod(name);
        System.out.println("o Nome atual é " + myProduto.getNomeDoPod());







        }
    }
