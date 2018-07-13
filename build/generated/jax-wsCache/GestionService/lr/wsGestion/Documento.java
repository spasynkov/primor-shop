
package lr.wsGestion;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Documento complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
@XmlType(name = "Documento", namespace = "http://xml.netbeans.org/schema/gestion", propOrder = {
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
     * Obtiene el valor de la propiedad tipoDocumento.
     * 
     */
    public short getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Define el valor de la propiedad tipoDocumento.
     * 
     */
    public void setTipoDocumento(short value) {
        this.tipoDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoVenta.
     * 
     */
    public short getTipoVenta() {
        return tipoVenta;
    }

    /**
     * Define el valor de la propiedad tipoVenta.
     * 
     */
    public void setTipoVenta(short value) {
        this.tipoVenta = value;
    }

    /**
     * Obtiene el valor de la propiedad tipo.
     * 
     */
    public short getTipo() {
        return tipo;
    }

    /**
     * Define el valor de la propiedad tipo.
     * 
     */
    public void setTipo(short value) {
        this.tipo = value;
    }

    /**
     * Obtiene el valor de la propiedad unidades.
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
     * Define el valor de la propiedad unidades.
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
     * Obtiene el valor de la propiedad efectivo.
     * 
     */
    public double getEfectivo() {
        return efectivo;
    }

    /**
     * Define el valor de la propiedad efectivo.
     * 
     */
    public void setEfectivo(double value) {
        this.efectivo = value;
    }

    /**
     * Obtiene el valor de la propiedad dto1.
     * 
     */
    public double getDto1() {
        return dto1;
    }

    /**
     * Define el valor de la propiedad dto1.
     * 
     */
    public void setDto1(double value) {
        this.dto1 = value;
    }

    /**
     * Obtiene el valor de la propiedad dto2.
     * 
     */
    public double getDto2() {
        return dto2;
    }

    /**
     * Define el valor de la propiedad dto2.
     * 
     */
    public void setDto2(double value) {
        this.dto2 = value;
    }

    /**
     * Obtiene el valor de la propiedad dtoPP.
     * 
     */
    public double getDtoPP() {
        return dtoPP;
    }

    /**
     * Define el valor de la propiedad dtoPP.
     * 
     */
    public void setDtoPP(double value) {
        this.dtoPP = value;
    }

    /**
     * Obtiene el valor de la propiedad iDto1.
     * 
     */
    public double getIDto1() {
        return iDto1;
    }

    /**
     * Define el valor de la propiedad iDto1.
     * 
     */
    public void setIDto1(double value) {
        this.iDto1 = value;
    }

    /**
     * Obtiene el valor de la propiedad iDto2.
     * 
     */
    public double getIDto2() {
        return iDto2;
    }

    /**
     * Define el valor de la propiedad iDto2.
     * 
     */
    public void setIDto2(double value) {
        this.iDto2 = value;
    }

    /**
     * Obtiene el valor de la propiedad iDtoPP.
     * 
     */
    public double getIDtoPP() {
        return iDtoPP;
    }

    /**
     * Define el valor de la propiedad iDtoPP.
     * 
     */
    public void setIDtoPP(double value) {
        this.iDtoPP = value;
    }

    /**
     * Obtiene el valor de la propiedad bases.
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
     * Define el valor de la propiedad bases.
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
     * Obtiene el valor de la propiedad iva.
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
     * Define el valor de la propiedad iva.
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
     * Obtiene el valor de la propiedad importeIva.
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
     * Define el valor de la propiedad importeIva.
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
     * Obtiene el valor de la propiedad recargo.
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
     * Define el valor de la propiedad recargo.
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
     * Obtiene el valor de la propiedad importeRecargo.
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
     * Define el valor de la propiedad importeRecargo.
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
     * Obtiene el valor de la propiedad suDepartamento.
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
     * Define el valor de la propiedad suDepartamento.
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
     * Obtiene el valor de la propiedad identicket.
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
     * Define el valor de la propiedad identicket.
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
     * Obtiene el valor de la propiedad distribucion.
     * 
     */
    public short getDistribucion() {
        return distribucion;
    }

    /**
     * Define el valor de la propiedad distribucion.
     * 
     */
    public void setDistribucion(short value) {
        this.distribucion = value;
    }

    /**
     * Obtiene el valor de la propiedad incidenciaDocumento.
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
     * Define el valor de la propiedad incidenciaDocumento.
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
     * Obtiene el valor de la propiedad proveedor.
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
     * Define el valor de la propiedad proveedor.
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
     * Obtiene el valor de la propiedad formaPago.
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
     * Define el valor de la propiedad formaPago.
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
