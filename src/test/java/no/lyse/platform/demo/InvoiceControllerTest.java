package no.lyse.platform.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceControllerTest {

    // Not sure how to test properly without having an actual database to work with

    public List<Invoice> getInvoicesCopy() {
        // Retrieve copy of Invoices created in InvoiceServiceImpl

        List<Invoice> list = new ArrayList<>();
        Invoice i = new Invoice();
        i.setName("Fredrik");
        i.setInvoiceNo(1111);
        i.setCity("Bergen");
        i.setAreaCode("5056");
        i.setTotalAmount(2600d);
        list.add(i);

        i = new Invoice();
        i.setName("Martin");
        i.setInvoiceNo(22222);
        i.setCity("Stavanger");
        i.setAreaCode("4012");
        i.setTotalAmount(1500d);
        list.add(i);

        return list;
    }

    @Test
    void getInvoices() {
        InvoiceController controller = new InvoiceController();
        List<Invoice> response = controller.getInvoices();
        List<Invoice> list = getInvoicesCopy();

        assertEquals(list, response);
    }

    @Test
    void getInvoice() {
        InvoiceController controller = new InvoiceController();
        Invoice i = getInvoicesCopy().get(0);
        Invoice response = controller.getInvoice(1111);

        assertEquals(i, response);
    }

    @Test
    void deleteInvoice() {
        InvoiceController controller = new InvoiceController();
        Invoice testInvoice = new Invoice();
        testInvoice.setInvoiceNo(111);
        testInvoice.setName("Fredrik");
        testInvoice.setTotalAmount(2500d);
        testInvoice.setCity("Bergen");
        String response = controller.deleteInvoice(111);

        assertEquals("Deleting invoice: 111", response);
    }

    @Test
    void updateInvoice() {
        InvoiceController controller = new InvoiceController(); // Arrange
        Invoice invoice1 = getInvoicesCopy().get(0);
        invoice1.setName("Fredrik_Updated");

        Invoice response = controller.updateInvoice(invoice1); // Act

        assertEquals(invoice1, response);
    }

    @Test
    void saveInvoice() {
    }
}