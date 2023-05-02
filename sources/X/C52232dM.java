package X;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.telecom.CallAudioState;
import android.telecom.Connection;
import android.telecom.ConnectionRequest;
import android.telecom.PhoneAccount;
import android.telecom.PhoneAccountHandle;
import android.telecom.TelecomManager;
import com.obwhatsapp.R;
import com.obwhatsapp.calling.telecom.SelfManagedConnectionService;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.Voip;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.2dM  reason: invalid class name and case insensitive filesystem */
public class C52232dM extends C16580tI {
    public PhoneAccountHandle A00;
    public boolean A01;
    public final ComponentName A02;
    public final C16040sK A03;
    public final AnonymousClass01V A04;
    public final C16980tz A05;
    public final C14710pd A06;
    public final ConcurrentMap A07 = new ConcurrentHashMap(2);
    public volatile boolean A08;

    public C52232dM(C16040sK r4, AnonymousClass01V r5, C16980tz r6, C14710pd r7) {
        this.A06 = r7;
        this.A03 = r4;
        this.A05 = r6;
        this.A04 = r5;
        this.A02 = new ComponentName(r6.A00, SelfManagedConnectionService.class);
    }

    public static final Uri A01(UserJid userJid) {
        String replaceAll;
        String A042 = C24561Gk.A04(userJid);
        if (A042 != null && (replaceAll = A042.replaceAll("\\D", "")) != null) {
            return Uri.fromParts("tel", replaceAll, "");
        }
        Log.i("voip/SelfManagedConnectionsManager/getPhoneCallUri failed to get phone number");
        return null;
    }

    public int A04() {
        return this.A06.A03(C16620tM.A02, 1658);
    }

    public Connection A05(ConnectionRequest connectionRequest, boolean z2) {
        Bundle bundle;
        StringBuilder sb;
        String str;
        AnonymousClass00B.A01();
        Bundle extras = connectionRequest.getExtras();
        AnonymousClass3M9 r6 = null;
        if (extras == null) {
            sb = new StringBuilder();
            str = "voip/SelfManagedConnectionsManager/createSelfManagedConnection extras is null for request ";
        } else {
            if (!z2) {
                bundle = extras.getBundle("android.telecom.extra.INCOMING_CALL_EXTRAS");
                if (bundle == null) {
                    sb = new StringBuilder();
                    str = "voip/SelfManagedConnectionsManager/createSelfManagedConnection EXTRA_INCOMING_CALL_EXTRAS is null for request ";
                }
            } else {
                bundle = extras;
            }
            String string = bundle.getString("call_id");
            UserJid nullable = UserJid.getNullable(bundle.getString("peer_jid"));
            String string2 = bundle.getString("peer_display_name");
            boolean z3 = bundle.getBoolean("is_rejoin", false);
            if (string == null || nullable == null || string2 == null) {
                sb = new StringBuilder();
                str = "voip/SelfManagedConnectionsManager/createSelfManagedConnection invalid request ";
            } else {
                r6 = new AnonymousClass3M9(this, string);
                r6.setConnectionProperties(128);
                r6.setAddress(connectionRequest.getAddress(), 1);
                r6.setCallerDisplayName(string2, 1);
                r6.setConnectionCapabilities(r6.getConnectionCapabilities() | 2);
                r6.setVideoState(connectionRequest.getVideoState());
                r6.setExtras(extras);
                StringBuilder sb2 = new StringBuilder("voip/SelfManagedConnectionsManager/createSelfManagedConnection with ");
                sb2.append(nullable);
                sb2.append(", call id: ");
                sb2.append(string);
                sb2.append(", isOutgoing ");
                sb2.append(z2);
                Log.i(sb2.toString());
                A0C(r6);
                for (C52242dN r2 : A01()) {
                    if (z2) {
                        r2.A02(string, z3);
                    } else if (r2 instanceof C59932zR) {
                        C59932zR r22 = (C59932zR) r2;
                        AnonymousClass00B.A01();
                        StringBuilder sb3 = new StringBuilder("voip/service/selfManagedConnectionListener/onCreateIncomingConnection ");
                        sb3.append(string);
                        Log.i(sb3.toString());
                        CallInfo callInfo = Voip.getCallInfo();
                        if (callInfo == null || (!string.equals(callInfo.callId) && !string.equals(callInfo.callWaitingInfo.A04))) {
                            r22.A00.A1v.A0A(string);
                        } else {
                            C447225g r23 = r22.A00;
                            r23.A0L.removeMessages(1);
                            Handler handler = r23.A0L;
                            handler.sendMessageDelayed(handler.obtainMessage(28, string), 500);
                        }
                    } else {
                        AnonymousClass00B.A01();
                    }
                }
                return r6;
            }
        }
        sb.append(str);
        sb.append(connectionRequest);
        Log.i(sb.toString());
        return r6;
    }

