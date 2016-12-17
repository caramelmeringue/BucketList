package com.meringuesoft.bucketlist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.meringuesoft.bucketlist.dao.BucketListDao;
import com.meringuesoft.bucketlist.domain.BucketList;

@Component
public class BucketListService {
	@Autowired
	private BucketListDao bucketListDao;
	
	public List<BucketList> getList() {
		return bucketListDao.getList();
	}
	
	public int register(BucketList bucketList) {
		return bucketListDao.register(bucketList);
	}
	
	public int delete(BucketList bucketList) {
		return bucketListDao.delete(bucketList);
	}
	
	public int achieve(BucketList bucketList) {
		return bucketListDao.achieve(bucketList);
	}
	
	public int mark(BucketList bucketList) {
		return bucketListDao.mark(bucketList);
	}
}
