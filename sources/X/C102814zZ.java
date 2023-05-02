package X;

import android.content.Context;
import com.obwhatsapp.R;

/* renamed from: X.4zZ  reason: invalid class name and case insensitive filesystem */
public class C102814zZ implements AnonymousClass2V1 {
    public final C34151jm A00;
    public final AnonymousClass1MF A01;

    public C102814zZ(C34151jm r1, AnonymousClass1MF r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public boolean A5u() {
        return true;
    }

    public C455829l A7b(Context context, AnonymousClass013 r6, boolean z2) {
        int i2 = R.dimen.dimen0338;
        if (z2) {
            i2 = R.dimen.dimen0337;
        }
        AnonymousClass00B.A00();
        return new C605232r(context, this.A00, this.A01, context.getResources().getDimensionPixelSize(i2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.A09;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C37781pj[] ABx() {
        /*
            r1 = this;
            X.1jm r0 = r1.A00
            X.1XO r0 = r0.A04
            if (r0 == 0) goto L_0x000a
            X.1pj[] r0 = r0.A09
            if (r0 != 0) goto L_0x000c
        L_0x000a:
            X.1pj[] r0 = X.AnonymousClass2V1.A00
        L_0x000c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C102814zZ.ABx():X.1pj[]");
    }

    public String AGT() {
        StringBuilder A0r = AnonymousClass000.A0r("StickerShapeCreator:");
        String str = this.A00.A0D;
        AnonymousClass00B.A06(str);
        return AnonymousClass000.A0h(str, A0r);
    }

    public boolean AcK() {
        return true;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C102814zZ)) {
            return false;
        }
        String str = ((C102814zZ) obj).A00.A0D;
        AnonymousClass00B.A06(str);
        return str.equals(this.A00.A0D);
    }

    public int hashCode() {
        String str = this.A00.A0D;
        AnonymousClass00B.A06(str);
        return str.hashCode();
    }
}
