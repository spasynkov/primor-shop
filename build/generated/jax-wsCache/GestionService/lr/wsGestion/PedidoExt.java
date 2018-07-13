
package lr.wsGestion;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PedidoExt complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PedidoExt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Serie" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" form="qualified"/>
 *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="SuPedido" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="FechaServicio" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="Cliente" type="{http://xml.netbeans.org/schema/comun}Cliente" form="qualified"/>
 *         &lt;element name="Observaciones" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="DireccionEntrega" type="{http://xml.netbeans.org/schema/comun}Persona" form="qualified"/>
 *         &lt;element name="DireccionFacturacion" type="{http://xml.netbeans.org/schema/comun}Persona" form="qualified"/>
 *         &lt;element name="FormaPago" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="Bruto" type="{http://www.w3.org/2001/XMLSchema}double" form="qualified"/>
 *         &lt;element name="Descuento" type="{http://www.w3.org/2001/XMLSchema}double" form="qualified"/>
 *         &lt;element name="Importe" type="{http://www.w3.org/2001/XMLSchema}double" form="qualified"/>
 *         &lt;element name="ReferenciaPago" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="GastosEnvio" type="{http://www.w3.org/2001/XMLSchema}double" form="qualified"/>
 *         &lt;element name="AgenciaTransporte" type="{http://www.w3.org/2001/XMLSchema}short" form="qualified"/>
 *         &lt;element name="Retorno" type="{http://www.w3.org/2001/XMLSchema}short" form="qualified"/>
 *         &lt;element name="PedidoLinea" type="{http://xml.netbeans.org/schema/gestion}PedidoLinea" maxOccurs="unbounded" form="qualified"/>
 *         &lt;element name="CentroRecogida" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="ParaRegalo" type="{http://www.w3.org/2001/XMLSchema}boolean" form="qualified"/>
 *         &lt;element name="ParaRegaloMsg" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PedidoExt", namespace = "http://xml.netbeans.org/schema/gestion", propOrder = {
    "serie",
    "numero",
    "fecha",
    "suPedido",
    "fechaServicio",
    "cliente",
    "observaciones",
    "direccionEntrega",
    "direccionFacturacion",
    "formaPago",
    "bruto",
    "descuento",
    "importe",
    "referenciaPago",
    "gastosEnvio",
    "agenciaTransporte",
    "retorno",
    "pedidoLinea",
    "centroRecogida",
    "paraRegalo",
    "paraRegaloMsg"
})
public class PedidoExt {

    @XmlElement(name = "Serie", required = true)
    protected String serie;
    @XmlElement(name = "Numero")
    @XmlSchemaType(name = "unsignedInt")
    protected long numero;
    @XmlElement(name = "Fecha", required = true)
    protected String fecha;
    @XmlElement(name = "SuPedido", required = true)
    protected String suPedido;
    @XmlElement(name = "FechaServicio", required = true)
    protected String fechaServicio;
    @XmlElement(name = "Cliente", required = true)
    protected Cliente cliente;
    @XmlElement(name = "Observaciones", required = true)
    protected String observaciones;
    @XmlElement(name = "DireccionEntrega", required = true)
    protected Persona direccionEntrega;
    @XmlElement(name = "DireccionFacturacion", required = true)
    protected Persona direccionFacturacion;
    @XmlElement(name = "FormaPago", required = true)
    protected String formaPago;
    @XmlElement(name = "Bruto")
    protected double bruto;
    @XmlElement(name = "Descuento")
    protected double descuento;
    @XmlElement(name = "Importe")
    protected double importe;
    @XmlElement(name = "ReferenciaPago", required = true)
    protected String referenciaPago;
    @XmlElement(name = "GastosEnvio")
    protected double gastosEnvio;
    @XmlElement(name = "AgenciaTransporte")
    protected short agenciaTransporte;
    @XmlElement(name = "Retorno")
    protected short retorno;
    @XmlElement(name = "PedidoLinea", required = true)
    protected List<PedidoLinea> pedidoLinea;
    @XmlElement(name = "CentroRecogida", required = true)
    protected String centroRecogida;
    @XmlElement(name = "ParaRegalo")
    protected boolean paraRegalo;
    @XmlElement(name = "ParaRegaloMsg", required = true)
    protected String paraRegaloMsg;

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
     * Obtiene el valor de la propiedad suPedido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuPedido() {
        return suPedido;
    }

