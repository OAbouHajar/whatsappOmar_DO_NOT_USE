package X;

import java.util.Arrays;

/* renamed from: X.2Dp  reason: invalid class name */
public class AnonymousClass2Dp extends AnonymousClass2Dq {
    public final C46312Dn A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public AnonymousClass2Dp(C46312Dn r1, String str, String str2, String str3, String str4, String str5) {
        super(str4);
        this.A04 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A01 = str5;
        this.A00 = r1;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass2Dp r5 = (AnonymousClass2Dp) obj;
            if (!this.A04.equals(r5.A04) || !this.A03.equals(r5.A03) || !this.A02.equals(r5.A02) || !this.A01.equals(r5.A01) || !this.A00.equals(r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A04, this.A03, this.A02, this.A01, this.A00});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UserNoticeBanner{text='");
        sb.append(this.A04);
        sb.append('\'');
        sb.append(", lightUrl='");
        sb.append(this.A03);
        sb.append('\'');
        sb.append(", lightIconFile='");
        sb.append(this.A01);
        sb.append('\'');
        sb.append(", darkUrl='");
        sb.append(this.A02);
        sb.append('\'');
        sb.append(", darkIconFile='");
        sb.append(this.A00);
        sb.append('\'');
        sb.append(", iconDescription='");
        sb.append(this.A02);
        sb.append('\'');
        sb.append(", action='");
        sb.append(this.A01);
        sb.append('\'');
        sb.append(", timing=");
        sb.append(this.A00);
        sb.append('}');
        return sb.toString();
    }
}
