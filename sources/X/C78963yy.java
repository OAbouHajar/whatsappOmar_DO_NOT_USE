package X;

import java.util.Collection;

/* renamed from: X.3yy  reason: invalid class name and case insensitive filesystem */
public class C78963yy extends C16690tT {
    public final int A00 = 200;
    public final C108765Pg A01;
    public final C207111h A02;
    public final boolean A03;
    public final /* synthetic */ AnonymousClass1BP A04;

    public C78963yy(AnonymousClass1BP r2, C108765Pg r3, C207111h r4, boolean z2) {
        this.A04 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = z2;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        String[] strArr = (String[]) objArr;
        AnonymousClass00B.A06(strArr);
        AnonymousClass00B.A0F(C13690nt.A1R(strArr.length));
        return this.A02.A8y(strArr[0], this.A00, this.A03, false);
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        Collection collection = (Collection) obj;
        AnonymousClass1BP r1 = this.A04;
        if (r1.A00 == this) {
            r1.A00 = null;
        }
        if (!C16690tT.A02(this)) {
            this.A01.AWS(collection);
        }
    }
}
