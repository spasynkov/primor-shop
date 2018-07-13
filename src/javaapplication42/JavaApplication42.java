/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication42;


import org.netbeans.xml.schema.comun.Articulo;
import org.netbeans.xml.schema.comun.Cliente;
import org.netbeans.xml.schema.comun.Persona;
import org.netbeans.xml.schema.gestion.PedidoExt;
import org.netbeans.xml.schema.gestion.PedidoLinea;
import org.netbeans.xml.schema.gestion.PedidoResponse;

import javaapplication42.web.Gestion;
import javaapplication42.web.GestionService;

/**
 *
 * @author asalaso
 */
public class JavaApplication42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        PedidoExt order = new PedidoExt();      // order object

        Cliente customer = new Cliente();          // customer object
        customer.setCodigo("codigo de cliente facilitado por primor");            // Customer code if needed
        customer.setCentro("codigo de centro de cliente facilitado por primor");
        customer.setTelefono("952060270");                                          // Customer phone
        customer.setEmail("asalaso@inerttia.es");                                   // Customer email
        order.setCliente(customer);     // Set customer information on order object

        Persona shippingPerson = new Persona();              // Person object for storing shipping information
        shippingPerson.setNombre("Alberto Salas Ortega");       // Name
        shippingPerson.setDNI("11223344");                      // Identification VAT Number or SS Number etc.
        shippingPerson.setDomicilio("Marie Curie,20");
        shippingPerson.setCodigoPostal("29590");
        shippingPerson.setPoblacion("Malaga");
        shippingPerson.setProvincia("Malaga");
        shippingPerson.setPais("ES");
        order.setDireccionEntrega(shippingPerson);

        Persona invoicePerson = new Persona();       // Person object for storing invoicing information usually same as shipping
        invoicePerson.setNombre("Inerttia");
        invoicePerson.setDNI("33445566");
        invoicePerson.setDomicilio("Marie Curie,20");
        invoicePerson.setCodigoPostal("29590");
        invoicePerson.setPoblacion("Malaga");
        invoicePerson.setProvincia("Malaga");
        order.setDireccionFacturacion(invoicePerson);

        order.setFecha("2018-05-17");   // Order date
        order.setSuPedido("P1234");     // Order Number
        order.setObservaciones("Observaciones sobre el pedido");        // Order remarks
        order.setImporte(90);           // Order amount
        order.setReferenciaPago("");    // Payment information (Visa, paypal, etc) authorziation number
        order.setGastosEnvio(10);
        order.setBruto(0);
        order.setDescuento(0);
        order.setAgenciaTransporte((short) 1);
        //ID DE AGENCIA TRANSPORTE, PREGUNTAR A FRAN POR LA NUMERACION
        order.setFormaPago("R"); //R=REEMBOLSO;V=
        order.setRetorno((short)0);//0=sin retorno,1= envío con retorno
        order.setCentroRecogida("");//""=sin centro de recogida,<codigo de centro de primor>=codigo del centro donde se recogera la mercancia
        order.setParaRegalo(false);//true=pedido para regalo
                        order.setParaRegaloMsg("Mensaje para mostrar en el regalo");


        PedidoLinea l = new PedidoLinea();

        l.setArticulo(new Articulo());
        l.getArticulo().setCodigo("0ML00001");
        l.setUnidad1(1);
        l.setUnidad2(0);//SIEMPRE A 0
        l.setUnidad3(0);//SIEMPRE A 0
        l.setPvp(5);
        l.setDescuento(0);
        l.setImporte(5);
        order.getPedidoLinea().add(l);

        PedidoLinea l2 = new PedidoLinea();
        l2.setArticulo(new Articulo());
        l2.getArticulo().setCodigo("0ML00096");
        l2.setUnidad1(2);
        l2.setUnidad2(0);//SIEMPRE A 0
        l2.setUnidad3(0);//SIEMPRE A 0
        l2.setPvp(5);
        l2.setDescuento(0);
        l2.setImporte(10);
        order.getPedidoLinea().add(l2);

        PedidoResponse pedidoResponse = setPedidoWeb3("primorUsername", "primorUsersPass", order);
        System.out.println(pedidoResponse);

    }

    private static PedidoResponse setPedidoWeb3(String usuario, String password, PedidoExt pedido) {
        GestionService service = new GestionService();
        Gestion port = service.getGestionPort();
        return port.setPedidoWeb3(usuario, password, pedido);
    }
}
