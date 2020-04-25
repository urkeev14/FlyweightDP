/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.errormessage.factory;

import domain.errormessage.impl.SystemErrorMessage;
import domain.errormessage.impl.UserBannedErrorMessage;
import domain.errortype.ErrorType;
import java.util.HashMap;
import java.util.Map;
import constants.Messages;

/**
 *
 * @author urosv Flyweight factory. Returns shared flyweight instance.
 */
public class ErrorMessageFactory {

    private static final ErrorMessageFactory instance = new ErrorMessageFactory();
    private Map<ErrorType, SystemErrorMessage> errorMessages = new HashMap<>();

    private ErrorMessageFactory() {

        errorMessages.put(ErrorType.GenericSystemError, getGenericSystemErrorMessage());
        errorMessages.put(ErrorType.PageNotFoundError, getPageNotFoundErrorMessage());

    }

    public static ErrorMessageFactory getInstance() {
        return instance;
    }

    
    //intrinsic
    public SystemErrorMessage getError(ErrorType errorType) {
        return errorMessages.get(errorType);
    }

    //extrinsic
    public UserBannedErrorMessage getUserBannedErrorMessage(String caseID) {
        return new UserBannedErrorMessage(caseID);
    }
    
    

    private static SystemErrorMessage getGenericSystemErrorMessage() {
        return new SystemErrorMessage(Messages.GENERIC_SYSTEM_ERROR,
                Messages.GENERIC_SYSTEM_ERROR_URL);
    }

    private static SystemErrorMessage getPageNotFoundErrorMessage() {
        return new SystemErrorMessage(Messages.PAGE_NOT_FOUND_ERROR,
                Messages.PAGE_NOT_FOUND_ERROR_URL);
    }

}
