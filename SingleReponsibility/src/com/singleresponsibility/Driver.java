package com.singleresponsibility;

public class Driver {
    private int mileage;

    // functionality
    public void drive(int milesDriven){
        this.setMileage(this.getMileage() + milesDriven);
    }

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}


}