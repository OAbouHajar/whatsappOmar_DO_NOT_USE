package X;

import com.whatsapp.util.Log;

/* renamed from: X.2Jy  reason: invalid class name and case insensitive filesystem */
public class C47682Jy extends C40831ul implements Runnable, C40841um {
    public int A00 = 60;
    public C34841kx A01;
    public final AnonymousClass11A A02;

    public C47682Jy(AnonymousClass11A r2, C34841kx r3) {
        this.A02 = r2;
        this.A01 = r3;
    }

    public void Ach(int i2) {
        StringBuilder sb = new StringBuilder("BroadcastListResponseHandler/request failed : ");
        sb.append(i2);
        sb.append(" | ");
        C34841kx r2 = this.A01;
        sb.append(r2);
        sb.append(" | ");
        sb.append(this.A00);
        Log.e(sb.toString());
        this.A01.cancel();
        this.A02.A08(r2, false);
    }

    public void run() {
        this.A01.cancel();
        StringBuilder sb = new StringBuilder("BroadcastListResponseHandler/request success/");
        sb.append(this.A00);
        Log.i(sb.toString());
    }
}
