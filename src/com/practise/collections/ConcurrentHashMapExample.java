package com.practise.collections;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        System.out.println(WalletTransactions.DEPOSIT.name() + ":" + WalletTransactions.DEPOSIT.doTransact(1, 23F));
        System.out.println(WalletTransactions.DEPOSIT.name() + ":" + WalletTransactions.DEPOSIT.doTransact(1, 23F));
        System.out.println(WalletTransactions.DEPOSIT.name() + ":" + WalletTransactions.DEPOSIT.doTransact(1, 23F));
        System.out.println(WalletTransactions.DEPOSIT.name() + ":" + WalletTransactions.DEPOSIT.doTransact(1, 23F));
        System.out.println(WalletTransactions.DEPOSIT.name() + ":" + WalletTransactions.DEPOSIT.doTransact(1, 23F));

    }

}

enum WalletTransactions {

    DEPOSIT {
        @Override
        public Float doTransact(int userID, Float amount) {
            Float newBalance = null;
            Float existingBalance = getWallets().putIfAbsent(userID, amount);
            if (existingBalance != null) {
                newBalance = Float.sum(existingBalance, amount);
                getWallets().replace(userID, newBalance);
            } else {
                newBalance = amount;
            }
            return newBalance;
        }
    },
    WITHDRAW {
        @Override
        public Float doTransact(int userID, Float amount) {
            return 0F;
        }
    },
    BALANCE {
        @Override
        public Float doTransact(int userID, Float amount) {
            return 0F;
        }
    };

    public abstract Float doTransact(int userID, Float amount);

    public Map<Integer, Float> getWallets() {
        return wallets;
    }

    private final Map<Integer, Float> wallets = new ConcurrentHashMap<Integer, Float>();

}