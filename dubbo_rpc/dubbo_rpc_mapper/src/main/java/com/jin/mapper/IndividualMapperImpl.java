package com.jin.mapper;


import java.util.Date;

import com.jin.pojo.Individual;

//�ӿ�ʵ�֣���ʱʹ�ã�����ɾ��
public class IndividualMapperImpl implements IndividualMapper {
	
	
	public Individual selectIndividualById(Individual individual) {
		// TODO Auto-generated method stub
		individual.setUserName("����");
		individual.setCtime(new Date());
		return individual;
	}

}
