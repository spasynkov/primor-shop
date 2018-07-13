
package org.netbeans.xml.schema.gestion;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.netbeans.xml.schema.comun.Cliente;
import org.netbeans.xml.schema.comun.Persona;


/**
 * <p>Java class for PedidoExt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
@XmlType(name = "PedidoExt", propOrder = {
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
     * Gets the value of the serie property.
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
     * Sets the value of the serie property.
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
     * Gets the value of the numero property.
     * 
     */
    public long getNumero() {
        return numero;
    }

    /**
     * Sets the value of the numero property.
     * 
     */
    public void setNumero(long value) {
        this.numero = value;
    }

    /**
     * Gets the value of the fecha property.
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
     * Sets the value of the fecha property.
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
     * Gets the value of the suPedido property.
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
     * Sets the value of the suPedido property.
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
     * Gets the value of the fechaServicio property.
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
     * Sets the value of the fechaServicio property.
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
     * Gets the value of the cliente property.
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
     * Sets the value of the cliente property.
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

    /**
     * Gets the value of the direccionEntrega property.
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
     * Sets the value of the direccionEntrega property.
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
     * Gets the value of the direccionFacturacion property.
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
     * Sets the value of the direccionFacturacion property.
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
     * Gets the value of the formaPago property.
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
     * Sets the value of the formaPago property.
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
     * Gets the value of the bruto property.
     * 
     */
    public double getBruto() {
        return bruto;
    }

    /**
     * Sets the value of the bruto property.
     * 
     */
    public void setBruto(double value) {
        this.bruto = value;
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
     * Gets the value of the referenciaPago property.
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
     * Sets the value of the referenciaPago property.
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
     * Gets the value of the gastosEnvio property.
     * 
     */
    public double getGastosEnvio() {
        return gastosEnvio;
    }

    /**
     * Sets the value of the gastosEnvio property.
     * 
     */
    public void setGastosEnvio(double value) {
        this.gastosEnvio = value;
    }

    /**
     * Gets the value of the agenciaTransporte property.
     * 
     */
    public short getAgenciaTransporte() {
        return agenciaTransporte;
    }

    /**
     * Sets the value of the agenciaTransporte property.
     * 
     */
    public void setAgenciaTransporte(short value) {
        this.agenciaTransporte = value;
    }

    /**
     * Gets the value of the retorno property.
     * 
     */
    public short getRetorno() {
        return retorno;
    }

    /**
     * Sets the value of the retorno property.
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
     * Gets the value of the centroRecogida property.
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
     * Sets the value of the centroRecogida property.
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
     * Gets the value of the paraRegalo property.
     * 
     */
    public boolean isParaRegalo() {
        return paraRegalo;
    }

    /**
     * Sets the value of the paraRegalo property.
     * 
     */
    public void setParaRegalo(boolean value) {
        this.paraRegalo = value;
    }

    /**
     * Gets the value of the paraRegaloMsg property.
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
     * Sets the value of the paraRegaloMsg property.
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
