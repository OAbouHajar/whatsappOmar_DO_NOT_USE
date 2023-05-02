package X;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* renamed from: X.4pR  reason: invalid class name and case insensitive filesystem */
public final class C97124pR implements C109605Su {
    public MediaCodecInfo[] A00;
    public final int A01;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        if (r3 != false) goto L_0x0008;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C97124pR(boolean r2, boolean r3) {
        /*
            r1 = this;
            r1.<init>()
            if (r2 != 0) goto L_0x0008
            r0 = 0
            if (r3 == 0) goto L_0x0009
        L_0x0008:
            r0 = 1
        L_0x0009:
            r1.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C97124pR.<init>(boolean, boolean):void");
    }

    public int AAg() {
        MediaCodecInfo[] mediaCodecInfoArr = this.A00;
        if (mediaCodecInfoArr == null) {
            mediaCodecInfoArr = new MediaCodecList(this.A01).getCodecInfos();
            this.A00 = mediaCodecInfoArr;
        }
        return mediaCodecInfoArr.length;
    }

    public MediaCodecInfo AAh(int i2) {
        MediaCodecInfo[] mediaCodecInfoArr = this.A00;
        if (mediaCodecInfoArr == null) {
            mediaCodecInfoArr = new MediaCodecList(this.A01).getCodecInfos();
            this.A00 = mediaCodecInfoArr;
        }
        return mediaCodecInfoArr[i2];
    }

    public boolean AIn(MediaCodecInfo.CodecCapabilities codecCapabilities, String str, String str2) {
        return codecCapabilities.isFeatureRequired(str);
    }

    public boolean AIo(MediaCodecInfo.CodecCapabilities codecCapabilities, String str, String str2) {
        return codecCapabilities.isFeatureSupported(str);
    }

    public boolean AdA() {
        return true;
    }
}
