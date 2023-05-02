package X;

import com.obwhatsapp.payments.ui.widget.TransactionsExpandableView;

/* renamed from: X.650  reason: invalid class name */
public final /* synthetic */ class AnonymousClass650 implements Runnable {
    public final /* synthetic */ TransactionsExpandableView A00;

    public /* synthetic */ AnonymousClass650(TransactionsExpandableView transactionsExpandableView) {
        this.A00 = transactionsExpandableView;
    }

    public final void run() {
        TransactionsExpandableView transactionsExpandableView = this.A00;
        for (int i2 = 0; i2 < transactionsExpandableView.getChildCount(); i2++) {
            AnonymousClass69G r0 = (AnonymousClass69G) transactionsExpandableView.A05.getChildAt(i2);
            if (r0 != null) {
                r0.Abn();
            }
        }
    }
}
