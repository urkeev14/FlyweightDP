/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import domain.errormessage.factory.ErrorMessageFactory;
import domain.errormessage.impl.SystemErrorMessage;
import domain.errormessage.impl.UserBannedErrorMessage;
import domain.errortype.ErrorType;

/**
 *
 * @author urosv
 */
public class FlyweightDemo {

    public static void main(String[] args) {
        SystemErrorMessage message1 = ErrorMessageFactory.getInstance().getError(ErrorType.GenericSystemError);
        System.out.println(message1.getMessage("404"));

        System.out.println(  );
        
        UserBannedErrorMessage message2 = ErrorMessageFactory.getInstance().getUserBannedErrorMessage("1202");
        System.out.println(message2.getMessage(null));
    }

}
