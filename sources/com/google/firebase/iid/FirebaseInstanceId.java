package com.google.firebase.iid;

import X.AnonymousClass1NO;
import X.C13720nx;
import X.C13780o4;
import X.C13910oH;
import X.C14090ob;
import X.C14100oc;
import X.C14110od;
import X.C14120oe;
import X.C14130of;
import X.C14140og;
import X.C14150oh;
import X.C14160oi;
import X.C14170oj;
import X.C14180ok;
import X.C14190ol;
import X.C14200om;
import X.C14210on;
import X.C14220oo;
import X.C14250or;
import X.C14300ow;
import X.C14310ox;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.redex.RunnableRunnableShape0S0300100_I0;
import com.facebook.redex.RunnableRunnableShape1S0100000_I0;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

public class FirebaseInstanceId {
    public static C14110od A08;
    public static ScheduledExecutorService A09;
    public static final long A0A = TimeUnit.HOURS.toSeconds(8);
    public boolean A00 = false;
    public final C13720nx A01;
    public final C14140og A02;
    public final C14090ob A03;
    public final C14150oh A04;
    public final C14130of A05;
    public final C14120oe A06;
    public final Executor A07;

    public FirebaseInstanceId(C13720nx r23, C13910oH r24, C13780o4 r25) {
        C13720nx r2 = r23;
        r2.A02();
        Context context = r2.A00;
        C14090ob r0 = new C14090ob(context);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        ThreadFactory threadFactory = C14100oc.A00;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, timeUnit, linkedBlockingQueue, threadFactory);
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(0, 1, 30, timeUnit, new LinkedBlockingQueue(), threadFactory);
        if (C14090ob.A00(r2) != null) {
            synchronized (FirebaseInstanceId.class) {
                if (A08 == null) {
                    r2.A02();
                    A08 = new C14110od(context);
                }
            }
            this.A01 = r2;
            this.A03 = r0;
            this.A06 = new C14120oe(r2, r0, r25, threadPoolExecutor);
            this.A07 = threadPoolExecutor2;
            this.A05 = new C14130of(A08);
            this.A02 = new C14140og(r24, this);
            this.A04 = new C14150oh(threadPoolExecutor);
            threadPoolExecutor2.execute(new RunnableRunnableShape1S0100000_I0((Object) this, 20));
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }

    public static C14170oj A00(String str, String str2) {
        C14170oj r4;
        C14170oj r2;
        C14110od r3 = A08;
        synchronized (r3) {
            r4 = null;
            String string = r3.A01.getString(C14110od.A01(str, str2), (String) null);
            if (!TextUtils.isEmpty(string)) {
                if (string.startsWith("{")) {
                    try {
                        JSONObject jSONObject = new JSONObject(string);
                        r2 = new C14170oj(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
                    } catch (JSONException e2) {
                        String valueOf = String.valueOf(e2);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 23);
                        sb.append("Failed to parse token: ");
                        sb.append(valueOf);
                        Log.w("FirebaseInstanceId", sb.toString());
                    }
                } else {
                    r2 = new C14170oj(string, (String) null, 0);
                }
                r4 = r2;
            }
        }
        return r4;
    }

