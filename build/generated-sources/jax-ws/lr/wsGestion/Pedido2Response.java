
package lr.wsGestion;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Pedido2Response complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Pedido2Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Pedido" type="{http://xml.netbeans.org/schema/gestion}Pedido" form="qualified"/>
 *         &lt;element name="PedidoLinea" type="{http://xml.netbeans.org/schema/gestion}PedidoLinea" maxOccurs="unbounded" form="qualified"/>
 *         &lt;element name="Respuesta" type="{http://xml.netbeans.org/schema/comun}Respuesta" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pedido2Response", namespace = "http://xml.netbeans.org/schema/gestion", propOrder = {
    "pedido",
    "pedidoLinea",
    "respuesta"
})
public class Pedido2Response {

    @XmlElement(name = "Pedido", required = true)
    protected Pedido pedido;
    @XmlElement(name = "PedidoLinea", required = true)
    protected List<PedidoLinea> pedidoLinea;
    @XmlElement(name = "Respuesta", required = true)
    protected Respuesta respuesta;

    /**
     * Obtiene el valor de la propiedad pedido.
     * 
     * @return
     *     possible object is
     *     {@link Pedido }
     *     
     */
    public Pedido getPedido() {
        return pedido;
    }

    /**
     * Define el valor de la propiedad pedido.
     * 
     * @param value
     *     allowed object is
     *     {@link Pedido }
     *     
     */
    public void setPedido(Pedido value) {
        this.pedido = value;
    }

    /**
     * Gets the value of the pedidoLinea property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pedidoLinea property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPedidoLinea().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PedidoLinea }
     * 
     * 
     */
    public List<PedidoLinea> getPedidoLinea() {
        if (pedidoLinea == null) {
            pedidoLinea = new ArrayList<PedidoLinea>();
        }
        return this.pedidoLinea;
    }

    /**
     * Obtiene el valor de la propiedad respuesta.
     * 
     * @return
     *     possible object is
     *     {@link Respuesta }
     *     
     */
    public Respuesta getRespuesta() {
        return respuesta;
    }

    /**
     * Define el valor de la propiedad respuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link Respuesta }
     *     
     */
    public void setRespuesta(Respuesta value) {
        this.respuesta = value;
    }

}
