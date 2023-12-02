package io.zipcoder.currencyconverterapplication;

public enum CurrencyType {
    AUSTRALIAN_DOLLAR(2.70),
    CANADIAN_DOLLAR(2.64),
    CHINESE_YR(13.84),
    EURO(1.88),
    FRANC(2.02),
    POUND(1.64),
    RINGGIT(8.94),
    RUPEE(136.64),
    SINGAPORE_DOLLAR(1.86),
    US_DOLLAR(2.0),
    UNIVERSAL_CURRENCY(1.0),
    YEN(231.68);

    private final double rate;

    CurrencyType(double rate) {
        this.rate = rate;
    }

    public Double getRate() {
        return rate;
    }

    public static CurrencyType getTypeOfCurrency(ConvertableCurrency currency) {
        switch(currency.getClass().getSimpleName()){
            case "AustralianDollar":
                return CurrencyType.AUSTRALIAN_DOLLAR;
            case "CanadianDollar":
                return CurrencyType.CANADIAN_DOLLAR;
            case "ChineseYR":
                return CurrencyType.CHINESE_YR;
            case "Euro":
                return CurrencyType.EURO;
            case "Franc":
                return CurrencyType.FRANC;
            case "Pound":
                return CurrencyType.POUND;
            case "Ringgit":
                return CurrencyType.RINGGIT;
            case "Rupee":
                return CurrencyType.RUPEE;
            case "SingaporeDollar":
                return CurrencyType.SINGAPORE_DOLLAR;
            case "UniversalCurrency":
                return CurrencyType.UNIVERSAL_CURRENCY;
            case "USDollar":
                return CurrencyType.US_DOLLAR;
            case "Yen":
                return CurrencyType.YEN;
        }
        return null;
    }
}
