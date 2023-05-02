package com.airbnb.lottie;

import X.AnonymousClass000;
import X.AnonymousClass08E;
import X.AnonymousClass0A0;
import X.AnonymousClass0AS;
import X.AnonymousClass0Ak;
import X.AnonymousClass0JU;
import X.AnonymousClass0NI;
import X.AnonymousClass0Oh;
import X.AnonymousClass0Rs;
import X.AnonymousClass0U9;
import X.AnonymousClass0UV;
import X.AnonymousClass0WM;
import X.AnonymousClass0XD;
import X.AnonymousClass0XN;
import X.C004601z;
import X.C006002o;
import X.C02380Bj;
import X.C03050Ha;
import X.C03980Kq;
import X.C03990Kr;
import X.C04530Mx;
import X.C05010Ow;
import X.C06250Uz;
import X.C08230dI;
import X.C10780hg;
import X.C10810hj;
import X.C12130jt;
import X.C12620kh;
import X.C12630ki;
import X.C13480m6;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.facebook.redex.IDxCallableShape1S2100000_I1;
import com.facebook.redex.IDxCallableShape6S1100000_I1;
import com.facebook.redex.IDxLListenerShape398S0100000_I1;
import com.obwhatsapp.R;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class LottieAnimationView extends C006002o {
    public static final C12630ki A0J = new C08230dI();
    public int A00;
    public int A01 = 0;
    public int A02 = 0;
    public AnonymousClass0Rs A03;
    public C12630ki A04;
    public C06250Uz A05;
    public AnonymousClass0JU A06;
    public String A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final AnonymousClass0Ak A0F = new AnonymousClass0Ak();
    public final C12630ki A0G = new IDxLListenerShape398S0100000_I1(this, 0);
    public final C12630ki A0H = new IDxLListenerShape398S0100000_I1(this, 1);
    public final Set A0I = C006002o.A00(this);

    public LottieAnimationView(Context context) {
        super(context, (AttributeSet) null);
        A03((AttributeSet) null, R.attr.attr035b);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A03(attributeSet, R.attr.attr035b);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A03(attributeSet, i2);
    }

    private void setCompositionTask(C06250Uz r2) {
        this.A03 = null;
        this.A0F.A00();
        A01();
        r2.A01(this.A0G);
        r2.A00(this.A0H);
        this.A05 = r2;
    }

    public void A00() {
        if (isShown()) {
            this.A0F.A01();
            A02();
            return;
        }
        this.A0C = true;
    }

    public final void A01() {
        C06250Uz r2 = this.A05;
        if (r2 != null) {
            C12630ki r1 = this.A0G;
            synchronized (r2) {
                r2.A02.remove(r1);
            }
            C06250Uz r22 = this.A05;
            C12630ki r12 = this.A0H;
            synchronized (r22) {
                r22.A01.remove(r12);
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (android.os.Build.VERSION.SDK_INT < 28) goto L_0x000a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        if (r2.A03 > 4) goto L_0x000a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
        if (r1 == 25) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02() {
        /*
            r4 = this;
            X.0JU r0 = r4.A06
            int r0 = r0.ordinal()
            r3 = 2
            switch(r0) {
                case 0: goto L_0x0016;
                case 1: goto L_0x000b;
                default: goto L_0x000a;
            }
        L_0x000a:
            r3 = 1
        L_0x000b:
            int r0 = r4.getLayerType()
            if (r3 == r0) goto L_0x0015
            r0 = 0
            r4.setLayerType(r3, r0)
        L_0x0015:
            return
        L_0x0016:
            X.0Rs r2 = r4.A03
            if (r2 == 0) goto L_0x002b
            boolean r0 = r2.A0C
            if (r0 == 0) goto L_0x0025
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 >= r0) goto L_0x0025
            goto L_0x000a
        L_0x0025:
            int r1 = r2.A03
            r0 = 4
            if (r1 <= r0) goto L_0x002b
            goto L_0x000a
        L_0x002b:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L_0x000a
            r0 = 24
            if (r1 == r0) goto L_0x000a
            r0 = 25
            if (r1 != r0) goto L_0x000b
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.A02():void");
    }

    public final void A03(AttributeSet attributeSet, int i2) {
        String string;
        boolean z2 = false;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C04530Mx.A00, i2, 0);
        this.A09 = obtainStyledAttributes.getBoolean(1, true);
        boolean hasValue = obtainStyledAttributes.hasValue(10);
        boolean hasValue2 = obtainStyledAttributes.hasValue(5);
        boolean hasValue3 = obtainStyledAttributes.hasValue(16);
        if (hasValue) {
            if (!hasValue2) {
                int resourceId = obtainStyledAttributes.getResourceId(10, 0);
                if (resourceId != 0) {
                    setAnimation(resourceId);
                }
            } else {
                throw AnonymousClass000.A0T("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
            }
        } else if (hasValue2) {
            String string2 = obtainStyledAttributes.getString(5);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (hasValue3 && (string = obtainStyledAttributes.getString(16)) != null) {
            setAnimationFromUrl(string);
        }
        this.A02 = obtainStyledAttributes.getResourceId(4, 0);
        if (obtainStyledAttributes.getBoolean(0, false)) {
            this.A0D = true;
            this.A08 = true;
        }
        if (obtainStyledAttributes.getBoolean(8, false)) {
            this.A0F.A0K.setRepeatCount(-1);
        }
        if (obtainStyledAttributes.hasValue(13)) {
            setRepeatMode(obtainStyledAttributes.getInt(13, 1));
        }
        if (obtainStyledAttributes.hasValue(12)) {
            setRepeatCount(obtainStyledAttributes.getInt(12, -1));
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setSpeed(obtainStyledAttributes.getFloat(15, 1.0f));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(7));
        setProgress(obtainStyledAttributes.getFloat(9, 0.0f));
        boolean z3 = obtainStyledAttributes.getBoolean(3, false);
        AnonymousClass0Ak r4 = this.A0F;
        r4.A0H(z3);
        if (obtainStyledAttributes.hasValue(2)) {
            AnonymousClass0AS r8 = new AnonymousClass0AS(AnonymousClass08E.A00(getContext(), obtainStyledAttributes.getResourceId(2, -1)).getDefaultColor());
            r4.A0D(new AnonymousClass0WM("**"), new AnonymousClass0UV(r8), C13480m6.A00);
        }
        if (obtainStyledAttributes.hasValue(14)) {
            r4.A00 = obtainStyledAttributes.getFloat(14, 1.0f);
        }
        if (obtainStyledAttributes.hasValue(11)) {
            int i3 = obtainStyledAttributes.getInt(11, 0);
            if (i3 >= AnonymousClass0JU.values().length) {
                i3 = 0;
            }
            setRenderMode(AnonymousClass0JU.values()[i3]);
        }
        setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(6, false));
        obtainStyledAttributes.recycle();
        if (AnonymousClass0XD.A01(getContext()) != 0.0f) {
            z2 = true;
        }
        r4.A0H = Boolean.valueOf(z2).booleanValue();
        A02();
        this.A0B = true;
    }

    public void buildDrawingCache(boolean z2) {
        this.A01++;
        super.buildDrawingCache(z2);
        if (this.A01 == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z2) == null) {
            setRenderMode(AnonymousClass0JU.HARDWARE);
        }
        this.A01--;
        AnonymousClass0NI.A01();
    }

    public AnonymousClass0Rs getComposition() {
        return this.A03;
    }

    public long getDuration() {
        AnonymousClass0Rs r0 = this.A03;
        if (r0 != null) {
            return (long) AnonymousClass0Rs.A00(r0);
        }
        return 0;
    }

    public int getFrame() {
        return (int) this.A0F.A0K.A00;
    }

    public String getImageAssetsFolder() {
        return this.A0F.A09;
    }

    public float getMaxFrame() {
        return this.A0F.A0K.A02();
    }

    public float getMinFrame() {
        return this.A0F.A0K.A03();
    }

    public AnonymousClass0Oh getPerformanceTracker() {
        AnonymousClass0Rs r0 = this.A0F.A04;
        if (r0 != null) {
            return r0.A0D;
        }
        return null;
    }

    public float getProgress() {
        return AnonymousClass0A0.A00(this.A0F.A0K);
    }

    public int getRepeatCount() {
        return this.A0F.A0K.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.A0F.A0K.getRepeatMode();
    }

    public float getScale() {
        return this.A0F.A00;
    }

    public float getSpeed() {
        return this.A0F.A0K.A03;
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        AnonymousClass0Ak r0 = this.A0F;
        if (drawable2 == r0) {
            super.invalidateDrawable(r0);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() && (this.A08 || this.A0D)) {
            A00();
            this.A08 = false;
            this.A0D = false;
        }
        if (Build.VERSION.SDK_INT < 23) {
            onVisibilityChanged(this, getVisibility());
        }
    }

    public void onDetachedFromWindow() {
        AnonymousClass0Ak r2 = this.A0F;
        AnonymousClass0A0 r1 = r2.A0K;
        if (r1 != null && r1.A07) {
            this.A0D = false;
            this.A0E = false;
            this.A0C = false;
            r2.A0L.clear();
            r1.cancel();
            A02();
            this.A0D = true;
        }
        super.onDetachedFromWindow();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C02380Bj)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C02380Bj r3 = (C02380Bj) parcelable;
        super.onRestoreInstanceState(r3.getSuperState());
        String str = r3.A04;
        this.A07 = str;
        if (!TextUtils.isEmpty(str)) {
            setAnimation(this.A07);
        }
        int i2 = r3.A01;
        this.A00 = i2;
        if (i2 != 0) {
            setAnimation(i2);
        }
        setProgress(r3.A00);
        if (r3.A06) {
            A00();
        }
        this.A0F.A09 = r3.A05;
        setRepeatMode(r3.A03);
        setRepeatCount(r3.A02);
    }

    public Parcelable onSaveInstanceState() {
        C02380Bj r3 = new C02380Bj(super.onSaveInstanceState());
        r3.A04 = this.A07;
        r3.A01 = this.A00;
        AnonymousClass0Ak r2 = this.A0F;
        AnonymousClass0A0 r1 = r2.A0K;
        r3.A00 = AnonymousClass0A0.A00(r1);
        r3.A06 = r1.A07 || (!C004601z.A0t(this) && this.A0D);
        r3.A05 = r2.A09;
        r3.A03 = r1.getRepeatMode();
        r3.A02 = r1.getRepeatCount();
        return r3;
    }

    public void onVisibilityChanged(View view, int i2) {
        if (!this.A0B) {
            return;
        }
        if (isShown()) {
            if (this.A0E) {
                if (isShown()) {
                    this.A0F.A02();
                    A02();
                } else {
                    this.A0C = false;
                    this.A0E = true;
                }
            } else if (this.A0C) {
                A00();
            }
            this.A0E = false;
            this.A0C = false;
            return;
        }
        AnonymousClass0Ak r2 = this.A0F;
        AnonymousClass0A0 r1 = r2.A0K;
        if (r1 != null && r1.A07) {
            this.A08 = false;
            this.A0D = false;
            this.A0E = false;
            this.A0C = false;
            r2.A0L.clear();
            AnonymousClass0A0.A01(r1);
            A02();
            this.A0E = true;
        }
    }

    public void setAnimation(int i2) {
        String str;
        C06250Uz A062;
        this.A00 = i2;
        this.A07 = null;
        if (isInEditMode()) {
            A062 = new C06250Uz(new C10780hg(this, i2), true);
        } else {
            boolean z2 = this.A09;
            Context context = getContext();
            if (z2) {
                StringBuilder A0r = AnonymousClass000.A0r("rawRes");
                A0r.append((context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_");
                str = AnonymousClass000.A0l(A0r, i2);
            } else {
                str = null;
            }
            A062 = AnonymousClass0XN.A06(str, new C10810hj(context.getApplicationContext(), str, new WeakReference(context), i2));
        }
        setCompositionTask(A062);
    }

    public void setAnimation(InputStream inputStream, String str) {
        setCompositionTask(AnonymousClass0XN.A06(str, new IDxCallableShape6S1100000_I1(2, str, inputStream)));
    }

    public void setAnimation(String str) {
        C06250Uz A062;
        this.A07 = str;
        this.A00 = 0;
        if (isInEditMode()) {
            A062 = new C06250Uz(new IDxCallableShape6S1100000_I1(1, str, this), true);
        } else {
            boolean z2 = this.A09;
            Context context = getContext();
            String A0h = z2 ? AnonymousClass000.A0h(str, AnonymousClass000.A0r("asset_")) : null;
            A062 = AnonymousClass0XN.A06(A0h, new IDxCallableShape1S2100000_I1(context.getApplicationContext(), str, A0h, 1));
        }
        setCompositionTask(A062);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setAnimationFromJson(str, (String) null);
    }

    public void setAnimationFromJson(String str, String str2) {
        setAnimation(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setAnimationFromUrl(String str) {
        boolean z2 = this.A09;
        Context context = getContext();
        String A0h = z2 ? AnonymousClass000.A0h(str, AnonymousClass000.A0r("url_")) : null;
        setCompositionTask(AnonymousClass0XN.A06(A0h, new IDxCallableShape1S2100000_I1(context, str, A0h, 0)));
    }

    public void setAnimationFromUrl(String str, String str2) {
        setCompositionTask(AnonymousClass0XN.A06(str2, new IDxCallableShape1S2100000_I1(getContext(), str, str2, 0)));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z2) {
        this.A0F.A0C = z2;
    }

    public void setCacheComposition(boolean z2) {
        this.A09 = z2;
    }

    public void setComposition(AnonymousClass0Rs r6) {
        float f2;
        float f3;
        AnonymousClass0Ak r3 = this.A0F;
        r3.setCallback(this);
        this.A03 = r6;
        this.A0A = true;
        boolean z2 = false;
        if (r3.A04 != r6) {
            r3.A0D = false;
            r3.A00();
            r3.A04 = r6;
            r3.A03();
            AnonymousClass0A0 r4 = r3.A0K;
            boolean A1W = AnonymousClass000.A1W(r4.A06);
            r4.A06 = r6;
            if (A1W) {
                f2 = (float) ((int) Math.max(r4.A02, r6.A02));
                f3 = Math.min(r4.A01, r6.A00);
            } else {
                f2 = (float) ((int) r6.A02);
                f3 = r6.A00;
            }
            r4.A08(f2, (float) ((int) f3));
            float f4 = r4.A00;
            r4.A00 = 0.0f;
            r4.A07((float) ((int) f4));
            r4.A04();
            r3.A06(r4.getAnimatedFraction());
            r3.A00 = r3.A00;
            ArrayList arrayList = r3.A0L;
            Iterator it = new ArrayList(arrayList).iterator();
            while (it.hasNext()) {
                C12620kh r0 = (C12620kh) it.next();
                if (r0 != null) {
                    r0.Aci(r6);
                }
                it.remove();
            }
            arrayList.clear();
            r6.A0D.A00 = r3.A0F;
            Drawable.Callback callback = r3.getCallback();
            if (callback instanceof ImageView) {
                ImageView imageView = (ImageView) callback;
                imageView.setImageDrawable((Drawable) null);
                imageView.setImageDrawable(r3);
            }
            z2 = true;
        }
        this.A0A = false;
        A02();
        if (getDrawable() == r3) {
            if (!z2) {
                return;
            }
        } else if (!z2) {
            AnonymousClass0A0 r02 = r3.A0K;
            boolean z3 = r02 == null ? false : r02.A07;
            setImageDrawable((Drawable) null);
            setImageDrawable(r3);
            if (z3) {
                r3.A02();
            }
        }
        onVisibilityChanged(this, getVisibility());
        requestLayout();
        Iterator it2 = this.A0I.iterator();
        if (it2.hasNext()) {
            it2.next();
            throw AnonymousClass000.A0W("onCompositionLoaded");
        }
    }

    public void setFailureListener(C12630ki r1) {
        this.A04 = r1;
    }

    public void setFallbackResource(int i2) {
        this.A02 = i2;
    }

    public void setFontAssetDelegate(C03980Kq r2) {
        AnonymousClass0Ak r0 = this.A0F;
        r0.A02 = r2;
        C05010Ow r02 = r0.A06;
        if (r02 != null) {
            r02.A00 = r2;
        }
    }

    public void setFrame(int i2) {
        this.A0F.A08(i2);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z2) {
        this.A0F.A0B = z2;
    }

    public void setImageAssetDelegate(C12130jt r2) {
        AnonymousClass0Ak r0 = this.A0F;
        r0.A03 = r2;
        AnonymousClass0U9 r02 = r0.A07;
        if (r02 != null) {
            r02.A00 = r2;
        }
    }

    public void setImageAssetsFolder(String str) {
        this.A0F.A09 = str;
    }

    public void setImageBitmap(Bitmap bitmap) {
        A01();
        super.setImageBitmap(bitmap);
    }

    public void setImageDrawable(Drawable drawable) {
        A01();
        super.setImageDrawable(drawable);
    }

    public void setImageResource(int i2) {
        A01();
        super.setImageResource(i2);
    }

    public void setMaxFrame(int i2) {
        this.A0F.A09(i2);
    }

    public void setMaxFrame(String str) {
        this.A0F.A0E(str);
    }

    public void setMaxProgress(float f2) {
        this.A0F.A04(f2);
    }

    public void setMinAndMaxFrame(String str) {
        this.A0F.A0F(str);
    }

    public void setMinFrame(int i2) {
        this.A0F.A0A(i2);
    }

    public void setMinFrame(String str) {
        this.A0F.A0G(str);
    }

    public void setMinProgress(float f2) {
        this.A0F.A05(f2);
    }

    public void setOutlineMasksAndMattes(boolean z2) {
        AnonymousClass0Ak r1 = this.A0F;
        if (r1.A0E != z2) {
            r1.A0E = z2;
            C03050Ha r0 = r1.A08;
            if (r0 != null) {
                r0.A0B(z2);
            }
        }
    }

    public void setPerformanceTrackingEnabled(boolean z2) {
        AnonymousClass0Ak r0 = this.A0F;
        r0.A0F = z2;
        AnonymousClass0Rs r02 = r0.A04;
        if (r02 != null) {
            r02.A0D.A00 = z2;
        }
    }

    public void setProgress(float f2) {
        this.A0F.A06(f2);
    }

    public void setRenderMode(AnonymousClass0JU r1) {
        this.A06 = r1;
        A02();
    }

    public void setRepeatCount(int i2) {
        this.A0F.A0K.setRepeatCount(i2);
    }

    public void setRepeatMode(int i2) {
        this.A0F.A0K.setRepeatMode(i2);
    }

    public void setSafeMode(boolean z2) {
        this.A0F.A0G = z2;
    }

    public void setScale(float f2) {
        AnonymousClass0Ak r2 = this.A0F;
        r2.A00 = f2;
        if (getDrawable() == r2) {
            AnonymousClass0A0 r0 = r2.A0K;
            boolean z2 = r0 == null ? false : r0.A07;
            setImageDrawable((Drawable) null);
            setImageDrawable(r2);
            if (z2) {
                r2.A02();
            }
        }
    }

    public void setSpeed(float f2) {
        this.A0F.A0K.A03 = f2;
    }

    public void setTextDelegate(C03990Kr r2) {
        this.A0F.A05 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        r2 = (X.AnonymousClass0Ak) r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void unscheduleDrawable(android.graphics.drawable.Drawable r4) {
        /*
            r3 = this;
            boolean r0 = r3.A0A
            if (r0 != 0) goto L_0x0024
            X.0Ak r2 = r3.A0F
            if (r4 != r2) goto L_0x0028
            X.0A0 r1 = r2.A0K
            if (r1 == 0) goto L_0x0028
            boolean r0 = r1.A07
            if (r0 == 0) goto L_0x0028
            r0 = 0
            r3.A08 = r0
            r3.A0D = r0
            r3.A0E = r0
            r3.A0C = r0
            java.util.ArrayList r0 = r2.A0L
            r0.clear()
            X.AnonymousClass0A0.A01(r1)
            r3.A02()
        L_0x0024:
            super.unscheduleDrawable(r4)
            return
        L_0x0028:
            boolean r0 = r4 instanceof X.AnonymousClass0Ak
            if (r0 == 0) goto L_0x0024
            r2 = r4
            X.0Ak r2 = (X.AnonymousClass0Ak) r2
            X.0A0 r1 = r2.A0K
            if (r1 == 0) goto L_0x0024
            boolean r0 = r1.A07
            if (r0 == 0) goto L_0x0024
            java.util.ArrayList r0 = r2.A0L
            r0.clear()
            X.AnonymousClass0A0.A01(r1)
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.unscheduleDrawable(android.graphics.drawable.Drawable):void");
    }
}
