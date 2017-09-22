package trng.imcs.test.service;


import javax.jws.WebService;

import org.springframework.stereotype.Service;

import trng.imcs.test.model.Passenger;

@WebService
@Service
public interface PassengerService {

	public Passenger addPassenger(Passenger p);

	public Passenger updatePassenger(Passenger p);

	public void deletePassenger(int profileId);

	public Passenger getPassenger(int profileId);


}
