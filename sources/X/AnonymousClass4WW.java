package X;

/* renamed from: X.4WW  reason: invalid class name */
public final class AnonymousClass4WW {
    public final long A00;
    public final long A01;
    public final C16200sd A02;
    public final String A03;
    public final String A04;

    public AnonymousClass4WW(C16200sd r1, String str, String str2, long j2, long j3) {
        this.A02 = r1;
        this.A04 = str;
        this.A03 = str2;
        this.A00 = j2;
        this.A01 = j3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass4WW.class != obj.getClass()) {
                return false;
            }
            AnonymousClass4WW r7 = (AnonymousClass4WW) obj;
            if (this.A00 != r7.A00 || this.A01 != r7.A01 || !this.A04.equals(r7.A04) || !this.A03.equals(r7.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.A04;
        objArr[1] = this.A03;
        objArr[2] = Long.valueOf(this.A00);
        return AnonymousClass000.A0F(Long.valueOf(this.A01), objArr, 3);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("FileMetadata{name='");
        char A002 = AnonymousClass3K3.A00(this.A04, A0r);
        A0r.append(", md5Hash='");
        A0r.append(this.A03);
        A0r.append(A002);
        A0r.append(", sizeBytes=");
        A0r.append(this.A00);
        A0r.append(", updateTime=");
        A0r.append(this.A01);
        return AnonymousClass000.A0k(A0r);
    }
}
