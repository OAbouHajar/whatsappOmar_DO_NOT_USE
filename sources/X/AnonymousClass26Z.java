package X;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothHeadset;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.telecom.CallAudioState;
import com.facebook.redex.IDxCListenerShape42S0000000_2_I0;
import com.facebook.redex.RunnableRunnableShape0S0001000_I0;
import com.facebook.redex.RunnableRunnableShape4S0100000_I0_3;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.26Z  reason: invalid class name */
public class AnonymousClass26Z implements C448826a {
    public static final Object A0I = new IDxCListenerShape42S0000000_2_I0(0);
    public static final boolean A0J;
    public int A00;
    public int A01;
    public boolean A02 = false;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Context A08;
    public final C87364Wm A09;
    public final C56282nD A0A;
    public final C447225g A0B;
    public final C52242dN A0C;
    public final C216514x A0D;
    public final AnonymousClass01V A0E;
    public final C14710pd A0F;
    public final AnonymousClass1B1 A0G;
    public final AnonymousClass1WA A0H;

    static {
        boolean z2 = false;
        if (Build.VERSION.SDK_INT >= 28) {
            z2 = true;
        }
        A0J = z2;
    }

    public AnonymousClass26Z(Context context, C447225g r5, C216514x r6, AnonymousClass01V r7, C14710pd r8, AnonymousClass1B1 r9, C16320sq r10) {
        this.A0B = r5;
        this.A0F = r8;
        this.A08 = context;
        this.A0E = r7;
        this.A0G = r9;
        this.A0D = r6;
        this.A0H = new AnonymousClass1WA(r10, false);
        StringBuilder sb = new StringBuilder("voip/audio_route/create ");
        sb.append(this);
        Log.i(sb.toString());
        AnonymousClass4DU r2 = new AnonymousClass4DU(this);
        C87364Wm r0 = Build.VERSION.SDK_INT >= 23 ? new C72833mm(r7) : new C72843mn(context, r7);
        r0.A00 = r2;
        this.A09 = r0;
        this.A0A = new C56282nD(this);
        this.A0C = !A0J ? null : new C59922zQ(this, r8);
    }

    public final String A00() {
        boolean z2 = false;
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            if (stackTraceElement.getClassName().equals(getClass().getName())) {
                z2 = true;
            } else if (z2) {
                StringBuilder sb = new StringBuilder();
                sb.append(stackTraceElement.getClassName());
                sb.append("/");
                sb.append(stackTraceElement.getMethodName());
                return sb.toString();
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r3.A00 == 3) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
            r3 = this;
            boolean r0 = r3.A06
            if (r0 != 0) goto L_0x000a
            int r1 = r3.A00
            r0 = 3
            r2 = 0
            if (r1 != r0) goto L_0x000b
        L_0x000a:
            r2 = 1
        L_0x000b:
            r3.A06 = r2
            java.lang.String r1 = "voip/audio_route/rememberBluetoothState "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass26Z.A01():void");
    }

    public void A02() {
        AudioManager A0G2;
        StringBuilder sb = new StringBuilder("voip/audio_route/resetAudioManager ");
        sb.append(this);
        sb.append(", telecom: ");
        sb.append(this.A05);
        Log.i(sb.toString());
        if (!this.A05) {
            AudioManager A0G3 = this.A0E.A0G();
            if (A0G3 != null) {
                A0G3.setSpeakerphoneOn(false);
            }
            A08((CallInfo) null, false);
        }
        this.A00 = 2;
        if (!this.A05 && (A0G2 = this.A0E.A0G()) != null) {
            try {
                A0G2.setMode(0);
            } catch (Exception e2) {
                Log.e((Throwable) e2);
            }
            RunnableRunnableShape4S0100000_I0_3 runnableRunnableShape4S0100000_I0_3 = new RunnableRunnableShape4S0100000_I0_3(A0G2, 40);
            if (this.A0F.A0E(C16620tM.A02, 2894)) {
                this.A0H.execute(runnableRunnableShape4S0100000_I0_3);
            } else {
                runnableRunnableShape4S0100000_I0_3.run();
            }
        }
    }

    public void A03() {
        AudioManager A0G2 = this.A0E.A0G();
        if (A0G2 != null) {
            StringBuilder sb = new StringBuilder("voip/audio_route/unmuteOsMicrophone call from: ");
            sb.append(A00());
            sb.append(", isMicrophoneMute was ");
            sb.append(A0G2.isMicrophoneMute());
            Log.i(sb.toString());
            A0G2.setMicrophoneMute(false);
        }
    }

