package no.lyse.platform.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class InvoiceController {

    @Value("${app.name}")
    private String appName;

    @Value("${app.version}")
    private String appVersion;

    @GetMapping("/version")
    public String getAppDetails() {
        return appName + " - " + appVersion;
    }

    @GetMapping("/invoices")
    public List<Invoice> getInvoices() {
        return List.of(new Invoice());
    }

    @GetMapping("/invoices/{invoiceNo}")
    public Invoice getInvoice(@PathVariable Long invoiceNo) {
        Invoice invoice = new Invoice();
        invoice.setInvoiceNo(invoiceNo);
        return invoice;
    }

    @DeleteMapping("/invoices/{invoiceNo}")
    public String deleteInvoice(@PathVariable Long invoiceNo) {
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
