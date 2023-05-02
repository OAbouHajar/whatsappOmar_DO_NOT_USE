package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.mod.bomfab.R$styleable;
import com.obwhatsapp.calling.crypto.DefaultCryptoCallback;
import com.obwhatsapp.youbasha.ui.activity.CallsPrivacy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.0Wj  reason: invalid class name and case insensitive filesystem */
public class C06500Wj {
    public static SparseIntArray A02;
    public static final int[] A03 = {0, 4, 8};
    public HashMap A00 = AnonymousClass000.A0x();
    public HashMap A01 = AnonymousClass000.A0x();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A02 = sparseIntArray;
        A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(A01(sparseIntArray, 76, 25), 77, 26), 79, 29), 80, 30), 86, 36), 85, 35), 58, 4), 57, 3), 55, 1), 94, 6), 95, 7), 65, 17), 66, 18), 67, 19), 0, 27), 81, 32), 82, 33), 64, 10), 63, 9), 98, 13), 101, 16), 99, 14), 96, 11), 100, 15), 97, 12), 89, 40), 74, 39), 73, 41), 88, 42), 72, 20), 87, 37), 62, 5), 75, 82), 84, 82), 78, 82), 56, 82), 54, 82), 5, 24), 7, 28), 23, 31), 24, 8), 6, 34), 8, 2), 3, 23), 4, 21), 2, 22), 13, 43), 26, 44), 21, 45), 22, 46), 20, 60), 18, 47), 19, 48), 14, 49), 15, 50), 16, 51), 17, 52), 25, 53), 90, 54), 68, 55), 91, 56), 69, 57), 92, 58), 70, 59), 59, 61), 61, 62), 60, 63), 27, 64), 106, 65), 33, 66), 107, 67), 103, 79), 1, 38), 102, 68), 93, 69), 71, 70), 31, 71), 29, 72), 30, 73), 32, 74), 28, 75), 104, 76), 83, 77), AnonymousClass2EA.A03, 78), 53, 80).append(52, 81);
    }

    public static int A00(TypedArray typedArray, int i2, int i3) {
        int resourceId = typedArray.getResourceId(i2, i3);
        return resourceId == -1 ? typedArray.getInt(i2, -1) : resourceId;
    }

    public static SparseIntArray A01(SparseIntArray sparseIntArray, int i2, int i3) {
        sparseIntArray.append(i2, i3);
        return A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        r0 = r1.A0E;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int[] A02(android.view.View r10, java.lang.String r11) {
        /*
            java.lang.String r0 = ","
            java.lang.String[] r6 = r11.split(r0)
            android.content.Context r9 = r10.getContext()
            int r5 = r6.length
            int[] r4 = new int[r5]
            r3 = 0
            r2 = 0
        L_0x000f:
            if (r3 >= r5) goto L_0x0070
            r0 = r6[r3]
            java.lang.String r8 = r0.trim()
            java.lang.Class<X.0LH> r0 = X.AnonymousClass0LH.class
            java.lang.reflect.Field r1 = r0.getField(r8)     // Catch:{ Exception -> 0x0023 }
            r0 = 0
            int r7 = r1.getInt(r0)     // Catch:{ Exception -> 0x0023 }
            goto L_0x0024
        L_0x0023:
            r7 = 0
        L_0x0024:
            if (r7 != 0) goto L_0x0034
            android.content.res.Resources r7 = r9.getResources()
            java.lang.String r1 = r9.getPackageName()
            java.lang.String r0 = "id"
            int r7 = r7.getIdentifier(r8, r0, r1)
        L_0x0034:
            if (r7 != 0) goto L_0x0066
            boolean r0 = r10.isInEditMode()
            if (r0 == 0) goto L_0x0066
            android.view.ViewParent r0 = r10.getParent()
            boolean r0 = r0 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r0 == 0) goto L_0x0066
            android.view.ViewParent r1 = r10.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            if (r8 == 0) goto L_0x006e
            java.util.HashMap r0 = r1.A0E
            if (r0 == 0) goto L_0x006e
            boolean r0 = r0.containsKey(r8)
            if (r0 == 0) goto L_0x006e
            java.util.HashMap r0 = r1.A0E
            java.lang.Object r1 = r0.get(r8)
        L_0x005c:
            if (r1 == 0) goto L_0x0066
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x0066
            int r7 = X.AnonymousClass000.A0D(r1)
        L_0x0066:
            int r0 = r2 + 1
            r4[r2] = r7
            int r3 = r3 + 1
            r2 = r0
            goto L_0x000f
        L_0x006e:
            r1 = 0
            goto L_0x005c
        L_0x0070:
            if (r2 == r5) goto L_0x0076
            int[] r4 = java.util.Arrays.copyOf(r4, r2)
        L_0x0076:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06500Wj.A02(android.view.View, java.lang.String):int[]");
    }

    public final AnonymousClass053 A03(int i2) {
        HashMap hashMap = this.A00;
        Integer valueOf = Integer.valueOf(i2);
        if (!hashMap.containsKey(valueOf)) {
            hashMap.put(valueOf, new AnonymousClass053());
        }
        return (AnonymousClass053) hashMap.get(valueOf);
    }

    public final AnonymousClass053 A04(Context context, AttributeSet attributeSet) {
        StringBuilder A0o;
        String str;
        AnonymousClass053 r5 = new AnonymousClass053();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0NK.A00);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (!(index == 1 || 23 == index || 24 == index)) {
                r5.A03.A06 = true;
                r5.A02.A0w = true;
                r5.A04.A04 = true;
                r5.A05.A0C = true;
            }
            SparseIntArray sparseIntArray = A02;
            switch (sparseIntArray.get(index)) {
                case 1:
                    C06110Uh r1 = r5.A02;
                    r1.A08 = A00(obtainStyledAttributes, index, r1.A08);
                    continue;
                case 2:
                    C06110Uh r12 = r5.A02;
                    r12.A09 = obtainStyledAttributes.getDimensionPixelSize(index, r12.A09);
                    continue;
                case 3:
                    C06110Uh r13 = r5.A02;
                    r13.A0A = A00(obtainStyledAttributes, index, r13.A0A);
                    continue;
                case 4:
                    C06110Uh r14 = r5.A02;
                    r14.A0B = A00(obtainStyledAttributes, index, r14.A0B);
                    continue;
                case 5:
                    r5.A02.A0r = obtainStyledAttributes.getString(index);
                    continue;
                case 6:
                    C06110Uh r15 = r5.A02;
                    r15.A0E = obtainStyledAttributes.getDimensionPixelOffset(index, r15.A0E);
                    continue;
                case 7:
                    C06110Uh r16 = r5.A02;
                    r16.A0F = obtainStyledAttributes.getDimensionPixelOffset(index, r16.A0F);
                    continue;
                case 8:
                    if (Build.VERSION.SDK_INT >= 17) {
                        C06110Uh r17 = r5.A02;
                        r17.A0G = obtainStyledAttributes.getDimensionPixelSize(index, r17.A0G);
                        break;
                    } else {
                        continue;
                    }
                case 9:
                    C06110Uh r18 = r5.A02;
                    r18.A0H = A00(obtainStyledAttributes, index, r18.A0H);
                    continue;
                case 10:
                    C06110Uh r19 = r5.A02;
                    r19.A0I = A00(obtainStyledAttributes, index, r19.A0I);
                    continue;
                case 11:
                    C06110Uh r110 = r5.A02;
                    r110.A0J = obtainStyledAttributes.getDimensionPixelSize(index, r110.A0J);
                    continue;
                case 12:
                    C06110Uh r111 = r5.A02;
                    r111.A0K = obtainStyledAttributes.getDimensionPixelSize(index, r111.A0K);
                    continue;
                case 13:
                    C06110Uh r112 = r5.A02;
                    r112.A0L = obtainStyledAttributes.getDimensionPixelSize(index, r112.A0L);
                    continue;
                case 14:
                    C06110Uh r113 = r5.A02;
                    r113.A0M = obtainStyledAttributes.getDimensionPixelSize(index, r113.A0M);
                    continue;
                case 15:
                    C06110Uh r114 = r5.A02;
                    r114.A0N = obtainStyledAttributes.getDimensionPixelSize(index, r114.A0N);
                    continue;
                case 16:
                    C06110Uh r115 = r5.A02;
                    r115.A0O = obtainStyledAttributes.getDimensionPixelSize(index, r115.A0O);
                    continue;
                case 17:
                    C06110Uh r116 = r5.A02;
                    r116.A0P = obtainStyledAttributes.getDimensionPixelOffset(index, r116.A0P);
                    continue;
                case 18:
                    C06110Uh r117 = r5.A02;
                    r117.A0Q = obtainStyledAttributes.getDimensionPixelOffset(index, r117.A0Q);
                    continue;
                case 19:
                    C06110Uh r118 = r5.A02;
                    r118.A01 = obtainStyledAttributes.getFloat(index, r118.A01);
                    continue;
                case 20:
                    C06110Uh r119 = r5.A02;
                    r119.A03 = obtainStyledAttributes.getFloat(index, r119.A03);
                    continue;
                case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                    C06110Uh r120 = r5.A02;
                    r120.A0a = obtainStyledAttributes.getLayoutDimension(index, r120.A0a);
                    continue;
                case R$styleable.FloatingActionMenu_menu_labels_ellipsize /*22*/:
                    C04920On r8 = r5.A04;
                    int i3 = obtainStyledAttributes.getInt(index, r8.A03);
                    r8.A03 = i3;
                    r8.A03 = A03[i3];
                    continue;
                case R$styleable.FloatingActionMenu_menu_labels_maxLines /*23*/:
                    C06110Uh r121 = r5.A02;
                    r121.A0c = obtainStyledAttributes.getLayoutDimension(index, r121.A0c);
                    continue;
                case R$styleable.FloatingActionMenu_menu_fab_size /*24*/:
                    C06110Uh r122 = r5.A02;
                    r122.A0V = obtainStyledAttributes.getDimensionPixelSize(index, r122.A0V);
                    continue;
                case R$styleable.FloatingActionMenu_menu_labels_style /*25*/:
                    C06110Uh r123 = r5.A02;
                    r123.A0W = A00(obtainStyledAttributes, index, r123.A0W);
                    continue;
                case R$styleable.FloatingActionMenu_menu_labels_customFont /*26*/:
                    C06110Uh r124 = r5.A02;
                    r124.A0X = A00(obtainStyledAttributes, index, r124.A0X);
                    continue;
                case R$styleable.FloatingActionMenu_menu_shadowColor /*27*/:
                    C06110Uh r125 = r5.A02;
                    r125.A0d = obtainStyledAttributes.getInt(index, r125.A0d);
                    continue;
                case R$styleable.FloatingActionMenu_menu_shadowRadius /*28*/:
                    C06110Uh r126 = r5.A02;
                    r126.A0e = obtainStyledAttributes.getDimensionPixelSize(index, r126.A0e);
                    continue;
                case R$styleable.FloatingActionMenu_menu_shadowXOffset /*29*/:
                    C06110Uh r127 = r5.A02;
                    r127.A0f = A00(obtainStyledAttributes, index, r127.A0f);
                    continue;
                case 30:
                    C06110Uh r128 = r5.A02;
                    r128.A0g = A00(obtainStyledAttributes, index, r128.A0g);
                    continue;
                case R$styleable.FloatingActionMenu_menu_colorNormal /*31*/:
                    if (Build.VERSION.SDK_INT >= 17) {
                        C06110Uh r129 = r5.A02;
                        r129.A0h = obtainStyledAttributes.getDimensionPixelSize(index, r129.A0h);
                        break;
                    } else {
                        continue;
                    }
                case 32:
                    C06110Uh r130 = r5.A02;
                    r130.A0i = A00(obtainStyledAttributes, index, r130.A0i);
                    continue;
                case R$styleable.FloatingActionMenu_menu_colorRipple /*33*/:
                    C06110Uh r131 = r5.A02;
                    r131.A0j = A00(obtainStyledAttributes, index, r131.A0j);
                    continue;
                case R$styleable.FloatingActionMenu_menu_openDirection /*34*/:
                    C06110Uh r132 = r5.A02;
                    r132.A0k = obtainStyledAttributes.getDimensionPixelSize(index, r132.A0k);
                    continue;
                case R$styleable.FloatingActionMenu_menu_backgroundColor /*35*/:
                    C06110Uh r133 = r5.A02;
                    r133.A0l = A00(obtainStyledAttributes, index, r133.A0l);
                    continue;
                case R$styleable.FloatingActionMenu_menu_fab_label /*36*/:
                    C06110Uh r134 = r5.A02;
                    r134.A0m = A00(obtainStyledAttributes, index, r134.A0m);
                    continue;
                case R$styleable.FloatingActionMenu_menu_fab_show_animation /*37*/:
                    C06110Uh r135 = r5.A02;
                    r135.A05 = obtainStyledAttributes.getFloat(index, r135.A05);
                    continue;
                case R$styleable.FloatingActionMenu_menu_fab_hide_animation /*38*/:
                    r5.A00 = obtainStyledAttributes.getResourceId(index, r5.A00);
                    continue;
                case 39:
                    C06110Uh r136 = r5.A02;
                    r136.A04 = obtainStyledAttributes.getFloat(index, r136.A04);
                    continue;
                case 40:
                    C06110Uh r137 = r5.A02;
                    r137.A06 = obtainStyledAttributes.getFloat(index, r137.A06);
                    continue;
                case 41:
                    C06110Uh r138 = r5.A02;
                    r138.A0U = obtainStyledAttributes.getInt(index, r138.A0U);
                    continue;
                case 42:
                    C06110Uh r139 = r5.A02;
                    r139.A0n = obtainStyledAttributes.getInt(index, r139.A0n);
                    continue;
                case 43:
                    C04920On r140 = r5.A04;
                    r140.A00 = obtainStyledAttributes.getFloat(index, r140.A00);
                    continue;
                case 44:
                    if (Build.VERSION.SDK_INT >= 21) {
                        C06090Uf r141 = r5.A05;
                        r141.A0B = true;
                        r141.A00 = obtainStyledAttributes.getDimension(index, r141.A00);
                        break;
                    } else {
                        continue;
                    }
                case 45:
                    C06090Uf r142 = r5.A05;
                    r142.A02 = obtainStyledAttributes.getFloat(index, r142.A02);
                    continue;
                case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /*46*/:
                    C06090Uf r143 = r5.A05;
                    r143.A03 = obtainStyledAttributes.getFloat(index, r143.A03);
                    continue;
                case 47:
                    C06090Uf r144 = r5.A05;
                    r144.A04 = obtainStyledAttributes.getFloat(index, r144.A04);
                    continue;
                case 48:
                    C06090Uf r145 = r5.A05;
                    r145.A05 = obtainStyledAttributes.getFloat(index, r145.A05);
                    continue;
                case 49:
                    C06090Uf r146 = r5.A05;
                    r146.A06 = obtainStyledAttributes.getDimension(index, r146.A06);
                    continue;
                case SearchActionVerificationClientService.TIME_TO_SLEEP_IN_MS /*50*/:
                    C06090Uf r147 = r5.A05;
                    r147.A07 = obtainStyledAttributes.getDimension(index, r147.A07);
                    continue;
                case 51:
                    C06090Uf r148 = r5.A05;
                    r148.A08 = obtainStyledAttributes.getDimension(index, r148.A08);
                    continue;
                case 52:
                    C06090Uf r149 = r5.A05;
                    r149.A09 = obtainStyledAttributes.getDimension(index, r149.A09);
                    continue;
                case 53:
                    if (Build.VERSION.SDK_INT >= 21) {
                        C06090Uf r150 = r5.A05;
                        r150.A0A = obtainStyledAttributes.getDimension(index, r150.A0A);
                        break;
                    } else {
                        continue;
                    }
                case 54:
                    C06110Uh r151 = r5.A02;
                    r151.A0o = obtainStyledAttributes.getInt(index, r151.A0o);
                    continue;
                case 55:
                    C06110Uh r152 = r5.A02;
                    r152.A0R = obtainStyledAttributes.getInt(index, r152.A0R);
                    continue;
                case 56:
                    C06110Uh r153 = r5.A02;
                    r153.A0p = obtainStyledAttributes.getDimensionPixelSize(index, r153.A0p);
                    continue;
                case 57:
                    C06110Uh r154 = r5.A02;
                    r154.A0S = obtainStyledAttributes.getDimensionPixelSize(index, r154.A0S);
                    continue;
                case 58:
                    C06110Uh r155 = r5.A02;
                    r155.A0q = obtainStyledAttributes.getDimensionPixelSize(index, r155.A0q);
                    continue;
                case 59:
                    C06110Uh r156 = r5.A02;
                    r156.A0T = obtainStyledAttributes.getDimensionPixelSize(index, r156.A0T);
                    continue;
                case 60:
                    C06090Uf r157 = r5.A05;
                    r157.A01 = obtainStyledAttributes.getFloat(index, r157.A01);
                    continue;
                case 61:
                    C06110Uh r158 = r5.A02;
                    r158.A0C = A00(obtainStyledAttributes, index, r158.A0C);
                    continue;
                case 62:
                    C06110Uh r159 = r5.A02;
                    r159.A0D = obtainStyledAttributes.getDimensionPixelSize(index, r159.A0D);
                    continue;
                case 63:
                    C06110Uh r160 = r5.A02;
                    r160.A00 = obtainStyledAttributes.getFloat(index, r160.A00);
                    continue;
                case AccessibilityNodeInfoCompat.ACTION_ACCESSIBILITY_FOCUS /*64*/:
                    AnonymousClass0UD r161 = r5.A03;
                    r161.A02 = A00(obtainStyledAttributes, index, r161.A02);
                    continue;
                case 65:
                    int i4 = obtainStyledAttributes.peekValue(index).type;
                    r5.A03.A05 = i4 == 3 ? obtainStyledAttributes.getString(index) : C04380Mi.A00[obtainStyledAttributes.getInteger(index, 0)];
                    continue;
                case 66:
                    r5.A03.A03 = obtainStyledAttributes.getInt(index, 0);
                    continue;
                case 67:
                    AnonymousClass0UD r162 = r5.A03;
                    r162.A01 = obtainStyledAttributes.getFloat(index, r162.A01);
                    continue;
                case 68:
                    C04920On r163 = r5.A04;
                    r163.A01 = obtainStyledAttributes.getFloat(index, r163.A01);
                    continue;
                case 69:
                    r5.A02.A07 = obtainStyledAttributes.getFloat(index, 1.0f);
                    continue;
                case 70:
                    r5.A02.A02 = obtainStyledAttributes.getFloat(index, 1.0f);
                    continue;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    continue;
                case AnonymousClass2EA.A02 /*72*/:
                    C06110Uh r164 = r5.A02;
                    r164.A0Y = obtainStyledAttributes.getInt(index, r164.A0Y);
                    continue;
                case 73:
                    C06110Uh r165 = r5.A02;
                    r165.A0Z = obtainStyledAttributes.getDimensionPixelSize(index, r165.A0Z);
                    continue;
                case 74:
                    r5.A02.A0t = obtainStyledAttributes.getString(index);
                    continue;
                case 75:
                    C06110Uh r166 = r5.A02;
                    r166.A0x = obtainStyledAttributes.getBoolean(index, r166.A0x);
                    continue;
                case 76:
                    AnonymousClass0UD r167 = r5.A03;
                    r167.A04 = obtainStyledAttributes.getInt(index, r167.A04);
                    continue;
                case CallsPrivacy.NOINTERNET_CALLING /*77*/:
                    r5.A02.A0s = obtainStyledAttributes.getString(index);
                    continue;
                case 78:
                    C04920On r168 = r5.A04;
                    r168.A02 = obtainStyledAttributes.getInt(index, r168.A02);
                    continue;
                case 79:
                    AnonymousClass0UD r169 = r5.A03;
                    r169.A00 = obtainStyledAttributes.getFloat(index, r169.A00);
                    continue;
                case 80:
                    C06110Uh r170 = r5.A02;
                    r170.A0v = obtainStyledAttributes.getBoolean(index, r170.A0v);
                    continue;
                case 81:
                    C06110Uh r171 = r5.A02;
                    r171.A0u = obtainStyledAttributes.getBoolean(index, r171.A0u);
                    continue;
                case 82:
                    A0o = AnonymousClass000.A0o();
                    str = "unused attribute 0x";
                    break;
                default:
                    A0o = AnonymousClass000.A0o();
                    str = "Unknown attribute 0x";
                    break;
            }
            A0o.append(str);
            AnonymousClass000.A1J(A0o, index);
            A0o.append("   ");
            Log.w("ConstraintSet", AnonymousClass000.A0l(A0o, sparseIntArray.get(index)));
        }
        obtainStyledAttributes.recycle();
        return r5;
    }

    public void A05(ConstraintLayout constraintLayout) {
        Method method;
        Object[] objArr;
        String str;
        ConstraintLayout constraintLayout2 = constraintLayout;
        int childCount = constraintLayout2.getChildCount();
        HashMap hashMap = this.A00;
        HashSet hashSet = new HashSet(hashMap.keySet());
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout2.getChildAt(i2);
            int id = childAt.getId();
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                StringBuilder A0r = AnonymousClass000.A0r("id unknown ");
                try {
                    str = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    str = "UNKNOWN";
                }
                Log.w("ConstraintSet", AnonymousClass000.A0h(str, A0r));
            } else if (id == -1) {
                throw AnonymousClass000.A0a("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id != -1) {
                if (hashMap.containsKey(Integer.valueOf(id))) {
                    Integer valueOf = Integer.valueOf(id);
                    hashSet.remove(valueOf);
                    AnonymousClass053 r8 = (AnonymousClass053) hashMap.get(valueOf);
                    if (childAt instanceof Barrier) {
                        r8.A02.A0b = 1;
                    }
                    C06110Uh r7 = r8.A02;
                    int i3 = r7.A0b;
                    if (i3 != -1 && i3 == 1) {
                        Barrier barrier = (Barrier) childAt;
                        barrier.setId(id);
                        barrier.A00 = r7.A0Y;
                        barrier.setMargin(r7.A0Z);
                        barrier.setAllowsGoneWidget(r7.A0x);
                        int[] iArr = r7.A0z;
                        if (iArr == null) {
                            String str2 = r7.A0t;
                            if (str2 != null) {
                                iArr = A02(barrier, str2);
                                r7.A0z = iArr;
                            }
                        }
                        barrier.setReferencedIds(iArr);
                    }
                    AnonymousClass06X r9 = (AnonymousClass06X) childAt.getLayoutParams();
                    r9.A00();
                    r8.A01(r9);
                    HashMap hashMap2 = r8.A01;
                    Class<?> cls = childAt.getClass();
                    Iterator it = hashMap2.keySet().iterator();
                    while (it.hasNext()) {
                        String A0m = AnonymousClass000.A0m(it);
                        C06070Uc r15 = (C06070Uc) hashMap2.get(A0m);
                        String A0h = AnonymousClass000.A0h(A0m, AnonymousClass000.A0r("set"));
                        try {
                            switch (r15.A03.ordinal()) {
                                case 0:
                                    method = AnonymousClass000.A0s(cls, Integer.TYPE, A0h, new Class[1], 0);
                                    objArr = new Object[1];
                                    AnonymousClass000.A1M(objArr, r15.A02, 0);
                                    break;
                                case 1:
                                    method = AnonymousClass000.A0s(cls, Float.TYPE, A0h, new Class[1], 0);
                                    objArr = new Object[]{Float.valueOf(r15.A00)};
                                    break;
                                case 2:
                                    method = AnonymousClass000.A0s(cls, Integer.TYPE, A0h, new Class[1], 0);
                                    objArr = new Object[1];
                                    AnonymousClass000.A1M(objArr, r15.A01, 0);
                                    break;
                                case 3:
                                    method = AnonymousClass000.A0s(cls, Drawable.class, A0h, new Class[1], 0);
                                    ColorDrawable colorDrawable = new ColorDrawable();
                                    colorDrawable.setColor(r15.A01);
                                    objArr = new Object[]{colorDrawable};
                                    break;
                                case 4:
                                    method = AnonymousClass000.A0s(cls, CharSequence.class, A0h, new Class[1], 0);
                                    objArr = new Object[]{r15.A05};
                                    break;
                                case 5:
                                    method = AnonymousClass000.A0s(cls, Boolean.TYPE, A0h, new Class[1], 0);
                                    objArr = new Object[]{Boolean.valueOf(r15.A06)};
                                    break;
                                case 6:
                                    method = AnonymousClass000.A0s(cls, Float.TYPE, A0h, new Class[1], 0);
                                    objArr = new Object[]{Float.valueOf(r15.A00)};
                                    break;
                            }
                            method.invoke(childAt, objArr);
                        } catch (NoSuchMethodException e2) {
                            Log.e("TransitionLayout", e2.getMessage());
                            StringBuilder A0q = AnonymousClass000.A0q(" Custom Attribute \"");
                            A0q.append(A0m);
                            A0q.append("\" not found on ");
                            String name = cls.getName();
                            Log.e("TransitionLayout", AnonymousClass000.A0h(name, A0q));
                            StringBuilder A0q2 = AnonymousClass000.A0q(name);
                            A0q2.append(" must have a method ");
                            Log.e("TransitionLayout", AnonymousClass000.A0h(A0h, A0q2));
                        } catch (IllegalAccessException | InvocationTargetException e3) {
                            StringBuilder A0q3 = AnonymousClass000.A0q(" Custom Attribute \"");
                            A0q3.append(A0m);
                            A0q3.append("\" not found on ");
                            Log.e("TransitionLayout", AnonymousClass000.A0h(cls.getName(), A0q3));
                            e3.printStackTrace();
                        }
                    }
                    childAt.setLayoutParams(r9);
                    C04920On r4 = r8.A04;
                    if (r4.A02 == 0) {
                        childAt.setVisibility(r4.A03);
                    }
                    int i4 = Build.VERSION.SDK_INT;
                    if (i4 >= 17) {
                        childAt.setAlpha(r4.A00);
                        C06090Uf r5 = r8.A05;
                        childAt.setRotation(r5.A01);
                        childAt.setRotationX(r5.A02);
                        childAt.setRotationY(r5.A03);
                        childAt.setScaleX(r5.A04);
                        childAt.setScaleY(r5.A05);
                        float f2 = r5.A06;
                        if (!Float.isNaN(f2)) {
                            childAt.setPivotX(f2);
                        }
                        float f3 = r5.A07;
                        if (!Float.isNaN(f3)) {
                            childAt.setPivotY(f3);
                        }
                        childAt.setTranslationX(r5.A08);
                        childAt.setTranslationY(r5.A09);
                        if (i4 >= 21) {
                            childAt.setTranslationZ(r5.A0A);
                            if (r5.A0B) {
                                childAt.setElevation(r5.A00);
                            }
                        }
                    }
                } else {
                    Log.v("ConstraintSet", AnonymousClass000.A0l(AnonymousClass000.A0r("WARNING NO CONSTRAINTS for view "), id));
                }
            }
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            Number number = (Number) it2.next();
            AnonymousClass053 r6 = (AnonymousClass053) hashMap.get(number);
            C06110Uh r82 = r6.A02;
            int i5 = r82.A0b;
            if (i5 != -1 && i5 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout2.getContext());
                barrier2.setId(number.intValue());
                int[] iArr2 = r82.A0z;
                if (iArr2 == null) {
                    String str3 = r82.A0t;
                    if (str3 != null) {
                        iArr2 = A02(barrier2, str3);
                        r82.A0z = iArr2;
                    }
                    barrier2.A00 = r82.A0Y;
                    barrier2.setMargin(r82.A0Z);
                    AnonymousClass06X r0 = new AnonymousClass06X(-2, -2);
                    barrier2.A02();
                    r6.A01(r0);
                    constraintLayout2.addView(barrier2, r0);
                }
                barrier2.setReferencedIds(iArr2);
                barrier2.A00 = r82.A0Y;
                barrier2.setMargin(r82.A0Z);
                AnonymousClass06X r02 = new AnonymousClass06X(-2, -2);
                barrier2.A02();
                r6.A01(r02);
                constraintLayout2.addView(barrier2, r02);
            }
            if (r82.A0y) {
                Guideline guideline = new Guideline(constraintLayout2.getContext());
                guideline.setId(number.intValue());
                AnonymousClass06X r03 = new AnonymousClass06X(-2, -2);
                r6.A01(r03);
                constraintLayout2.addView(guideline, r03);
            }
        }
    }

    public void A06(ConstraintLayout constraintLayout) {
        C06070Uc r15;
        ConstraintLayout constraintLayout2 = constraintLayout;
        int childCount = constraintLayout2.getChildCount();
        HashMap hashMap = this.A00;
        hashMap.clear();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout2.getChildAt(i2);
            AnonymousClass06X r13 = (AnonymousClass06X) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id != -1) {
                if (!hashMap.containsKey(Integer.valueOf(id))) {
                    hashMap.put(Integer.valueOf(id), new AnonymousClass053());
                }
                AnonymousClass053 r8 = (AnonymousClass053) hashMap.get(Integer.valueOf(id));
                HashMap hashMap2 = this.A01;
                HashMap A0x = AnonymousClass000.A0x();
                Class<?> cls = childAt.getClass();
                Iterator it = hashMap2.keySet().iterator();
                while (it.hasNext()) {
                    String A0m = AnonymousClass000.A0m(it);
                    C06070Uc r1 = (C06070Uc) hashMap2.get(A0m);
                    try {
                        if (A0m.equals("BackgroundColor")) {
                            r15 = new C06070Uc(r1, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor()));
                        } else {
                            StringBuilder A0o = AnonymousClass000.A0o();
                            A0o.append("getMap");
                            r15 = new C06070Uc(r1, AnonymousClass000.A0X(cls, childAt, AnonymousClass000.A0h(A0m, A0o)));
                        }
                        A0x.put(A0m, r15);
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                        e2.printStackTrace();
                    }
                }
                r8.A01 = A0x;
                AnonymousClass053.A00(r13, r8, id);
                C04920On r12 = r8.A04;
                r12.A03 = childAt.getVisibility();
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 17) {
                    r12.A00 = childAt.getAlpha();
                    C06090Uf r9 = r8.A05;
                    r9.A01 = childAt.getRotation();
                    r9.A02 = childAt.getRotationX();
                    r9.A03 = childAt.getRotationY();
                    r9.A04 = childAt.getScaleX();
                    r9.A05 = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                        r9.A06 = pivotX;
                        r9.A07 = pivotY;
                    }
                    r9.A08 = childAt.getTranslationX();
                    r9.A09 = childAt.getTranslationY();
                    if (i3 >= 21) {
                        r9.A0A = childAt.getTranslationZ();
                        if (r9.A0B) {
                            r9.A00 = childAt.getElevation();
                        }
                    }
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    C06110Uh r14 = r8.A02;
                    r14.A0x = barrier.A01.A02;
                    r14.A0z = barrier.getReferencedIds();
                    r14.A0Y = barrier.A00;
                    r14.A0Z = barrier.A01.A01;
                }
                i2++;
            } else {
                throw AnonymousClass000.A0a("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }
}
