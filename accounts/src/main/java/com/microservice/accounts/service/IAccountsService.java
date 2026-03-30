package com.microservice.accounts.service;

import com.microservice.accounts.dto.CustomerDto;

public interface IAccountsService {

	void createAccount(CustomerDto customerDto);

	/**
	 * 
	 * @param mobileNumber - Input Mobile Number
	 * @return Accounts Details based on a given mobile number
	 */
	CustomerDto fetchAccount(String mobileNumber);

	/**
	 * 
	 * @param customerDto - CustomerDto Object
	 * @return boolean indicating if the update of Account details is successful or
	 *         not
	 */
	boolean updateAccount(CustomerDto customerDto);

	/**
	 * 
	 * @param mobileNumber - Input Mobile Number
	 * @return boolean indicating if the delete of Account details is successful or
	 *         not
	 */
	boolean deleteAccount(String mobileNumber);

}
