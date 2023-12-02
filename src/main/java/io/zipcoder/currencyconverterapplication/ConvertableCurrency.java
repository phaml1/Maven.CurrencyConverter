package io.zipcoder.currencyconverterapplication;

public interface ConvertableCurrency {
    default Double convert(CurrencyType currencyType) {
        //CurrencyType temp = CurrencyType.getTypeOfCurrency(this);
        return currencyType.getRate() / CurrencyType.getTypeOfCurrency(this).getRate();
    }
}
