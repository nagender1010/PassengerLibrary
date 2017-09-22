package trng.imcs.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import trng.imcs.test.model.Passenger;
import trng.imcs.test.repository.PassengerRepository;

@Service
public class PassengerServiceImpl implements PassengerService {

	@Autowired
	PassengerRepository repo;

	@Override
	public Passenger addPassenger(Passenger p) {
		return repo.save(p);
	}

	@Override
	public Passenger updatePassenger(Passenger p) {
		return repo.save(p);
	}

	@Override
	public void deletePassenger(int profileId) {
		repo.delete(profileId);
	}

	@Override
	public Passenger getPassenger(int profileId) {
		return repo.findOne(profileId);

	}
/*
	@Override
	public List<Employee> getAllPassenger(int deptId) {
		return employeeDAO.findByDeptId(deptId);
	}
*/
}
