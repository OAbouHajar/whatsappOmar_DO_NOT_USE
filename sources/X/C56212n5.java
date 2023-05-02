package X;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.facebook.redex.RunnableRunnableShape3S0300000_I1;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2n5  reason: invalid class name and case insensitive filesystem */
public abstract class C56212n5 extends Service {
    public int A00;
    public int A01;
    public Binder A02;
    public final Object A03;
    public final ExecutorService A04;

    public C56212n5() {
        String A0c = AnonymousClass000.A0c(this);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C14160oi(A0c.length() != 0 ? "Firebase-".concat(A0c) : new String("Firebase-")));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.A04 = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.A03 = C13690nt.A0Y();
        this.A01 = 0;
    }

    public final C14210on A00(Intent intent) {
        if ("com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
            if (pendingIntent != null) {
                try {
                    pendingIntent.send();
                } catch (PendingIntent.CanceledException unused) {
                    Log.e("FirebaseMessaging", "Notification pending intent canceled");
                }
            }
            if (C616939y.A01(intent)) {
                if ("1".equals(intent.getStringExtra("google.c.a.tc"))) {
                    C13720nx A002 = C13720nx.A00();
                    A002.A02();
                    A002.A02.A02(AnonymousClass5MK.class);
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                    }
                    Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                }
                C616939y.A00(intent, "_no");
            }
            C14210on r1 = new C14210on();
            r1.A08((Object) null);
            return r1;
        }
        C14370p3 r3 = new C14370p3();
        this.A04.execute(new RunnableRunnableShape3S0300000_I1(this, intent, r3, 4));
        return r3.A00;
    }

    public final void A01(Intent intent) {
        if (intent != null) {
            synchronized (C82054Ay.A02) {
                if (C82054Ay.A00 != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    C82054Ay.A00.A00();
                }
            }
        }
        synchronized (this.A03) {
            int i2 = this.A01 - 1;
            this.A01 = i2;
            if (i2 == 0) {
                stopSelfResult(this.A00);
            }
        }
    }

    public abstract void A02(Intent intent);

    public final synchronized IBinder onBind(Intent intent) {
        Binder binder;
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        binder = this.A02;
        if (binder == null) {
            binder = new AnonymousClass3LR(new AnonymousClass4CB(this));
            this.A02 = binder;
        }
        return binder;
    }

    public void onDestroy() {
        this.A04.shutdown();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i2, int i3) {
        synchronized (this.A03) {
            this.A00 = i3;
            this.A01++;
        }
        Intent intent2 = (Intent) C16680tS.A00().A03.poll();
        if (intent2 != null) {
            C14210on A002 = A00(intent2);
            if (!A002.A09()) {
                A002.A03.A00(new C98874t7(new C98784sy(intent, this), AnonymousClass58K.A00));
                A002.A04();
                return 3;
            }
        }
        A01(intent);
        return 2;
    }
}
