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

    // getting values from PolynomialFactor's coefficient numbers and putting them to Arraylist
    // and then check their coefficient numbers
    public boolean  checkPolynomialEquationsEquality(PolynomialFactor factor2){
        ArrayList<Integer> values1= new ArrayList<>();
        ArrayList<Integer> values2= new ArrayList<>();
        for(SinglePolynomialFactor single:this.singlePolynomialFactors.keySet()){ // first PolynomialFactor
            values1.add(single.getCoefficient());
        }
        for(SinglePolynomialFactor single:factor2.singlePolynomialFactors.keySet()){ // second PolynomialFactor
            values2.add(single.getCoefficient());
        }

        if (values1.equals(values2)){
            return true;
        }
        else{
            return false;
        }

    }
    public int getBiggestExponentNumber(){
        int biggest=0;
        for(SinglePolynomialFactor single:this.singlePolynomialFactors.keySet()){
            if(single.getExponent()>biggest){
                biggest=single.getExponent();
            }

        }
        return biggest;
    }
    public void addPolynomialEquations(PolynomialFactor factor2){
        ArrayList<Integer> coefficientValues1= new ArrayList<>();
        ArrayList<Integer> coefficientValues2= new ArrayList<>();
        ArrayList<Integer> exponentValues1= new ArrayList<>();
        ArrayList<Integer> exponentValues2= new ArrayList<>();

        for(SinglePolynomialFactor single:this.singlePolynomialFactors.keySet()){ // first PolynomialFactor
            coefficientValues1.add(single.getCoefficient());
            exponentValues1.add(single.getExponent());
        }
        for(SinglePolynomialFactor single:factor2.singlePolynomialFactors.keySet()){ // second PolynomialFactor
            coefficientValues2.add(single.getCoefficient());
            exponentValues2.add(single.getExponent());
        }
        for(int i=0;i<exponentValues1.size();i++){
            int coeff=0;
            for(int j=0;j<exponentValues2.size();j++){
                if(exponentValues2.get(j)==exponentValues1.get(i)){
                    coeff= coefficientValues1.get(i) + coefficientValues2.get(j);
                }
            }
            if(coeff!=0){
                coefficientValues1.add(i,coeff);
            }
            else{
                coefficientValues1.add(i,coefficientValues1.get(i));
            }


        }

        System.out.print(coefficientValues1.get(0) + "*" + "x" + "^" + exponentValues1.get(0));
        System.out.println(" + " + coefficientValues1.get(1) + "*" + "x" + "^" + exponentValues1.get(1));



    }
}





