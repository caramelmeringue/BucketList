package com.meringuesoft.bucketlist.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.meringuesoft.bucketlist.domain.BucketList;

@Component
public class BucketListDao {
	@Autowired
	private SqlSession sqlSession;
	
	public List<BucketList> getList() {
		return sqlSession.selectList("bucketlist.getList");
	}
	
	public int register(BucketList bucketList) {
		return sqlSession.insert("bucketlist.register", bucketList);
	}
	
	public int delete(BucketList bucketList) {
		return sqlSession.delete("bucketlist.delete", bucketList);
	}
	
	public int achieve(BucketList bucketList) {
		return sqlSession.delete("bucketlist.achieve", bucketList);
	}
	
	public int mark(BucketList bucketList) {
		return sqlSession.delete("bucketlist.mark", bucketList);
	}
}
