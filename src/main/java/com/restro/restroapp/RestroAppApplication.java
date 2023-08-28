package com.restro.restroapp;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.restro.restroapp.model.Address;
import com.restro.restroapp.model.Customer;
import com.restro.restroapp.model.Item;
import com.restro.restroapp.model.Menu;
import com.restro.restroapp.model.Order;
import com.restro.restroapp.model.OrderItem;
import com.restro.restroapp.model.Restaurant;
import com.restro.restroapp.model.Staff;
import com.restro.restroapp.repository.BasicInformationRepository;
import com.restro.restroapp.repository.CustomerRepository;
import com.restro.restroapp.repository.MenuRepository;
import com.restro.restroapp.repository.OrderItemRepository;
import com.restro.restroapp.repository.OrderRepository;
import com.restro.restroapp.repository.RestaurantRepository;
import com.restro.restroapp.repository.StaffRepository;

@SpringBootApplication
public class RestroAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestroAppApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(RestaurantRepository restaurantRepository,
			BasicInformationRepository basicInformationRepository, CustomerRepository customerRepository,
			StaffRepository staffRepository, MenuRepository menuRepository, OrderItemRepository orderItemRepository,
			OrderRepository orderRepository)

	{
		Address customerAddress1 = new Address("39", "National Park", "144008");
		Address restaurantAddress1 = new Address("Shop no 3", "Johal Market", "110092");
		Address staffAddress1 = new Address("5", "New Model Toen", "144001");


		Customer customer1 = new Customer("Lovejot", "myselflovjot@gmail.com", "7508351387", customerAddress1);
		Customer customer2 = new Customer("Neha", "myselflovjot@gmail.com", "7508351387", customerAddress1);
		Customer customer3 = new Customer("Samrath", "myselflovjot@gmail.com", "7508351387", customerAddress1);
		Staff staff1 = new Staff("Tehraan", "md.tehraan@gmail.com", "889966256", staffAddress1);
		Restaurant r1 = new Restaurant("Kathi kingz", "Kathikingz@gmail.com", "9958648682", restaurantAddress1);

		customer1.setRestaurant(r1);
		customer2.setRestaurant(r1);
		customer3.setRestaurant(r1);
		staff1.setEmployer(r1);


		List<Staff> staffList = new ArrayList<Staff>();
		List<Customer> customerList = new ArrayList<Customer>();


		staffList.add(staff1);
		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);
		r1.setStaff(staffList);
		r1.setCustomer(customerList);

		Restaurant r = restaurantRepository.save(r1);
		System.out.println(r.getCustomer());

		Item item1 = new Item("Pepper Paneer", true, false, BigDecimal.valueOf(100));
		List<Item> itemLists = new ArrayList<Item>();
		itemLists.add(item1);

		Menu menu = new Menu(itemLists, r);
		item1.setMenu(menu);
		menuRepository.save(menu);
		Order order1 = new Order();
		order1.setCustomer(customer3);
		Order order2 = new Order();
		order2.setCustomer(customer2);
		OrderItem orderItem1 = new OrderItem();
		OrderItem orderItem2 = new OrderItem();
		
		orderItem1.setQuantity(1);
		orderItem1.setItem(item1);
		
		orderItem2.setQuantity(5);
		orderItem2.setItem(item1);
		
		order1.addOrderItem(orderItem1);
		order2.addOrderItem(orderItem2);
		orderRepository.save(order1);
		orderRepository.save(order2);
		
		return (args) -> {
//			System.out.println(r);
		};

	}

}
