package com.debuggeandoideas.spring_boot_demo.utils;

import com.debuggeandoideas.spring_boot_demo.components.ThanosComponent;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class AvengerNotifier {

    public static void sendNotification(Class<?> clazz){
        log.warn("Attention new class created:{}", clazz.getName());

        if (clazz.equals(ThanosComponent.class)) {
            log.warn("DANGER START BATTLE!!");
        }
    }
}
