package com.obwhatsapp.youbasha.ui.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import com.obwhatsapp.yo.ColorStore;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.others;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@SuppressLint({"AppCompatCustomView"})
public class FloatingActionButton extends ImageButton {
    public static final int[] FloatingActionButton = {yo.getID("fab_colorPressed", "attr"), yo.getID("fab_colorNormal", "attr"), yo.getID("fab_icon", "attr"), yo.getID("fab_size", "attr"), yo.getID("fab_title", "attr")};
    public static final int SIZE_MINI = 1;
    public static final int SIZE_NORMAL = 0;

    /* renamed from: a  reason: collision with root package name */
    public int f1349a;

    /* renamed from: b  reason: collision with root package name */
    public int f1350b;

    /* renamed from: c  reason: collision with root package name */
    public int f1351c;

    /* renamed from: d  reason: collision with root package name */
    public int f1352d;

    /* renamed from: e  reason: collision with root package name */
    public String f1353e;

    /* renamed from: f  reason: collision with root package name */
    public int f1354f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f1355g;

    /* renamed from: h  reason: collision with root package name */
    public int f1356h;

    /* renamed from: i  reason: collision with root package name */
    public float f1357i;

    /* renamed from: j  reason: collision with root package name */
    public float f1358j;

    /* renamed from: k  reason: collision with root package name */
    public float f1359k;

    /* renamed from: l  reason: collision with root package name */
    public int f1360l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1361m;

    @Retention(RetentionPolicy.SOURCE)
    public @interface FAB_SIZE {
    }

    static {
        String str = "ۡۚۤۡۛۦۘۡۢۗۜۢۢۥۧۜۘۛۥۨۖۗۜۦۜۗ";
        while (true) {
            switch ((str.hashCode() ^ 306) ^ 945812755) {
                case 287155342:
                    return;
                case 593487720:
                    str = "ۦ۠ۨ۟ۚ۟ۦۧۢ۟ۦۨۘۗ۬۠ۧۨ۫۫ۖۗۖۨۦۘ";
                    break;
            }
        }
    }

