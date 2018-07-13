
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
import org.netbeans.xml.schema.comun.Tabla;
import org.netbeans.xml.schema.comun.Unidad;


/**
 * <p>Java class for Documento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Documento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Serie" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" form="qualified"/>
 *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="Cliente" type="{http://xml.netbeans.org/schema/comun}Cliente" form="qualified"/>
 *         &lt;element name="DireccionEntrega" type="{http://xml.netbeans.org/schema/comun}Persona" form="qualified"/>
 *         &lt;element name="DireccionFacturacion" type="{http://xml.netbeans.org/schema/comun}Persona" form="qualified"/>
 *         &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}short" form="qualified"/>
 *         &lt;element name="TipoVenta" type="{http://www.w3.org/2001/XMLSchema}short" form="qualified"/>
 *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}short" form="qualified"/>
 *         &lt;element name="Unidades" type="{http://xml.netbeans.org/schema/comun}Unidad" form="qualified"/>
 *         &lt;element name="Bruto" type="{http://www.w3.org/2001/XMLSchema}double" form="qualified"/>
 *         &lt;element name="Importe" type="{http://www.w3.org/2001/XMLSchema}double" form="qualified"/>
 *         &lt;element name="Efectivo" type="{http://www.w3.org/2001/XMLSchema}double" form="qualified"/>
 *         &lt;element name="Dto1" type="{http://www.w3.org/2001/XMLSchema}double" form="qualified"/>
 *         &lt;element name="Dto2" type="{http://www.w3.org/2001/XMLSchema}double" form="qualified"/>
 *         &lt;element name="DtoPP" type="{http://www.w3.org/2001/XMLSchema}double" form="qualified"/>
 *         &lt;element name="IDto1" type="{http://www.w3.org/2001/XMLSchema}double" form="qualified"/>
 *         &lt;element name="IDto2" type="{http://www.w3.org/2001/XMLSchema}double" form="qualified"/>
 *         &lt;element name="IDtoPP" type="{http://www.w3.org/2001/XMLSchema}double" form="qualified"/>
 *         &lt;element name="Bases" type="{http://xml.netbeans.org/schema/comun}Unidad" form="qualified"/>
 *         &lt;element name="Iva" type="{http://xml.netbeans.org/schema/comun}Unidad" form="qualified"/>
 *         &lt;element name="ImporteIva" type="{http://xml.netbeans.org/schema/comun}Unidad" form="qualified"/>
 *         &lt;element name="Recargo" type="{http://xml.netbeans.org/schema/comun}Unidad" form="qualified"/>
 *         &lt;element name="ImporteRecargo" type="{http://xml.netbeans.org/schema/comun}Unidad" form="qualified"/>
 *         &lt;element name="SuPedido" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="SuDepartamento" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="Identicket" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="FechaServicio" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="Observaciones" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="Distribucion" type="{http://www.w3.org/2001/XMLSchema}short" form="qualified"/>
 *         &lt;element name="IncidenciaDocumento" type="{http://xml.netbeans.org/schema/comun}Tabla" form="qualified"/>
 *         &lt;element name="Proveedor" type="{http://xml.netbeans.org/schema/comun}Tabla" form="qualified"/>
 *         &lt;element name="FormaPago" type="{http://xml.netbeans.org/schema/comun}Tabla" form="qualified"/>
 *         &lt;element name="DocumentoLinea" type="{http://xml.netbeans.org/schema/gestion}DocumentoLinea" maxOccurs="unbounded" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Documento", propOrder = {
    "serie",
    "numero",
    "fecha",
    "cliente",
    "direccionEntrega",
    "direccionFacturacion",
    "tipoDocumento",
    "tipoVenta",
    "tipo",
    "unidades",
    "bruto",
    "importe",
    "efectivo",
    "dto1",
    "dto2",
    "dtoPP",
    "iDto1",
    "iDto2",
    "iDtoPP",
    "bases",
    "iva",
    "importeIva",
    "recargo",
    "importeRecargo",
    "suPedido",
    "suDepartamento",
    "identicket",
    "fechaServicio",
    "observaciones",
    "distribucion",
    "incidenciaDocumento",
    "proveedor",
    "formaPago",
    "documentoLinea"
})
public class Documento {

    @XmlElement(name = "Serie", required = true)
    protected String serie;
    @XmlElement(name = "Numero")
    @XmlSchemaType(name = "unsignedInt")
    protected long numero;
    @XmlElement(name = "Fecha", required = true)
    protected String fecha;
    @XmlElement(name = "Cliente", required = true)
    protected Cliente cliente;
    @XmlElement(name = "DireccionEntrega", required = true)
    protected Persona direccionEntrega;
    @XmlElement(name = "DireccionFacturacion", required = true)
    protected Persona direccionFacturacion;
    @XmlElement(name = "TipoDocumento")
    protected short tipoDocumento;
    @XmlElement(name = "TipoVenta")
    protected short tipoVenta;
    @XmlElement(name = "Tipo")
    protected short tipo;
    @XmlElement(name = "Unidades", required = true)
    protected Unidad unidades;
    @XmlElement(name = "Bruto")
    protected double bruto;
    @XmlElement(name = "Importe")
    protected double importe;
    @XmlElement(name = "Efectivo")
    protected double efectivo;
    @XmlElement(name = "Dto1")
    protected double dto1;
    @XmlElement(name = "Dto2")
    protected double dto2;
    @XmlElement(name = "DtoPP")
    protected double dtoPP;
    @XmlElement(name = "IDto1")
    protected double iDto1;
    @XmlElement(name = "IDto2")
    protected double iDto2;
    @XmlElement(name = "IDtoPP")
    protected double iDtoPP;
    @XmlElement(name = "Bases", required = true)
    protected Unidad bases;
    @XmlElement(name = "Iva", required = true)
    protected Unidad iva;
    @XmlElement(name = "ImporteIva", required = true)
    protected Unidad importeIva;
    @XmlElement(name = "Recargo", required = true)
    protected Unidad recargo;
    @XmlElement(name = "ImporteRecargo", required = true)
    protected Unidad importeRecargo;
    @XmlElement(name = "SuPedido", required = true)
    protected String suPedido;
    @XmlElement(name = "SuDepartamento", required = true)
    protected String suDepartamento;
    @XmlElement(name = "Identicket", required = true)
    protected String identicket;
    @XmlElement(name = "FechaServicio", required = true)
    protected String fechaServicio;
    @XmlElement(name = "Observaciones", required = true)
    protected String observaciones;
    @XmlElement(name = "Distribucion")
    protected short distribucion;
    @XmlElement(name = "IncidenciaDocumento", required = true)
    protected Tabla incidenciaDocumento;
    @XmlElement(name = "Proveedor", required = true)
    protected Tabla proveedor;
    @XmlElement(name = "FormaPago", required = true)
    protected Tabla formaPago;
    @XmlElement(name = "DocumentoLinea", required = true)
    protected List<DocumentoLinea> documentoLinea;

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
     * Gets the value of the tipoDocumento property.
     * 
     */
    public short getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Sets the value of the tipoDocumento property.
     * 
     */
    public void setTipoDocumento(short value) {
        this.tipoDocumento = value;
    }

    /**
     * Gets the value of the tipoVenta property.
     * 
     */
    public short getTipoVenta() {
        return tipoVenta;
    }

    /**
     * Sets the value of the tipoVenta property.
     * 
     */
    public void setTipoVenta(short value) {
        this.tipoVenta = value;
    }

    /**
     * Gets the value of the tipo property.
     * 
     */
    public short getTipo() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     * 
     */
    public void setTipo(short value) {
        this.tipo = value;
    }

    /**
     * Gets the value of the unidades property.
     * 
     * @return
     *     possible object is
     *     {@link Unidad }
     *     
     */
    public Unidad getUnidades() {
        return unidades;
    }

    /**
     * Sets the value of the unidades property.
     * 
     * @param value
     *     allowed object is
     *     {@link Unidad }
     *     
     */
    public void setUnidades(Unidad value) {
        this.unidades = value;
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
     * Gets the value of the efectivo property.
     * 
     */
    public double getEfectivo() {
        return efectivo;
    }

    /**
     * Sets the value of the efectivo property.
     * 
     */
    public void setEfectivo(double value) {
        this.efectivo = value;
    }

    /**
     * Gets the value of the dto1 property.
     * 
     */
    public double getDto1() {
        return dto1;
    }

    /**
     * Sets the value of the dto1 property.
     * 
     */
    public void setDto1(double value) {
        this.dto1 = value;
    }

    /**
     * Gets the value of the dto2 property.
     * 
     */
    public double getDto2() {
        return dto2;
    }

    /**
     * Sets the value of the dto2 property.
     * 
     */
    public void setDto2(double value) {
        this.dto2 = value;
    }

    /**
     * Gets the value of the dtoPP property.
     * 
     */
    public double getDtoPP() {
        return dtoPP;
    }

    /**
     * Sets the value of the dtoPP property.
     * 
     */
    public void setDtoPP(double value) {
        this.dtoPP = value;
    }

    /**
     * Gets the value of the iDto1 property.
     * 
     */
    public double getIDto1() {
        return iDto1;
    }

    /**
     * Sets the value of the iDto1 property.
     * 
     */
    public void setIDto1(double value) {
        this.iDto1 = value;
    }

    /**
     * Gets the value of the iDto2 property.
     * 
     */
    public double getIDto2() {
        return iDto2;
    }

    /**
     * Sets the value of the iDto2 property.
     * 
     */
    public void setIDto2(double value) {
        this.iDto2 = value;
    }

    /**
     * Gets the value of the iDtoPP property.
     * 
     */
    public double getIDtoPP() {
        return iDtoPP;
    }

    /**
     * Sets the value of the iDtoPP property.
     * 
     */
    public void setIDtoPP(double value) {
        this.iDtoPP = value;
    }

    /**
     * Gets the value of the bases property.
     * 
     * @return
     *     possible object is
     *     {@link Unidad }
     *     
     */
    public Unidad getBases() {
        return bases;
    }

    /**
     * Sets the value of the bases property.
     * 
     * @param value
     *     allowed object is
     *     {@link Unidad }
     *     
     */
    public void setBases(Unidad value) {
        this.bases = value;
    }

    /**
     * Gets the value of the iva property.
     * 
     * @return
     *     possible object is
     *     {@link Unidad }
     *     
     */
    public Unidad getIva() {
        return iva;
    }

    /**
     * Sets the value of the iva property.
     * 
     * @param value
     *     allowed object is
     *     {@link Unidad }
     *     
     */
    public void setIva(Unidad value) {
        this.iva = value;
    }

    /**
     * Gets the value of the importeIva property.
     * 
     * @return
     *     possible object is
     *     {@link Unidad }
     *     
     */
    public Unidad getImporteIva() {
        return importeIva;
    }

    /**
     * Sets the value of the importeIva property.
     * 
     * @param value
     *     allowed object is
     *     {@link Unidad }
     *     
     */
    public void setImporteIva(Unidad value) {
        this.importeIva = value;
    }

    /**
     * Gets the value of the recargo property.
     * 
     * @return
     *     possible object is
     *     {@link Unidad }
     *     
     */
    public Unidad getRecargo() {
        return recargo;
    }

    /**
     * Sets the value of the recargo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Unidad }
     *     
     */
    public void setRecargo(Unidad value) {
        this.recargo = value;
    }

    /**
     * Gets the value of the importeRecargo property.
     * 
     * @return
     *     possible object is
     *     {@link Unidad }
     *     
     */
    public Unidad getImporteRecargo() {
        return importeRecargo;
    }

    /**
     * Sets the value of the importeRecargo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Unidad }
     *     
     */
    public void setImporteRecargo(Unidad value) {
        this.importeRecargo = value;
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
     * Gets the value of the suDepartamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuDepartamento() {
        return suDepartamento;
    }

    /**
     * Sets the value of the suDepartamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuDepartamento(String value) {
        this.suDepartamento = value;
    }

    /**
     * Gets the value of the identicket property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdenticket() {
        return identicket;
    }

    /**
     * Sets the value of the identicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdenticket(String value) {
        this.identicket = value;
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
     * Gets the value of the distribucion property.
     * 
     */
    public short getDistribucion() {
        return distribucion;
    }

    /**
     * Sets the value of the distribucion property.
     * 
     */
    public void setDistribucion(short value) {
        this.distribucion = value;
    }

    /**
     * Gets the value of the incidenciaDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link Tabla }
     *     
     */
    public Tabla getIncidenciaDocumento() {
        return incidenciaDocumento;
    }

    /**
     * Sets the value of the incidenciaDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tabla }
     *     
     */
    public void setIncidenciaDocumento(Tabla value) {
        this.incidenciaDocumento = value;
    }

    /**
     * Gets the value of the proveedor property.
     * 
     * @return
     *     possible object is
     *     {@link Tabla }
     *     
     */
    public Tabla getProveedor() {
        return proveedor;
    }

    /**
     * Sets the value of the proveedor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tabla }
     *     
     */
    public void setProveedor(Tabla value) {
        this.proveedor = value;
    }

    /**
     * Gets the value of the formaPago property.
     * 
     * @return
     *     possible object is
     *     {@link Tabla }
     *     
     */
    public Tabla getFormaPago() {
        return formaPago;
    }

    /**
     * Sets the value of the formaPago property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tabla }
     *     
     */
    public void setFormaPago(Tabla value) {
        this.formaPago = value;
    }

    /**
     * Gets the value of the documentoLinea property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentoLinea property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentoLinea().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentoLinea }
     * 
     * 
     */
    public List<DocumentoLinea> getDocumentoLinea() {
        if (documentoLinea == null) {
            documentoLinea = new ArrayList<DocumentoLinea>();
        }
        return this.documentoLinea;
    }

}
