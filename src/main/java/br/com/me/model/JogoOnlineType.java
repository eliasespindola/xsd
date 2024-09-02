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
 * <p>Classe Java de jogoOnlineType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="jogoOnlineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="qtdApostasTipoJogo"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;minInclusive value="1"/&gt;
 *               &lt;maxInclusive value="999999"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="tituloJogo"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="qtdPremiosSessaoJogo"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;minInclusive value="0"/&gt;
 *               &lt;maxInclusive value="9999"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="sessoesPremiadas" type="{http://sigap.fazenda.gov.br/JogoOnline/}sessaoSequence"/&gt;
 *         &lt;element name="tempoTotalApostasJogo" type="{http://www.w3.org/2001/XMLSchema}time"/&gt;
 *         &lt;element name="valorTotalApostasJogo" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="ganhoApostasJogo" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="perdaApostasJogo" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="tipo" use="required" type="{http://sigap.fazenda.gov.br/JogoOnline/}tipoJogoType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jogoOnlineType", namespace = "http://sigap.fazenda.gov.br/JogoOnline/", propOrder = {
    "qtdApostasTipoJogo",
    "tituloJogo",
    "qtdPremiosSessaoJogo",
    "sessoesPremiadas",
    "tempoTotalApostasJogo",
    "valorTotalApostasJogo",
    "ganhoApostasJogo",
    "perdaApostasJogo"
})
public class JogoOnlineType {

    protected int qtdApostasTipoJogo;
    @XmlElement(required = true)
    protected String tituloJogo;
    protected int qtdPremiosSessaoJogo;
    @XmlElement(required = true)
    protected SessaoSequence sessoesPremiadas;
    @XmlElement(required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar tempoTotalApostasJogo;
    protected double valorTotalApostasJogo;
    protected double ganhoApostasJogo;
    protected double perdaApostasJogo;
    @XmlAttribute(name = "tipo", required = true)
    protected String tipo;

    /**
     * Obtém o valor da propriedade qtdApostasTipoJogo.
     * 
     */
    public int getQtdApostasTipoJogo() {
        return qtdApostasTipoJogo;
    }

    /**
     * Define o valor da propriedade qtdApostasTipoJogo.
     * 
     */
    public void setQtdApostasTipoJogo(int value) {
        this.qtdApostasTipoJogo = value;
    }

    /**
     * Obtém o valor da propriedade tituloJogo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTituloJogo() {
        return tituloJogo;
    }

    /**
     * Define o valor da propriedade tituloJogo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTituloJogo(String value) {
        this.tituloJogo = value;
    }

    /**
     * Obtém o valor da propriedade qtdPremiosSessaoJogo.
     * 
     */
    public int getQtdPremiosSessaoJogo() {
        return qtdPremiosSessaoJogo;
    }

    /**
     * Define o valor da propriedade qtdPremiosSessaoJogo.
     * 
     */
    public void setQtdPremiosSessaoJogo(int value) {
        this.qtdPremiosSessaoJogo = value;
    }

    /**
     * Obtém o valor da propriedade sessoesPremiadas.
     * 
     * @return
     *     possible object is
     *     {@link SessaoSequence }
     *     
     */
    public SessaoSequence getSessoesPremiadas() {
        return sessoesPremiadas;
    }

    /**
     * Define o valor da propriedade sessoesPremiadas.
     * 
     * @param value
     *     allowed object is
     *     {@link SessaoSequence }
     *     
     */
    public void setSessoesPremiadas(SessaoSequence value) {
        this.sessoesPremiadas = value;
    }

    /**
     * Obtém o valor da propriedade tempoTotalApostasJogo.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTempoTotalApostasJogo() {
        return tempoTotalApostasJogo;
    }

    /**
     * Define o valor da propriedade tempoTotalApostasJogo.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTempoTotalApostasJogo(XMLGregorianCalendar value) {
        this.tempoTotalApostasJogo = value;
    }

    /**
     * Obtém o valor da propriedade valorTotalApostasJogo.
     * 
     */
    public double getValorTotalApostasJogo() {
        return valorTotalApostasJogo;
    }

    /**
     * Define o valor da propriedade valorTotalApostasJogo.
     * 
     */
    public void setValorTotalApostasJogo(double value) {
        this.valorTotalApostasJogo = value;
    }

    /**
     * Obtém o valor da propriedade ganhoApostasJogo.
     * 
     */
    public double getGanhoApostasJogo() {
        return ganhoApostasJogo;
    }

    /**
     * Define o valor da propriedade ganhoApostasJogo.
     * 
     */
    public void setGanhoApostasJogo(double value) {
        this.ganhoApostasJogo = value;
    }

    /**
     * Obtém o valor da propriedade perdaApostasJogo.
     * 
     */
    public double getPerdaApostasJogo() {
        return perdaApostasJogo;
    }

    /**
     * Define o valor da propriedade perdaApostasJogo.
     * 
     */
    public void setPerdaApostasJogo(double value) {
        this.perdaApostasJogo = value;
    }

    /**
     * Obtém o valor da propriedade tipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define o valor da propriedade tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

}
