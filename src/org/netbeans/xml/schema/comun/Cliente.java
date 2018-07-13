
package org.netbeans.xml.schema.comun;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Cliente complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
@XmlType(name = "Cliente", propOrder = {
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
     * Gets the value of the centro property.
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
     * Sets the value of the centro property.
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
     * Gets the value of the nombreComercial property.
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
     * Sets the value of the nombreComercial property.
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
     * Gets the value of the nombreFiscal property.
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
     * Sets the value of the nombreFiscal property.
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
     * Gets the value of the domicilio property.
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
     * Sets the value of the domicilio property.
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
     * Gets the value of the poblacion property.
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
     * Sets the value of the poblacion property.
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
     * Gets the value of the provincia property.
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
     * Sets the value of the provincia property.
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
     * Gets the value of the codigoPostal property.
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
     * Sets the value of the codigoPostal property.
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
     * Gets the value of the cif property.
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
     * Sets the value of the cif property.
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
     * Gets the value of the telefono property.
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
     * Sets the value of the telefono property.
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
     * Gets the value of the fax property.
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
     * Sets the value of the fax property.
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
     * Gets the value of the email property.
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
     * Sets the value of the email property.
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
     * Gets the value of the recargoEquivalencia property.
     * 
     */
    public byte getRecargoEquivalencia() {
        return recargoEquivalencia;
    }

    /**
     * Sets the value of the recargoEquivalencia property.
     * 
     */
    public void setRecargoEquivalencia(byte value) {
        this.recargoEquivalencia = value;
    }

    /**
     * Gets the value of the zona property.
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
     * Sets the value of the zona property.
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
     * Gets the value of the ruta property.
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
     * Sets the value of the ruta property.
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
     * Gets the value of the representante property.
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
     * Sets the value of the representante property.
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
     * Gets the value of the autoventa property.
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
     * Sets the value of the autoventa property.
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
