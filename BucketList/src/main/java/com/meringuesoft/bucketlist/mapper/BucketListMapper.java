package com.meringuesoft.bucketlist.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.meringuesoft.bucketlist.domain.BucketList;

@Mapper
public interface BucketListMapper {
	@Select("SELECT * FROM bucketlist ORDER BY number DESC")
    public ArrayList<BucketList> getList();
	
	@Insert("INSERT INTO bucketlist (object) VALUES ('${object }')")
	public void register(@Param("object") String object);
	
	@Insert("DELETE FROM bucketlist WHERE number = ${number }")
	public void delete(@Param("number") String number);
	
	@Insert("UPDATE bucketlist "
			+ "SET is_achieved = CASE WHEN is_achieved = 'N' THEN 'Y' ELSE 'N' END, "
			+ "achieve_date = CASE WHEN achieve_date is null THEN NOW() ELSE null END "
			+ "WHERE number =  ${number }")
	public void achieve(@Param("number") String number);
	
	@Insert("UPDATE bucketlist "
			+ "SET is_marked = CASE WHEN is_marked = 'N' THEN 'Y' ELSE 'N' END "
			+ "WHERE number = ${number }")
	public void mark(@Param("number") String number);
}
