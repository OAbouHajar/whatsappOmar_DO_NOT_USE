package X;

import android.os.Handler;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: X.1in  reason: invalid class name and case insensitive filesystem */
public class C33571in implements C19550yc {
    public long A00 = 0;
    public final C16440t3 A01;
    public final C17190ug A02;
    public final C19040xf A03;

    public C33571in(C16440t3 r3, C17190ug r4, C19040xf r5) {
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
    }

    public void APb(String str) {
        synchronized (this) {
            this.A00 = 0;
        }
        Log.w("routeselector/on delivery failure");
        StringBuilder sb = new StringBuilder("routeselector/onmediaroutingrequesterror/code ");
        sb.append(0);
        Log.w(sb.toString());
    }

    public void AQe(C28371Vv r11, String str) {
        synchronized (this) {
            this.A00 = 0;
        }
        for (C28371Vv r3 : r11.A0O("error")) {
            if (r3 != null) {
                try {
                    int A0A = r3.A0A("code", 0);
                    if (A0A != 0) {
                        Pair pair = new Pair(Integer.valueOf(A0A), Integer.valueOf(r3.A0A("backoff", 0)));
                        C19040xf r4 = this.A03;
                        int intValue = ((Number) pair.first).intValue();
                        int intValue2 = ((Number) pair.second).intValue();
                        StringBuilder sb = new StringBuilder("routeselector/onmediaroutingrequesterror/code ");
                        sb.append(intValue);
                        Log.w(sb.toString());
                        if (503 == intValue) {
                            AnonymousClass16W r2 = r4.A0B;
                            synchronized (r2) {
                                r2.A00 = 0;
                                Log.i("ChatdMediaThrottleManager/resetThrottle");
                            }
                            Handler handler = r4.A04;
                            C38071qC r42 = r4.A0D;
                            long A012 = r42.A00.A01();
                            long j2 = 0;
                            if (A012 != 0) {
                                long j3 = A012 * 1000;
                                j2 = ((3 * j3) / 4) + Math.abs(r42.A01.nextLong() % (j3 / 2));
                                StringBuilder sb2 = new StringBuilder("fibonaccibackoffhandler/sleep/");
                                sb2.append(j2);
                                sb2.append(" milliseconds");
                                Log.i(sb2.toString());
                            }
                            handler.sendEmptyMessageDelayed(0, j2);
                            return;
                        } else if (507 == intValue && intValue2 > 0) {
                            AnonymousClass16W r6 = r4.A0B;
                            long j4 = (long) intValue2;
                            synchronized (r6) {
                                long A002 = r6.A01.A00() + (Math.min(j4, 10800) * 1000);
                                r6.A00 = A002;
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("ChatdMediaThrottleManager/setThrottle until ");
                                sb3.append(A002);
                                Log.i(sb3.toString());
                            }
                            return;
                        } else {
                            return;
                        }
                    }
                } catch (AnonymousClass1W9 e2) {
                    Log.e("MediaConnFactory/getErrorCodeAndBackoffFromIqResponse CorruptStreamException ", e2);
                }
            }
        }
    }

    public void AYG(C28371Vv r45, String str) {
        long j2;
        synchronized (this) {
            j2 = this.A00;
            this.A00 = 0;
        }
        C19040xf r2 = this.A03;
        C28371Vv A0K = r45.A0K("media_conn");
        String A0N = A0K.A0N("id", (String) null);
        String A0M = A0K.A0M("auth");
        long A0E = A0K.A0E(A0K.A0M("ttl"), "ttl");
        long A0E2 = A0K.A0E(A0K.A0M("auth_ttl"), "auth_ttl");
        long A0D = A0K.A0D("max_buckets", 0);
        int A0A = A0K.A0A("is_new", 1);
        int A0A2 = A0K.A0A("max_auto_download_retry", 3);
        int A0A3 = A0K.A0A("max_manual_retry", 3);
        C28371Vv[] r6 = A0K.A03;
        ArrayList arrayList = new ArrayList();
        if (r6 != null) {
            for (C28371Vv r0 : r6) {
                if ("host".equals(r0.A00)) {
                    String A0M2 = r0.A0M("hostname");
                    String A0N2 = r0.A0N("ip4", (String) null);
                    String A0N3 = r0.A0N("ip6", (String) null);
                    String A0N4 = r0.A0N("class", (String) null);
                    String A0N5 = r0.A0N("fallback_hostname", (String) null);
                    String A0N6 = r0.A0N("fallback_ip4", (String) null);
                    String A0N7 = r0.A0N("fallback_ip6", (String) null);
                    String A0N8 = r0.A0N("fallback_class", (String) null);
                    C28371Vv A0J = r0.A0J("upload");
                    Set set = AnonymousClass2NJ.A00;
                    arrayList.add(new C38211qQ(A0M2, A0N2, A0N3, A0N4, A0N5, A0N6, A0N7, A0N8, r0.A0N("type", (String) null), AnonymousClass2NJ.A00(A0J, set), AnonymousClass2NJ.A00(r0.A0J("download"), set), AnonymousClass2NJ.A00(r0.A0J("download_buckets"), (Set) null), "true".equals(r0.A0N("force_ip", (String) null))));
                }
            }
        }
        boolean z2 = false;
        if (A0A == 1) {
            z2 = true;
        }
        C38091qE r29 = new C38091qE(A0M, A0N, arrayList, A0A2, A0A3, A0E, A0E2, A0D, j2, z2);
        AnonymousClass16W r3 = r2.A0B;
        synchronized (r3) {
            r3.A00 = 0;
            Log.i("ChatdMediaThrottleManager/resetThrottle");
        }
        r2.A0C(r29);
        if (r2.A09.A0E(C16620tM.A02, 149)) {
            r2.A0C.A00("route_selector_prefs").edit().putString("media_conn", AnonymousClass2NK.A00(r2.A08, r2.A07())).apply();
        }
    }
}
