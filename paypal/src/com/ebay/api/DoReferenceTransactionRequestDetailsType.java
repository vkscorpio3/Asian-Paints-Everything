
package com.ebay.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DoReferenceTransactionRequestDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DoReferenceTransactionRequestDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReferenceID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PaymentAction" type="{urn:ebay:apis:eBLBaseComponents}PaymentActionCodeType"/>
 *         &lt;element name="PaymentType" type="{urn:ebay:apis:eBLBaseComponents}MerchantPullPaymentCodeType" minOccurs="0"/>
 *         &lt;element name="PaymentDetails" type="{urn:ebay:apis:eBLBaseComponents}PaymentDetailsType"/>
 *         &lt;element name="CreditCard" type="{urn:ebay:apis:eBLBaseComponents}ReferenceCreditCardDetailsType" minOccurs="0"/>
 *         &lt;element name="IPAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MerchantSessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReqConfirmShipping" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SoftDescriptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SoftDescriptorCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SenderDetails" type="{urn:ebay:apis:eBLBaseComponents}SenderDetailsType" minOccurs="0"/>
 *         &lt;element name="MsgSubID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DoReferenceTransactionRequestDetailsType", propOrder = {
    "referenceID",
    "paymentAction",
    "paymentType",
    "paymentDetails",
    "creditCard",
    "ipAddress",
    "merchantSessionId",
    "reqConfirmShipping",
    "softDescriptor",
    "softDescriptorCity",
    "senderDetails",
    "msgSubID"
})
public class DoReferenceTransactionRequestDetailsType {

    @XmlElement(name = "ReferenceID", required = true)
    protected String referenceID;
    @XmlElement(name = "PaymentAction", required = true)
    protected PaymentActionCodeType paymentAction;
    @XmlElement(name = "PaymentType")
    protected MerchantPullPaymentCodeType paymentType;
    @XmlElement(name = "PaymentDetails", required = true)
    protected PaymentDetailsType paymentDetails;
    @XmlElement(name = "CreditCard")
    protected ReferenceCreditCardDetailsType creditCard;
    @XmlElement(name = "IPAddress")
    protected String ipAddress;
    @XmlElement(name = "MerchantSessionId")
    protected String merchantSessionId;
    @XmlElement(name = "ReqConfirmShipping")
    protected String reqConfirmShipping;
    @XmlElement(name = "SoftDescriptor")
    protected String softDescriptor;
    @XmlElement(name = "SoftDescriptorCity")
    protected String softDescriptorCity;
    @XmlElement(name = "SenderDetails")
    protected SenderDetailsType senderDetails;
    @XmlElement(name = "MsgSubID")
    protected String msgSubID;

    /**
     * Gets the value of the referenceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceID() {
        return referenceID;
    }

    /**
     * Sets the value of the referenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceID(String value) {
        this.referenceID = value;
    }

    /**
     * Gets the value of the paymentAction property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentActionCodeType }
     *     
     */
    public PaymentActionCodeType getPaymentAction() {
        return paymentAction;
    }

    /**
     * Sets the value of the paymentAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentActionCodeType }
     *     
     */
    public void setPaymentAction(PaymentActionCodeType value) {
        this.paymentAction = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link MerchantPullPaymentCodeType }
     *     
     */
    public MerchantPullPaymentCodeType getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchantPullPaymentCodeType }
     *     
     */
    public void setPaymentType(MerchantPullPaymentCodeType value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the paymentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDetailsType }
     *     
     */
    public PaymentDetailsType getPaymentDetails() {
        return paymentDetails;
    }

    /**
     * Sets the value of the paymentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDetailsType }
     *     
     */
    public void setPaymentDetails(PaymentDetailsType value) {
        this.paymentDetails = value;
    }

    /**
     * Gets the value of the creditCard property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceCreditCardDetailsType }
     *     
     */
    public ReferenceCreditCardDetailsType getCreditCard() {
        return creditCard;
    }

    /**
     * Sets the value of the creditCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceCreditCardDetailsType }
     *     
     */
    public void setCreditCard(ReferenceCreditCardDetailsType value) {
        this.creditCard = value;
    }

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the merchantSessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantSessionId() {
        return merchantSessionId;
    }

    /**
     * Sets the value of the merchantSessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantSessionId(String value) {
        this.merchantSessionId = value;
    }

    /**
     * Gets the value of the reqConfirmShipping property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqConfirmShipping() {
        return reqConfirmShipping;
    }

    /**
     * Sets the value of the reqConfirmShipping property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqConfirmShipping(String value) {
        this.reqConfirmShipping = value;
    }

    /**
     * Gets the value of the softDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftDescriptor() {
        return softDescriptor;
    }

    /**
     * Sets the value of the softDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftDescriptor(String value) {
        this.softDescriptor = value;
    }

    /**
     * Gets the value of the softDescriptorCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftDescriptorCity() {
        return softDescriptorCity;
    }

    /**
     * Sets the value of the softDescriptorCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftDescriptorCity(String value) {
        this.softDescriptorCity = value;
    }

    /**
     * Gets the value of the senderDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SenderDetailsType }
     *     
     */
    public SenderDetailsType getSenderDetails() {
        return senderDetails;
    }

    /**
     * Sets the value of the senderDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SenderDetailsType }
     *     
     */
    public void setSenderDetails(SenderDetailsType value) {
        this.senderDetails = value;
    }

    /**
     * Gets the value of the msgSubID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgSubID() {
        return msgSubID;
    }

    /**
     * Sets the value of the msgSubID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgSubID(String value) {
        this.msgSubID = value;
    }

}