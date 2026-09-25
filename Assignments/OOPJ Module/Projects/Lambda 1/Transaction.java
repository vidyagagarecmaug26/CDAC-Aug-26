package org.vidya;

public class Transaction {
	private int txId;
	private float txAmount;
	private boolean txStatus;
	private boolean txArrears;
	
	Transaction(int txId,float txAmount,boolean txStatus,boolean txArrears){
		this.txId=txId;
		this.txAmount=txAmount;
		this.txStatus=txStatus;
		this.txArrears=txArrears;
	}
	public int getTxId() {
		return txId;
	}
	public float getTxAmount() {
		return txAmount;
	}
	public boolean isTxStatus() {
		return txStatus;
	}
	public boolean isTxArrears() {
		return txArrears;
	}
	
	@Override
	public String  toString() {
		return "Transaction [ID= "+ txId +", Amount= "+txAmount+", Status= "+txStatus+", Arrears= "+ txArrears+"]";
	}
	
}
