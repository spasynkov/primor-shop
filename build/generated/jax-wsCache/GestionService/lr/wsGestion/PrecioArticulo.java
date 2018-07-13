
package lr.wsGestion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PrecioArticulo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PrecioArticulo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Pvp" type="{http://www.w3.org/2001/XMLSchema}double" form="qualified"/>
 *         &lt;element name="PrecioMedio" type="{http://www.w3.org/2001/XMLSchema}double" form="qualified"/>
 *         &lt;element name="Costo" type="{http://www.w3.org/2001/XMLSchema}double" form="qualified"/>
 *         &lt;element name="PrecioUltimaCompra" type="{http://www.w3.org/2001/XMLSchema}double" form="qualified"/>
 *         &lt;element name="Descuento1" type="{http://www.w3.org/2001/XMLSchema}double" form="qualified"/>
 *         &lt;element name="Descuento2" type="{http://www.w3.org/2001/XMLSchema}double" form="qualified"/>
 *         &lt;element name="Descuento3" type="{http://www.w3.org/2001/XMLSchema}double" form="qualified"/>
 *         &lt;element name="Descuento4" type="{http://www.w3.org/2001/XMLSchema}double" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrecioArticulo", namespace = "http://xml.netbeans.org/schema/gestion", propOrder = {
    "pvp",
    "precioMedio",
    "costo",
    "precioUltimaCompra",
    "descuento1",
    "descuento2",
    "descuento3",
    "descuento4"
})
public class PrecioArticulo {

    @XmlElement(name = "Pvp")
    protected double pvp;
    @XmlElement(name = "PrecioMedio")
    protected double precioMedio;
    @XmlElement(name = "Costo")
    protected double costo;
    @XmlElement(name = "PrecioUltimaCompra")
    protected double precioUltimaCompra;
    @XmlElement(name = "Descuento1")
    protected double descuento1;
    @XmlElement(name = "Descuento2")
    protected double descuento2;
    @XmlElement(name = "Descuento3")
    protected double descuento3;
    @XmlElement(name = "Descuento4")
    protected double descuento4;

    /**
     * Obtiene el valor de la propiedad pvp.
     * 
     */
    public double getPvp() {
        return pvp;
    }

    /**
     * Define el valor de la propiedad pvp.
     * 
     */
    public void setPvp(double value) {
        this.pvp = value;
    }

    /**
     * Obtiene el valor de la propiedad precioMedio.
     * 
     */
    public double getPrecioMedio() {
        return precioMedio;
    }

    /**
     * Define el valor de la propiedad precioMedio.
     * 
     */
    public void setPrecioMedio(double value) {
        this.precioMedio = value;
    }

    /**
     * Obtiene el valor de la propiedad costo.
     * 
     */
    public double getCosto() {
        return costo;
    }

    /**
     * Define el valor de la propiedad costo.
     * 
     */
    public void setCosto(double value) {
        this.costo = value;
    }

    /**
     * Obtiene el valor de la propiedad precioUltimaCompra.
     * 
     */
    public double getPrecioUltimaCompra() {
        return precioUltimaCompra;
    }

    /**
     * Define el valor de la propiedad precioUltimaCompra.
     * 
     */
    public void setPrecioUltimaCompra(double value) {
        this.precioUltimaCompra = value;
    }

    /**
     * Obtiene el valor de la propiedad descuento1.
     * 
     */
    public double getDescuento1() {
        return descuento1;
    }

    /**
     * Define el valor de la propiedad descuento1.
     * 
     */
    public void setDescuento1(double value) {
        this.descuento1 = value;
    }

    /**
     * Obtiene el valor de la propiedad descuento2.
     * 
     */
    public double getDescuento2() {
        return descuento2;
    }

    /**
     * Define el valor de la propiedad descuento2.
     * 
     */
    public void setDescuento2(double value) {
        this.descuento2 = value;
    }

    /**
     * Obtiene el valor de la propiedad descuento3.
     * 
     */
    public double getDescuento3() {
        return descuento3;
    }

    /**
     * Define el valor de la propiedad descuento3.
     * 
     */
    public void setDescuento3(double value) {
        this.descuento3 = value;
    }

    /**
     * Obtiene el valor de la propiedad descuento4.
     * 
     */
    public double getDescuento4() {
        return descuento4;
    }

    /**
     * Define el valor de la propiedad descuento4.
     * 
     */
    public void setDescuento4(double value) {
        this.descuento4 = value;
    }

}
