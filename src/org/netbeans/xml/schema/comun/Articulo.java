
package org.netbeans.xml.schema.comun;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Articulo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Articulo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DescripcionAbreviada" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Referencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CodigoBarras" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UnidadesCodigoBarras" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="FechaUltimaCompra" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Proveedor" type="{http://xml.netbeans.org/schema/comun}Proveedor"/>
 *         &lt;element name="Familia" type="{http://xml.netbeans.org/schema/comun}Tabla"/>
 *         &lt;element name="Marca" type="{http://xml.netbeans.org/schema/comun}Tabla"/>
 *         &lt;element name="UnidadesPrecio" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="StockMin" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="StockMax" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ControlLote" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="ControlCaducidad" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="TipoUnidad" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="Conversion1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Conversion2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Ubicacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IdIva" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Articulo", propOrder = {
    "codigo",
    "descripcion",
    "descripcionAbreviada",
    "referencia",
    "codigoBarras",
    "unidadesCodigoBarras",
    "fechaUltimaCompra",
    "proveedor",
    "familia",
    "marca",
    "unidadesPrecio",
    "estado",
    "stockMin",
    "stockMax",
    "controlLote",
    "controlCaducidad",
    "tipoUnidad",
    "conversion1",
    "conversion2",
    "ubicacion",
    "idIva"
})
public class Articulo {

    @XmlElement(name = "Codigo", required = true)
    protected String codigo;
    @XmlElement(name = "Descripcion", required = true)
    protected String descripcion;
    @XmlElement(name = "DescripcionAbreviada", required = true)
    protected String descripcionAbreviada;
    @XmlElement(name = "Referencia", required = true)
    protected String referencia;
    @XmlElement(name = "CodigoBarras", required = true)
    protected String codigoBarras;
    @XmlElement(name = "UnidadesCodigoBarras")
    @XmlSchemaType(name = "unsignedShort")
    protected int unidadesCodigoBarras;
    @XmlElement(name = "FechaUltimaCompra", required = true)
    protected String fechaUltimaCompra;
    @XmlElement(name = "Proveedor", required = true)
    protected Proveedor proveedor;
    @XmlElement(name = "Familia", required = true)
    protected Tabla familia;
    @XmlElement(name = "Marca", required = true)
    protected Tabla marca;
    @XmlElement(name = "UnidadesPrecio")
    protected double unidadesPrecio;
    @XmlElement(name = "Estado")
    protected byte estado;
    @XmlElement(name = "StockMin")
    protected double stockMin;
    @XmlElement(name = "StockMax")
    protected double stockMax;
    @XmlElement(name = "ControlLote")
    protected byte controlLote;
    @XmlElement(name = "ControlCaducidad")
    protected byte controlCaducidad;
    @XmlElement(name = "TipoUnidad")
    protected byte tipoUnidad;
    @XmlElement(name = "Conversion1")
    protected double conversion1;
    @XmlElement(name = "Conversion2")
    protected double conversion2;
    @XmlElement(name = "Ubicacion", required = true)
    protected String ubicacion;
    @XmlElement(name = "IdIva")
    @XmlSchemaType(name = "unsignedInt")
    protected long idIva;

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
     * Gets the value of the descripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Sets the value of the descripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Gets the value of the descripcionAbreviada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionAbreviada() {
        return descripcionAbreviada;
    }

    /**
     * Sets the value of the descripcionAbreviada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionAbreviada(String value) {
        this.descripcionAbreviada = value;
    }

    /**
     * Gets the value of the referencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencia() {
        return referencia;
    }

    /**
     * Sets the value of the referencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencia(String value) {
        this.referencia = value;
    }

    /**
     * Gets the value of the codigoBarras property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoBarras() {
        return codigoBarras;
    }

    /**
     * Sets the value of the codigoBarras property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoBarras(String value) {
        this.codigoBarras = value;
    }

    /**
     * Gets the value of the unidadesCodigoBarras property.
     * 
     */
    public int getUnidadesCodigoBarras() {
        return unidadesCodigoBarras;
    }

