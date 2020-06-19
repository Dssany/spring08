package com.care.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.care.dto.TestDTO;

@Repository
public class TestDAO {
	@Autowired
	private SqlSession sqlSession;
	public static final String namespace="com.care.mybatis.myMapper";
	
	public List<TestDTO> test(){
		return sqlSession.selectList(namespace + ".listAll");
	}
	
	public TestDTO list(String num) {
		try {
			return sqlSession.selectOne(namespace + ".list",num);//하나의 값만 넘길 수 있다
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return null;
	}
	public int save(TestDTO dto) {
		int result =  sqlSession.insert(namespace + ".save",dto);
		System.out.println("결과 값  : " + result);
		return result;
	}
	
	public int updatedata(TestDTO dto) {
		return sqlSession.update(namespace + ".updatedata",dto);
	}
	
	public TestDTO updatepage(int num) {
		try {
			return sqlSession.selectOne(namespace + ".list",num);//하나의 값만 넘길 수 있다
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return null;
	}
}
