package X;

import com.facebook.redex.RunnableRunnableShape7S0200000_I0_5;
import com.whatsapp.util.Log;

/* renamed from: X.19A  reason: invalid class name */
public class AnonymousClass19A {
    public final AnonymousClass126 A00;
    public final C16820th A01;
    public final C16920ts A02;
    public final C15810rt A03;
    public final AnonymousClass17G A04;
    public final AnonymousClass0y0 A05;
    public final C19650ym A06;
    public final C16900tq A07;
    public final AnonymousClass11G A08;
    public final C19790z0 A09;

    public AnonymousClass19A(AnonymousClass126 r1, C16820th r2, C16920ts r3, C15810rt r4, AnonymousClass17G r5, AnonymousClass0y0 r6, C19650ym r7, C16900tq r8, AnonymousClass11G r9, C19790z0 r10) {
        this.A02 = r3;
        this.A03 = r4;
        this.A08 = r9;
        this.A04 = r5;
        this.A09 = r10;
        this.A00 = r1;
        this.A01 = r2;
        this.A05 = r6;
        this.A07 = r8;
        this.A06 = r7;
    }

    public void A00(C15830rv r5, long j2, long j3) {
        StringBuilder sb = new StringBuilder("msgstore/setchatreadreceiptssent/");
        sb.append(r5);
        sb.append(" ");
        sb.append(j3);
        Log.i(sb.toString());
        C15840rx A062 = this.A03.A06(r5);
        if (A062 == null) {
            StringBuilder sb2 = new StringBuilder("msgstore/setchatreadreceiptssent/no chat for ");
            sb2.append(r5);
            Log.w(sb2.toString());
        } else if (j3 > A062.A0Q) {
            A062.A0P = j2;
            A062.A0Q = j3;
            this.A00.A01(new RunnableRunnableShape7S0200000_I0_5(this, 0, A062), 43);
        }
    }
}
