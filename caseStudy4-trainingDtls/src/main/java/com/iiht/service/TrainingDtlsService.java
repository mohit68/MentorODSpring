package com.iiht.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iiht.model.TrainingDtls;
import com.iiht.repository.TrainingDtlsRepository;

@Service
@Transactional
public class TrainingDtlsService {
	@Autowired
	TrainingDtlsRepository trainingDtlsRepository;

	public List<TrainingDtls> getAllTraining() {
		// TODO Auto-generated method stub
		return (List<TrainingDtls>) trainingDtlsRepository.findAll();
	}

	public void addTraining(TrainingDtls trainingDtls) {
		trainingDtlsRepository.save(trainingDtls);

	}

	public void deleteTrainingDtls(Long id) {
		trainingDtlsRepository.deleteById(id);
	}

	public void updateTrainingDtls(long id, TrainingDtls trainingDtls) {
		trainingDtls.setId(id);
		trainingDtlsRepository.save(trainingDtls);

	}

}
