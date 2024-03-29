package th.ku.register;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class CashRegisterMain {
    public static void main(String[] args) {
//        th.ku.register.CATaxCalculator caTax = new th.ku.register.CashRegisterMain();
//        th.ku.register.CashRegister register = new th.ku.register.CashRegister(carTax);
//
        ApplicationContext context =
                new ClassPathXmlApplicationContext("config-annotation.xml");
        CashRegister register = context.getBean(CashRegister.class);

        register.recordPurchase(160);
        System.out.println(register.getTotal());
    }
}
