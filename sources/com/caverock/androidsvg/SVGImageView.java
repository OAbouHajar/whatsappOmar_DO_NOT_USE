package com.caverock.androidsvg;

import X.AnonymousClass000;
import X.AnonymousClass0Rz;
import X.AnonymousClass0XP;
import X.C02280Ar;
import X.C02300At;
import X.C06050Ua;
import X.C11550ix;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.drawable.PictureDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;

public class SVGImageView extends ImageView {
    public static Method A02;
    public C06050Ua A00 = new C06050Ua();
    public AnonymousClass0Rz A01 = null;

    static {
        Class<View> cls = View.class;
        try {
            Class[] clsArr = new Class[2];
            clsArr[0] = Integer.TYPE;
            A02 = AnonymousClass000.A0s(cls, Paint.class, "setLayerType", clsArr, 1);
        } catch (NoSuchMethodException unused) {
        }
    }

    public SVGImageView(Context context) {
        super(context);
    }

    public SVGImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        A01(attributeSet, 0);
    }

    public SVGImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A01(attributeSet, i2);
    }

    private void setFromString(String str) {
        try {
            this.A01 = new AnonymousClass0XP().A0S(new ByteArrayInputStream(str.getBytes()));
            A00();
        } catch (C11550ix unused) {
            Log.e("SVGImageView", AnonymousClass000.A0h(str, AnonymousClass000.A0r("Could not find SVG at: ")));
        }
    }

    public final void A00() {
        AnonymousClass0Rz r1 = this.A01;
        if (r1 != null) {
            Picture A002 = r1.A00(this.A00);
            Method method = A02;
            if (method != null) {
                try {
                    Object[] objArr = new Object[2];
                    AnonymousClass000.A1M(objArr, View.class.getField("LAYER_TYPE_SOFTWARE").getInt(new View(getContext())), 0);
                    objArr[1] = null;
                    method.invoke(this, objArr);
                } catch (Exception e2) {
                    Log.w("SVGImageView", "Unexpected failure calling setLayerType", e2);
                }
            }
            setImageDrawable(new PictureDrawable(A002));
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:12|13|14|15|16|17|18) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0056 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(android.util.AttributeSet r5, int r6) {
        /*
            r4 = this;
            boolean r0 = r4.isInEditMode()
            if (r0 != 0) goto L_0x0062
            android.content.Context r0 = r4.getContext()
            android.content.res.Resources$Theme r2 = r0.getTheme()
            int[] r1 = X.AnonymousClass0N1.A00
            r0 = 0
            android.content.res.TypedArray r3 = r2.obtainStyledAttributes(r5, r1, r6, r0)
            java.lang.String r1 = r3.getString(r0)     // Catch:{ all -> 0x005d }
            if (r1 == 0) goto L_0x0020
            X.0Ua r0 = r4.A00     // Catch:{ all -> 0x005d }
            r0.A00(r1)     // Catch:{ all -> 0x005d }
        L_0x0020:
            r2 = 1
            r1 = -1
            int r0 = r3.getResourceId(r2, r1)     // Catch:{ all -> 0x005d }
            if (r0 == r1) goto L_0x002c
            r4.setImageResource(r0)     // Catch:{ all -> 0x005d }
            goto L_0x0059
        L_0x002c:
            java.lang.String r2 = r3.getString(r2)     // Catch:{ all -> 0x005d }
            if (r2 == 0) goto L_0x0059
            android.net.Uri r1 = android.net.Uri.parse(r2)     // Catch:{ all -> 0x005d }
            android.content.Context r0 = r4.getContext()     // Catch:{ FileNotFoundException -> 0x0046 }
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0046 }
            java.io.InputStream r0 = r0.openInputStream(r1)     // Catch:{ FileNotFoundException -> 0x0046 }
            X.C02280Ar.A00(r4, r0)     // Catch:{ FileNotFoundException -> 0x0046 }
            goto L_0x0059
        L_0x0046:
            android.content.Context r0 = r4.getContext()     // Catch:{ IOException -> 0x0056 }
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch:{ IOException -> 0x0056 }
            java.io.InputStream r0 = r0.open(r2)     // Catch:{ IOException -> 0x0056 }
            X.C02280Ar.A00(r4, r0)     // Catch:{ IOException -> 0x0056 }
            goto L_0x0059
        L_0x0056:
            r4.setFromString(r2)     // Catch:{ all -> 0x005d }
        L_0x0059:
            r3.recycle()
            return
        L_0x005d:
            r0 = move-exception
            r3.recycle()
            throw r0
        L_0x0062:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.SVGImageView.A01(android.util.AttributeSet, int):void");
    }

    public void setCSS(String str) {
        this.A00.A00(str);
        A00();
    }

    public void setImageAsset(String str) {
        try {
            C02280Ar.A00(this, getContext().getAssets().open(str));
        } catch (IOException unused) {
            Log.e("SVGImageView", AnonymousClass000.A0h(str, AnonymousClass000.A0r("File not found: ")));
        }
    }

    public void setImageResource(int i2) {
        new C02300At(getContext(), this, i2).execute(new Integer[0]);
    }

    public void setImageURI(Uri uri) {
        try {
            C02280Ar.A00(this, getContext().getContentResolver().openInputStream(uri));
        } catch (FileNotFoundException unused) {
            Log.e("SVGImageView", AnonymousClass000.A0g("File not found: ", uri));
        }
    }

    public void setSVG(AnonymousClass0Rz r2) {
        if (r2 != null) {
            this.A01 = r2;
            A00();
            return;
        }
        throw AnonymousClass000.A0T("Null value passed to setSVG()");
    }

    public void setSVG(AnonymousClass0Rz r2, String str) {
        if (r2 != null) {
            this.A01 = r2;
            this.A00.A00(str);
            A00();
            return;
        }
        throw AnonymousClass000.A0T("Null value passed to setSVG()");
    }
}
