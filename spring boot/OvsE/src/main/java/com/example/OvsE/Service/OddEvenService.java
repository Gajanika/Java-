package com.example.OvsE.Service;

import org.springframework.stereotype.Service;

import com.example.OvsE.Model.ResponceOvsE;

@Service
public class OddEvenService {
	public ResponceOvsE checkOddOrEven(int number) {
        String result = (number % 2 == 0) ? "Even" : "Odd";
        return new ResponceOvsE(result);
    }
}
