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
 */
public class SystemErrorMessage implements ErrorMessage {

    //some error message $errorCode
    private String messageTemplate;
    private String helpUrlBase;

    public SystemErrorMessage(String messageTemplate, String helpUrlBase) {
        this.messageTemplate = messageTemplate;
        this.helpUrlBase = helpUrlBase;
    }
    
    @Override
    public String getMessage(String code) {
        return messageTemplate.replace("$errorCode", code) + helpUrlBase + code;
    }

    public void setMessageTemplate(String messageTemplate) {
        this.messageTemplate = messageTemplate;
    }

    public String getHelpUrlBase() {
        return helpUrlBase;
    }

    public void setHelpUrlBase(String helpUrlBase) {
        this.helpUrlBase = helpUrlBase;
    }

}
