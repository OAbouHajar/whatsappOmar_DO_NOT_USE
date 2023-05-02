package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.PaymentTransactionHistoryActivity;
import com.obwhatsapp.payments.ui.widget.PeerPaymentTransactionRow;
import java.util.Calendar;
import java.util.List;

/* renamed from: X.5f1  reason: invalid class name and case insensitive filesystem */
public class C110905f1 extends AnonymousClass01X implements C54622hr {
    public C116135qs A00 = null;
    public List A01;
    public final int A02;
    public final Context A03;
    public final AnonymousClass013 A04;
    public final C16460t6 A05;
    public final AnonymousClass2SE A06;
    public final AnonymousClass1Vo A07;
    public final AnonymousClass680 A08;
    public final C118875vO A09;
    public final C218315p A0A;

    public C110905f1(Context context, AnonymousClass013 r3, C16460t6 r4, AnonymousClass2SE r5, AnonymousClass1Vo r6, AnonymousClass680 r7, C118875vO r8, C218315p r9, List list, int i2) {
        this.A03 = context;
        this.A01 = C13680ns.A0n(list);
        this.A06 = r5;
        this.A07 = r6;
        this.A05 = r4;
        this.A04 = r3;
        this.A0A = r9;
        this.A09 = r8;
        this.A08 = r7;
        this.A02 = i2;
    }

    public int A0C() {
        return this.A01.size();
    }

    /* renamed from: A0E */
    public void ANd(C110965f7 r3, int i2) {
        r3.A00.setText(((PaymentTransactionHistoryActivity) this.A08).A0X.get(i2).toString());
    }

    public int AB1(int i2) {
        return ((AnonymousClass67Q) ((PaymentTransactionHistoryActivity) this.A08).A0X.get(i2)).count;
    }

    public int ACY() {
        return ((PaymentTransactionHistoryActivity) this.A08).A0X.size();
    }

