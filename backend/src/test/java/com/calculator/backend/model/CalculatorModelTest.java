package meme.generator.backend.model;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

@Test
public class CalculatorModelTest {
    CalculatorModel calculator = new CalculatorModel(4.5,9,13.5,'+');

    public void constructorShouldSetAllValue() {
		assertEquals(calculator.getLeftOperand(), 4.5);
		assertEquals(calculator.getRightOperand(), 8);
		assertEquals(calculator.getResult(),13.5);
        assertEquals(calculator.getOperation(), '+');
	}

    public void leftOperandMustBeGreaterThanZero() {
        assertEquals();
    }
}