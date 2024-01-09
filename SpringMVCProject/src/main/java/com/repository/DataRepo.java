package com.repository;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.bean.Trainer;
@Repository
@Transactional
public class DataRepo {
	@Autowired
	protected HibernateTemplate hibernateTemplate;
	
	public void save(Trainer entity) {
		hibernateTemplate.save(entity);

	}
	
	public void update(Trainer entity) {
		hibernateTemplate.update(entity);

	}

	public Optional<Trainer> get(Integer id) {
		Trainer emp = hibernateTemplate.get(Trainer.class, id);
		return Optional.ofNullable(emp);
	}

	public List<Trainer> getAll() {
		List<Trainer> listEntities = hibernateTemplate.loadAll(Trainer.class);
		return listEntities;
	}

}
