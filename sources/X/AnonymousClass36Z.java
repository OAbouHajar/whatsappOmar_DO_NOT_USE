package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.whatsapp.filter.FilterUtils;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.36Z  reason: invalid class name */
public class AnonymousClass36Z extends C16690tT {
    public int A00;
    public C30141bo A01;
    public AnonymousClass3T2 A02;
    public C30151bp A03;
    public WeakReference A04;
    public Bitmap[] A05;
    public boolean[] A06;
    public boolean[] A07;
    public final C26051Md A08;

    public AnonymousClass36Z(Context context, C26051Md r3, C30141bo r4, AnonymousClass3T2 r5, C30151bp r6, Bitmap[] bitmapArr, boolean[] zArr, boolean[] zArr2, int i2) {
        this.A04 = C13690nt.A0h(context);
        this.A01 = r4;
        this.A03 = r6;
        this.A00 = i2;
        this.A05 = bitmapArr;
        this.A07 = zArr;
        this.A06 = zArr2;
        this.A02 = r5;
        this.A08 = r3;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        int i2 = this.A00;
        int i3 = i2 - 1;
        if (i2 == 0) {
            return this.A01.A02;
        }
        Bitmap bitmap = this.A05[i3];
        if (bitmap != null) {
            boolean[] zArr = this.A07;
            if (zArr[i3]) {
                zArr[i3] = !FilterUtils.A02(this.A01.A02, bitmap, this.A08, i2);
            }
            return this.A05[i3];
        }
        Bitmap A002 = FilterUtils.A00(this.A01.A02, this.A08, i2, true);
        if (A002 != null) {
            this.A05[i3] = A002;
            this.A07[i3] = false;
            return A002;
        }
        Log.e("FilterThumbnailAdapter/onBindViewHolder/onPostExecute/failed to create thumbnail");
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0054, code lost:
        if (r4 == null) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0A(java.lang.Object r4) {
        /*
            r3 = this;
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            java.lang.ref.WeakReference r0 = r3.A04
            java.lang.Object r1 = r0.get()
            android.content.Context r1 = (android.content.Context) r1
            r2 = 0
            if (r1 == 0) goto L_0x0054
            X.1bo r0 = r3.A01
            android.graphics.Bitmap r0 = r0.A02
            if (r0 == 0) goto L_0x0054
            if (r4 == 0) goto L_0x0056
            boolean r0 = r4.isRecycled()
            if (r0 != 0) goto L_0x0048
            X.3T2 r0 = r3.A02
            android.widget.ImageView r0 = r0.A02
            r0.setBackgroundResource(r2)
            X.3T2 r0 = r3.A02
            android.widget.ImageView r2 = r0.A02
            android.content.res.Resources r1 = r1.getResources()
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            r0.<init>(r1, r4)
            r2.setImageDrawable(r0)
            X.3T2 r0 = r3.A02
            android.widget.TextView r1 = r0.A03
            int r0 = r3.A00
            X.4Kt r0 = X.AnonymousClass3B5.A00(r0)
            int r0 = r0.A01
            r1.setText(r0)
            X.3T2 r1 = r3.A02
            android.view.View r0 = r1.A01
            r0.setOnClickListener(r1)
        L_0x0048:
            r0 = 0
            r3.A01 = r0
            r3.A03 = r0
            r3.A02 = r0
            r3.A07 = r0
            r3.A05 = r0
            return
        L_0x0054:
            if (r4 != 0) goto L_0x0048
        L_0x0056:
            int r0 = r3.A00
            if (r0 == 0) goto L_0x0048
            int r1 = r0 + -1
            boolean[] r0 = r3.A06
            r0[r1] = r2
            X.1bp r0 = r3.A03
            if (r0 == 0) goto L_0x0048
            r0.A02(r1)
            goto L_0x0048
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36Z.A0A(java.lang.Object):void");
    }
}
