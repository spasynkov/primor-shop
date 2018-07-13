
package org.netbeans.xml.schema.gestion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.netbeans.xml.schema.comun.Articulo;
import org.netbeans.xml.schema.comun.Tabla;
import org.netbeans.xml.schema.comun.Unidad;


/**
 * <p>Java class for DocumentoLinea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentoLinea">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumeroLinea" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" form="qualified"/>
 *         &lt;element name="Articulo" type="{http://xml.netbeans.org/schema/comun}Articulo" form="qualified"/>
 *         &lt;element name="Unidades" type="{http://xml.netbeans.org/schema/comun}Unidad" form="qualified"/>
 *         &lt;element name="Pvp" type="{http://www.w3.org/2001/XMLSchema}double" form="qualified"/>
 *         &lt;element name="Importe" type="{http://www.w3.org/2001/XMLSchema}double" form="qualified"/>
 *         &lt;element name="TipoLinea" type="{http://www.w3.org/2001/XMLSchema}short" form="qualified"/>
 *         &lt;element name="CantidadCobrada" type="{http://www.w3.org/2001/XMLSchema}double" form="qualified"/>
 *         &lt;element name="Precio" type="{http://www.w3.org/2001/XMLSchema}double" form="qualified"/>
 *         &lt;element name="PrecioNeto" type="{http://www.w3.org/2001/XMLSchema}double" form="qualified"/>
 *         &lt;element name="PrecioMinimo" type="{http://www.w3.org/2001/XMLSchema}double" form="qualified"/>
 *         &lt;element name="PromocionPrecio" type="{http://www.w3.org/2001/XMLSchema}double" form="qualified"/>
 *         &lt;element name="TPromocionPrecio" type="{http://xml.netbeans.org/schema/comun}Tabla" form="qualified"/>
 *         &lt;element name="TarifaAplicada" type="{http://xml.netbeans.org/schema/comun}Tabla" form="qualified"/>
 *         &lt;element name="PvpTarifa" type="{http://www.w3.org/2001/XMLSchema}double" form="qualified"/>
 *         &lt;element name="TDescuentoImporte" type="{http://xml.netbeans.org/schema/comun}Tabla" form="qualified"/>
 *         &lt;element name="TDescuentoPorcentaje1" type="{http://xml.netbeans.org/schema/comun}Tabla" form="qualified"/>
 *         &lt;element name="TDescuentoPorcentaje2" type="{http://xml.netbeans.org/schema/comun}Tabla" form="qualified"/>
 *         &lt;element name="DescuentoImporte" type="{http://www.w3.org/2001/XMLSchema}double" form="qualified"/>
 *         &lt;element name="DescuentoPorcentaje1" type="{http://www.w3.org/2001/XMLSchema}double" form="qualified"/>
 *         &lt;element name="DescuentoPorcentaje2" type="{http://www.w3.org/2001/XMLSchema}double" form="qualified"/>
 *         &lt;element name="TPromocionImporte" type="{http://xml.netbeans.org/schema/comun}Tabla" form="qualified"/>
 *         &lt;element name="TPromocionDescuento" type="{http://xml.netbeans.org/schema/comun}Tabla" form="qualified"/>
 *         &lt;element name="TPromocionMercancia" type="{http://xml.netbeans.org/schema/comun}Tabla" form="qualified"/>
 *         &lt;element name="TPromocionMercanciaEspecial" type="{http://xml.netbeans.org/schema/comun}Tabla" form="qualified"/>
 *         &lt;element name="PromocionImporte" type="{http://www.w3.org/2001/XMLSchema}double" form="qualified"/>
 *         &lt;element name="PromocionDescuento" type="{http://www.w3.org/2001/XMLSchema}double" form="qualified"/>
 *         &lt;element name="MercanciaEntrega" type="{http://www.w3.org/2001/XMLSchema}double" form="qualified"/>
 *         &lt;element name="MercanciaCobra" type="{http://www.w3.org/2001/XMLSchema}double" form="qualified"/>
 *         &lt;element name="MercanciaEspecialEntrega" type="{http://www.w3.org/2001/XMLSchema}double" form="qualified"/>
 *         &lt;element name="MercanciaEspecialCobra" type="{http://www.w3.org/2001/XMLSchema}double" form="qualified"/>
 *         &lt;element name="MercanciaEspecialArticulo" type="{http://xml.netbeans.org/schema/comun}Articulo" form="qualified"/>
 *         &lt;element name="UnidadesMercanciaEspecial" type="{http://www.w3.org/2001/XMLSchema}double" form="qualified"/>
 *         &lt;element name="Bruto" type="{http://www.w3.org/2001/XMLSchema}double" form="qualified"/>
 *         &lt;element name="Neto" type="{http://www.w3.org/2001/XMLSchema}double" form="qualified"/>
 *         &lt;element name="ImportePromocionImporte" type="{http://www.w3.org/2001/XMLSchema}double" form="qualified"/>
 *         &lt;element name="ImporteDescuentoImporte" type="{http://www.w3.org/2001/XMLSchema}double" form="qualified"/>
 *         &lt;element name="ImportePromocionPorcentaje" type="{http://www.w3.org/2001/XMLSchema}double" form="qualified"/>
 *         &lt;element name="ImporteDescuentoPorcentaje1" type="{http://www.w3.org/2001/XMLSchema}double" form="qualified"/>
 *         &lt;element name="ImporteDescuentoPorcentaje2" type="{http://www.w3.org/2001/XMLSchema}double" form="qualified"/>
 *         &lt;element name="PvpManual" type="{http://www.w3.org/2001/XMLSchema}boolean" form="qualified"/>
 *         &lt;element name="IncidenciaLinea" type="{http://xml.netbeans.org/schema/comun}Tabla" form="qualified"/>
 *         &lt;element name="Observaciones" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *         &lt;element name="IncidenciaDevolucion" type="{http://xml.netbeans.org/schema/comun}Tabla" form="qualified"/>
 *         &lt;element name="LineaManual" type="{http://www.w3.org/2001/XMLSchema}boolean" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentoLinea", propOrder = {
    "numeroLinea",
    "articulo",
    "unidades",
    "pvp",
    "importe",
    "tipoLinea",
    "cantidadCobrada",
    "precio",
    "precioNeto",
    "precioMinimo",
    "promocionPrecio",
    "tPromocionPrecio",
    "tarifaAplicada",
    "pvpTarifa",
    "tDescuentoImporte",
    "tDescuentoPorcentaje1",
    "tDescuentoPorcentaje2",
    "descuentoImporte",
    "descuentoPorcentaje1",
    "descuentoPorcentaje2",
    "tPromocionImporte",
    "tPromocionDescuento",
    "tPromocionMercancia",
    "tPromocionMercanciaEspecial",
    "promocionImporte",
    "promocionDescuento",
    "mercanciaEntrega",
    "mercanciaCobra",
    "mercanciaEspecialEntrega",
    "mercanciaEspecialCobra",
    "mercanciaEspecialArticulo",
    "unidadesMercanciaEspecial",
    "bruto",
    "neto",
    "importePromocionImporte",
    "importeDescuentoImporte",
    "importePromocionPorcentaje",
    "importeDescuentoPorcentaje1",
    "importeDescuentoPorcentaje2",
    "pvpManual",
    "incidenciaLinea",
    "observaciones",
    "incidenciaDevolucion",
    "lineaManual"
})
public class DocumentoLinea {

    @XmlElement(name = "NumeroLinea")
    @XmlSchemaType(name = "unsignedInt")
    protected long numeroLinea;
    @XmlElement(name = "Articulo", required = true)
    protected Articulo articulo;
    @XmlElement(name = "Unidades", required = true)
    protected Unidad unidades;
    @XmlElement(name = "Pvp")
    protected double pvp;
    @XmlElement(name = "Importe")
    protected double importe;
    @XmlElement(name = "TipoLinea")
    protected short tipoLinea;
    @XmlElement(name = "CantidadCobrada")
    protected double cantidadCobrada;
    @XmlElement(name = "Precio")
    protected double precio;
    @XmlElement(name = "PrecioNeto")
    protected double precioNeto;
    @XmlElement(name = "PrecioMinimo")
    protected double precioMinimo;
    @XmlElement(name = "PromocionPrecio")
    protected double promocionPrecio;
    @XmlElement(name = "TPromocionPrecio", required = true)
    protected Tabla tPromocionPrecio;
    @XmlElement(name = "TarifaAplicada", required = true)
    protected Tabla tarifaAplicada;
    @XmlElement(name = "PvpTarifa")
    protected double pvpTarifa;
    @XmlElement(name = "TDescuentoImporte", required = true)
    protected Tabla tDescuentoImporte;
    @XmlElement(name = "TDescuentoPorcentaje1", required = true)
    protected Tabla tDescuentoPorcentaje1;
    @XmlElement(name = "TDescuentoPorcentaje2", required = true)
    protected Tabla tDescuentoPorcentaje2;
    @XmlElement(name = "DescuentoImporte")
    protected double descuentoImporte;
    @XmlElement(name = "DescuentoPorcentaje1")
    protected double descuentoPorcentaje1;
    @XmlElement(name = "DescuentoPorcentaje2")
    protected double descuentoPorcentaje2;
    @XmlElement(name = "TPromocionImporte", required = true)
    protected Tabla tPromocionImporte;
    @XmlElement(name = "TPromocionDescuento", required = true)
    protected Tabla tPromocionDescuento;
    @XmlElement(name = "TPromocionMercancia", required = true)
    protected Tabla tPromocionMercancia;
    @XmlElement(name = "TPromocionMercanciaEspecial", required = true)
    protected Tabla tPromocionMercanciaEspecial;
    @XmlElement(name = "PromocionImporte")
    protected double promocionImporte;
    @XmlElement(name = "PromocionDescuento")
    protected double promocionDescuento;
    @XmlElement(name = "MercanciaEntrega")
    protected double mercanciaEntrega;
    @XmlElement(name = "MercanciaCobra")
    protected double mercanciaCobra;
    @XmlElement(name = "MercanciaEspecialEntrega")
    protected double mercanciaEspecialEntrega;
    @XmlElement(name = "MercanciaEspecialCobra")
    protected double mercanciaEspecialCobra;
    @XmlElement(name = "MercanciaEspecialArticulo", required = true)
    protected Articulo mercanciaEspecialArticulo;
    @XmlElement(name = "UnidadesMercanciaEspecial")
    protected double unidadesMercanciaEspecial;
    @XmlElement(name = "Bruto")
    protected double bruto;
    @XmlElement(name = "Neto")
    protected double neto;
    @XmlElement(name = "ImportePromocionImporte")
    protected double importePromocionImporte;
    @XmlElement(name = "ImporteDescuentoImporte")
    protected double importeDescuentoImporte;
    @XmlElement(name = "ImportePromocionPorcentaje")
    protected double importePromocionPorcentaje;
    @XmlElement(name = "ImporteDescuentoPorcentaje1")
    protected double importeDescuentoPorcentaje1;
    @XmlElement(name = "ImporteDescuentoPorcentaje2")
    protected double importeDescuentoPorcentaje2;
    @XmlElement(name = "PvpManual")
    protected boolean pvpManual;
    @XmlElement(name = "IncidenciaLinea", required = true)
    protected Tabla incidenciaLinea;
    @XmlElement(name = "Observaciones", required = true)
    protected String observaciones;
    @XmlElement(name = "IncidenciaDevolucion", required = true)
    protected Tabla incidenciaDevolucion;
    @XmlElement(name = "LineaManual")
    protected boolean lineaManual;

    /**
     * Gets the value of the numeroLinea property.
     * 
     */
    public long getNumeroLinea() {
        return numeroLinea;
    }

    /**
     * Sets the value of the numeroLinea property.
     * 
     */
    public void setNumeroLinea(long value) {
        this.numeroLinea = value;
    }

    /**
     * Gets the value of the articulo property.
     * 
     * @return
     *     possible object is
     *     {@link Articulo }
     *     
     */
    public Articulo getArticulo() {
        return articulo;
    }

    /**
     * Sets the value of the articulo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Articulo }
     *     
     */
    public void setArticulo(Articulo value) {
        this.articulo = value;
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
     * Gets the value of the pvp property.
     * 
     */
    public double getPvp() {
        return pvp;
    }

    /**
     * Sets the value of the pvp property.
     * 
     */
    public void setPvp(double value) {
        this.pvp = value;
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
     * Gets the value of the tipoLinea property.
     * 
     */
    public short getTipoLinea() {
        return tipoLinea;
    }

    /**
     * Sets the value of the tipoLinea property.
     * 
     */
    public void setTipoLinea(short value) {
        this.tipoLinea = value;
    }

    /**
     * Gets the value of the cantidadCobrada property.
     * 
     */
    public double getCantidadCobrada() {
        return cantidadCobrada;
    }

    /**
     * Sets the value of the cantidadCobrada property.
     * 
     */
    public void setCantidadCobrada(double value) {
        this.cantidadCobrada = value;
    }

    /**
     * Gets the value of the precio property.
     * 
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Sets the value of the precio property.
     * 
     */
    public void setPrecio(double value) {
        this.precio = value;
    }

    /**
     * Gets the value of the precioNeto property.
     * 
     */
    public double getPrecioNeto() {
        return precioNeto;
    }

    /**
     * Sets the value of the precioNeto property.
     * 
     */
    public void setPrecioNeto(double value) {
        this.precioNeto = value;
    }

    /**
     * Gets the value of the precioMinimo property.
     * 
     */
    public double getPrecioMinimo() {
        return precioMinimo;
    }

    /**
     * Sets the value of the precioMinimo property.
     * 
     */
    public void setPrecioMinimo(double value) {
        this.precioMinimo = value;
    }

    /**
     * Gets the value of the promocionPrecio property.
     * 
     */
    public double getPromocionPrecio() {
        return promocionPrecio;
    }

    /**
     * Sets the value of the promocionPrecio property.
     * 
     */
    public void setPromocionPrecio(double value) {
        this.promocionPrecio = value;
    }

    /**
     * Gets the value of the tPromocionPrecio property.
     * 
     * @return
     *     possible object is
     *     {@link Tabla }
     *     
     */
    public Tabla getTPromocionPrecio() {
        return tPromocionPrecio;
    }

    /**
     * Sets the value of the tPromocionPrecio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tabla }
     *     
     */
    public void setTPromocionPrecio(Tabla value) {
        this.tPromocionPrecio = value;
    }

    /**
     * Gets the value of the tarifaAplicada property.
     * 
     * @return
     *     possible object is
     *     {@link Tabla }
     *     
     */
    public Tabla getTarifaAplicada() {
        return tarifaAplicada;
    }

    /**
     * Sets the value of the tarifaAplicada property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tabla }
     *     
     */
    public void setTarifaAplicada(Tabla value) {
        this.tarifaAplicada = value;
    }

    /**
     * Gets the value of the pvpTarifa property.
     * 
     */
    public double getPvpTarifa() {
        return pvpTarifa;
    }

    /**
     * Sets the value of the pvpTarifa property.
     * 
     */
    public void setPvpTarifa(double value) {
        this.pvpTarifa = value;
    }

    /**
     * Gets the value of the tDescuentoImporte property.
     * 
     * @return
     *     possible object is
     *     {@link Tabla }
     *     
     */
    public Tabla getTDescuentoImporte() {
        return tDescuentoImporte;
    }

    /**
     * Sets the value of the tDescuentoImporte property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tabla }
     *     
     */
    public void setTDescuentoImporte(Tabla value) {
        this.tDescuentoImporte = value;
    }

    /**
     * Gets the value of the tDescuentoPorcentaje1 property.
     * 
     * @return
     *     possible object is
     *     {@link Tabla }
     *     
     */
    public Tabla getTDescuentoPorcentaje1() {
        return tDescuentoPorcentaje1;
    }

    /**
     * Sets the value of the tDescuentoPorcentaje1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tabla }
     *     
     */
    public void setTDescuentoPorcentaje1(Tabla value) {
        this.tDescuentoPorcentaje1 = value;
    }

    /**
     * Gets the value of the tDescuentoPorcentaje2 property.
     * 
     * @return
     *     possible object is
     *     {@link Tabla }
     *     
     */
    public Tabla getTDescuentoPorcentaje2() {
        return tDescuentoPorcentaje2;
    }

    /**
     * Sets the value of the tDescuentoPorcentaje2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tabla }
     *     
     */
    public void setTDescuentoPorcentaje2(Tabla value) {
        this.tDescuentoPorcentaje2 = value;
    }

    /**
     * Gets the value of the descuentoImporte property.
     * 
     */
    public double getDescuentoImporte() {
        return descuentoImporte;
    }

    /**
     * Sets the value of the descuentoImporte property.
     * 
     */
    public void setDescuentoImporte(double value) {
        this.descuentoImporte = value;
    }

    /**
     * Gets the value of the descuentoPorcentaje1 property.
     * 
     */
    public double getDescuentoPorcentaje1() {
        return descuentoPorcentaje1;
    }

    /**
     * Sets the value of the descuentoPorcentaje1 property.
     * 
     */
    public void setDescuentoPorcentaje1(double value) {
        this.descuentoPorcentaje1 = value;
    }

    /**
     * Gets the value of the descuentoPorcentaje2 property.
     * 
     */
    public double getDescuentoPorcentaje2() {
        return descuentoPorcentaje2;
    }

    /**
     * Sets the value of the descuentoPorcentaje2 property.
     * 
     */
    public void setDescuentoPorcentaje2(double value) {
        this.descuentoPorcentaje2 = value;
    }

    /**
     * Gets the value of the tPromocionImporte property.
     * 
     * @return
     *     possible object is
     *     {@link Tabla }
     *     
     */
    public Tabla getTPromocionImporte() {
        return tPromocionImporte;
    }

    /**
     * Sets the value of the tPromocionImporte property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tabla }
     *     
     */
    public void setTPromocionImporte(Tabla value) {
        this.tPromocionImporte = value;
    }

    /**
     * Gets the value of the tPromocionDescuento property.
     * 
     * @return
     *     possible object is
     *     {@link Tabla }
     *     
     */
    public Tabla getTPromocionDescuento() {
        return tPromocionDescuento;
    }

    /**
     * Sets the value of the tPromocionDescuento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tabla }
     *     
     */
    public void setTPromocionDescuento(Tabla value) {
        this.tPromocionDescuento = value;
    }

    /**
     * Gets the value of the tPromocionMercancia property.
     * 
     * @return
     *     possible object is
     *     {@link Tabla }
     *     
     */
    public Tabla getTPromocionMercancia() {
        return tPromocionMercancia;
    }

    /**
     * Sets the value of the tPromocionMercancia property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tabla }
     *     
     */
    public void setTPromocionMercancia(Tabla value) {
        this.tPromocionMercancia = value;
    }

    /**
     * Gets the value of the tPromocionMercanciaEspecial property.
     * 
     * @return
     *     possible object is
     *     {@link Tabla }
     *     
     */
    public Tabla getTPromocionMercanciaEspecial() {
        return tPromocionMercanciaEspecial;
    }

    /**
     * Sets the value of the tPromocionMercanciaEspecial property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tabla }
     *     
     */
    public void setTPromocionMercanciaEspecial(Tabla value) {
        this.tPromocionMercanciaEspecial = value;
    }

    /**
     * Gets the value of the promocionImporte property.
     * 
     */
    public double getPromocionImporte() {
        return promocionImporte;
    }

    /**
     * Sets the value of the promocionImporte property.
     * 
     */
    public void setPromocionImporte(double value) {
        this.promocionImporte = value;
    }

    /**
     * Gets the value of the promocionDescuento property.
     * 
     */
    public double getPromocionDescuento() {
        return promocionDescuento;
    }

    /**
     * Sets the value of the promocionDescuento property.
     * 
     */
    public void setPromocionDescuento(double value) {
        this.promocionDescuento = value;
    }

    /**
     * Gets the value of the mercanciaEntrega property.
     * 
     */
    public double getMercanciaEntrega() {
        return mercanciaEntrega;
    }

    /**
     * Sets the value of the mercanciaEntrega property.
     * 
     */
    public void setMercanciaEntrega(double value) {
        this.mercanciaEntrega = value;
    }

    /**
     * Gets the value of the mercanciaCobra property.
     * 
     */
    public double getMercanciaCobra() {
        return mercanciaCobra;
    }

    /**
     * Sets the value of the mercanciaCobra property.
     * 
     */
    public void setMercanciaCobra(double value) {
        this.mercanciaCobra = value;
    }

    /**
     * Gets the value of the mercanciaEspecialEntrega property.
     * 
     */
    public double getMercanciaEspecialEntrega() {
        return mercanciaEspecialEntrega;
    }

    /**
     * Sets the value of the mercanciaEspecialEntrega property.
     * 
     */
    public void setMercanciaEspecialEntrega(double value) {
        this.mercanciaEspecialEntrega = value;
    }

    /**
     * Gets the value of the mercanciaEspecialCobra property.
     * 
     */
    public double getMercanciaEspecialCobra() {
        return mercanciaEspecialCobra;
    }

    /**
     * Sets the value of the mercanciaEspecialCobra property.
     * 
     */
    public void setMercanciaEspecialCobra(double value) {
        this.mercanciaEspecialCobra = value;
    }

    /**
     * Gets the value of the mercanciaEspecialArticulo property.
     * 
     * @return
     *     possible object is
     *     {@link Articulo }
     *     
     */
    public Articulo getMercanciaEspecialArticulo() {
        return mercanciaEspecialArticulo;
    }

    /**
     * Sets the value of the mercanciaEspecialArticulo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Articulo }
     *     
     */
    public void setMercanciaEspecialArticulo(Articulo value) {
        this.mercanciaEspecialArticulo = value;
    }

    /**
     * Gets the value of the unidadesMercanciaEspecial property.
     * 
     */
    public double getUnidadesMercanciaEspecial() {
        return unidadesMercanciaEspecial;
    }

    /**
     * Sets the value of the unidadesMercanciaEspecial property.
     * 
     */
    public void setUnidadesMercanciaEspecial(double value) {
        this.unidadesMercanciaEspecial = value;
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
     * Gets the value of the neto property.
     * 
     */
    public double getNeto() {
        return neto;
    }

    /**
     * Sets the value of the neto property.
     * 
     */
    public void setNeto(double value) {
        this.neto = value;
    }

    /**
     * Gets the value of the importePromocionImporte property.
     * 
     */
    public double getImportePromocionImporte() {
        return importePromocionImporte;
    }

    /**
     * Sets the value of the importePromocionImporte property.
     * 
     */
    public void setImportePromocionImporte(double value) {
        this.importePromocionImporte = value;
    }

    /**
     * Gets the value of the importeDescuentoImporte property.
     * 
     */
    public double getImporteDescuentoImporte() {
        return importeDescuentoImporte;
    }

    /**
     * Sets the value of the importeDescuentoImporte property.
     * 
     */
    public void setImporteDescuentoImporte(double value) {
        this.importeDescuentoImporte = value;
    }

    /**
     * Gets the value of the importePromocionPorcentaje property.
     * 
     */
    public double getImportePromocionPorcentaje() {
        return importePromocionPorcentaje;
    }

    /**
     * Sets the value of the importePromocionPorcentaje property.
     * 
     */
    public void setImportePromocionPorcentaje(double value) {
        this.importePromocionPorcentaje = value;
    }

    /**
     * Gets the value of the importeDescuentoPorcentaje1 property.
     * 
     */
    public double getImporteDescuentoPorcentaje1() {
        return importeDescuentoPorcentaje1;
    }

    /**
     * Sets the value of the importeDescuentoPorcentaje1 property.
     * 
     */
    public void setImporteDescuentoPorcentaje1(double value) {
        this.importeDescuentoPorcentaje1 = value;
    }

    /**
     * Gets the value of the importeDescuentoPorcentaje2 property.
     * 
     */
    public double getImporteDescuentoPorcentaje2() {
        return importeDescuentoPorcentaje2;
    }

    /**
     * Sets the value of the importeDescuentoPorcentaje2 property.
     * 
     */
    public void setImporteDescuentoPorcentaje2(double value) {
        this.importeDescuentoPorcentaje2 = value;
    }

    /**
     * Gets the value of the pvpManual property.
     * 
     */
    public boolean isPvpManual() {
        return pvpManual;
    }

    /**
     * Sets the value of the pvpManual property.
     * 
     */
    public void setPvpManual(boolean value) {
        this.pvpManual = value;
    }

    /**
     * Gets the value of the incidenciaLinea property.
     * 
     * @return
     *     possible object is
     *     {@link Tabla }
     *     
     */
    public Tabla getIncidenciaLinea() {
        return incidenciaLinea;
    }

    /**
     * Sets the value of the incidenciaLinea property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tabla }
     *     
     */
    public void setIncidenciaLinea(Tabla value) {
        this.incidenciaLinea = value;
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
     * Gets the value of the incidenciaDevolucion property.
     * 
     * @return
     *     possible object is
     *     {@link Tabla }
     *     
     */
    public Tabla getIncidenciaDevolucion() {
        return incidenciaDevolucion;
    }

    /**
     * Sets the value of the incidenciaDevolucion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tabla }
     *     
     */
    public void setIncidenciaDevolucion(Tabla value) {
        this.incidenciaDevolucion = value;
    }

    /**
     * Gets the value of the lineaManual property.
     * 
     */
    public boolean isLineaManual() {
        return lineaManual;
    }

    /**
     * Sets the value of the lineaManual property.
     * 
     */
    public void setLineaManual(boolean value) {
        this.lineaManual = value;
    }

}
