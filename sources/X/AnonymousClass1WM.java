package X;

import java.util.Arrays;

/* renamed from: X.1WM  reason: invalid class name */
public final class AnonymousClass1WM {
    public String A00;
    public String A01;

    public AnonymousClass1WM(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass1WM.class != obj.getClass()) {
                return false;
            }
            AnonymousClass1WM r5 = (AnonymousClass1WM) obj;
            if (!this.A01.equals(r5.A01) || !this.A00.equals(r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A00});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BootstrapId{sessionId=");
        sb.append(this.A01);
        sb.append(", mdRegAttemptId=");
        sb.append(this.A00);
        sb.append('}');
        return sb.toString();
    }
}
