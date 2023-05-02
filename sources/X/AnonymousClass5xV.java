package X;

import android.content.Context;
import android.content.DialogInterface;
import com.facebook.redex.IDxCListenerShape129S0100000_3_I0;
import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.5xV  reason: invalid class name */
public class AnonymousClass5xV {
    public final C14870pt A00;
    public final C16760tb A01;
    public final C16460t6 A02;
    public final C14710pd A03;
    public final C18310wU A04;
    public final C222617g A05;
    public final C16320sq A06;

    public AnonymousClass5xV(C14870pt r1, C16760tb r2, C16460t6 r3, C14710pd r4, C18310wU r5, C222617g r6, C16320sq r7) {
        this.A03 = r4;
        this.A00 = r1;
        this.A06 = r7;
        this.A01 = r2;
        this.A05 = r6;
        this.A02 = r3;
        this.A04 = r5;
    }

    public static final void A00(Context context, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        C32241fu A002 = C32241fu.A00(context);
        A002.A02(R.string.str0f3d);
        A002.A01(R.string.str0f3b);
        A002.setPositiveButton(R.string.str0f3c, onClickListener);
        A002.setNegativeButton(R.string.str13e4, onClickListener2);
        C13690nt.A1G(A002);
    }

    public static final void A01(Context context, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        C32241fu A002 = C32241fu.A00(context);
        A002.A02(R.string.str0f6f);
        A002.A01(R.string.str0f6d);
        A002.setPositiveButton(R.string.str0f6e, onClickListener);
        A002.setNegativeButton(R.string.str13e4, onClickListener2);
        C13690nt.A1G(A002);
    }

    public static final void A02(Context context, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        C32241fu A002 = C32241fu.A00(context);
        A002.A02(R.string.str0fbc);
        A002.A01(R.string.str0fba);
        A002.setPositiveButton(R.string.str0fbb, onClickListener);
        A002.setNegativeButton(R.string.str13e4, onClickListener2);
        C13690nt.A1G(A002);
    }

    public final C30581cc A03(C15830rv r15, UserJid userJid, String str, List list, long j2) {
        C222617g r3 = this.A05;
        C15830rv r5 = r15;
        AnonymousClass00B.A06(r15);
        C30581cc A042 = r3.A04((AnonymousClass1ZR) null, r5, j2 != 0 ? this.A02.A0K.A00(j2) : null, (C30771cv) null, str, list, 0, false, false);
        if (C16030sJ.A0L(r15)) {
            UserJid userJid2 = userJid;
            if (userJid != null) {
                A042.A0b(userJid2);
            }
        }
        return A042;
    }

    public void A04(Context context, C28401Vy r27, C35361lo r28, C15830rv r29, UserJid userJid, C47222Ic r31, C1223769i r32, String str, List list, long j2) {
        C1223769i r9 = r32;
        UserJid userJid2 = userJid;
        r9.Ac1();
        C47222Ic r3 = r31;
        Context context2 = context;
        if (r3.A01 != 5) {
            if (!this.A03.A0C(1084) || r3.A00 != 5) {
                int i2 = r3.A01;
                C28401Vy r5 = r27;
                C15830rv r7 = r29;
                String str2 = str;
                List list2 = list;
                long j3 = j2;
                if (i2 == 1 || i2 == 6 || !A05(r3)) {
                    int i3 = r3.A01;
                    C35361lo r6 = r28;
                    if (i3 != 1 && i3 != 6) {
                        A02(context2, new AnonymousClass5y9(r5, r6, r7, userJid2, r9, this, str2, list2, j3), new IDxCListenerShape129S0100000_3_I0(r9, 4));
                        return;
                    } else if (A05(r3)) {
                        A00(context2, new AnonymousClass5y7(r5, r7, userJid2, r3, r9, this), new IDxCListenerShape129S0100000_3_I0(r9, 3));
                        return;
                    } else {
                        C38641rB r2 = r3.A03;
                        AnonymousClass00B.A06(r2);
                        C18310wU r1 = this.A04;
                        if (!C16030sJ.A0L(r7)) {
                            userJid2 = UserJid.of(r7);
                        }
                        r1.A0K(r5, r6, userJid2, r2);
                        this.A00.A0K(new C1216666j(r3, r9, this, r2));
                        return;
                    }
                } else {
                    A01(context2, new AnonymousClass5y8(r5, r7, userJid2, r9, this, str2, list2, j3), new IDxCListenerShape129S0100000_3_I0(r9, 2));
                    return;
                }
            }
        }
        C32241fu A002 = C32241fu.A00(context2);
        boolean A022 = C18260wP.A02(context2);
        int i4 = R.string.str0dc2;
        if (A022) {
            i4 = R.string.str0dc3;
        }
        A002.A01(i4);
        C13690nt.A1F(A002);
        C13690nt.A1G(A002);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r1 = r4.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A05(X.C47222Ic r4) {
        /*
            r3 = this;
            X.0pd r1 = r3.A03
            r0 = 1084(0x43c, float:1.519E-42)
            boolean r0 = r1.A0C(r0)
            r2 = 1
            if (r0 == 0) goto L_0x0013
            int r1 = r4.A00
            r0 = 7
            if (r1 == r0) goto L_0x0013
            if (r1 == r2) goto L_0x0013
            return r2
        L_0x0013:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5xV.A05(X.2Ic):boolean");
    }
}
