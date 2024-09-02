//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.2 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2024.09.02 às 05:27:03 PM BRT 
//


package br.com.me.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de envioJogoOnlineType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="envioJogoOnlineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tipoArquivo"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="1"/&gt;
 *               &lt;enumeration value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dataMovimentoReferencia" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="numeroLote"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;maxInclusive value="99999"/&gt;
 *               &lt;minInclusive value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CNPJ"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[0-9]{14}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="marca"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="loteFinal"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;enumeration value="0"/&gt;
 *               &lt;enumeration value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dataHoraGeracao" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="apostas" type="{http://sigap.fazenda.gov.br/JogoOnline/}apostaSequence"/&gt;
 *         &lt;element name="qtdTotalApostadoDia" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long"&gt;
 *               &lt;minInclusive value="1"/&gt;
 *               &lt;maxInclusive value="9999999999"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="valTotalApostadoDia" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="justificativaRetificacao" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="versao"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="1.0"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "envioJogoOnlineType", namespace = "http://sigap.fazenda.gov.br/JogoOnline/", propOrder = {
    "tipoArquivo",
    "dataMovimentoReferencia",
    "numeroLote",
    "cnpj",
    "marca",
    "loteFinal",
    "dataHoraGeracao",
    "apostas",
    "qtdTotalApostadoDia",
    "valTotalApostadoDia",
    "justificativaRetificacao",
    "signature"
})
public class EnvioJogoOnlineType {

    @XmlElement(required = true)
    protected String tipoArquivo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataMovimentoReferencia;
    protected int numeroLote;
    @XmlElement(name = "CNPJ", required = true)
    protected String cnpj;
    @XmlElement(required = true)
    protected String marca;
    protected int loteFinal;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataHoraGeracao;
    @XmlElement(required = true)
    protected ApostaSequence apostas;
    protected Long qtdTotalApostadoDia;
    protected Double valTotalApostadoDia;
    protected String justificativaRetificacao;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;
    @XmlAttribute(name = "versao")
    protected String versao;

    /**
     * Obtém o valor da propriedade tipoArquivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoArquivo() {
        return tipoArquivo;
    }

    /**
     * Define o valor da propriedade tipoArquivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoArquivo(String value) {
        this.tipoArquivo = value;
    }

    /**
     * Obtém o valor da propriedade dataMovimentoReferencia.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataMovimentoReferencia() {
        return dataMovimentoReferencia;
    }

    /**
     * Define o valor da propriedade dataMovimentoReferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataMovimentoReferencia(XMLGregorianCalendar value) {
        this.dataMovimentoReferencia = value;
    }

    /**
     * Obtém o valor da propriedade numeroLote.
     * 
     */
    public int getNumeroLote() {
        return numeroLote;
    }

    /**
     * Define o valor da propriedade numeroLote.
     * 
     */
    public void setNumeroLote(int value) {
        this.numeroLote = value;
    }

    /**
     * Obtém o valor da propriedade cnpj.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNPJ() {
        return cnpj;
    }

    /**
     * Define o valor da propriedade cnpj.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNPJ(String value) {
        this.cnpj = value;
    }

    /**
     * Obtém o valor da propriedade marca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Define o valor da propriedade marca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarca(String value) {
        this.marca = value;
    }

    /**
     * Obtém o valor da propriedade loteFinal.
     * 
     */
    public int getLoteFinal() {
        return loteFinal;
    }

    /**
     * Define o valor da propriedade loteFinal.
     * 
     */
    public void setLoteFinal(int value) {
        this.loteFinal = value;
    }

    /**
     * Obtém o valor da propriedade dataHoraGeracao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataHoraGeracao() {
        return dataHoraGeracao;
    }

    /**
     * Define o valor da propriedade dataHoraGeracao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataHoraGeracao(XMLGregorianCalendar value) {
        this.dataHoraGeracao = value;
    }

    /**
     * Obtém o valor da propriedade apostas.
     * 
     * @return
     *     possible object is
     *     {@link ApostaSequence }
     *     
     */
    public ApostaSequence getApostas() {
        return apostas;
    }

    /**
     * Define o valor da propriedade apostas.
     * 
     * @param value
     *     allowed object is
     *     {@link ApostaSequence }
     *     
     */
    public void setApostas(ApostaSequence value) {
        this.apostas = value;
    }

    /**
     * Obtém o valor da propriedade qtdTotalApostadoDia.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQtdTotalApostadoDia() {
        return qtdTotalApostadoDia;
    }

    /**
     * Define o valor da propriedade qtdTotalApostadoDia.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQtdTotalApostadoDia(Long value) {
        this.qtdTotalApostadoDia = value;
    }

    /**
     * Obtém o valor da propriedade valTotalApostadoDia.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValTotalApostadoDia() {
        return valTotalApostadoDia;
    }

    /**
     * Define o valor da propriedade valTotalApostadoDia.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValTotalApostadoDia(Double value) {
        this.valTotalApostadoDia = value;
    }

    /**
     * Obtém o valor da propriedade justificativaRetificacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJustificativaRetificacao() {
        return justificativaRetificacao;
    }

    /**
     * Define o valor da propriedade justificativaRetificacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJustificativaRetificacao(String value) {
        this.justificativaRetificacao = value;
    }

    /**
     * Obtém o valor da propriedade signature.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Define o valor da propriedade signature.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }

    /**
     * Obtém o valor da propriedade versao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersao() {
        return versao;
    }

    /**
     * Define o valor da propriedade versao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersao(String value) {
        this.versao = value;
    }

}
