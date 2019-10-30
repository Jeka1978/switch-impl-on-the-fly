package com.example.switchimplonthefly;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class MainService {
    @Setter
    private boolean isNewMode;

    @OldService
    private RedisDao oldRedisDao;

    @NewService
    private RedisDao newRedisDao;

    public void doWork(){
        if (isNewMode) {
            newRedisDao.doWork();
        }else {
            oldRedisDao.doWork();
        }
    }
}
