package X;

import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioDeviceInfo;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.2nD  reason: invalid class name and case insensitive filesystem */
public class C56282nD extends BroadcastReceiver {
    public final Object A00 = C13690nt.A0Y();
    public volatile boolean A01 = false;
    public final /* synthetic */ AnonymousClass26Z A02;

    public C56282nD(AnonymousClass26Z r2) {
        this.A02 = r2;
    }

    public static final String A00(int i2) {
        return i2 != -1 ? i2 != 0 ? i2 != 1 ? i2 != 2 ? "UNKNOWN BLUETOOTH SCO STATE" : "CONNECTING" : "CONNECTED" : "DISCONNECTED" : "ERROR";
    }

    public void onReceive(Context context, Intent intent) {
        if (!this.A01) {
            synchronized (this.A00) {
                if (!this.A01) {
                    AnonymousClass2IF.A01(context);
                    this.A01 = true;
                }
            }
        }
        AnonymousClass00B.A01();
        if ("android.media.ACTION_SCO_AUDIO_STATE_UPDATED".equals(intent.getAction())) {
            AnonymousClass26Z r3 = this.A02;
            int i2 = r3.A01;
            int intExtra = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1);
            r3.A01 = intExtra;
            StringBuilder A0r = AnonymousClass000.A0r("voip/audio_route/bluetoothScoReceiver/ACTION_SCO_AUDIO_STATE_UPDATED [");
            A0r.append(A00(i2));
            A0r.append(" -> ");
            A0r.append(A00(intExtra));
            Log.i(AnonymousClass000.A0h("]", A0r));
            CallInfo callInfo = Voip.getCallInfo();
            int i3 = r3.A01;
            if (i3 == 0) {
                if (i2 == 2 || i2 == 1) {
                    r3.A08(callInfo, false);
                    r3.A06(callInfo, (Boolean) null);
                }
            } else if (i3 == 1) {
                if (C15450qv.A0A()) {
                    for (AudioDeviceInfo audioDeviceInfo : C52112d9.A00(r3.A0E.A0G())) {
                        StringBuilder A0q = AnonymousClass000.A0q("voip/audio_route/bluetoothScoReceiver device name: ");
                        A0q.append(audioDeviceInfo.getProductName());
                        A0q.append(", type: ");
                        A0q.append(audioDeviceInfo.getType());
                        A0q.append(", address: ");
                        Log.i(AnonymousClass000.A0h(audioDeviceInfo.getAddress(), A0q));
                    }
                } else {
                    BluetoothHeadset bluetoothHeadset = r3.A0G.A01;
                    if (bluetoothHeadset != null) {
                        for (BluetoothDevice next : bluetoothHeadset.getConnectedDevices()) {
                            if (bluetoothHeadset.isAudioConnected(next)) {
                                BluetoothClass bluetoothClass = next.getBluetoothClass();
                                StringBuilder A0q2 = AnonymousClass000.A0q("voip/audio_route/bluetoothScoReceiver device name: ");
                                A0q2.append(next.getName());
                                A0q2.append(", device class:");
                                A0q2.append(bluetoothClass.getDeviceClass());
                                A0q2.append(", major class: ");
                                A0q2.append(bluetoothClass.getMajorDeviceClass());
                                A0q2.append(", supports AUDIO: ");
                                A0q2.append(bluetoothClass.hasService(AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_END));
                                A0q2.append(", supports TELEPHONY: ");
                                A0q2.append(bluetoothClass.hasService(4194304));
                                A0q2.append(", address: ");
                                Log.i(AnonymousClass000.A0h(next.getAddress(), A0q2));
                            }
                        }
                    }
                }
            }
            r3.A07(callInfo, (Boolean) null);
        }
    }
}
