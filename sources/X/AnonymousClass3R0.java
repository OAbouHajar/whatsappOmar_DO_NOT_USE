package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.ViewOnClickCListenerShape5S0200000_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.WaTextView;
import java.util.List;

/* renamed from: X.3R0  reason: invalid class name */
public class AnonymousClass3R0 extends AnonymousClass01X {
    public final AnonymousClass013 A00;
    public final List A01;

    public AnonymousClass3R0(AnonymousClass013 r1, List list) {
        this.A01 = list;
        this.A00 = r1;
    }

    public int A0C() {
        return this.A01.size();
    }

    public void ANf(C005602k r7, int i2) {
        int i3 = r7.A02;
        boolean z2 = true;
        if (i3 == 0) {
            AnonymousClass3SF r72 = (AnonymousClass3SF) r7;
            AnonymousClass4D9 r0 = (AnonymousClass4D9) this.A01.get(i2);
            if (i2 == 0) {
                z2 = false;
            }
            WaTextView waTextView = r72.A01;
            C13690nt.A0s(waTextView.getContext(), waTextView, r0.A00);
            View view = r72.A00;
            int i4 = 8;
            if (z2) {
                i4 = 0;
            }
            view.setVisibility(i4);
        } else if (i3 == 1) {
            WaTextView waTextView2 = ((C64853Rx) r7).A00;
            C13690nt.A0s(waTextView2.getContext(), waTextView2, ((AnonymousClass4D9) this.A01.get(i2)).A00);
        } else if (i3 == 2) {
            AnonymousClass3SO r73 = (AnonymousClass3SO) r7;
            C71473kR r4 = (C71473kR) ((AnonymousClass4D9) this.A01.get(i2));
            WaTextView waTextView3 = r73.A01;
            C13690nt.A0s(waTextView3.getContext(), waTextView3, r4.A00);
            WaTextView waTextView4 = r73.A02;
            String str = r4.A01;
            waTextView4.setText(str);
            int i5 = r4.A00;
            if (i5 == 1) {
                C13680ns.A0v(waTextView4.getContext(), waTextView4, R.color.color00d1);
                C13680ns.A1B(waTextView4, r73, r4, 10);
            } else if (i5 == 2) {
                waTextView4.setText(r73.A03.A00.A0H(C24561Gk.A00(C26071Mf.A00(), str)));
                WaImageView waImageView = r73.A00;
                Context context = waImageView.getContext();
                Intent intent = new Intent("android.intent.action.DIAL", Uri.fromParts("tel", str, (String) null));
                if (intent.resolveActivity(context.getPackageManager()) != null) {
                    waImageView.setVisibility(0);
                    waImageView.setOnClickListener(new ViewOnClickCListenerShape5S0200000_I1(context, intent, 9));
                }
            }
        }
    }

    public C005602k APF(ViewGroup viewGroup, int i2) {
        if (i2 == 0) {
            return new AnonymousClass3SF(C13680ns.A0G(viewGroup).inflate(R.layout.layout00a6, viewGroup, false), this);
        }
        LayoutInflater A0G = C13680ns.A0G(viewGroup);
        return i2 != 1 ? new AnonymousClass3SO(A0G.inflate(R.layout.layout00a7, viewGroup, false), this) : new C64853Rx(A0G.inflate(R.layout.layout00a5, viewGroup, false), this);
    }

    public int getItemViewType(int i2) {
        List list = this.A01;
        if (list.get(i2) instanceof C71463kQ) {
            return 0;
        }
        return list.get(i2) instanceof C71453kP ? 1 : 2;
    }
}
