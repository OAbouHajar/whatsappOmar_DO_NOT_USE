package X;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.WeakHashMap;

/* renamed from: X.06o  reason: invalid class name and case insensitive filesystem */
public class C013606o implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
    public final WeakHashMap A00 = new WeakHashMap();

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0037, code lost:
        if (r3.getWindowVisibility() != 0) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGlobalLayout() {
        /*
            r6 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 >= r0) goto L_0x004d
            java.util.WeakHashMap r5 = r6.A00
            java.util.Set r0 = r5.entrySet()
            java.util.Iterator r4 = r0.iterator()
        L_0x0010:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x004d
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r3 = r0.getKey()
            android.view.View r3 = (android.view.View) r3
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r2 = r0.booleanValue()
            boolean r0 = r3.isShown()
            if (r0 == 0) goto L_0x0039
            int r0 = r3.getWindowVisibility()
            r1 = 1
            if (r0 == 0) goto L_0x003a
        L_0x0039:
            r1 = 0
        L_0x003a:
            if (r2 == r1) goto L_0x0010
            r0 = 32
            if (r1 == 0) goto L_0x0042
            r0 = 16
        L_0x0042:
            X.C004601z.A0Z(r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r5.put(r3, r0)
            goto L_0x0010
        L_0x004d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C013606o.onGlobalLayout():void");
    }

    public void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    public void onViewDetachedFromWindow(View view) {
    }
}