    public static String A01() {
        C14180ok r0;
        C14110od r3 = A08;
        synchronized (r3) {
            Map map = r3.A03;
            r0 = (C14180ok) map.get("");
            if (r0 == null) {
                try {
                    C14190ol r8 = r3.A02;
                    Context context = r3.A00;
                    C14200om e2 = null;
                    File A042 = C14190ol.A04(context);
                    if (A042.exists()) {
                        try {
                            r0 = C14190ol.A02(A042);
                        } catch (C14200om | IOException e3) {
                            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                                String valueOf = String.valueOf(e3);
                                StringBuilder sb = new StringBuilder(valueOf.length() + 39);
                                sb.append("Failed to read ID from file, retrying: ");
                                sb.append(valueOf);
                                Log.d("FirebaseInstanceId", sb.toString());
                            }
                            try {
                                r0 = C14190ol.A02(A042);
                            } catch (IOException e4) {
                                String valueOf2 = String.valueOf(e4);
                                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 45);
                                sb2.append("IID file exists, but failed to read from it: ");
                                sb2.append(valueOf2);
                                Log.w("FirebaseInstanceId", sb2.toString());
                                throw new C14200om(e4);
                            } catch (C14200om e5) {
                                e2 = e5;
                            }
                        }
                        C14190ol.A06(context, r0);
                        map.put("", r0);
                    }
                    try {
                        r0 = C14190ol.A01(context.getSharedPreferences("com.google.android.gms.appid", 0));
                        if (r0 != null) {
                            C14190ol.A00(context, r0, false);
                        } else {
                            if (e2 == null) {
                                r0 = r8.A07(context);
                            }
                            throw e2;
                        }
                        map.put("", r0);
                    } catch (C14200om e6) {
                        e2 = e6;
                    }
                } catch (C14200om unused) {
                    Log.w("FirebaseInstanceId", "Stored data is corrupt, generating new identity");
                    getInstance(C13720nx.A00()).A07();
                    r0 = r3.A02.A07(r3.A00);
                }
            }
        }
        return r0.A01;
    }

    public static void A02(Runnable runnable, long j2) {
        synchronized (FirebaseInstanceId.class) {
            ScheduledExecutorService scheduledExecutorService = A09;
            if (scheduledExecutorService == null) {
                scheduledExecutorService = new ScheduledThreadPoolExecutor(1, new C14160oi("FirebaseInstanceId"));
                A09 = scheduledExecutorService;
            }
            scheduledExecutorService.schedule(runnable, j2, TimeUnit.SECONDS);
        }
    }

    public static boolean A03() {
        if (!Log.isLoggable("FirebaseInstanceId", 3)) {
            return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseInstanceId", 3);
        }
        return true;
    }

    public static FirebaseInstanceId getInstance(C13720nx r2) {
        r2.A02();
        return (FirebaseInstanceId) r2.A02.A02(FirebaseInstanceId.class);
    }

    public final Object A04(C14210on r4) {
        try {
            return C14310ox.A00(r4, TimeUnit.MILLISECONDS, AnonymousClass1NO.A0L);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    A07();
                }
            } else if (!(cause instanceof RuntimeException)) {
                throw new IOException(e2);
            }
            throw cause;
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    public String A05(String str, String str2) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            if (str2.isEmpty() || str2.equalsIgnoreCase("fcm") || str2.equalsIgnoreCase("gcm")) {
                str2 = "*";
            }
            C14210on r5 = new C14210on();
            r5.A08((Object) null);
            Executor executor = this.A07;
            C14220oo r3 = new C14220oo(this, str, str2);
            C14210on r2 = new C14210on();
            r5.A03.A00(new C14250or(r3, r2, executor));
            r5.A04();
            return ((C14300ow) A04(r2)).A00;
        }
        throw new IOException("MAIN_THREAD");
    }

    public final void A06() {
        boolean z2;
        if (!A0B(A00(C14090ob.A00(this.A01), "*"))) {
            C14130of r2 = this.A05;
            synchronized (r2) {
                z2 = false;
                if (r2.A00() != null) {
                    z2 = true;
                }
            }
            if (!z2) {
                return;
            }
        }
        A08();
    }

    public final synchronized void A07() {
        A08.A02();
        if (this.A02.A00()) {
            A08();
        }
    }

    public final synchronized void A08() {
        if (!this.A00) {
            A09(0);
        }
    }

    public final synchronized void A09(long j2) {
        synchronized (this) {
            A02(new RunnableRunnableShape0S0300100_I0(this, this.A05, Math.min(Math.max(30, j2 << 1), A0A)), j2);
            this.A00 = true;
        }
    }

    public final synchronized void A0A(boolean z2) {
        this.A00 = z2;
    }

    public final boolean A0B(C14170oj r8) {
        if (r8 != null) {
            return System.currentTimeMillis() > r8.A00 + C14170oj.A03 || !this.A03.A05().equals(r8.A02);
        }
    }
}
