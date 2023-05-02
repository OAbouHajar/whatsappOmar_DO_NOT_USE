package X;

import android.media.MediaCodecInfo;

/* renamed from: X.4Mn  reason: invalid class name and case insensitive filesystem */
public class C84954Mn {
    public final int A00;
    public final MediaCodecInfo.VideoCapabilities A01;
    public final String A02;
    public final MediaCodecInfo.CodecProfileLevel[] A03;

    public C84954Mn(MediaCodecInfo.VideoCapabilities videoCapabilities, String str, MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr, int i2) {
        this.A02 = str;
        this.A00 = i2;
        this.A01 = videoCapabilities;
        this.A03 = codecProfileLevelArr;
    }
}
