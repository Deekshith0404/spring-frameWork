package com.xworkz.busInfo.service;

import com.xworkz.busInfo.dto.WatchDto;
import com.xworkz.busInfo.entity.WatchEntity;
import com.xworkz.busInfo.repository.WatchRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WatchServImpl implements WatchServ{
    @Autowired
    WatchRepo watchRepo;
    @Override
    public void save(WatchDto watchDto) {
        WatchEntity watch=new WatchEntity();
        BeanUtils.copyProperties(watchDto,watch);
        watchRepo.save(watch);
    }
}
