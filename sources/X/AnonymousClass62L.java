package X;

import android.content.Intent;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.orderdetails.PaymentOptionsBottomSheet;
import java.util.List;

/* renamed from: X.62L  reason: invalid class name */
public class AnonymousClass62L implements AnonymousClass69T {
    public final /* synthetic */ C14530pL A00;
    public final /* synthetic */ AnonymousClass69W A01;
    public final /* synthetic */ AnonymousClass629 A02;

    public AnonymousClass62L(C14530pL r1, AnonymousClass69W r2, AnonymousClass629 r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void A00(C35431lv r8, C16840tj r9, String str) {
        this.A00.Afq(R.string.str13db);
        AnonymousClass629 r0 = this.A02;
        C16320sq r6 = r0.A0W;
        C16460t6 r1 = r0.A0J;
        AnonymousClass1MA r4 = r0.A0Q;
        C62013Bh.A02(r0.A0E, r1, r0.A0L, new AnonymousClass60D(r8, this, r9, str), r4, r9, r6);
    }

    public void AOP(C35431lv r8, C15830rv r9, C117315sn r10, C16840tj r11, String str) {
        AnonymousClass629 r3 = this.A02;
        r3.A0U.A01(r11, r3.A09, 5);
        String str2 = r3.A09;
        if ("WhatsappPay".equals(str2) || "p2m_lite".equals(str2)) {
            A00(r8, r11, str);
            return;
        }
        AnonymousClass00B.A0F(!r11.AAt().A01.A0C.isEmpty());
        String str3 = ((C35231la) r11.AAt().A01.A0C.get(0)).A02;
        C14530pL r32 = this.A00;
        C32241fu A002 = C32241fu.A00(r32);
        A002.A07(false);
        A002.setTitle(r32.getString(R.string.str0ea0));
        A002.A06(C13680ns.A0d(r32, str3, new Object[1], 0, R.string.str0e9f));
        C13690nt.A1E(A002);
        A002.setPositiveButton(R.string.str02ac, new AnonymousClass5y6(r32, this, r11, str3));
        C13690nt.A1G(A002);
    }

    public void ATg(C15830rv r5, C16840tj r6, long j2) {
        AnonymousClass629 r3 = this.A02;
        r3.A0U.A01(r6, r3.A09, 8);
        Intent A0x = new C14750ph().A0x(r3.A01, r5);
        A0x.putExtra("extra_quoted_message_row_id", j2);
        r3.A01.startActivity(A0x);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
        r0 = r0.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AUC(X.C15830rv r7, X.C16840tj r8, java.lang.String r9) {
        /*
            r6 = this;
            X.629 r3 = r6.A02
            X.1TS r2 = r3.A0U
            java.lang.String r1 = r3.A09
            r0 = 7
            r2.A01(r8, r1, r0)
            X.0tn r0 = r8.AAt()
            if (r0 == 0) goto L_0x0029
            X.1lc r0 = r0.A01
            if (r0 == 0) goto L_0x0029
            java.lang.String r4 = r0.A08
        L_0x0016:
            X.1N2 r0 = r3.A0S
            X.0pL r1 = r6.A00
            r2 = 0
            r5 = r9
            r3 = r2
            android.content.Intent r0 = r0.A00(r1, r2, r3, r4, r5)
            if (r0 != 0) goto L_0x002b
            java.lang.String r0 = "Pay: PaymentCheckoutOrderDetailsCoordinator/onOpenTransactionDetailClicked the transaction details intent is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0029:
            r4 = 0
            goto L_0x0016
        L_0x002b:
            r1.startActivity(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass62L.AUC(X.0rv, X.0tj, java.lang.String):void");
    }

    public void AUb(C35431lv r9, C16840tj r10, String str, String str2, List list) {
        AnonymousClass629 r0 = this.A02;
        r0.A0U.A01(r10, r0.A09, 9);
        PaymentOptionsBottomSheet A012 = PaymentOptionsBottomSheet.A01(str, (String) null, list, false);
        C14530pL r3 = this.A00;
        A012.A03 = new AnonymousClass62E(r3, r9, this, r10, str2);
        C453428a.A01(A012, r3.AGM());
    }
}
