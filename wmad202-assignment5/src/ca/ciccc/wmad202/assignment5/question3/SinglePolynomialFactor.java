package ca.ciccc.wmad202.assignment5.question3;

public class SinglePolynomialFactor {

    private int coefficient;
    private String baseFactor;
    private int exponent;

    public SinglePolynomialFactor(int coefficient,String baseFactor,int exponent){
        this.coefficient=coefficient;
        this.baseFactor=baseFactor;
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

}
