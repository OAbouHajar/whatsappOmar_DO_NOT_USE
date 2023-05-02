package X;

import java.util.Arrays;

/* renamed from: X.1WF  reason: invalid class name */
public class AnonymousClass1WF {
    public final AnonymousClass1WL A00;
    public final AnonymousClass1WN A01;
    public final String A02;

    public AnonymousClass1WF(AnonymousClass1WL r1, AnonymousClass1WN r2, String str) {
        this.A02 = str;
        this.A01 = r2;
        this.A00 = r1;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        AnonymousClass1WF r4 = (AnonymousClass1WF) obj;
        return r4.A02.equals(this.A02) && r4.A01.equals(this.A01) && r4.A00.equals(this.A00);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A01, this.A00});
    }
}
