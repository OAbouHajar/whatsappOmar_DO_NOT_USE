package X;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.facebook.redex.IDxRObservableShape442S0100000_1_I0;
import com.facebook.redex.RunnableRunnableShape14S0100000_I0_13;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0xf  reason: invalid class name and case insensitive filesystem */
public class C19040xf extends C16590tJ implements C19050xg {
    public C38091qE A00;
    public boolean A01;
    public boolean A02;
    public final long A03;
    public final Handler A04 = new C38081qD(Looper.getMainLooper(), this);
    public final C16300so A05;
    public final C15900s5 A06;
    public final C16600tK A07;
    public final C16440t3 A08;
    public final C14710pd A09;
    public final C17680vT A0A;
    public final AnonymousClass16W A0B;
    public final C17020u3 A0C;
    public final C38071qC A0D;
    public final AnonymousClass16X A0E;
    public final C16320sq A0F;
    public final AnonymousClass16Y A0G;
    public final Object A0H = new Object();
    public final Object A0I = new Object();
    public final AtomicBoolean A0J = new AtomicBoolean(false);
    public volatile C33571in A0K;

    public C19040xf(C16570tH r6, C16300so r7, C15900s5 r8, C16600tK r9, C16440t3 r10, C14710pd r11, C17680vT r12, AnonymousClass16W r13, C17020u3 r14, AnonymousClass16X r15, C16320sq r16, AnonymousClass16Y r17) {
        C38071qC r4 = new C38071qC();
        this.A08 = r10;
        this.A09 = r11;
        this.A0G = r17;
        this.A05 = r7;
        this.A0E = r15;
        this.A0F = r16;
        this.A06 = r8;
        this.A07 = r9;
        this.A0A = r12;
        this.A0C = r14;
        this.A0B = r13;
        this.A0D = r4;
        this.A03 = 1000;
        r6.A02(this);
    }

    public static String A01(String str, JSONObject jSONObject) {
        if (jSONObject.has(str)) {
            return jSONObject.getString(str);
        }
        return null;
    }

