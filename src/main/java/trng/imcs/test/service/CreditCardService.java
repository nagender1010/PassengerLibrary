package trng.imcs.test.service;

import java.util.List;

import trng.imcs.test.model.CreditCard;

public interface CreditCardService {
	
	public CreditCard getCreditCard(int profileId);

	public List<CreditCard> getAllCreditCards();

}
