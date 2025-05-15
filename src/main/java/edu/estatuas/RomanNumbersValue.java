package edu.estatuas;

public enum RomanNumbersValue {
    I(1),
    V(5),
    X(10),
    L(50),
    C(100),
    D(500),
    M(1000);

    private Short value;
    private RomanNumbersValue(int value) {

        this.value = Short.valueOf(String.valueOf(value));
    }

    public Short getValue() {
        return this.value;
    }

}
