package trng.imcs.test.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import trng.imcs.test.model.Passenger;

public interface PassengerRepository extends CrudRepository<Passenger, Integer> {
	
	//List<Passenger> findByDeptId(int deptId);

}
