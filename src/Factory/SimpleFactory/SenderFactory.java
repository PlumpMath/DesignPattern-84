/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Factory.SimpleFactory;

import Factory.StaticFactory.*;

/**
 *
 * @author liuhaodong1
 */
public class SenderFactory {
    
    /**
     * 
     * @param type
     * type == mail return MailSender
     * type == sms return SmsSender
     * @return ISender
     */
    public ISender create(String type){
        if(type.equals("mail")){
            return new MailSender();
        }else if(type.equals("sms")){
            return new SmsSender();
        }
        return null;
    }
}
