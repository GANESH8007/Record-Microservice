package com.rec.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.rec.entity.Record;

@Service
public class RecordServiceImpl implements IRecordService {

	
	//dumy List of records
	List<Record> list=List.of(
			new Record(1L,"Tata@gmail.com","Tata Motors",1311L),
			new Record(2L,"VW@gmail.com","VW Motors",13111L),
			new Record(3L,"Chevrolet@gmail.com","Chevrolet Motors",13113L),
			new Record(4L,"Ford@gmail.com","Ford Motors",13114L),
			new Record(5L,"Mahindra@gmail.com","Mahindra Motors",13115L),
			new Record(6L,"Toyota@gmail.com","Toyota Motors",13116L),
			new Record(7L,"Farrari@gmail.com","Farrari Motors",13117L),
			new Record(8L,"BV@gmail.com","Bugati Motors",13118L)
			
			);
	
	@Override
	public List<Record> getRecordOfEmployee(Long eId) {
		// TODO Auto-generated method stub
		return list.stream().filter(record -> record.geteId().equals(eId)).collect(Collectors.toList());
	}

}
