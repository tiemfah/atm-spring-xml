package atm;

import atm.config.ATMConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        DataSourceDB dataSourceDB = new DataSourceDB();
//        DataSourceFile dataSourceFile = new DataSourceFile("customers.txt");
//        Bank bank = new Bank("My Bank", dataSourceFile);
//        ATM atm = new ATM(bank);
//        AtmUI atmUI = new AtmUI(atm);
//        atmUI.run();

        // CodeConfig-based
//        ApplicationContext context =
//                new AnnotationConfigApplicationContext(ATMConfig.class);
        // Annotation-based
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean.xml");

        AtmUI atmUI = context.getBean(AtmUI.class);
        atmUI.run();
    }
}
