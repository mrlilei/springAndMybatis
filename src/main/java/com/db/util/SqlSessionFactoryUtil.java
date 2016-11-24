package com.db.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.xml.mapper.gsnfc.GChargeTranMapper;

public class SqlSessionFactoryUtil {
	
	private static SqlSessionFactory sqlSessionFactory = null;

	public static SqlSessionFactory getInstance() {
		if (sqlSessionFactory == null) {
			String resource = "mybatis-config.xml";
			InputStream inputStream = null;
			try {
				inputStream = Resources.getResourceAsStream(resource);
			} catch (IOException e) {
				e.printStackTrace();
			}
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			// 注解方式查询时需要注册MAPPER
			sqlSessionFactory.getConfiguration().addMapper(GChargeTranMapper.class);
		}
		return sqlSessionFactory;
	}
}
