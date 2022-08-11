package no.lyse.platform.demo;

import java.util.List;

public interface InvoiceService {

    Invoice getInvoice(int invoiceNo);

    List<Invoice> getInvoices();
}
