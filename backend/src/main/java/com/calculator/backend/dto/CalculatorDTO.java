package com.calculator.backend.dto;
import com.calculator.model.CalculatorModel;

public interface CalculatorDTO {
	public static CalculatorModel add(Double left, Double right) {
		return new CalculatorModel(left, right, left + right, "+");
	}

	public static CalculatorModel subtract(Double left, Double right) {
		return new CalculatorModel(left, right, left - right, "-");
	}

	public static CalculatorModel multiply(Double left, Double right) {
		return new CalculatorModel(left, right, left * right, "*");
	}

	public static CalculatorModel divide(Double left, Double right) {
		return new CalculatorModel(left, right, left / right, "/");
	}
}