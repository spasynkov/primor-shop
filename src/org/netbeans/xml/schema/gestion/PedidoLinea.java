
package org.netbeans.xml.schema.gestion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.netbeans.xml.schema.comun.Articulo;


/**
 * <p>Java class for PedidoLinea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PedidoLinea">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumeroLinea" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" form="qualified"/>
 *         &lt;element name="Articulo" type="{http://xml.netbeans.org/schema/comun}Articulo" form="qualified"/>
 *         &lt;element name="Unidad1" type="{http://www.w3.org/2001/XMLSchema}double" form="qualified"/>
 *         &lt;element name="Unidad2" type="{http://www.w3.org/2001/XMLSchema}double" form="qualified"/>
 *         &lt;element name="Unidad3" type="{http://www.w3.org/2001/XMLSchema}double" form="qualified"/>
 *         &lt;element name="Pvp" type="{http://www.w3.org/2001/XMLSchema}double" form="qualified"/>
 *         &lt;element name="Descuento" type="{http://www.w3.org/2001/XMLSchema}double" form="qualified"/>
 *         &lt;element name="Importe" type="{http://www.w3.org/2001/XMLSchema}double" form="qualified"/>
 *         &lt;element name="Observaciones" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PedidoLinea", propOrder = {
    "numeroLinea",
    "articulo",
    "unidad1",
    "unidad2",
    "unidad3",
    "pvp",
    "descuento",
    "importe",
    "observaciones"
})
public class PedidoLinea {

    @XmlElement(name = "NumeroLinea")
    @XmlSchemaType(name = "unsignedInt")
    protected long numeroLinea;
    @XmlElement(name = "Articulo", required = true)
    protected Articulo articulo;
    @XmlElement(name = "Unidad1")
    protected double unidad1;
    @XmlElement(name = "Unidad2")
    protected double unidad2;
    @XmlElement(name = "Unidad3")
    protected double unidad3;
    @XmlElement(name = "Pvp")
    protected double pvp;
    @XmlElement(name = "Descuento")
    protected double descuento;
    @XmlElement(name = "Importe")
    protected double importe;
    @XmlElement(name = "Observaciones", required = true)
    protected String observaciones;

    /**
     * Gets the value of the numeroLinea property.
     * 
     */
    public long getNumeroLinea() {
        return numeroLinea;
    }

    /**
     * Sets the value of the numeroLinea property.
     * 
     */
    public void setNumeroLinea(long value) {
        this.numeroLinea = value;
    }

    /**
     * Gets the value of the articulo property.
     * 
     * @return
     *     possible object is
     *     {@link Articulo }
     *     
     */
    public Articulo getArticulo() {
        return articulo;
    }

    /**
     * Sets the value of the articulo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Articulo }
     *     
     */
    public void setArticulo(Articulo value) {
        this.articulo = value;
    }

    /**
     * Gets the value of the unidad1 property.
     * 
     */
    public double getUnidad1() {
        return unidad1;
    }

    /**
     * Sets the value of the unidad1 property.
     * 
     */
    public void setUnidad1(double value) {
        this.unidad1 = value;
    }

    /**
     * Gets the value of the unidad2 property.
     * 
     */
    public double getUnidad2() {
        return unidad2;
    }

    /**
     * Sets the value of the unidad2 property.
     * 
     */
    public void setUnidad2(double value) {
        this.unidad2 = value;
    }

    /**
     * Gets the value of the unidad3 property.
     * 
     */
    public double getUnidad3() {
        return unidad3;
    }

    /**
     * Sets the value of the unidad3 property.
     * 
     */
    public void setUnidad3(double value) {
        this.unidad3 = value;
    }

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
     * Gets the value of the descuento property.
     * 
     */
    public double getDescuento() {
        return descuento;
    }

    /**
     * Sets the value of the descuento property.
     * 
     */
    public void setDescuento(double value) {
        this.descuento = value;
    }

    /**
     * Gets the value of the importe property.
     * 
     */
    public double getImporte() {
        return importe;
    }

    /**
     * Sets the value of the importe property.
     * 
     */
    public void setImporte(double value) {
        this.importe = value;
    }

    /**
     * Gets the value of the observaciones property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * Sets the value of the observaciones property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservaciones(String value) {
        this.observaciones = value;
    }

}
