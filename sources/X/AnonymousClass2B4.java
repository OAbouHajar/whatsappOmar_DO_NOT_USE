package X;

import android.widget.BaseAdapter;
import com.obwhatsapp.status.playback.MyStatusesActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2B4  reason: invalid class name */
public class AnonymousClass2B4 extends BaseAdapter {
    public List A00 = new ArrayList();
    public final /* synthetic */ MyStatusesActivity A01;

    public AnonymousClass2B4(MyStatusesActivity myStatusesActivity) {
        this.A01 = myStatusesActivity;
    }

    public int getCount() {
        return this.A00.size();
    }

    public /* bridge */ /* synthetic */ Object getItem(int i2) {
        return this.A00.get(i2);
    }

    public long getItemId(int i2) {
        return (long) i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x016c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r18, android.view.View r19, android.view.ViewGroup r20) {
        /*
            r17 = this;
            r5 = r19
            r4 = r17
            if (r19 != 0) goto L_0x0248
            com.obwhatsapp.status.playback.MyStatusesActivity r3 = r4.A01
            android.view.LayoutInflater r2 = r3.getLayoutInflater()
            r1 = 2131559418(0x7f0d03fa, float:1.874418E38)
            r0 = 0
            r5 = r20
            android.view.View r5 = r2.inflate(r1, r5, r0)
            X.4Ox r0 = new X.4Ox
            r0.<init>(r5, r3)
            r5.setTag(r0)
        L_0x001e:
            java.util.List r1 = r4.A00
            r2 = r18
            java.lang.Object r4 = r1.get(r2)
            X.0tZ r4 = (X.C16740tZ) r4
            boolean r1 = r4 instanceof X.C38701rH
            r3 = 0
            if (r1 == 0) goto L_0x01d2
            com.obwhatsapp.status.playback.MyStatusesActivity r2 = r0.A0A
            boolean r1 = r2.A0v
            if (r1 == 0) goto L_0x01d2
            r1 = r4
            X.1rH r1 = (X.C38701rH) r1
            int r1 = X.AnonymousClass47Y.A00(r2, r1)
            android.graphics.drawable.Drawable r2 = X.AnonymousClass47Z.A00(r2, r1)
            com.obwhatsapp.status.ContactStatusThumbnail r1 = r0.A09
            r1.setImageDrawable(r2)
        L_0x0043:
            java.lang.String r1 = ""
            android.text.SpannableStringBuilder r9 = new android.text.SpannableStringBuilder
            r9.<init>(r1)
            com.obwhatsapp.status.playback.MyStatusesActivity r8 = r0.A0A
            X.0rz r1 = r8.A09
            boolean r16 = r1.A1i()
            android.widget.TextView r11 = r0.A06
            android.view.View r10 = r0.A00
            android.content.Context r2 = r10.getContext()
            r1 = 2131100933(0x7f060505, float:1.7814261E38)
            int r1 = X.AnonymousClass00T.A00(r2, r1)
            boolean r15 = X.C38621r6.A0o(r4)
            r7 = 0
            r6 = 8
            if (r15 == 0) goto L_0x016c
            r11.setVisibility(r3)
            r1 = 2131887802(0x7f1206ba, float:1.9410221E38)
        L_0x0070:
            r11.setText(r1)
        L_0x0073:
            java.util.Map r11 = r8.A17
            X.1Vw r2 = r4.A11
            boolean r12 = r11.containsKey(r2)
            r1 = 0
            if (r12 == 0) goto L_0x0081
            r1 = 2131100872(0x7f0604c8, float:1.7814138E38)
        L_0x0081:
            r10.setBackgroundResource(r1)
            java.util.Set r1 = r8.A18
            boolean r10 = r1.remove(r2)
            com.obwhatsapp.components.SelectionCheckView r1 = r0.A08
            if (r10 == 0) goto L_0x0167
            android.view.ViewTreeObserver r10 = r1.getViewTreeObserver()
            X.4l1 r1 = new X.4l1
            r1.<init>(r0, r12)
            r10.addOnPreDrawListener(r1)
        L_0x009a:
            boolean r1 = r4 instanceof X.C16730tY
            if (r1 == 0) goto L_0x00a3
            r1 = r4
            X.0tY r1 = (X.C16730tY) r1
            X.0ta r7 = r1.A02
        L_0x00a3:
            if (r15 == 0) goto L_0x00c8
            android.widget.ProgressBar r1 = r0.A05
            r1.setVisibility(r3)
            android.widget.ImageView r10 = r0.A03
            r10.setVisibility(r6)
            android.view.View r1 = r0.A02
            r1.setVisibility(r6)
            android.widget.TextView r11 = r0.A07
            r11.setVisibility(r6)
        L_0x00b9:
            r10.setTag(r4)
            r11.setTag(r4)
            r1.setTag(r4)
            X.01D r0 = r8.A0r
            r0.get()
            return r5
        L_0x00c8:
            if (r7 == 0) goto L_0x00db
            boolean r1 = r7.A0P
            if (r1 != 0) goto L_0x00db
            boolean r1 = r4 instanceof X.C38711rI
            if (r1 == 0) goto L_0x0149
            r1 = r4
            X.1rK r1 = (X.C38731rK) r1
            boolean r1 = X.AnonymousClass20C.A03(r1)
            if (r1 == 0) goto L_0x0149
        L_0x00db:
            boolean r1 = r11.isEmpty()
            r7 = 1
            r1 = r1 ^ 1
            android.widget.ImageView r10 = r0.A03
            if (r1 == 0) goto L_0x013b
            r10.setVisibility(r6)
        L_0x00e9:
            java.util.HashMap r1 = r8.A14
            java.lang.Object r13 = r1.get(r2)
            java.lang.Number r13 = (java.lang.Number) r13
            android.widget.TextView r11 = r0.A07
            if (r13 != 0) goto L_0x0106
            r11.setVisibility(r6)
            com.obwhatsapp.status.playback.MyStatusesActivity.A02(r4, r8, r3)
        L_0x00fb:
            android.widget.ProgressBar r1 = r0.A05
            r1.setVisibility(r6)
        L_0x0100:
            android.view.View r1 = r0.A02
            r1.setVisibility(r6)
            goto L_0x00b9
        L_0x0106:
            r11.setVisibility(r3)
            X.013 r15 = r8.A0G
            r14 = 2131755396(0x7f100184, float:1.914167E38)
            int r1 = r13.intValue()
            long r1 = (long) r1
            java.lang.Object[] r12 = new java.lang.Object[r7]
            r12[r3] = r13
            java.lang.String r12 = r15.A0J(r12, r14, r1)
            r11.setContentDescription(r12)
            if (r16 == 0) goto L_0x0131
            X.013 r12 = r8.A0G
            r9 = 2131755254(0x7f1000f6, float:1.9141382E38)
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r3] = r13
            java.lang.String r1 = r12.A0J(r7, r9, r1)
            r11.setText(r1)
            goto L_0x00fb
        L_0x0131:
            int r1 = r9.length()
            if (r1 <= 0) goto L_0x00fb
            r11.setText(r9)
            goto L_0x00fb
        L_0x013b:
            r10.setVisibility(r3)
            r1 = 2131889582(0x7f120dae, float:1.9413832E38)
            java.lang.String r1 = r8.getString(r1)
            r10.setContentDescription(r1)
            goto L_0x00e9
        L_0x0149:
            android.widget.ImageView r10 = r0.A03
            r10.setVisibility(r6)
            android.widget.TextView r11 = r0.A07
            r11.setVisibility(r6)
            boolean r2 = r7.A0Z
            android.widget.ProgressBar r1 = r0.A05
            if (r2 == 0) goto L_0x015d
            r1.setVisibility(r3)
            goto L_0x0100
        L_0x015d:
            r1.setVisibility(r6)
            android.view.View r1 = r0.A02
            r1.setVisibility(r3)
            goto L_0x00b9
        L_0x0167:
            r1.A04(r12, r3)
            goto L_0x009a
        L_0x016c:
            r2 = 4
            int r1 = r4.A0C
            boolean r1 = X.C42881yp.A02(r1, r2)
            if (r1 == 0) goto L_0x01a4
            r1 = 8
            if (r16 == 0) goto L_0x017a
            r1 = 0
        L_0x017a:
            r11.setVisibility(r1)
            long r1 = r4.A0H
            r13 = 0
            int r12 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r12 > 0) goto L_0x0187
            long r1 = r4.A0I
        L_0x0187:
            X.0t3 r13 = r8.A05
            X.013 r12 = r8.A0G
            long r1 = r13.A02(r1)
            java.lang.CharSequence r2 = X.C28961Zl.A01(r12, r1)
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>(r2)
            if (r16 == 0) goto L_0x019f
            r11.setText(r1)
            goto L_0x0073
        L_0x019f:
            r9.append(r1)
            goto L_0x0073
        L_0x01a4:
            r11.setVisibility(r3)
            boolean r1 = r4 instanceof X.C16730tY
            if (r1 == 0) goto L_0x01cd
            r1 = r4
            X.0tY r1 = (X.C16730tY) r1
            X.0ta r2 = r1.A02
            if (r2 == 0) goto L_0x01cd
            boolean r1 = r2.A0P
            if (r1 != 0) goto L_0x01cd
            boolean r1 = r2.A0Z
            if (r1 != 0) goto L_0x01cd
            r1 = 2131891471(0x7f12150f, float:1.9417663E38)
            r11.setText(r1)
            android.content.Context r2 = r10.getContext()
            r1 = 2131101508(0x7f060744, float:1.7815428E38)
            int r1 = X.AnonymousClass00T.A00(r2, r1)
            goto L_0x0073
        L_0x01cd:
            r1 = 2131891472(0x7f121510, float:1.9417665E38)
            goto L_0x0070
        L_0x01d2:
            boolean r1 = r4 instanceof X.C16730tY
            if (r1 == 0) goto L_0x01f6
            r1 = r4
            X.0tY r1 = (X.C16730tY) r1
            X.0ta r1 = r1.A02
            X.AnonymousClass00B.A06(r1)
            boolean r7 = r1.A03()
            com.obwhatsapp.status.playback.MyStatusesActivity r1 = r0.A0A
            X.1Ld r6 = r1.A0o
            com.obwhatsapp.status.ContactStatusThumbnail r2 = r0.A09
            X.52d r1 = r1.A0m
            if (r7 != 0) goto L_0x01f1
            r6.A08(r2, r4, r1)
            goto L_0x0043
        L_0x01f1:
            r6.A07(r2, r4, r1)
            goto L_0x0043
        L_0x01f6:
            byte r1 = r4.A10
            if (r1 != 0) goto L_0x023d
            java.lang.String r14 = X.C47622Js.A05(r4)
            r1 = r4
            X.1cc r1 = (X.C30581cc) r1
            com.obwhatsapp.TextData r10 = r1.A02
            com.obwhatsapp.status.playback.MyStatusesActivity r8 = r0.A0A
            X.0um r12 = r8.A0B
            X.01V r11 = r8.A08
            X.0u3 r13 = r8.A0Y
            if (r14 == 0) goto L_0x0219
            int r2 = r14.length()
            r1 = 700(0x2bc, float:9.81E-43)
            if (r2 <= r1) goto L_0x0219
            java.lang.String r14 = r14.substring(r3, r1)
        L_0x0219:
            android.view.View r1 = r0.A00
            android.content.Context r2 = r1.getContext()
            if (r10 != 0) goto L_0x0236
            android.graphics.Typeface r9 = android.graphics.Typeface.SANS_SERIF
        L_0x0223:
            X.2nU r7 = new X.2nU
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            com.obwhatsapp.status.ContactStatusThumbnail r6 = r0.A09
            float r2 = r6.A01
            r1 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r1
            r7.A00 = r2
            r6.setImageDrawable(r7)
            goto L_0x0043
        L_0x0236:
            int r1 = r10.fontStyle
            android.graphics.Typeface r9 = X.C47622Js.A03(r2, r1)
            goto L_0x0223
        L_0x023d:
            com.obwhatsapp.status.ContactStatusThumbnail r2 = r0.A09
            int r1 = X.C1036352d.A00(r4)
            r2.setImageResource(r1)
            goto L_0x0043
        L_0x0248:
            java.lang.Object r0 = r5.getTag()
            X.4Ox r0 = (X.C85554Ox) r0
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2B4.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
