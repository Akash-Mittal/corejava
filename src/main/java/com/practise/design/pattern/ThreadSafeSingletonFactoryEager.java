package com.practise.design.pattern;

public enum ThreadSafeSingletonFactoryEager {

    FACTORY;
    public UserService getUserService() {
        return USER_SERVICE;
    }

    public CurrencyService getCurrencyService() {
        return CURRENCY_SERVICE;
    }

    public UserCurrencyService getUserCurrencyService() {
        return USER_CURRENCY_SERVICE;
    }

    public UserWalletService getUserWalletService() {
        return USER_WALLET_SERVICE;
    }

    public static void main(String[] args) {
        System.out.println(ThreadSafeSingletonFactoryEager.FACTORY.getCurrencyService().hashCode());
        System.out.println(ThreadSafeSingletonFactoryEager.FACTORY.getCurrencyService().hashCode());

    }

    private static final UserService USER_SERVICE = new UserService();
    private static final CurrencyService CURRENCY_SERVICE = new CurrencyService();
    private static final UserCurrencyService USER_CURRENCY_SERVICE = new UserCurrencyService();
    private static final UserWalletService USER_WALLET_SERVICE = new UserWalletService();

}
