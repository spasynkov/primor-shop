
package lr.wsGestion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Cliente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Cliente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Centro" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NombreComercial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NombreFiscal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Domicilio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Poblacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Provincia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CodigoPostal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CIF" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Observaciones" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Telefono" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RecargoEquivalencia" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="Zona" type="{http://xml.netbeans.org/schema/comun}Tabla"/>
 *         &lt;element name="Ruta" type="{http://xml.netbeans.org/schema/comun}Tabla"/>
 *         &lt;element name="FormaPago" type="{http://xml.netbeans.org/schema/comun}Tabla"/>
 *         &lt;element name="Representante" type="{http://xml.netbeans.org/schema/comun}Tabla"/>
 *         &lt;element name="Autoventa" type="{http://xml.netbeans.org/schema/comun}Tabla"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cliente", namespace = "http://xml.netbeans.org/schema/comun", propOrder = {
    "codigo",
    "centro",
    "nombreComercial",
    "nombreFiscal",
    "domicilio",
    "poblacion",
    "provincia",
    "codigoPostal",
    "cif",
    "observaciones",
    "telefono",
    "fax",
    "email",
    "recargoEquivalencia",
    "zona",
    "ruta",
    "formaPago",
    "representante",
    "autoventa"
})
public class Cliente {

    @XmlElement(name = "Codigo", required = true)
    protected String codigo;
    @XmlElement(name = "Centro", required = true)
    protected String centro;
    @XmlElement(name = "NombreComercial", required = true)
    protected String nombreComercial;
    @XmlElement(name = "NombreFiscal", required = true)
    protected String nombreFiscal;
    @XmlElement(name = "Domicilio", required = true)
    protected String domicilio;
    @XmlElement(name = "Poblacion", required = true)
    protected String poblacion;
    @XmlElement(name = "Provincia", required = true)
    protected String provincia;
    @XmlElement(name = "CodigoPostal", required = true)
    protected String codigoPostal;
    @XmlElement(name = "CIF", required = true)
    protected String cif;
    @XmlElement(name = "Observaciones", required = true)
    protected String observaciones;
    @XmlElement(name = "Telefono", required = true)
    protected String telefono;
    @XmlElement(name = "Fax", required = true)
    protected String fax;
    @XmlElement(name = "Email", required = true)
    protected String email;
    @XmlElement(name = "RecargoEquivalencia")
    protected byte recargoEquivalencia;
    @XmlElement(name = "Zona", required = true)
    protected Tabla zona;
    @XmlElement(name = "Ruta", required = true)
    protected Tabla ruta;
    @XmlElement(name = "FormaPago", required = true)
    protected Tabla formaPago;
    @XmlElement(name = "Representante", required = true)
    protected Tabla representante;
    @XmlElement(name = "Autoventa", required = true)
    protected Tabla autoventa;

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
     * Obtiene el valor de la propiedad centro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCentro() {
        return centro;
    }

    /**
     * Define el valor de la propiedad centro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCentro(String value) {
        this.centro = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreComercial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreComercial() {
        return nombreComercial;
    }

    /**
     * Define el valor de la propiedad nombreComercial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreComercial(String value) {
        this.nombreComercial = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreFiscal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreFiscal() {
        return nombreFiscal;
    }

    /**
     * Define el valor de la propiedad nombreFiscal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreFiscal(String value) {
        this.nombreFiscal = value;
    }

    /**
     * Obtiene el valor de la propiedad domicilio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * Define el valor de la propiedad domicilio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomicilio(String value) {
        this.domicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad poblacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoblacion() {
        return poblacion;
    }

    /**
     * Define el valor de la propiedad poblacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoblacion(String value) {
        this.poblacion = value;
    }

    /**
     * Obtiene el valor de la propiedad provincia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * Define el valor de la propiedad provincia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvincia(String value) {
        this.provincia = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoPostal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * Define el valor de la propiedad codigoPostal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPostal(String value) {
        this.codigoPostal = value;
    }

    /**
     * Obtiene el valor de la propiedad cif.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIF() {
        return cif;
    }

    /**
     * Define el valor de la propiedad cif.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIF(String value) {
        this.cif = value;
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
     * Obtiene el valor de la propiedad telefono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Define el valor de la propiedad telefono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefono(String value) {
        this.telefono = value;
    }

    /**
     * Obtiene el valor de la propiedad fax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Define el valor de la propiedad fax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtiene el valor de la propiedad recargoEquivalencia.
     * 
     */
    public byte getRecargoEquivalencia() {
        return recargoEquivalencia;
    }

    /**
     * Define el valor de la propiedad recargoEquivalencia.
     * 
     */
    public void setRecargoEquivalencia(byte value) {
        this.recargoEquivalencia = value;
    }

    /**
     * Obtiene el valor de la propiedad zona.
     * 
     * @return
     *     possible object is
     *     {@link Tabla }
     *     
     */
    public Tabla getZona() {
        return zona;
    }

    /**
     * Define el valor de la propiedad zona.
     * 
     * @param value
     *     allowed object is
     *     {@link Tabla }
     *     
     */
    public void setZona(Tabla value) {
        this.zona = value;
    }

    /**
     * Obtiene el valor de la propiedad ruta.
     * 
     * @return
     *     possible object is
     *     {@link Tabla }
     *     
     */
    public Tabla getRuta() {
        return ruta;
    }

    /**
     * Define el valor de la propiedad ruta.
     * 
     * @param value
     *     allowed object is
     *     {@link Tabla }
     *     
     */
    public void setRuta(Tabla value) {
        this.ruta = value;
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
     * Obtiene el valor de la propiedad representante.
     * 
     * @return
     *     possible object is
     *     {@link Tabla }
     *     
     */
    public Tabla getRepresentante() {
        return representante;
    }

    /**
     * Define el valor de la propiedad representante.
     * 
     * @param value
     *     allowed object is
     *     {@link Tabla }
     *     
     */
    public void setRepresentante(Tabla value) {
        this.representante = value;
    }

    /**
     * Obtiene el valor de la propiedad autoventa.
     * 
     * @return
     *     possible object is
     *     {@link Tabla }
     *     
     */
    public Tabla getAutoventa() {
        return autoventa;
    }

    /**
     * Define el valor de la propiedad autoventa.
     * 
     * @param value
     *     allowed object is
     *     {@link Tabla }
     *     
     */
    public void setAutoventa(Tabla value) {
        this.autoventa = value;
    }

}
