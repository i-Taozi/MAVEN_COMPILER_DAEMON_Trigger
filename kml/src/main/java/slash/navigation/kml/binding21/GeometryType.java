//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-646 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.01.16 at 09:21:13 PM MEZ 
//


package slash.navigation.kml.binding21;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeometryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeometryType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://earth.google.com/kml/2.1}ObjectType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeometryType")
@XmlSeeAlso({
    PolygonType.class,
    PointType.class,
    LineStringType.class,
    ModelType.class,
    MultiGeometryType.class,
    LinearRingType.class
})
public abstract class GeometryType
    extends ObjectType
{


}
