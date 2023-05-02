package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2zA  reason: invalid class name and case insensitive filesystem */
public class C59872zA extends AnonymousClass2XU implements C32201fo {
    public final AnonymousClass4D4 A00;
    public final C108585Oo A01;
    public final AnonymousClass5RY A02;
    public final String A03;
    public final String A04;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C59872zA(X.C19980zJ r14, X.C14870pt r15, X.C16040sK r16, X.C17170ue r17, X.AnonymousClass1KA r18, X.AnonymousClass4D4 r19, X.C50262Yq r20, X.C108585Oo r21, X.AnonymousClass5RY r22, X.C16000sG r23, X.C17030uP r24, X.C16080sP r25, X.AnonymousClass013 r26, com.whatsapp.jid.UserJid r27, java.lang.String r28, java.lang.String r29) {
        /*
            r13 = this;
            r10 = r25
            r9 = r24
            r8 = r23
            r4 = r16
            r3 = r15
            r12 = r27
            r2 = r14
            r11 = r26
            r1 = r13
            r5 = r17
            r6 = r18
            r7 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = r22
            r13.A02 = r0
            r0 = r21
            r13.A01 = r0
            r0 = r19
            r13.A00 = r0
            r0 = r29
            r13.A03 = r0
            r0 = r28
            r13.A04 = r0
            r13.A0J()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59872zA.<init>(X.0zJ, X.0pt, X.0sK, X.0ue, X.1KA, X.4D4, X.2Yq, X.5Oo, X.5RY, X.0sG, X.0uP, X.0sP, X.013, com.whatsapp.jid.UserJid, java.lang.String, java.lang.String):void");
    }

    public C65123Sy A0F(ViewGroup viewGroup, int i2) {
        if (i2 != 5) {
            return super.A0F(viewGroup, i2);
        }
        Context context = viewGroup.getContext();
        UserJid userJid = this.A05;
        C16040sK r2 = this.A02;
        AnonymousClass013 r10 = this.A05;
        C50262Yq r5 = this.A04;
        C17170ue r3 = this.A01;
        AnonymousClass5RY r9 = this.A02;
        C108585Oo r8 = this.A01;
        AnonymousClass4D4 r4 = this.A00;
        View A0H = C13680ns.A0H(LayoutInflater.from(context), viewGroup, R.layout.layout00c1);
        AnonymousClass2JP.A02(A0H);
        return new C59652yh(A0H, r2, r3, r4, r5, this, this, r8, r9, r10, userJid);
    }

    public AnonymousClass4K6 AAj(int i2) {
        if (C13690nt.A0Z(this.A00) instanceof C71543kb) {
            i2--;
        }
        String valueOf = String.valueOf(i2);
        String str = this.A04;
        return new AnonymousClass4K6(str, valueOf, str == null ? null : this.A03);
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        return A0F(viewGroup, i2);
    }
}
