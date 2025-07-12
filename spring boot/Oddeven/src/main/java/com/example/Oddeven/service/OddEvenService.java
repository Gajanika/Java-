package com.example.Oddeven.service;

import org.springframework.stereotype.Service;

import com.example.Oddeven.model.ResponceOvsE;

@Service
public class OddEvenService {

	public ResponceOvsE checkOddOrEven(int number) {
        String result = (number % 2 == 0) ? "Even" : "Odd";
        return new ResponceOvsE(result);
    }
	
}
