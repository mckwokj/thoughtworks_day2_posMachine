package pos.machine;

import java.util.List;
import java.util.Map;

public class Receipt {
    private Map<String, ReceiptItem> itemDetail;
    private int totalPrice;

    public Receipt(Map<String, ReceiptItem> itemDetail, int totalPrice) {
        this.itemDetail = itemDetail;
        this.totalPrice = totalPrice;
    }

    public Map<String, ReceiptItem> getItemDetail() {
        return itemDetail;
    }

    public void setItemDetail(Map<String, ReceiptItem> itemDetail) {
        this.itemDetail = itemDetail;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        String content = "";
        for (String key: itemDetail.keySet()) {
            content += itemDetail.get(key).toString();
        }
        return content;
    }
}
