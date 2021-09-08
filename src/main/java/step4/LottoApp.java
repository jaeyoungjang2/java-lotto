package step4;

import step4.view.InputView;

public class LottoApp {
    public static void main(String[] args) {
        Integer purchaseAmount = InputView.requirePurchaseAmount();
        Integer numberOfManualLotto = InputView.requireNumberOfManualLotto();
        String manualLottoTicket = InputView.requireManualLottoNumber();
    }
}
