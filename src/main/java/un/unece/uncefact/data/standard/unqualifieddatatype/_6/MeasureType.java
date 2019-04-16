
package un.unece.uncefact.data.standard.unqualifieddatatype._6;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import wco.datamodel.wco.declaration_ds.dms._2.DeclarationTotalGrossMassMeasureType;
import wco.datamodel.wco.declaration_ds.dms._2.GoodsMeasureGrossMassMeasureType;
import wco.datamodel.wco.declaration_ds.dms._2.GoodsMeasureNetNetWeightMeasureType;
import wco.datamodel.wco.declaration_ds.dms._2.PackagingHeightMeasureType;
import wco.datamodel.wco.declaration_ds.dms._2.PackagingLengthMeasureType;
import wco.datamodel.wco.declaration_ds.dms._2.PackagingVolumeMeasureType;
import wco.datamodel.wco.declaration_ds.dms._2.PackagingWidthMeasureType;


/**
 * <p>Java class for MeasureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasureType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *       &lt;attribute name="unitCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:6}MeasurementUnitCommonCodeContentType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasureType", propOrder = {
    "value"
})
@XmlSeeAlso({
    DeclarationTotalGrossMassMeasureType.class,
    PackagingHeightMeasureType.class,
    PackagingWidthMeasureType.class,
    PackagingVolumeMeasureType.class,
    GoodsMeasureNetNetWeightMeasureType.class,
    GoodsMeasureGrossMassMeasureType.class,
    PackagingLengthMeasureType.class
})
public class MeasureType {

    @XmlValue
    protected BigDecimal value;
    @XmlAttribute(name = "unitCode")
    protected String unitCode;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets the value of the unitCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitCode() {
        return unitCode;
    }

    /**
     * Sets the value of the unitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitCode(String value) {
        this.unitCode = value;
    }

}
