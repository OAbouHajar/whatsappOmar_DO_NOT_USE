package X;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Handler;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1B1  reason: invalid class name */
public class AnonymousClass1B1 extends BroadcastReceiver implements C19400yN, BluetoothProfile.ServiceListener {
    public int A00 = -1;
    public BluetoothHeadset A01;
    public AudioDeviceCallback A02;
    public WeakReference A03;
    public final Context A04;
    public final AnonymousClass01V A05;
    public final Set A06 = Collections.newSetFromMap(new ConcurrentHashMap());

    public AnonymousClass1B1(Context context, AnonymousClass01V r3) {
        this.A04 = context;
        this.A05 = r3;
    }

    public static String A00(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? "UNKNOWN BLUETOOTH CONNECTION STATE" : "DISCONNECTING" : "CONNECTED" : "CONNECTING" : "DISCONNECTED";
    }

    public static List A01(AudioManager audioManager) {
        List<AudioDeviceInfo> A002 = C52112d9.A00(audioManager);
        ArrayList arrayList = new ArrayList();
        for (AudioDeviceInfo address : A002) {
            arrayList.add(address.getAddress());
        }
        return arrayList;
    }

    public final void A02() {
        this.A02 = new AnonymousClass3LM(this);
    }

    public final void A03(int i2) {
        if (this.A00 != i2) {
            this.A00 = i2;
            for (C448826a ANj : this.A06) {
                ANj.ANj(i2);
            }
        }
    }

    public void A04(C448826a r5) {
        Set set = this.A06;
        if (set.isEmpty()) {
            if (C15450qv.A0A()) {
                AudioManager A0G = this.A05.A0G();
                if (A0G != null) {
                    A02();
                    AudioDeviceCallback audioDeviceCallback = this.A02;
                    AnonymousClass00B.A06(audioDeviceCallback);
                    A0G.registerAudioDeviceCallback(audioDeviceCallback, (Handler) null);
                }
            } else {
                this.A04.registerReceiver(this, new IntentFilter("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED"));
            }
        }
        set.add(r5);
    }

    public void A05(C448826a r3) {
        Set set = this.A06;
        if (set.remove(r3) && set.isEmpty()) {
            if (C15450qv.A0A()) {
                AudioManager A0G = this.A05.A0G();
                if (A0G != null) {
                    AudioDeviceCallback audioDeviceCallback = this.A02;
                    AnonymousClass00B.A06(audioDeviceCallback);
                    A0G.unregisterAudioDeviceCallback(audioDeviceCallback);
                    return;
                }
                return;
            }
            this.A04.unregisterReceiver(this);
        }
    }

    public String AGT() {
        return "BluetoothHeadsetMonitor";
    }

    public void AMc() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            try {
                defaultAdapter.getProfileProxy(this.A04, this, 1);
            } catch (Exception e2) {
                Log.e((Throwable) e2);
            }
        } else {
            Log.e("BluetoothHeadsetMonitor/init failed to get bluetoothAdapter");
        }
    }

    public void onReceive(Context context, Intent intent) {
        if ("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
            int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
            int intExtra2 = intent.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", 0);
            StringBuilder sb = new StringBuilder("BluetoothHeadsetMonitor/bluetoothConnectionReceiver [");
            sb.append(A00(intExtra2));
            sb.append(" -> ");
            sb.append(A00(intExtra));
            sb.append("]");
            Log.i(sb.toString());
            if (intExtra != intExtra2) {
                A03(intExtra);
            }
        }
    }

    public void onServiceConnected(int i2, BluetoothProfile bluetoothProfile) {
        AnonymousClass26Z r3;
        if (i2 == 1) {
            BluetoothHeadset bluetoothHeadset = (BluetoothHeadset) bluetoothProfile;
            this.A01 = bluetoothHeadset;
            WeakReference weakReference = this.A03;
            if (weakReference != null) {
                r3 = (AnonymousClass26Z) weakReference.get();
                if (r3 != null && !r3.A02) {
                    if (bluetoothHeadset != null) {
                        AudioManager A0G = this.A05.A0G();
                        StringBuilder sb = new StringBuilder("BluetoothHeadsetMonitor/onServiceConnected ");
                        sb.append(this.A01);
                        sb.append(", devices: ");
                        sb.append(C15450qv.A0A() ? A01(A0G) : this.A01.getConnectedDevices());
                        sb.append(", ");
                        sb.append(r3);
                        Log.i(sb.toString());
                        r3.A04(Voip.getCallInfo());
                        return;
                    }
                    return;
                }
            } else {
                r3 = null;
            }
            StringBuilder sb2 = new StringBuilder("BluetoothHeadsetMonitor/onServiceConnected VoipInterface already Destroyed ");
            sb2.append(r3);
            Log.w(sb2.toString());
        }
    }

    public void onServiceDisconnected(int i2) {
        if (i2 == 1) {
            WeakReference weakReference = this.A03;
            AnonymousClass26Z r2 = weakReference != null ? (AnonymousClass26Z) weakReference.get() : null;
            StringBuilder sb = new StringBuilder("BluetoothHeadsetMonitor/onServiceDisconnected ");
            sb.append(this.A01);
            sb.append(", ");
            sb.append(r2);
            Log.i(sb.toString());
            this.A01 = null;
            if (r2 == null || r2.A02) {
                StringBuilder sb2 = new StringBuilder("BluetoothHeadsetMonitor/onServiceDisconnected VoipInterface already Destroyed ");
                sb2.append(r2);
                Log.w(sb2.toString());
                return;
            }
            r2.A08(Voip.getCallInfo(), false);
        }
    }
}
