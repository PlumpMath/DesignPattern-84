package Factory.StaticFactory;

import Factory.StaticFactory.ISender;
import Factory.StaticFactory.MailSender;
import Factory.StaticFactory.SmsSender;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author liuhaodong1
 */
public class SenderFactory {
    
  public static ISender produceMail(){  
        return new MailSender();  
    }  
      
    public static ISender produceSms(){  
        return new SmsSender();  
    }  
    
}
