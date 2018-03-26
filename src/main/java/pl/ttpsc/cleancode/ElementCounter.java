package pl.ttpsc.cleancode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ElementCounter {

	Map<Integer, Integer> elementCounts = new HashMap<>();
	private int maxValue = Integer.MIN_VALUE;
	private int minValue = Integer.MAX_VALUE;
	
	public ElementCounter(List<Integer> elements) {
		countElements(elements);
	}
	
	public ElementCounter() {

	}
	
	public void countElements(List<Integer> elements) {
		for (Integer i : elements) {
			countElement(i);
		}
	}
	
	public void countElement(Integer element) {
		elementCounts.put(element, elementCounts.getOrDefault(element, 0) + 1);

		if (element > maxValue) {
			maxValue = element;
		}
		
		if (element < minValue) {
			minValue = element;
		}
	}
	
	public int getElementCount(int element) {
		return elementCounts.getOrDefault(element, 0);
	}
	
	public double calculateMean() {
		double weightValueProductsSum = 0;
		double weightsSum = 0;

		for (Entry<Integer, Integer> entry : elementCounts.entrySet()) {
			weightsSum += entry.getValue();
			weightValueProductsSum += entry.getKey() * entry.getValue();
		}

		return weightValueProductsSum/weightsSum;
	}
	
	public int getMaxValue() {
		return maxValue;
	}
	
	public int getMinValue() {
		return minValue;
	}

	public String getFizzBuzzNumber(int number) {
		//TODO: implement
		return null;
	}
}