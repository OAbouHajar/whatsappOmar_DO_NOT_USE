package X;

import android.os.SystemClock;
import com.obwhatsapp.R;
import java.lang.ref.WeakReference;
import java.util.Collection;

/* renamed from: X.36f  reason: invalid class name and case insensitive filesystem */
public final class C608136f extends C16690tT {
    public final int A00;
    public final int A01 = R.string.str168f;
    public final int A02;
    public final long A03;
    public final long A04;
    public final C14870pt A05;
    public final C19000xb A06;
    public final AnonymousClass11G A07;
    public final AnonymousClass1L1 A08;
    public final WeakReference A09;
    public final Collection A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C608136f(C14550pN r3, C14870pt r4, C19000xb r5, C16440t3 r6, AnonymousClass11G r7, AnonymousClass1L1 r8, Collection collection, int i2, int i3, long j2, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(r3, z4);
        C18450wi.A0L(r3, r6, r4, r7, r5);
        C18450wi.A0H(r8, 6);
        this.A05 = r4;
        this.A07 = r7;
        this.A06 = r5;
        this.A08 = r8;
        this.A00 = i2;
        this.A0A = collection;
        this.A04 = j2;
        this.A0C = z2;
        this.A0D = z3;
        this.A02 = i3;
        this.A0B = z5;
        this.A09 = C13690nt.A0h(r3);
        this.A03 = SystemClock.elapsedRealtime();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (r5 != 2) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r7) {
        /*
            r6 = this;
            X.11G r0 = r6.A07
            int r5 = r6.A00
            java.util.Collection r4 = r6.A0A
            r0.A0F(r4, r5)
            X.1L1 r3 = r6.A08
            X.3qb r2 = new X.3qb
            r2.<init>()
            r1 = 1
            if (r5 == 0) goto L_0x0032
            r0 = 1
            r1 = 3
            if (r5 == r0) goto L_0x0032
            r1 = 2
            if (r5 == r1) goto L_0x0032
        L_0x001a:
            X.0t9 r0 = r3.A09
            r0.A06(r2)
            X.0xb r1 = r6.A06
            com.obwhatsapp.jobqueue.job.SendStatusPrivacyListJob r0 = new com.obwhatsapp.jobqueue.job.SendStatusPrivacyListJob
            r0.<init>(r4, r5)
            r1.A00(r0)
            long r2 = r6.A03
            long r0 = r6.A04
            X.C14550pN.A0y(r2, r0)
            r0 = 0
            return r0
        L_0x0032:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2.A00 = r0
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C608136f.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        C14550pN r4 = (C14550pN) this.A09.get();
        if (r4 != null && !r4.AIm()) {
            if (this.A0C) {
                r4.Ac1();
            }
            int i2 = this.A02;
            if (i2 != -1) {
                this.A05.A09(this.A01, i2);
            }
            if (this.A0D) {
                r4.setResult(-1, C807545j.A00(r4.getIntent()));
            }
            if (this.A0B) {
                r4.finish();
            }
        } else if (this.A0C) {
            this.A05.A05();
        }
    }
}