    public long ACZ(int i2) {
        return -((Calendar) ((PaymentTransactionHistoryActivity) this.A08).A0X.get(i2)).getTimeInMillis();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0099, code lost:
        if (r5.A01(((X.AnonymousClass1Vt) r9.A01.get(r11)).A05).equals(r5.A01(((X.AnonymousClass1Vt) r9.A01.get(r6)).A05)) != false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00a1, code lost:
        if (r6 == r9.A01.size()) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00a3, code lost:
        r2.findViewById(com.obwhatsapp.R.id.divider).setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00af, code lost:
        r8 = ((com.obwhatsapp.payments.ui.PaymentTransactionHistoryActivity) r9.A08).A0M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00b5, code lost:
        if (r8 == null) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00b7, code lost:
        r0 = r9.A05.A0H(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00bd, code lost:
        if (r0 == null) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00bf, code lost:
        r7 = r0.A0I();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00c3, code lost:
        r6 = r9.A0A;
        r5 = r6.A0M(r3);
        r4 = r9.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00d0, code lost:
        if (X.C40661uU.A03(r4, r7, r8, true) == false) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00d2, code lost:
        r2.A0C.A0I(((com.obwhatsapp.payments.ui.PaymentTransactionHistoryActivity) r10.A01.A08).A0M, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00e1, code lost:
        if (r9.A00 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00e3, code lost:
        X.C110105dW.A0s(r2, r3, r9, 18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00e8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ed, code lost:
        if (X.C40661uU.A03(r4, r5, r8, true) == false) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ef, code lost:
        r1 = ((com.obwhatsapp.payments.ui.PaymentTransactionHistoryActivity) r10.A01.A08).A0M;
        r0 = r2.A0D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00f9, code lost:
        r0.A0I(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00fd, code lost:
        r5 = r6.A0J(r3);
        r1 = ((com.obwhatsapp.payments.ui.PaymentTransactionHistoryActivity) r10.A01.A08).A0M;
        r0 = r2.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x010c, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void ANf(X.C005602k r10, int r11) {
        /*
            r9 = this;
            java.util.List r0 = r9.A01
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0010
            X.1Vo r1 = r9.A07
            java.lang.String r0 = "Transaction items size zero even when binding"
            r1.A05(r0)
        L_0x000f:
            return
        L_0x0010:
            java.util.List r0 = r9.A01
            java.lang.Object r3 = r0.get(r11)
            X.1Vt r3 = (X.AnonymousClass1Vt) r3
            X.AnonymousClass00B.A06(r3)
            boolean r0 = r10 instanceof X.C110935f4
            if (r0 == 0) goto L_0x0027
            android.view.View r0 = r10.A0H
            com.obwhatsapp.payments.ui.widget.PaymentInteropShimmerRow r0 = (com.obwhatsapp.payments.ui.widget.PaymentInteropShimmerRow) r0
            r0.A5U(r3)
            return
        L_0x0027:
            X.5f8 r10 = (X.C110975f8) r10
            com.obwhatsapp.payments.ui.widget.PeerPaymentTransactionRow r2 = r10.A00
            com.obwhatsapp.TextEmojiLabel r0 = r2.A0D
            java.lang.String r5 = ""
            r0.setText(r5)
            com.obwhatsapp.TextEmojiLabel r4 = r2.A0D
            android.content.Context r1 = r2.getContext()
            r0 = 2131100935(0x7f060507, float:1.7814265E38)
            X.C13680ns.A0v(r1, r4, r0)
            com.obwhatsapp.TextEmojiLabel r0 = r2.A0C
            r0.setText(r5)
            com.obwhatsapp.TextEmojiLabel r0 = r2.A0B
            r0.setText(r5)
            com.obwhatsapp.TextEmojiLabel r0 = r2.A0B
            r4 = 0
            r0.setVisibility(r4)
            android.view.View r0 = r2.A03
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r0 = r2.A0A
            r0.setText(r5)
            android.widget.TextView r0 = r2.A0A
            r0.setVisibility(r4)
            com.obwhatsapp.WaImageView r0 = r2.A0F
            r0.setVisibility(r1)
            r0 = 2131363227(0x7f0a059b, float:1.8346257E38)
            X.C13690nt.A13(r2, r0, r4)
            r2.A5U(r3)
            int r6 = r11 + 1
            java.util.List r0 = r9.A01
            int r0 = r0.size()
            if (r6 >= r0) goto L_0x009b
            java.util.List r0 = r9.A01
            java.lang.Object r1 = r0.get(r11)
            X.1Vt r1 = (X.AnonymousClass1Vt) r1
            java.util.List r0 = r9.A01
            java.lang.Object r7 = r0.get(r6)
            X.1Vt r7 = (X.AnonymousClass1Vt) r7
            X.5vO r5 = r9.A09
            long r0 = r1.A05
            X.67Q r4 = r5.A01(r0)
            long r0 = r7.A05
            X.67Q r0 = r5.A01(r0)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00a3
        L_0x009b:
            java.util.List r0 = r9.A01
            int r0 = r0.size()
            if (r6 != r0) goto L_0x00af
        L_0x00a3:
            r0 = 2131363227(0x7f0a059b, float:1.8346257E38)
            android.view.View r1 = r2.findViewById(r0)
            r0 = 8
            r1.setVisibility(r0)
        L_0x00af:
            X.680 r0 = r9.A08
            com.obwhatsapp.payments.ui.PaymentTransactionHistoryActivity r0 = (com.obwhatsapp.payments.ui.PaymentTransactionHistoryActivity) r0
            java.util.ArrayList r8 = r0.A0M
            if (r8 == 0) goto L_0x00df
            X.0t6 r0 = r9.A05
            X.0tZ r0 = r0.A0H(r3)
            if (r0 == 0) goto L_0x010c
            java.lang.String r7 = r0.A0I()
        L_0x00c3:
            X.15p r6 = r9.A0A
            java.lang.String r5 = r6.A0M(r3)
            X.013 r4 = r9.A04
            r1 = 1
            boolean r0 = X.C40661uU.A03(r4, r7, r8, r1)
            if (r0 == 0) goto L_0x00e9
            X.5f1 r0 = r10.A01
            X.680 r0 = r0.A08
            com.obwhatsapp.payments.ui.PaymentTransactionHistoryActivity r0 = (com.obwhatsapp.payments.ui.PaymentTransactionHistoryActivity) r0
            java.util.ArrayList r1 = r0.A0M
            com.obwhatsapp.TextEmojiLabel r0 = r2.A0C
            r0.A0I(r1, r7)
        L_0x00df:
            X.5qs r0 = r9.A00
            if (r0 == 0) goto L_0x000f
            r0 = 18
            X.C110105dW.A0s(r2, r3, r9, r0)
            return
        L_0x00e9:
            boolean r0 = X.C40661uU.A03(r4, r5, r8, r1)
            if (r0 == 0) goto L_0x00fd
            X.5f1 r0 = r10.A01
            X.680 r0 = r0.A08
            com.obwhatsapp.payments.ui.PaymentTransactionHistoryActivity r0 = (com.obwhatsapp.payments.ui.PaymentTransactionHistoryActivity) r0
            java.util.ArrayList r1 = r0.A0M
            com.obwhatsapp.TextEmojiLabel r0 = r2.A0D
        L_0x00f9:
            r0.A0I(r1, r5)
            goto L_0x00df
        L_0x00fd:
            java.lang.String r5 = r6.A0J(r3)
            X.5f1 r0 = r10.A01
            X.680 r0 = r0.A08
            com.obwhatsapp.payments.ui.PaymentTransactionHistoryActivity r0 = (com.obwhatsapp.payments.ui.PaymentTransactionHistoryActivity) r0
            java.util.ArrayList r1 = r0.A0M
            com.obwhatsapp.TextEmojiLabel r0 = r2.A0B
            goto L_0x00f9
        L_0x010c:
            r7 = 0
            goto L_0x00c3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C110905f1.ANf(X.02k, int):void");
    }

    public /* bridge */ /* synthetic */ C005602k APB(ViewGroup viewGroup) {
        boolean z2 = this instanceof C113035lH;
        Context context = this.A03;
        LayoutInflater layoutInflater = C19980zJ.A00(context).getLayoutInflater();
        return z2 ? new C113025lG(C110115dX.A03(context, layoutInflater, viewGroup, R.layout.layout0303)) : new C110965f7(C110115dX.A03(context, layoutInflater, viewGroup, R.layout.layout05bc));
    }

    public C005602k APF(ViewGroup viewGroup, int i2) {
        return i2 == 2000 ? new C110935f4(C13680ns.A0H(C110105dW.A07(viewGroup), viewGroup, R.layout.layout047d)) : new C110975f8(new PeerPaymentTransactionRow(this.A03, this.A06, this.A02), this);
    }

    public /* bridge */ /* synthetic */ boolean AXu(MotionEvent motionEvent, C005602k r3, int i2) {
        return false;
    }

    public int getItemViewType(int i2) {
        AnonymousClass1Vt r2 = (AnonymousClass1Vt) this.A01.get(i2);
        return (r2.A03 != 1000 || !r2.A0P) ? 1000 : 2000;
    }
}
