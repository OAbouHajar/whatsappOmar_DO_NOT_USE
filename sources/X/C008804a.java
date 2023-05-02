package X;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.InputStream;

/* renamed from: X.04a  reason: invalid class name and case insensitive filesystem */
public class C008804a extends Resources {
    public Resources A00;
    public final AnonymousClass013 A01;

    public C008804a(Resources resources, AnonymousClass013 r5) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.A00 = resources;
        this.A01 = r5;
    }

    public static C008804a A00(Resources resources, AnonymousClass013 r2) {
        if (resources != null && r2 != null) {
            return resources instanceof C008804a ? (C008804a) resources : new C008804a(resources, r2);
        }
        throw new NullPointerException("Resources and/or WhatsAppLocale can't be null");
    }

    public XmlResourceParser getAnimation(int i2) {
        return this.A00.getAnimation(i2);
    }

    public boolean getBoolean(int i2) {
        return this.A00.getBoolean(i2);
    }

    public int getColor(int i2) {
        return this.A00.getColor(i2);
    }

    public int getColor(int i2, Resources.Theme theme) {
        return this.A00.getColor(i2, theme);
    }

    public ColorStateList getColorStateList(int i2) {
        return this.A00.getColorStateList(i2);
    }

    public ColorStateList getColorStateList(int i2, Resources.Theme theme) {
        return this.A00.getColorStateList(i2, theme);
    }

    public Configuration getConfiguration() {
        return this.A00.getConfiguration();
    }

    public float getDimension(int i2) {
        return this.A00.getDimension(i2);
    }

    public int getDimensionPixelOffset(int i2) {
        return this.A00.getDimensionPixelOffset(i2);
    }

    public int getDimensionPixelSize(int i2) {
        return this.A00.getDimensionPixelSize(i2);
    }

    public DisplayMetrics getDisplayMetrics() {
        return this.A00.getDisplayMetrics();
    }

    public Drawable getDrawable(int i2) {
        return this.A00.getDrawable(i2);
    }

    public Drawable getDrawable(int i2, Resources.Theme theme) {
        return this.A00.getDrawable(i2, theme);
    }

    public Drawable getDrawableForDensity(int i2, int i3) {
        return this.A00.getDrawableForDensity(i2, i3);
    }

    public Drawable getDrawableForDensity(int i2, int i3, Resources.Theme theme) {
        return this.A00.getDrawableForDensity(i2, i3, theme);
    }

    public float getFloat(int i2) {
        return this.A00.getFloat(i2);
    }

    public Typeface getFont(int i2) {
        return this.A00.getFont(i2);
    }

    public float getFraction(int i2, int i3, int i4) {
        return this.A00.getFraction(i2, i3, i4);
    }

    public int getIdentifier(String str, String str2, String str3) {
        return this.A00.getIdentifier(str, str2, str3);
    }

    public int[] getIntArray(int i2) {
        return this.A00.getIntArray(i2);
    }

    public int getInteger(int i2) {
        return this.A00.getInteger(i2);
    }

    public XmlResourceParser getLayout(int i2) {
        return this.A00.getLayout(i2);
    }

    public Movie getMovie(int i2) {
        return this.A00.getMovie(i2);
    }

    public String getQuantityString(int i2, int i3) {
        return this.A01.A0E((long) i3, i2);
    }

    public String getQuantityString(int i2, int i3, Object... objArr) {
        return this.A01.A0J(objArr, i2, (long) i3);
    }

    public CharSequence getQuantityText(int i2, int i3) {
        return this.A01.A0E((long) i3, i2);
    }

    public String getResourceEntryName(int i2) {
        return this.A00.getResourceEntryName(i2);
    }

    public String getResourceName(int i2) {
        return this.A00.getResourceName(i2);
    }

    public String getResourcePackageName(int i2) {
        return this.A00.getResourcePackageName(i2);
    }

    public String getResourceTypeName(int i2) {
        return this.A00.getResourceTypeName(i2);
    }

    public String getString(int i2) {
        return this.A01.A09(i2);
    }

    public String getString(int i2, Object... objArr) {
        return this.A01.A0C(i2, objArr);
    }

    public String[] getStringArray(int i2) {
        return this.A00.getStringArray(i2);
    }

    public CharSequence getText(int i2) {
        return this.A01.A09(i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r0 = r1.A01.A09(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.CharSequence getText(int r2, java.lang.CharSequence r3) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x000b
            X.013 r0 = r1.A01
            java.lang.String r0 = r0.A09(r2)
            if (r0 == 0) goto L_0x000b
            return r0
        L_0x000b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C008804a.getText(int, java.lang.CharSequence):java.lang.CharSequence");
    }

    public CharSequence[] getTextArray(int i2) {
        return this.A00.getTextArray(i2);
    }

    public void getValue(int i2, TypedValue typedValue, boolean z2) {
        this.A00.getValue(i2, typedValue, z2);
    }

    public void getValue(String str, TypedValue typedValue, boolean z2) {
        this.A00.getValue(str, typedValue, z2);
    }

    public void getValueForDensity(int i2, int i3, TypedValue typedValue, boolean z2) {
        this.A00.getValueForDensity(i2, i3, typedValue, z2);
    }

    public XmlResourceParser getXml(int i2) {
        return this.A00.getXml(i2);
    }

    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.A00.obtainAttributes(attributeSet, iArr);
    }

    public TypedArray obtainTypedArray(int i2) {
        return this.A00.obtainTypedArray(i2);
    }

    public InputStream openRawResource(int i2) {
        return this.A00.openRawResource(i2);
    }

    public InputStream openRawResource(int i2, TypedValue typedValue) {
        return this.A00.openRawResource(i2, typedValue);
    }

    public AssetFileDescriptor openRawResourceFd(int i2) {
        return this.A00.openRawResourceFd(i2);
    }

    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) {
        this.A00.parseBundleExtra(str, attributeSet, bundle);
    }

    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) {
        this.A00.parseBundleExtras(xmlResourceParser, bundle);
    }

    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.A00;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }
}
