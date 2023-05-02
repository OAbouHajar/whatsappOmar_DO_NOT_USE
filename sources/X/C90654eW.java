package X;

import android.util.Log;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.4eW  reason: invalid class name and case insensitive filesystem */
public final class C90654eW {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final long A09;
    public final AnonymousClass4G8 A0A;
    public final C93724jf A0B;

    public C90654eW(AnonymousClass4G8 r3, C93724jf r4, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2) {
        this.A05 = i2;
        this.A03 = i3;
        this.A06 = i4;
        this.A04 = i5;
        this.A07 = i6;
        this.A08 = A00(i6);
        this.A02 = i7;
        this.A00 = i8;
        int i9 = 1;
        if (i8 != 8) {
            i9 = 2;
            if (i8 != 12) {
                i9 = 4;
                if (i8 != 16) {
                    i9 = 5;
                    if (i8 != 20) {
                        i9 = 6;
                        if (i8 != 24) {
                            i9 = -1;
                        }
                    }
                }
            }
        }
        this.A01 = i9;
        this.A09 = j2;
        this.A0A = r3;
        this.A0B = r4;
    }

    public C90654eW(byte[] bArr, int i2) {
        C90204dh r3 = new C90204dh(bArr, bArr.length);
        r3.A07(i2 << 3);
        this.A05 = r3.A04(16);
        this.A03 = r3.A04(16);
        this.A06 = r3.A04(24);
        this.A04 = r3.A04(24);
        int A042 = r3.A04(20);
        this.A07 = A042;
        this.A08 = A00(A042);
        this.A02 = r3.A04(3) + 1;
        int A043 = r3.A04(5) + 1;
        this.A00 = A043;
        int i3 = 1;
        if (A043 != 8) {
            i3 = 2;
            if (A043 != 12) {
                i3 = 4;
                if (A043 != 16) {
                    i3 = 5;
                    if (A043 != 20) {
                        i3 = 6;
                        if (A043 != 24) {
                            i3 = -1;
                        }
                    }
                }
            }
        }
        this.A01 = i3;
        this.A09 = AnonymousClass3K3.A0Q(r3.A04(4), r3.A04(32));
        this.A0A = null;
        this.A0B = null;
    }

    public static int A00(int i2) {
        switch (i2) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public static C93724jf A01(List list, List list2) {
        if (!list.isEmpty() || !list2.isEmpty()) {
            ArrayList A0u = AnonymousClass000.A0u();
            for (int i2 = 0; i2 < list.size(); i2++) {
                String A0n = AnonymousClass000.A0n(list, i2);
                String[] split = A0n.split("=", 2);
                if (split.length != 2) {
                    Log.w("FlacStreamMetadata", AnonymousClass000.A0h(A0n, AnonymousClass000.A0r("Failed to parse Vorbis comment: ")));
                } else {
                    A0u.add(new C97174pW(split[0], split[1]));
                }
            }
            A0u.addAll(list2);
            if (!A0u.isEmpty()) {
                return new C93724jf((List) A0u);
            }
        }
        return null;
    }

    public long A02() {
        long j2 = this.A09;
        if (j2 == 0) {
            return -9223372036854775807L;
        }
        return (j2 * SearchActionVerificationClientService.MS_TO_NS) / ((long) this.A07);
    }

    public C32491gT A03(C93724jf r4, byte[] bArr) {
        bArr[4] = Byte.MIN_VALUE;
        int i2 = this.A04;
        if (i2 <= 0) {
            i2 = -1;
        }
        C93724jf r0 = this.A0B;
        if (r0 != null) {
            r4 = r0.A00(r4);
        }
        C32471gR A0N = AnonymousClass3K4.A0N();
        A0N.A0R = "audio/flac";
        A0N.A08 = i2;
        A0N.A04 = this.A02;
        A0N.A0D = this.A07;
        A0N.A0S = Collections.singletonList(bArr);
        A0N.A0J = r4;
        return new C32491gT(A0N);
    }

    public C90654eW A04(AnonymousClass4G8 r13) {
        return new C90654eW(r13, this.A0B, this.A05, this.A03, this.A06, this.A04, this.A07, this.A02, this.A00, this.A09);
    }
}
