package ca.ciccc.wmad202.assignment5.question3;

import java.util.ArrayList;
import java.util.HashMap;

public class PolynomialFactor {

    private HashMap<SinglePolynomialFactor, Integer> singlePolynomialFactors;

    public PolynomialFactor() {
        this.singlePolynomialFactors = new HashMap<>();
    }

    public PolynomialFactor(HashMap<SinglePolynomialFactor, Integer> singlePolynomialFactors) {
        this.singlePolynomialFactors = singlePolynomialFactors;

    }
    public void addSinglePolynomialFactor(SinglePolynomialFactor single,int number){
        this.singlePolynomialFactors.put(single,number);

    }

    public String getPolynomialFactor() {
        String allFactor = "";
        for (SinglePolynomialFactor single : this.singlePolynomialFactors.keySet()) {
            allFactor = single + " + " + allFactor;
        }
        return allFactor;
    }



}

