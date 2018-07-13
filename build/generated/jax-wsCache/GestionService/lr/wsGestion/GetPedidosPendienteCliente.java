
package lr.wsGestion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getPedidosPendienteCliente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getPedidosPendienteCliente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="grupo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clienteCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clienteCentro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPedidosPendienteCliente", propOrder = {
    "usuario",
    "password",
    "grupo",
    "clienteCodigo",
    "clienteCentro"
})
public class GetPedidosPendienteCliente {

    @XmlElement(namespace = "")
    protected String usuario;
    @XmlElement(namespace = "")
    protected String password;
    @XmlElement(namespace = "")
    protected String grupo;
    @XmlElement(namespace = "")
    protected String clienteCodigo;
    @XmlElement(namespace = "")
    protected String clienteCentro;

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

    /**
     * Obtiene el valor de la propiedad password.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Define el valor de la propiedad password.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Obtiene el valor de la propiedad grupo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrupo() {
        return grupo;
    }

    /**
     * Define el valor de la propiedad grupo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrupo(String value) {
        this.grupo = value;
    }

    /**
     * Obtiene el valor de la propiedad clienteCodigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClienteCodigo() {
        return clienteCodigo;
    }

    /**
     * Define el valor de la propiedad clienteCodigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClienteCodigo(String value) {
        this.clienteCodigo = value;
    }

    /**
     * Obtiene el valor de la propiedad clienteCentro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClienteCentro() {
        return clienteCentro;
    }

    /**
     * Define el valor de la propiedad clienteCentro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClienteCentro(String value) {
        this.clienteCentro = value;
    }

}
