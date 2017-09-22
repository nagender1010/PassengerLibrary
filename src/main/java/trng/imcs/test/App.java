package trng.imcs.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import trng.imcs.test.model.CreditCard;
import trng.imcs.test.model.Passenger;
import trng.imcs.test.repository.CreditCardRepository;
import trng.imcs.test.repository.PassengerRepository;


@SpringBootApplication
@EnableJpaRepositories
public class App {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(App.class, args);
		CreditCardRepository dao = context.getBean(CreditCardRepository.class);
		System.out.println(dao.findOne(1));
		
		Passenger p = new Passenger(1, "123", "chinna", "teegala", "usa", "12345", "email");
		
		PassengerRepository dao1 = context.getBean(PassengerRepository.class);
		dao1.save(p);
		
		System.out.println(p);
		
		/*CreditCard c = new CreditCard("123", "abe", "apr", 1992);
		dao.save(c);*/
	}
}
