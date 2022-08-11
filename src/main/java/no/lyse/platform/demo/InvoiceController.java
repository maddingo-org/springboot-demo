package no.lyse.platform.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class InvoiceController {

    @Autowired
    public InvoiceService iService;

    @GetMapping("/invoices")
    public List<Invoice> getInvoices() {
        if (iService == null) {
            iService = new InvoiceServiceImpl();
        }
        return this.iService.getInvoices();
    }

    @GetMapping("/invoices/{invoiceNo}")
    public Invoice getInvoice(@PathVariable int invoiceNo) {
        if (iService == null) {
            iService = new InvoiceServiceImpl();
        }
        return iService.getInvoice(invoiceNo);
    }

    @DeleteMapping("/invoices/{invoiceNo}")
    public String deleteInvoice(@PathVariable int invoiceNo) {
        return "Deleting invoice: " + invoiceNo;
    }

    @PutMapping("/invoices")
    public Invoice updateInvoice(@RequestBody Invoice invoice) {
        log.info("invoice: " + invoice);
        return invoice;
    }

    @PostMapping("/invoices")
    public Invoice saveInvoice (@RequestBody Invoice invoice) {
        return invoice;
    }
}
