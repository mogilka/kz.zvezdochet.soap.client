
package kz.zvezdochet.soap.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for configuration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="configuration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="houses" type="{http://server.soap.zvezdochet.kz/}house" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="planets" type="{http://server.soap.zvezdochet.kz/}planet" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "configuration", propOrder = {
    "houses",
    "planets"
})
public class Configuration {

    @XmlElement(nillable = true)
    protected List<House> houses;
    @XmlElement(nillable = true)
    protected List<Planet> planets;

    /**
     * Gets the value of the houses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the houses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHouses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link House }
     * 
     * 
     */
    public List<House> getHouses() {
        if (houses == null) {
            houses = new ArrayList<House>();
        }
        return this.houses;
    }

    /**
     * Gets the value of the planets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the planets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlanets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Planet }
     * 
     * 
     */
    public List<Planet> getPlanets() {
        if (planets == null) {
            planets = new ArrayList<Planet>();
        }
        return this.planets;
    }

}
