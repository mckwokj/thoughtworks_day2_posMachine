package pos.machine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PosMachine {
    public String printReceipt (List<String> barcodes) {

    }

    private List<ItemInfo> getItemInfos (List<String> barcodes) {

    }

    private Receipt calculateReceipt (List<ItemInfo> itemWithDetail) {

    }

    private String renderReceipt (Receipt receipt) {

    }

    private int calculateTotalPrice(Map<String, ReceiptItem> receiptItems) {
        int totalPrice = 0;

        for (String receiptItemName: receiptItems.keySet()) {
            totalPrice += receiptItems.get(receiptItemName) .getSubTotal();
        }

        return totalPrice;
    }

    private Map<String, ReceiptItem> calculateReceiptItems(List<ItemInfo> itemWithDetail) {

    }

    public static void main(String[] args) {
        List<String> barcodes = ItemDataLoader.loadBarcodes();
        PosMachine m1 = new PosMachine();
        String receipt = m1.printReceipt(barcodes);
        System.out.println(receipt);
    }
}
