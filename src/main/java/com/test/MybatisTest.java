package com.test;

import com.bean.gsnfc.GChargeTran;
import com.bean.gsnfc.GChargeTranExample;
import com.busi.db.util.GchargeTranUtil;

public class MybatisTest {

	public static void main(String[] args) {
//		GchargeTranUtil gchargeTranUtil=new GchargeTranUtil();
		GChargeTranExample example=new GChargeTranExample();
		example.createCriteria().andCardasnEqualTo("8800371300000017");
		for(int i=0;i<20;i++){
			GChargeTran gchargeTran=GchargeTranUtil.selectByPrimaryKey("0000000000000015");
//			List<GChargeTran> gChargeTranList=GchargeTranUtil.selectByExample(example);
//			for(GChargeTran gchargeTran:gChargeTranList){
				System.out.println(gchargeTran.toString());
				try {
					Thread.sleep(1000l);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
//			}	
		}

		
	}
}
