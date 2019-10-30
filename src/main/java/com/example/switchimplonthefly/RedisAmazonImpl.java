package com.example.switchimplonthefly;

/**
 * @author Evgeny Borisov
 */
@NewService
public class RedisAmazonImpl implements RedisDao {
    @Override
    public void doWork() {
        System.out.println("AMAZON rules");
    }
}
