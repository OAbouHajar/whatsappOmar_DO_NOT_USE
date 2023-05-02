package X;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* renamed from: X.3LL  reason: invalid class name */
public class AnonymousClass3LL extends AudioDeviceCallback {
    public final /* synthetic */ C72833mm A00;

    public AnonymousClass3LL(C72833mm r1) {
        this.A00 = r1;
    }

    public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.A00.A02();
    }

    public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.A00.A02();
    }
}
