package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

/* renamed from: X.066  reason: invalid class name */
public class AnonymousClass066 implements LayoutInflater.Factory2 {
    public final AnonymousClass02C A00;

    public AnonymousClass066(AnonymousClass02C r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a5, code lost:
        if (r3 != null) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ad, code lost:
        if (r8 == null) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00af, code lost:
        if (r6 == -1) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b1, code lost:
        r8 = r11.A00.A08(r6);
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x016c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(android.view.View r12, java.lang.String r13, android.content.Context r14, android.util.AttributeSet r15) {
        /*
            r11 = this;
            java.lang.Class<androidx.fragment.app.FragmentContainerView> r0 = androidx.fragment.app.FragmentContainerView.class
            java.lang.String r0 = r0.getName()
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x0014
            X.02C r1 = r11.A00
            androidx.fragment.app.FragmentContainerView r0 = new androidx.fragment.app.FragmentContainerView
            r0.<init>((android.content.Context) r14, (android.util.AttributeSet) r15, (X.AnonymousClass02C) r1)
            return r0
        L_0x0014:
            java.lang.String r0 = "fragment"
            boolean r0 = r0.equals(r13)
            r8 = 0
            if (r0 == 0) goto L_0x01c4
            java.lang.String r0 = "class"
            java.lang.String r2 = r15.getAttributeValue(r8, r0)
            int[] r0 = X.AnonymousClass0NC.A00
            android.content.res.TypedArray r1 = r14.obtainStyledAttributes(r15, r0)
            if (r2 != 0) goto L_0x0030
            r0 = 0
            java.lang.String r2 = r1.getString(r0)
        L_0x0030:
            r0 = 1
            r5 = -1
            int r4 = r1.getResourceId(r0, r5)
            r0 = 2
            java.lang.String r3 = r1.getString(r0)
            r1.recycle()
            if (r2 == 0) goto L_0x01c4
            java.lang.ClassLoader r7 = r14.getClassLoader()
            X.00O r0 = X.AnonymousClass06B.A01     // Catch:{ ClassNotFoundException -> 0x006d }
            java.lang.Object r6 = r0.get(r7)     // Catch:{ ClassNotFoundException -> 0x006d }
            X.00O r6 = (X.AnonymousClass00O) r6     // Catch:{ ClassNotFoundException -> 0x006d }
            if (r6 != 0) goto L_0x0056
            X.00O r6 = new X.00O     // Catch:{ ClassNotFoundException -> 0x006d }
            r6.<init>()     // Catch:{ ClassNotFoundException -> 0x006d }
            r0.put(r7, r6)     // Catch:{ ClassNotFoundException -> 0x006d }
        L_0x0056:
            java.lang.Object r1 = r6.get(r2)     // Catch:{ ClassNotFoundException -> 0x006d }
            java.lang.Class r1 = (java.lang.Class) r1     // Catch:{ ClassNotFoundException -> 0x006d }
            if (r1 != 0) goto L_0x0066
            r0 = 0
            java.lang.Class r1 = java.lang.Class.forName(r2, r0, r7)     // Catch:{ ClassNotFoundException -> 0x006d }
            r6.put(r2, r1)     // Catch:{ ClassNotFoundException -> 0x006d }
        L_0x0066:
            java.lang.Class<X.01A> r0 = X.AnonymousClass01A.class
            boolean r0 = r0.isAssignableFrom(r1)     // Catch:{ ClassNotFoundException -> 0x006d }
            goto L_0x006e
        L_0x006d:
            r0 = 0
        L_0x006e:
            if (r0 == 0) goto L_0x01c4
            if (r12 == 0) goto L_0x009a
            int r6 = r12.getId()
            if (r6 != r5) goto L_0x009b
            if (r4 != r5) goto L_0x009b
            if (r3 != 0) goto L_0x00a7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r15.getPositionDescription()
            r1.append(r0)
            java.lang.String r0 = ": Must specify unique android:id, android:tag, or have a parent with an id for "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x009a:
            r6 = 0
        L_0x009b:
            if (r4 == r5) goto L_0x00a5
            X.02C r0 = r11.A00
            X.01A r8 = r0.A08(r4)
            if (r8 != 0) goto L_0x00b7
        L_0x00a5:
            if (r3 == 0) goto L_0x00af
        L_0x00a7:
            X.02C r0 = r11.A00
            X.01A r8 = r0.A0B(r3)
            if (r8 != 0) goto L_0x00b7
        L_0x00af:
            if (r6 == r5) goto L_0x00b7
            X.02C r0 = r11.A00
            X.01A r8 = r0.A08(r6)
        L_0x00b7:
            java.lang.String r7 = "Fragment "
            java.lang.String r5 = "FragmentManager"
            r10 = 2
            r9 = 1
            if (r8 != 0) goto L_0x013e
            X.02C r1 = r11.A00
            X.06B r0 = r1.A0C()
            r14.getClassLoader()
            X.01A r8 = r0.A00(r2)
            r8.A0Y = r9
            r0 = r6
            if (r4 == 0) goto L_0x00d2
            r0 = r4
        L_0x00d2:
            r8.A02 = r0
            r8.A01 = r6
            r8.A0R = r3
            r8.A0c = r9
            r8.A0H = r1
            X.061 r0 = r1.A07
            r8.A0F = r0
            r8.A0V = r9
            if (r0 == 0) goto L_0x00e9
            r0 = 0
            r8.A0V = r0
            r8.A0V = r9
        L_0x00e9:
            X.0WQ r6 = r1.A0D(r8)
            boolean r0 = X.AnonymousClass02C.A02(r10)
            if (r0 == 0) goto L_0x0111
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            r1.append(r8)
            java.lang.String r0 = " has been inflated via the <fragment> tag: id=0x"
        L_0x0100:
            r1.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r4)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.v(r5, r0)
        L_0x0111:
            android.view.ViewGroup r12 = (android.view.ViewGroup) r12
            r8.A0B = r12
            r6.A04()
            r6.A03()
            android.view.View r0 = r8.A0A
            if (r0 == 0) goto L_0x016c
            if (r4 == 0) goto L_0x0124
            r0.setId(r4)
        L_0x0124:
            android.view.View r0 = r8.A0A
            java.lang.Object r0 = r0.getTag()
            if (r0 != 0) goto L_0x0131
            android.view.View r0 = r8.A0A
            r0.setTag(r3)
        L_0x0131:
            android.view.View r1 = r8.A0A
            X.0Yb r0 = new X.0Yb
            r0.<init>(r11, r6)
            r1.addOnAttachStateChangeListener(r0)
            android.view.View r0 = r8.A0A
            return r0
        L_0x013e:
            boolean r0 = r8.A0c
            if (r0 != 0) goto L_0x0186
            r8.A0c = r9
            X.02C r1 = r11.A00
            r8.A0H = r1
            X.061 r0 = r1.A07
            r8.A0F = r0
            r8.A0V = r9
            if (r0 == 0) goto L_0x0155
            r0 = 0
            r8.A0V = r0
            r8.A0V = r9
        L_0x0155:
            X.0WQ r6 = r1.A0E(r8)
            boolean r0 = X.AnonymousClass02C.A02(r10)
            if (r0 == 0) goto L_0x0111
            java.lang.String r0 = "Retained Fragment "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r8)
            java.lang.String r0 = " has been re-attached via the <fragment> tag: id=0x"
            goto L_0x0100
        L_0x016c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            r1.append(r2)
            java.lang.String r0 = " did not create a view."
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0186:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r15.getPositionDescription()
            r1.append(r0)
            java.lang.String r0 = ": Duplicate id 0x"
            r1.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r4)
            r1.append(r0)
            java.lang.String r0 = ", tag "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ", or parent id 0x"
            r1.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r6)
            r1.append(r0)
            java.lang.String r0 = " with another fragment for "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x01c4:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass066.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }
}
