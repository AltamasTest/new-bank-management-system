package com.bms.loan.excepction;

public class LoanNotFoundExcepction extends RuntimeException {
public LoanNotFoundExcepction(String message) {
	super(message);
}
}
