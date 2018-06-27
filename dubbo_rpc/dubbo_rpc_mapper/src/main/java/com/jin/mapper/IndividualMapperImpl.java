package com.jin.mapper;


import java.util.Date;

import com.jin.pojo.Individual;

//接口实现，暂时使用，后期删除
public class IndividualMapperImpl implements IndividualMapper {
	
	
	public Individual selectIndividualById(Individual individual) {
		// TODO Auto-generated method stub
		individual.setUserName("张三");
		individual.setCtime(new Date());
		return individual;
	}

}
