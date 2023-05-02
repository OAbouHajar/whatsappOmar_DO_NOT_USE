package X;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* renamed from: X.4pQ  reason: invalid class name and case insensitive filesystem */
public final class C97114pQ implements C109605Su {
    public int AAg() {
        return MediaCodecList.getCodecCount();
    }

    public MediaCodecInfo AAh(int i2) {
        return MediaCodecList.getCodecInfoAt(i2);
    }

    public boolean AIn(MediaCodecInfo.CodecCapabilities codecCapabilities, String str, String str2) {
        return false;
    }

    public boolean AIo(MediaCodecInfo.CodecCapabilities codecCapabilities, String str, String str2) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    public boolean AdA() {
        return false;
    }
}
