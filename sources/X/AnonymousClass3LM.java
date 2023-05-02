package X;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* renamed from: X.3LM  reason: invalid class name */
public class AnonymousClass3LM extends AudioDeviceCallback {
    public final /* synthetic */ AnonymousClass1B1 A00;

    public AnonymousClass3LM(AnonymousClass1B1 r1) {
        this.A00 = r1;
    }

    public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        for (AudioDeviceInfo A01 : audioDeviceInfoArr) {
            if (C52112d9.A01(A01)) {
                this.A00.A03(2);
                return;
            }
        }
    }

    public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        for (AudioDeviceInfo A01 : audioDeviceInfoArr) {
            if (C52112d9.A01(A01)) {
                this.A00.A03(0);
                return;
            }
        }
    }
}
