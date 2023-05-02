package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import java.util.Calendar;
import java.util.List;

/* renamed from: X.5f0  reason: invalid class name and case insensitive filesystem */
public class C110895f0 extends AnonymousClass01X implements C54622hr {
    public Context A00;
    public List A01 = AnonymousClass000.A0u();
    public List A02 = AnonymousClass000.A0u();

    public C110895f0(Context context) {
        this.A00 = context;
    }

    public int A0C() {
        return this.A02.size();
    }

    public int AB1(int i2) {
        return ((AnonymousClass67Q) this.A01.get(i2)).count;
    }

    public int ACY() {
        return this.A01.size();
    }

    public long ACZ(int i2) {
        return -((Calendar) this.A01.get(i2)).getTimeInMillis();
    }

    public /* bridge */ /* synthetic */ void ANd(C005602k r3, int i2) {
        ((C110955f6) r3).A00.setText(this.A01.get(i2).toString());
    }

    public void ANf(C005602k r3, int i2) {
        AnonymousClass5m0 r32 = (AnonymousClass5m0) r3;
        r32.A07((C116245r4) this.A02.get(i2), i2);
        if (!((C113905mo) this.A02.get(i2)).A02) {
            r32.A00.setVisibility(8);
        }
    }

    public /* bridge */ /* synthetic */ C005602k APB(ViewGroup viewGroup) {
        Context context = this.A00;
        return new C110955f6(C110115dX.A03(context, LayoutInflater.from(context), viewGroup, R.layout.layout05bc));
    }

    public C005602k APF(ViewGroup viewGroup, int i2) {
        return new AnonymousClass5m0(C13680ns.A0H(C110105dW.A07(viewGroup), viewGroup, R.layout.layout0489));
    }

    public /* bridge */ /* synthetic */ boolean AXu(MotionEvent motionEvent, C005602k r3, int i2) {
        return false;
    }
}
