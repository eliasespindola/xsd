//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.2 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2024.09.02 às 05:27:03 PM BRT 
//


package br.com.me.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.me.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ArquivoEnvioJogoOnline_QNAME = new QName("http://sigap.fazenda.gov.br/JogoOnline/", "arquivoEnvioJogoOnline");
    private final static QName _Signature_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Signature");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.me.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReferenceType }
     * 
     */
    public ReferenceType createReferenceType() {
        return new ReferenceType();
    }

    /**
     * Create an instance of {@link SignedInfoType }
     * 
     */
    public SignedInfoType createSignedInfoType() {
        return new SignedInfoType();
    }

    /**
     * Create an instance of {@link ApostaType }
     * 
     */
    public ApostaType createApostaType() {
        return new ApostaType();
    }

    /**
     * Create an instance of {@link EnvioJogoOnlineType }
     * 
     */
    public EnvioJogoOnlineType createEnvioJogoOnlineType() {
        return new EnvioJogoOnlineType();
    }

    /**
     * Create an instance of {@link JogoOnlineType }
     * 
     */
    public JogoOnlineType createJogoOnlineType() {
        return new JogoOnlineType();
    }

    /**
     * Create an instance of {@link ApostaSequence }
     * 
     */
    public ApostaSequence createApostaSequence() {
        return new ApostaSequence();
    }

    /**
     * Create an instance of {@link SessaoSequence }
     * 
     */
    public SessaoSequence createSessaoSequence() {
        return new SessaoSequence();
    }

    /**
     * Create an instance of {@link SignatureType }
     * 
     */
    public SignatureType createSignatureType() {
        return new SignatureType();
    }

    /**
     * Create an instance of {@link SignatureValueType }
     * 
     */
    public SignatureValueType createSignatureValueType() {
        return new SignatureValueType();
    }

    /**
     * Create an instance of {@link TransformsType }
     * 
     */
    public TransformsType createTransformsType() {
        return new TransformsType();
    }

    /**
     * Create an instance of {@link TransformType }
     * 
     */
    public TransformType createTransformType() {
        return new TransformType();
    }

    /**
     * Create an instance of {@link KeyInfoType }
     * 
     */
    public KeyInfoType createKeyInfoType() {
        return new KeyInfoType();
    }

    /**
     * Create an instance of {@link X509DataType }
     * 
     */
    public X509DataType createX509DataType() {
        return new X509DataType();
    }

    /**
     * Create an instance of {@link ReferenceType.DigestMethod }
     * 
     */
    public ReferenceType.DigestMethod createReferenceTypeDigestMethod() {
        return new ReferenceType.DigestMethod();
    }

    /**
     * Create an instance of {@link SignedInfoType.CanonicalizationMethod }
     * 
     */
    public SignedInfoType.CanonicalizationMethod createSignedInfoTypeCanonicalizationMethod() {
        return new SignedInfoType.CanonicalizationMethod();
    }

    /**
     * Create an instance of {@link SignedInfoType.SignatureMethod }
     * 
     */
    public SignedInfoType.SignatureMethod createSignedInfoTypeSignatureMethod() {
        return new SignedInfoType.SignatureMethod();
    }

    /**
     * Create an instance of {@link ApostaType.JogosOnline }
     * 
     */
    public ApostaType.JogosOnline createApostaTypeJogosOnline() {
        return new ApostaType.JogosOnline();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnvioJogoOnlineType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EnvioJogoOnlineType }{@code >}
     */
    @XmlElementDecl(namespace = "http://sigap.fazenda.gov.br/JogoOnline/", name = "arquivoEnvioJogoOnline")
    public JAXBElement<EnvioJogoOnlineType> createArquivoEnvioJogoOnline(EnvioJogoOnlineType value) {
        return new JAXBElement<EnvioJogoOnlineType>(_ArquivoEnvioJogoOnline_QNAME, EnvioJogoOnlineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SignatureType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "Signature")
    public JAXBElement<SignatureType> createSignature(SignatureType value) {
        return new JAXBElement<SignatureType>(_Signature_QNAME, SignatureType.class, null, value);
    }

}
