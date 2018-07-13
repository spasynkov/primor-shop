
package lr.wsGestion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Unidad complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Unidad">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Unid1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Unid2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Unid3" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Unidad", namespace = "http://xml.netbeans.org/schema/comun", propOrder = {
    "unid1",
    "unid2",
    "unid3"
})
public class Unidad {

    @XmlElement(name = "Unid1")
    protected double unid1;
    @XmlElement(name = "Unid2")
    protected double unid2;
    @XmlElement(name = "Unid3")
    protected double unid3;

    /**
     * Obtiene el valor de la propiedad unid1.
     * 
     */
    public double getUnid1() {
        return unid1;
    }

    /**
     * Define el valor de la propiedad unid1.
     * 
     */
    public void setUnid1(double value) {
        this.unid1 = value;
    }

    /**
     * Obtiene el valor de la propiedad unid2.
     * 
     */
    public double getUnid2() {
        return unid2;
    }

    /**
     * Define el valor de la propiedad unid2.
     * 
     */
    public void setUnid2(double value) {
        this.unid2 = value;
    }

    /**
     * Obtiene el valor de la propiedad unid3.
     * 
     */
    public double getUnid3() {
        return unid3;
    }

    /**
     * Define el valor de la propiedad unid3.
     * 
     */
    public void setUnid3(double value) {
        this.unid3 = value;
    }

}
