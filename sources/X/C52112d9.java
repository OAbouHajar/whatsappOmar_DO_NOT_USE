package X;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2d9  reason: invalid class name and case insensitive filesystem */
public final class C52112d9 {
    public static List A00(AudioManager audioManager) {
        ArrayList arrayList = new ArrayList();
        if (audioManager != null) {
            ArrayList arrayList2 = new ArrayList();
            for (AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(2)) {
                if (A01(audioDeviceInfo)) {
                    arrayList.add(audioDeviceInfo);
                }
                arrayList2.add(Integer.valueOf(audioDeviceInfo.getType()));
            }
            StringBuilder sb = new StringBuilder("BluetoothHeadsetDetector/getConnectedBluetoothHeadsets output device types: ");
            sb.append(arrayList2);
            Log.i(sb.toString());
        }
        return arrayList;
    }

    public static boolean A01(AudioDeviceInfo audioDeviceInfo) {
        int type = audioDeviceInfo.getType();
        return type == 7 || type == 26;
    }
}
