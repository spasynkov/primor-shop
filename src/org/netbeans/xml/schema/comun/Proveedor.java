
package org.netbeans.xml.schema.comun;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Proveedor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Proveedor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FechaUltimaCompra" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Proveedor", propOrder = {
    "codigo",
    "nombre",
    "fechaUltimaCompra"
})
public class Proveedor {

    @XmlElement(name = "Codigo", required = true)
    protected String codigo;
    @XmlElement(name = "Nombre", required = true)
    protected String nombre;
    @XmlElement(name = "FechaUltimaCompra", required = true)
    protected String fechaUltimaCompra;

    /**
     * Gets the value of the codigo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Sets the value of the codigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Gets the value of the nombre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets the value of the nombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Gets the value of the fechaUltimaCompra property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaUltimaCompra() {
        return fechaUltimaCompra;
    }

    /**
     * Sets the value of the fechaUltimaCompra property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaUltimaCompra(String value) {
        this.fechaUltimaCompra = value;
    }

}
