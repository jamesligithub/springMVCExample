package com.blit.SpringMVCExample.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blit.SpringMVCExample.entity.Invoice;



public interface InvoiceRepository extends JpaRepository<Invoice, Long> {






}