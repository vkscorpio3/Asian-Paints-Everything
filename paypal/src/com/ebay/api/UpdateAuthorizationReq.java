
package com.ebay.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:api:PayPalAPI}UpdateAuthorizationRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "updateAuthorizationRequest"
})
@XmlRootElement(name = "UpdateAuthorizationReq", namespace = "urn:ebay:api:PayPalAPI")
public class UpdateAuthorizationReq {

    @XmlElement(name = "UpdateAuthorizationRequest", namespace = "urn:ebay:api:PayPalAPI", required = true)
    protected UpdateAuthorizationRequestType updateAuthorizationRequest;

    /**
     * Gets the value of the updateAuthorizationRequest property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateAuthorizationRequestType }
     *     
     */
    public UpdateAuthorizationRequestType getUpdateAuthorizationRequest() {
        return updateAuthorizationRequest;
    }

    /**
     * Sets the value of the updateAuthorizationRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateAuthorizationRequestType }
     *     
     */
    public void setUpdateAuthorizationRequest(UpdateAuthorizationRequestType value) {
        this.updateAuthorizationRequest = value;
    }

}