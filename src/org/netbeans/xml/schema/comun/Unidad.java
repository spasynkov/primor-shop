
package org.netbeans.xml.schema.comun;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Unidad complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Unidad">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Unid1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Unid2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Unid3" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Unidad", propOrder = {
    "unid1",
    "unid2",
    "unid3"
})
public class Unidad {

    @XmlElement(name = "Unid1")
    protected double unid1;
    @XmlElement(name = "Unid2")
    protected double unid2;
    @XmlElement(name = "Unid3")
    protected double unid3;

    /**
     * Gets the value of the unid1 property.
     * 
     */
    public double getUnid1() {
        return unid1;
    }

    /**
     * Sets the value of the unid1 property.
     * 
     */
    public void setUnid1(double value) {
        this.unid1 = value;
    }

    /**
     * Gets the value of the unid2 property.
     * 
     */
    public double getUnid2() {
        return unid2;
    }

    /**
     * Sets the value of the unid2 property.
     * 
     */
    public void setUnid2(double value) {
        this.unid2 = value;
    }

    /**
     * Gets the value of the unid3 property.
     * 
     */
    public double getUnid3() {
        return unid3;
    }

    /**
     * Sets the value of the unid3 property.
     * 
     */
    public void setUnid3(double value) {
        this.unid3 = value;
    }

}
