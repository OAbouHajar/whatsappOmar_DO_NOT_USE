package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.obwhatsapp.payments.ui.widget.PeerPaymentTransactionRow;

/* renamed from: X.5eE  reason: invalid class name and case insensitive filesystem */
public abstract class C110485eE extends LinearLayout implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;

    public C110485eE(Context context) {
        super(context);
        A00();
    }

    public C110485eE(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public C110485eE(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
    }

    public void A00() {
        if (!this.A01) {
            this.A01 = true;
            PeerPaymentTransactionRow peerPaymentTransactionRow = (PeerPaymentTransactionRow) this;
            C16150sX r2 = ((C52652eD) ((C52642eC) generatedComponent())).A07;
            peerPaymentTransactionRow.A0R = C16150sX.A0k(r2);
            peerPaymentTransactionRow.A0S = (C19990zK) r2.AEZ.get();
            peerPaymentTransactionRow.A0N = C16150sX.A0R(r2);
            peerPaymentTransactionRow.A0Y = (C218315p) r2.AIL.get();
            peerPaymentTransactionRow.A0J = (C17160ud) r2.A4t.get();
            peerPaymentTransactionRow.A0K = (C16000sG) r2.A4x.get();
            peerPaymentTransactionRow.A0L = (C16080sP) r2.AQ9.get();
            peerPaymentTransactionRow.A0W = C110115dX.A0Q(r2);
            peerPaymentTransactionRow.A0P = (C16460t6) r2.A5k.get();
            peerPaymentTransactionRow.A0O = C16150sX.A0Z(r2);
            peerPaymentTransactionRow.A0V = C16150sX.A10(r2);
            peerPaymentTransactionRow.A0U = (C228019i) r2.AHm.get();
            peerPaymentTransactionRow.A0X = (AnonymousClass1MB) r2.AHQ.get();
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A00;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }
}