    /**
     * Define el valor de la propiedad suPedido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuPedido(String value) {
        this.suPedido = value;
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

    /**
     * Obtiene el valor de la propiedad direccionEntrega.
     * 
     * @return
     *     possible object is
     *     {@link Persona }
     *     
     */
    public Persona getDireccionEntrega() {
        return direccionEntrega;
    }

    /**
     * Define el valor de la propiedad direccionEntrega.
     * 
     * @param value
     *     allowed object is
     *     {@link Persona }
     *     
     */
    public void setDireccionEntrega(Persona value) {
        this.direccionEntrega = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionFacturacion.
     * 
     * @return
     *     possible object is
     *     {@link Persona }
     *     
     */
    public Persona getDireccionFacturacion() {
        return direccionFacturacion;
    }

    /**
     * Define el valor de la propiedad direccionFacturacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Persona }
     *     
     */
    public void setDireccionFacturacion(Persona value) {
        this.direccionFacturacion = value;
    }

    /**
     * Obtiene el valor de la propiedad formaPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormaPago() {
        return formaPago;
    }

    /**
     * Define el valor de la propiedad formaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormaPago(String value) {
        this.formaPago = value;
    }

    /**
     * Obtiene el valor de la propiedad bruto.
     * 
     */
    public double getBruto() {
        return bruto;
    }

    /**
     * Define el valor de la propiedad bruto.
     * 
     */
    public void setBruto(double value) {
        this.bruto = value;
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
     * Obtiene el valor de la propiedad referenciaPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenciaPago() {
        return referenciaPago;
    }

    /**
     * Define el valor de la propiedad referenciaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenciaPago(String value) {
        this.referenciaPago = value;
    }

    /**
     * Obtiene el valor de la propiedad gastosEnvio.
     * 
     */
    public double getGastosEnvio() {
        return gastosEnvio;
    }

    /**
     * Define el valor de la propiedad gastosEnvio.
     * 
     */
    public void setGastosEnvio(double value) {
        this.gastosEnvio = value;
    }

    /**
     * Obtiene el valor de la propiedad agenciaTransporte.
     * 
     */
    public short getAgenciaTransporte() {
        return agenciaTransporte;
    }

    /**
     * Define el valor de la propiedad agenciaTransporte.
     * 
     */
    public void setAgenciaTransporte(short value) {
        this.agenciaTransporte = value;
    }

    /**
     * Obtiene el valor de la propiedad retorno.
     * 
     */
    public short getRetorno() {
        return retorno;
    }

    /**
     * Define el valor de la propiedad retorno.
     * 
     */
    public void setRetorno(short value) {
        this.retorno = value;
    }

    /**
     * Gets the value of the pedidoLinea property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pedidoLinea property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPedidoLinea().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PedidoLinea }
     * 
     * 
     */
    public List<PedidoLinea> getPedidoLinea() {
        if (pedidoLinea == null) {
            pedidoLinea = new ArrayList<PedidoLinea>();
        }
        return this.pedidoLinea;
    }

    /**
     * Obtiene el valor de la propiedad centroRecogida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCentroRecogida() {
        return centroRecogida;
    }

    /**
     * Define el valor de la propiedad centroRecogida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCentroRecogida(String value) {
        this.centroRecogida = value;
    }

    /**
     * Obtiene el valor de la propiedad paraRegalo.
     * 
     */
    public boolean isParaRegalo() {
        return paraRegalo;
    }

    /**
     * Define el valor de la propiedad paraRegalo.
     * 
     */
    public void setParaRegalo(boolean value) {
        this.paraRegalo = value;
    }

    /**
     * Obtiene el valor de la propiedad paraRegaloMsg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParaRegaloMsg() {
        return paraRegaloMsg;
    }

    /**
     * Define el valor de la propiedad paraRegaloMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParaRegaloMsg(String value) {
        this.paraRegaloMsg = value;
    }

}
