package com.lvg.spmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lvg.spmvc.dao.BankAccountDao;

@Controller
public class BankAccountController {
	@Autowired
	BankAccountDao badao;
	
	@GetMapping("/MoneyTransferForm")
	public String getMoneyTransferForm() {
		return "MoneyTransferForm";
	}
	
	@GetMapping("/transferMoney")
	public String transferMoney(@CookieValue String username,@RequestParam double amount,Model model) {
		String message = "Money Transfer is Failed";
		if (badao.updateBalance(username, amount))
			message = "Money Transfered Successfully";
		model.addAttribute("userMessage",message);
		return "Display";
	}
	
}
