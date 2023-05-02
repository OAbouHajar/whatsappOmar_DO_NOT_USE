package X;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;

/* renamed from: X.3mm  reason: invalid class name and case insensitive filesystem */
public class C72833mm extends C87364Wm {
    public final AudioDeviceCallback A00 = new AnonymousClass3LL(this);
    public final AnonymousClass01V A01;

    public /* synthetic */ C72833mm(AnonymousClass01V r2) {
        this.A01 = r2;
    }

    public void A00() {
        AudioManager A0G = this.A01.A0G();
        if (A0G != null) {
            A0G.registerAudioDeviceCallback(this.A00, (Handler) null);
        }
    }

    public void A01() {
        AudioManager A0G = this.A01.A0G();
        if (A0G != null) {
            A0G.unregisterAudioDeviceCallback(this.A00);
        }
    }

    public boolean A03() {
        AudioManager A0G = this.A01.A0G();
        if (A0G != null) {
            for (AudioDeviceInfo type : A0G.getDevices(2)) {
                int type2 = type.getType();
                if (type2 == 4 || type2 == 3 || type2 == 11) {
                    return true;
                }
                if (Build.VERSION.SDK_INT >= 26 && type2 == 22) {
                    return true;
                }
            }
        }
        return false;
    }
}
