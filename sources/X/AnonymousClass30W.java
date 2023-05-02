package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.redex.IDxNConsumerShape154S0100000_2_I1;
import com.obwhatsapp.R;
import java.util.List;

/* renamed from: X.30W  reason: invalid class name */
public class AnonymousClass30W extends C30011bb {
    public C17160ud A00;
    public C43341zq A01;
    public boolean A02;
    public final LinearLayout A03;
    public final TextView A04 = C13680ns.A0M(this, R.id.vcard_text);
    public final TextView A05;
    public final AnonymousClass2Ao A06;
    public final C43331zp A07;
    public final ImageView[] A08;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: android.widget.ImageView[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass30W(android.content.Context r4, X.AnonymousClass2Ao r5, X.AnonymousClass1YG r6, X.C16740tZ r7, X.C43331zp r8) {
        /*
            r3 = this;
            r3.<init>(r4, r6, r7)
            r3.A0g()
            r0 = 3
            android.widget.ImageView[] r2 = new android.widget.ImageView[r0]
            r3.A08 = r2
            r3.A06 = r5
            r3.A07 = r8
            r0 = 2131366874(0x7f0a13da, float:1.8353654E38)
            android.widget.TextView r0 = X.C13680ns.A0M(r3, r0)
            r3.A04 = r0
            r0 = 2131365325(0x7f0a0dcd, float:1.8350512E38)
            android.view.View r1 = r3.findViewById(r0)
            r0 = 0
            r2[r0] = r1
            r0 = 2131365326(0x7f0a0dce, float:1.8350514E38)
            android.view.View r1 = r3.findViewById(r0)
            r0 = 1
            r2[r0] = r1
            r0 = 2131365327(0x7f0a0dcf, float:1.8350516E38)
            android.view.View r1 = r3.findViewById(r0)
            r0 = 2
            r2[r0] = r1
            r0 = 2131366933(0x7f0a1415, float:1.8353774E38)
            android.widget.TextView r0 = X.C13680ns.A0M(r3, r0)
            r3.A05 = r0
            r0 = 2131362866(0x7f0a0432, float:1.8345525E38)
            android.view.View r1 = r3.findViewById(r0)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r3.A03 = r1
            r0 = 8
            X.C34331k5.A03(r1, r3, r0)
            X.C30011bb.A0K(r1, r3)
            r3.A1M()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass30W.<init>(android.content.Context, X.2Ao, X.1YG, X.0tZ, X.1zp):void");
    }

    public void A0g() {
        if (!this.A02) {
            this.A02 = true;
            C52652eD A072 = C30011bb.A07(this);
            C16150sX A062 = C30011bb.A06(A072, this);
            C49132Rg A052 = C30011bb.A05(A062, A072, this, C30011bb.A0C(A062, this));
            C30011bb.A0S(A062, this, C30011bb.A0B(A052, A062, this));
            C30011bb.A0Q(A062, this);
            C30011bb.A0O(A052, A062, C30011bb.A08(A062, this), this);
            C30011bb.A0M(A052, A062, A072, this, A062.A4p);
            C30011bb.A0R(A062, this);
            this.A00 = C16150sX.A0L(A062);
        }
    }

    public void A0t() {
        A1J(false);
        A1M();
    }

    public void A1G(C16740tZ r2, boolean z2) {
        boolean A1a = C13680ns.A1a(r2, getFMessage());
        super.A1G(r2, z2);
        if (z2 || A1a) {
            A1M();
        }
    }

    public final void A1M() {
        Runnable A012;
        boolean z2;
        C16010sH A002;
        boolean z3;
        C16740tZ fMessage = getFMessage();
        int A003 = AnonymousClass2QA.A00(fMessage);
        TextView textView = this.A04;
        C28381Vw r5 = fMessage.A11;
        textView.setTag(r5);
        C43341zq r1 = this.A01;
        if (r1 != null) {
            this.A07.A03(r1);
        }
        C43331zp r12 = this.A07;
        synchronized (r12) {
            A012 = r12.A01(fMessage, (Object) null);
        }
        C43341zq r2 = (C43341zq) A012;
        this.A01 = r2;
        r2.A01(new IDxNConsumerShape154S0100000_2_I1(this, 3), this.A0J.A06);
        A1N((List) null, A003, (String) null);
        ImageView imageView = this.A08[2];
        if (A003 == 2) {
            imageView.setVisibility(4);
        } else {
            imageView.setVisibility(0);
        }
        if (!r5.A02) {
            C15830rv r3 = r5.A00;
            boolean A0L = C16030sJ.A0L(r3);
            boolean z4 = true;
            C16000sG r13 = this.A0a;
            if (A0L) {
                A002 = C16000sG.A00(r13, fMessage.A0B());
                z3 = (!this.A1B.A0a.A0D((C16050sL) r3)) & this.A1a.A03(r3) & true;
            } else {
                A002 = C16000sG.A00(r13, r3);
                z3 = true;
            }
            if (A002.A0D != null) {
                z4 = false;
            }
            z2 = z3 & z4 & this.A1a.A03(C16010sH.A01(A002));
        } else {
            z2 = false;
        }
        View findViewById = findViewById(R.id.button_div);
        TextView textView2 = this.A05;
        if (!z2) {
            textView2.setVisibility(0);
            C34331k5.A03(textView2, this, 8);
            return;
        }
        textView2.setVisibility(8);
        findViewById.setVisibility(8);
    }

    public final void A1N(List list, int i2, String str) {
        int i3 = 0;
        do {
            if (list == null || i3 >= list.size()) {
                this.A00.A05(this.A08[i3], R.drawable.avatar_contact);
            } else {
                this.A06.A09(this.A08[i3], (C39701sv) list.get(i3));
            }
            i3++;
        } while (i3 < 3);
        if (!TextUtils.isEmpty(str)) {
            int i4 = i2 - 1;
            String A052 = AnonymousClass1ZW.A05(50, str);
            Object[] A1Z = C13690nt.A1Z();
            A1Z[0] = A052;
            AnonymousClass000.A1M(A1Z, i4, 1);
            String A0J = this.A0K.A0J(A1Z, R.plurals.plurals0029, (long) i4);
            Context context = getContext();
            TextView textView = this.A04;
            textView.setText(A0r(A0J == null ? null : AnonymousClass2Sy.A02(context, textView.getPaint(), new C101984yD(), this.A19, A0J)));
            return;
        }
        TextView textView2 = this.A04;
        Object[] objArr = new Object[1];
        AnonymousClass000.A1M(objArr, i2, 0);
        textView2.setText(this.A0K.A0J(objArr, R.plurals.plurals00d8, (long) i2));
    }

    public int getCenteredLayoutId() {
        return R.layout.layout0184;
    }

    public int getIncomingLayoutId() {
        return R.layout.layout0184;
    }

    public int getOutgoingLayoutId() {
        return R.layout.layout0185;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (X.C42941yx.A02(r3) != false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setFMessage(X.C16740tZ r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof X.C38811rS
            if (r0 != 0) goto L_0x000b
            boolean r1 = X.C42941yx.A02(r3)
            r0 = 0
            if (r1 == 0) goto L_0x000c
        L_0x000b:
            r0 = 1
        L_0x000c:
            X.AnonymousClass00B.A0G(r0)
            r2.A0O = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass30W.setFMessage(X.0tZ):void");
    }
}
