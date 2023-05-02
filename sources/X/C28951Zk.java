package X;

import java.util.Arrays;

/* renamed from: X.1Zk  reason: invalid class name and case insensitive filesystem */
public class C28951Zk {
    public final long A00;
    public final String A01;
    public final String A02;

    public C28951Zk(String str, String str2, long j2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = j2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C28951Zk)) {
            return false;
        }
        C28951Zk r7 = (C28951Zk) obj;
        return this.A00 == r7.A00 && C34901l3.A00(this.A02, r7.A02) && C34901l3.A00(this.A01, r7.A01);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A02, Long.valueOf(this.A00)});
    }
}
