public class Producto {

        public static  void  main(String[] args){

            String productito = "Pollo";
            int Stock = 4;
            double precio = 0.2;
            boolean disponible = true;
            if(Stock <= 0  ){
                disponible = false;
            }
            System.out.printf("El " + productito+ " Esta disponible? "+(disponible?  "si":"no")
                    +", su precio es " +precio+ " y quedan "+Stock);
        }

    }

