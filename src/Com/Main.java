/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Com;

import Factory.AbstractFactory.IProvider;
import Factory.AbstractFactory.SenderMailFactory;




/**
 *
 * @author liuhaodong1
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Main main = new Main();
        main.test1_Factory_SimpleFactory();
        main.test2_Factory_MutipleFactory();        
        main.test3_Factory_StaticFactory();
        main.test4_Factory_AbstractFactory();
    }
    
    private void test1_Factory_SimpleFactory(){
        System.out.println("test1_Factory_SimpleFactory:");
        Factory.SimpleFactory.SenderFactory factory = new Factory.SimpleFactory.SenderFactory();
        factory.create("mail").send();
        factory.create("sms").send();
    }
    
    private void test2_Factory_MutipleFactory(){
        System.out.println("test2_Factory_MutipleFactory:");
        Factory.MutipleFactory.SenderFactory factory = new Factory.MutipleFactory.SenderFactory();
        factory.produceMail().send();
        factory.produceSms().send();
    }
    
    private void test3_Factory_StaticFactory(){
        System.out.println("test3_Factory_StaticFactory:");
        Factory.StaticFactory.ISender sender = Factory.StaticFactory.SenderFactory.produceMail();
        sender.send();
        sender = Factory.StaticFactory.SenderFactory.produceSms();
        sender.send();
    }
    
    private void test4_Factory_AbstractFactory(){
        System.out.println("test4_Factory_AbstractFactory:");   
        IProvider provider = new SenderMailFactory();
        Factory.AbstractFactory.ISender sender = provider.produce();
        sender.send();
    }
}