    public void A04(CallInfo callInfo) {
        if (callInfo != null && callInfo.callState != CallState.NONE) {
            StringBuilder sb = new StringBuilder("voip/audio_route/autoChooseAudioRoute from: ");
            sb.append(A00());
            sb.append(", call state: ");
            sb.append(callInfo.callState);
            Log.i(sb.toString());
            if (A0A(callInfo)) {
                A05(callInfo);
                A08(callInfo, true);
                return;
            }
            AnonymousClass3M9 A0B2 = this.A0B.A0B(callInfo.callId);
            if (!A0J || A0B2 == null || A0B2.getCallAudioState() == null ? this.A09.A03() : A0B2.getCallAudioState().getRoute() == 4) {
                A07(callInfo, (Boolean) null);
            } else if (A0B(callInfo) || callInfo.groupJid != null) {
                A09(callInfo, true);
            } else {
                A09(callInfo, false);
            }
        }
    }

    public void A05(CallInfo callInfo) {
        boolean z2 = true;
        if (this.A00 != 1 || callInfo.videoEnabled || callInfo.callState == CallState.RECEIVED_CALL) {
            z2 = false;
        }
        this.A07 = z2;
    }

    public void A06(CallInfo callInfo, Boolean bool) {
        CallState callState;
        A07(callInfo, bool);
        if (callInfo != null && (callState = callInfo.callState) != CallState.NONE) {
            StringBuilder sb = new StringBuilder("voip/audio_route/checkAndTurnOnSpeakerPhone usingSpeakerBefore: ");
            sb.append(this.A07);
            sb.append(", video call: ");
            sb.append(callInfo.videoEnabled);
            sb.append(", call state: ");
            sb.append(callState);
            Log.i(sb.toString());
            if (this.A00 == 2 && (this.A07 || A0B(callInfo))) {
                A09(callInfo, true);
            } else if (this.A00 == 1 && callInfo.callState == CallState.ACCEPT_SENT && !this.A07) {
                A09(callInfo, false);
            }
        }
    }

    public void A07(CallInfo callInfo, Boolean bool) {
        String obj;
        AnonymousClass00B.A01();
        if (bool != null) {
            this.A03 = bool.booleanValue();
        }
        if (callInfo != null && callInfo.callState != CallState.NONE) {
            int i2 = this.A00;
            AudioManager A0G2 = this.A0E.A0G();
            if (A0G2 != null) {
                C447225g r3 = this.A0B;
                AnonymousClass3M9 A0B2 = r3.A0B(callInfo.callId);
                CallAudioState callAudioState = null;
                boolean z2 = true;
                if (this.A03 || !A0J || A0B2 == null || A0B2.getCallAudioState() == null) {
                    if (A0G2.isBluetoothScoOn()) {
                        this.A00 = 3;
                    } else if (A0G2.isSpeakerphoneOn() && !this.A04) {
                        this.A00 = 1;
                        if (i2 != 1) {
                            this.A07 = false;
                        }
                    } else if (this.A09.A03()) {
                        this.A00 = 4;
                    } else {
                        this.A00 = 2;
                    }
                    z2 = false;
                } else {
                    callAudioState = A0B2.getCallAudioState();
                    int route = callAudioState.getRoute();
                    if (route == 1) {
                        this.A00 = 2;
                    } else if (route == 2) {
                        this.A00 = 3;
                    } else if (route == 4) {
                        this.A00 = 4;
                    } else if (route == 8) {
                        this.A00 = 1;
                    }
                }
                StringBuilder sb = new StringBuilder("voip/audio_route/updateAudioRoute: [");
                sb.append(Voip.A05(i2));
                sb.append(" -> ");
                sb.append(Voip.A05(this.A00));
                sb.append("], using telecom: ");
                sb.append(z2);
                sb.append(", ");
                if (callAudioState != null) {
                    StringBuilder sb2 = new StringBuilder("CallAudioState: ");
                    sb2.append(callAudioState);
                    obj = sb2.toString();
                } else {
                    StringBuilder sb3 = new StringBuilder("Bluetooth: [ScoAudioState: ");
                    sb3.append(C56282nD.A00(this.A01));
                    sb3.append(", ScoOn: ");
                    sb3.append(A0G2.isBluetoothScoOn());
                    sb3.append("], Speaker: ");
                    sb3.append(A0G2.isSpeakerphoneOn());
                    obj = sb3.toString();
                }
                sb.append(obj);
                sb.append(", fallBackToNonTelecomToSyncAudioRoute: ");
                sb.append(this.A03);
                sb.append(", ");
                sb.append(this);
                Log.i(sb.toString());
                this.A04 = false;
                int i3 = this.A00;
                r3.A14.execute(new RunnableRunnableShape0S0001000_I0(i3, 1));
                AnonymousClass1ZF r1 = r3.A0a;
                if (r1 != null) {
                    r1.AhO(callInfo, i3, r3.A1k.A0A(callInfo));
                }
                r3.A0k(callInfo);
                r3.A1S = false;
            }
        }
    }

