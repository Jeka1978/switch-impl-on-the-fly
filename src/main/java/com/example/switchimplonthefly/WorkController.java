package com.example.switchimplonthefly;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Evgeny Borisov
 */
@RestController
public class WorkController {
    @Autowired
    private MainService mainService;

    @GetMapping("/work")
    public void doWork(){
        mainService.doWork();
    }

    @GetMapping("/oldmode")
    public void switchToOldMode() {
        mainService.setNewMode(false);
    }

    @GetMapping("/newmode")
    public void switchToNewMode() {
        mainService.setNewMode(true);
    }
}
