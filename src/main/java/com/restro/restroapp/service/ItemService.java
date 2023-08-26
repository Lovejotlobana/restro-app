package com.restro.restroapp.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restro.restroapp.Exceptions.PriceCannotBeNullException;
import com.restro.restroapp.model.Item;
import com.restro.restroapp.model.Menu;
import com.restro.restroapp.model.Restaurant;
import com.restro.restroapp.repository.ItemRepository;
import com.restro.restroapp.repository.MenuRepository;
import com.restro.restroapp.repository.RestaurantRepository;

@Service
public class ItemService {

	@Autowired
	ItemRepository itemRepository;

	@Autowired
	RestaurantRepository restaurantRepository;

	@Autowired
	MenuRepository menuRepository;

	public Item addNewItem(Long restarurantId, Long menuId, Item recievedItem) {
		Restaurant r = restaurantRepository.findById(restarurantId).orElse(null);

		if (r == null) throw new NoSuchElementException("Restaurant not found");
		
			List<Menu> restaurantMenus = r.getMenu();
			Menu restaurantMenu = null;
			for (Menu menu : restaurantMenus) {
				if (menu.getId().equals(menuId)) {
					restaurantMenu = menu;
				}
			}
			if (recievedItem.getPrice() == null)
				throw new PriceCannotBeNullException("Price not mentioned");
			Item toBeSavedItem = new Item(recievedItem.getName(), recievedItem.isVeg(), recievedItem.isContainsEgg(),
					recievedItem.getPrice());
			toBeSavedItem.setMenu(restaurantMenu);
			return itemRepository.save(toBeSavedItem);
	
	}
}
