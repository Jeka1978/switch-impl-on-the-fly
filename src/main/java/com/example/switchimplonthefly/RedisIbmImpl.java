package com.example.switchimplonthefly;

/**
 * @author Evgeny Borisov
 */
@OldService
public class RedisIbmImpl implements RedisDao {
    @Override
    public void doWork() {
        System.out.println("IBM Rules");
    }
}
