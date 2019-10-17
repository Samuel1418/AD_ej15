/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

/**
 *
 * @author oracle
 */
public class Exercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, XMLStreamException {

        XMLInputFactory imput = XMLInputFactory.newInstance();
        XMLStreamReader leer = imput.createXMLStreamReader(new FileReader("/home/oracle/Desktop/ProbaExer4/autores.xml"));
        
        System.out.println(leer.getVersion());
        
      while (leer.hasNext()) {
           leer.next();
           
           if (leer.getEventType() == XMLStreamReader.START_ELEMENT) {
            System.out.println(leer.getLocalName());
            
           }
           if (leer.getEventType() == XMLStreamReader.START_ELEMENT) {  //No hacia falta que se leyesen los atributos, esto sobra
            String lectura=leer.getAttributeLocalName(0);
            if(lectura!= null)
            System.out.println(lectura+"= "+leer.getAttributeValue(0));         
           }
           
           
           if (leer.getEventType() == XMLStreamReader.CHARACTERS) {
             System.out.println(leer.getText());  
           }
           
           
           }
           
        }
       
    }
