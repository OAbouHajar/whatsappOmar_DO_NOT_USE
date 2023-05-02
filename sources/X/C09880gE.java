package X;

import android.view.View;
import android.view.ViewPropertyAnimator;
import com.facebook.redex.IDxLAdapterShape0S0400000_I1;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0gE  reason: invalid class name and case insensitive filesystem */
public class C09880gE implements Runnable {
    public final /* synthetic */ AnonymousClass0Fr A00;
    public final /* synthetic */ ArrayList A01;

    public C09880gE(AnonymousClass0Fr r1, ArrayList arrayList) {
        this.A00 = r1;
        this.A01 = arrayList;
    }

    public void run() {
        ArrayList arrayList = this.A01;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C005602k r9 = (C005602k) it.next();
            AnonymousClass0Fr r8 = this.A00;
            View view = r9.A0H;
            ViewPropertyAnimator animate = view.animate();
            r8.A00.add(r9);
            animate.alpha(1.0f).setDuration(r8.A04()).setListener(new IDxLAdapterShape0S0400000_I1(view, animate, r8, r9, 1)).start();
        }
        arrayList.clear();
        this.A00.A01.remove(arrayList);
    }
}
