package com.calculator.backend.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.calculator.backend.dto.CalculatorDTO;
import come.calculator.backend.model.CalculatorModel;

@RestController
@RequestMapping("/api/calculator")
public class MathController implements CalculatorDTO {

	@GetMapping("/add")
	public ResponseEntity<CalculatorModel> add(@RequestParam(value = "param1", required = true) String param1,
			@RequestParam(value = "param2", required = true) String param2) {
		try {
			return ResponseEntity.ok(Calculator.add(Double.parseDouble(param1), Double.parseDouble(param2)));
		} catch (Exception e) {
			return new ResponseEntity<CalculatorModel>(new CalculatorModel("+"), HttpStatus.BAD_REQUEST);
		}
	}

	@GetMapping("/subtract")
	public ResponseEntity<CalculatorModel> subtract(@RequestParam(value = "param1", required = true) String param1,
			@RequestParam(value = "param2", required = true) String param2) {
		try {
			return ResponseEntity.ok(Calculator.subtract(Double.parseDouble(param1), Double.parseDouble(param2)));
		} catch (Exception e) {
			return new ResponseEntity<CalculatorModel>(new CalculatorModel("-"), HttpStatus.BAD_REQUEST);
		}
	}

	@GetMapping("/multiply")
	public ResponseEntity<CalculatorModel> multiply(@RequestParam(value = "param1", required = true) String param1,
			@RequestParam(value = "param2", required = true) String param2) {
		try {
			return ResponseEntity.ok(Calculator.multiply(Double.parseDouble(param1), Double.parseDouble(param2)));
		} catch (Exception e) {
			return new ResponseEntity<CalculatorModel>(new CalculatorModel("*"), HttpStatus.BAD_REQUEST);
		}
	}

	@GetMapping("/divide")
	public ResponseEntity<CalculatorModel> divide(@RequestParam(value = "param1", required = true) String param1,
			@RequestParam(value = "param2", required = true) String param2) {
		try {
			Double denominator = Double.parseDouble(param2);
			if (denominator == 0.0) {
				throw new ArithmeticException();
			}
			return ResponseEntity.ok(Calculator.divide(Double.parseDouble(param1), Double.parseDouble(param2)));
		} catch (Exception e) {
			return new ResponseEntity<CalculatorModel>(new CalculatorModel("/"), HttpStatus.BAD_REQUEST);
		}
	}
}