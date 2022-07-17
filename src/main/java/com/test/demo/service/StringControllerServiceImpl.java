package com.test.demo.service;

import com.test.demo.dto.EntryDto;
import com.test.demo.entity.StringDataEntity;
import com.test.demo.repo.StringRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StringControllerServiceImpl implements StringControllerService {

    StringRepo stringRepo;

    @Autowired
    StringControllerServiceImpl (StringRepo stringRepo){
        this.stringRepo = stringRepo;
    }

    @Override
    public void saveString(EntryDto entryString) {
        StringDataEntity data = new StringDataEntity();
        data.setValue(entryString.getValue().toString());
        stringRepo.save(data);
    }
}
