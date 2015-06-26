package vn.com.vndirect.socialtrading.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    public enum OrderType {
        ATO("ATO"),
        ATC("ATC"),
        MP("MP"),
        LO("LO"),
        MOK("MOK");

        private final String text;

        private OrderType(String text) {
            this.text = text;
        }

        @Override
        public String toString() {
            return text;
        }
    }

    public enum OrderSide {
        /**
         * Selling side.
         */
        NS("NS"),

        /**
         * Buying side.
         */
        NB("NB");

        private final String text;

        private OrderSide(String text) {
            this.text = text;
        }

        @Override
        public String toString() {
            return text;
        }
    }

    private String orderId;
    private String byAccount;
    private String mimickingAccount;
    private String stock;
    private int quantity;
    private BigDecimal price;
    private Date date;
    private OrderSide side;
    private OrderType type;
    private BigDecimal matchPrice;
    private int matchQuantity;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @JsonProperty("account")
    public String getByAccount() {
        return byAccount;
    }

    public void setByAccount(String byAccount) {
        this.byAccount = byAccount;
    }

    public String getMimickingAccount() {
        return mimickingAccount;
    }

    public void setMimickingAccount(String mimickingAccount) {
        this.mimickingAccount = mimickingAccount;
    }

    @JsonProperty("symbol")
    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    @JsonProperty("qty")
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @JsonProperty("tradeDate")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyyMMdd-HH:mm:ss")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public OrderSide getSide() {
        return side;
    }

    public void setSide(OrderSide side) {
        this.side = side;
    }

    public OrderType getType() {
        return type;
    }

    public void setType(OrderType type) {
        this.type = type;
    }

    @JsonProperty("matchedPrice")
    public BigDecimal getMatchPrice() {
        return matchPrice;
    }

    public void setMatchPrice(BigDecimal matchPrice) {
        this.matchPrice = matchPrice;
    }

    @JsonProperty("matchedQty")
    public int getMatchQuantity() {
        return matchQuantity;
    }

    public void setMatchQuantity(int matchQuantity) {
        this.matchQuantity = matchQuantity;
    }
}
