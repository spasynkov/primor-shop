
package lr.wsGestion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PedidoLinea complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
@XmlType(name = "PedidoLinea", namespace = "http://xml.netbeans.org/schema/gestion", propOrder = {
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
     * Obtiene el valor de la propiedad numeroLinea.
     * 
     */
    public long getNumeroLinea() {
        return numeroLinea;
    }

    /**
     * Define el valor de la propiedad numeroLinea.
     * 
     */
    public void setNumeroLinea(long value) {
        this.numeroLinea = value;
    }

    /**
     * Obtiene el valor de la propiedad articulo.
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
     * Define el valor de la propiedad articulo.
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
     * Obtiene el valor de la propiedad unidad1.
     * 
     */
    public double getUnidad1() {
        return unidad1;
    }

    /**
     * Define el valor de la propiedad unidad1.
     * 
     */
    public void setUnidad1(double value) {
        this.unidad1 = value;
    }

    /**
     * Obtiene el valor de la propiedad unidad2.
     * 
     */
    public double getUnidad2() {
        return unidad2;
    }

    /**
     * Define el valor de la propiedad unidad2.
     * 
     */
    public void setUnidad2(double value) {
        this.unidad2 = value;
    }

    /**
     * Obtiene el valor de la propiedad unidad3.
     * 
     */
    public double getUnidad3() {
        return unidad3;
    }

    /**
     * Define el valor de la propiedad unidad3.
     * 
     */
    public void setUnidad3(double value) {
        this.unidad3 = value;
    }

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
     * Obtiene el valor de la propiedad descuento.
     * 
     */
    public double getDescuento() {
        return descuento;
    }

    /**
     * Define el valor de la propiedad descuento.
     * 
     */
    public void setDescuento(double value) {
        this.descuento = value;
    }

    /**
     * Obtiene el valor de la propiedad importe.
     * 
     */
    public double getImporte() {
        return importe;
    }

    /**
     * Define el valor de la propiedad importe.
     * 
     */
    public void setImporte(double value) {
        this.importe = value;
    }

    /**
     * Obtiene el valor de la propiedad observaciones.
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
     * Define el valor de la propiedad observaciones.
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
