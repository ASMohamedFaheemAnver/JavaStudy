package com.company._30DaysOfCode;

class NonNegative extends Exception{
    @Override
    public String getMessage() {
        return ("n and p should be non-negative");
    }
}
