package X;

import android.os.Bundle;

/* renamed from: X.3Q6  reason: invalid class name */
public class AnonymousClass3Q6 extends C003401n {
    public C16050sL A00;
    public final AnonymousClass027 A01 = C13690nt.A0O();
    public final C17230uk A02;

    public AnonymousClass3Q6(C17230uk r2) {
        this.A02 = r2;
    }

    public final void A05(int i2) {
        Bundle A0D = C13690nt.A0D();
        A0D.putInt("dialogAction", i2);
        A0D.putParcelable("parentGroupJid", this.A00);
        this.A01.A09(A0D);
    }
}
