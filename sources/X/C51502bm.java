package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2bm  reason: invalid class name and case insensitive filesystem */
public class C51502bm extends C51442bg {
    public final AnonymousClass2H7 A00;
    public final C229219u A01;
    public final C229519x A02;
    public final List A03;

    public C51502bm(C16300so r7, C14710pd r8, C16490t9 r9, AnonymousClass2H7 r10, C229219u r11, C229519x r12, List list, Map map) {
        super(r7, r8, r9, r10, map);
        this.A01 = r11;
        this.A02 = r12;
        this.A03 = list;
        this.A00 = r10;
    }

    public void A00(C28371Vv r14) {
        AnonymousClass2H8 r4;
        Message message;
        AnonymousClass2H8 r11;
        Message obtain;
        AnonymousClass2H8 r42;
        Message obtain2;
        C49432Td r3;
        C28371Vv[] r32;
        int i2 = 0;
        C28371Vv A0I = r14.A0I(0);
        if (C28371Vv.A07(A0I, "offline")) {
            String A0N = A0I.A0N("count", (String) null);
            if (A0N != null) {
                try {
                    AnonymousClass2H7 r33 = this.A00;
                    int parseInt = Integer.parseInt(A0N);
                    StringBuilder sb = new StringBuilder("xmpp/reader/read/offline-complete count=");
                    sb.append(parseInt);
                    Log.i(sb.toString());
                    AnonymousClass2H8 r43 = r33.A01;
                    Bundle bundle = new Bundle();
                    bundle.putInt("messageCount", parseInt);
                    r43.AZq(Message.obtain((Handler) null, 0, 15, 0, bundle));
                    Iterator it = this.A03.iterator();
                    if (it.hasNext()) {
                        it.next();
                        throw new NullPointerException("onOfflineCompleteReceived");
                    }
                } catch (NumberFormatException unused) {
                }
            }
        } else {
            if (C28371Vv.A07(A0I, "dirty")) {
                AnonymousClass2H7 r44 = this.A00;
                C28371Vv[] r34 = r14.A03;
                AnonymousClass00B.A06(r34);
                boolean z2 = true;
                if (r34.length != 1) {
                    z2 = false;
                }
                AnonymousClass00B.A0F(z2);
                C28371Vv r5 = r34[0];
                AnonymousClass00B.A0F(C28371Vv.A07(r5, "dirty"));
                String A0N2 = r5.A0N("type", (String) null);
                AnonymousClass00B.A06(A0N2);
                if ("account_sync".equals(A0N2) && (r32 = r5.A03) != null) {
                    HashSet hashSet = new HashSet();
                    for (C28371Vv r0 : r32) {
                        hashSet.add(r0.A00);
                    }
                    r3 = new C49432Td((Long) null, A0N2, hashSet);
                } else if ("syncd_app_state".equals(A0N2)) {
                    String A0N3 = r5.A0N("timestamp", (String) null);
                    Long l2 = null;
                    if (A0N3 != null) {
                        try {
                            l2 = Long.valueOf(Long.parseLong(A0N3));
                        } catch (Exception unused2) {
                            StringBuilder sb2 = new StringBuilder("Timestamp is not a number: ");
                            sb2.append(A0N3);
                            Log.e(sb2.toString());
                        }
                    }
                    r3 = new C49432Td(l2, A0N2, Collections.emptySet());
                } else {
                    r3 = new C49432Td((Long) null, A0N2, Collections.emptySet());
                }
                StringBuilder sb3 = new StringBuilder("onDirty/category: ");
                sb3.append(r3.A01);
                Log.i(sb3.toString());
                r4 = r44.A01;
                message = Message.obtain((Handler) null, 0, 8, 0, r3);
            } else if (C28371Vv.A07(A0I, "streamdebug")) {
                String A0N4 = A0I.A0N("ip", (String) null);
                String A0N5 = A0I.A0N("reconnect", (String) null);
                String A0N6 = A0I.A0N("stanzalogcount", (String) null);
                if (A0N6 != null) {
                    i2 = Integer.parseInt(A0N6);
                }
                boolean equals = "1".equals(A0N5);
                StringBuilder sb4 = new StringBuilder("xmpp/reader/read/stream/debug host=");
                sb4.append(A0N4);
                sb4.append(" reconnect=");
                sb4.append(equals);
                sb4.append(" size=");
                sb4.append(i2);
                Log.i(sb4.toString());
                return;
            } else {
                if (C28371Vv.A07(A0I, "location")) {
                    Jid A0F = r14.A0F(this.A01, UserJid.class, "from");
                    if (A0I != null) {
                        C28371Vv A0I2 = A0I.A0I(0);
                        if (A0I2 == null || !"enc".equals(A0I2.A00)) {
                            throw new AnonymousClass1W9("invalid location node");
                        }
                        C30821d1 A002 = C53622g0.A00(A0I2);
                        String A0N7 = A0I.A0N("elapsed", (String) null);
                        long j2 = 0;
                        if (A0N7 != null) {
                            j2 = (long) Integer.parseInt(A0N7);
                        }
                        AnonymousClass2H7 r45 = this.A00;
                        StringBuilder sb5 = new StringBuilder("xmpp/reader/on-location-update jid: ");
                        sb5.append(A0F);
                        Log.i(sb5.toString());
                        r42 = r45.A01;
                        obtain2 = Message.obtain((Handler) null, 0, 117, 0, A002);
                        Bundle data = obtain2.getData();
                        AnonymousClass2RS.A01(data, A0F, "jid");
                        data.putLong("elapsed", j2);
                    } else {
                        throw new AnonymousClass1W9("Missing location node");
                    }
                } else if (C28371Vv.A07(A0I, "sonar")) {
                    String A0M = A0I.A0M("url");
                    AnonymousClass2H7 r35 = this.A00;
                    StringBuilder sb6 = new StringBuilder("xmpp/reader/read/sonar/url = ");
                    sb6.append(A0M);
                    Log.i(sb6.toString());
                    r4 = r35.A01;
                    message = Message.obtain((Handler) null, 0, 101, 0, A0M);
                } else if (C28371Vv.A07(A0I, "edge_routing")) {
                    C28371Vv A0J = A0I.A0J("routing_info");
                    if (A0J != null && !TextUtils.isEmpty(A0J.A0L())) {
                        this.A02.A00(A0J.A01);
                        return;
                    }
                    return;
                } else if (C28371Vv.A07(A0I, "fbip")) {
                    String A0L = A0I.A0L();
                    if (A0L != null) {
                        this.A01.A01(A0L.split(","));
                        return;
                    }
                    return;
                } else if (C28371Vv.A07(A0I, "client_expiration")) {
                    long A0D = A0I.A0D("t", -1);
                    AnonymousClass2H7 r46 = this.A00;
                    if (A0D != -1) {
                        A0D *= 1000;
                    }
                    Log.i("xmpp/reader/on-expiration-change");
                    r42 = r46.A01;
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("timestampMs", A0D);
                    obtain2 = Message.obtain((Handler) null, 0, 159, 0, bundle2);
                } else if (C28371Vv.A07(A0I, "attestation")) {
                    String A0M2 = A0I.A0M("nonce");
                    String A0M3 = A0I.A0M("key");
                    AnonymousClass2H7 r1 = this.A00;
                    Log.i("xmpp/reader/on-attestation-request");
                    r42 = r1.A01;
                    obtain2 = Message.obtain((Handler) null, 0, 179, 0);
                    Bundle data2 = obtain2.getData();
                    data2.putString("nonce", A0M2);
                    data2.putString("apiKey", A0M3);
                } else if (C28371Vv.A07(A0I, "safetynet")) {
                    C28371Vv[] r10 = A0I.A03;
                    if (r10 != null) {
                        int length = r10.length;
                        while (i2 < length) {
                            C28371Vv r12 = r10[i2];
                            if (C28371Vv.A07(r12, "attestation")) {
                                String A0M4 = r12.A0M("nonce");
                                String A0M5 = r12.A0M("key");
                                AnonymousClass2H7 r13 = this.A00;
                                Log.i("xmpp/reader/on-attestation-request");
                                r11 = r13.A01;
                                obtain = Message.obtain((Handler) null, 0, 179, 0);
                                Bundle data3 = obtain.getData();
                                data3.putString("nonce", A0M4);
                                data3.putString("apiKey", A0M5);
                            } else if (C28371Vv.A07(r12, "verify_apps")) {
                                int A0B = r12.A0B(r12.A0M("count"), "count");
                                AnonymousClass2H7 r15 = this.A00;
                                Log.i("xmpp/reader/on-safetynet-verifyapps-request");
                                r11 = r15.A01;
                                obtain = Message.obtain((Handler) null, 0, 223, 0);
                                obtain.getData().putInt("maxAppsCount", A0B);
                            } else {
                                i2++;
                            }
                            r11.AZq(obtain);
                            i2++;
                        }
                        return;
                    }
                    return;
                } else if (C28371Vv.A07(A0I, "peer_device_presence")) {
                    AnonymousClass2H7 r52 = this.A00;
                    boolean equalsIgnoreCase = "true".equalsIgnoreCase(A0I.A0M("presence"));
                    StringBuilder sb7 = new StringBuilder("xmpp/reader/on-peer-device-presence: ");
                    sb7.append(equalsIgnoreCase);
                    Log.i(sb7.toString());
                    r4 = r52.A01;
                    message = Message.obtain((Handler) null, 0, 215, equalsIgnoreCase ? 1 : 0);
                } else {
                    C14710pd r36 = this.A02;
                    C16620tM r2 = C16620tM.A02;
                    if (!r36.A0E(r2, 366) && C28371Vv.A07(A0I, "notice")) {
                        List<C28371Vv> A0O = r14.A0O("notice");
                        ArrayList arrayList = new ArrayList();
                        for (C28371Vv r22 : A0O) {
                            arrayList.add(new C46352Dw(r22.A0B(r22.A0M("id"), "id"), r22.A0B(r22.A0M("stage"), "stage"), r22.A0B(r22.A0M("version"), "version"), 1000 * r22.A0E(r22.A0M("t"), "t")));
                        }
                        AnonymousClass2H7 r16 = this.A00;
                        Log.i("xmpp/reader/on-user-notice-received");
                        r16.A01.AZq(Message.obtain((Handler) null, 0, 216, 0, arrayList));
                        return;
                    } else if (r36.A0E(r2, 877) && C28371Vv.A07(A0I, "tos")) {
                        this.A00.A00(A0I, (C30641ci) null, 249);
                        return;
                    } else {
                        return;
                    }
                }
                r42.AZq(obtain2);
                return;
            }
            r4.AZq(message);
        }
    }
}
