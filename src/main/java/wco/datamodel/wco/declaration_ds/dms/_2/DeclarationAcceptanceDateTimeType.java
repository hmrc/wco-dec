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

package wco.datamodel.wco.declaration_ds.dms._2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import un.unece.uncefact.data.standard.unqualifieddatatype._6.DateTimeType;


/**
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOID xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:6" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;023&lt;/WCOID&gt;
 * </pre>
 * 
 *         
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOFormat xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:6" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;an..35&lt;/WCOFormat&gt;
 * </pre>
 * 
 * <p>Java class for DeclarationAcceptanceDateTimeType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DeclarationAcceptanceDateTimeType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="DateTimeString">
 *           <complexType>
 *             <simpleContent>
 *               <restriction base="<urn:un:unece:uncefact:data:standard:UnqualifiedDataType:6>DateTimeType">
 *               </restriction>
 *             </simpleContent>
 *           </complexType>
 *         </element>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeclarationAcceptanceDateTimeType", propOrder = {
    "dateTimeString"
})
public class DeclarationAcceptanceDateTimeType {

    @XmlElement(name = "DateTimeString")
    protected DeclarationAcceptanceDateTimeType.DateTimeString dateTimeString;

    /**
     * Gets the value of the dateTimeString property.
     * 
     * @return
     *     possible object is
     *     {@link DeclarationAcceptanceDateTimeType.DateTimeString }
     *     
     */
    public DeclarationAcceptanceDateTimeType.DateTimeString getDateTimeString() {
        return dateTimeString;
    }

    /**
     * Sets the value of the dateTimeString property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarationAcceptanceDateTimeType.DateTimeString }
     *     
     */
    public void setDateTimeString(DeclarationAcceptanceDateTimeType.DateTimeString value) {
        this.dateTimeString = value;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <simpleContent>
     *     <restriction base="<urn:un:unece:uncefact:data:standard:UnqualifiedDataType:6>DateTimeType">
     *     </restriction>
     *   </simpleContent>
     * </complexType>
     * }</pre>
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
