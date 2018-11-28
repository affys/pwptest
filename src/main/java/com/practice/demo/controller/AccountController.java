package com.practice.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.practice.demo.vm.Account;

@RestController
public class AccountController {

	@RequestMapping(value = "/loadaccounts", method = RequestMethod.GET)
	public List<Account> loadAccounts() {

		List<Account> list = new ArrayList<>();
		Account account = new Account();
		account.setId(123);
		account.setName("abc");
		list.add(account);

		return list;
	}

}
