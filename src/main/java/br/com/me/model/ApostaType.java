//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.2 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2024.09.02 às 05:27:03 PM BRT 
//


package br.com.me.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de apostaType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="apostaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CPF"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[0-9]{11}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="qtdApostasJogoDia"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;minInclusive value="1"/&gt;
 *               &lt;maxInclusive value="999999"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="jogosOnline"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="jogoOnline" type="{http://sigap.fazenda.gov.br/JogoOnline/}jogoOnlineType" maxOccurs="7"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="tempoTotalApostadorJogoDia"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="([0-1][0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9])"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="valorTotalApostadorJogoDia" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="ganhoApostadorJogoDia" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="perdaApostadorJogoDia" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "apostaType", namespace = "http://sigap.fazenda.gov.br/JogoOnline/", propOrder = {
    "cpf",
    "qtdApostasJogoDia",
    "jogosOnline",
    "tempoTotalApostadorJogoDia",
    "valorTotalApostadorJogoDia",
    "ganhoApostadorJogoDia",
    "perdaApostadorJogoDia"
})
public class ApostaType {

    @XmlElement(name = "CPF", required = true)
    protected String cpf;
    protected int qtdApostasJogoDia;
    @XmlElement(required = true)
    protected JogosOnline jogosOnline;
    @XmlElement(required = true)
    protected String tempoTotalApostadorJogoDia;
    protected double valorTotalApostadorJogoDia;
    protected double ganhoApostadorJogoDia;
    protected double perdaApostadorJogoDia;

    /**
     * Obtém o valor da propriedade cpf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPF() {
        return cpf;
    }

    /**
     * Define o valor da propriedade cpf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPF(String value) {
        this.cpf = value;
    }

    /**
     * Obtém o valor da propriedade qtdApostasJogoDia.
     * 
     */
    public int getQtdApostasJogoDia() {
        return qtdApostasJogoDia;
    }

    /**
     * Define o valor da propriedade qtdApostasJogoDia.
     * 
     */
    public void setQtdApostasJogoDia(int value) {
        this.qtdApostasJogoDia = value;
    }

    /**
     * Obtém o valor da propriedade jogosOnline.
     * 
     * @return
     *     possible object is
     *     {@link JogosOnline }
     *     
     */
    public JogosOnline getJogosOnline() {
        return jogosOnline;
    }

    /**
     * Define o valor da propriedade jogosOnline.
     * 
     * @param value
     *     allowed object is
     *     {@link JogosOnline }
     *     
     */
    public void setJogosOnline(JogosOnline value) {
        this.jogosOnline = value;
    }

    /**
     * Obtém o valor da propriedade tempoTotalApostadorJogoDia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempoTotalApostadorJogoDia() {
        return tempoTotalApostadorJogoDia;
    }

    /**
     * Define o valor da propriedade tempoTotalApostadorJogoDia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempoTotalApostadorJogoDia(String value) {
        this.tempoTotalApostadorJogoDia = value;
    }

    /**
     * Obtém o valor da propriedade valorTotalApostadorJogoDia.
     * 
     */
    public double getValorTotalApostadorJogoDia() {
        return valorTotalApostadorJogoDia;
    }

    /**
     * Define o valor da propriedade valorTotalApostadorJogoDia.
     * 
     */
    public void setValorTotalApostadorJogoDia(double value) {
        this.valorTotalApostadorJogoDia = value;
    }

    /**
     * Obtém o valor da propriedade ganhoApostadorJogoDia.
     * 
     */
    public double getGanhoApostadorJogoDia() {
        return ganhoApostadorJogoDia;
    }

    /**
     * Define o valor da propriedade ganhoApostadorJogoDia.
     * 
     */
    public void setGanhoApostadorJogoDia(double value) {
        this.ganhoApostadorJogoDia = value;
    }

    /**
     * Obtém o valor da propriedade perdaApostadorJogoDia.
     * 
     */
    public double getPerdaApostadorJogoDia() {
        return perdaApostadorJogoDia;
    }

    /**
     * Define o valor da propriedade perdaApostadorJogoDia.
     * 
     */
    public void setPerdaApostadorJogoDia(double value) {
        this.perdaApostadorJogoDia = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="jogoOnline" type="{http://sigap.fazenda.gov.br/JogoOnline/}jogoOnlineType" maxOccurs="7"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "jogoOnline"
    })
    public static class JogosOnline {

        @XmlElement(required = true)
        protected List<JogoOnlineType> jogoOnline;

        /**
         * Gets the value of the jogoOnline property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the jogoOnline property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getJogoOnline().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JogoOnlineType }
         * 
         * 
         */
        public List<JogoOnlineType> getJogoOnline() {
            if (jogoOnline == null) {
                jogoOnline = new ArrayList<JogoOnlineType>();
            }
            return this.jogoOnline;
        }

    }

}
