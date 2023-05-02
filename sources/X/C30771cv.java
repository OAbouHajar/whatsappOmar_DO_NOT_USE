package X;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.1cv  reason: invalid class name and case insensitive filesystem */
public class C30771cv {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;
    public byte[] A09;
    public byte[] A0A;
    public transient boolean A0B;

    public C30771cv A00() {
        C30771cv r2 = new C30771cv();
        r2.A04 = this.A04;
        r2.A09 = this.A09;
        r2.A02 = this.A02;
        r2.A05 = this.A05;
        r2.A07 = this.A07;
        r2.A08 = false;
        r2.A01 = this.A01;
        r2.A00 = this.A00;
        r2.A0A = this.A0A;
        r2.A03 = this.A03;
        r2.A06 = this.A06;
        return r2;
    }

    public boolean A01() {
        return (this.A09 == null || this.A04 == null || this.A07 == null || this.A05 == null) ? false : true;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C30771cv)) {
            return false;
        }
        C30771cv r7 = (C30771cv) obj;
        return C34901l3.A00(r7.A04, this.A04) && C34901l3.A00(r7.A09, this.A09) && C34901l3.A00(r7.A05, this.A05) && C34901l3.A00(r7.A07, this.A07) && C34901l3.A00(r7.A0A, this.A0A) && C34901l3.A00(r7.A06, this.A06) && r7.A02 == this.A02 && r7.A01 == this.A01 && r7.A00 == this.A00;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A04, this.A09, this.A05, this.A07, this.A0A, Long.valueOf(this.A02), Integer.valueOf(this.A01), Integer.valueOf(this.A00), this.A06});
    }

    public String toString() {
        Locale locale = Locale.US;
        Object[] objArr = new Object[11];
        int i2 = 0;
        objArr[0] = this.A04;
        byte[] bArr = this.A09;
        objArr[1] = Integer.valueOf(bArr != null ? bArr.length : 0);
        objArr[2] = Long.valueOf(this.A02);
        objArr[3] = this.A05;
        objArr[4] = this.A07;
        objArr[5] = Integer.valueOf(this.A01);
        objArr[6] = Integer.valueOf(this.A00);
        objArr[7] = Boolean.valueOf(this.A08);
        byte[] bArr2 = this.A0A;
        if (bArr2 != null) {
            i2 = bArr2.length;
        }
        objArr[8] = Integer.valueOf(i2);
        objArr[9] = Boolean.valueOf(this.A0B);
        objArr[10] = this.A06;
        return String.format(locale, "MmsThumbnailMetadata{directPath=%s, mediaKey.length=%d, mediaKeyTimestampMs=%d, encThumbHash=%s, thumbHash=%s, thumbWidth=%d, thumbHeight=%d, transferred=%b, microThumbnail.length=%d, shouldSendOriginalThumbnail=%b, localFileName=%s}", objArr);
    }
}
