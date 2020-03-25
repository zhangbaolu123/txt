package com.zhangbaolu.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhangbaolu.beans.T_goods;
import com.zhangbaolu.beans.T_type;
import com.zhangbaolu.mapper.T_goodsMapper;

@Service
public class T_goodsServiceImpl implements T_goodsService{

	@Resource
	private T_goodsMapper goodsMapper;
	//查询所有
	public List<T_goods> queryAll(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return goodsMapper.queryAll(map);
	}

	public List<T_type> queryType() {
		// TODO Auto-generated method stub
		return goodsMapper.queryType();
	}
	//添加
	public void addGoods(T_goods goods) {
		// TODO Auto-generated method stub
		goodsMapper.addGoods(goods);
	}

	public T_goods queryGoodsByid(Integer gid) {
		// TODO Auto-generated method stub
		return goodsMapper.queryGoodsByid(gid);
	}
	//修改
	public void updateGoods(T_goods goods) {
		// TODO Auto-generated method stub
		goodsMapper.updateGoods(goods);
	}
	//删除
	public void deleteGoods(String ids) {
		// TODO Auto-generated method stub
		goodsMapper.deleteGoods(ids);
	}

}
