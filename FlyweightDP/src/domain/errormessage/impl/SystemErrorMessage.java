/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.errormessage.impl;

import domain.errormessage.ErrorMessage;

/**
 *
 * @author urosv
 * Intrinsic class. Should be immutable.
 */
public class SystemErrorMessage implements ErrorMessage {

    //intrisic state properties
    private String messageTemplate;
    private String helpUrlBase;

    public SystemErrorMessage(String messageTemplate, String helpUrlBase) {
        this.messageTemplate = messageTemplate;
        this.helpUrlBase = helpUrlBase;
    }
    
    @Override
    public String getMessage(String code) {
        //argument 'code' is extrinsic state 
        return messageTemplate.replace("$errorCode", code) + helpUrlBase + code;
    }

}
