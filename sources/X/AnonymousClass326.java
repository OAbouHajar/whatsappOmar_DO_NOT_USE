package X;

import android.database.ContentObserver;
import android.database.Cursor;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import com.obwhatsapp.gallery.DocumentsGalleryFragment;
import java.util.Calendar;

/* renamed from: X.326  reason: invalid class name */
public class AnonymousClass326 extends AnonymousClass3R5 implements C54622hr {
    public int A00;
    public final ContentObserver A01 = new AnonymousClass3Ks(AnonymousClass000.A0L(), this);
    public final /* synthetic */ DocumentsGalleryFragment A02;

    public AnonymousClass326(DocumentsGalleryFragment documentsGalleryFragment) {
        this.A02 = documentsGalleryFragment;
    }

    public int A0C() {
        return this.A00;
    }

    public Cursor A0E(Cursor cursor) {
        int i2;
        Cursor cursor2 = this.A01;
        if (cursor2 != null) {
            cursor2.unregisterContentObserver(this.A01);
        }
        if (cursor != null) {
            cursor.registerContentObserver(this.A01);
            i2 = cursor.getCount();
        } else {
            i2 = 0;
        }
        this.A00 = i2;
        return super.A0E(cursor);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00da, code lost:
        if (1 != r5.A06()) goto L_0x00dc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0F(android.database.Cursor r10, X.C005602k r11) {
        /*
            r9 = this;
            X.3Sl r11 = (X.C64993Sl) r11
            X.0tt r10 = (X.C16930tt) r10
            X.0tY r5 = r10.A00()
            X.AnonymousClass00B.A06(r5)
            X.1rA r5 = (X.C38631rA) r5
            r11.A00 = r5
            android.widget.ImageView r1 = r11.A05
            com.obwhatsapp.gallery.DocumentsGalleryFragment r4 = r11.A0B
            android.content.Context r0 = r4.A0u()
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4Y6.A00(r0, r5)
            r1.setImageDrawable(r0)
            java.lang.String r0 = r5.A13()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            android.widget.TextView r6 = r11.A09
            if (r0 == 0) goto L_0x0137
            java.lang.String r0 = r5.A14()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x012e
            java.lang.String r0 = r5.A14()
            java.lang.String r0 = X.AnonymousClass1XI.A09(r0)
        L_0x003c:
            r6.setText(r0)
            X.0ta r0 = X.C16730tY.A00(r5)
            java.io.File r2 = r0.A0F
            r8 = 8
            r3 = 0
            android.widget.TextView r7 = r11.A08
            if (r2 == 0) goto L_0x0124
            X.013 r6 = r4.A05
            long r0 = r2.length()
            java.lang.String r0 = X.AnonymousClass2GQ.A03(r6, r0)
            r7.setText(r0)
            r7.setVisibility(r3)
            android.view.View r0 = r11.A03
            r0.setVisibility(r3)
        L_0x0061:
            int r0 = r5.A00
            if (r0 == 0) goto L_0x0118
            android.widget.TextView r7 = r11.A07
            r7.setVisibility(r3)
            android.view.View r0 = r11.A01
            r0.setVisibility(r3)
            X.013 r6 = r4.A05
            java.lang.String r1 = r5.A06
            int r0 = r5.A00
            java.lang.String r0 = X.C18820xJ.A05(r6, r1, r0)
            r7.setText(r0)
        L_0x007c:
            java.lang.String r0 = r5.A06
            java.lang.String r0 = X.C221516v.A00(r0)
            java.util.Locale r6 = java.util.Locale.US
            java.lang.String r1 = r0.toUpperCase(r6)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x00a7
            java.lang.String r0 = r5.A14()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00a7
            java.lang.String r0 = r5.A14()
            X.AnonymousClass00B.A06(r0)
            java.lang.String r0 = X.AnonymousClass1XI.A08(r0)
            java.lang.String r1 = r0.toUpperCase(r6)
        L_0x00a7:
            android.widget.TextView r0 = r11.A0A
            r0.setText(r1)
            r6 = 1
            android.widget.TextView r7 = r11.A06
            if (r2 == 0) goto L_0x0112
            X.013 r2 = r4.A05
            long r0 = r5.A0I
            java.lang.String r0 = X.C28961Zl.A0A(r2, r0, r3)
            r7.setText(r0)
            X.013 r2 = r4.A05
            long r0 = r5.A0I
            java.lang.String r0 = X.C28961Zl.A0A(r2, r0, r6)
        L_0x00c4:
            r7.setContentDescription(r0)
            android.view.View r8 = r11.A04
            android.view.View r7 = r11.A02
            X.10B r0 = r4.A04
            X.0pd r0 = r0.A09
            boolean r0 = X.C34321k4.A05(r0, r5)
            if (r0 == 0) goto L_0x00dc
            int r0 = r5.A06()
            r2 = 1
            if (r6 == r0) goto L_0x00dd
        L_0x00dc:
            r2 = 0
        L_0x00dd:
            boolean r1 = r5.A0x
            r0 = 8
            if (r2 == 0) goto L_0x010e
            r7.setVisibility(r3)
        L_0x00e6:
            if (r1 == 0) goto L_0x010a
            r8.setVisibility(r3)
        L_0x00eb:
            X.00l r0 = r4.A0C()
            X.AnonymousClass00B.A06(r0)
            X.1YG r0 = (X.AnonymousClass1YG) r0
            boolean r0 = r0.AJI(r5)
            android.view.View r2 = r11.A0H
            if (r0 == 0) goto L_0x0154
            android.content.Context r1 = r4.A02()
            r0 = 2131101046(0x7f060576, float:1.781449E38)
            X.C13680ns.A0u(r1, r2, r0)
            r2.setSelected(r6)
            return
        L_0x010a:
            r8.setVisibility(r0)
            goto L_0x00eb
        L_0x010e:
            r7.setVisibility(r0)
            goto L_0x00e6
        L_0x0112:
            java.lang.String r0 = ""
            r7.setText(r0)
            goto L_0x00c4
        L_0x0118:
            android.widget.TextView r0 = r11.A07
            r0.setVisibility(r8)
            android.view.View r0 = r11.A01
            r0.setVisibility(r8)
            goto L_0x007c
        L_0x0124:
            r7.setVisibility(r8)
            android.view.View r0 = r11.A03
            r0.setVisibility(r8)
            goto L_0x0061
        L_0x012e:
            r0 = 2131892391(0x7f1218a7, float:1.9419529E38)
            java.lang.String r0 = r4.A0J(r0)
            goto L_0x003c
        L_0x0137:
            android.content.Context r3 = r4.A0u()
            java.lang.String r2 = r5.A13()
            X.00l r0 = r4.A0C()
            X.AnonymousClass00B.A06(r0)
            X.1YG r0 = (X.AnonymousClass1YG) r0
            java.util.ArrayList r1 = r0.AFm()
            X.013 r0 = r4.A05
            java.lang.CharSequence r0 = X.AnonymousClass2TP.A02(r3, r0, r2, r1)
            goto L_0x003c
        L_0x0154:
            r0 = 2131232418(0x7f0806a2, float:1.8080945E38)
            r2.setBackgroundResource(r0)
            r2.setSelected(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass326.A0F(android.database.Cursor, X.02k):void");
    }

    public int AB1(int i2) {
        return ((C56112kz) this.A02.A0I.get(i2)).count;
    }

    public int ACY() {
        return this.A02.A0I.size();
    }

    public long ACZ(int i2) {
        return -((Calendar) this.A02.A0I.get(i2)).getTimeInMillis();
    }

    public /* bridge */ /* synthetic */ void ANd(C005602k r3, int i2) {
        ((C64693Rh) r3).A00.setText(this.A02.A0I.get(i2).toString());
    }

    public /* bridge */ /* synthetic */ void ANf(C005602k r2, int i2) {
        Cursor cursor = this.A01;
        if (cursor != null && i2 < cursor.getCount()) {
            super.ANf(r2, i2);
        }
    }

    public /* bridge */ /* synthetic */ C005602k APB(ViewGroup viewGroup) {
        DocumentsGalleryFragment documentsGalleryFragment = this.A02;
        View inflate = documentsGalleryFragment.A0D().getLayoutInflater().inflate(R.layout.layout03ca, viewGroup, false);
        inflate.setClickable(false);
        C13680ns.A0u(documentsGalleryFragment.A02(), inflate, R.color.color045a);
        return new C64693Rh(inflate);
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        DocumentsGalleryFragment documentsGalleryFragment = this.A02;
        return new C64993Sl(C13680ns.A0H(documentsGalleryFragment.A0D().getLayoutInflater(), viewGroup, R.layout.layout0237), documentsGalleryFragment);
    }

    public /* bridge */ /* synthetic */ boolean AXu(MotionEvent motionEvent, C005602k r3, int i2) {
        return false;
    }
}
