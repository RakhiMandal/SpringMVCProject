package com.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Trainer;
import com.repository.DataRepo;


@Service
public class TrainerService implements TrainerServiceInterface {
	private static Logger log =LoggerFactory.getLogger(TrainerService.class.getSimpleName());

	@Autowired
	protected DataRepo dataRepo;

	@Override
	public void save(Trainer trainer) {
		Trainer entity = new Trainer();
		entity.setName(trainer.getName());
		entity.setSalary(trainer.getSalary());
		entity.setSubject(trainer.getSubject());


		dataRepo.save(entity);
		log.info("Standard saved-", trainer);
	}

	@Override
	public List<Trainer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}


}