    public FloatingActionButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(context, attributeSet);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        c(context, attributeSet);
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0002 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getFABIconsColor() {
        /*
            java.lang.String r0 = "۠ۖۧۘۤۘۛ۬ۙۥۙۖۨۘۚۡۡۚۘۘۗۗ"
        L_0x0002:
            int r1 = r0.hashCode()
            r2 = 39
            r3 = 404850627(0x182187c3, float:2.0877304E-24)
            r1 = r1 ^ r2
            r1 = r1 ^ r3
            switch(r1) {
                case 1330203073: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0002
        L_0x0011:
            java.lang.String r0 = "ModFabTextColor"
            r1 = -1
            int r0 = com.obwhatsapp.youbasha.others.getColor(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.views.FloatingActionButton.getFABIconsColor():int");
    }

    @SuppressLint({"NewApi"})
    private void setBackgroundCompat(Drawable drawable) {
        String str = "۫ۜۙ۫ۙۘۘۛۢۜۛ۫ۨۘۚ۟ۘ۬ۧۖۘ۫۬ۡۘ";
        while (true) {
            switch ((str.hashCode() ^ 578) ^ 586958649) {
                case -171737486:
                    str = "ۤۘ۟۟ۚۚۤۧۡ۫ۖۡ۬ۘۘۘ";
                    break;
                case 292152323:
                    str = "ۧۡۘۘۡۤۡۘۖۗۦۖ۟ۧۜۤۧۖۖ۟";
                    break;
                case 1342919042:
                    return;
                case 1578351670:
                    setBackground(drawable);
                    str = "ۙۘۦۙۙۜۗ۫ۥۘ۫ۦۘۚۚۦ۬۫۠ۢ۟";
                    break;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: android.graphics.drawable.ShapeDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v1, resolved type: android.graphics.drawable.ShapeDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: android.graphics.drawable.ShapeDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: android.graphics.drawable.ShapeDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v3, resolved type: android.graphics.drawable.ShapeDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v48, resolved type: android.graphics.drawable.ShapeDrawable} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.LayerDrawable a(int r28, float r29) {
        /*
            r27 = this;
            r26 = 0
            r25 = 0
            r24 = 0
            r23 = 0
            r22 = 0
            r17 = 0
            r13 = 0
            r7 = 0
            r6 = 0
            r12 = 0
            r3 = 0
            r4 = 0
            r11 = 0
            r9 = 0
            r21 = 0
            r15 = 0
            r5 = 0
            r8 = 0
            r10 = 0
            java.lang.String r2 = "ۤۢۧۢۢۜۘ۫ۙۖۜۧۗۘ۟ۡۖ۫۬ۢۥۧ"
            r14 = r5
            r16 = r9
            r18 = r11
            r19 = r12
            r20 = r13
        L_0x0025:
            int r5 = r2.hashCode()
            r9 = 7
            r11 = -275776344(0xffffffffef8ffca8, float:-8.91236E28)
            r5 = r5 ^ r9
            r5 = r5 ^ r11
            switch(r5) {
                case -2066802536: goto L_0x0236;
                case -2024037735: goto L_0x0070;
                case -1937468578: goto L_0x0205;
                case -1906735846: goto L_0x0174;
                case -1822088770: goto L_0x0146;
                case -1595450224: goto L_0x01bb;
                case -1249773564: goto L_0x00e8;
                case -1105157147: goto L_0x0036;
                case -1058545341: goto L_0x023a;
                case -973505116: goto L_0x01a6;
                case -972045991: goto L_0x0211;
                case -949665696: goto L_0x019a;
                case -852830389: goto L_0x0216;
                case -722465734: goto L_0x003c;
                case -587866053: goto L_0x0039;
                case -493732697: goto L_0x00c9;
                case -385212330: goto L_0x0078;
                case -348062400: goto L_0x0066;
                case -97368870: goto L_0x017f;
                case -92808853: goto L_0x01ad;
                case -56163616: goto L_0x00f6;
                case 14354170: goto L_0x01f3;
                case 53639174: goto L_0x0124;
                case 174629492: goto L_0x022e;
                case 183272276: goto L_0x00d4;
                case 530142490: goto L_0x021f;
                case 568007114: goto L_0x00b0;
                case 678448537: goto L_0x0138;
                case 799837465: goto L_0x0110;
                case 960526827: goto L_0x00aa;
                case 1104120910: goto L_0x005d;
                case 1325459539: goto L_0x009e;
                case 1469774888: goto L_0x018a;
                case 1473112563: goto L_0x00c0;
                case 1480303010: goto L_0x0054;
                case 1675393102: goto L_0x016a;
                case 1684838626: goto L_0x0045;
                case 1712978577: goto L_0x0033;
                case 1892896337: goto L_0x007e;
                case 1900745171: goto L_0x0200;
                case 1921376678: goto L_0x01d2;
                case 2008587299: goto L_0x01a0;
                case 2101664760: goto L_0x0160;
                case 2104985922: goto L_0x0119;
                default: goto L_0x0032;
            }
        L_0x0032:
            goto L_0x0025
        L_0x0033:
            java.lang.String r2 = "ۜۤۜۘۦۧۤۥۦۤ۟ۡ۠ۜۡۦۗۥۤۨۧۘ"
            goto L_0x0025
        L_0x0036:
            java.lang.String r2 = "ۡۛۚ۫ۦۥ۠ۚ۬۬ۨۨۘۤۚۢۢۛۥ"
            goto L_0x0025
        L_0x0039:
            java.lang.String r2 = "ۨۧ۬۫ۥ۬ۗۦۘ۟ۙۖۘ۟ۗۜۙۥۨۘۨۨۨۘ۠ۤۜۘۨۛۦۘ"
            goto L_0x0025
        L_0x003c:
            int r5 = android.graphics.Color.alpha(r28)
            java.lang.String r2 = "۟ۥۢ۠ۨۗۙۥۘۘ۫ۥ۟ۗۡۥ۬ۢۥۘۖۙۖۘۨۧۘۜ۟ۦ"
            r26 = r5
            goto L_0x0025
        L_0x0045:
            android.graphics.drawable.ShapeDrawable r5 = new android.graphics.drawable.ShapeDrawable
            android.graphics.drawable.shapes.OvalShape r2 = new android.graphics.drawable.shapes.OvalShape
            r2.<init>()
            r5.<init>(r2)
            java.lang.String r2 = "ۢۘۥۘۚۙ۫۬ۢۜ۫ۘۘۙۤۢۗۙۨۘۥۢ۫"
            r25 = r5
            goto L_0x0025
        L_0x0054:
            android.graphics.Paint r5 = r25.getPaint()
            java.lang.String r2 = "۟ۤۡۘۛۧۗ۟ۤۘۚۧۖۘۜۢۜ۠ۖۚ"
            r24 = r5
            goto L_0x0025
        L_0x005d:
            r2 = 1
            r0 = r24
            r0.setAntiAlias(r2)
            java.lang.String r2 = "ۜۗۥۖۙۤۥۜۖۘۢۨۥ۟۫۟ۛۖۨۡۡۘ"
            goto L_0x0025
        L_0x0066:
            r0 = r24
            r1 = r28
            r0.setColor(r1)
            java.lang.String r2 = "۠۫ۨۗ۫ۚۡ۠ۨۢ۫ۗۧۢ۬ۛۨۦ"
            goto L_0x0025
        L_0x0070:
            r2 = 2
            android.graphics.drawable.Drawable[] r5 = new android.graphics.drawable.Drawable[r2]
            java.lang.String r2 = "ۡۧۥۢۛۦۘ۬ۨۖۘۡ۟ۜۘۛ۟ۥۘ"
            r23 = r5
            goto L_0x0025
        L_0x0078:
            r2 = 0
            r23[r2] = r25
            java.lang.String r2 = "ۗۜۡ۟ۗۥۘۜۨۗۙ۟ۘۘۖۘۡۘۥۨۛۦ۟۠ۦۖۜۘ"
            goto L_0x0025
        L_0x007e:
            r5 = -1003755079(0xffffffffc42be9b9, float:-687.6519)
            java.lang.String r2 = "ۘۚۡۤۥۖۘۚۘ۬ۖۡۙ۫ۗۖ"
        L_0x0083:
            int r9 = r2.hashCode()
            r9 = r9 ^ r5
            switch(r9) {
                case -1863088175: goto L_0x008c;
                case -648907620: goto L_0x022a;
                case -419142232: goto L_0x0098;
                case 1852154588: goto L_0x009b;
                default: goto L_0x008b;
            }
        L_0x008b:
            goto L_0x0083
        L_0x008c:
            r0 = r27
            boolean r2 = r0.f1361m
            if (r2 != 0) goto L_0x0095
            java.lang.String r2 = "ۖ۟ۦۘۖۜۡۙۤۖۘۧ۟ۡۘۤۡۨۘۗۛۥۛۘۘۧۢ۟ۗۛۖ"
            goto L_0x0083
        L_0x0095:
            java.lang.String r2 = "ۡۤۗۤۡۥ۟۟۬۫ۖۨۘۗۛۙۙ۠۟ۖۨۨۘ۠۬ۜۛۨ"
            goto L_0x0083
        L_0x0098:
            java.lang.String r2 = "۬ۙۡۦۗ۫ۖ۟۠ۙ۬ۜۘۖۗۥۘۖۢ۬ۚۤۛ"
            goto L_0x0083
        L_0x009b:
            java.lang.String r2 = "ۢۗۡۘۧۧۧۤۜۘۥۗۦۖۗ۟ۧۖۢۢۚۘ"
            goto L_0x0025
        L_0x009e:
            android.graphics.drawable.ColorDrawable r22 = new android.graphics.drawable.ColorDrawable
            r2 = 0
            r0 = r22
            r0.<init>(r2)
            java.lang.String r2 = "ۥۧ۬۟ۤۘۘۥۤۖۘۨۖۖۘ۬ۧ۟"
            goto L_0x0025
        L_0x00aa:
            java.lang.String r2 = "ۡ۫۫ۖۙۧۖۖۜۘۥۘ۠ۧۙۛ"
            r21 = r22
            goto L_0x0025
        L_0x00b0:
            android.graphics.drawable.ShapeDrawable r17 = new android.graphics.drawable.ShapeDrawable
            android.graphics.drawable.shapes.OvalShape r2 = new android.graphics.drawable.shapes.OvalShape
            r2.<init>()
            r0 = r17
            r0.<init>(r2)
            java.lang.String r2 = "ۢۥۦ۫ۢ۟ۗۨۗۖۤ۟ۖۙۨۤۛۘۘۚ۬ۚ"
            goto L_0x0025
        L_0x00c0:
            r2 = 3
            float[] r5 = new float[r2]
            java.lang.String r2 = "ۨ۠ۡۛۛۖۜۗ۟ۖۘۡۖۖ"
            r20 = r5
            goto L_0x0025
        L_0x00c9:
            r0 = r28
            r1 = r20
            android.graphics.Color.colorToHSV(r0, r1)
            java.lang.String r2 = "ۥۡ۠۫ۡۧۚ۫ۜۚۛۜۗۧۥۡۦۘ"
            goto L_0x0025
        L_0x00d4:
            r2 = 2
            r5 = 2
            r5 = r20[r5]
            r9 = 1063675494(0x3f666666, float:0.9)
            float r5 = r5 * r9
            r9 = 1065353216(0x3f800000, float:1.0)
            float r5 = java.lang.Math.min(r5, r9)
            r20[r2] = r5
            java.lang.String r2 = "ۧۖۘۘ۬ۥ۠ۙ۟ۖۘۧۙ۫ۢۨ۬ۡۡۘ"
            goto L_0x0025
        L_0x00e8:
            int r2 = android.graphics.Color.alpha(r28)
            r0 = r20
            int r7 = android.graphics.Color.HSVToColor(r2, r0)
            java.lang.String r2 = "ۛۚ۟ۧۢۗۜۨۨ۟ۤۚۤۖۖ"
            goto L_0x0025
        L_0x00f6:
            int r2 = android.graphics.Color.alpha(r7)
            int r2 = r2 / 2
            int r5 = android.graphics.Color.red(r7)
            int r6 = android.graphics.Color.green(r7)
            int r9 = android.graphics.Color.blue(r7)
            int r6 = android.graphics.Color.argb(r2, r5, r6, r9)
            java.lang.String r2 = "ۡ۠ۡۘۗۡۛۢۨۖۡۘۦۚ۬۫ۧۙۗۚۘۜۘۜۜۖ"
            goto L_0x0025
        L_0x0110:
            r2 = 3
            float[] r5 = new float[r2]
            java.lang.String r2 = "ۦ۠ۦۘ۬ۡۡۘۤۜ۫ۢ۟ۗۙۗۨۘۨۦۖۘ"
            r19 = r5
            goto L_0x0025
        L_0x0119:
            r0 = r28
            r1 = r19
            android.graphics.Color.colorToHSV(r0, r1)
            java.lang.String r2 = "ۙ۟ۨۘ۫ۙۤۤ۟۬ۢۙۚۢۘۥ۠۠ۖۚۗ۠ۗۚۜۘ"
            goto L_0x0025
        L_0x0124:
            r2 = 2
            r5 = 2
            r5 = r19[r5]
            r9 = 1066192077(0x3f8ccccd, float:1.1)
            float r5 = r5 * r9
            r9 = 1065353216(0x3f800000, float:1.0)
            float r5 = java.lang.Math.min(r5, r9)
            r19[r2] = r5
            java.lang.String r2 = "ۖۙۨۘۥۙۗۛۚۘۘۤ۫۠۫ۧ۟ۗۡۦۘۖۦۧۘ"
            goto L_0x0025
        L_0x0138:
            int r2 = android.graphics.Color.alpha(r28)
            r0 = r19
            int r3 = android.graphics.Color.HSVToColor(r2, r0)
            java.lang.String r2 = "ۘۘۥۘ۫ۢۘۘۡۗۡۘۨ۫ۧۢۖۡۘۦ۟ۙۨۗۦۥ۫ۜۘ"
            goto L_0x0025
        L_0x0146:
            int r2 = android.graphics.Color.alpha(r3)
            int r2 = r2 / 2
            int r4 = android.graphics.Color.red(r3)
            int r5 = android.graphics.Color.green(r3)
            int r9 = android.graphics.Color.blue(r3)
            int r4 = android.graphics.Color.argb(r2, r4, r5, r9)
            java.lang.String r2 = "ۙ۬۫ۙۜۦۘ۫۟ۡۘ۠۫ۛۜۥۘ"
            goto L_0x0025
        L_0x0160:
            android.graphics.Paint r5 = r17.getPaint()
            java.lang.String r2 = "۟ۚۖۙۙۢۧۖۨۜ۫ۢ۬ۖۘۘۦۗۚۛۨۘۗۛۦۨۚۨ"
            r18 = r5
            goto L_0x0025
        L_0x016a:
            r2 = 1
            r0 = r18
            r0.setAntiAlias(r2)
            java.lang.String r2 = "ۗۡۦۗۨۜ۬ۚۦۦۜۖۥۜ۟ۗۦۦۘۡۖۜ"
            goto L_0x0025
        L_0x0174:
            r0 = r18
            r1 = r29
            r0.setStrokeWidth(r1)
            java.lang.String r2 = "ۛۖۨۦۚۚۦۘۘۚۡۧۧۢۘۘۥ۠ۧۜۚۡۢ۬ۤ"
            goto L_0x0025
        L_0x017f:
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r0 = r18
            r0.setStyle(r2)
            java.lang.String r2 = "ۨۨۥۘۧۢۨۘۗۨۧۘ۬ۨۙۚۗ۠۫ۘۚ"
            goto L_0x0025
        L_0x018a:
            com.obwhatsapp.youbasha.ui.views.d r2 = new com.obwhatsapp.youbasha.ui.views.d
            r5 = r28
            r2.<init>(r3, r4, r5, r6, r7)
            r0 = r17
            r0.setShaderFactory(r2)
            java.lang.String r2 = "۟ۙۤۜۤۦۘۗۚۦۥۖۧۘۙۚۤۖۜۢۤۧۦۘ"
            goto L_0x0025
        L_0x019a:
            java.lang.String r2 = "ۚ۫ۘۢۜۗۢۗۨ۫ۥۛۧۘ۠ۥۢۨۢۛۥ"
            r16 = r17
            goto L_0x0025
        L_0x01a0:
            java.lang.String r2 = "ۡۗۙۨۗۤ۠۬۬ۢۦۘۜۛ۬ۤ۬ۚ"
            r21 = r16
            goto L_0x0025
        L_0x01a6:
            r2 = 1
            r23[r2] = r21
            java.lang.String r2 = "ۜۖۜۛۡۘ۫ۚۖۜ۠ۤۛۡۚۘۙ۟ۦۙۖۘۧۧۛۖۙۚ"
            goto L_0x0025
        L_0x01ad:
            r5 = -536576713(0xffffffffe0047d37, float:-3.818739E19)
            java.lang.String r2 = "ۙۡ۬ۘۗۜۘ۠ۧۙۧۧۦۥۛ۠ۦ۫۫ۘۨۖۘۢۥۡۘۨ۟ۜۘ"
        L_0x01b2:
            int r9 = r2.hashCode()
            r9 = r9 ^ r5
            switch(r9) {
                case -1743700967: goto L_0x01c2;
                case 705057154: goto L_0x01cb;
                case 1231955656: goto L_0x01ce;
                case 1879714974: goto L_0x01bb;
                default: goto L_0x01ba;
            }
        L_0x01ba:
            goto L_0x01b2
        L_0x01bb:
            java.lang.String r2 = "ۜۥۜۘۛۛۤۗۥ۠ۤۡۗۢۙۥۘ"
            goto L_0x0025
        L_0x01bf:
            java.lang.String r2 = "ۚ۫ۙ۠ۜۨۘ۫۫ۖۢۛۨۗۧۦ"
            goto L_0x01b2
        L_0x01c2:
            r2 = 255(0xff, float:3.57E-43)
            r0 = r26
            if (r0 == r2) goto L_0x01bf
            java.lang.String r2 = "ۢۧ۫ۨۢۡۘۛۖۧۘۙۦۨۖۧۤۧۗ۠"
            goto L_0x01b2
        L_0x01cb:
            java.lang.String r2 = "ۨۧ۠۠ۛۥۘ۠ۘۘۘۚ۠ۜۜۘۙۘۡۘۗۢ۬ۥ۬ۖۘۧۖۗ"
            goto L_0x01b2
        L_0x01ce:
            java.lang.String r2 = "ۚۚۜۘۖۢۡ۠ۚۚ۬ۡۨۙۦۗۜۙۤ"
            goto L_0x0025
        L_0x01d2:
            r5 = -276846975(0xffffffffef7fa681, float:-7.911997E28)
            java.lang.String r2 = "ۖۡۢۢۛۖۘ۬ۦۦۤۘ۠ۨ۠۠ۚۘۙۘۖ۠ۖۧۛۥۢۜۘ"
        L_0x01d7:
            int r9 = r2.hashCode()
            r9 = r9 ^ r5
            switch(r9) {
                case -1497729030: goto L_0x01e0;
                case -280040121: goto L_0x01e7;
                case 849811578: goto L_0x01f0;
                case 1848307549: goto L_0x0232;
                default: goto L_0x01df;
            }
        L_0x01df:
            goto L_0x01d7
        L_0x01e0:
            java.lang.String r2 = "ۧۨۧۘ۬۠۠ۡۤۦۖۖ۠ۡۗۙۘۡ۫۫ۘۢ"
            goto L_0x0025
        L_0x01e4:
            java.lang.String r2 = "۬ۙۧۡ۟ۦۘۗۙۙۦۤۜ۠ۖۘۢۗۢ"
            goto L_0x01d7
        L_0x01e7:
            r0 = r27
            boolean r2 = r0.f1361m
            if (r2 != 0) goto L_0x01e4
            java.lang.String r2 = "۟ۦ۠ۦۢۡۘۨ۫ۗ۬ۖۘۤ۬ۜ۠ۚ۬ۜۡۦۘ"
            goto L_0x01d7
        L_0x01f0:
            java.lang.String r2 = "ۙ۫ۙۛۘۢۜۚ۠ۦ۫ۡۚ۫ۦۘ"
            goto L_0x01d7
        L_0x01f3:
            com.obwhatsapp.youbasha.ui.views.e r15 = new com.obwhatsapp.youbasha.ui.views.e
            r0 = r26
            r1 = r23
            r15.<init>(r0, r1)
            java.lang.String r2 = "۠۟ۨۘۙۢۖۖ۠ۡۦۨۚۤۚۡۛ۫ۛۦۡۙۖۥۘ۠ۡۧۘ"
            goto L_0x0025
        L_0x0200:
            java.lang.String r2 = "۠۫ۚۨ۟ۡۘۤۖۢۡۦۦۘۦ۠ۥ۟ۢۜۘ۬ۥۥۘۢ۫ۖۘ"
            r8 = r15
            goto L_0x0025
        L_0x0205:
            android.graphics.drawable.LayerDrawable r5 = new android.graphics.drawable.LayerDrawable
            r0 = r23
            r5.<init>(r0)
            java.lang.String r2 = "۠ۗۜۘۛۡۘۘۚۚۚ۫۟ۡۘۡۘ۬۬۠ۨۘۧۚۖ"
            r14 = r5
            goto L_0x0025
        L_0x0211:
            java.lang.String r2 = "۬ۧۜۘۗ۠ۘۙۧۖ۠ۛۨ۠ۚ۠ۚۧۙۥۡۘۗۛۡ"
            r8 = r14
            goto L_0x0025
        L_0x0216:
            r2 = 1073741824(0x40000000, float:2.0)
            float r2 = r29 / r2
            int r10 = (int) r2
            java.lang.String r2 = "ۧۛۘ۫ۘ۠ۖۖۖۨۦ۬ۥۖۗۦۨۖ"
            goto L_0x0025
        L_0x021f:
            r9 = 1
            r11 = r10
            r12 = r10
            r13 = r10
            r8.setLayerInset(r9, r10, r11, r12, r13)
            java.lang.String r2 = "ۦۗۦۖ۟ۛۧۨۘۜ۟ۖۘۜۥ۬ۚ۠ۖۘ"
            goto L_0x0025
        L_0x022a:
            java.lang.String r2 = "ۚۡۙۜۨۖۦۙۦ۟ۢۨۜۧۚ"
            goto L_0x0025
        L_0x022e:
            java.lang.String r2 = "ۡۗۙۨۗۤ۠۬۬ۢۦۘۜۛ۬ۤ۬ۚ"
            goto L_0x0025
        L_0x0232:
            java.lang.String r2 = "ۛۡۜۧۤ۫۠۫ۗ۫۠ۨۘۙۖ۫"
            goto L_0x0025
        L_0x0236:
            java.lang.String r2 = "۬ۧۜۘۗ۠ۘۙۧۖ۠ۛۨ۠ۚ۠ۚۧۙۥۡۘۗۛۡ"
            goto L_0x0025
        L_0x023a:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.views.FloatingActionButton.a(int, float):android.graphics.drawable.LayerDrawable");
    }

    public final float b(int i2) {
        String str = "ۡۡ۫۟ۨۢۧۡۢۗۦۨۤۨۡ";
        while (true) {
            switch ((str.hashCode() ^ 875) ^ 435054722) {
                case -1665764329:
                    str = "ۜۛ۠ۚۜۖۦۨ۟ۥ۬ۚۚۥۘ";
                    break;
                case 636711918:
                    return getResources().getDimension(i2);
                case 2031252973:
                    str = "ۛ۫ۢۤ۬ۖۨۤۖۛۗۡۢۚ۫ۚ۟ۜۢ۬ۥ۫ۥۘۥۢۜۘ";
                    break;
            }
        }
    }

    public void c(Context context, AttributeSet attributeSet) {
        float f2 = 0.0f;
        String str = "ۧۛ۫ۘۜۥۢۢۜۘۗ۟ۨۘ۟ۗۜۘ";
        String str2 = null;
        String str3 = null;
        String str4 = null;
        TypedArray typedArray = null;
        while (true) {
            switch ((str.hashCode() ^ 898) ^ 1082323758) {
                case -2131692093:
                    str4 = "fab_size_normal";
                    str = "ۚۤۡۘۖۥۛۜ۬ۖۘۥ۠ۨۘۛۙ۫";
                    break;
                case -1928307100:
                    this.f1357i = b(yo.getID(str3, "dimen"));
                    str = "۟ۦۘۘ۬ۢۗۙۜۜۤۥۘۘۛۧۖۘ";
                    break;
                case -1330668793:
                    this.f1350b = others.getColor("ModFabPressedColor", ColorStore.getFabColorPressed());
                    str = "ۦۚ۫ۛ۫ۥۥۢ۟ۥۙۥۘ۠ۢۢ۟ۖۜۧۦۡۜۧۚ";
                    break;
                case -1161650695:
                    str = "ۥۢ۫ۧۤۛۢ۠ۙۘ۬۬ۜۨۨۘۦۤۨۘۧۡۛۧۚۧ";
                    break;
                case -1090348183:
                    str = "ۡ۫۫ۡۡ۫ۡۙۛۖۦ۠ۧۦۜ";
                    str3 = str4;
                    break;
                case -1020956578:
                    str = "ۙ۟ۧ۬۬۟ۤۨ۠ۦۨۡۡۡۧۘۙۨۦ۬ۚۖۘ";
                    break;
                case -930353362:
                    str = "ۡۙۖۜۛۥۘۗ۫ۛۗۦ۟ۨۗ۟ۖ۟ۘۛۛ۠";
                    str3 = str2;
                    break;
                case -588629467:
                    f2 = this.f1357i;
                    str = "ۨ۟ۨ۠ۨۡۘ۟۫ۦۦۦۘ۟ۥۡۡۥۨۘ";
                    break;
                case -527656978:
                    d();
                    str = "ۧۙۥۤۤۜۗۨۖۘۤۚۥ۬ۗۨۘۙۢۜ";
                    break;
                case -490306576:
                    setColorFilter(this.f1352d, PorterDuff.Mode.SRC_IN);
                    str = "ۦۘ۬ۙۧۢۤۜۡۢۥ۟۫ۨۜۖۘۘۧۗ";
                    break;
                case -252361417:
                    str2 = "fab_size_mini";
                    str = "ۜۦۦۦ۬ۜۡۢ۠ۙۥۨۧۚۦۘۥ۟ۘ";
                    break;
                case -79852541:
                    this.f1359k = b(yo.getID("fab_shadow_offset", "dimen"));
                    str = "۠۠ۜۘۨۚ۫ۗۨۤۖۥۘۚۘۧۛۢۦ";
                    break;
                case -7102006:
                    str = "ۡۙۖۜۛۥۘۗ۫ۛۗۦ۟ۨۗ۟ۖ۟ۘۛۛ۠";
                    break;
                case 237746050:
                    this.f1358j = b(yo.getID("fab_shadow_radius", "dimen"));
                    str = "ۚۚ۫ۥۙ۫ۖۚ۬ۗ۬۬ۚۨۙۗۙۡۥ۬ۥ";
                    break;
                case 545663825:
                    this.f1351c = typedArray.getColor(typedArray.getIndex(1), ColorStore.getFabColorNormal());
                    str = "ۗۚۥۘۛۧۘۘ۬ۙۢۖ۟ۙۗۥۙ۠۫ۛۨۖۧۘ";
                    break;
                case 828637055:
                    this.f1349a = others.getColor("ModFabNormalColor", ColorStore.getFabColorNormal());
                    str = "ۧۖۢۧۨۡۘۗۡ۟۫۫ۨۗۨۦۘۦ۬ۢۦ۟۟";
                    break;
                case 963654765:
                    this.f1360l = (int) ((this.f1358j * 2.0f) + f2);
                    str = "ۥۖۘۘۧۗۗۥۥۘ۬ۤۘۛۙ۬۠ۙ۫";
                    break;
                case 1209355629:
                    this.f1352d = getFABIconsColor();
                    str = "ۗ۠ۗۙۤ۠ۙ۫۟ۢۨۢ۠ۗۘۘۤۥۧۘ";
                    break;
                case 1249142200:
                    return;
                case 1682752166:
                    str = "ۜۦۛ۟ۗۨۦۢۤۨ۬ۦ۬۬۫ۧۛۨۘۡۗۜۡ۫ۗۢۦۦۘ";
                    typedArray = context.obtainStyledAttributes(attributeSet, FloatingActionButton, 0, 0);
                    break;
                case 1806520009:
                    typedArray.recycle();
                    str = "۟۬ۤۨۧ۟ۧۖۛۢۖۢۘۖۥۘ";
                    break;
                case 2091862963:
                    String str5 = "۬۟ۥۘۜۡۘۗ۠۟ۢۖۨۘۖۨۥۘۦۚۖ";
                    while (true) {
                        switch (str5.hashCode() ^ 868980724) {
                            case -1842743979:
                                str = "ۧ۠ۥۤۡۙۢۢ۠ۙۖ۠ۚ۠ۨ";
                                continue;
                            case -675404380:
                                if (this.f1356h != 0) {
                                    str5 = "ۧۚۚۗۜۡۛۛۦۘ۠ۦۢ۟ۡ۠۫ۨۥۘۢۦۨ";
                                    break;
                                } else {
                                    str5 = "ۤۖۤۛۗۜۘۦ۠ۢۥۗۦۘۖۨۥۘۧۙ۠۫ۘۦۘ۟۫ۘۜۘ";
                                    break;
                                }
                            case -161251585:
                                str = "ۚ۬۫ۨۥۢۗ۬ۢۥۤۙۢۦ۫ۢۨۚ۠ۢۥۘ";
                                continue;
                            case 1098175542:
                                str5 = "ۗۙۥۘۘۚۖۘ۠ۧۦۗۥۛۧۚۧۨۛۡ";
                                break;
                        }
                    }
                    break;
                case 2114071806:
                    str = "ۖۙ۫ۧۛۡ۬ۢۙۛۘۙۦ۠ۗۘ۠ۡۘۖۨۖۘ";
                    break;
            }
        }
    }

    public void d() {
        float f2 = 0.0f;
        float f3 = 0.0f;
        Resources resources = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Drawable drawable = null;
        StateListDrawable stateListDrawable = null;
        LayerDrawable layerDrawable = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        String str4 = "ۚۚۨۡ۟ۖۧۘۦۛۤۡۤۗۧۤۗۗۤۦۗ";
        int i6 = 0;
        float f4 = 0.0f;
        float f5 = 0.0f;
        int i7 = 0;
        Paint paint = null;
        ShapeDrawable shapeDrawable = null;
        LayerDrawable layerDrawable2 = null;
        LayerDrawable layerDrawable3 = null;
        LayerDrawable layerDrawable4 = null;
        while (true) {
            switch ((str4.hashCode() ^ 827) ^ 1989938044) {
                case -2054366240:
                    str4 = "ۦۦۤۧۦۖۘۧۗ۬ۧۘۤۧۖۘ۠ۜۢۚۗۚۥۧۡۘ";
                    f5 = this.f1358j;
                    break;
                case -1960626524:
                    str4 = "ۦۡۖۖ۟ۡۦۖۡۘۢۧۨۘۧۨ۫ۖۚۢۡۢۥۗۦۜۘ";
                    layerDrawable4 = a(this.f1351c, f2);
                    break;
                case -1692878949:
                    str4 = "۫ۧۥۜۚۦۢۦۨۘۗۤۜۜۦۨۢۜ۫";
                    layerDrawable3 = a(this.f1350b, f2);
                    break;
                case -1344106320:
                    str4 = "ۗۛۦۘۗ۬ۨۘ۫ۘۜۤ۠ۡ۬۫۫ۗۥۧۛۧۚ۟ۥۘۚۘۜۘ";
                    f2 = b(yo.getID("fab_stroke_width", "dimen"));
                    break;
                case -1191604203:
                    String str5 = "ۥۨۡۘ۟۫ۘۖۘۨۘۘ۠ۛ۬ۡ";
                    while (true) {
                        switch (str5.hashCode() ^ 1741444094) {
                            case -49641237:
                                str4 = "ۛ۬۫ۗۢۤۨۡۦۙۛۜۘۜۦ۬ۜۜ۬";
                                continue;
                            case 204764250:
                                if (this.f1356h != 0) {
                                    str5 = "۫ۢۛۗۤ۟۠ۢۗۦۡۚۤۧۜ۟ۖۖۤ۬ۦ۫ۖۡۘ";
                                    break;
                                } else {
                                    str5 = "ۤۖۨۙ۟ۗۙ۬ۥۥ۟۟ۨۧۜۛۚ۬ۘۤۧۘۧۗ";
                                    break;
                                }
                            case 552954812:
                                str4 = "۬ۗ۠ۢۜۜۘۖۖ۠ۗۗۦ۟۫ۜۘۘۚۥۘ۬۬ۘۡۜ";
                                continue;
                            case 1989928981:
                                str5 = "ۦ۟ۦۘ۠ۥۗۢ۠۠ۙۨۡۘۥۦۥۘ";
                                break;
                        }
                    }
                    break;
                case -1158560858:
                    layerDrawable.setLayerInset(1, i2, i3, i2, i4);
                    str4 = "ۥ۬ۜۘۖۥۜۢۚۙ۬ۖۥۙۦۖۡۗۥۘۖۡۨۥۤ۟ۤۜ۠";
                    break;
                case -1123959614:
                    str4 = "ۢۨ۫ۘۘ۟ۥۜۘۙۡ۬ۥۖۢۛۜ۫";
                    str2 = "fab_bg_mini";
                    break;
                case -1113330292:
                    paint.setAlpha((int) 5.1f);
                    str4 = "ۖۜۡۘ۫ۢۜۢۜۘۥ۬ۚۥۗۜ";
                    break;
                case -1053364411:
                    str4 = "ۢ۟ۦ۟ۚ۟۬ۚۤۤۥۨۦۛۥۥۥۘۘۛۧۗۖۥۤ";
                    layerDrawable2 = a(this.f1349a, f2);
                    break;
                case -969295867:
                    setBackgroundCompat(layerDrawable);
                    str4 = "۬ۖ۠ۖۡ۬ۤ۟۟ۢۧۖۨۙۧۘ۠۫۟ۖ";
                    break;
                case -891727720:
                    str4 = "ۡ۫ۖ۬ۘۜۘ۠۫ۧۗ۫ۙۤ۫ۘۘ";
                    str3 = str;
                    break;
                case -866659035:
                    stateListDrawable.addState(new int[]{-16842910}, layerDrawable4);
                    str4 = "ۢۛۜۘ۟ۜۖۘۛۘۗۧۡۥ۟ۦۨۘ";
                    break;
                case -729196174:
                    paint.setStyle(Paint.Style.STROKE);
                    str4 = "ۛۦۙۙۛۖۧۨۖۧۗۧۙۙۖۘ";
                    break;
                case -58499519:
                    str4 = "۫۬۫ۛۧۙۗۧۙۤۧۖۘۘۦۧۘ۫ۛۥۘۦۤۧۘۖۤۜ۟۟";
                    shapeDrawable = new ShapeDrawable(new OvalShape());
                    break;
                case -27369975:
                    stateListDrawable.addState(new int[0], layerDrawable2);
                    str4 = "۟۠ۡۨۖۜۜۛۖۘۗۖۘۘۤ۬ۖۘۜۖۛ۟ۚۖۘ";
                    break;
                case 21316337:
                    str4 = "ۜۙۚۘۙ۠ۖ۠ۜۙۚ۬۫ۢۖۨۡ۠ۛ۫ۛ";
                    str3 = str2;
                    break;
                case 68258427:
                    str4 = "ۜۥ۠ۢۢۨۡ۠ۧ۟۟۟ۧۢ۬ۜۧۥۘ";
                    f3 = f2 / 2.0f;
                    break;
                case 163104460:
                    str4 = "ۢۚۥۘۗۤۜۢۖ۟ۘ۠ۗۦۘۛ۠ۡۡۘ";
                    f4 = this.f1359k;
                    break;
                case 175767112:
                    stateListDrawable.addState(new int[]{16842919}, layerDrawable3);
                    str4 = "۫ۡۡۘۧۛ۬ۧۚ۬ۚۨۛۙ۫۠۠ۡۦۘ";
                    break;
                case 205207183:
                    str4 = "۬ۗۘۘۥۥۜ۠ۦۜۘۚۧ۟۠۠ۙۡ۠ۥۛ۟ۡۘ";
                    drawable = resources.getDrawable(yo.getID(str3, "drawable"));
                    break;
                case 259650705:
                    str = "fab_bg_normal";
                    str4 = "ۖۗۖۘۖۢۖۘۜۢۤۤۢۖۡۦۖۢۚۡۘ۠ۘۜۘ۬ۦۜۘ";
                    break;
                case 580911235:
                    str4 = "ۜۙۚۘۙ۠ۖ۠ۜۙۚ۬۫ۢۖۨۡ۠ۛ۫ۛ";
                    break;
                case 592043452:
                    layerDrawable.setLayerInset(2, i5, (int) (((float) i3) - f3), i5, (int) (((float) i4) - f3));
                    str4 = "ۛ۫ۧۢۨۘۨۡۛ۫ۧۖۘۛۤۢ۫۫ۦۘ";
                    break;
                case 657997831:
                    paint.setStrokeWidth(f2);
                    str4 = "ۖۘۚ۟ۙۡۦ۠ۖۧۙۖۘۨۙۦۨۥۦ";
                    break;
                case 659935233:
                    str4 = "۬ۗۤۨۗۜۖ۠ۦۜۦۘۦۥۖۦۙ۟۟ۥ";
                    i6 = i2 + i7;
                    break;
                case 853200064:
                    str4 = "۟۠ۤۧۦۛۨ۬ۡۘۥۛۙ۠ۡۜ۫ۥۥۧ۟ۚ";
                    stateListDrawable = new StateListDrawable();
                    break;
                case 957760421:
                    i4 = (int) (f5 + f4);
                    str4 = "ۙۤۤۘۥۖۛۡۚۨۥۨۖۧۜ۠ۘۚ۠ۙۘ۠۠";
                    break;
                case 984333478:
                    layerDrawable.setLayerInset(3, i6, i3 + i7, i6, i4 + i7);
                    str4 = "ۛۙۗۚ۫ۖۙۦۨۘۡۤۖۘۡۦۨۙۡ۟";
                    break;
                case 991926551:
                    paint.setAntiAlias(true);
                    str4 = "ۨۗ۬ۜۨ۬ۙۗۨۘۤ۟ۚۤۦۖۘۤ۠۫۠۬ۨۢ۬ۜۘۡۨ۬";
                    break;
                case 1011607701:
                    str4 = "ۧۗۢۥ۟۫ۚۧ۟ۡۜۙۧۦۚ";
                    paint = shapeDrawable.getPaint();
                    break;
                case 1035129674:
                    layerDrawable = new LayerDrawable(new Drawable[]{drawable, stateListDrawable, shapeDrawable, getIconDrawable()});
                    str4 = "ۜ۟ۖ۟ۡۧۘ۟ۡۘۘۢۘۦۙۘۧۘ۬ۨۘۘ۟۫۟";
                    break;
                case 1114232240:
                    i5 = (int) (((float) i2) - f3);
                    str4 = "ۚ۫ۖۦۘۘۘ۠ۧۥۨۨۘۘۛۗۦۘۖۧۡ";
                    break;
                case 1380847450:
                    i2 = (int) f5;
                    str4 = "۫ۤۜۘۖۢ۠۬ۖۡۖ۬ۛۧۧۘ";
                    break;
                case 1555448813:
                    paint.setColor(-16777216);
                    str4 = "ۖۗۛ۬۟۟ۚۜۦۖۢۦۘ۬ۘۧۚۚۡۙۥ۬ۘۛۨۘۛۗۤ";
                    break;
                case 1636438944:
                    str4 = "۫ۖۧ۬ۢۖۘ۠ۡ۠ۙۡۚ۠۫";
                    resources = getResources();
                    break;
                case 1799932699:
                    return;
                case 1854154805:
                    str4 = "ۡۨۦۜ۟ۢۚۛ۬ۜۦۥۘۖۥ";
                    break;
                case 1941575518:
                    i3 = (int) (f5 - f4);
                    str4 = "ۢ۟۠ۖۥۚۛۘۤۖۥۖۦۥۗۜ۬ۢۥۙۘۤۨۗۘۘۧۘ";
                    break;
                case 2023052248:
                    str4 = "ۗۚۨۘ۫ۜ۬ۡۗۢۨۚۥۘۧۗ۠";
                    i7 = ((int) (this.f1357i - b(yo.getID("fab_icon_size", "dimen")))) / 2;
                    break;
            }
        }
    }

    public int getColorDisabled() {
        String str = "۬ۡۘۘۥ۠ۥۘۡۗۥۘۘۚۗۗۗۘۘۦ۠۬";
        while (true) {
            switch ((str.hashCode() ^ 310) ^ 1450456383) {
                case -1874041952:
                    str = "ۢۨۢۤۛۦۖۚۛۖۜۖۘ۫ۡۢ";
                    break;
                case -388454519:
                    return this.f1351c;
            }
        }
    }

    public int getColorNormal() {
        String str = "ۙۨۖۤۛۦۢۥۡۦۛ۫۬ۧۚ۠۫ۤۘ۠ۙ";
        while (true) {
            switch ((str.hashCode() ^ 805) ^ -538923593) {
                case 147850505:
                    return this.f1349a;
                case 1591502693:
                    str = "ۛۦۦۤۖۨۘ۬ۤۦۘۦۦۚۗۡۦۘۢۖۜ۫ۖۗۨ۬۟ۥۤۢ";
                    break;
            }
        }
    }

    public int getColorPressed() {
        String str = "ۡۖۡۘۡۛۜۘۧۥۘۘ۬ۖۜۜۖۡ";
        while (true) {
            switch ((str.hashCode() ^ 8) ^ -1415936903) {
                case -378228731:
                    return this.f1350b;
                case -142156700:
                    str = "ۦۘۡۚۗۗۢۜۘ۫ۡۘۘۘۛۦۘۧ۬ۗ";
                    break;
            }
        }
    }

    public Drawable getIconDrawable() {
        Drawable drawable = null;
        String str = "ۥۖ۠ۢۜ۠۬۠ۨۘۛ۠ۥ۫ۨ۟ۨۛۛۜۙۙ";
        while (true) {
            switch ((str.hashCode() ^ 399) ^ 1054328570) {
                case -1359416930:
                    String str2 = "ۜ۟۫ۛۗۜۘۚۖۧ۬ۖۥۘۤۙ۠ۡۗۘۘۤۙۨۘۢۢ۠ۡۖ";
                    while (true) {
                        switch (str2.hashCode() ^ -661006149) {
                            case -982200950:
                                str2 = "ۧۚۤ۫۟ۤۢۤۧۜ۫ۗ۫ۘۜۗۦۚۜۗۤۙۜ۫ۨ۠ۦۘ";
                                break;
                            case -878683562:
                                str = "۬ۙۖۘۤۛۖۘ۟ۨۥۖۨۘۗۥ۬ۜۜۢۛۛۨۚۘۛۦۢۖۘ";
                                continue;
                            case -571548228:
                                str = "ۢۜۘۗۘ۟۫ۥۗۥۗۘۘۛ۠ۨۘ";
                                continue;
                            case 34164620:
                                if (drawable == null) {
                                    str2 = "ۙۨۙۢۦۜۘۥۘۘۧۜۦۧۚۖ";
                                    break;
                                } else {
                                    str2 = "ۢۡ۬ۜۦ۫ۛۜۘۛۙۢۗ۠ۛ";
                                    break;
                                }
                        }
                    }
                    break;
                case -1022039023:
                    return drawable;
                case -1001638686:
                    drawable = this.f1355g;
                    str = "ۦۦۢۥ۟ۛۜۧۦۘۖۧۦۦۗۙ۠ۗ۠ۜۥۗۚۜۘۙۘ۬";
                    break;
                case -799728531:
                    return getResources().getDrawable(this.f1354f);
                case -119500484:
                    String str3 = "ۤۙ۠۟ۘۚ۟۬ۗۘۧۨۘۜۡۦۘ۬۟ۤۢۧۛۧ۟۬ۤ۠ۢ";
                    while (true) {
                        switch (str3.hashCode() ^ -406844583) {
                            case -1905530104:
                                str = "۟ۙۧۢ۫ۤۥ۠ۢۡۙۖ۟ۥۙۖ۠ۙۗۢۨۘۜ۠۬";
                                continue;
                            case -513773064:
                                if (this.f1354f == 0) {
                                    str3 = "ۘۢۚۗۜۜۘۥۨۢۧۡۦۙۚۦۘ";
                                    break;
                                } else {
                                    str3 = "۫ۚۚۚ۫ۘۥۡ۠ۖۧۖۦۚۘۘۜ۫ۥ";
                                    break;
                                }
                            case -476413500:
                                str = "ۤۘۦۘۡۖۜ۟ۡۤۗۖۜۘۤۨۘ";
                                continue;
                            case 2069176188:
                                str3 = "۬ۦ۠ۖ۬ۜۘ۬ۢۥۘۗۗ۟ۧۨۧ۫ۜۖ";
                                break;
                        }
                    }
                    break;
                case -52896455:
                    return new ColorDrawable(0);
                case 2048517828:
                    str = "۫ۡۦۨۖۨۘۡۙۥۙ۠ۥۛ۫ۜۡ۬ۨۡۤ۫۠ۨۘۗۦۨۘ";
                    break;
            }
        }
    }

    public TextView getLabelView() {
        String str = "ۘۛۘۘۤۜ۬ۚ۫ۗۡۖۚۢۖۥۘ۠۟ۡۛۗۨۡۨۨۘ۬۬";
        while (true) {
            switch ((str.hashCode() ^ 821) ^ 1589697638) {
                case 202796666:
                    return (TextView) getTag(yo.getID("fab_label", "id"));
                case 1224924971:
                    str = "۬ۗۗۦۡۨۗۜۦۘ۠ۗۦۤۖۘۘ";
                    break;
            }
        }
    }

    public int getSize() {
        String str = "۫ۥۦۘۚۙۧۤۗۥۜ۫ۦۧۦۘ۠ۡ۫ۙۜۖۘۧۤۜۘۦۘۧ";
        while (true) {
            switch ((str.hashCode() ^ 502) ^ -1579159881) {
                case 318029615:
                    return this.f1356h;
                case 349316868:
                    str = "ۗۡۧۘۙۤۦ۟ۦۧ۠ۗۜۘۗۗ۫ۙۨۗۙ۠ۡۘ";
                    break;
            }
        }
    }

    public String getTitle() {
        String str = "ۙۢۚۥۦۜۘ۫ۧۛۨۡ۬ۧۦۤۘ۟ۧ۬ۢۛۢ۬ۚۨۤۢ";
        while (true) {
            switch ((str.hashCode() ^ 365) ^ -313396862) {
                case -1858811129:
                    return this.f1353e;
                case -513084655:
                    str = "ۘۡ۟ۥۚ۟ۨۧۡۘ۠ۜۜۘۧۨ۫";
                    break;
            }
        }
    }

    public boolean isStrokeVisible() {
        String str = "۠ۥۡۘۙ۠ۥۥۗۛۜۙۧۧۙۜۘۥۘۖۡ۬";
        while (true) {
            switch ((str.hashCode() ^ 961) ^ -912792789) {
                case -666528937:
                    str = "ۗ۫۬۬ۘۖۘۦۨۘۘۘۧۜ۠ۥۡۘ";
                    break;
                case 438861259:
                    return this.f1361m;
            }
        }
    }

    public void onFinishInflate() {
        String str = "ۨ۬ۦۘۘۨۚۙۜۗۚۧۙۗۢۦۘ۠ۦۨۦۨۘۖ۬ۜۘۗۚۥۘ";
        while (true) {
            switch ((str.hashCode() ^ 448) ^ 1717159925) {
                case 91432496:
                    str = "۠ۨۡۥۘۢۨۨۘۤۥۚۧۘۦۨۘۥۖ۠ۛ";
                    break;
                case 149882383:
                    super.onFinishInflate();
                    str = "ۛۗۜۘۤۤۚۨۛۘۘۖ۬ۧۛ۬ۖۘۛۙۥ";
                    break;
                case 1548122573:
                    return;
            }
        }
    }

    public void onMeasure(int i2, int i3) {
        int i4 = 0;
        String str = "ۘ۫۫۫ۦۥۛۙۡۘۘ۬ۘۥۨۤ۫ۗ۬۬ۤۧ۟ۦۘ";
        while (true) {
            switch ((str.hashCode() ^ 279) ^ -595886819) {
                case -2075816377:
                    i4 = this.f1360l;
                    str = "۬۫۫ۘ۬ۡۘ۬ۖۙۧ۠ۧۥۘۖ";
                    break;
                case -1946583724:
                    str = "ۖۖۘۦۛۘۨۖۦۛ۟ۦۖۖ۟۠ۢ۫";
                    break;
                case -938576925:
                    super.onMeasure(i2, i3);
                    str = "ۡۛۨۘۙۜۦۘۡ۫ۧ۫ۦۡۘۖۖۧۜۡۨۘۧۖ۟ۤۘۘۘۢۥۨ";
                    break;
                case -644480589:
                    return;
                case 79613333:
                    str = "ۜۗۖۘۜ۠ۜۘۦۡۘۘۢۦۛ۠ۙۧۦۤۘۘۗ۬ۖۘۢ۟";
                    break;
                case 613237895:
                    setMeasuredDimension(i4, i4);
                    str = "ۖۢۦۘۨۦۘۘۥۙۛۘۥۛۛۦۧ";
                    break;
                case 1836032267:
                    str = "۟۠۟ۢ۬ۦۘۥ۫ۦ۫ۢۙۚۚۗۜۜۤ";
                    break;
            }
        }
    }

    public void setColorDisabled(int i2) {
        String str = "ۡۛۖۥۜ۟۬ۖۙۛۛۦۘۗۢۦۚۥۧۘۥۤۗ";
        while (true) {
            switch ((str.hashCode() ^ 400) ^ 389281686) {
                case -873967654:
                    return;
                case -243018416:
                    str = "۬ۨۦۘۤۖۙ۫۫ۢۛۙ۬۟ۚۛۢۦۘۘۥۛ";
                    break;
                case -235964462:
                    this.f1351c = i2;
                    str = "ۜۘۖۘۡۛۘۤۧۥۡۖۘۘۖۘۗۚۛۡۖۜۨۡۛۤ";
                    break;
                case 401139583:
                    String str2 = "ۨۤۨۘۧۛ۬ۦۡۘۘۖۘۖۛۗۥۘۤۜۚ۠ۜۤۗۙ۟";
                    while (true) {
                        switch (str2.hashCode() ^ 451602151) {
                            case -1714271972:
                                if (this.f1351c == i2) {
                                    str2 = "۟۟ۧۡۧۢۡ۟ۢۤۥ۬ۨۗۘۘۗۖۚۚ۬ۡۘۨۖۦۘ";
                                    break;
                                } else {
                                    str2 = "ۥۢۨۘۚۙۢۙۖۘۜۙۘۨۧۧۘۗۥۘۖۘۜۘۛ۫۠";
                                    break;
                                }
                            case -204228706:
                                str = "ۘۤ۬ۙۗۥۢ۫ۙۤۙۦۘۢ۫ۘۘۛۙۘۦۗۙۗ۬";
                                continue;
                            case -156494327:
                                str2 = "ۦۗۥۘۢۢۨۧ۟ۖۜ۫ۘۘۚۤۧۙۛ۠ۨۚۡۢۙ۬۫ۥۜۘ";
                                break;
                            case 1433056417:
                                str = "ۨۦۘۘۨۤۦۖ۫ۘۘۧۧۥۘۧۧۨ";
                                continue;
                        }
                    }
                    break;
                case 1526059532:
                    d();
                    str = "ۘۤ۬ۙۗۥۢ۫ۙۤۙۦۘۢ۫ۘۘۛۙۘۦۗۙۗ۬";
                    break;
                case 2107901267:
                    str = "ۘۡ۫۫ۥۤ۫۫ۚۢ۬ۦۘ۫ۦۢۙۢۛ";
                    break;
            }
        }
    }

    public void setColorDisabledResId(@ColorRes int i2) {
        String str = "۟ۚۦۙۖ۟ۡۡۨۡۙۡۚ۬ۡۘۛۤۥۘ";
        while (true) {
            switch ((str.hashCode() ^ 728) ^ 22727512) {
                case -600862531:
                    return;
                case -36009859:
                    str = "ۧۡ۬ۡۜۘۘۘۡ۫ۤۖۜۤۡۘۛۘۗۗۚۛ۠ۥ۠ۡۡۜۘ";
                    break;
                case 99053225:
                    setColorDisabled(getResources().getColor(i2));
                    str = "۫ۗۡۘ۠ۚ۟ۛۡۙۖۙۡۥۘۘۡ۟۟ۙۨۘۘۢۥۘ";
                    break;
                case 1524069779:
                    str = "ۥۨۜۘۡ۟۟ۧۖۤ۬ۙۖۚۥۡۘۚ۫";
                    break;
            }
        }
    }

    public void setColorNormal(int i2) {
        String str = "ۤۗ۬۟ۘۡۘۧ۬ۡۘ۠ۙۘۛۤۗۖ۬ۡۘۚۡۨۘۘۤ۟ۨۙ۬";
        while (true) {
            switch ((str.hashCode() ^ 262) ^ 1860634456) {
                case -361457968:
                    str = "ۤۤۤۙۢۗ۟ۘۨۦۨۜۧۜۦ";
                    break;
                case -123705342:
                    String str2 = "ۙۚۤۗۡۚۖۡۥۘۢ۠ۜۨۘۢۜۛ۠ۡ۫ۖۚ۠ۡ";
                    while (true) {
                        switch (str2.hashCode() ^ 1053761406) {
                            case -2073815296:
                                str = "ۚۖۜۘۗۢۚۧۗۧ۠ۢۛۥۚۖۧۘۡۘۜۧۤۦۨۨۘ";
                                continue;
                            case -1867034033:
                                if (this.f1349a == i2) {
                                    str2 = "ۙۤۙۛۢۖۘۧۘۚۙۡۖۙۡۨۤۥۢۚ۫ۦۘۢۘۜ";
                                    break;
                                } else {
                                    str2 = "۫ۤۦ۫۟ۦۛۤۡۙ۬ۜۢۚۜۘۙۥۙ";
                                    break;
                                }
                            case -772641480:
                                str = "ۚۗۘۘۥ۬ۡۘۖۨۛۜۚۛ۟ۘ۠ۜۙۙۤ۟ۦۥۗۨۗۨ";
                                continue;
                            case -680168387:
                                str2 = "ۜۨۥۘۢۡۥۘ۫ۚ۠ۛۦۢۤ۫";
                                break;
                        }
                    }
                    break;
                case -90327202:
                    str = "ۖۛۘۘۖۘۤ۟ۗ۬ۛ۬ۜۨ۠۠ۥۧۤ";
                    break;
                case 566725413:
                    this.f1349a = i2;
                    str = "ۢۧۖۛۦ۫ۧۨۖۘۖ۟۟۟ۧۨ";
                    break;
                case 953354018:
                    d();
                    str = "ۚۗۘۘۥ۬ۡۘۖۨۛۜۚۛ۟ۘ۠ۜۙۙۤ۟ۦۥۗۨۗۨ";
                    break;
                case 1933437086:
                    return;
            }
        }
    }

    public void setColorNormalResId(@ColorRes int i2) {
        String str = "۠۬ۥۘ۫ۨ۬ۘۚۦۘۤۡۜۘۛۡ۫ۙۖۜ";
        while (true) {
            switch ((str.hashCode() ^ 477) ^ -1426333496) {
                case -1649665532:
                    str = "ۨۘۜۘۡۜۨۘۢ۫ۡۛۧۦ۬ۡۨۘۥ۬ۚۗۢ۫ۜۧۥۘۢۘۧ";
                    break;
                case -567909144:
                    return;
                case 1100801346:
                    str = "ۛۜۘۘۜ۬ۥۙۘۜۥۥۨۦۘ";
                    break;
                case 1855187645:
                    setColorNormal(getResources().getColor(i2));
                    str = "ۙۙۘۘۛۚۘۛۨۥ۠ۘۘۤ۠ۚ";
                    break;
            }
        }
    }

    public void setColorPressed(int i2) {
        String str = "ۧۘۜۘۨ۬ۚۛۡۢۖۡۘۘۖۘ۬ۦۙ۬۫۠ۧ";
        while (true) {
            switch ((str.hashCode() ^ 751) ^ 1561477925) {
                case -2139807837:
                    str = "۟ۢۜۤۥۗۢ۠ۡۘۥ۬ۚ۫ۥۘۘۚۗۨۘ";
                    break;
                case -1864374661:
                    return;
                case -69201103:
                    this.f1350b = i2;
                    str = "۠ۖۖۘۙ۫ۢۢ۬ۖۘۛۗ۠۬ۨۡ۟ۘۚ۠ۘۡۚ۬ۜۜۜۖ";
                    break;
                case 658049538:
                    String str2 = "ۚۧۖۘۜۘۢ۫ۤۖۘۤۤ۠ۥۖۘۛۙۥۦۘۡۖۗۦ";
                    while (true) {
                        switch (str2.hashCode() ^ -1676743567) {
                            case -2018458815:
                                str = "۬ۚ۟ۢ۠۬۟۟ۨۘۘۨۜۦۘ";
                                continue;
                            case -998399627:
                                str2 = "ۙۜۘ۠ۙۚۚۡۗۘۛۖ۫۫ۛ";
                                break;
                            case -449874691:
                                str = "ۙۙۜۘۤۜۥۙۖۛ۬ۘۡۘۧۢۦ";
                                continue;
                            case 1112209269:
                                if (this.f1350b == i2) {
                                    str2 = "ۧۥۡۘۖۡۤۘۜۦ۫۟ۜۘۨ۬ۖۘۙۙۜۘ";
                                    break;
                                } else {
                                    str2 = "ۖ۟ۤۤ۬ۡۘۧ۫۠ۗۢۤ۟۬ۨ";
                                    break;
                                }
                        }
                    }
                    break;
                case 785852243:
                    d();
                    str = "۬ۚ۟ۢ۠۬۟۟ۨۘۘۨۜۦۘ";
                    break;
                case 1909857391:
                    str = "ۖ۟ۖۖۗۜۦ۫ۙۡۙۚۥ";
                    break;
            }
        }
    }

    public void setColorPressedResId(@ColorRes int i2) {
        String str = "۬۟ۘۡۛۥۚ۠ۚۚۥۘۢۧ۫";
        while (true) {
            switch ((str.hashCode() ^ 570) ^ -330403357) {
                case -985864876:
                    return;
                case 1250304580:
                    setColorPressed(getResources().getColor(i2));
                    str = "۫ۢۛ۟۫۟ۛۖۘۘ۬۠۠ۗ۬۠۫۬ۜۘۢ۠ۜ۟ۢۢ۬ۢۨۘ";
                    break;
                case 1495389438:
                    str = "۟۟ۨ۠ۤۙۨۥۦ۬ۥۥۘۦۖۥۘ۫ۗۡۘۨۡ۟ۜ۬ۢ";
                    break;
                case 2065494211:
                    str = "ۙۡۙۜۢۦۘ۬۬ۥۘۤ۠ۡۘۖۚۥۥۢۖۘ۟۬ۛ";
                    break;
            }
        }
    }

    public void setIcon(@DrawableRes int i2) {
        String str = "۫ۖۧۥۖۙۤۙۛۥۤ۬۫ۜۘۦ۫ۖ";
        while (true) {
            switch ((str.hashCode() ^ 491) ^ 659131634) {
                case -2001475420:
                    str = "۠۟ۢۖۥۤۘۗۤۢ۠ۖ۬ۧ۠ۨۨۥ";
                    break;
                case -1981447599:
                    this.f1354f = i2;
                    str = "۠ۥۖ۬ۡۦۘ۟ۧۖۘۨۗۡۘۙ۟ۘۜۗۙ۫ۧۡ";
                    break;
                case -1374821745:
                    return;
                case -1090775640:
                    this.f1355g = null;
                    str = "ۛۗۥۘ۬ۛۗۡ۬ۦۚۧ۬۟ۗۖۦۘۗۜۦ";
                    break;
                case -281629707:
                    String str2 = "ۦۡۛ۟ۡ۠ۚۥ۬ۚ۟ۘۘۜۤۗۘۙۥۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 1048023107) {
                            case -1582628712:
                                str = "ۤۤۥۙۨۘۛۨۗۙۛۤۗۦۡ";
                                continue;
                            case -459886045:
                                str2 = "ۜۛۨ۟ۘ۟ۚ۟ۘۘۥۡۜۘ۟ۚۦۘۦ۬ۧ۠ۧۜۘ";
                                break;
                            case 981492958:
                                str = "۟۫ۡۤۤۧۨۜۥ۫۠ۛۨ۬ۖۧۥۧۚۘۤ";
                                continue;
                            case 1280356696:
                                if (this.f1354f == i2) {
                                    str2 = "ۧ۫ۘۘۛۥۥۘۙۗ۟ۛۦۢۢ۠ۗۥ۠ۜۨۛۜۘ۬ۙ";
                                    break;
                                } else {
                                    str2 = "ۗۛۨۘۘۗۡۘۜۜۧ۬۠ۦۗۤۡۘۢۧۖۘ";
                                    break;
                                }
                        }
                    }
                    break;
                case 406382583:
                    d();
                    str = "ۤۤۥۙۨۘۛۨۗۙۛۤۗۦۡ";
                    break;
                case 688114588:
                    str = "۠۟ۨۚۨۗۨۙۦۘۢۛ۠ۙۢۖۘ۬ۦۗ۟ۖۦۘۢۙۧۛۗۡ";
                    break;
            }
        }
    }

    public void setIconDrawable(@NonNull Drawable drawable) {
        String str = "ۛۨۘۘۤۚۜۘۘۘۥۘۘۧۢۤ۠ۥۘۜۤۦۘۚۚۧ";
        while (true) {
            switch ((str.hashCode() ^ 903) ^ -376914123) {
                case -1267227511:
                    d();
                    str = "۫۟ۜۘۖۗۧۗۗ۠۬۠ۦۘۗ۠ۗۗۡۖۘۡۚۥۘ۟ۜۨ";
                    break;
                case -1065699291:
                    this.f1354f = 0;
                    str = "ۥۙۡۘۨۗۥ۫ۚۥ۠۟ۚ۫۬۬ۜۥۗ";
                    break;
                case -131908473:
                    return;
                case 232166081:
                    this.f1355g = drawable;
                    str = "۟ۢۜۘۦۘۡۘۤۨۖۘۖۖۡۘ۠ۨۨ";
                    break;
                case 709347055:
                    str = "ۤ۬ۚۖۡۦ۫ۖۗۧۙۧۗۖۘ";
                    break;
                case 1894916661:
                    str = "ۨ۫ۘۚۦۖۘۗۜۜ۫ۘۢۘۨۘۥۤۛۛ۟ۛ";
                    break;
                case 1907750192:
                    String str2 = "ۜۖۛ۠۠ۚ۠ۙۖۘۜۙۤۖۘ۬ۦۧۘۥۛۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 1895336021) {
                            case -1219355491:
                                str = "ۗۧۗۦۜۖۘۘۛۨۡۜۥۗۨۢۘ۟ۙۜ";
                                continue;
                            case -1021737065:
                                if (this.f1355g == drawable) {
                                    str2 = "۟ۗۛۚ۬ۧۤۥۧۤۜۜۦۦۘۥ۫ۙ۠ۜۘ۫۠۫ۘۚ";
                                    break;
                                } else {
                                    str2 = "ۦ۟ۖ۬ۨۥۥۘۧۘۨۦۙۥۤۡۜۡۨۘۦ۬ۦۘ۬ۥۨۧ۬ۥ";
                                    break;
                                }
                            case 868550674:
                                str = "۫۟ۜۘۖۗۧۗۗ۠۬۠ۦۘۗ۠ۗۗۡۖۘۡۚۥۘ۟ۜۨ";
                                continue;
                            case 1830451808:
                                str2 = "۠ۖۦۢ۬ۢۡ۟ۢۨ۫ۜۘۥۘۧۘ۟۬۠ۨۗ۬ۦ۬ۗ";
                                break;
                        }
                    }
                    break;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSize(int r9) {
        /*
            r8 = this;
            r3 = 0
            r1 = 0
            java.lang.String r0 = "۬۬ۜۘۤۤۡۘۢۖۘ۬ۘۚۜۖۗۦۘ"
            r2 = r3
            r4 = r3
            r5 = r3
        L_0x0007:
            int r3 = r0.hashCode()
            r6 = 945(0x3b1, float:1.324E-42)
            r7 = 1753063870(0x687da1be, float:4.7909693E24)
            r3 = r3 ^ r6
            r3 = r3 ^ r7
            switch(r3) {
                case -1927047198: goto L_0x00cb;
                case -1848145249: goto L_0x00ef;
                case -1822074979: goto L_0x00e3;
                case -1802541017: goto L_0x00d8;
                case -1626620257: goto L_0x0080;
                case -1330695556: goto L_0x00b2;
                case -1249161240: goto L_0x007b;
                case -672054371: goto L_0x0016;
                case -287952550: goto L_0x00ac;
                case -206243608: goto L_0x0019;
                case -57018590: goto L_0x0039;
                case 158662409: goto L_0x00a1;
                case 319050068: goto L_0x005d;
                case 438600047: goto L_0x001c;
                case 591099031: goto L_0x00e7;
                case 1190929004: goto L_0x00a7;
                case 1823189821: goto L_0x00b7;
                case 1830959685: goto L_0x00c5;
                case 1952707573: goto L_0x0055;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x0007
        L_0x0016:
            java.lang.String r0 = "ۖۤۗۖۢۡۖ۫ۥۖۙ۬ۛۛۦ۟ۧ۬ۥۘۡۘۖۡ۟"
            goto L_0x0007
        L_0x0019:
            java.lang.String r0 = "ۢۧۧ۬ۦۦۛۡۘۘۢۤۦۘۜ۠ۡۜۜۘۧۤۜ"
            goto L_0x0007
        L_0x001c:
            r3 = 190122112(0xb550880, float:4.1028703E-32)
            java.lang.String r0 = "ۗۥۧۘ۠۬ۢ۫ۧۡۘۢۤۥۘ۬ۨۛ۟ۙۦۘ"
        L_0x0021:
            int r6 = r0.hashCode()
            r6 = r6 ^ r3
            switch(r6) {
                case -2123678341: goto L_0x002a;
                case -1991828287: goto L_0x0036;
                case 976551948: goto L_0x0030;
                case 1035689102: goto L_0x00e3;
                default: goto L_0x0029;
            }
        L_0x0029:
            goto L_0x0021
        L_0x002a:
            java.lang.String r0 = "ۗۡۖۘۙ۬ۤۡ۫ۜ۬ۢۥۘۙۥۘۘۤۦۘۜۧۖۘ"
            goto L_0x0021
        L_0x002d:
            java.lang.String r0 = "ۜۘ۠ۜ۬ۜ۠ۙۤۦۘۛۖۧۡۘ"
            goto L_0x0021
        L_0x0030:
            r0 = 1
            if (r9 == r0) goto L_0x002d
            java.lang.String r0 = "ۤۖۜ۟ۗۜ۠ۥۦۘ۬ۜۦۘۡۢۧۨ۠ۡۘۙۘۜ"
            goto L_0x0021
        L_0x0036:
            java.lang.String r0 = "ۛۧۜۡۦۘۖۨۜۘ۫ۨۧۘ۫ۤ۬ۨۡۦۤ۠ۖ۫ۤۧ"
            goto L_0x0007
        L_0x0039:
            r3 = -386436695(0xffffffffe8f771a9, float:-9.3481694E24)
            java.lang.String r0 = "ۥۢۛۗ۬ۖۘ۠۠ۗۜۥۘ۟ۢۡ۟ۦۨۗۗۘۘۤۢۢ۟ۘۨۘ"
        L_0x003e:
            int r6 = r0.hashCode()
            r6 = r6 ^ r3
            switch(r6) {
                case -1577737589: goto L_0x0052;
                case -810348716: goto L_0x004d;
                case -475650438: goto L_0x0047;
                case 1802704983: goto L_0x00df;
                default: goto L_0x0046;
            }
        L_0x0046:
            goto L_0x003e
        L_0x0047:
            java.lang.String r0 = "۠ۜۤۗۢۜۘ۠ۨۨۢۙ۫ۢۡۥۤۚۛ"
            goto L_0x003e
        L_0x004a:
            java.lang.String r0 = "ۥۖۧۛۛۦۙۘۛ۠ۘۛۚ۟۠۟ۢۡۘ"
            goto L_0x003e
        L_0x004d:
            if (r9 != 0) goto L_0x004a
            java.lang.String r0 = "ۖ۫۠ۧ۟ۥۘۜ۬ۡۘۨ۫ۡۘۘۤۦۘۤۡۤ۬۠ۧۖۚۘ"
            goto L_0x003e
        L_0x0052:
            java.lang.String r0 = "ۧۚۜ۟ۢۖۘۜۤۥۧۙ۠۫۠ۙۢۗ۬"
            goto L_0x0007
        L_0x0055:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Use @FAB_SIZE constants only!"
            r0.<init>(r1)
            throw r0
        L_0x005d:
            r3 = -1919624943(0xffffffff8d94d911, float:-9.173461E-31)
            java.lang.String r0 = "ۡ۬ۢ۠ۦۙۜۡۧۖۘ۬۫۠۫ۧ۟ۥ"
        L_0x0062:
            int r6 = r0.hashCode()
            r6 = r6 ^ r3
            switch(r6) {
                case -1178587318: goto L_0x0071;
                case -574283115: goto L_0x0078;
                case 1154235443: goto L_0x006b;
                case 1664123612: goto L_0x00eb;
                default: goto L_0x006a;
            }
        L_0x006a:
            goto L_0x0062
        L_0x006b:
            java.lang.String r0 = "ۨۦۜۘۡ۟ۤۚ۫ۢۛ۬ۖۘۗۨ۫ۚۜ"
            goto L_0x0062
        L_0x006e:
            java.lang.String r0 = "ۗۡۡۘۙۖۚۥۨۥۘ۠ۥۦۘۦ۟ۚۦۗۚۥ۬ۗۜۨۘ"
            goto L_0x0062
        L_0x0071:
            int r0 = r8.f1356h
            if (r0 == r9) goto L_0x006e
            java.lang.String r0 = "ۖ۠ۥۘۚۚ۬ۧۡۧۘۘۜۥۘۚ۠ۦۙۢۙۙۘۘۘۜۖۛۚۛ"
            goto L_0x0062
        L_0x0078:
            java.lang.String r0 = "ۨۜۦۘۛۛۨۘ۫ۢۧۡۗ۫۠۠ۜۘۡ۬ۖۧۚ"
            goto L_0x0007
        L_0x007b:
            r8.f1356h = r9
            java.lang.String r0 = "ۥ۫ۚۚۛۨۦۖ۫۫۠ۢۜ۟ۢۗۥۙ۟ۘۢ۠ۘ"
            goto L_0x0007
        L_0x0080:
            r3 = -619948273(0xffffffffdb0c570f, float:-3.9502219E16)
            java.lang.String r0 = "ۚ۠ۘۘۚۨۘ۠۫ۨۘۗۙۖۘ۠۬۬ۘۢۜۘ۠۠ۦۘ۬۟۫ۡۙۜۘ"
        L_0x0085:
            int r6 = r0.hashCode()
            r6 = r6 ^ r3
            switch(r6) {
                case -1222913405: goto L_0x009a;
                case -1160161761: goto L_0x008e;
                case 294780691: goto L_0x009d;
                case 968260920: goto L_0x0095;
                default: goto L_0x008d;
            }
        L_0x008d:
            goto L_0x0085
        L_0x008e:
            java.lang.String r0 = "۟ۥۥۤۢۘۘۚ۫ۖۘۙۨۖۘ۬ۡۥۦۧۧ۠ۘۖۜۡۙۦۗۡۘ"
            goto L_0x0007
        L_0x0092:
            java.lang.String r0 = "ۥۢۡۘۥ۫ۨۘۨۖۡۤۨۜ۠ۥۜۘ"
            goto L_0x0085
        L_0x0095:
            if (r9 != 0) goto L_0x0092
            java.lang.String r0 = "ۨۗۨۥۙۥۙۤۨۦۚ۟ۗۗۧۛۘۖۘۧۜۡۘ"
            goto L_0x0085
        L_0x009a:
            java.lang.String r0 = "ۥ۟ۥۘ۟ۡۡۖۨۖۦۚۤۡۥۥۘۤ۠۫۟ۤۛ"
            goto L_0x0085
        L_0x009d:
            java.lang.String r0 = "ۙۜۘۘۢ۫ۧۙۘۗ۠ۛۗ۟ۦۤۢۧۥۗۘۦۧۗ۫۠ۛۙ"
            goto L_0x0007
        L_0x00a1:
            java.lang.String r5 = "fab_size_normal"
            java.lang.String r0 = "ۡۙۧ۟ۘۜۘ۬ۗۨۗۘۧۨ۬ۢۘ۟ۛ"
            goto L_0x0007
        L_0x00a7:
            java.lang.String r0 = "ۤۙ۬ۤۜۨ۫ۨۘۗۗۖۘۢۦۜۚۚۛۜۖۗ۟ۖۨۘۖۘۗ"
            r4 = r5
            goto L_0x0007
        L_0x00ac:
            java.lang.String r2 = "fab_size_mini"
            java.lang.String r0 = "ۚ۫ۦ۫ۢۦۡۗۥۨۛۥ۠ۦ۟ۥۖۨۘۛۧۡۛۨۘ"
            goto L_0x0007
        L_0x00b2:
            java.lang.String r0 = "۠۟ۚۤۜۗۙ۟۬ۢ۠ۤۘ۫ۨۜ۟ۗ۠ۥۖ۬ۡۚۙۨۘ"
            r4 = r2
            goto L_0x0007
        L_0x00b7:
            java.lang.String r0 = "dimen"
            int r0 = com.obwhatsapp.yo.yo.getID(r4, r0)
            float r1 = r8.b(r0)
            java.lang.String r0 = "ۡۡۥۡۘۜۘۤۙۘۘ۠۟ۘۘۡۚۖۡۥ۟"
            goto L_0x0007
        L_0x00c5:
            r8.f1357i = r1
            java.lang.String r0 = "ۥۛۢ۟ۜۡۘ۠ۗ۟۬۬۫۠ۧۡۘ۠ۨۛۘ۬۬ۨۗۢ"
            goto L_0x0007
        L_0x00cb:
            float r0 = r8.f1358j
            r3 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 * r3
            float r0 = r0 + r1
            int r0 = (int) r0
            r8.f1360l = r0
            java.lang.String r0 = "ۚۨۡۘۘۙۖۘۗۗۢۛۘۛۙۢۘۢۥۘۘ۬ۜۦ"
            goto L_0x0007
        L_0x00d8:
            r8.d()
            java.lang.String r0 = "ۥۗ۬ۦۚۗ۫ۤۘۘۚۡ۬ۗ۟ۗۦۖ۬"
            goto L_0x0007
        L_0x00df:
            java.lang.String r0 = "ۢۢۚۦۙۘۘۘۘۧ۬ۘۛۚۘۥ۠۟ۜ۠۬۟ۛۤۘۙۤ۬"
            goto L_0x0007
        L_0x00e3:
            java.lang.String r0 = "ۨۥۦۘۨ۫ۘۘۗۘۥۘ۬۟ۦۚۤۡۘۥۧۤۥ۬"
            goto L_0x0007
        L_0x00e7:
            java.lang.String r0 = "۠۟ۚۤۜۗۙ۟۬ۢ۠ۤۘ۫ۨۜ۟ۗ۠ۥۖ۬ۡۚۙۨۘ"
            goto L_0x0007
        L_0x00eb:
            java.lang.String r0 = "ۥۗ۬ۦۚۗ۫ۤۘۘۚۡ۬ۗ۟ۗۦۖ۬"
            goto L_0x0007
        L_0x00ef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.views.FloatingActionButton.setSize(int):void");
    }

    public void setStrokeVisible(boolean z2) {
        String str = "ۨۧۛۦۛ۠۟ۛۜۘ۠ۦۚۢۘۧۘۚۦۘۘۙۦ۫ۛۛۙۥۦۛ";
        while (true) {
            switch ((str.hashCode() ^ 432) ^ -1714970575) {
                case -2138723349:
                    String str2 = "ۤ۫ۦ۫۠ۜۥۘۘ۫ۡۖۗ۫ۛ";
                    while (true) {
                        switch (str2.hashCode() ^ -737345536) {
                            case -56244415:
                                str2 = "ۖۧۤۧ۠۬ۤۙۡۧۜۦۜۨۦۚ۠ۡ";
                                break;
                            case 429227974:
                                str = "ۖۘۖۧۨۧۘۢۗۖۚۨۨۘۖۥۤۜۙۜۘ";
                                continue;
                            case 434873713:
                                str = "ۢ۬۬ۗ۟۟ۙۙۧۥ۬ۨۘۚۜۧۗ۬۟۫ۤ۟";
                                continue;
                            case 769128324:
                                if (this.f1361m == z2) {
                                    str2 = "۬ۨۘ۫ۘ۠۠ۦۨۛۘۡۤۘۨۦۙۥۨ۠ۨۘ۟ۡۨۘ";
                                    break;
                                } else {
                                    str2 = "۫ۛۗۧۜۜۘ۠ۢ۬۬ۗۖۘۙۛۖۛۥۖۘ";
                                    break;
                                }
                        }
                    }
                    break;
                case -1755252405:
                    str = "۬ۛ۟ۖۚۘۛ۟ۡۨ۬ۙۨۤۢ";
                    break;
                case -1507263005:
                    d();
                    str = "ۢ۬۬ۗ۟۟ۙۙۧۥ۬ۨۘۚۜۧۗ۬۟۫ۤ۟";
                    break;
                case -14556423:
                    return;
                case 161184660:
                    this.f1361m = z2;
                    str = "ۡۥۖۨ۟ۚۗ۟ۘۘۥ۬ۗۚ۟ۜۨۤ۫ۗۦۧۘ۬۬ۥۘ";
                    break;
                case 574644606:
                    str = "ۧۚۘ۟ۨۢۡۖۘۘۦۦۧۘ۬۬۬ۙۧۚۧ۫ۨ";
                    break;
            }
        }
    }

    public void setTitle(String str) {
        TextView textView = null;
        String str2 = "ۥۥۙ۠ۤۛۛۤۖۘ۟ۚۡۘۡ۬ۨ";
        while (true) {
            switch ((str2.hashCode() ^ 704) ^ -940423872) {
                case -1692894059:
                    return;
                case -1058579467:
                    String str3 = "ۖۤۨۘ۠ۧ۠ۛ۠ۧۥۛۙۥۡۦۧۦۚ";
                    while (true) {
                        switch (str3.hashCode() ^ 1876961178) {
                            case -903466413:
                                str3 = "ۘۤۚۘۦ۟ۡۢۦۘۚۥ۫ۤۤۥۚۘۛ";
                                break;
                            case -27364651:
                                str2 = "ۢۙۥۧۛۦۙۨۦۢۡ۟۠ۥۘ۠ۜۗ";
                                continue;
                            case 1680979864:
                                str2 = "ۦۛۦۧۧۦۛۚ۟ۨۡۘۚۖۡۘ";
                                continue;
                            case 2051248503:
                                if (textView == null) {
                                    str3 = "۟ۛۥۘۧ۫ۙۢۤۛۥۛۦۖۖۗۙۗۘۘۨۜۤۨۤۦۡ";
                                    break;
                                } else {
                                    str3 = "ۥۨۥۖ۫ۖۥۥۡۨ۫ۧۤ۠ۢۙ۫۬ۥۘ";
                                    break;
                                }
                        }
                    }
                    break;
                case -504047441:
                    textView = getLabelView();
                    str2 = "ۧۥۦۖۦ۫۫ۙۙ۫۠ۖۘۡۨۜۘۛۦۦۘۘ۠ۥۘۡۙۥۘ";
                    break;
                case -366851278:
                    this.f1353e = str;
                    str2 = "ۘ۬۫ۛ۠ۡۘۗۨ۬ۦۤ۫ۧۨۦ۠۬ۙۧۨۖۚۡ";
                    break;
                case -1840745:
                    str2 = "۬ۢۖۘۡۡۢۙۨۘ۫ۚۧ۟ۚ۫ۙۡ۟ۚۨ۫ۢ۬ۤۢۛۜۘ";
                    break;
                case 38091170:
                    str2 = "ۙ۟ۦۘۡۖۢۨۥۙ۫ۤۗۚۘ۬";
                    break;
                case 1310650439:
                    textView.setText(str);
                    str2 = "ۢۙۥۧۛۦۙۨۦۢۡ۟۠ۥۘ۠ۜۗ";
                    break;
            }
        }
    }

    public void setVisibility(int i2) {
        TextView textView = null;
        String str = "ۤ۠ۨۡۧۡ۟۠۠ۥۙۡۦ۬ۥۘۨۡ۬ۖۧۖۘ";
        while (true) {
            switch ((str.hashCode() ^ 903) ^ -973104070) {
                case -2059910108:
                    str = "ۤۦ۫۬ۗۢۨۧۧۨۢۖۚۛۘ۬ۤ";
                    break;
                case -635293427:
                    str = "ۚ۫ۘۘ۫ۦۨۙ۠۟ۤ۬ۦۙۜۘۚ۫ۜۘۤۚۢ۫ۥۥ۫ۥ";
                    break;
                case 282724131:
                    return;
                case 632676127:
                    textView.setVisibility(i2);
                    str = "ۡۢۨ۬ۗۡۘۙۡۘ۟ۨۚ۠۟ۙ";
                    break;
                case 1105576500:
                    String str2 = "ۦۧۡۜ۟ۤۥۗۨۘۗۚۘۦۨ۫";
                    while (true) {
                        switch (str2.hashCode() ^ 629127459) {
                            case -1559166350:
                                str2 = "ۡۜۘۘ۠۫ۨۨ۫ۖۘۖۧ۬ۥۡۚ";
                                break;
                            case -1378055495:
                                str = "ۡۢۨ۬ۗۡۘۙۡۘ۟ۨۚ۠۟ۙ";
                                continue;
                            case -520860524:
                                if (textView == null) {
                                    str2 = "ۙۙۚۘۨۘۘۜۚۜۘۚ۬ۡ۠ۨۘ۟ۡۡۧۨۨۡۖۜ";
                                    break;
                                } else {
                                    str2 = "ۡۚۗۜۚۘ۫ۥۘۘۦۤۥۘۨ۠ۦۘ";
                                    break;
                                }
                            case 175092041:
                                str = "ۗ۟ۦ۠۬ۨۘۚۡۗۤۢۡۘ۫ۚ۫ۛ۬ۤ";
                                continue;
                        }
                    }
                    break;
                case 1753114125:
                    super.setVisibility(i2);
                    str = "ۤۦۥۢ۬ۙۡۖۚۦ۫ۚ۬ۗ۟ۛۙ۟ۧ";
                    break;
                case 2009303792:
                    textView = getLabelView();
                    str = "ۙۦۧۛۗۘۘۨ۬ۦ۫ۚۙۥۡۤ۠۟";
                    break;
            }
        }
    }
}
