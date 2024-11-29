package com.example.loans.service;

import com.example.loans.dto.LoansDto;

public interface ILoansService {

    /*
    *
    * @param mobileNumber - Mobile Number of the Customer
    * */
    void createLoan(String mobileNumber);

    /*
    * @param mobileNumber - Input Mobile Number
    * @return Card Details based on a given mobileNumber
    * */
    LoansDto fetchLoan(String mobileNumber);

    /*
    * @param customerDto - CustomerDto Object
    * @return boolean indicating if the update of card details is successfull or not
    * */
    boolean updateLoan(LoansDto loansDto);

    /*
    * @param mobileNumber - Input Mobile Number
    * @return boolean indicating if the update of card details is success or not
    * */
    boolean deleteLoan(String mobileNumber);
}
