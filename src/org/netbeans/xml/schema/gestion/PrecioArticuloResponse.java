
package org.netbeans.xml.schema.gestion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.netbeans.xml.schema.comun.Respuesta;


/**
 * <p>Java class for PrecioArticuloResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrecioArticuloResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrecioArticulo" type="{http://xml.netbeans.org/schema/gestion}PrecioArticulo" form="qualified"/>
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
@XmlType(name = "PrecioArticuloResponse", propOrder = {
    "precioArticulo",
    "respuesta"
})
public class PrecioArticuloResponse {

    @XmlElement(name = "PrecioArticulo", required = true)
    protected PrecioArticulo precioArticulo;
    @XmlElement(name = "Respuesta", required = true)
    protected Respuesta respuesta;

    /**
     * Gets the value of the precioArticulo property.
     * 
     * @return
     *     possible object is
     *     {@link PrecioArticulo }
     *     
     */
    public PrecioArticulo getPrecioArticulo() {
        return precioArticulo;
    }

    /**
     * Sets the value of the precioArticulo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrecioArticulo }
     *     
     */
    public void setPrecioArticulo(PrecioArticulo value) {
        this.precioArticulo = value;
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
