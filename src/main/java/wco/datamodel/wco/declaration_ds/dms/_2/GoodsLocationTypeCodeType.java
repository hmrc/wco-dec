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
import jakarta.xml.bind.annotation.XmlType;
import un.unece.uncefact.data.standard.unqualifieddatatype._6.CodeType;


/**
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOID xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:6" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;L110&lt;/WCOID&gt;
 * </pre>
 * 
 *         
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;WCOFormat xmlns:udt="urn:un:unece:uncefact:data:standard:UnqualifiedDataType:6" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;an..3&lt;/WCOFormat&gt;
 * </pre>
 * 
 * <p>Java class for GoodsLocationTypeCodeType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="GoodsLocationTypeCodeType">
 *   <simpleContent>
 *     <restriction base="<urn:un:unece:uncefact:data:standard:UnqualifiedDataType:6>CodeType">
 *     </restriction>
 *   </simpleContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GoodsLocationTypeCodeType")
public class GoodsLocationTypeCodeType
    extends CodeType
{


}
