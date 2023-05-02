package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.obwhatsapp.R;

/* renamed from: X.03n  reason: invalid class name and case insensitive filesystem */
public abstract class C007603n {
    public C007503l A00;
    public CharSequence A01;
    public boolean A02 = false;

    public final Bitmap A00(int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            i5 = 0;
        }
        Context context = this.A00.A0B;
        Bitmap A012 = A01(IconCompat.A02(context.getResources(), context.getPackageName(), R.drawable.notification_icon_background), i5, i3);
        Canvas canvas = new Canvas(A012);
        Drawable mutate = this.A00.A0B.getResources().getDrawable(i2).mutate();
        mutate.setFilterBitmap(true);
        int i6 = (i3 - i4) >> 1;
        int i7 = i4 + i6;
        mutate.setBounds(i6, i6, i7, i7);
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
        mutate.draw(canvas);
        return A012;
    }

    public final Bitmap A01(IconCompat iconCompat, int i2, int i3) {
        int i4;
        Drawable A07 = iconCompat.A07(this.A00.A0B);
        if (i3 == 0) {
            i4 = A07.getIntrinsicWidth();
            i3 = A07.getIntrinsicHeight();
        } else {
            i4 = i3;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i4, i3, Bitmap.Config.ARGB_8888);
        A07.setBounds(0, 0, i4, i3);
        if (i2 != 0) {
            A07.mutate().setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
        }
        A07.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a8, code lost:
        if (r13.A00.A0C == null) goto L_0x00aa;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.RemoteViews A02() {
        /*
            r13 = this;
            r1 = 2131559444(0x7f0d0414, float:1.8744232E38)
            X.03l r0 = r13.A00
            android.content.Context r0 = r0.A0B
            android.content.res.Resources r10 = r0.getResources()
            X.03l r0 = r13.A00
            android.content.Context r0 = r0.A0B
            java.lang.String r0 = r0.getPackageName()
            android.widget.RemoteViews r9 = new android.widget.RemoteViews
            r9.<init>(r0, r1)
            X.03l r0 = r13.A00
            int r1 = r0.A03
            r8 = -1
            r7 = 1
            r6 = 0
            r0 = 0
            if (r1 >= r8) goto L_0x0023
            r0 = 1
        L_0x0023:
            int r5 = android.os.Build.VERSION.SDK_INT
            r4 = 21
            if (r5 >= r4) goto L_0x003f
            java.lang.String r2 = "setBackgroundResource"
            r1 = 2131364872(0x7f0a0c08, float:1.8349593E38)
            if (r0 == 0) goto L_0x01d3
            r0 = 2131232224(0x7f0805e0, float:1.8080551E38)
            r9.setInt(r1, r2, r0)
            r1 = 2131364067(0x7f0a08e3, float:1.834796E38)
            r0 = 2131232231(0x7f0805e7, float:1.8080565E38)
        L_0x003c:
            r9.setInt(r1, r2, r0)
        L_0x003f:
            X.03l r1 = r13.A00
            android.graphics.Bitmap r0 = r1.A0C
            r11 = 8
            if (r0 == 0) goto L_0x0185
            r1 = 2131364067(0x7f0a08e3, float:1.834796E38)
            r9.setViewVisibility(r1, r6)
            X.03l r0 = r13.A00
            android.graphics.Bitmap r0 = r0.A0C
            r9.setImageViewBitmap(r1, r0)
            X.03l r0 = r13.A00
            android.app.Notification r0 = r0.A07
            int r0 = r0.icon
            if (r0 == 0) goto L_0x0088
            r0 = 2131166604(0x7f07058c, float:1.7947458E38)
            int r12 = r10.getDimensionPixelSize(r0)
            r0 = 2131166606(0x7f07058e, float:1.7947462E38)
            int r0 = r10.getDimensionPixelSize(r0)
            int r0 = r0 << 1
            int r3 = r12 - r0
            if (r5 < r4) goto L_0x0162
            X.03l r2 = r13.A00
            android.app.Notification r0 = r2.A07
            int r1 = r0.icon
            int r0 = r2.A00
            android.graphics.Bitmap r1 = r13.A00(r1, r12, r3, r0)
            r0 = 2131365846(0x7f0a0fd6, float:1.8351569E38)
            r3 = 2131365846(0x7f0a0fd6, float:1.8351569E38)
            r9.setImageViewBitmap(r0, r1)
        L_0x0085:
            r9.setViewVisibility(r3, r6)
        L_0x0088:
            X.03l r0 = r13.A00
            java.lang.CharSequence r1 = r0.A0H
            if (r1 == 0) goto L_0x0094
            r0 = 2131366639(0x7f0a12ef, float:1.8353177E38)
            r9.setTextViewText(r0, r1)
        L_0x0094:
            X.03l r0 = r13.A00
            java.lang.CharSequence r1 = r0.A0G
            if (r1 == 0) goto L_0x015f
            r0 = 2131366587(0x7f0a12bb, float:1.8353072E38)
            r9.setTextViewText(r0, r1)
            r12 = 1
        L_0x00a1:
            if (r5 >= r4) goto L_0x00aa
            X.03l r0 = r13.A00
            android.graphics.Bitmap r0 = r0.A0C
            r8 = 1
            if (r0 != 0) goto L_0x00ab
        L_0x00aa:
            r8 = 0
        L_0x00ab:
            X.03l r0 = r13.A00
            int r0 = r0.A02
            if (r0 <= 0) goto L_0x0157
            r0 = 2131427351(0x7f0b0017, float:1.8476316E38)
            int r1 = r10.getInteger(r0)
            X.03l r0 = r13.A00
            int r0 = r0.A02
            if (r0 <= r1) goto L_0x013f
            r1 = 2131364120(0x7f0a0918, float:1.8348068E38)
            r4 = 2131364120(0x7f0a0918, float:1.8348068E38)
            r0 = 2131893677(0x7f121dad, float:1.9422137E38)
            java.lang.String r0 = r10.getString(r0)
            r9.setTextViewText(r1, r0)
        L_0x00ce:
            r9.setViewVisibility(r4, r6)
            r12 = 1
            r8 = 1
        L_0x00d3:
            X.03l r5 = r13.A00
            boolean r0 = r5.A0V
            if (r0 == 0) goto L_0x013d
            android.app.Notification r0 = r5.A07
            long r1 = r0.when
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x013d
            boolean r0 = r5.A0W
            if (r0 == 0) goto L_0x0124
            r8 = 2131362751(0x7f0a03bf, float:1.8345291E38)
            r9.setViewVisibility(r8, r6)
            X.03l r1 = r13.A00
            boolean r0 = r1.A0V
            if (r0 == 0) goto L_0x0121
            android.app.Notification r0 = r1.A07
            long r0 = r0.when
        L_0x00f7:
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r2
            long r0 = r0 + r4
            java.lang.String r2 = "setBase"
            r9.setLong(r8, r2, r0)
            java.lang.String r0 = "setStarted"
            r9.setBoolean(r8, r0, r7)
        L_0x010b:
            r1 = 2131365849(0x7f0a0fd9, float:1.8351575E38)
            r0 = 8
            if (r7 == 0) goto L_0x0113
            r0 = 0
        L_0x0113:
            r9.setViewVisibility(r1, r0)
            r0 = 2131364296(0x7f0a09c8, float:1.8348425E38)
            if (r12 != 0) goto L_0x011d
            r6 = 8
        L_0x011d:
            r9.setViewVisibility(r0, r6)
            return r9
        L_0x0121:
            r0 = 0
            goto L_0x00f7
        L_0x0124:
            r3 = 2131366627(0x7f0a12e3, float:1.8353153E38)
            r9.setViewVisibility(r3, r6)
            X.03l r1 = r13.A00
            boolean r0 = r1.A0V
            if (r0 == 0) goto L_0x013a
            android.app.Notification r0 = r1.A07
            long r0 = r0.when
        L_0x0134:
            java.lang.String r2 = "setTime"
            r9.setLong(r3, r2, r0)
            goto L_0x010b
        L_0x013a:
            r0 = 0
            goto L_0x0134
        L_0x013d:
            r7 = r8
            goto L_0x010b
        L_0x013f:
            java.text.NumberFormat r3 = java.text.NumberFormat.getIntegerInstance()
            r2 = 2131364120(0x7f0a0918, float:1.8348068E38)
            r4 = 2131364120(0x7f0a0918, float:1.8348068E38)
            X.03l r0 = r13.A00
            int r0 = r0.A02
            long r0 = (long) r0
            java.lang.String r0 = r3.format(r0)
            r9.setTextViewText(r2, r0)
            goto L_0x00ce
        L_0x0157:
            r0 = 2131364120(0x7f0a0918, float:1.8348068E38)
            r9.setViewVisibility(r0, r11)
            goto L_0x00d3
        L_0x015f:
            r12 = 0
            goto L_0x00a1
        L_0x0162:
            r2 = 2131365846(0x7f0a0fd6, float:1.8351569E38)
            r3 = 2131365846(0x7f0a0fd6, float:1.8351569E38)
            X.03l r1 = r13.A00
            android.app.Notification r0 = r1.A07
            int r12 = r0.icon
            android.content.Context r0 = r1.A0B
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r0 = r0.getPackageName()
            androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.A02(r1, r0, r12)
            android.graphics.Bitmap r0 = r13.A01(r0, r8, r6)
            r9.setImageViewBitmap(r2, r0)
            goto L_0x0085
        L_0x0185:
            android.app.Notification r0 = r1.A07
            int r0 = r0.icon
            if (r0 == 0) goto L_0x0088
            r3 = 2131364067(0x7f0a08e3, float:1.834796E38)
            r9.setViewVisibility(r3, r6)
            if (r5 < r4) goto L_0x01ba
            r0 = 2131166601(0x7f070589, float:1.7947452E38)
            int r12 = r10.getDimensionPixelSize(r0)
            r0 = 2131166598(0x7f070586, float:1.7947446E38)
            int r0 = r10.getDimensionPixelSize(r0)
            int r12 = r12 - r0
            r0 = 2131166607(0x7f07058f, float:1.7947464E38)
            int r8 = r10.getDimensionPixelSize(r0)
            X.03l r2 = r13.A00
            android.app.Notification r0 = r2.A07
            int r1 = r0.icon
            int r0 = r2.A00
            android.graphics.Bitmap r0 = r13.A00(r1, r12, r8, r0)
        L_0x01b5:
            r9.setImageViewBitmap(r3, r0)
            goto L_0x0088
        L_0x01ba:
            X.03l r1 = r13.A00
            android.app.Notification r0 = r1.A07
            int r2 = r0.icon
            android.content.Context r0 = r1.A0B
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r0 = r0.getPackageName()
            androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.A02(r1, r0, r2)
            android.graphics.Bitmap r0 = r13.A01(r0, r8, r6)
            goto L_0x01b5
        L_0x01d3:
            r0 = 2131232223(0x7f0805df, float:1.808055E38)
            r9.setInt(r1, r2, r0)
            r1 = 2131364067(0x7f0a08e3, float:1.834796E38)
            r0 = 2131232230(0x7f0805e6, float:1.8080563E38)
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C007603n.A02():android.widget.RemoteViews");
    }

    public RemoteViews A03(C11840jQ r2) {
        return null;
    }

    public RemoteViews A04(C11840jQ r2) {
        return null;
    }

    public abstract String A05();

    public void A06(Bundle bundle) {
        if (this.A02) {
            bundle.putCharSequence("android.summaryText", this.A01);
        }
        String A05 = A05();
        if (A05 != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", A05);
        }
    }

    public void A07(RemoteViews remoteViews, RemoteViews remoteViews2) {
        RemoteViews remoteViews3 = remoteViews;
        remoteViews.setViewVisibility(R.id.title, 8);
        remoteViews.setViewVisibility(R.id.text2, 8);
        remoteViews.setViewVisibility(R.id.text, 8);
        remoteViews.removeAllViews(R.id.notification_main_column);
        remoteViews.addView(R.id.notification_main_column, remoteViews2.clone());
        remoteViews.setViewVisibility(R.id.notification_main_column, 0);
        if (Build.VERSION.SDK_INT >= 21) {
            Resources resources = this.A00.A0B.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.dimen0591);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.dimen0592);
            float f2 = resources.getConfiguration().fontScale;
            if (f2 < 1.0f) {
                f2 = 1.0f;
            } else if (f2 > 1.3f) {
                f2 = 1.3f;
            }
            float f3 = (f2 - 1.0f) / 0.29999995f;
            remoteViews3.setViewPadding(R.id.notification_main_column_container, 0, Math.round(((1.0f - f3) * ((float) dimensionPixelSize)) + (f3 * ((float) dimensionPixelSize2))), 0, 0);
        }
    }

    public abstract void A08(C11840jQ r1);
}
