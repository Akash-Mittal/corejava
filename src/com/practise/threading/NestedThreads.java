package com.practise.threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class NestedThreads {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(10);
        Runner.pool.execute(new A(pool, ""));
        Runner.pool.awaitTermination(1, TimeUnit.SECONDS);
        pool.shutdown();
    }
}

interface Runner extends Runnable {
    ExecutorService pool = Executors.newFixedThreadPool(10);

}

class A implements Runner {
    private ExecutorService pool;
    private String info;

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            Runner.pool.execute(new B(pool, Thread.currentThread().getName() + ":A" + i));
        }
    }

    public A(ExecutorService pool, String info) {
        super();
        this.pool = pool;
        this.info = info;
    }
}

class B implements Runner {
    private ExecutorService pool;
    private String info;

    public B(ExecutorService pool, String info) {
        super();
        this.pool = pool;
        this.info = info;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            Runner.pool.execute(new C(pool, Thread.currentThread().getName() + ":A" + i));
        }

    }

    class C implements Runner {
        private ExecutorService pool;
        private String info;

        public C(ExecutorService pool, String info) {
            super();
            this.pool = pool;
            this.info = info;
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(info + ":" + Thread.currentThread().getName() + ":C" + i);
            }

        }
    }
}