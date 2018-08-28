package com.wagner.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.wagner.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
