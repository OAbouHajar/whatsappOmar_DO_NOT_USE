package X;

import com.obwhatsapp.R;

/* renamed from: X.34w  reason: invalid class name and case insensitive filesystem */
public class C606834w extends C606934x {
    public float A00;
    public int A01;
    public int A02 = 3;
    public int A03;
    public int A04;

    public C606834w(C19980zJ r3, C16180sb r4, C14870pt r5, C15900s5 r6, AnonymousClass01V r7, AnonymousClass013 r8, C17250um r9, C14710pd r10, AnonymousClass1P7 r11, AnonymousClass1P8 r12, C16740tZ r13, AnonymousClass4Ta r14, AnonymousClass1PA r15, AnonymousClass1MF r16, C25791Ld r17, C16320sq r18, AnonymousClass1P9 r19) {
        super(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19);
        this.A09.setId(R.id.status_playback_gif);
    }

    public long A08() {
        int i2 = this.A02;
        if (i2 > 0) {
            return (long) (i2 * this.A03);
        }
        long A08 = super.A08();
        return ((long) A0J(A08)) * A08;
    }

    public void A09() {
        this.A04 = 0;
        this.A01 = 0;
        this.A00 = 0.0f;
        super.A09();
        AnonymousClass29D r1 = this.A02;
        if (r1 != null) {
            r1.A01 = new AnonymousClass536(this);
        }
    }

    public void A0A() {
        AnonymousClass29D r1 = this.A02;
        if (r1 != null) {
            r1.A01 = null;
        }
        super.A0A();
    }

    public final int A0J(long j2) {
        if (this.A02 instanceof C79193zM) {
            return 1;
        }
        if (j2 == 0) {
            return 3;
        }
        return (int) Math.max(3, 6000 / j2);
    }
}