    public AnonymousClass3M9 A06(String str) {
        return (AnonymousClass3M9) this.A07.get(str);
    }

    public void A07() {
        AnonymousClass00B.A01();
        ConcurrentMap concurrentMap = this.A07;
        if (!concurrentMap.isEmpty()) {
            Log.i("voip/SelfManagedConnectionsManager/removeAllConnections");
            Iterator it = new ArrayList(concurrentMap.values()).iterator();
            while (it.hasNext()) {
                ((AnonymousClass3M9) it.next()).A01(2);
            }
            AnonymousClass00B.A0B("all connection should have been removed", concurrentMap.isEmpty());
        }
    }

    public void A08() {
        AnonymousClass01V r4 = this.A04;
        if (r4.A0L() == null) {
            Log.w("voip/SelfManagedConnectionsManager/unregisterPhoneAccount telecomManager is null");
            return;
        }
        Log.i("voip/SelfManagedConnectionsManager/unregisterPhoneAccounts");
        try {
            TelecomManager.class.getMethod("clearPhoneAccounts", new Class[0]).invoke(r4.A0L(), new Object[0]);
            this.A00 = null;
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder("voip/SelfManagedConnectionsManager/unregisterPhoneAccounts ");
            sb.append(e2);
            Log.e(sb.toString());
        }
    }

    public void A09(CallAudioState callAudioState, String str) {
        AnonymousClass00B.A01();
        for (C52242dN A002 : A01()) {
            A002.A00(callAudioState, str);
        }
    }

    public void A0A(ConnectionRequest connectionRequest) {
        String string;
        AnonymousClass00B.A01();
        Bundle extras = connectionRequest.getExtras();
        if (extras != null && (string = extras.getString("call_id")) != null) {
            for (C52242dN r2 : A01()) {
                if (r2 instanceof C59932zR) {
                    C59932zR r22 = (C59932zR) r2;
                    AnonymousClass00B.A01();
                    StringBuilder sb = new StringBuilder("voip/service/selfManagedConnectionListener/onCreateIncomingConnectionFailed ");
                    sb.append(string);
                    Log.i(sb.toString());
                    if (string.equals(Voip.getCurrentCallId())) {
                        C447225g r23 = r22.A00;
                        r23.A0L.removeMessages(1);
                        r23.A0w(string, "busy", 4);
                    }
                } else {
                    AnonymousClass00B.A01();
                }
            }
        }
    }

    public void A0B(ConnectionRequest connectionRequest) {
        String string;
        AnonymousClass00B.A01();
        Bundle extras = connectionRequest.getExtras();
        if (extras != null && (string = extras.getString("call_id")) != null) {
            for (C52242dN r5 : A01()) {
                if (r5 instanceof C52262dQ) {
                    C52262dQ r52 = (C52262dQ) r5;
                    AnonymousClass00B.A01();
                    C204310c r3 = r52.A01;
                    AnonymousClass2R6 r2 = r3.A0S;
                    StringBuilder sb = new StringBuilder("app/startOutgoingCall/onCreateOutgoingConnectionFailed ");
                    sb.append(string);
                    sb.append(", pendingCallCommand: ");
                    sb.append(r2);
                    Log.i(sb.toString());
                    if (r2 != null && string.equals(r2.A05)) {
                        Log.w("app/startOutgoingCall/failed_create_outgoing_connection");
                        r3.A0S = null;
                        r3.A01.removeMessages(1);
                    }
                    r52.A00.A03(string, 97);
                } else {
                    AnonymousClass00B.A01();
                }
            }
        }
    }

