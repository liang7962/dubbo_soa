package com.jin.service;

import com.jin.mapper.IndividualMapper;
import com.jin.pojo.Individual;

public class IndividualServiceImpl implements IndividualService {
	
	private IndividualMapper individualMapper;

	//	������� 	�û���¼
	public Individual selectIndividualById(Individual individual) {
		// TODO Auto-generated method stub
		return individualMapper.selectIndividualById(individual);
	}

}
