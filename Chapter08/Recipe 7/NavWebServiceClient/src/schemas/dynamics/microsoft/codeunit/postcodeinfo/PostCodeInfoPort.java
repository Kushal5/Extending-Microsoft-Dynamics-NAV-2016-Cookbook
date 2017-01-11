
package schemas.dynamics.microsoft.codeunit.postcodeinfo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PostCodeInfo_Port", targetNamespace = "urn:microsoft-dynamics-schemas/codeunit/PostCodeInfo")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PostCodeInfoPort {


    /**
     * 
     * @param postCode
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetCityByPostCode", action = "urn:microsoft-dynamics-schemas/codeunit/PostCodeInfo:GetCityByPostCode")
    @WebResult(name = "return_value", targetNamespace = "urn:microsoft-dynamics-schemas/codeunit/PostCodeInfo")
    @RequestWrapper(localName = "GetCityByPostCode", targetNamespace = "urn:microsoft-dynamics-schemas/codeunit/PostCodeInfo", className = "schemas.dynamics.microsoft.codeunit.postcodeinfo.GetCityByPostCode")
    @ResponseWrapper(localName = "GetCityByPostCode_Result", targetNamespace = "urn:microsoft-dynamics-schemas/codeunit/PostCodeInfo", className = "schemas.dynamics.microsoft.codeunit.postcodeinfo.GetCityByPostCodeResult")
    public String getCityByPostCode(
        @WebParam(name = "postCode", targetNamespace = "urn:microsoft-dynamics-schemas/codeunit/PostCodeInfo")
        String postCode);

}