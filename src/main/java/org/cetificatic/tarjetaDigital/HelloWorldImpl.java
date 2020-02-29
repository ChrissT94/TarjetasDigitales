
package org.cetificatic.tarjetaDigital;

import javax.jws.WebService;

@WebService(endpointInterface = "org.cetificatic.tarjetaDigital.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
    
    public String sayBye(String nombre) {
        return "Adiós: " + nombre;
    }
}

