package X;

import android.content.Context;
import android.provider.ContactsContract;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.redex.IDxIListenerShape257S0100000_2_I1;
import com.obwhatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.30a  reason: invalid class name and case insensitive filesystem */
public class C600930a extends C30011bb {
    public int A00;
    public C23241Ba A01;
    public AnonymousClass1BJ A02;
    public AnonymousClass13V A03;
    public C17160ud A04;
    public AnonymousClass1L6 A05;
    public C19230xz A06;
    public AnonymousClass37H A07;
    public C615139f A08;
    public C26681Os A09;
    public C809846j A0A;
    public C24551Gj A0B;
    public C43341zq A0C;
    public C39701sv A0D;
    public boolean A0E;
    public boolean A0F;
    public final ImageView A0G;
    public final LinearLayout A0H;
    public final TextView A0I;
    public final TextView A0J;
    public final TextView A0K;
    public final TextView A0L;
    public final TextView A0M;
    public final AnonymousClass2Ao A0N;
    public final C33741j5 A0O;
    public final C43331zp A0P;
    public final AnonymousClass1ZQ A0Q;
    public final ArrayList A0R = AnonymousClass000.A0u();
    public final ArrayList A0S = AnonymousClass000.A0u();

    public C600930a(Context context, AnonymousClass2Ao r5, AnonymousClass1YG r6, C16740tZ r7, C43331zp r8) {
        super(context, r6, r7);
        A0g();
        this.A0N = r5;
        this.A0P = r8;
        this.A0M = C13680ns.A0M(this, R.id.vcard_text);
        this.A0I = C13680ns.A0M(this, R.id.account_type);
        this.A0K = C13680ns.A0M(this, R.id.description);
        this.A0G = C13680ns.A0K(this, R.id.picture);
        this.A0L = C13680ns.A0M(this, R.id.msg_contact_btn);
        this.A0J = C13680ns.A0M(this, R.id.action_contact_btn);
        C33741j5 A002 = C33741j5.A00(this, R.id.action_view_business_container);
        this.A0O = A002;
        A002.A05(new IDxIListenerShape257S0100000_2_I1(this, 0));
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.contact_card);
        this.A0H = linearLayout;
        C30011bb.A0K(linearLayout, this);
        this.A0Q = C47612Jr.A00(context);
        A1M();
    }

    public void A0g() {
        if (!this.A0E) {
            this.A0E = true;
            C52652eD A072 = C30011bb.A07(this);
            C16150sX A062 = C30011bb.A06(A072, this);
            C49132Rg A052 = C30011bb.A05(A062, A072, this, C30011bb.A0C(A062, this));
            C30011bb.A0S(A062, this, C30011bb.A0B(A052, A062, this));
            C30011bb.A0Q(A062, this);
            C30011bb.A0O(A052, A062, C30011bb.A08(A062, this), this);
            C30011bb.A0M(A052, A062, A072, this, A062.A4p);
            C30011bb.A0R(A062, this);
            this.A01 = (C23241Ba) A062.A7Z.get();
            this.A02 = (AnonymousClass1BJ) A062.AOm.get();
            this.A04 = C16150sX.A0L(A062);
            this.A05 = (AnonymousClass1L6) A062.AMC.get();
            this.A06 = (C19230xz) A062.A5B.get();
            this.A03 = (AnonymousClass13V) A062.A35.get();
            this.A0A = new C809846j();
            this.A09 = (C26681Os) A062.A39.get();
            this.A0B = (C24551Gj) A062.A5l.get();
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

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00a0, code lost:
        if (r1.A04 == false) goto L_0x00a2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1M() {
        /*
            r18 = this;
            r2 = r18
            X.0tZ r3 = r2.getFMessage()
            android.widget.TextView r1 = r2.A0M
            X.1Vw r0 = r3.A11
            r1.setTag(r0)
            X.1zq r1 = r2.A0C
            if (r1 == 0) goto L_0x0016
            X.1zp r0 = r2.A0P
            r0.A03(r1)
        L_0x0016:
            X.1zp r1 = r2.A0P
            monitor-enter(r1)
            r6 = 0
            java.lang.Runnable r4 = r1.A01(r3, r6)     // Catch:{ all -> 0x00d4 }
            monitor-exit(r1)
            X.1zq r4 = (X.C43341zq) r4
            r2.A0C = r4
            r0 = 1
            com.facebook.redex.IDxNConsumerShape152S0100000_1_I1 r1 = new com.facebook.redex.IDxNConsumerShape152S0100000_1_I1
            r1.<init>(r2, r0)
            X.0pt r0 = r2.A0J
            java.util.concurrent.Executor r0 = r0.A06
            r4.A01(r1, r0)
            android.content.Context r0 = r2.getContext()
            java.lang.String r0 = X.AnonymousClass2QA.A01(r0, r3)
            r2.A1N(r0)
            X.0ud r4 = r2.A04
            android.widget.ImageView r1 = r2.A0G
            r0 = 2131230908(0x7f0800bc, float:1.8077882E38)
            r4.A05(r1, r0)
            r0 = 1024(0x400, float:1.435E-42)
            boolean r1 = r3.A10(r0)
            r0 = 2131367111(0x7f0a14c7, float:1.8354135E38)
            if (r1 == 0) goto L_0x00bd
            android.view.ViewGroup r5 = X.C13690nt.A0K(r2, r0)
            if (r5 == 0) goto L_0x00d3
            r15 = 0
            X.1xL r1 = X.C42171xL.A00(r6, r3)
            r0 = 0
            r5.setVisibility(r0)
            X.39f r0 = r2.A08
            if (r0 != 0) goto L_0x0097
            android.content.Context r9 = r2.getContext()
            X.0uW r10 = r2.A0K
            X.1Mg r14 = r2.A12
            X.1Ld r6 = r2.A1d
            X.0uk r11 = r2.A0Y
            X.0pt r8 = r2.A0J
            X.0sq r7 = r2.A1e
            X.0ua r4 = r2.A0O
            X.188 r0 = r2.A0y
            X.4NE r12 = new X.4NE
            r12.<init>(r8, r4, r0, r7)
            X.46j r13 = r2.A0A
            X.1Gj r0 = r2.A0B
            X.39f r8 = new X.39f
            r17 = r6
            r16 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r2.A08 = r8
            com.obwhatsapp.webpagepreview.WebPagePreviewView r0 = r8.A0C
            X.C13700nu.A0Q(r0, r5)
            X.39f r0 = r2.A08
            com.obwhatsapp.webpagepreview.WebPagePreviewView r0 = r0.A0C
            X.C30011bb.A0K(r0, r2)
        L_0x0097:
            X.1ZQ r5 = r2.A0Q
            boolean r0 = r5 instanceof X.AnonymousClass1ZP
            if (r0 == 0) goto L_0x00a2
            boolean r0 = r1.A04
            r4 = 1
            if (r0 != 0) goto L_0x00a3
        L_0x00a2:
            r4 = 0
        L_0x00a3:
            r2.A0F = r4
            X.39f r6 = r2.A08
            X.1Os r0 = r2.A09
            boolean r12 = r0.A00(r3)
            X.1Os r0 = r2.A09
            boolean r13 = r0.A01(r3)
            r14 = 0
            r9 = r5
            r10 = r1
            r11 = r4
            r8 = r3
            r7 = r2
            r6.A02(r7, r8, r9, r10, r11, r12, r13, r14)
            return
        L_0x00bd:
            android.view.ViewGroup r1 = X.C13690nt.A0K(r2, r0)
            if (r1 == 0) goto L_0x00d3
            X.39f r0 = r2.A08
            if (r0 == 0) goto L_0x00ce
            com.obwhatsapp.webpagepreview.WebPagePreviewView r0 = r0.A0C
            r1.removeView(r0)
            r2.A08 = r6
        L_0x00ce:
            r0 = 8
            r1.setVisibility(r0)
        L_0x00d3:
            return
        L_0x00d4:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C600930a.A1M():void");
    }

    public final void A1N(String str) {
        String A042 = AnonymousClass1ZW.A04(128, str);
        Context context = getContext();
        TextView textView = this.A0M;
        textView.setText(A0r(A042 == null ? null : AnonymousClass2Sy.A02(context, textView.getPaint(), new C101984yD(), this.A19, A042)));
    }

    public final boolean A1O(C39701sv r7) {
        boolean z2;
        if (r7 != null) {
            List list = r7.A05;
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (this.A0L.A0I(((C39711sw) it.next()).A01)) {
                            z2 = true;
                            break;
                        }
                    } else {
                        z2 = false;
                        break;
                    }
                }
                if (list.size() > 0 && !z2) {
                    return true;
                }
            }
            List<C85294Nw> list2 = r7.A02;
            if (list2 != null) {
                for (C85294Nw r0 : list2) {
                    if (r0.A01 == ContactsContract.CommonDataKinds.Email.class) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int getCenteredLayoutId() {
        return R.layout.layout0182;
    }

    public int getIncomingLayoutId() {
        return R.layout.layout0182;
    }

    public int getMainChildMaxWidth() {
        if (this.A0F) {
            return C31171dd.A02(this);
        }
        return 0;
    }

    public int getOutgoingLayoutId() {
        return R.layout.layout0183;
    }

    public void onDetachedFromWindow() {
        AnonymousClass37H r1 = this.A07;
        if (r1 != null) {
            r1.A06(true);
            this.A07 = null;
        }
        super.onDetachedFromWindow();
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.A0M.getText());
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.getText().add(this.A0M.getText());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (X.C42941yx.A02(r3) != false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setFMessage(X.C16740tZ r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof X.C38741rL
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
        throw new UnsupportedOperationException("Method not decompiled: X.C600930a.setFMessage(X.0tZ):void");
    }
}
