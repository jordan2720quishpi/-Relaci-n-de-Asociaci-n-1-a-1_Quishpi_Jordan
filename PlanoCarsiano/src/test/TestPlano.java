
package test;
import dominio.Plano;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class TestPlano {
    public static void main(String[] args) {
        //Creacion del obejeto
        Plano obj1=null;
        var total = 0.0;
        var total1 = 0.0;
        int x = 0, y = 0, op = 0,valor=0,tx=0,ty=0;
        Scanner entrada = new Scanner(System.in);
        boolean bandera,bandera1;
        //Vlidar x && y
        do {
            bandera = false;
            try {
                System.out.println("Coordenada iniciales X=0 -  Y=0");
                obj1 = new Plano(0, 0);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Dato ingresado no valido ");
                bandera = true;
            }
        } while (bandera);
        do {
            bandera1 = false;
            try {
                op = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu" + "\n1. Arriba"
                        + "\n2. Abajo" + "\n3.Izquierda" + "\n4. Derecha" + "\n5. Salir"));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Opcion no existe ");
                bandera1 = true;
            } 
            if(op!=5){
                try{
                    valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor"));
                }catch(NumberFormatException e){
                    System.out.println("Dato no valido");
                }                
            }            
            switch(op){
                case 1:
                        obj1.setArriba(valor);
                        bandera1 = true;
                        break;
                case 2:
                        obj1.setAbajo(valor);
                        bandera1 = true;
                        break;
                case 3:
                        obj1.setIzquierda(valor);
                        bandera1 = true;
                        break;
                case 4:
                        obj1.setDerecha(valor);
                        bandera1 = true;
                        break;
                case 5:
                        bandera1=false;
            }
            System.out.println("Posicion: "+ "x = "+obj1.getX()+" Y = "+obj1.getY());
            tx+=obj1.getX();
            ty+=obj1.getY();
            total=Math.sqrt(tx);
            total1=Math.sqrt(ty);
         } while (bandera1); 
        System.out.println("Distancia Recorrida por X:"+tx);
        System.out.println("Distancia Recorrida por Y:"+ty);
         System.out.println("Distancia total rercorrida :"+(total+total1));
    }   
}
    

