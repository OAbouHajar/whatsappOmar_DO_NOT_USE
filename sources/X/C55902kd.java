package X;

import android.graphics.Bitmap;
import java.util.Arrays;

/* renamed from: X.2kd  reason: invalid class name and case insensitive filesystem */
public class C55902kd {
    public Bitmap A00;
    public C16010sH A01;
    public String A02;
    public boolean A03;
    public final long A04;
    public final String A05;
    public final String A06;

    public C55902kd(String str, String str2, long j2) {
        this.A06 = str;
        this.A04 = j2;
        this.A05 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C55902kd) && this.A04 == ((C55902kd) obj).A04;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.A04)});
    }
}
