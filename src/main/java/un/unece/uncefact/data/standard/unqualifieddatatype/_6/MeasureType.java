/*
 * Copyright 2024 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package un.unece.uncefact.data.standard.unqualifieddatatype._6;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import wco.datamodel.wco.declaration_ds.dms._2.DeclarationTotalGrossMassMeasureType;
import wco.datamodel.wco.declaration_ds.dms._2.GoodsMeasureGrossMassMeasureType;
import wco.datamodel.wco.declaration_ds.dms._2.GoodsMeasureNetNetWeightMeasureType;
import wco.datamodel.wco.declaration_ds.dms._2.PackagingHeightMeasureType;
import wco.datamodel.wco.declaration_ds.dms._2.PackagingLengthMeasureType;
import wco.datamodel.wco.declaration_ds.dms._2.PackagingVolumeMeasureType;
import wco.datamodel.wco.declaration_ds.dms._2.PackagingWidthMeasureType;


/**
 * <p>Java class for MeasureType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="MeasureType">
 *   <simpleContent>
 *     <extension base="<http://www.w3.org/2001/XMLSchema>decimal">
 *       <attribute name="unitCode" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:6}MeasurementUnitCommonCodeContentType" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasureType", propOrder = {
    "value"
})
@XmlSeeAlso({
    DeclarationTotalGrossMassMeasureType.class,
    GoodsMeasureGrossMassMeasureType.class,
    GoodsMeasureNetNetWeightMeasureType.class,
    PackagingHeightMeasureType.class,
    PackagingLengthMeasureType.class,
    PackagingVolumeMeasureType.class,
    PackagingWidthMeasureType.class
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
