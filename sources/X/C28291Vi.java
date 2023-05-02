package X;

import android.app.Notification;
import android.os.Build;
import com.whatsapp.util.Log;

/* renamed from: X.1Vi  reason: invalid class name and case insensitive filesystem */
public abstract class C28291Vi extends C28301Vj {
    public int A00 = -1;
    public AnonymousClass116 A01;
    public boolean A02;
    public final String A03;
    public final boolean A04;

    public C28291Vi(String str, boolean z2) {
        this.A03 = str;
        this.A04 = z2;
    }

    public void A01(int i2, Notification notification, int i3) {
        this.A00 = i2;
        try {
            startForeground(i3, notification);
            if (!this.A02) {
                this.A02 = true;
                if (Build.VERSION.SDK_INT >= 26) {
                    this.A01.A02(this);
                }
            }
        } catch (IllegalStateException e2) {
            StringBuilder sb = new StringBuilder("Failed to start foreground service ");
            sb.append(this.A03);
            Log.w(sb.toString(), e2);
            A02();
        }
    }

    public boolean A02() {
        boolean stopSelfResult = stopSelfResult(this.A04 ? -1 : this.A00);
        StringBuilder sb = new StringBuilder();
        sb.append(this.A03);
        sb.append("/Stop service success:");
        sb.append(stopSelfResult);
        Log.i(sb.toString());
        return stopSelfResult;
    }

    public void onCreate() {
        this.A02 = false;
        super.onCreate();
    }

    public void onDestroy() {
        super.onDestroy();
        this.A02 = false;
        this.A00 = -1;
    }
}
