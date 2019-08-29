package th.ku.dbtutorial;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CashRegisterconfig {
    @Bean
    public TaxCalculator caTaxCalculator(){
        return new CATaxCalculator();
    }

    @Bean
    public TaxCalculator nyTaxCalculator(){
        return new NYTaxCalculator();
    }

    @Bean
    public CashRegister cashRegister(){
        System.out.println("test");
        return new CashRegister("CA",nyTaxCalculator());
    }

}
