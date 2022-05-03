package com.blit.SpringMVCExample.service;

import java.util.List;  //////////////////////////////

import com.blit.SpringMVCExample.entity.Invoice;

public interface IInvoiceService {

    public Invoice saveInvice(Invoice invoice);
    public List<Invoice> getAllInvoices();
    public Invoice getInvoiceById(Long id);
    public void deleteInvoiceById(Long id);
    public void updateInvoice(Invoice invoice);

}