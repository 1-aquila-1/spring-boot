package br.com.jmapper.atributos.caso1;

import com.googlecode.jmapper.annotations.JMap;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Destination {
    @JMap
    private String id;
    @JMap("sourceField")                   
    private String destinationField;        
    private String other;                   
}
