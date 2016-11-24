package com.busi.db.util;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.bean.gsnfc.GChargeTran;
import com.bean.gsnfc.GChargeTranExample;
import com.db.util.SqlSessionFactoryUtil;
import com.xml.mapper.gsnfc.GChargeTranMapper;

public class GchargeTranUtil {

	public static GChargeTran selectByPrimaryKey(String key) {
		SqlSession session = SqlSessionFactoryUtil.getInstance().openSession();
		GChargeTran gChargeTran = null;
		try {
			gChargeTran = session.getMapper(GChargeTranMapper.class)
					.selectByPrimaryKey(key);
			session.commit();// 提交事务
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return gChargeTran;
	}

	public static List<GChargeTran> selectByExample(GChargeTranExample example) {
		SqlSession session = SqlSessionFactoryUtil.getInstance().openSession();
		List<GChargeTran> gChargeTran = null;
		try {
			gChargeTran = session.getMapper(GChargeTranMapper.class).selectByExample(example);
			session.commit();// 提交事务
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return gChargeTran;
	}

}