    public static Set A02(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            hashSet.add(jSONArray.getString(i2));
        }
        return hashSet;
    }

    public C38141qJ A04(C38101qF r22, int i2) {
        C38101qF r0 = r22;
        AnonymousClass00B.A0G(true);
        if (r0 instanceof C38111qG) {
            return new C38141qJ(new C38121qH(((C38111qG) r0).A02, this.A03));
        }
        int i3 = i2;
        if (r0 instanceof C38151qK) {
            C38151qK r02 = (C38151qK) r0;
            C38091qE A072 = A07();
            C16440t3 r6 = this.A08;
            C14710pd r7 = this.A09;
            AnonymousClass16Y r11 = this.A0G;
            C16300so r3 = this.A05;
            C15900s5 r4 = this.A06;
            C16600tK r5 = this.A07;
            C17680vT r8 = this.A0A;
            long j2 = this.A03;
            return new C38141qJ(new C38171qM(C38161qL.A01(r3, r4, r5, r6, r7, r8, this, A072, r11, r02.A02, (String) null, (String) null, i3, 0, j2, false, false), r02.A01, j2));
        } else if (r0 instanceof C38181qN) {
            C38181qN r03 = (C38181qN) r0;
            return A05(r03.A01, r03.A02, r03.A00, i3, false);
        } else {
            StringBuilder sb = new StringBuilder("Unknown url generator type: ");
            sb.append(r0);
            throw new AssertionError(sb.toString());
        }
    }

    public final C38141qJ A05(String str, String str2, String str3, int i2, boolean z2) {
        C38091qE A072 = A07();
        return new C38141qJ(C38161qL.A01(this.A05, this.A06, this.A07, this.A08, this.A09, this.A0A, this, A072, this.A0G, str, str2, str3, i2, 0, this.A03, false, z2));
    }

    public C38131qI A06(String str, String str2, String str3, int i2, int i3) {
        C38091qE A072 = A07();
        return C38161qL.A01(this.A05, this.A06, this.A07, this.A08, this.A09, this.A0A, this, A072, this.A0G, str, str2, str3, i2, i3, this.A03, false, false);
    }

    public C38091qE A07() {
        C38091qE r0;
        synchronized (this.A0H) {
            r0 = this.A00;
        }
        return r0;
    }

    public void A08() {
        boolean z2;
        Log.i("routeselector/requestroutesandwaitforauth");
        if (A0D()) {
            C38091qE r0 = this.A00;
            if (r0 == null || r0.A02 <= SystemClock.elapsedRealtime()) {
                Log.i("routeselector/requestroutesandwaitforauth/waiting for response");
                AnonymousClass00B.A00();
                long uptimeMillis = SystemClock.uptimeMillis();
                while (true) {
                    C38091qE r02 = this.A00;
                    if (r02 == null || r02.A02 <= SystemClock.elapsedRealtime()) {
                        C33571in r6 = this.A0K;
                        synchronized (r6) {
                            z2 = false;
                            if (r6.A00 > 0) {
                                z2 = true;
                            }
                        }
                        if (!z2) {
                            Log.w("routeselector/waitforroutingresponse/giving up because no request in flight");
                            return;
                        }
                        Object obj = this.A0I;
                        synchronized (obj) {
                            try {
                                obj.wait(1000);
                            } catch (InterruptedException e2) {
                                Log.w("routeselector/waitforroutingresponse/interrupted while waiting on route selection", e2);
                            }
                            C38091qE r03 = this.A00;
                            if (r03 == null || r03.A02 <= SystemClock.elapsedRealtime()) {
                                Log.w("routeselector/waitforroutingresponse/routing response still not available");
                            }
                            if (20000 + uptimeMillis < SystemClock.uptimeMillis()) {
                                Log.w("routeselector/waitforroutingresponse/waited too long for routing response! Give up");
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
                while (true) {
                }
            }
        }
    }

    public final void A09() {
        boolean z2;
        AnonymousClass16W r6 = this.A0B;
        synchronized (r6) {
            z2 = false;
            if (r6.A01.A00() <= r6.A00) {
                z2 = true;
            }
        }
        if (z2) {
            Log.i("routeselector/requestupdatedroutinginfo throttled");
            return;
        }
        C33571in r8 = this.A0K;
        C38091qE A072 = A07();
        String str = A072 == null ? null : A072.A09;
        synchronized (r8) {
            Log.i("routeselector/requestupdatedroutinginfo");
            if (r8.A00 == 0) {
                C17190ug r7 = r8.A02;
                String A022 = r7.A02();
                if (r7.A0G(r8, new C28371Vv(new C28371Vv("media_conn", str != null ? new C35081lL[]{new C35081lL("last_id", str)} : null), "iq", new C35081lL[]{new C35081lL((Jid) C34791ks.A00, "to"), new C35081lL("id", A022), new C35081lL("xmlns", "w:m"), new C35081lL("type", "set")}), A022, 124, 32000)) {
                    r8.A00 = SystemClock.elapsedRealtime();
                } else {
                    Log.i("app/sendgetmediaroutinginfo not sent");
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("routeselector/requestupdatedroutinginfo/not sending request; inFlightMediaRoutingRequestTime=");
            sb.append(r8.A00);
            Log.w(sb.toString());
        }
    }

    public final void A0A() {
        Log.i("routeselector/setuprouterequesttimer");
        C38091qE A072 = A07();
        if (A072 != null) {
            Handler handler = this.A04;
            handler.removeMessages(0);
            long elapsedRealtime = (A072.A02 - SystemClock.elapsedRealtime()) - 60000;
            StringBuilder sb = new StringBuilder("routeselector/settimerorupdateroutes/creating timer task with delay ");
            sb.append(elapsedRealtime);
            Log.i(sb.toString());
            handler.sendEmptyMessageDelayed(0, elapsedRealtime);
        }
    }

    public final void A0B() {
        if ((!this.A09.A0E(C16620tM.A02, 149) || this.A01) && this.A02) {
            this.A0F.Acl(new RunnableRunnableShape14S0100000_I0_13((Object) this, 8));
        }
    }

    public final void A0C(C38091qE r19) {
        C38211qQ r5;
        StringBuilder sb = new StringBuilder("routeselector/setroutinginfo/got a RoutingResponse with ");
        C38091qE r3 = r19;
        List list = r3.A0A;
        sb.append(list.size());
        sb.append(" route classes");
        Log.i(sb.toString());
        this.A0D.A00.A02();
        synchronized (this.A0H) {
            C38091qE r4 = this.A00;
            if (r4 == null || r3.A0B) {
                this.A00 = r3;
                for (C38221qR r42 : A01()) {
                    IDxRObservableShape442S0100000_1_I0 iDxRObservableShape442S0100000_1_I0 = (IDxRObservableShape442S0100000_1_I0) r42;
                    if (iDxRObservableShape442S0100000_1_I0.A01 != 0) {
                        C31681er r7 = (C31681er) iDxRObservableShape442S0100000_1_I0.A00;
                        if (r7.A01 != null) {
                            String str = r7.A0U.A02.A05.A02;
                            C38211qQ A002 = C38161qL.A00("fallback", str, (String) null, list, true);
                            C38211qQ A003 = C38161qL.A00("primary", str, (String) null, list, true);
                            if (A003 == null) {
                                A003 = A002;
                            }
                            C29561ap ABS = r7.A01.A00.ABS();
                            C29551ao r10 = (C29551ao) r7.A05.get();
                            if (!(ABS == null || A003 == null || ABS.A06.equals(A003.A04) || r10 == null || r7.A0U.A02.A02 - r7.A0h <= 52428800)) {
                                r10.A0E.set(true);
                            }
                        }
                    } else {
                        C30701co r8 = (C30701co) iDxRObservableShape442S0100000_1_I0.A00;
                        if (r8.A00 != null) {
                            C16440t3 r15 = r8.A0M;
                            C16300so r14 = r8.A0A;
                            C15900s5 r13 = r8.A0E;
                            C38241qT r43 = r8.A0a;
                            String str2 = r43.A09.A02;
                            String str3 = r43.A0E;
                            String str4 = r43.A0D;
                            boolean z2 = false;
                            if (2 == r43.A03) {
                                z2 = true;
                            }
                            C38211qQ A004 = C38161qL.A00("fallback", str2, (String) null, list, false);
                            String A032 = C38161qL.A03(r13, r15, str2, str4, z2);
                            if (((A032 == null && (A032 = C38161qL.A02(r14, r13, r3, str3)) == null) || (r5 = C38161qL.A00("primary", str2, A032, list, false)) == null) && (r5 = C38161qL.A00("primary", str2, "0", list, false)) == null && (r5 = C38161qL.A00("primary", str2, (String) null, list, false)) == null) {
                                r5 = A004;
                            }
                            C29561ap ABS2 = r8.A00.A00.ABS();
                            if (!(ABS2 == null || r5 == null || ABS2.A06.equals(r5.A04))) {
                                r8.A0s.set(true);
                            }
                        }
                    }
                }
            } else {
                List list2 = r4.A0A;
                this.A00 = new C38091qE(r3.A08, r3.A09, list2, r3.A00, r3.A01, r3.A05, r3.A03, r3.A06, r3.A07, false);
                Log.i("routeselector/setroutinginfo/previous hosts retained");
            }
        }
        Object obj = this.A0I;
        synchronized (obj) {
            obj.notifyAll();
        }
        A0A();
    }

    public final boolean A0D() {
        Log.i("routeselector/requestroutinginfoifnulloralmostexpired");
        if (this.A09.A0E(C16620tM.A02, 149) && this.A0J.compareAndSet(false, true)) {
            C38091qE r4 = null;
            String string = this.A0C.A00("route_selector_prefs").getString("media_conn", (String) null);
            C16440t3 r9 = this.A08;
            if (string != null) {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    String string2 = jSONObject.getString("auth_token");
                    long j2 = jSONObject.getLong("conn_ttl");
                    long j3 = jSONObject.getLong("auth_ttl");
                    long j4 = jSONObject.getLong("max_buckets");
                    JSONArray jSONArray = jSONObject.getJSONArray("hosts");
                    int length = jSONArray.length();
                    ArrayList arrayList = new ArrayList(length);
                    for (int i2 = 0; i2 < length; i2++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                        arrayList.add(new C38211qQ(jSONObject2.getString("hostname"), A01("ip4", jSONObject2), A01("ip6", jSONObject2), A01("class", jSONObject2), A01("fallback_hostname", jSONObject2), A01("fallback_ip4", jSONObject2), A01("fallback_ip6", jSONObject2), A01("fallback_class", jSONObject2), A01("type", jSONObject2), A02(jSONObject2.optJSONArray("upload")), A02(jSONObject2.optJSONArray("download")), A02(jSONObject2.optJSONArray("download_buckets")), jSONObject2.optBoolean("force_ip")));
                    }
                    String A012 = A01("last_id", jSONObject);
                    boolean z2 = jSONObject.getBoolean("is_new");
                    r4 = new C38091qE(string2, A012, arrayList, jSONObject.getInt("max_autodownload_retry"), jSONObject.getInt("max_manual_retry"), j2, j3, j4, (jSONObject.getLong("send_time_abs_ms") - r9.A00()) + SystemClock.elapsedRealtime(), z2);
                } catch (JSONException e2) {
                    Log.e("routingresponse/can't parse json", e2);
                }
            }
            synchronized (this.A0H) {
                if (this.A00 == null && r4 != null && r4.A02 > SystemClock.elapsedRealtime()) {
                    A0C(r4);
                }
            }
        }
        C38091qE A072 = A07();
        if (A072 != null) {
            StringBuilder sb = new StringBuilder("routeselector/isroutinginfonulloralmostexpired/expiring at ");
            long j5 = A072.A04;
            sb.append(j5);
            sb.append(" (");
            sb.append(j5 - SystemClock.elapsedRealtime());
            sb.append("ms from now)");
            Log.i(sb.toString());
            if (j5 > SystemClock.elapsedRealtime() + 120000) {
                if (this.A04.hasMessages(0)) {
                    return false;
                }
                A0A();
                return false;
            }
        }
        A09();
        return true;
    }

    public void AMV() {
        this.A01 = false;
    }

    public void AMW() {
        this.A01 = true;
        if (this.A09.A0E(C16620tM.A02, 149)) {
            A0B();
        }
    }
}
