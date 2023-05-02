package com.AssemMods;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.TextView;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.others;
import com.obwhatsapp.youbasha.store.ColorStore;

public class FloatingAssem extends ImageButton {
    public static final int[] FloatingActionButton = {yo.getID("fab_colorPressed", "attr"), yo.getID("fab_colorNormal", "attr"), yo.getID("fab_icon", "attr"), yo.getID("fab_size", "attr"), yo.getID("fab_title", "attr")};
    public static final int SIZE_MINI = 1;
    public static final int SIZE_NORMAL = 0;

    /* renamed from: a  reason: collision with root package name */
    private int f191a;

    /* renamed from: b  reason: collision with root package name */
    int f192b;

    /* renamed from: c  reason: collision with root package name */
    int f193c;

    /* renamed from: d  reason: collision with root package name */
    int f194d;

    /* renamed from: e  reason: collision with root package name */
    int f195e;

    /* renamed from: f  reason: collision with root package name */
    String f196f;

    /* renamed from: g  reason: collision with root package name */
    boolean f197g;

    /* renamed from: h  reason: collision with root package name */
    private Drawable f198h;

    /* renamed from: i  reason: collision with root package name */
    private int f199i;

    /* renamed from: j  reason: collision with root package name */
    private float f200j;

    /* renamed from: k  reason: collision with root package name */
    private float f201k;

    /* renamed from: l  reason: collision with root package name */
    private float f202l;

    /* renamed from: m  reason: collision with root package name */
    private int f203m;

    public FloatingAssem(Context context) {
        this(context, (AttributeSet) null);
    }

    public FloatingAssem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public FloatingAssem(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(context, attributeSet);
    }

    private Drawable a(int i2, float f2) {
        int alpha = Color.alpha(i2);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        Paint paint = shapeDrawable.getPaint();
        paint.setAntiAlias(true);
        paint.setColor(i2);
        Drawable[] drawableArr = {shapeDrawable, c(i2, f2)};
        LayerDrawable layerDrawable = (alpha == 255 || !this.f197g) ? new LayerDrawable(drawableArr) : new a(alpha, drawableArr);
        int i3 = (int) (f2 / 2.0f);
        layerDrawable.setLayerInset(1, i3, i3, i3, i3);
        return layerDrawable;
    }

    private static int b(int i2, float f2) {
        float[] fArr = new float[3];
        Color.colorToHSV(i2, fArr);
        fArr[2] = Math.min(fArr[2] * f2, 1.0f);
        return Color.HSVToColor(Color.alpha(i2), fArr);
    }

    private void b() {
        this.f203m = (int) (this.f200j + (this.f201k * 2.0f));
    }

    private static int c(int i2) {
        return Color.argb(Color.alpha(i2) / 2, Color.red(i2), Color.green(i2), Color.blue(i2));
    }

    private Drawable c(int i2, float f2) {
        if (!this.f197g) {
            return new ColorDrawable(0);
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        int b2 = b(i2, 0.9f);
        int c2 = c(b2);
        int b3 = b(i2, 1.1f);
        int c3 = c(b3);
        Paint paint = shapeDrawable.getPaint();
        paint.setAntiAlias(true);
        paint.setStrokeWidth(f2);
        paint.setStyle(Paint.Style.STROKE);
        shapeDrawable.setShaderFactory(new 1(this, b3, c3, i2, c2, b2));
        return shapeDrawable;
    }

    private void c() {
        this.f200j = b(yo.getID(this.f199i == 0 ? "fab_size_normal_assem" : "fab_size_mini", "dimen"));
    }

    public static int getFABIconsColor() {
        return others.getColor("ModFabTextColor", -1);
    }

    private void setBackgroundCompat(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            setBackground(drawable);
        } else {
            setBackgroundDrawable(drawable);
        }
    }

    /* access modifiers changed from: package-private */
    public final int a(int i2) {
        return getResources().getColor(i2);
    }

