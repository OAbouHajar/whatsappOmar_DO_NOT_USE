package X;

import android.content.Intent;
import android.os.SystemClock;
import android.view.View;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.ViewOnClickCListenerShape1S0200000_I1;
import com.whatsapp.util.ViewOnClickCListenerShape1S0300000_I1;
import com.whatsapp.util.ViewOnClickCListenerShape4S0100000_I1;
import com.whatsapp.util.ViewOnClickCListenerShape5S0100000_I1_1;
import com.whatsapp.util.ViewOnClickCListenerShape6S0100000_I1_2;

/* renamed from: X.1k5  reason: invalid class name and case insensitive filesystem */
public abstract class C34331k5 implements View.OnClickListener {
    public long A00;

    public static Intent A00(Jid jid, C39721sx r10) {
        String rawString = jid.getRawString();
        String rawString2 = r10.A06.getRawString();
        long j2 = r10.A05;
        double d2 = r10.A00;
        double d3 = r10.A01;
        Intent intent = new Intent();
        intent.putExtra("jid", rawString);
        intent.putExtra("final_location_jid", rawString2);
        intent.putExtra("final_location_timestamp", j2);
        intent.putExtra("final_location_latitude", d2);
        intent.putExtra("final_location_longitude", d3);
        return intent;
    }

    public static void A01(View view, Object obj, int i2) {
        view.setOnClickListener(new ViewOnClickCListenerShape4S0100000_I1(obj, i2));
    }

    public static void A02(View view, Object obj, int i2) {
        view.setOnClickListener(new ViewOnClickCListenerShape6S0100000_I1_2(obj, i2));
    }

    public static void A03(View view, Object obj, int i2) {
        view.setOnClickListener(new ViewOnClickCListenerShape5S0100000_I1_1(obj, i2));
    }

    public static void A04(View view, Object obj, Object obj2, int i2) {
        view.setOnClickListener(new ViewOnClickCListenerShape1S0200000_I1(obj, i2, obj2));
    }

    public static void A05(View view, Object obj, Object obj2, Object obj3, int i2) {
        view.setOnClickListener(new ViewOnClickCListenerShape1S0300000_I1(obj, obj2, obj3, i2));
    }

    public abstract void A06(View view);

    public void onClick(View view) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.A00 > 1000) {
            this.A00 = elapsedRealtime;
            A06(view);
        }
    }
}
