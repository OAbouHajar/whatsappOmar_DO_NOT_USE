package X;

import java.util.List;

/* renamed from: X.3lZ  reason: invalid class name and case insensitive filesystem */
public class C72103lZ extends C31301dt {
    public final AnonymousClass4HJ A00;
    public final C16010sH A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public C72103lZ(AnonymousClass4HJ r2, C16010sH r3, String str, String str2, List list) {
        super(AnonymousClass428.A04);
        this.A02 = str;
        this.A03 = str2;
        this.A04 = list;
        this.A01 = r3;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && super.equals(obj)) {
            C72103lZ r4 = (C72103lZ) obj;
            if (this.A02.equals(r4.A02) && this.A03.equals(r4.A03) && this.A04.equals(r4.A04)) {
                return this.A01.equals(r4.A01);
            }
        }
        return false;
    }

    public int hashCode() {
        int A09 = AnonymousClass3K2.A09(this.A02, super.hashCode() * 31);
        return AnonymousClass3K2.A06(this.A01, (AnonymousClass3K2.A09(this.A03, A09) + this.A04.hashCode()) * 31);
    }
}
