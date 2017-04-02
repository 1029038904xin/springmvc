package cn.itcast.service;

import java.util.List;

import org.springframework.ui.Model;

import cn.itcast.pojo.Items;

public interface ItemService {

	List<Items> findAll();

	Items findById(Integer id);

	void updateitem(Items model);

}
