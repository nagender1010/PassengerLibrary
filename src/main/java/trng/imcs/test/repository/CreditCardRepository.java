package trng.imcs.test.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import trng.imcs.test.model.CreditCard;

public interface CreditCardRepository extends CrudRepository<CreditCard, Integer> {

}
