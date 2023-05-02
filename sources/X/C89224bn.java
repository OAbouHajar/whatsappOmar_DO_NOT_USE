package X;

import java.util.Arrays;

/* renamed from: X.4bn  reason: invalid class name and case insensitive filesystem */
public final class C89224bn {
    public static final C89224bn A03 = new C89224bn(new long[0]);
    public final int A00;
    public final long[] A01;
    public final AnonymousClass4UD[] A02;

    public C89224bn(long[] jArr) {
        this.A01 = jArr;
        int length = jArr.length;
        this.A00 = length;
        AnonymousClass4UD[] r2 = new AnonymousClass4UD[length];
        for (int i2 = 0; i2 < length; i2++) {
            r2[i2] = new AnonymousClass4UD();
        }
        this.A02 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C89224bn.class != obj.getClass()) {
                return false;
            }
            C89224bn r5 = (C89224bn) obj;
            if (!AnonymousClass3C1.A0F((Object) null, (Object) null) || this.A00 != r5.A00 || !Arrays.equals(this.A01, r5.A01) || !Arrays.equals(this.A02, r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((((((this.A00 * 31 * 31) + ((int) 0)) * 31) + ((int) -9223372036854775807L)) * 31) + Arrays.hashCode(this.A01)) * 31) + Arrays.hashCode(this.A02);
    }

    public String toString() {
        char c2;
        StringBuilder A0r = AnonymousClass000.A0r("AdPlaybackState(adsId=");
        A0r.append((Object) null);
        A0r.append(", adResumePositionUs=");
        A0r.append(0);
        A0r.append(", adGroups=[");
        int i2 = 0;
        while (true) {
            AnonymousClass4UD[] r6 = this.A02;
            int length = r6.length;
            if (i2 >= length) {
                return AnonymousClass000.A0h("])", A0r);
            }
            A0r.append("adGroup(timeUs=");
            A0r.append(this.A01[i2]);
            A0r.append(", ads=[");
            for (int i3 = 0; i3 < r6[i2].A00.length; i3++) {
                A0r.append("ad(state=");
                int i4 = r6[i2].A00[i3];
                if (i4 != 0) {
                    c2 = 'R';
                    if (i4 != 1) {
                        c2 = 'S';
                        if (i4 != 2) {
                            c2 = 'P';
                            if (i4 != 3) {
                                c2 = '!';
                                if (i4 != 4) {
                                    c2 = '?';
                                }
                            }
                        }
                    }
                } else {
                    c2 = '_';
                }
                A0r.append(c2);
                A0r.append(", durationUs=");
                AnonymousClass4UD r2 = r6[i2];
                A0r.append(r2.A01[i3]);
                A0r.append(')');
                if (i3 < r2.A00.length - 1) {
                    A0r.append(", ");
                }
            }
            A0r.append("])");
            if (i2 < length - 1) {
                A0r.append(", ");
            }
            i2++;
        }
    }
}
