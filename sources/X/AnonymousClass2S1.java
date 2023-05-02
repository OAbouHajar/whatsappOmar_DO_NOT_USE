package X;

import android.os.SystemClock;
import com.obwhatsapp.Main;
import com.whatsapp.util.Log;

/* renamed from: X.2S1  reason: invalid class name */
public class AnonymousClass2S1 extends C16690tT {
    public final /* synthetic */ Main A00;

    public AnonymousClass2S1(Main main) {
        this.A00 = main;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Main main;
        int i2 = 0;
        while (true) {
            main = this.A00;
            if (main.A0A.A13) {
                if (i2 >= 45000) {
                    break;
                }
                i2 += 200;
                SystemClock.sleep(200);
            } else if (i2 < 45000) {
                return null;
            }
        }
        if (!main.A0A.A13) {
            return null;
        }
        main.A0A.A0C(3);
        return null;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        Main main = this.A00;
        AnonymousClass29T.A00(main, 104);
        Log.i("main/gotoActivity");
        main.A39();
    }
}
