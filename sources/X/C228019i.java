package X;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickCListenerShape0S1500000_I0;
import com.facebook.redex.ViewOnClickCListenerShape1S0500000_I0;
import com.facebook.redex.ViewOnClickCListenerShape2S0300000_I0;
import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.19i  reason: invalid class name and case insensitive filesystem */
public class C228019i {
    public final C14870pt A00;
    public final C16440t3 A01;
    public final C216114t A02;
    public final C16460t6 A03;
    public final C16070sO A04;
    public final AnonymousClass17E A05;
    public final C17240ul A06;
    public final AnonymousClass175 A07;
    public final C227919h A08;
    public final C227819g A09;
    public final C18310wU A0A;
    public final C18290wS A0B;
    public final C222617g A0C;
    public final C16320sq A0D;

    public C228019i(C14870pt r1, C16440t3 r2, C216114t r3, C16460t6 r4, C16070sO r5, AnonymousClass17E r6, C17240ul r7, AnonymousClass175 r8, C227919h r9, C227819g r10, C18310wU r11, C18290wS r12, C222617g r13, C16320sq r14) {
        this.A01 = r2;
        this.A00 = r1;
        this.A0D = r14;
        this.A05 = r6;
        this.A0C = r13;
        this.A0B = r12;
        this.A03 = r4;
        this.A06 = r7;
        this.A07 = r8;
        this.A09 = r10;
        this.A0A = r11;
        this.A08 = r9;
        this.A04 = r5;
        this.A02 = r3;
    }

