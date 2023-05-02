package X;

import android.os.Handler;
import android.os.Message;
import com.obwhatsapp.profile.SetAboutInfo;

/* renamed from: X.2cG  reason: invalid class name and case insensitive filesystem */
public class C51782cG extends AnonymousClass2Qh {
    public final /* synthetic */ C51772cF A00;
    public final /* synthetic */ C51762cE A01;
    public final /* synthetic */ C40841um A02;
    public final /* synthetic */ C51542bq A03;
    public final /* synthetic */ String A04;

    public C51782cG(C51772cF r1, C51762cE r2, C40841um r3, C51542bq r4, String str) {
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = str;
        this.A02 = r3;
        this.A00 = r1;
    }

    public void A01(int i2) {
        this.A02.Ach(i2);
    }

    public void A02(C28371Vv r5) {
        C51762cE r0 = this.A01;
        String str = this.A04;
        SetAboutInfo setAboutInfo = r0.A00;
        setAboutInfo.A06 = true;
        Handler handler = setAboutInfo.A07;
        handler.removeMessages(0);
        handler.sendMessage(Message.obtain(handler, 1, str));
    }
}
