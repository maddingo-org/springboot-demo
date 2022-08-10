package no.lyse.platform.demo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Invoice {

    @JsonProperty
    private Long invoiceNo;

    @JsonProperty
    private String name;

    @JsonProperty
    private Long scanNo;

    @JsonProperty
    private String areaCode;

    @JsonProperty
    private String city;

    @JsonProperty
    private int vatCode;

    @JsonProperty
    private String vatAmount;

    @JsonProperty
    private Double totalAmount;

    @JsonProperty
    private boolean PO;

    @JsonProperty
    private int PurchaseOrderNumber;
}
