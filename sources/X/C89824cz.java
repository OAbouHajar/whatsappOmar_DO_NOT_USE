package X;

import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.4cz  reason: invalid class name and case insensitive filesystem */
public final class C89824cz {
    public static final int[] A00 = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] A01 = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] A02 = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final int[] A03 = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};
    public static final int[] A04 = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    public static final int[] A05 = {44100, 48000, 32000};
    public static final String[] A06 = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    public static int A00(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if (!AnonymousClass000.A1R(i2 & -2097152, -2097152) || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return -1;
        }
        int i9 = A05[i6];
        if (i3 == 2) {
            i9 >>= 1;
        } else if (i3 == 0) {
            i9 >>= 2;
        }
        int i10 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            return ((((i3 == 3 ? A00 : A04)[i5 - 1] * 12) / i9) + i10) << 2;
        }
        if (i3 == 3) {
            i7 = (i4 == 2 ? A01 : A02)[i5 - 1];
        } else {
            i7 = A03[i5 - 1];
            int i11 = MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT;
            if (i3 != 3) {
                if (i4 == 1) {
                    i11 = 72;
                }
                i8 = i11 * i7;
                return (i8 / i9) + i10;
            }
        }
        i8 = i7 * MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT;
        return (i8 / i9) + i10;
    }

    public static int A01(int i2) {
        int i3;
        int i4;
        if (!(!AnonymousClass000.A1R(i2 & -2097152, -2097152) || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0)) {
            int i5 = (i2 >>> 12) & 15;
            int i6 = (i2 >>> 10) & 3;
            if (!(i5 == 0 || i5 == 15 || i6 == 3)) {
                if (i4 == 1) {
                    return i3 != 3 ? 576 : 1152;
                }
                if (i4 == 2) {
                    return 1152;
                }
                if (i4 == 3) {
                    return 384;
                }
                throw AnonymousClass3K3.A0f();
            }
        }
        return -1;
    }
}