    public void A08(CallInfo callInfo, boolean z2) {
        AnonymousClass3M9 A0B2 = this.A0B.A0B(callInfo == null ? null : callInfo.callId);
        StringBuilder sb = new StringBuilder("voip/audio_route/changeBluetoothState ");
        sb.append(z2 ? "On" : "Off");
        sb.append(" using telecom: ");
        boolean z3 = false;
        if (A0B2 != null) {
            z3 = true;
        }
        sb.append(z3);
        Log.i(sb.toString());
        if (!A0J || A0B2 == null) {
            AudioManager A0G2 = this.A0E.A0G();
            if (A0G2 != null) {
                if (z2) {
                    try {
                        if (A0G2.isBluetoothScoOn()) {
                            Log.i("voip/audio_route/changeBluetoothState startBluetoothSco when isBluetoothScoOn is true");
                        }
                        A0G2.startBluetoothSco();
                        A0G2.setBluetoothScoOn(true);
                    } catch (Exception e2) {
                        Log.e((Throwable) e2);
                    }
                } else {
                    A0G2.setBluetoothScoOn(false);
                    A0G2.stopBluetoothSco();
                }
                A07(callInfo, (Boolean) null);
                return;
            }
            return;
        }
        int i2 = 5;
        if (z2) {
            i2 = 2;
        }
        A0B2.setAudioRoute(i2);
    }

    public void A09(CallInfo callInfo, boolean z2) {
        AnonymousClass3M9 A0B2 = this.A0B.A0B(callInfo == null ? null : callInfo.callId);
        StringBuilder sb = new StringBuilder("voip/audio_route/changeSpeakerphoneState ");
        sb.append(z2 ? "On" : "Off");
        sb.append(" using telecom: ");
        boolean z3 = false;
        if (A0B2 != null) {
            z3 = true;
        }
        sb.append(z3);
        Log.i(sb.toString());
        if (!A0J || A0B2 == null) {
            AudioManager A0G2 = this.A0E.A0G();
            if (A0G2 != null) {
                A0G2.setSpeakerphoneOn(z2);
                A07(callInfo, (Boolean) null);
                return;
            }
            return;
        }
        int i2 = 5;
        if (z2) {
            i2 = 8;
        }
        A0B2.setAudioRoute(i2);
    }

    public boolean A0A(CallInfo callInfo) {
        AnonymousClass3M9 A0B2 = this.A0B.A0B(callInfo.callId);
        if (A0J && A0B2 != null && A0B2.getCallAudioState() != null) {
            return !A0B2.getCallAudioState().getSupportedBluetoothDevices().isEmpty();
        }
        AudioManager A0G2 = this.A0E.A0G();
        BluetoothHeadset bluetoothHeadset = this.A0G.A01;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            return false;
        }
        try {
            if (!defaultAdapter.isEnabled() || A0G2 == null) {
                return false;
            }
            return C15450qv.A0A() ? !C52112d9.A00(A0G2).isEmpty() : bluetoothHeadset != null && !bluetoothHeadset.getConnectedDevices().isEmpty();
        } catch (Exception e2) {
            Log.e((Throwable) e2);
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        if (r2 < 3) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0B(com.whatsapp.voipcalling.CallInfo r6) {
        /*
            r5 = this;
            r4 = 0
            boolean r0 = r6.videoEnabled
            if (r0 != 0) goto L_0x003d
            java.lang.String r0 = r6.callLinkToken
            if (r0 != 0) goto L_0x003d
            boolean r0 = X.C15450qv.A00()
            if (r0 == 0) goto L_0x003e
            android.content.Context r0 = r5.A08
            X.2CF r1 = X.C26791Pe.A02(r0)
            if (r1 == 0) goto L_0x003e
            android.content.Context r0 = X.C47142Ht.A00(r0)
            android.content.res.Resources r3 = r0.getResources()
            android.content.res.Configuration r0 = r3.getConfiguration()
            int r0 = r0.screenLayout
            r2 = r0 & 15
            int r1 = r1.A00
            r0 = 900(0x384, float:1.261E-42)
            if (r1 <= r0) goto L_0x0031
            r0 = 3
            r1 = 1
            if (r2 >= r0) goto L_0x0032
        L_0x0031:
            r1 = 0
        L_0x0032:
            r0 = 2131034121(0x7f050009, float:1.767875E38)
            boolean r0 = r3.getBoolean(r0)
            if (r1 != 0) goto L_0x003d
            if (r0 == 0) goto L_0x003e
        L_0x003d:
            r4 = 1
        L_0x003e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass26Z.A0B(com.whatsapp.voipcalling.CallInfo):boolean");
    }

    public void ANj(int i2) {
        StringBuilder sb = new StringBuilder("voip/audio_route/onBluetoothHeadsetConnectionStateChanged state: ");
        sb.append(AnonymousClass1B1.A00(i2));
        Log.i(sb.toString());
        if (i2 != 0) {
            if (i2 == 2) {
                A04(Voip.getCallInfo());
                return;
            } else if (i2 != 3) {
                return;
            }
        }
        A08(Voip.getCallInfo(), false);
    }
}
