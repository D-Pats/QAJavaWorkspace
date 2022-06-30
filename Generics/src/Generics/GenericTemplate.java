package Generics;

public class GenericTemplate<T> {
	
	private T testVariable;
	
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