    public void A00(Context context, AnonymousClass1Vt r8) {
        int AEb;
        C28391Vx A022 = this.A0B.A02(r8.A0G);
        C228919r AEp = A022 != null ? A022.AEp(r8.A0I) : null;
        if (AEp == null || (AEb = AEp.AEb()) == 0) {
            ((C14600pS) context).Afj(new Object[0], 0, R.string.str0fcc);
        } else {
            ((C14600pS) context).Afj(new Object[]{context.getString(AEb)}, 0, R.string.str187e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004c, code lost:
        if (r1.A03().AB4().AId(new X.C35301lh(new X.C53852gP(), java.lang.String.class, r6, "upiHandle")) == false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r8.A00.A0V(com.whatsapp.jid.UserJid.of(r0)) == false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(android.content.Context r16, X.AnonymousClass1Vt r17, X.C109385Rx r18, boolean r19) {
        /*
            r15 = this;
            X.19g r8 = r15.A09
            r5 = r17
            com.whatsapp.jid.UserJid r0 = r5.A0D
            if (r0 == 0) goto L_0x0015
            X.01Y r1 = r8.A00
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.UserJid.of(r0)
            boolean r0 = r1.A0V(r0)
            r7 = 1
            if (r0 != 0) goto L_0x0016
        L_0x0015:
            r7 = 0
        L_0x0016:
            X.1W2 r0 = r5.A0A
            if (r0 == 0) goto L_0x0059
            java.lang.String r6 = r0.A0I()
        L_0x001e:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x004e
            X.0wS r1 = r8.A04
            X.19r r0 = r1.A03()
            X.19d r0 = r0.AB4()
            if (r0 == 0) goto L_0x004e
            X.19r r0 = r1.A03()
            X.19d r4 = r0.AB4()
            X.2gP r3 = new X.2gP
            r3.<init>()
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.String r1 = "upiHandle"
            X.1lh r0 = new X.1lh
            r0.<init>(r3, r2, r6, r1)
            boolean r1 = r4.AId(r0)
            r0 = 1
            if (r1 != 0) goto L_0x004f
        L_0x004e:
            r0 = 0
        L_0x004f:
            r4 = r18
            if (r7 != 0) goto L_0x005b
            if (r0 != 0) goto L_0x005b
            r4.onSuccess()
            return
        L_0x0059:
            r6 = 0
            goto L_0x001e
        L_0x005b:
            android.app.Activity r9 = X.C19980zJ.A00(r16)
            com.whatsapp.jid.UserJid r11 = r5.A0D
            X.2gP r3 = new X.2gP
            r3.<init>()
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            X.1W2 r0 = r5.A0A
            java.lang.String r1 = r0.A0I()
            java.lang.String r0 = "paymentHandle"
            X.1lh r12 = new X.1lh
            r12.<init>(r3, r2, r1, r0)
            r13 = 0
            X.4vz r10 = new X.4vz
            r10.<init>(r4)
            r14 = r19
            r8.A00(r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C228019i.A01(android.content.Context, X.1Vt, X.5Rx, boolean):void");
    }

    public final void A02(View view, Button button, AnonymousClass1Vt r7) {
        C228919r AEp;
        View A0E = C004601z.A0E(view, R.id.request_decline_button);
        View A0E2 = C004601z.A0E(view, R.id.request_pay_button);
        A0E.setVisibility(8);
        A0E2.setVisibility(8);
        C28391Vx A022 = this.A0B.A02(r7.A0G);
        if (A022 == null || (AEp = A022.AEp(r7.A0I)) == null) {
            view.setVisibility(8);
            return;
        }
        view.setVisibility(0);
        button.setVisibility(0);
        C227219a AB3 = AEp.AB3();
        if (AB3 != null) {
            if (!AB3.Af9(r7.A0A)) {
                return;
            }
        } else if (this.A07.A0E()) {
            return;
        }
        button.setOnClickListener(new ViewOnClickCListenerShape2S0300000_I0(button, AEp, r7, 5));
    }

    public void A03(View view, Button button, AnonymousClass1Vt r27, AnonymousClass1yN r28, AnonymousClass2SE r29, C16740tZ r30, String str, boolean z2) {
        AnonymousClass1Vt A0K;
        int i2;
        View view2 = view;
        View A0E = C004601z.A0E(view2, R.id.request_decline_button);
        View A0E2 = C004601z.A0E(view2, R.id.request_pay_button);
        Context context = view2.getContext();
        C16740tZ r3 = r30;
        if (r30 == null) {
            A0K = null;
        } else {
            C18290wS r0 = this.A0B;
            r0.A06();
            A0K = r0.A08.A0K(r3.A11.A01);
        }
        AnonymousClass1Vt r13 = r27;
        if (!A06(r13) && (A0K == null || A0K.A0A())) {
            int i3 = r13.A03;
            AnonymousClass1yN r7 = r28;
            AnonymousClass2SE r14 = r29;
            String str2 = str;
            if (i3 == 20 && r13.A02 == 12) {
                A0E2.setEnabled(true);
                A0E2.setOnClickListener(new ViewOnClickCListenerShape0S1500000_I0(context, r13, r14, this, r3, str2, 1));
                A0E.setEnabled(true);
                A0E.setOnClickListener(new ViewOnClickCListenerShape0S1500000_I0(context, r13, r14, this, r3, str2, 0));
                view2.setVisibility(0);
                if (r28 != null) {
                    r7.A03(context, view2, r13);
                    return;
                }
                return;
            } else if (r28 != null && i3 == 40 && ((i2 = r13.A02) == 20 || i2 == 417 || i2 == 418 || i2 == 115)) {
                r7.A02(context, view2, A0E2, A0E, button, r13, r14, str2);
                return;
            }
        } else if (!z2) {
            A0E2.setEnabled(false);
            A0E.setEnabled(false);
            view2.setVisibility(0);
            return;
        }
        view2.setVisibility(8);
    }

    public final void A04(View view, Button button, AnonymousClass1Vt r13, AnonymousClass2SE r14, boolean z2) {
        AnonymousClass1Vt r7 = r13;
        UserJid userJid = r13.A0D;
        View A0E = C004601z.A0E(view, R.id.request_decline_button);
        View A0E2 = C004601z.A0E(view, R.id.request_pay_button);
        if (userJid != null) {
            if (!A06(r13) && !r13.A0P) {
                A0E.setVisibility(8);
                A0E2.setVisibility(8);
                view.setVisibility(8);
                if (z2) {
                    Button button2 = button;
                    if (button != null) {
                        boolean z3 = false;
                        view.setVisibility(0);
                        button.setVisibility(0);
                        if (r13.A02 == 19) {
                            z3 = true;
                        }
                        A05(button, r13, z3);
                        if (r13.A02 != 19) {
                            button.setOnClickListener(new ViewOnClickCListenerShape1S0500000_I0(this, button2, r14, r7, userJid, 1));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
        view.setVisibility(8);
    }

    public final void A05(TextView textView, AnonymousClass1Vt r12, boolean z2) {
        int i2;
        int i3;
        AnonymousClass1Vt r4 = r12;
        if (z2) {
            textView.setText(R.string.str1099);
            textView.setEnabled(false);
            i2 = r12.A02;
            i3 = 19;
        } else {
            textView.setEnabled(true);
            textView.setText(R.string.str1001);
            i2 = r12.A02;
            i3 = 12;
        }
        if (i2 != i3) {
            r12.A02 = i3;
            C18290wS r0 = this.A0B;
            r0.A06();
            r0.A08.A0m(r4, new C28381Vw(r12.A0C, r12.A0L, r12.A0Q), i2, 0, -1);
        }
    }

    public final synchronized boolean A06(AnonymousClass1Vt r6) {
        boolean z2;
        C15830rv r1 = r6.A0C;
        z2 = false;
        if (r1 != null) {
            C16010sH A012 = this.A02.A01(r1);
            if (A012.A0J()) {
                C16070sO r12 = this.A04;
                Class<C16050sL> cls = C16050sL.class;
                C16050sL r0 = (C16050sL) A012.A08(cls);
                AnonymousClass00B.A06(r0);
                if (r12.A09(r0)) {
                    C17240ul r13 = this.A06;
                    C16050sL r02 = (C16050sL) A012.A08(cls);
                    AnonymousClass00B.A06(r02);
                    if (r13.A0g(A012, r02)) {
                        z2 = true;
                    }
                }
            }
        }
        return z2;
    }
}
