package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.obwhatsapp.R;

/* renamed from: X.30R  reason: invalid class name */
public class AnonymousClass30R extends C30011bb {
    public C221116r A00;
    public C218315p A01;
    public boolean A02;
    public final TextView A03 = C13680ns.A0M(this, R.id.info);

    public AnonymousClass30R(Context context, AnonymousClass1YG r3, C16740tZ r4) {
        super(context, r3, r4);
        A0g();
        A1M();
    }

    public void A0g() {
        if (!this.A02) {
            this.A02 = true;
            C52652eD A07 = C30011bb.A07(this);
            C16150sX A06 = C30011bb.A06(A07, this);
            C49132Rg A05 = C30011bb.A05(A06, A07, this, C30011bb.A0C(A06, this));
            C30011bb.A0S(A06, this, C30011bb.A0B(A05, A06, this));
            C30011bb.A0Q(A06, this);
            C30011bb.A0O(A05, A06, C30011bb.A08(A06, this), this);
            C30011bb.A0M(A05, A06, A07, this, A06.A4p);
            C30011bb.A0R(A06, this);
            this.A01 = (C218315p) A06.AIL.get();
            this.A00 = (C221116r) A06.AHt.get();
        }
    }

    public void A0t() {
        A1M();
        A1J(false);
    }

    public void A1G(C16740tZ r2, boolean z2) {
        boolean A1a = C13680ns.A1a(r2, getFMessage());
        super.A1G(r2, z2);
        if (z2 || A1a) {
            A1M();
        }
    }

    public final void A1M() {
        AnonymousClass1Vt r2;
        String str;
        TextView textView = this.A03;
        textView.setTextSize(getDividerFontSize());
        textView.setBackgroundResource(R.drawable.business_balloon);
        C16740tZ fMessage = getFMessage();
        if ((fMessage instanceof C38881rZ) || (fMessage instanceof C38861rX)) {
            String str2 = ((C38871rY) fMessage).A00;
            if (!TextUtils.isEmpty(str2)) {
                r2 = this.A00.A0M(str2, (String) null);
                if (r2 != null) {
                    str = this.A01.A0R(r2, getFMessage());
                }
                str = null;
            } else {
                r2 = null;
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                C13680ns.A1C(textView, this, r2, 6);
                textView.setText(str);
                C13680ns.A0v(getContext(), textView, R.color.color00c4);
                return;
            }
            textView.setOnClickListener((View.OnClickListener) null);
            return;
        }
        throw AnonymousClass000.A0V("PAY: message is not FMessagePaymentRequestDeclined or FMessagePaymentRequestCancelled");
    }

    public int getCenteredLayoutId() {
        return R.layout.layout018a;
    }

    public int getIncomingLayoutId() {
        return R.layout.layout018a;
    }

    public int getOutgoingLayoutId() {
        return R.layout.layout018a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if ((r3 instanceof X.C38881rZ) != false) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setFMessage(X.C16740tZ r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof X.C38861rX
            if (r0 != 0) goto L_0x0009
            boolean r1 = r3 instanceof X.C38881rZ
            r0 = 0
            if (r1 == 0) goto L_0x000a
        L_0x0009:
            r0 = 1
        L_0x000a:
            X.AnonymousClass00B.A0G(r0)
            r2.A0O = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass30R.setFMessage(X.0tZ):void");
    }
}
