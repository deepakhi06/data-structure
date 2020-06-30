package com.utsav.statepatternATM;

public interface AtmMachineState {
	  public void insertDebitCard();
	  
	  public void ejectDebitCard();
	  
	  public void enterPinAndWithdrawMoney();
}
