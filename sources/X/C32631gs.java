package X;

import android.content.Context;
import android.os.Handler;
import com.facebook.redex.RunnableRunnableShape2S0100000_I0_1;
import com.whatsapp.anr.SigquitBasedANRDetector;
import com.whatsapp.util.Log;

/* renamed from: X.1gs  reason: invalid class name and case insensitive filesystem */
public class C32631gs {
    public int A00 = 0;
    public long A01;
    public C32651gu A02;
    public final Context A03;
    public final AnonymousClass01V A04;

    public C32631gs(Context context, AnonymousClass01V r3) {
        this.A03 = context;
        this.A04 = r3;
    }

    public final synchronized void A00(C32641gt r6, String str, String str2, int i2) {
        Handler handler;
        RunnableRunnableShape2S0100000_I0_1 runnableRunnableShape2S0100000_I0_1;
        if (this.A02.A02 == this.A01) {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2 || i2 == 3) {
                        this.A00 = 0;
                    } else {
                        this.A00 = 0;
                        Log.e("SigquitBasedANRDetector/onCheckFailed");
                    }
                    SigquitBasedANRDetector sigquitBasedANRDetector = r6.A01;
                    if (sigquitBasedANRDetector.A09 != null) {
                        handler = sigquitBasedANRDetector.A09;
                        runnableRunnableShape2S0100000_I0_1 = new RunnableRunnableShape2S0100000_I0_1(r6, 34);
                    }
                } else {
                    this.A00 = 2;
                    StringBuilder sb = new StringBuilder("SigquitBasedANRDetector/On error detected ");
                    sb.append(str);
                    sb.append(" ");
                    sb.append(str2);
                    Log.i(sb.toString());
                    SigquitBasedANRDetector sigquitBasedANRDetector2 = r6.A01;
                    if (sigquitBasedANRDetector2.A09 != null) {
                        handler = sigquitBasedANRDetector2.A09;
                        runnableRunnableShape2S0100000_I0_1 = new RunnableRunnableShape2S0100000_I0_1(r6, 33);
                    }
                }
                handler.post(runnableRunnableShape2S0100000_I0_1);
            } else {
                Log.i("SigquitBasedANRDetector/Started monitoring");
            }
        }
    }
}
