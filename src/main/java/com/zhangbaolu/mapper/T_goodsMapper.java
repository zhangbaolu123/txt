package com.zhangbaolu.mapper;

import java.util.List;
import java.util.Map;

import com.zhangbaolu.beans.T_goods;
import com.zhangbaolu.beans.T_type;

public interface T_goodsMapper {

		//查询所有
		public List<T_goods> queryAll(Map<String,Object> map); 
		
		public List<T_type> queryType();
		//添加
		public void addGoods(T_goods goods);
	
		public T_goods queryGoodsByid(Integer gid);
		//修改
		public void updateGoods(T_goods goods);
		//删除
		public void deleteGoods(String ids);
}
