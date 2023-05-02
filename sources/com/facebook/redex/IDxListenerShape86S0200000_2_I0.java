package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass01D;
import X.AnonymousClass1A7;
import X.C13680ns;
import X.C15860rz;
import X.C17420v3;
import X.C29541an;
import android.content.SharedPreferences;
import android.os.ConditionVariable;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Map;

public class IDxListenerShape86S0200000_2_I0 implements C29541an {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxListenerShape86S0200000_2_I0(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public /* synthetic */ void AP3(String str) {
    }

    public void APP(long j2) {
        if (this.A02 == 0) {
            ((File) this.A01).delete();
        }
    }

    public void AQb(String str) {
        if (this.A02 != 0) {
            AnonymousClass1A7 r4 = (AnonymousClass1A7) this.A00;
            AnonymousClass01D r3 = r4.A06.A01;
            int i2 = C13680ns.A0B((C15860rz) r3.get()).getInt("qpl_failed_upload_count", 0) + 1;
            SharedPreferences.Editor A0K = ((C15860rz) r3.get()).A0K();
            (i2 == 0 ? A0K.remove("qpl_failed_upload_count") : A0K.putInt("qpl_failed_upload_count", i2)).apply();
            if (i2 >= 5) {
                C17420v3 r2 = r4.A05;
                StringBuilder A0q = AnonymousClass000.A0q(str);
                A0q.append(" (");
                A0q.append(i2);
                r2.A8f(AnonymousClass000.A0h(")", A0q));
            }
            r4.A00 = false;
            ((ConditionVariable) this.A01).open();
            return;
        }
        Log.e(AnonymousClass000.A0h(str, AnonymousClass000.A0r("ProfiloUpload/Error: ")));
    }

    public void AWH(String str, Map map) {
        if (this.A02 != 0) {
            AnonymousClass1A7 r1 = (AnonymousClass1A7) this.A00;
            r1.A00 = true;
            ((C15860rz) r1.A06.A01.get()).A0K().remove("qpl_failed_upload_count").apply();
            ((ConditionVariable) this.A01).open();
        }
    }
}
