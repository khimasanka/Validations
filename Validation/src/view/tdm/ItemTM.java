package view.tdm;

import java.math.BigDecimal;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
public class ItemTM {
    private String code;
    private String name;
    private int qtyOnHand;
    private BigDecimal unitPrice;

    public ItemTM() {
    }

    public ItemTM(String code, String name, int qtyOnHand, BigDecimal unitPrice) {
        this.code = code;
        this.name = name;
        this.qtyOnHand = qtyOnHand;
        this.unitPrice = unitPrice;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQtyOnHand() {
        return qtyOnHand;
    }

    public void setQtyOnHand(int qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }
}
