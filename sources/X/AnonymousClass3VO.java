package X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.redex.IDxSCallerShape402S0100000_2_I1;
import java.util.HashMap;

/* renamed from: X.3VO  reason: invalid class name */
public abstract class AnonymousClass3VO extends C97294pi {
    public Handler A00;
    public AnonymousClass5LZ A01;
    public final HashMap A02 = AnonymousClass000.A0x();

    public void A01() {
        HashMap hashMap = this.A02;
        for (AnonymousClass4JY r2 : hashMap.values()) {
            AnonymousClass2PW r1 = r2.A01;
            r1.Abm(r2.A00);
            r1.Abw(r2.A02);
        }
        hashMap.clear();
    }

    public void A03(AnonymousClass5LZ r4) {
        this.A01 = r4;
        Looper myLooper = Looper.myLooper();
        C90524eJ.A01(myLooper);
        this.A00 = new Handler(myLooper, (Handler.Callback) null);
    }

    public final void A04(AnonymousClass2PW r7) {
        HashMap hashMap = this.A02;
        C90524eJ.A03(!hashMap.containsKey((Object) null));
        IDxSCallerShape402S0100000_2_I1 iDxSCallerShape402S0100000_2_I1 = new IDxSCallerShape402S0100000_2_I1(this, 1);
        C97314pk r5 = new C97314pk(this);
        hashMap.put((Object) null, new AnonymousClass4JY(iDxSCallerShape402S0100000_2_I1, r7, r5));
        C97294pi r3 = (C97294pi) r7;
        r3.A03.A02.add(new AnonymousClass4GG(this.A00, r5));
        r3.A02.A02.add(new AnonymousClass4G7(this.A00, r5));
        r7.Aan(iDxSCallerShape402S0100000_2_I1, this.A01);
        if (!(!this.A05.isEmpty())) {
            r7.A7x(iDxSCallerShape402S0100000_2_I1);
        }
    }

    public void ALW() {
        if (!(this instanceof AnonymousClass3VN)) {
            for (AnonymousClass4JY r0 : this.A02.values()) {
                r0.A01.ALW();
            }
        }
    }
}
