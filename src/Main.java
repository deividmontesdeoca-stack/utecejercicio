import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Tu nombre es : ");
        String nombre = sc.nextLine();
        System.out.println("Tu edad es :");
        int edad = sc.nextInt();
        System.out.println("Las nota es ");
        double nota = sc.nextDouble();
        System.out.println("Las nota es");
        double nota1 = sc.nextDouble();
        System.out.println("Las nota es ");
        double nota2 = sc.nextDouble();
        double promedio = (nota1 + nota2 +nota) / 3;
        if(promedio>=6) {
            System.out.println("Tu nombre es " + nombre + " tu edad es " + edad + " y estas aprobado");
        }else if(promedio <=0){
            System.out.println("Sos horrible");
        }else {
            System.out.println("Tu nombre es "+nombre+" tu edad es " +edad + " y estas desaprobado");

        }
        System.out.println();
    }
