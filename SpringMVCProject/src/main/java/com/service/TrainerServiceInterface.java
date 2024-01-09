package com.service;

import java.util.List;

import com.bean.Trainer;

public interface TrainerServiceInterface {
	void save(Trainer trainer);

	List<Trainer> getAll(); }
