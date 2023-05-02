package X;

/* renamed from: X.4WM  reason: invalid class name */
public final class AnonymousClass4WM {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public AnonymousClass4WM(String str, String str2, String str3, int i2) {
        this.A00 = i2;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4WM) {
                AnonymousClass4WM r5 = (AnonymousClass4WM) obj;
                if (this.A00 != r5.A00 || !C18450wi.A0R(this.A03, r5.A03) || !C18450wi.A0R(this.A02, r5.A02) || !C18450wi.A0R(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i2 = 0;
        int A0G = ((((this.A00 * 31) + AnonymousClass000.A0G(this.A03)) * 31) + AnonymousClass000.A0G(this.A02)) * 31;
        String str = this.A01;
        if (str != null) {
            i2 = str.hashCode();
        }
        return A0G + i2;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("ScreenshotUploadResult(result=");
        A0r.append(this.A00);
        A0r.append(", uploadUrl=");
        A0r.append(this.A03);
        A0r.append(", iv=");
        A0r.append(this.A02);
        A0r.append(", cipherKey=");
        return AnonymousClass3K2.A0k(this.A01, A0r);
    }
}
