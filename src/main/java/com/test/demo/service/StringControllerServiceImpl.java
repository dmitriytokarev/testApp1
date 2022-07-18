package com.test.demo.service;

import com.test.demo.aop.AopAnnotation;
import
import com.test.demo.entity.StringDataEntity;
import com.test.demo.repo.StringRepo;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class StringControllerServiceImpl implements StringControllerService {

    StringRepo stringRepo;

    @Autowired
    StringControllerServiceImpl (StringRepo stringRepo){
        this.stringRepo = stringRepo;
    }

    @Override
    @com.example.starter.aop.AopAnnotation
    public void saveString(List<String> entryString) {
        StringDataEntity data = new StringDataEntity();
        data.setValue(entryString.toString());
        stringRepo.save(data);
    }
}
