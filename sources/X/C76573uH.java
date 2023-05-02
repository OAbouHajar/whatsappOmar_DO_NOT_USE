package X;

/* renamed from: X.3uH  reason: invalid class name and case insensitive filesystem */
public final class C76573uH extends C49262Rz {
    public final String A00;

    public C76573uH(String str) {
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C76573uH) && C18450wi.A0R(this.A00, ((C76573uH) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("Success(taskId=");
        A0r.append(this.A00);
        return AnonymousClass000.A0j(A0r);
    }
}
