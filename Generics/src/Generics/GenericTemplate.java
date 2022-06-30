package Generics;

public class GenericTemplate<T> {
	
	private T testVariable;
	private T testVariableTwo;
	
	@Override
	public String toString() {
		return "GenericTemplate [testVariable=" + testVariable + ", testVariableTwo=" + testVariableTwo + "]";
	}

	public T getTestVariableTwo() {
		return testVariableTwo;
	}

	public void setTestVariableTwo(T testVariableTwo) {
		this.testVariableTwo = testVariableTwo;
	}

	public void set(T testVariable) {
		this.testVariable = testVariable;
	}

	public T getTestVariable() {
		return testVariable;
	}

	public void setTestVariable(T testVariable) {
		this.testVariable = testVariable;
	}
	
	
	
}
