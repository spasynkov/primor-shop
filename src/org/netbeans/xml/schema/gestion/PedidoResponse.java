
package org.netbeans.xml.schema.gestion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.netbeans.xml.schema.comun.Respuesta;


/**
 * <p>Java class for PedidoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PedidoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Pedido" type="{http://xml.netbeans.org/schema/gestion}PedidoExt" form="qualified"/>
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
@XmlType(name = "PedidoResponse", propOrder = {
    "pedido",
    "respuesta"
})
public class PedidoResponse {

    @XmlElement(name = "Pedido", required = true)
    protected PedidoExt pedido;
    @XmlElement(name = "Respuesta", required = true)
    protected Respuesta respuesta;

    /**
     * Gets the value of the pedido property.
     * 
     * @return
     *     possible object is
     *     {@link PedidoExt }
     *     
     */
    public PedidoExt getPedido() {
        return pedido;
    }

    /**
     * Sets the value of the pedido property.
     * 
     * @param value
     *     allowed object is
     *     {@link PedidoExt }
     *     
     */
    public void setPedido(PedidoExt value) {
        this.pedido = value;
    }

    /**
     * Gets the value of the respuesta property.
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
     * Sets the value of the respuesta property.
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
