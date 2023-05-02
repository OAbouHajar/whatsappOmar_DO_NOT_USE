package X;

import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.0oo  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C14220oo implements C14230op {
    public final FirebaseInstanceId A00;
    public final String A01;
    public final String A02;

    public C14220oo(FirebaseInstanceId firebaseInstanceId, String str, String str2) {
        this.A00 = firebaseInstanceId;
        this.A01 = str;
        this.A02 = str2;
    }

    public final Object Agh(C14210on r13) {
        C14210on r5;
        FirebaseInstanceId firebaseInstanceId = this.A00;
        String str = this.A01;
        String str2 = this.A02;
        String A012 = FirebaseInstanceId.A01();
        C14170oj A002 = FirebaseInstanceId.A00(str, str2);
        if (!firebaseInstanceId.A0B(A002)) {
            C14300ow r0 = new C14300ow(A002.A01);
            C14210on r52 = new C14210on();
            r52.A08(r0);
            return r52;
        }
        C14150oh r7 = firebaseInstanceId.A04;
        C84604Le r4 = new C84604Le(firebaseInstanceId, A012, str, str2);
        synchronized (r7) {
            Pair pair = new Pair(str, str2);
            Map map = r7.A00;
            r5 = (C14210on) map.get(pair);
            if (r5 == null) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf = String.valueOf(pair);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 24);
                    sb.append("Making new request for: ");
                    sb.append(valueOf);
                    Log.d("FirebaseInstanceId", sb.toString());
                }
                FirebaseInstanceId firebaseInstanceId2 = r4.A00;
                String str3 = r4.A01;
                String str4 = r4.A02;
                String str5 = r4.A03;
                C14120oe r1 = firebaseInstanceId2.A06;
                C14210on A03 = r1.A03(r1.A01(new Bundle(), str3, str4, str5));
                Executor executor = firebaseInstanceId2.A07;
                C98864t6 r2 = new C98864t6(firebaseInstanceId2, str4, str5, str3);
                C14210on r42 = new C14210on();
                A03.A03.A00(new C98754sv(r2, r42, executor));
                A03.A04();
                Executor executor2 = r7.A01;
                C98744su r22 = new C98744su(pair, r7);
                r5 = new C14210on();
                r42.A03.A00(new C14250or(r22, r5, executor2));
                r42.A04();
                map.put(pair, r5);
            } else if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf2 = String.valueOf(pair);
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 29);
                sb2.append("Joining ongoing request for: ");
                sb2.append(valueOf2);
                Log.d("FirebaseInstanceId", sb2.toString());
            }
        }
        return r5;
    }
}
