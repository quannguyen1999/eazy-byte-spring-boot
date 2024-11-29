package com.example.accounts.service;

import com.example.accounts.dto.CustomerDto;

public interface IAccountsService {

    /*
    *
    * @param customerDto - CustomerDto Object
    * */
    void createAccount(CustomerDto customerDto);

    /*
    * @param mobileNumber - Input Mobile Number
    * @return Accounts Details based on a given mobileNumber
    * */
    CustomerDto fetchAccount(String mobileNumber);

    /*
    * @param customerDto - CustomerDto Object
    * @return boolean indicating if the update of Account details is successfull or not
    * */
    boolean updateAccount(CustomerDto customerDto);

    /*
    * @param mobileNumber - Input Mobile Number
    * @return boolean indicating if the update of Account details is success or not
    * */
    boolean deleteAccount(String mobileNumber);
}
