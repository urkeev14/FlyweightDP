/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.errormessage;

/**
 *
 * @author urosv 
 * Interface to be implemented by Flyweights
 */
public interface ErrorMessage {

    String getMessage(String code);

}
