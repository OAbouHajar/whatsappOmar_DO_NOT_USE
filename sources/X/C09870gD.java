package X;

import android.view.View;
import android.view.ViewPropertyAnimator;
import com.facebook.redex.IDxLAdapterShape0S0400000_I1;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0gD  reason: invalid class name and case insensitive filesystem */
public class C09870gD implements Runnable {
    public final /* synthetic */ AnonymousClass0Fr A00;
    public final /* synthetic */ ArrayList A01;

    public C09870gD(AnonymousClass0Fr r1, ArrayList arrayList) {
        this.A00 = r1;
        this.A01 = arrayList;
    }

    public void run() {
        ArrayList arrayList = this.A01;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C05250Pw r10 = (C05250Pw) it.next();
            AnonymousClass0Fr r11 = this.A00;
            C005602k r0 = r10.A05;
            View view = null;
            View view2 = r0 == null ? null : r0.A0H;
            C005602k r02 = r10.A04;
            if (r02 != null) {
                view = r02.A0H;
            }
            if (view2 != null) {
                ViewPropertyAnimator duration = view2.animate().setDuration(r11.A05());
                r11.A02.add(r10.A05);
                duration.translationX((float) (r10.A02 - r10.A00));
                duration.translationY((float) (r10.A03 - r10.A01));
                duration.alpha(0.0f).setListener(new IDxLAdapterShape0S0400000_I1(view2, duration, r10, r11, 2)).start();
            }
            if (view != null) {
                ViewPropertyAnimator animate = view.animate();
                r11.A02.add(r10.A04);
                animate.translationX(0.0f).translationY(0.0f).setDuration(r11.A05()).alpha(1.0f).setListener(new IDxLAdapterShape0S0400000_I1(view, animate, r10, r11, 3)).start();
            }
        }
        arrayList.clear();
        this.A00.A03.remove(arrayList);
    }
}
