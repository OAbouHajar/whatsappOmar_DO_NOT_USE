package X;

import android.widget.EditText;
import android.widget.TextView;
import com.facebook.redex.IDxDCompatShape23S0100000_2_I1;
import com.obwhatsapp.R;

/* renamed from: X.35O  reason: invalid class name */
public class AnonymousClass35O extends C41651wK {
    public int A00;
    public Runnable A01;
    public final int A02;
    public final int A03;
    public final EditText A04;
    public final TextView A05;
    public final AnonymousClass01V A06;
    public final AnonymousClass013 A07;
    public final C17250um A08;
    public final C17020u3 A09;
    public final boolean A0A;

    public AnonymousClass35O(EditText editText, TextView textView, AnonymousClass01V r8, AnonymousClass013 r9, C17250um r10, C17020u3 r11, int i2, int i3, boolean z2) {
        this.A08 = r10;
        this.A06 = r8;
        this.A07 = r9;
        this.A09 = r11;
        this.A04 = editText;
        this.A05 = textView;
        this.A02 = i2;
        this.A03 = i3;
        this.A0A = z2;
        C004601z.A0j(editText, new IDxDCompatShape23S0100000_2_I1(this, 4));
        if (textView != null) {
            long j2 = (long) i2;
            Object[] A1b = C13680ns.A1b();
            AnonymousClass000.A1M(A1b, i2, 0);
            textView.setContentDescription(r9.A0J(A1b, R.plurals.plurals016c, j2));
            if (i2 != 0 && i3 == 0) {
                textView.setText(r9.A0K().format(j2));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
        if (r10 < r1) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0097, code lost:
        if (r10 != r8) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009a, code lost:
        r7.setVisibility(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void afterTextChanged(android.text.Editable r13) {
        /*
            r12 = this;
            boolean r0 = r12.A0A
            android.widget.EditText r4 = r12.A04
            r7 = r13
            if (r0 == 0) goto L_0x009e
            android.content.Context r5 = r4.getContext()
            X.0um r9 = r12.A08
            X.01V r8 = r12.A06
            X.0u3 r10 = r12.A09
            android.text.TextPaint r6 = r4.getPaint()
            X.C45922Bq.A06(r5, r6, r7, r8, r9, r10)
        L_0x0018:
            int r8 = r12.A02
            if (r8 <= 0) goto L_0x008a
            java.lang.Runnable r1 = r12.A01
            if (r1 == 0) goto L_0x0025
            android.widget.TextView r0 = r12.A05
            r0.removeCallbacks(r1)
        L_0x0025:
            java.lang.String r6 = r13.toString()
            int r9 = X.C31011dK.A00(r6)
            android.widget.TextView r7 = r12.A05
            if (r7 == 0) goto L_0x006c
            int r10 = r8 - r9
            int r1 = r12.A03
            if (r1 <= 0) goto L_0x0096
            r0 = 8
            if (r10 >= r1) goto L_0x009a
        L_0x003b:
            r0 = 17
            com.facebook.redex.RunnableRunnableShape1S0101000_I1 r2 = new com.facebook.redex.RunnableRunnableShape1S0101000_I1
            r2.<init>((java.lang.Object) r12, (int) r10, (int) r0)
            r12.A01 = r2
            r0 = 1000(0x3e8, double:4.94E-321)
            r7.postDelayed(r2, r0)
            r11 = 0
            r7.setVisibility(r11)
            X.013 r5 = r12.A07
            java.text.NumberFormat r0 = r5.A0K()
            long r2 = (long) r10
            java.lang.String r0 = r0.format(r2)
            r7.setText(r0)
            r1 = 2131755372(0x7f10016c, float:1.9141621E38)
            java.lang.Object[] r0 = X.C13680ns.A1b()
            X.AnonymousClass000.A1M(r0, r10, r11)
            java.lang.String r0 = r5.A0J(r0, r1, r2)
            r7.setContentDescription(r0)
        L_0x006c:
            if (r9 < r8) goto L_0x008b
            int r0 = r12.A00
            if (r0 != 0) goto L_0x008b
            int r1 = r4.getInputType()
            r12.A00 = r1
            if (r1 == 0) goto L_0x008a
            r0 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 | r0
            r4.setInputType(r1)
            r4.setText(r6)
            int r0 = r6.length()
            r4.setSelection(r0)
        L_0x008a:
            return
        L_0x008b:
            int r0 = r12.A00
            if (r0 == 0) goto L_0x008a
            r4.setInputType(r0)
            r0 = 0
            r12.A00 = r0
            return
        L_0x0096:
            r0 = 4
            if (r10 == r8) goto L_0x009a
            goto L_0x003b
        L_0x009a:
            r7.setVisibility(r0)
            goto L_0x006c
        L_0x009e:
            android.content.Context r3 = r4.getContext()
            android.text.TextPaint r2 = r4.getPaint()
            X.0um r1 = r12.A08
            r0 = 1067869798(0x3fa66666, float:1.3)
            X.AnonymousClass2Sy.A07(r3, r2, r13, r1, r0)
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass35O.afterTextChanged(android.text.Editable):void");
    }
}
