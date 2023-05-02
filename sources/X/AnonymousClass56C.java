package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.56C  reason: invalid class name */
public final /* synthetic */ class AnonymousClass56C implements Runnable {
    public final /* synthetic */ AnonymousClass1BN A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ Map A04;

    public /* synthetic */ AnonymousClass56C(AnonymousClass1BN r1, String str, String str2, String str3, Map map) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = map;
    }

    public final void run() {
        AnonymousClass01D r1;
        String A0O;
        String A0Q;
        AnonymousClass1BN r3 = this.A00;
        String str = this.A01;
        String str2 = this.A02;
        String str3 = this.A03;
        Map map = this.A04;
        AnonymousClass1KP r2 = (AnonymousClass1KP) r3.A03.get();
        synchronized (r3) {
            r1 = r3.A04;
            A0O = ((C15860rz) r1.get()).A0O();
            TextUtils.isEmpty(A0O);
        }
        synchronized (r3) {
            A0Q = ((C15860rz) r1.get()).A0Q();
            TextUtils.isEmpty(A0Q);
        }
        synchronized (r3) {
        }
        r2.A08();
        byte[] A0C = r2.A0C(A0O, A0Q);
        byte[] A0B = r2.A0B("sendClientFunnelLog");
        Log.i("http/registration/wamsys/sendclientfunnellog");
        C31591ei.A00(new C79333zi(r2.A00, r2.A0L, A0O, A0Q, str, str2, str3, map, A0C, A0B));
    }
}
