package th.ku.dbtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class CashRegisterMain {
    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(CashRegisterconfig.class);
        CashRegister register = context.getBean(CashRegister.class);

        register.recordPurchase(200);
        System.out.println(register.getTotal());
    }
}
