
package lr.wsGestion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PrecioArticuloResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
@XmlType(name = "PrecioArticuloResponse", namespace = "http://xml.netbeans.org/schema/gestion", propOrder = {
    "precioArticulo",
    "respuesta"
})
public class PrecioArticuloResponse {

    @XmlElement(name = "PrecioArticulo", required = true)
    protected PrecioArticulo precioArticulo;
    @XmlElement(name = "Respuesta", required = true)
    protected Respuesta respuesta;

    /**
     * Obtiene el valor de la propiedad precioArticulo.
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
     * Define el valor de la propiedad precioArticulo.
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
