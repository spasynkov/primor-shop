
package org.netbeans.xml.schema.gestion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrecioArticulo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
@XmlType(name = "PrecioArticulo", propOrder = {
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
     * Gets the value of the pvp property.
     * 
     */
    public double getPvp() {
        return pvp;
    }

    /**
     * Sets the value of the pvp property.
     * 
     */
    public void setPvp(double value) {
        this.pvp = value;
    }

    /**
     * Gets the value of the precioMedio property.
     * 
     */
    public double getPrecioMedio() {
        return precioMedio;
    }

    /**
     * Sets the value of the precioMedio property.
     * 
     */
    public void setPrecioMedio(double value) {
        this.precioMedio = value;
    }

    /**
     * Gets the value of the costo property.
     * 
     */
    public double getCosto() {
        return costo;
    }

    /**
     * Sets the value of the costo property.
     * 
     */
    public void setCosto(double value) {
        this.costo = value;
    }

    /**
     * Gets the value of the precioUltimaCompra property.
     * 
     */
    public double getPrecioUltimaCompra() {
        return precioUltimaCompra;
    }

    /**
     * Sets the value of the precioUltimaCompra property.
     * 
     */
    public void setPrecioUltimaCompra(double value) {
        this.precioUltimaCompra = value;
    }

    /**
     * Gets the value of the descuento1 property.
     * 
     */
    public double getDescuento1() {
        return descuento1;
    }

    /**
     * Sets the value of the descuento1 property.
     * 
     */
    public void setDescuento1(double value) {
        this.descuento1 = value;
    }

    /**
     * Gets the value of the descuento2 property.
     * 
     */
    public double getDescuento2() {
        return descuento2;
    }

    /**
     * Sets the value of the descuento2 property.
     * 
     */
    public void setDescuento2(double value) {
        this.descuento2 = value;
    }

    /**
     * Gets the value of the descuento3 property.
     * 
     */
    public double getDescuento3() {
        return descuento3;
    }

    /**
     * Sets the value of the descuento3 property.
     * 
     */
    public void setDescuento3(double value) {
        this.descuento3 = value;
    }

    /**
     * Gets the value of the descuento4 property.
     * 
     */
    public double getDescuento4() {
        return descuento4;
    }

    /**
     * Sets the value of the descuento4 property.
     * 
     */
    public void setDescuento4(double value) {
        this.descuento4 = value;
    }

}
