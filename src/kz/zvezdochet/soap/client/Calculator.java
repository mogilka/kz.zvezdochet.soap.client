
package kz.zvezdochet.soap.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Calculator", targetNamespace = "http://server.soap.zvezdochet.kz/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Calculator {


    /**
     * 
     * @param arg5
     * @param arg4
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @param arg6
     * @param arg7
     * @param arg8
     * @param arg9
     * @return
     *     returns kz.zvezdochet.soap.client.Configuration
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "calculate", targetNamespace = "http://server.soap.zvezdochet.kz/", className = "kz.zvezdochet.soap.client.Calculate")
    @ResponseWrapper(localName = "calculateResponse", targetNamespace = "http://server.soap.zvezdochet.kz/", className = "kz.zvezdochet.soap.client.CalculateResponse")
    @Action(input = "http://server.soap.zvezdochet.kz/Calculator/calculateRequest", output = "http://server.soap.zvezdochet.kz/Calculator/calculateResponse")
    public Configuration calculate(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        int arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        int arg4,
        @WebParam(name = "arg5", targetNamespace = "")
        int arg5,
        @WebParam(name = "arg6", targetNamespace = "")
        double arg6,
        @WebParam(name = "arg7", targetNamespace = "")
        double arg7,
        @WebParam(name = "arg8", targetNamespace = "")
        double arg8,
        @WebParam(name = "arg9", targetNamespace = "")
        String arg9);

}