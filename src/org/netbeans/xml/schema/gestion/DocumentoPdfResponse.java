
package org.netbeans.xml.schema.gestion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.netbeans.xml.schema.comun.Respuesta;


/**
 * <p>Java class for DocumentoPdfResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentoPdfResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocumentoPdf" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="Respuesta" type="{http://xml.netbeans.org/schema/comun}Respuesta" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentoPdfResponse", propOrder = {
    "documentoPdf",
    "respuesta"
})
public class DocumentoPdfResponse {

    @XmlElement(name = "DocumentoPdf", required = true)
    protected String documentoPdf;
    @XmlElement(name = "Respuesta", required = true)
    protected Respuesta respuesta;

    /**
     * Gets the value of the documentoPdf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentoPdf() {
        return documentoPdf;
    }

    /**
     * Sets the value of the documentoPdf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentoPdf(String value) {
        this.documentoPdf = value;
    }

    /**
     * Gets the value of the respuesta property.
     * 
     * @return
     *     possible object is
     *     {@link Respuesta }
     *     
     */
    public Respuesta getRespuesta() {
        return respuesta;
    }

    /**
     * Sets the value of the respuesta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Respuesta }
     *     
     */
    public void setRespuesta(Respuesta value) {
        this.respuesta = value;
    }

}
