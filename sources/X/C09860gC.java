package X;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0gC  reason: invalid class name and case insensitive filesystem */
public class C09860gC implements Runnable {
    public final /* synthetic */ AnonymousClass0Fr A00;
    public final /* synthetic */ ArrayList A01;

    public C09860gC(AnonymousClass0Fr r1, ArrayList arrayList) {
        this.A00 = r1;
        this.A01 = arrayList;
    }

    public void run() {
        ArrayList arrayList = this.A01;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C04950Oq r3 = (C04950Oq) it.next();
            AnonymousClass0Fr r8 = this.A00;
            C005602k r9 = r3.A04;
            int i2 = r3.A00;
            int i3 = r3.A01;
            int i4 = r3.A02;
            int i5 = r3.A03;
            View view = r9.A0H;
            int i6 = i4 - i2;
            int i7 = i5 - i3;
            if (i6 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i7 != 0) {
                view.animate().translationY(0.0f);
            }
            ViewPropertyAnimator animate = view.animate();
            r8.A04.add(r9);
            animate.setDuration(r8.A06()).setListener(new AnonymousClass09u(view, animate, r8, r9, i6, i7)).start();
        }
        arrayList.clear();
        this.A00.A05.remove(arrayList);
    }
}
