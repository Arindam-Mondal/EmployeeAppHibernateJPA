package com.howtodoinjava.demo.editors;

import java.beans.PropertyEditorSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.howtodoinjava.demo.model.DepartmentEntity;
import com.howtodoinjava.demo.service.DepartmentManager;

@Component
public class DepartmentEditor extends PropertyEditorSupport 
{
	@Autowired
	DepartmentManager deptManager;
	
    @Override
    public void setAsText(String id) 
    {
    	DepartmentEntity d;
    	
    	if(null!= deptManager.getDepartmentById(Integer.parseInt(id))){
    		d = deptManager.getDepartmentById(Integer.parseInt(id));
    	}else{
    		d = null;
    	}
    	
//    	switch(Integer.parseInt(id))
//		{
//			case 1: d = new DepartmentEntity(1,  "Human Resource"); break;
//			case 2: d = new DepartmentEntity(2,  "Finance"); break;
//			case 3: d = new DepartmentEntity(3,  "Information Technology"); break;
//			default: d = null;
//		}
        this.setValue(d);
    }
}