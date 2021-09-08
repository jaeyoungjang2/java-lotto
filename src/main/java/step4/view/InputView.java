package step4.view;

import java.util.Scanner;

public class InputView {
    private static final String PURCHASE_AMOUNT_MESSAGE = "구입금액을 입력해 주세요.";
    private static final Scanner SC = new Scanner(System.in);

    public static Integer requirePurchaseAmount() {
        System.out.println(PURCHASE_AMOUNT_MESSAGE);
        return SC.nextInt();
    }
}
