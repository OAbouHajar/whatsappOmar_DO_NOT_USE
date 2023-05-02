package X;

import android.content.Context;
import com.obwhatsapp.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.66U  reason: invalid class name */
public final /* synthetic */ class AnonymousClass66U implements Runnable {
    public final /* synthetic */ C110745el A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ List A02;

    public /* synthetic */ AnonymousClass66U(C110745el r1, List list, List list2) {
        this.A00 = r1;
        this.A01 = list;
        this.A02 = list2;
    }

    public final void run() {
        C110745el r4 = this.A00;
        List list = this.A01;
        List list2 = this.A02;
        ArrayList A0u = AnonymousClass000.A0u();
        Context context = r4.A02.A00;
        C113685mS r1 = new C113685mS(context.getString(R.string.str18fc));
        r1.A00 = context.getString(R.string.str1900);
        A0u.add(r1);
        C113725mW r12 = new C113725mW();
        r12.A01 = r4;
        r12.A02 = context.getString(R.string.str18fb);
        r12.A03 = context.getString(R.string.str18ff);
        r12.A00 = C110115dX.A06(r4, 124);
        r12.A05 = list;
        A0u.add(r12);
        C113735mX r2 = new C113735mX(102);
        C113725mW r13 = new C113725mW();
        r13.A01 = r4;
        r13.A04 = context.getString(R.string.str18fe);
        r13.A02 = context.getString(R.string.str18fd);
        r13.A03 = context.getString(R.string.str18ff);
        r13.A05 = list2;
        r13.A00 = C110115dX.A06(r4, 123);
        A0u.add(r2);
        A0u.add(r13);
        A0u.add(r2);
        A0u.add(new C113745mY(1007));
        r4.A01.A0B(A0u);
    }
}
