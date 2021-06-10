import java.util.*;
public class ejercicio13{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String op = "";
        do{
            System.out.println("que operacion deseas");
            System.out.println("a. Suma");
            System.out.println("b. division");
            System.out.println("c. salir");
            op = s.nextLine();
            double n1,n2;
            if(op.equals("a")){
                System.out.print("ingresar primer numero ");
                n1=s.nextInt();
                System.out.print("ingresar segundo numero ");
                n2=s.nextInt();
                System.out.println("resultado de la suma "+(n1+n2));
            }else if(op.equals("b")){
                System.out.print("ingresar primer numero ");
                n1=s.nextInt();
                System.out.print("ingresar segundo numero ");
                n2=s.nextInt();
                while(n2==0){
                    System.out.println("no se puede dividir");
                    System.out.print("ingresasr sgundo numero ");
                    n2=s.nextInt();
                    s.nextLine();
                }
                System.out.println("resultado de la divisio "+(n1/n2));
            }else if(op.equals("c")){
                System.out.print("Bye...");
            }
            else{
                System.out.println("Option invalid :c ");
            }
 
        }while(!op.equals("c"));
    }
}