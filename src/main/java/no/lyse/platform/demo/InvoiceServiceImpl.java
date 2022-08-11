package no.lyse.platform.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InvoiceServiceImpl implements InvoiceService{

    private static List<Invoice> list = new ArrayList<>();

    static {
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
    }

    @Override
    public Invoice getInvoice(int invoiceNo) {
        for (int i = 0; i < list.size(); i ++) {
            if (list.get(i).getInvoiceNo() == invoiceNo) {
                return list.get(i);
            }
        }
        return new Invoice();
    }

    @Override
    public List<Invoice> getInvoices() {
        return list;
    }
}
