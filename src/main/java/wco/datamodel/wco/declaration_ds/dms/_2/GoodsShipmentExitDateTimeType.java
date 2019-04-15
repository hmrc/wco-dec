
package wco.datamodel.wco.declaration_ds.dms._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import un.unece.uncefact.data.standard.unqualifieddatatype._6.DateTimeType;


/**
 * 
 *         
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOID xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:6" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;024&lt;/WCOID&gt;
 * </pre>
 * 
 *         
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOFormat xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:6" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;an..35&lt;/WCOFormat&gt;
 * </pre>
 * 
 *       
 * 
 * <p>Java class for GoodsShipmentExitDateTimeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GoodsShipmentExitDateTimeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="DateTimeString">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;restriction base="&lt;urn:un:unece:uncefact:data:standard:UnqualifiedDataType:6>DateTimeType">
 *               &lt;/restriction>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GoodsShipmentExitDateTimeType", propOrder = {
    "dateTimeString"
})
public class GoodsShipmentExitDateTimeType {

    @XmlElement(name = "DateTimeString")
    protected GoodsShipmentExitDateTimeType.DateTimeString dateTimeString;

    /**
     * Gets the value of the dateTimeString property.
     * 
     * @return
     *     possible object is
     *     {@link GoodsShipmentExitDateTimeType.DateTimeString }
     *     
     */
    public GoodsShipmentExitDateTimeType.DateTimeString getDateTimeString() {
        return dateTimeString;
    }

    /**
     * Sets the value of the dateTimeString property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoodsShipmentExitDateTimeType.DateTimeString }
     *     
     */
    public void setDateTimeString(GoodsShipmentExitDateTimeType.DateTimeString value) {
        this.dateTimeString = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;restriction base="&lt;urn:un:unece:uncefact:data:standard:UnqualifiedDataType:6>DateTimeType">
     *     &lt;/restriction>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DateTimeString
        extends DateTimeType
    {


    }

}