    /* access modifiers changed from: package-private */
    public void a() {
        float b2 = b(yo.getID("fab_stroke_width_assem", "dimen"));
        float f2 = b2 / 2.0f;
        Drawable[] drawableArr = new Drawable[4];
        drawableArr[0] = getResources().getDrawable(yo.getID(this.f199i == 0 ? "fab_bg_normal" : "fab_bg_mini", "drawable"));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16842910}, a(this.f194d, b2));
        stateListDrawable.addState(new int[]{16842919}, a(this.f193c, b2));
        stateListDrawable.addState(new int[0], a(this.f192b, b2));
        drawableArr[1] = stateListDrawable;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        Paint paint = shapeDrawable.getPaint();
        paint.setAntiAlias(true);
        paint.setStrokeWidth(b2);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-16777216);
        paint.setAlpha(5);
        drawableArr[2] = shapeDrawable;
        drawableArr[3] = getIconDrawable();
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        int b3 = ((int) (this.f200j - b(yo.getID("fab_icon_size", "dimen")))) / 2;
        float f3 = this.f201k;
        int i2 = (int) f3;
        float f4 = this.f202l;
        int i3 = (int) (f3 - f4);
        int i4 = (int) (f3 + f4);
        layerDrawable.setLayerInset(1, i2, i3, i2, i4);
        int i5 = (int) (((float) i2) - f2);
        LayerDrawable layerDrawable2 = layerDrawable;
        layerDrawable2.setLayerInset(2, i5, (int) (((float) i3) - f2), i5, (int) (((float) i4) - f2));
        int i6 = i2 + b3;
        layerDrawable2.setLayerInset(3, i6, i3 + b3, i6, i4 + b3);
        setBackgroundCompat(layerDrawable);
    }

    /* access modifiers changed from: package-private */
    public void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, FloatingActionButton, 0, 0);
        this.f192b = others.getColor("ModFabNormalColor", ColorStore.getBGColor());
        this.f193c = others.getColor("ModFabPressedColor", com.obwhatsapp.yo.ColorStore.getFabColorPressed());
        this.f194d = obtainStyledAttributes.getColor(obtainStyledAttributes.getIndex(1), com.obwhatsapp.yo.ColorStore.getFabColorPressed());
        this.f195e = ColorStore.getFABIBlackAssem();
        c();
        this.f201k = b(yo.getID("fab_shadow_radius_assem", "dimen"));
        this.f202l = b(yo.getID("fab_shadow_offset", "dimen"));
        b();
        a();
        obtainStyledAttributes.recycle();
        setColorFilter(this.f195e, PorterDuff.Mode.SRC_IN);
    }

    /* access modifiers changed from: package-private */
    public final float b(int i2) {
        return getResources().getDimension(i2);
    }

    public int getColorDisabled() {
        return this.f194d;
    }

    public int getColorNormal() {
        return this.f192b;
    }

    public int getColorPressed() {
        return this.f193c;
    }

    /* access modifiers changed from: package-private */
    public Drawable getIconDrawable() {
        Drawable drawable = this.f198h;
        return drawable != null ? drawable : this.f191a != 0 ? getResources().getDrawable(this.f191a) : new ColorDrawable(0);
    }

    /* access modifiers changed from: package-private */
    public TextView getLabelView() {
        return (TextView) getTag(yo.getID("fab_label", "id"));
    }

    public int getSize() {
        return this.f199i;
    }

    public String getTitle() {
        return this.f196f;
    }

    public boolean isStrokeVisible() {
        return this.f197g;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int i4 = this.f203m;
        setMeasuredDimension(i4, i4);
    }

    public void setColorDisabled(int i2) {
        if (this.f194d != i2) {
            this.f194d = i2;
            a();
        }
    }

    public void setColorDisabledResId(int i2) {
        setColorDisabled(a(i2));
    }

    public void setColorNormal(int i2) {
        if (this.f192b != i2) {
            this.f192b = i2;
            a();
        }
    }

    public void setColorNormalResId(int i2) {
        setColorNormal(a(i2));
    }

    public void setColorPressed(int i2) {
        if (this.f193c != i2) {
            this.f193c = i2;
            a();
        }
    }

    public void setColorPressedResId(int i2) {
        setColorPressed(a(i2));
    }

    public void setIcon(int i2) {
        if (this.f191a != i2) {
            this.f191a = i2;
            this.f198h = null;
            a();
        }
    }

    public void setIconDrawable(Drawable drawable) {
        if (this.f198h != drawable) {
            this.f191a = 0;
            this.f198h = drawable;
            a();
        }
    }

    public void setSize(int i2) {
        if (i2 != 1 && i2 != 0) {
            throw new IllegalArgumentException("Use @FAB_SIZE constants only!");
        } else if (this.f199i != i2) {
            this.f199i = i2;
            c();
            b();
            a();
        }
    }

    public void setStrokeVisible(boolean z2) {
        if (this.f197g != z2) {
            this.f197g = z2;
            a();
        }
    }

    public void setTitle(String str) {
        this.f196f = str;
        TextView labelView = getLabelView();
        if (labelView != null) {
            labelView.setText(str);
        }
    }

    public void setVisibility(int i2) {
        TextView labelView = getLabelView();
        if (labelView != null) {
            labelView.setVisibility(i2);
        }
        super.setVisibility(i2);
    }
}
