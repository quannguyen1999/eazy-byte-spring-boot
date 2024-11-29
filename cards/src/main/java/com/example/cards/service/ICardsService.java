package com.example.cards.service;

import com.example.cards.dto.CardsDto;

public interface ICardsService {

    /*
    *
    * @param mobileNumber - Mobile Number of the Customer
    * */
    void createCard(String mobileNumber);

    /*
    * @param mobileNumber - Input Mobile Number
    * @return Card Details based on a given mobileNumber
    * */
    CardsDto fetchCard(String mobileNumber);

    /*
    * @param customerDto - CustomerDto Object
    * @return boolean indicating if the update of card details is successfull or not
    * */
    boolean updateCard(CardsDto cardsDto);

    /*
    * @param mobileNumber - Input Mobile Number
    * @return boolean indicating if the update of card details is success or not
    * */
    boolean deleteCard(String mobileNumber);
}
