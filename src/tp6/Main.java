package tp6;

/**
 *
 * @author Sergio
 */
public class Main {

    public static void main(String[] args) {
        Telefonico t=new Telefonico();
        Cliente c1=new Cliente("sergio", "mauro","san ","el volcan",798);
        Cliente c2=new Cliente("agus", "aylem","san luis","trapiche",979);
        Cliente c3=new Cliente("mauro", "adan","san luis","potrero",999);
        Cliente c4=new Cliente("sergio", "ferrer","san luis","ciudad",888);
        Cliente c5=new Cliente("nombre","apellido","ciudad","direccion",777);
        t.agregarCliente(123, c1);
        t.agregarCliente(234, c2);
        t.agregarCliente(12433, c3);
        t.agregarCliente(22434,c4);
        t.agregarCliente(999,c5);
        t.agregarCliente(123, c2);

        System.out.println(t.buscarTelefono("aylem"));
       System.out.println(t.buscarClienteS("san luis"));
          System.out.println(t.buscarCliente(234));
          
        System.out.println(t.buscarCliente(999));
         t.buscarClienteS("xxxx");
        t.borrarCliente(777);
         System.out.println(t.buscarCliente(999));
    }

}
