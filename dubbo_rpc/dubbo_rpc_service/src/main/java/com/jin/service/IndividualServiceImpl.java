package com.jin.service;

import com.jin.mapper.IndividualMapper;
import com.jin.pojo.Individual;

public class IndividualServiceImpl implements IndividualService {
	
	private IndividualMapper individualMapper;

	//	服务代码 	用户登录
	public Individual selectIndividualById(Individual individual) {
		// TODO Auto-generated method stub
		return individualMapper.selectIndividualById(individual);
	}

}
