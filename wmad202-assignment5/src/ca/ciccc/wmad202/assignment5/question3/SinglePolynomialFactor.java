package ca.ciccc.wmad202.assignment5.question3;

import java.util.ArrayList;
import java.util.Arrays;

public class SinglePolynomialFactor {

    private int coefficient;
    private final String baseFactor="x";
    private int exponent;

    public SinglePolynomialFactor(int coefficient,int exponent){
        this.coefficient=coefficient;

        this.exponent=exponent;

    }
    public int getCoefficient(){
        return this.coefficient;
    }
    public int getExponent(){
        return this.exponent;
    }
    public String getBaseFactor(){
        return this.baseFactor;
    }
    public String getSinglePolynomialFactor(){
        if(this.coefficient==0){
            String factor= (this.baseFactor + "^" + this.exponent);
            return factor;
        }
        if(this.coefficient==1){
            String factor= (this.baseFactor + "^" + this.exponent);
            return factor;
        }
        if(this.exponent==0){
            String factor= (String.valueOf(this.coefficient));
            return factor;
        }
        if(this.exponent==1){
            String factor= (this.coefficient + "*" + this.baseFactor);
            return factor;
        }

        String factor= (this.coefficient + "*" + this.baseFactor + "^" + this.exponent);
        return factor;

    }

    public boolean checkSingleFactorEquality(SinglePolynomialFactor factor2){
        if (this.exponent== factor2.exponent && this.coefficient== factor2.coefficient){
            return true;
        }
        else {
            return false;
        }
    }

}
