
package lr.wsGestion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Articulo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
@XmlType(name = "Articulo", namespace = "http://xml.netbeans.org/schema/comun", propOrder = {
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
     * Obtiene el valor de la propiedad codigo.
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
     * Define el valor de la propiedad codigo.
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
     * Obtiene el valor de la propiedad descripcion.
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
     * Define el valor de la propiedad descripcion.
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
     * Obtiene el valor de la propiedad descripcionAbreviada.
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
     * Define el valor de la propiedad descripcionAbreviada.
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
     * Obtiene el valor de la propiedad referencia.
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
     * Define el valor de la propiedad referencia.
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
     * Obtiene el valor de la propiedad codigoBarras.
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
     * Define el valor de la propiedad codigoBarras.
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
     * Obtiene el valor de la propiedad unidadesCodigoBarras.
     * 
     */
    public int getUnidadesCodigoBarras() {
        return unidadesCodigoBarras;
    }

    /**
     * Define el valor de la propiedad unidadesCodigoBarras.
     * 
     */
    public void setUnidadesCodigoBarras(int value) {
        this.unidadesCodigoBarras = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaUltimaCompra.
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
     * Define el valor de la propiedad fechaUltimaCompra.
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
     * Obtiene el valor de la propiedad proveedor.
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
     * Define el valor de la propiedad proveedor.
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
     * Obtiene el valor de la propiedad familia.
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
     * Define el valor de la propiedad familia.
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
     * Obtiene el valor de la propiedad marca.
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
     * Define el valor de la propiedad marca.
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
     * Obtiene el valor de la propiedad unidadesPrecio.
     * 
     */
    public double getUnidadesPrecio() {
        return unidadesPrecio;
    }

    /**
     * Define el valor de la propiedad unidadesPrecio.
     * 
     */
    public void setUnidadesPrecio(double value) {
        this.unidadesPrecio = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     */
    public byte getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     */
    public void setEstado(byte value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad stockMin.
     * 
     */
    public double getStockMin() {
        return stockMin;
    }

    /**
     * Define el valor de la propiedad stockMin.
     * 
     */
    public void setStockMin(double value) {
        this.stockMin = value;
    }

    /**
     * Obtiene el valor de la propiedad stockMax.
     * 
     */
    public double getStockMax() {
        return stockMax;
    }

    /**
     * Define el valor de la propiedad stockMax.
     * 
     */
    public void setStockMax(double value) {
        this.stockMax = value;
    }

    /**
     * Obtiene el valor de la propiedad controlLote.
     * 
     */
    public byte getControlLote() {
        return controlLote;
    }

    /**
     * Define el valor de la propiedad controlLote.
     * 
     */
    public void setControlLote(byte value) {
        this.controlLote = value;
    }

    /**
     * Obtiene el valor de la propiedad controlCaducidad.
     * 
     */
    public byte getControlCaducidad() {
        return controlCaducidad;
    }

    /**
     * Define el valor de la propiedad controlCaducidad.
     * 
     */
    public void setControlCaducidad(byte value) {
        this.controlCaducidad = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoUnidad.
     * 
     */
    public byte getTipoUnidad() {
        return tipoUnidad;
    }

    /**
     * Define el valor de la propiedad tipoUnidad.
     * 
     */
    public void setTipoUnidad(byte value) {
        this.tipoUnidad = value;
    }

    /**
     * Obtiene el valor de la propiedad conversion1.
     * 
     */
    public double getConversion1() {
        return conversion1;
    }

    /**
     * Define el valor de la propiedad conversion1.
     * 
     */
    public void setConversion1(double value) {
        this.conversion1 = value;
    }

    /**
     * Obtiene el valor de la propiedad conversion2.
     * 
     */
    public double getConversion2() {
        return conversion2;
    }

    /**
     * Define el valor de la propiedad conversion2.
     * 
     */
    public void setConversion2(double value) {
        this.conversion2 = value;
    }

    /**
     * Obtiene el valor de la propiedad ubicacion.
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
     * Define el valor de la propiedad ubicacion.
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
     * Obtiene el valor de la propiedad idIva.
     * 
     */
    public long getIdIva() {
        return idIva;
    }

    /**
     * Define el valor de la propiedad idIva.
     * 
     */
    public void setIdIva(long value) {
        this.idIva = value;
    }

}
