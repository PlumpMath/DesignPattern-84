/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Factory.AbstractFactory;


/**
 *
 * @author liuhaodong1
 */
public class SenderMailFactory implements IProvider{

    @Override
    public ISender produce() {
        return new MailSender();
    }
}
