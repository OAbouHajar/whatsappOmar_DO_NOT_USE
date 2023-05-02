package X;

import com.facebook.redex.RunnableRunnableShape8S0200000_I0_6;

/* renamed from: X.1Mt  reason: invalid class name and case insensitive filesystem */
public class C26211Mt extends C206811e {
    public final AnonymousClass01Z A00;
    public final AnonymousClass1CX A01;
    public final C16320sq A02;

    public C26211Mt(AnonymousClass01Z r2, C26231Mv r3, AnonymousClass1CX r4, C16320sq r5) {
        super(r3, 30);
        this.A02 = r5;
        this.A01 = r4;
        this.A00 = r2;
    }

    public void A08(int i2) {
        Object A012 = A01(i2);
        if (A012 instanceof C102814zZ) {
            this.A02.Acl(new RunnableRunnableShape8S0200000_I0_6(this, 29, A012));
        }
        super.A08(i2);
    }

    public /* bridge */ /* synthetic */ void A09(C37891pu r5) {
        C102324yl r52 = (C102324yl) r5;
        super.A09(r52);
        AnonymousClass2V1 r3 = r52.A01;
        if (r3 instanceof C102814zZ) {
            this.A02.Acl(new RunnableRunnableShape8S0200000_I0_6(this, 28, r3));
        }
    }

    /* renamed from: A0A */
    public boolean A07(AnonymousClass2V1 r2) {
        if (r2.A5u()) {
            return super.A07(r2);
        }
        return false;
    }
}
