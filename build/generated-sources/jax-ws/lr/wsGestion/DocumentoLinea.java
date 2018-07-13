
package lr.wsGestion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DocumentoLinea complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
@XmlType(name = "DocumentoLinea", namespace = "http://xml.netbeans.org/schema/gestion", propOrder = {
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
     * Obtiene el valor de la propiedad numeroLinea.
     * 
     */
    public long getNumeroLinea() {
        return numeroLinea;
    }

    /**
     * Define el valor de la propiedad numeroLinea.
     * 
     */
    public void setNumeroLinea(long value) {
        this.numeroLinea = value;
    }

    /**
     * Obtiene el valor de la propiedad articulo.
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
     * Define el valor de la propiedad articulo.
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
     * Obtiene el valor de la propiedad pvp.
     * 
     */
    public double getPvp() {
        return pvp;
    }

    /**
     * Define el valor de la propiedad pvp.
     * 
     */
    public void setPvp(double value) {
        this.pvp = value;
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
     * Obtiene el valor de la propiedad tipoLinea.
     * 
     */
    public short getTipoLinea() {
        return tipoLinea;
    }

    /**
     * Define el valor de la propiedad tipoLinea.
     * 
     */
    public void setTipoLinea(short value) {
        this.tipoLinea = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidadCobrada.
     * 
     */
    public double getCantidadCobrada() {
        return cantidadCobrada;
    }

    /**
     * Define el valor de la propiedad cantidadCobrada.
     * 
     */
    public void setCantidadCobrada(double value) {
        this.cantidadCobrada = value;
    }

    /**
     * Obtiene el valor de la propiedad precio.
     * 
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Define el valor de la propiedad precio.
     * 
     */
    public void setPrecio(double value) {
        this.precio = value;
    }

    /**
     * Obtiene el valor de la propiedad precioNeto.
     * 
     */
    public double getPrecioNeto() {
        return precioNeto;
    }

    /**
     * Define el valor de la propiedad precioNeto.
     * 
     */
    public void setPrecioNeto(double value) {
        this.precioNeto = value;
    }

    /**
     * Obtiene el valor de la propiedad precioMinimo.
     * 
     */
    public double getPrecioMinimo() {
        return precioMinimo;
    }

    /**
     * Define el valor de la propiedad precioMinimo.
     * 
     */
    public void setPrecioMinimo(double value) {
        this.precioMinimo = value;
    }

    /**
     * Obtiene el valor de la propiedad promocionPrecio.
     * 
     */
    public double getPromocionPrecio() {
        return promocionPrecio;
    }

    /**
     * Define el valor de la propiedad promocionPrecio.
     * 
     */
    public void setPromocionPrecio(double value) {
        this.promocionPrecio = value;
    }

    /**
     * Obtiene el valor de la propiedad tPromocionPrecio.
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
     * Define el valor de la propiedad tPromocionPrecio.
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
     * Obtiene el valor de la propiedad tarifaAplicada.
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
     * Define el valor de la propiedad tarifaAplicada.
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
     * Obtiene el valor de la propiedad pvpTarifa.
     * 
     */
    public double getPvpTarifa() {
        return pvpTarifa;
    }

    /**
     * Define el valor de la propiedad pvpTarifa.
     * 
     */
    public void setPvpTarifa(double value) {
        this.pvpTarifa = value;
    }

    /**
     * Obtiene el valor de la propiedad tDescuentoImporte.
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
     * Define el valor de la propiedad tDescuentoImporte.
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
     * Obtiene el valor de la propiedad tDescuentoPorcentaje1.
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
     * Define el valor de la propiedad tDescuentoPorcentaje1.
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
     * Obtiene el valor de la propiedad tDescuentoPorcentaje2.
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
     * Define el valor de la propiedad tDescuentoPorcentaje2.
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
     * Obtiene el valor de la propiedad descuentoImporte.
     * 
     */
    public double getDescuentoImporte() {
        return descuentoImporte;
    }

    /**
     * Define el valor de la propiedad descuentoImporte.
     * 
     */
    public void setDescuentoImporte(double value) {
        this.descuentoImporte = value;
    }

    /**
     * Obtiene el valor de la propiedad descuentoPorcentaje1.
     * 
     */
    public double getDescuentoPorcentaje1() {
        return descuentoPorcentaje1;
    }

    /**
     * Define el valor de la propiedad descuentoPorcentaje1.
     * 
     */
    public void setDescuentoPorcentaje1(double value) {
        this.descuentoPorcentaje1 = value;
    }

    /**
     * Obtiene el valor de la propiedad descuentoPorcentaje2.
     * 
     */
    public double getDescuentoPorcentaje2() {
        return descuentoPorcentaje2;
    }

    /**
     * Define el valor de la propiedad descuentoPorcentaje2.
     * 
     */
    public void setDescuentoPorcentaje2(double value) {
        this.descuentoPorcentaje2 = value;
    }

    /**
     * Obtiene el valor de la propiedad tPromocionImporte.
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
     * Define el valor de la propiedad tPromocionImporte.
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
     * Obtiene el valor de la propiedad tPromocionDescuento.
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
     * Define el valor de la propiedad tPromocionDescuento.
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
     * Obtiene el valor de la propiedad tPromocionMercancia.
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
     * Define el valor de la propiedad tPromocionMercancia.
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
     * Obtiene el valor de la propiedad tPromocionMercanciaEspecial.
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
     * Define el valor de la propiedad tPromocionMercanciaEspecial.
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
     * Obtiene el valor de la propiedad promocionImporte.
     * 
     */
    public double getPromocionImporte() {
        return promocionImporte;
    }

    /**
     * Define el valor de la propiedad promocionImporte.
     * 
     */
    public void setPromocionImporte(double value) {
        this.promocionImporte = value;
    }

    /**
     * Obtiene el valor de la propiedad promocionDescuento.
     * 
     */
    public double getPromocionDescuento() {
        return promocionDescuento;
    }

    /**
     * Define el valor de la propiedad promocionDescuento.
     * 
     */
    public void setPromocionDescuento(double value) {
        this.promocionDescuento = value;
    }

    /**
     * Obtiene el valor de la propiedad mercanciaEntrega.
     * 
     */
    public double getMercanciaEntrega() {
        return mercanciaEntrega;
    }

    /**
     * Define el valor de la propiedad mercanciaEntrega.
     * 
     */
    public void setMercanciaEntrega(double value) {
        this.mercanciaEntrega = value;
    }

    /**
     * Obtiene el valor de la propiedad mercanciaCobra.
     * 
     */
    public double getMercanciaCobra() {
        return mercanciaCobra;
    }

    /**
     * Define el valor de la propiedad mercanciaCobra.
     * 
     */
    public void setMercanciaCobra(double value) {
        this.mercanciaCobra = value;
    }

    /**
     * Obtiene el valor de la propiedad mercanciaEspecialEntrega.
     * 
     */
    public double getMercanciaEspecialEntrega() {
        return mercanciaEspecialEntrega;
    }

    /**
     * Define el valor de la propiedad mercanciaEspecialEntrega.
     * 
     */
    public void setMercanciaEspecialEntrega(double value) {
        this.mercanciaEspecialEntrega = value;
    }

    /**
     * Obtiene el valor de la propiedad mercanciaEspecialCobra.
     * 
     */
    public double getMercanciaEspecialCobra() {
        return mercanciaEspecialCobra;
    }

    /**
     * Define el valor de la propiedad mercanciaEspecialCobra.
     * 
     */
    public void setMercanciaEspecialCobra(double value) {
        this.mercanciaEspecialCobra = value;
    }

    /**
     * Obtiene el valor de la propiedad mercanciaEspecialArticulo.
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
     * Define el valor de la propiedad mercanciaEspecialArticulo.
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
     * Obtiene el valor de la propiedad unidadesMercanciaEspecial.
     * 
     */
    public double getUnidadesMercanciaEspecial() {
        return unidadesMercanciaEspecial;
    }

    /**
     * Define el valor de la propiedad unidadesMercanciaEspecial.
     * 
     */
    public void setUnidadesMercanciaEspecial(double value) {
        this.unidadesMercanciaEspecial = value;
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
     * Obtiene el valor de la propiedad neto.
     * 
     */
    public double getNeto() {
        return neto;
    }

    /**
     * Define el valor de la propiedad neto.
     * 
     */
    public void setNeto(double value) {
        this.neto = value;
    }

    /**
     * Obtiene el valor de la propiedad importePromocionImporte.
     * 
     */
    public double getImportePromocionImporte() {
        return importePromocionImporte;
    }

    /**
     * Define el valor de la propiedad importePromocionImporte.
     * 
     */
    public void setImportePromocionImporte(double value) {
        this.importePromocionImporte = value;
    }

    /**
     * Obtiene el valor de la propiedad importeDescuentoImporte.
     * 
     */
    public double getImporteDescuentoImporte() {
        return importeDescuentoImporte;
    }

    /**
     * Define el valor de la propiedad importeDescuentoImporte.
     * 
     */
    public void setImporteDescuentoImporte(double value) {
        this.importeDescuentoImporte = value;
    }

    /**
     * Obtiene el valor de la propiedad importePromocionPorcentaje.
     * 
     */
    public double getImportePromocionPorcentaje() {
        return importePromocionPorcentaje;
    }

    /**
     * Define el valor de la propiedad importePromocionPorcentaje.
     * 
     */
    public void setImportePromocionPorcentaje(double value) {
        this.importePromocionPorcentaje = value;
    }

    /**
     * Obtiene el valor de la propiedad importeDescuentoPorcentaje1.
     * 
     */
    public double getImporteDescuentoPorcentaje1() {
        return importeDescuentoPorcentaje1;
    }

    /**
     * Define el valor de la propiedad importeDescuentoPorcentaje1.
     * 
     */
    public void setImporteDescuentoPorcentaje1(double value) {
        this.importeDescuentoPorcentaje1 = value;
    }

    /**
     * Obtiene el valor de la propiedad importeDescuentoPorcentaje2.
     * 
     */
    public double getImporteDescuentoPorcentaje2() {
        return importeDescuentoPorcentaje2;
    }

    /**
     * Define el valor de la propiedad importeDescuentoPorcentaje2.
     * 
     */
    public void setImporteDescuentoPorcentaje2(double value) {
        this.importeDescuentoPorcentaje2 = value;
    }

    /**
     * Obtiene el valor de la propiedad pvpManual.
     * 
     */
    public boolean isPvpManual() {
        return pvpManual;
    }

    /**
     * Define el valor de la propiedad pvpManual.
     * 
     */
    public void setPvpManual(boolean value) {
        this.pvpManual = value;
    }

    /**
     * Obtiene el valor de la propiedad incidenciaLinea.
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
     * Define el valor de la propiedad incidenciaLinea.
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
     * Obtiene el valor de la propiedad incidenciaDevolucion.
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
     * Define el valor de la propiedad incidenciaDevolucion.
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
     * Obtiene el valor de la propiedad lineaManual.
     * 
     */
    public boolean isLineaManual() {
        return lineaManual;
    }

    /**
     * Define el valor de la propiedad lineaManual.
     * 
     */
    public void setLineaManual(boolean value) {
        this.lineaManual = value;
    }

}
