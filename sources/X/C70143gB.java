package X;

import java.time.OffsetDateTime;

/* renamed from: X.3gB  reason: invalid class name and case insensitive filesystem */
public class C70143gB extends C89494cI {
    public final OffsetDateTime A00;

    public C70143gB(CharSequence charSequence) {
        this.A00 = OffsetDateTime.parse(charSequence);
    }

    public C70133gA A05() {
        return new C70133gA(this.A00.toString(), false);
    }

    public OffsetDateTime A07() {
        return this.A00;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C70143gB) && !(obj instanceof C70133gA)) {
            return false;
        }
        return this.A00.compareTo(((C89494cI) obj).A04().A00) == 0;
    }

    public String toString() {
        return this.A00.toString();
    }
}
