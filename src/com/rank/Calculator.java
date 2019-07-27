package com.rank;

class Calculator{
    public int power(int n, int p) throws NonNegative {
        if(n<0||p<0){
            throw new NonNegative();
        }else{
            return (int) Math.pow(n,p);
        }
    }
}
