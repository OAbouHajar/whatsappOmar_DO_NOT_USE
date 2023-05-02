package X;

import org.apache.commons.io.FilenameUtils;

/* renamed from: X.4Wa  reason: invalid class name and case insensitive filesystem */
public final class C87254Wa {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public C87254Wa(String str, String str2, String str3, int i2, boolean z2) {
        this.A00 = i2;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A04 = z2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C87254Wa)) {
            return false;
        }
        C87254Wa r4 = (C87254Wa) obj;
        return this.A00 == r4.A00 && this.A04 == r4.A04 && this.A03.equals(r4.A03) && this.A02.equals(r4.A02) && this.A01.equals(r4.A01);
    }

    public int hashCode() {
        int i2 = this.A00;
        int i3 = 0;
        if (this.A04) {
            i3 = 64;
        }
        return i2 + i3 + (this.A03.hashCode() * this.A02.hashCode() * this.A01.hashCode());
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(this.A03);
        A0o.append(FilenameUtils.EXTENSION_SEPARATOR);
        A0o.append(this.A02);
        A0o.append(this.A01);
        A0o.append(" (");
        A0o.append(this.A00);
        A0o.append(this.A04 ? " itf" : "");
        return AnonymousClass000.A0j(A0o);
    }
}