    public void A0C(AnonymousClass3M9 r4) {
        AnonymousClass00B.A01();
        ConcurrentMap concurrentMap = this.A07;
        concurrentMap.put(r4.A00(), r4);
        StringBuilder sb = new StringBuilder("voip/SelfManagedConnectionsManager/addConnection");
        sb.append(r4);
        sb.append(", total connection count: ");
        sb.append(concurrentMap.size());
        Log.i(sb.toString());
    }

    public void A0D(AnonymousClass3M9 r4) {
        AnonymousClass00B.A01();
        ConcurrentMap concurrentMap = this.A07;
        concurrentMap.remove(r4.A00());
        StringBuilder sb = new StringBuilder("voip/SelfManagedConnectionsManager/removeConnection");
        sb.append(r4);
        sb.append(", total connection count: ");
        sb.append(concurrentMap.size());
        Log.i(sb.toString());
    }

    public void A0E(String str) {
        AnonymousClass00B.A01();
        StringBuilder sb = new StringBuilder("voip/SelfManagedConnectionsManager/disconnectConnectionIfExists");
        sb.append(str);
        Log.i(sb.toString());
        AnonymousClass3M9 A062 = A06(str);
        if (A062 != null) {
            A062.A01(2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004c, code lost:
        if (r11.equals(r4.callWaitingInfo.A04) == false) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0F(java.lang.String r11, int r12) {
        /*
            r10 = this;
            X.AnonymousClass00B.A01()
            java.lang.Iterable r0 = r10.A01()
            java.util.Iterator r9 = r0.iterator()
        L_0x000b:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x010a
            java.lang.Object r2 = r9.next()
            X.2dN r2 = (X.C52242dN) r2
            boolean r0 = r2 instanceof X.C59932zR
            if (r0 == 0) goto L_0x0105
            X.2zR r2 = (X.C59932zR) r2
            X.AnonymousClass00B.A01()
            java.lang.String r0 = "voip/service/selfManagedConnectionListener/onConnectionStateChanged "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r11)
            java.lang.String r0 = ", state "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.25g r2 = r2.A00
            com.whatsapp.voipcalling.CallInfo r4 = com.whatsapp.voipcalling.Voip.getCallInfo()
            r3 = 1
            if (r4 == 0) goto L_0x004e
            X.1fV r0 = r4.callWaitingInfo
            java.lang.String r0 = r0.A04
            boolean r0 = r11.equals(r0)
            r1 = 1
            if (r0 != 0) goto L_0x004f
        L_0x004e:
            r1 = 0
        L_0x004f:
            boolean r0 = com.whatsapp.voipcalling.Voip.A08(r4)
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r4.callId
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x005f
            if (r1 == 0) goto L_0x000b
        L_0x005f:
            if (r12 == 0) goto L_0x0100
            if (r12 == r3) goto L_0x00fa
            r0 = 2
            if (r12 == r0) goto L_0x00e8
            r0 = 3
            if (r12 == r0) goto L_0x006e
            r0 = 0
            r2.A0n(r4, r0, r3)
            goto L_0x000b
        L_0x006e:
            X.14x r0 = r2.A1v
            int r4 = r0.A01()
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r0 = r2.A0D
            long r5 = r5 - r0
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            r2.A0v = r1
            java.lang.String r0 = "VoiceService/onConnectionStateChanged Time elapsed since SelfManagedConnection creation = "
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r0)
            r5.append(r1)
            java.lang.String r0 = ", Android auto connected = "
            r5.append(r0)
            X.4Ly r8 = r2.A1l
            boolean r0 = r8.A03
            r5.append(r0)
            java.lang.String r0 = ", isUsingBluetooth = "
            r5.append(r0)
            X.26Z r7 = r2.A1k
            int r3 = r7.A00
            r1 = 3
            r0 = 0
            if (r3 != r1) goto L_0x00a5
            r0 = 1
        L_0x00a5:
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Long r0 = r2.A0v
            long r5 = r0.longValue()
            long r3 = (long) r4
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x00ca
            boolean r0 = r8.A03
            if (r0 != 0) goto L_0x00c2
            int r0 = r7.A00
            if (r0 != r1) goto L_0x00ca
        L_0x00c2:
            r1 = 9
            r0 = 0
            r2.A0w(r11, r0, r1)
            goto L_0x000b
        L_0x00ca:
            android.telephony.TelephonyManager r1 = r2.A1Y
            X.0sj r0 = r2.A2F
            int r0 = X.C30341cC.A01(r1, r0)
            if (r0 != 0) goto L_0x00c2
            java.lang.String r0 = "VoiceService/onConnectionStateChanged Ignoring SelfManagedConnection.onReject"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r2.A1E
            if (r0 != 0) goto L_0x000b
            r0 = 0
            r2.A0D = r0
            r0 = 500(0x1f4, double:2.47E-321)
            r2.A0Y(r0)
            goto L_0x000b
        L_0x00e8:
            r2.A16 = r3
            r2.A0l(r4)
            X.14x r0 = r2.A1v
            boolean r1 = r0.A0C()
            r0 = 8
            r2.A0X(r0, r11, r1)
            goto L_0x000b
        L_0x00fa:
            r0 = 0
            r2.A0o(r4, r0, r3)
            goto L_0x000b
        L_0x0100:
            r2.A0o(r4, r3, r3)
            goto L_0x000b
        L_0x0105:
            X.AnonymousClass00B.A01()
            goto L_0x000b
        L_0x010a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52232dM.A0F(java.lang.String, int):void");
    }

    public void A0G(String str, String str2) {
        AnonymousClass3M9 A062 = A06(str);
        if (A062 != null) {
            StringBuilder sb = new StringBuilder("voip/SelfManagedConnectionsManager/onCallAutoConnected changing CallId from: ");
            sb.append(str);
            sb.append(" -> ");
            sb.append(str2);
            Log.i(sb.toString());
            A0D(A062);
            A062.A02(str2);
            A0C(A062);
        }
    }

    public boolean A0H() {
        return this.A06.A0E(C16620tM.A02, 2186);
    }

    public boolean A0I() {
        this.A08 = this.A06.A0E(C16620tM.A02, 1641);
        return this.A08;
    }

    public boolean A0J() {
        boolean A0E = this.A06.A0E(C16620tM.A02, 1642);
        this.A01 = A0E;
        return A0E;
    }

    public boolean A0K() {
        String str;
        if (this.A00 != null) {
            return true;
        }
        AnonymousClass01V r4 = this.A04;
        if (r4.A0L() == null) {
            str = "voip/SelfManagedConnectionsManager/registerPhoneAccount telecomManager is null";
        } else {
            C16040sK r0 = this.A03;
            r0.A0B();
            AnonymousClass1ZT r6 = r0.A05;
            if (r6 == null) {
                str = "voip/SelfManagedConnectionsManager/registerPhoneAccount jid is null";
            } else {
                Uri A012 = A01(r6);
                if (A012 == null) {
                    str = "voip/SelfManagedConnectionsManager/registerPhoneAccount address is null";
                } else {
                    StringBuilder sb = new StringBuilder("voip/SelfManagedConnectionsManager/registerPhoneAccount ");
                    sb.append(r6);
                    Log.i(sb.toString());
                    PhoneAccountHandle phoneAccountHandle = new PhoneAccountHandle(this.A02, r6.getRawString());
                    this.A00 = phoneAccountHandle;
                    Context context = this.A05.A00;
                    PhoneAccount.Builder shortDescription = PhoneAccount.builder(phoneAccountHandle, context.getString(R.string.str1b97)).addSupportedUriScheme("tel").setAddress(A012).setCapabilities(3080).setShortDescription(context.getString(R.string.str1b07));
                    if (Build.VERSION.SDK_INT >= 28) {
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("android.telecom.extra.LOG_SELF_MANAGED_CALLS", false);
                        shortDescription.setExtras(bundle);
                    }
                    try {
                        r4.A0L().registerPhoneAccount(shortDescription.build());
                        return true;
                    } catch (Exception e2) {
                        Log.e((Throwable) e2);
                        this.A00 = null;
                        return false;
                    }
                }
            }
        }
        Log.w(str);
        return false;
    }

    public boolean A0L(UserJid userJid, String str, String str2, boolean z2) {
        String str3;
        AnonymousClass00B.A01();
        StringBuilder sb = new StringBuilder("voip/SelfManagedConnectionsManager/addNewIncomingCall ");
        sb.append(userJid);
        Log.i(sb.toString());
        if (!this.A08) {
            str3 = "voip/SelfManagedConnectionsManager/addNewIncomingCall incomingEnabled is false";
        } else {
            AnonymousClass01V r4 = this.A04;
            if (r4.A0L() == null) {
                str3 = "voip/SelfManagedConnectionsManager/addNewIncomingCall telecomManager is null";
            } else if (this.A00 == null) {
                str3 = "voip/SelfManagedConnectionsManager/addNewIncomingCall phoneAccountHandle is null";
            } else {
                try {
                    if (!r4.A0L().isIncomingCallPermitted(this.A00)) {
                        Log.i("voip/SelfManagedConnectionsManager/addNewIncomingCall incoming call not permitted for the phone account handle");
                        return false;
                    }
                    Uri A012 = A01(userJid);
                    if (A012 != null) {
                        Bundle bundle = new Bundle();
                        if (z2) {
                            bundle.putInt("android.telecom.extra.START_CALL_WITH_VIDEO_STATE", 3);
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("call_id", str);
                        bundle2.putString("peer_jid", userJid.getRawString());
                        bundle2.putString("peer_display_name", str2);
                        bundle2.putBoolean("is_rejoin", false);
                        bundle.putParcelable("android.telecom.extra.INCOMING_CALL_EXTRAS", bundle2);
                        bundle.putParcelable("android.telecom.extra.INCOMING_CALL_ADDRESS", A012);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("voip/SelfManagedConnectionsManager/addNewIncomingCall ");
                        sb2.append(bundle);
                        Log.i(sb2.toString());
                        r4.A0L().addNewIncomingCall(this.A00, bundle);
                        return true;
                    }
                    return false;
                } catch (Exception e2) {
                    Log.e((Throwable) e2);
                    return false;
                }
            }
        }
        Log.w(str3);
        return false;
    }

    public boolean A0M(UserJid userJid, String str, String str2, boolean z2, boolean z3) {
        String str3;
        AnonymousClass00B.A01();
        StringBuilder sb = new StringBuilder("voip/SelfManagedConnectionsManager/placeOutgoingCall ");
        sb.append(userJid);
        Log.i(sb.toString());
        if (!this.A01) {
            str3 = "voip/SelfManagedConnectionsManager/placeOutgoingCall outgoingEnabled is false";
        } else {
            AnonymousClass01V r4 = this.A04;
            if (r4.A0L() == null) {
                str3 = "voip/SelfManagedConnectionsManager/placeOutgoingCall telecomManager is null";
            } else if (this.A00 == null) {
                str3 = "voip/SelfManagedConnectionsManager/placeOutgoingCall phoneAccountHandle is null";
            } else {
                try {
                    if (!r4.A0L().isOutgoingCallPermitted(this.A00)) {
                        Log.w("voip/SelfManagedConnectionsManager/placeOutgoingCall outgoing call not permitted for the phone account handle");
                        return false;
                    }
                    Uri A012 = A01(userJid);
                    if (A012 != null) {
                        if (z2 && Build.VERSION.SDK_INT >= 28 && Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
                            z2 = false;
                        }
                        Bundle bundle = new Bundle();
                        if (z2) {
                            bundle.putInt("android.telecom.extra.START_CALL_WITH_VIDEO_STATE", 3);
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("call_id", str);
                        bundle2.putString("peer_jid", userJid.getRawString());
                        bundle2.putString("peer_display_name", str2);
                        bundle2.putBoolean("is_rejoin", z3);
                        bundle.putParcelable("android.telecom.extra.OUTGOING_CALL_EXTRAS", bundle2);
                        bundle.putParcelable("android.telecom.extra.PHONE_ACCOUNT_HANDLE", this.A00);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("voip/SelfManagedConnectionsManager/placeOutgoingCall ");
                        sb2.append(bundle);
                        Log.i(sb2.toString());
                        r4.A0L().placeCall(A012, bundle);
                        return true;
                    }
                    return false;
                } catch (Exception e2) {
                    Log.e((Throwable) e2);
                    return false;
                }
            }
        }
        Log.w(str3);
        return false;
    }
}