    /**
     * Sets the value of the unidadesCodigoBarras property.
     * 
     */
    public void setUnidadesCodigoBarras(int value) {
        this.unidadesCodigoBarras = value;
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

    /**
     * Gets the value of the proveedor property.
     * 
     * @return
     *     possible object is
     *     {@link Proveedor }
     *     
     */
    public Proveedor getProveedor() {
        return proveedor;
    }

    /**
     * Sets the value of the proveedor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Proveedor }
     *     
     */
    public void setProveedor(Proveedor value) {
        this.proveedor = value;
    }

    /**
     * Gets the value of the familia property.
     * 
     * @return
     *     possible object is
     *     {@link Tabla }
     *     
     */
    public Tabla getFamilia() {
        return familia;
    }

    /**
     * Sets the value of the familia property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tabla }
     *     
     */
    public void setFamilia(Tabla value) {
        this.familia = value;
    }

    /**
     * Gets the value of the marca property.
     * 
     * @return
     *     possible object is
     *     {@link Tabla }
     *     
     */
    public Tabla getMarca() {
        return marca;
    }

    /**
     * Sets the value of the marca property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tabla }
     *     
     */
    public void setMarca(Tabla value) {
        this.marca = value;
    }

    /**
     * Gets the value of the unidadesPrecio property.
     * 
     */
    public double getUnidadesPrecio() {
        return unidadesPrecio;
    }

    /**
     * Sets the value of the unidadesPrecio property.
     * 
     */
    public void setUnidadesPrecio(double value) {
        this.unidadesPrecio = value;
    }

    /**
     * Gets the value of the estado property.
     * 
     */
    public byte getEstado() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     * 
     */
    public void setEstado(byte value) {
        this.estado = value;
    }

    /**
     * Gets the value of the stockMin property.
     * 
     */
    public double getStockMin() {
        return stockMin;
    }

    /**
     * Sets the value of the stockMin property.
     * 
     */
    public void setStockMin(double value) {
        this.stockMin = value;
    }

    /**
     * Gets the value of the stockMax property.
     * 
     */
    public double getStockMax() {
        return stockMax;
    }

    /**
     * Sets the value of the stockMax property.
     * 
     */
    public void setStockMax(double value) {
        this.stockMax = value;
    }

    /**
     * Gets the value of the controlLote property.
     * 
     */
    public byte getControlLote() {
        return controlLote;
    }

    /**
     * Sets the value of the controlLote property.
     * 
     */
    public void setControlLote(byte value) {
        this.controlLote = value;
    }

    /**
     * Gets the value of the controlCaducidad property.
     * 
     */
    public byte getControlCaducidad() {
        return controlCaducidad;
    }

    /**
     * Sets the value of the controlCaducidad property.
     * 
     */
    public void setControlCaducidad(byte value) {
        this.controlCaducidad = value;
    }

    /**
     * Gets the value of the tipoUnidad property.
     * 
     */
    public byte getTipoUnidad() {
        return tipoUnidad;
    }

    /**
     * Sets the value of the tipoUnidad property.
     * 
     */
    public void setTipoUnidad(byte value) {
        this.tipoUnidad = value;
    }

    /**
     * Gets the value of the conversion1 property.
     * 
     */
    public double getConversion1() {
        return conversion1;
    }

    /**
     * Sets the value of the conversion1 property.
     * 
     */
    public void setConversion1(double value) {
        this.conversion1 = value;
    }

    /**
     * Gets the value of the conversion2 property.
     * 
     */
    public double getConversion2() {
        return conversion2;
    }

    /**
     * Sets the value of the conversion2 property.
     * 
     */
    public void setConversion2(double value) {
        this.conversion2 = value;
    }

    /**
     * Gets the value of the ubicacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * Sets the value of the ubicacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUbicacion(String value) {
        this.ubicacion = value;
    }

    /**
     * Gets the value of the idIva property.
     * 
     */
    public long getIdIva() {
        return idIva;
    }

    /**
     * Sets the value of the idIva property.
     * 
     */
    public void setIdIva(long value) {
        this.idIva = value;
    }

}
