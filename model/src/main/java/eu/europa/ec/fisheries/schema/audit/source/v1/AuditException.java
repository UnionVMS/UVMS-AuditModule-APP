
package eu.europa.ec.fisheries.schema.audit.source.v1;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.13
 * 2017-09-18T16:51:40.230+02:00
 * Generated source version: 3.1.13
 */

@WebFault(name = "exceptionType", targetNamespace = "urn:common.audit.schema.fisheries.ec.europa.eu:v1")
public class AuditException extends Exception {
    
    private eu.europa.ec.fisheries.schema.audit.common.v1.ExceptionType exceptionType;

    public AuditException() {
        super();
    }
    
    public AuditException(String message) {
        super(message);
    }
    
    public AuditException(String message, Throwable cause) {
        super(message, cause);
    }

    public AuditException(String message, eu.europa.ec.fisheries.schema.audit.common.v1.ExceptionType exceptionType) {
        super(message);
        this.exceptionType = exceptionType;
    }

    public AuditException(String message, eu.europa.ec.fisheries.schema.audit.common.v1.ExceptionType exceptionType, Throwable cause) {
        super(message, cause);
        this.exceptionType = exceptionType;
    }

    public eu.europa.ec.fisheries.schema.audit.common.v1.ExceptionType getFaultInfo() {
        return this.exceptionType;
    }
}