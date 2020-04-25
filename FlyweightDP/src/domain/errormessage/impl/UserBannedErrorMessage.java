/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.errormessage.impl;

import domain.errormessage.ErrorMessage;
import java.time.Duration;

/**
 *
 * @author urosv
 */
public class UserBannedErrorMessage implements ErrorMessage{

    private String caseID;
    private String message;
    private String remarks;
    private Duration banDuration;

    public UserBannedErrorMessage(String caseID) {
        this.caseID = caseID;
        this.remarks = "You violated terms of use.";
        this.banDuration = Duration.ofDays(2);
        this.message = generateMessage();

    }

    private String generateMessage() {
        String message = "You are BANNED. Sorry. \nMore information:\n";
        message += caseID + "\n";
        message += remarks + "\n";
        message += "Banned for: " + this.banDuration.toHours() + " hours";
        return message;
    }

    public String getMessage(String code) {
        return message;
    }
}
