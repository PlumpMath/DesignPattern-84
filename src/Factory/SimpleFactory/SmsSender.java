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
public class SmsSender implements ISender{

    @Override
    public void send() {
        System.out.println("SmsSender invoke send()");
    }
    
}
