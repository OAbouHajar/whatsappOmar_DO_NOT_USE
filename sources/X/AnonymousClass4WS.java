package X;

import java.util.Arrays;

/* renamed from: X.4WS  reason: invalid class name */
public final class AnonymousClass4WS {
    public final String A00;
    public final String A01;
    public final C87254Wa A02;
    public final Object[] A03;

    public AnonymousClass4WS(String str, String str2, C87254Wa r3, Object... objArr) {
        this.A01 = str;
        this.A00 = str2;
        this.A02 = r3;
        this.A03 = objArr;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnonymousClass4WS)) {
            return false;
        }
        AnonymousClass4WS r4 = (AnonymousClass4WS) obj;
        return this.A01.equals(r4.A01) && this.A00.equals(r4.A00) && this.A02.equals(r4.A02) && Arrays.equals(this.A03, r4.A03);
    }

    public int hashCode() {
        return ((this.A01.hashCode() ^ Integer.rotateLeft(this.A00.hashCode(), 8)) ^ Integer.rotateLeft(this.A02.hashCode(), 16)) ^ Integer.rotateLeft(Arrays.hashCode(this.A03), 24);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(this.A01);
        A0o.append(" : ");
        A0o.append(this.A00);
        A0o.append(' ');
        A0o.append(this.A02);
        A0o.append(' ');
        return AnonymousClass000.A0h(Arrays.toString(this.A03), A0o);
    }
}
