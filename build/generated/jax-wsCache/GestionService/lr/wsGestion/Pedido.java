
package lr.wsGestion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Pedido complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Pedido">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Serie" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" form="qualified"/>
 *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="FechaServicio" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="Cliente" type="{http://xml.netbeans.org/schema/comun}Cliente" form="qualified"/>
 *         &lt;element name="Unidades" type="{http://www.w3.org/2001/XMLSchema}double" form="qualified"/>
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
@XmlType(name = "Pedido", namespace = "http://xml.netbeans.org/schema/gestion", propOrder = {
    "serie",
    "numero",
    "fecha",
    "fechaServicio",
    "cliente",
    "unidades",
    "importe",
    "observaciones"
})
public class Pedido {

    @XmlElement(name = "Serie", required = true)
    protected String serie;
    @XmlElement(name = "Numero")
    @XmlSchemaType(name = "unsignedInt")
    protected long numero;
    @XmlElement(name = "Fecha", required = true)
    protected String fecha;
    @XmlElement(name = "FechaServicio", required = true)
    protected String fechaServicio;
    @XmlElement(name = "Cliente", required = true)
    protected Cliente cliente;
    @XmlElement(name = "Unidades")
    protected double unidades;
    @XmlElement(name = "Importe")
    protected double importe;
    @XmlElement(name = "Observaciones", required = true)
    protected String observaciones;

    /**
     * Obtiene el valor de la propiedad serie.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerie() {
        return serie;
    }

    /**
     * Define el valor de la propiedad serie.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerie(String value) {
        this.serie = value;
    }

    /**
     * Obtiene el valor de la propiedad numero.
     * 
     */
    public long getNumero() {
        return numero;
    }

    /**
     * Define el valor de la propiedad numero.
     * 
     */
    public void setNumero(long value) {
        this.numero = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaServicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaServicio() {
        return fechaServicio;
    }

    /**
     * Define el valor de la propiedad fechaServicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaServicio(String value) {
        this.fechaServicio = value;
    }

    /**
     * Obtiene el valor de la propiedad cliente.
     * 
     * @return
     *     possible object is
     *     {@link Cliente }
     *     
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Define el valor de la propiedad cliente.
     * 
     * @param value
     *     allowed object is
     *     {@link Cliente }
     *     
     */
    public void setCliente(Cliente value) {
        this.cliente = value;
    }

    /**
     * Obtiene el valor de la propiedad unidades.
     * 
     */
    public double getUnidades() {
        return unidades;
    }

    /**
     * Define el valor de la propiedad unidades.
     * 
     */
    public void setUnidades(double value) {
        this.unidades = value;
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
