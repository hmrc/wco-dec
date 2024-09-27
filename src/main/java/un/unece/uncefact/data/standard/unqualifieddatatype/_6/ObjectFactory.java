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

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the un.unece.uncefact.data.standard.unqualifieddatatype._6 package. 
 * <p>An ObjectFactory allows you to programmatically 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: un.unece.uncefact.data.standard.unqualifieddatatype._6
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AmountType }
     * 
     * @return
     *     the new instance of {@link AmountType }
     */
    public AmountType createAmountType() {
        return new AmountType();
    }

    /**
     * Create an instance of {@link CodeType }
     * 
     * @return
     *     the new instance of {@link CodeType }
     */
    public CodeType createCodeType() {
        return new CodeType();
    }

    /**
     * Create an instance of {@link DateTimeType }
     * 
     * @return
     *     the new instance of {@link DateTimeType }
     */
    public DateTimeType createDateTimeType() {
        return new DateTimeType();
    }

    /**
     * Create an instance of {@link IDType }
     * 
     * @return
     *     the new instance of {@link IDType }
     */
    public IDType createIDType() {
        return new IDType();
    }

    /**
     * Create an instance of {@link MeasureType }
     * 
     * @return
     *     the new instance of {@link MeasureType }
     */
    public MeasureType createMeasureType() {
        return new MeasureType();
    }

    /**
     * Create an instance of {@link QuantityType }
     * 
     * @return
     *     the new instance of {@link QuantityType }
     */
    public QuantityType createQuantityType() {
        return new QuantityType();
    }

    /**
     * Create an instance of {@link TextType }
     * 
     * @return
     *     the new instance of {@link TextType }
     */
    public TextType createTextType() {
        return new TextType();
    }

}
