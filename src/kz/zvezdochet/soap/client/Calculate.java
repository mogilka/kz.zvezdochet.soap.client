
package kz.zvezdochet.soap.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for calculate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="calculate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="arg1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="arg2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="arg3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="arg4" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="arg5" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="arg6" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="arg7" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="arg8" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="arg9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calculate", propOrder = {
    "arg0",
    "arg1",
    "arg2",
    "arg3",
    "arg4",
    "arg5",
    "arg6",
    "arg7",
    "arg8",
    "arg9"
})
public class Calculate {

    protected int arg0;
    protected int arg1;
    protected int arg2;
    protected int arg3;
    protected int arg4;
    protected int arg5;
    protected double arg6;
    protected double arg7;
    protected double arg8;
    protected String arg9;

    /**
     * Gets the value of the arg0 property.
     * 
     */
    public int getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     * 
     */
    public void setArg0(int value) {
        this.arg0 = value;
    }

    /**
     * Gets the value of the arg1 property.
     * 
     */
    public int getArg1() {
        return arg1;
    }

    /**
     * Sets the value of the arg1 property.
     * 
     */
    public void setArg1(int value) {
        this.arg1 = value;
    }

    /**
     * Gets the value of the arg2 property.
     * 
     */
    public int getArg2() {
        return arg2;
    }

    /**
     * Sets the value of the arg2 property.
     * 
     */
    public void setArg2(int value) {
        this.arg2 = value;
    }

    /**
     * Gets the value of the arg3 property.
     * 
     */
    public int getArg3() {
        return arg3;
    }

    /**
     * Sets the value of the arg3 property.
     * 
     */
    public void setArg3(int value) {
        this.arg3 = value;
    }

    /**
     * Gets the value of the arg4 property.
     * 
     */
    public int getArg4() {
        return arg4;
    }

    /**
     * Sets the value of the arg4 property.
     * 
     */
    public void setArg4(int value) {
        this.arg4 = value;
    }

    /**
     * Gets the value of the arg5 property.
     * 
     */
    public int getArg5() {
        return arg5;
    }

    /**
     * Sets the value of the arg5 property.
     * 
     */
    public void setArg5(int value) {
        this.arg5 = value;
    }

    /**
     * Gets the value of the arg6 property.
     * 
     */
    public double getArg6() {
        return arg6;
    }

    /**
     * Sets the value of the arg6 property.
     * 
     */
    public void setArg6(double value) {
        this.arg6 = value;
    }

    /**
     * Gets the value of the arg7 property.
     * 
     */
    public double getArg7() {
        return arg7;
    }

    /**
     * Sets the value of the arg7 property.
     * 
     */
    public void setArg7(double value) {
        this.arg7 = value;
    }

    /**
     * Gets the value of the arg8 property.
     * 
     */
    public double getArg8() {
        return arg8;
    }

    /**
     * Sets the value of the arg8 property.
     * 
     */
    public void setArg8(double value) {
        this.arg8 = value;
    }

    /**
     * Gets the value of the arg9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArg9() {
        return arg9;
    }

    /**
     * Sets the value of the arg9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArg9(String value) {
        this.arg9 = value;
    }

}
