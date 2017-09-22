package trng.imcs.test.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import trng.imcs.test.model.CreditCard;
import trng.imcs.test.repository.CreditCardRepository;

@Service
public class CreditCardServiceImpl implements CreditCardService {

	@Autowired
	CreditCardRepository departmentDao;
	
	@Override
	public CreditCard getCreditCard(int profileId) {
		return departmentDao.findOne(profileId);
	}

	@Override
	public List<CreditCard> getAllCreditCards() {
		List<CreditCard> deptList = new ArrayList<>();
		Iterable<CreditCard> itr =  departmentDao.findAll();
		for (CreditCard creditCard : itr) {
			deptList.add(creditCard);
		}
		return deptList;
	}

}
