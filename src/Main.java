//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            String productito = "Pollo";
            int Stock = 4;
            double precio = 0.2;
            boolean disponible = true;
            if(Stock <= 0  ){
                disponible = false;
            }
            System.out.printf(" El nombre del producto es" + productito+ "Esta disponible "+(disponible?  "si":"no")
            +" el precio es" +precio+ " su stock es "+Stock);
        }

    }