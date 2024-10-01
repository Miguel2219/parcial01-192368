import java.util.Scanner;
public class Ejercicio1
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese un numero entero mayor a 0: ");
        int numero=sc.nextInt();
        boolean bandera=true;
        int contador=0;
        while (bandera==true){
            if (numero<=0){
                System.out.println("Deben ingresar un valor valido");
            }else{
                while (numero>0) {
                    numero /= 10;
                    contador ++;
                    
                }
                bandera=false;
            }   
        }
        System.out.println("La cantidad de digitos es: "+contador);
    





    }
}
