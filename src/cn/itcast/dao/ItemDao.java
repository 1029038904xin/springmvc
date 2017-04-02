package cn.itcast.dao;

import java.util.List;

import org.springframework.ui.Model;

import cn.itcast.pojo.Items;

public interface ItemDao {

	List<Items> findAll();

	Items findById(Integer id);

	void updateitem(Items items);
	鼎折覆餗

}
