package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: X.08R  reason: invalid class name */
public class AnonymousClass08R {
    public int A00 = -1;
    public int A01 = 0;
    public Typeface A02;
    public AnonymousClass08Y A03;
    public AnonymousClass08Y A04;
    public AnonymousClass08Y A05;
    public AnonymousClass08Y A06;
    public AnonymousClass08Y A07;
    public AnonymousClass08Y A08;
    public AnonymousClass08Y A09;
    public boolean A0A;
    public final TextView A0B;
    public final AnonymousClass08X A0C;

    public AnonymousClass08R(TextView textView) {
        this.A0B = textView;
        this.A0C = new AnonymousClass08X(textView);
    }

    public static AnonymousClass08Y A00(Context context, AnonymousClass06K r3, int i2) {
        ColorStateList A042;
        synchronized (r3) {
            A042 = r3.A00.A04(context, i2);
        }
        if (A042 == null) {
            return null;
        }
        AnonymousClass08Y r1 = new AnonymousClass08Y();
        r1.A02 = true;
        r1.A00 = A042;
        return r1;
    }

    public static void A01(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (Build.VERSION.SDK_INT < 30 && inputConnection != null) {
            EditorInfoCompat.setInitialSurroundingText(editorInfo, textView.getText());
        }
    }

    public void A02() {
        if (!(this.A05 == null && this.A09 == null && this.A06 == null && this.A03 == null)) {
            Drawable[] compoundDrawables = this.A0B.getCompoundDrawables();
            A09(compoundDrawables[0], this.A05);
            A09(compoundDrawables[1], this.A09);
            A09(compoundDrawables[2], this.A06);
            A09(compoundDrawables[3], this.A03);
        }
        if (Build.VERSION.SDK_INT < 17) {
            return;
        }
        if (this.A07 != null || this.A04 != null) {
            Drawable[] compoundDrawablesRelative = this.A0B.getCompoundDrawablesRelative();
            A09(compoundDrawablesRelative[0], this.A07);
            A09(compoundDrawablesRelative[2], this.A04);
        }
    }

    public void A03(int i2) {
        AnonymousClass08X r4 = this.A0C;
        if (!(!(r4.A09 instanceof AnonymousClass014))) {
            return;
        }
        if (i2 == 0) {
            r4.A03 = 0;
            r4.A01 = -1.0f;
            r4.A00 = -1.0f;
            r4.A02 = -1.0f;
            r4.A07 = new int[0];
            r4.A06 = false;
        } else if (i2 == 1) {
            DisplayMetrics displayMetrics = r4.A08.getResources().getDisplayMetrics();
            r4.A05(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (r4.A07()) {
                r4.A04();
            }
        } else {
            StringBuilder sb = new StringBuilder("Unknown auto-size text type: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public void A04(int i2, int i3, int i4, int i5) {
        AnonymousClass08X r4 = this.A0C;
        if (!(r4.A09 instanceof AnonymousClass014)) {
            DisplayMetrics displayMetrics = r4.A08.getResources().getDisplayMetrics();
            r4.A05(TypedValue.applyDimension(i5, (float) i2, displayMetrics), TypedValue.applyDimension(i5, (float) i3, displayMetrics), TypedValue.applyDimension(i5, (float) i4, displayMetrics));
            if (r4.A07()) {
                r4.A04();
            }
        }
    }

    public void A05(Context context, int i2) {
        String string;
        ColorStateList A012;
        ColorStateList A013;
        AnonymousClass07T r2 = new AnonymousClass07T(context, context.obtainStyledAttributes(i2, AnonymousClass05L.A0M));
        TypedArray typedArray = r2.A02;
        if (typedArray.hasValue(14)) {
            this.A0B.setAllCaps(typedArray.getBoolean(14, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 23) {
            if (typedArray.hasValue(3) && r2.A01(3) != null) {
                TextView textView = this.A0B;
            }
            if (typedArray.hasValue(5) && (A013 = r2.A01(5)) != null) {
                this.A0B.setLinkTextColor(A013);
            }
            if (typedArray.hasValue(4) && (A012 = r2.A01(4)) != null) {
                this.A0B.setHintTextColor(A012);
            }
        }
        if (typedArray.hasValue(0) && typedArray.getDimensionPixelSize(0, -1) == 0) {
            this.A0B.setTextSize(0, 0.0f);
        }
        A06(context, r2);
        if (i3 >= 26 && typedArray.hasValue(13) && (string = typedArray.getString(13)) != null) {
            this.A0B.setFontVariationSettings(string);
        }
        r2.A04();
        if (this.A02 != null) {
            TextView textView2 = this.A0B;
            int i4 = this.A01;
        }
    }

    public final void A06(Context context, AnonymousClass07T r17) {
        String string;
        Typeface create;
        Typeface A032;
        int i2 = this.A01;
        AnonymousClass07T r8 = r17;
        TypedArray typedArray = r8.A02;
        this.A01 = typedArray.getInt(2, i2);
        int i3 = Build.VERSION.SDK_INT;
        boolean z2 = false;
        if (i3 >= 28) {
            int i4 = typedArray.getInt(11, -1);
            this.A00 = i4;
            if (i4 != -1) {
                this.A01 &= 2;
            }
        }
        int i5 = 10;
        if (typedArray.hasValue(10) || typedArray.hasValue(12)) {
            this.A02 = null;
            if (typedArray.hasValue(12)) {
                i5 = 12;
            }
            int i6 = this.A00;
            int i7 = this.A01;
            if (!context.isRestricted()) {
                C017408f r11 = new C017408f(this, new WeakReference(this.A0B), i6, i7);
                try {
                    int i8 = this.A01;
                    int resourceId = typedArray.getResourceId(i5, 0);
                    if (resourceId != 0) {
                        TypedValue typedValue = r8.A00;
                        if (typedValue == null) {
                            typedValue = new TypedValue();
                            r8.A00 = typedValue;
                        }
                        Context context2 = r8.A01;
                        if (!context2.isRestricted() && (A032 = AnonymousClass00X.A03(context2, typedValue, r11, resourceId, i8, true)) != null) {
                            if (i3 >= 28 && this.A00 != -1) {
                                Typeface create2 = Typeface.create(A032, 0);
                                int i9 = this.A00;
                                boolean z3 = false;
                                if ((this.A01 & 2) != 0) {
                                    z3 = true;
                                }
                                A032 = Typeface.create(create2, i9, z3);
                            }
                            this.A02 = A032;
                        }
                    }
                    boolean z4 = false;
                    if (this.A02 == null) {
                        z4 = true;
                    }
                    this.A0A = z4;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.A02 == null && (string = typedArray.getString(i5)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.A00 == -1) {
                    create = Typeface.create(string, this.A01);
                } else {
                    Typeface create3 = Typeface.create(string, 0);
                    int i10 = this.A00;
                    if ((this.A01 & 2) != 0) {
                        z2 = true;
                    }
                    create = Typeface.create(create3, i10, z2);
                }
            } else {
                return;
            }
        } else if (typedArray.hasValue(1)) {
            this.A0A = false;
            int i11 = typedArray.getInt(1, 1);
            if (i11 == 1) {
                create = Typeface.SANS_SERIF;
            } else if (i11 == 2) {
                create = Typeface.SERIF;
            } else if (i11 == 3) {
                create = Typeface.MONOSPACE;
            } else {
                return;
            }
        } else {
            return;
        }
        this.A02 = create;
    }

    public void A07(ColorStateList colorStateList) {
        AnonymousClass08Y r1 = this.A08;
        if (r1 == null) {
            r1 = new AnonymousClass08Y();
            this.A08 = r1;
        }
        r1.A00 = colorStateList;
        boolean z2 = false;
        if (colorStateList != null) {
            z2 = true;
        }
        r1.A02 = z2;
        this.A05 = r1;
        this.A09 = r1;
        this.A06 = r1;
        this.A03 = r1;
        this.A07 = r1;
        this.A04 = r1;
    }

    public void A08(PorterDuff.Mode mode) {
        AnonymousClass08Y r1 = this.A08;
        if (r1 == null) {
            r1 = new AnonymousClass08Y();
            this.A08 = r1;
        }
        r1.A01 = mode;
        boolean z2 = false;
        if (mode != null) {
            z2 = true;
        }
        r1.A03 = z2;
        this.A05 = r1;
        this.A09 = r1;
        this.A06 = r1;
        this.A03 = r1;
        this.A07 = r1;
        this.A04 = r1;
    }

    public final void A09(Drawable drawable, AnonymousClass08Y r3) {
        if (drawable != null && r3 != null) {
            AnonymousClass06L.A03(drawable, r3, this.A0B.getDrawableState());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02b0  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x02f0  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02fc  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0307  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0313  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x031e  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x03b8  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x03c6  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x03df  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x03e2  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x03e5  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x03e8  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x03eb  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x03ee  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x03f6  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x03fa  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x03fe  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0402  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0423  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0426  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x042f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0208  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A(android.util.AttributeSet r27, int r28) {
        /*
            r26 = this;
            r12 = r26
            android.widget.TextView r11 = r12.A0B
            android.content.Context r10 = r11.getContext()
            X.06K r9 = X.AnonymousClass06K.A01()
            int[] r2 = X.AnonymousClass05L.A07
            r13 = 0
            r25 = r27
            r24 = r28
            r1 = r25
            r0 = r24
            X.07T r3 = X.AnonymousClass07T.A00(r10, r1, r2, r0, r13)
            android.content.Context r18 = r11.getContext()
            android.content.res.TypedArray r4 = r3.A02
            r17 = 0
            r8 = 0
            r19 = r4
            r20 = r1
            r21 = r11
            r22 = r2
            r23 = r0
            X.C004601z.A0N(r18, r19, r20, r21, r22, r23)
            r2 = -1
            int r1 = r4.getResourceId(r13, r2)
            r0 = 3
            boolean r0 = r4.hasValue(r0)
            if (r0 == 0) goto L_0x0048
            r0 = 3
            int r0 = r4.getResourceId(r0, r13)
            X.08Y r0 = A00(r10, r9, r0)
            r12.A05 = r0
        L_0x0048:
            r0 = 1
            boolean r0 = r4.hasValue(r0)
            if (r0 == 0) goto L_0x005a
            r0 = 1
            int r0 = r4.getResourceId(r0, r13)
            X.08Y r0 = A00(r10, r9, r0)
            r12.A09 = r0
        L_0x005a:
            r0 = 4
            boolean r0 = r4.hasValue(r0)
            if (r0 == 0) goto L_0x006c
            r0 = 4
            int r0 = r4.getResourceId(r0, r13)
            X.08Y r0 = A00(r10, r9, r0)
            r12.A06 = r0
        L_0x006c:
            r0 = 2
            boolean r0 = r4.hasValue(r0)
            if (r0 == 0) goto L_0x007e
            r0 = 2
            int r0 = r4.getResourceId(r0, r13)
            X.08Y r0 = A00(r10, r9, r0)
            r12.A03 = r0
        L_0x007e:
            int r7 = android.os.Build.VERSION.SDK_INT
            r0 = 17
            if (r7 < r0) goto L_0x00a8
            r0 = 5
            boolean r0 = r4.hasValue(r0)
            if (r0 == 0) goto L_0x0096
            r0 = 5
            int r0 = r4.getResourceId(r0, r13)
            X.08Y r0 = A00(r10, r9, r0)
            r12.A07 = r0
        L_0x0096:
            r0 = 6
            boolean r0 = r4.hasValue(r0)
            if (r0 == 0) goto L_0x00a8
            r0 = 6
            int r0 = r4.getResourceId(r0, r13)
            X.08Y r0 = A00(r10, r9, r0)
            r12.A04 = r0
        L_0x00a8:
            r3.A04()
            android.text.method.TransformationMethod r0 = r11.getTransformationMethod()
            boolean r14 = r0 instanceof android.text.method.PasswordTransformationMethod
            r15 = 26
            r3 = 23
            if (r1 == r2) goto L_0x0438
            int[] r0 = X.AnonymousClass05L.A0M
            android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r1, r0)
            X.07T r1 = new X.07T
            r1.<init>(r10, r0)
            if (r14 != 0) goto L_0x0434
            r0 = 14
            android.content.res.TypedArray r2 = r1.A02
            boolean r0 = r2.hasValue(r0)
            if (r0 == 0) goto L_0x0434
            r0 = 14
            boolean r17 = r2.getBoolean(r0, r13)
            r16 = 1
        L_0x00d6:
            r12.A06(r10, r1)
            if (r7 >= r3) goto L_0x042f
            r2 = 3
            android.content.res.TypedArray r3 = r1.A02
            boolean r0 = r3.hasValue(r2)
            if (r0 == 0) goto L_0x042c
            android.content.res.ColorStateList r6 = r1.A01(r2)
        L_0x00e8:
            r2 = 4
            boolean r0 = r3.hasValue(r2)
            if (r0 == 0) goto L_0x0429
            android.content.res.ColorStateList r5 = r1.A01(r2)
        L_0x00f3:
            r2 = 5
            boolean r0 = r3.hasValue(r2)
            if (r0 == 0) goto L_0x0431
            android.content.res.ColorStateList r4 = r1.A01(r2)
        L_0x00fe:
            r0 = 15
            android.content.res.TypedArray r2 = r1.A02
            boolean r0 = r2.hasValue(r0)
            if (r0 == 0) goto L_0x0426
            r0 = 15
            java.lang.String r3 = r2.getString(r0)
        L_0x010e:
            if (r7 < r15) goto L_0x0423
            r0 = 13
            boolean r0 = r2.hasValue(r0)
            if (r0 == 0) goto L_0x0423
            r0 = 13
            java.lang.String r2 = r2.getString(r0)
        L_0x011e:
            r1.A04()
        L_0x0121:
            int[] r0 = X.AnonymousClass05L.A0M
            r15 = r25
            r1 = r24
            X.07T r1 = X.AnonymousClass07T.A00(r10, r15, r0, r1, r13)
            if (r14 != 0) goto L_0x041f
            android.content.res.TypedArray r0 = r1.A02
            r18 = r0
            r0 = 14
            r15 = r0
            r0 = r18
            boolean r0 = r0.hasValue(r15)
            if (r0 == 0) goto L_0x041f
            r0 = r18
            boolean r17 = r0.getBoolean(r15, r13)
            r0 = 23
            r16 = 1
        L_0x0146:
            if (r7 >= r0) goto L_0x016b
            r13 = 3
            android.content.res.TypedArray r15 = r1.A02
            boolean r0 = r15.hasValue(r13)
            if (r0 == 0) goto L_0x0155
            android.content.res.ColorStateList r6 = r1.A01(r13)
        L_0x0155:
            r13 = 4
            boolean r0 = r15.hasValue(r13)
            if (r0 == 0) goto L_0x0160
            android.content.res.ColorStateList r5 = r1.A01(r13)
        L_0x0160:
            r13 = 5
            boolean r0 = r15.hasValue(r13)
            if (r0 == 0) goto L_0x016b
            android.content.res.ColorStateList r4 = r1.A01(r13)
        L_0x016b:
            r0 = 15
            android.content.res.TypedArray r13 = r1.A02
            boolean r0 = r13.hasValue(r0)
            if (r0 == 0) goto L_0x017b
            r0 = 15
            java.lang.String r3 = r13.getString(r0)
        L_0x017b:
            r0 = 26
            if (r7 < r0) goto L_0x01a2
            r0 = 13
            boolean r0 = r13.hasValue(r0)
            if (r0 == 0) goto L_0x018d
            r0 = 13
            java.lang.String r2 = r13.getString(r0)
        L_0x018d:
            r0 = 28
            if (r7 < r0) goto L_0x01a2
            boolean r0 = r13.hasValue(r8)
            if (r0 == 0) goto L_0x01a2
            r0 = -1
            int r0 = r13.getDimensionPixelSize(r8, r0)
            if (r0 != 0) goto L_0x01a2
            r0 = 0
            r11.setTextSize(r8, r0)
        L_0x01a2:
            r12.A06(r10, r1)
            r1.A04()
            if (r6 == 0) goto L_0x01aa
        L_0x01aa:
            if (r5 == 0) goto L_0x01af
            r11.setHintTextColor(r5)
        L_0x01af:
            if (r4 == 0) goto L_0x01b4
            r11.setLinkTextColor(r4)
        L_0x01b4:
            if (r14 != 0) goto L_0x01bd
            if (r16 == 0) goto L_0x01bd
            r0 = r17
            r11.setAllCaps(r0)
        L_0x01bd:
            android.graphics.Typeface r4 = r12.A02
            if (r4 == 0) goto L_0x01c8
            int r1 = r12.A00
            r0 = -1
            if (r1 != r0) goto L_0x041d
            int r0 = r12.A01
        L_0x01c8:
            if (r2 == 0) goto L_0x01cd
            r11.setFontVariationSettings(r2)
        L_0x01cd:
            if (r3 == 0) goto L_0x01da
            r0 = 24
            if (r7 < r0) goto L_0x0406
            android.os.LocaleList r0 = android.os.LocaleList.forLanguageTags(r3)
            r11.setTextLocales(r0)
        L_0x01da:
            X.08X r5 = r12.A0C
            android.content.Context r0 = r5.A08
            r23 = r0
            int[] r3 = X.AnonymousClass05L.A08
            r4 = 0
            r2 = r0
            r1 = r25
            r0 = r24
            android.content.res.TypedArray r1 = r2.obtainStyledAttributes(r1, r3, r0, r8)
            android.widget.TextView r0 = r5.A09
            r20 = r0
            android.content.Context r17 = r20.getContext()
            r16 = 0
            r18 = r1
            r19 = r25
            r21 = r3
            r22 = r24
            X.C004601z.A0N(r17, r18, r19, r20, r21, r22)
            r2 = 5
            boolean r0 = r1.hasValue(r2)
            if (r0 == 0) goto L_0x020e
            int r0 = r1.getInt(r2, r8)
            r5.A03 = r0
        L_0x020e:
            r6 = 4
            boolean r0 = r1.hasValue(r6)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 == 0) goto L_0x0402
            float r7 = r1.getDimension(r6, r2)
        L_0x021b:
            r6 = 2
            boolean r0 = r1.hasValue(r6)
            if (r0 == 0) goto L_0x03fe
            float r8 = r1.getDimension(r6, r2)
        L_0x0226:
            r6 = 1
            boolean r0 = r1.hasValue(r6)
            if (r0 == 0) goto L_0x03fa
            float r6 = r1.getDimension(r6, r2)
        L_0x0231:
            r12 = 3
            boolean r0 = r1.hasValue(r12)
            if (r0 == 0) goto L_0x0266
            int r12 = r1.getResourceId(r12, r4)
            if (r12 <= 0) goto L_0x0266
            android.content.res.Resources r0 = r1.getResources()
            android.content.res.TypedArray r14 = r0.obtainTypedArray(r12)
            int r15 = r14.length()
            int[] r13 = new int[r15]
            if (r15 <= 0) goto L_0x0263
            r12 = 0
        L_0x024f:
            r0 = -1
            int r0 = r14.getDimensionPixelSize(r12, r0)
            r13[r12] = r0
            int r12 = r12 + 1
            if (r12 < r15) goto L_0x024f
            int[] r0 = X.AnonymousClass08X.A02(r13)
            r5.A07 = r0
            r5.A08()
        L_0x0263:
            r14.recycle()
        L_0x0266:
            r1.recycle()
            r0 = r20
            boolean r0 = r0 instanceof X.AnonymousClass014
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x03f6
            int r1 = r5.A03
            r0 = 1
            if (r1 != r0) goto L_0x02a3
            boolean r0 = r5.A05
            if (r0 != 0) goto L_0x02a0
            android.content.res.Resources r0 = r23.getResources()
            android.util.DisplayMetrics r12 = r0.getDisplayMetrics()
            r1 = 2
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x028d
            r0 = 1094713344(0x41400000, float:12.0)
            float r8 = android.util.TypedValue.applyDimension(r1, r0, r12)
        L_0x028d:
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0297
            r0 = 1121976320(0x42e00000, float:112.0)
            float r6 = android.util.TypedValue.applyDimension(r1, r0, r12)
        L_0x0297:
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x029d
            r7 = 1065353216(0x3f800000, float:1.0)
        L_0x029d:
            r5.A05(r8, r6, r7)
        L_0x02a0:
            r5.A07()
        L_0x02a3:
            boolean r0 = X.AnonymousClass02a.A00
            if (r0 == 0) goto L_0x02ce
            int r0 = r5.A03
            if (r0 == 0) goto L_0x02ce
            int[] r1 = r5.A07
            int r0 = r1.length
            if (r0 <= 0) goto L_0x02ce
            int r0 = r11.getAutoSizeStepGranularity()
            float r0 = (float) r0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x03f1
            float r0 = r5.A01
            int r2 = java.lang.Math.round(r0)
            float r0 = r5.A00
            int r1 = java.lang.Math.round(r0)
            float r0 = r5.A02
            int r0 = java.lang.Math.round(r0)
            r11.setAutoSizeTextTypeUniformWithConfiguration(r2, r1, r0, r4)
        L_0x02ce:
            r0 = r25
            android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r0, r3)
            X.07T r4 = new X.07T
            r4.<init>(r10, r0)
            r1 = -1
            r0 = 8
            android.content.res.TypedArray r5 = r4.A02
            int r0 = r5.getResourceId(r0, r1)
            if (r0 == r1) goto L_0x03ee
            android.graphics.drawable.Drawable r14 = r9.A03(r10, r0)
        L_0x02e8:
            r0 = 13
            int r0 = r5.getResourceId(r0, r1)
            if (r0 == r1) goto L_0x03eb
            android.graphics.drawable.Drawable r12 = r9.A03(r10, r0)
        L_0x02f4:
            r0 = 9
            int r0 = r5.getResourceId(r0, r1)
            if (r0 == r1) goto L_0x03e8
            android.graphics.drawable.Drawable r13 = r9.A03(r10, r0)
        L_0x0300:
            r0 = 6
            int r0 = r5.getResourceId(r0, r1)
            if (r0 == r1) goto L_0x03e5
            android.graphics.drawable.Drawable r8 = r9.A03(r10, r0)
        L_0x030b:
            r0 = 10
            int r0 = r5.getResourceId(r0, r1)
            if (r0 == r1) goto L_0x03e2
            android.graphics.drawable.Drawable r2 = r9.A03(r10, r0)
        L_0x0317:
            r0 = 7
            int r0 = r5.getResourceId(r0, r1)
            if (r0 == r1) goto L_0x03df
            android.graphics.drawable.Drawable r9 = r9.A03(r10, r0)
        L_0x0322:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 17
            r7 = 3
            r6 = 1
            r3 = 2
            if (r1 < r0) goto L_0x03a2
            if (r2 != 0) goto L_0x032f
            if (r9 == 0) goto L_0x03a2
        L_0x032f:
            android.graphics.drawable.Drawable[] r0 = r11.getCompoundDrawablesRelative()
            if (r2 != 0) goto L_0x0337
            r2 = r0[r16]
        L_0x0337:
            if (r12 != 0) goto L_0x033b
            r12 = r0[r6]
        L_0x033b:
            if (r9 != 0) goto L_0x033f
            r9 = r0[r3]
        L_0x033f:
            if (r8 != 0) goto L_0x0343
            r8 = r0[r7]
        L_0x0343:
            r11.setCompoundDrawablesRelativeWithIntrinsicBounds(r2, r12, r9, r8)
        L_0x0346:
            r1 = 11
            boolean r0 = r5.hasValue(r1)
            if (r0 == 0) goto L_0x0355
            android.content.res.ColorStateList r0 = r4.A01(r1)
            X.AnonymousClass04h.A03(r0, r11)
        L_0x0355:
            r0 = 12
            boolean r0 = r5.hasValue(r0)
            r6 = -1
            if (r0 == 0) goto L_0x036c
            r0 = 12
            int r1 = r5.getInt(r0, r6)
            r0 = 0
            android.graphics.PorterDuff$Mode r0 = X.C015307j.A00(r0, r1)
            X.AnonymousClass04h.A04(r0, r11)
        L_0x036c:
            r0 = 14
            int r3 = r5.getDimensionPixelSize(r0, r6)
            r0 = 17
            int r1 = r5.getDimensionPixelSize(r0, r6)
            r0 = 18
            int r2 = r5.getDimensionPixelSize(r0, r6)
            r4.A04()
            if (r3 == r6) goto L_0x0386
            X.AnonymousClass04h.A06(r11, r3)
        L_0x0386:
            if (r1 == r6) goto L_0x038b
            X.AnonymousClass04h.A07(r11, r1)
        L_0x038b:
            if (r2 == r6) goto L_0x03a1
            if (r2 < 0) goto L_0x0441
            android.text.TextPaint r1 = r11.getPaint()
            r0 = 0
            int r0 = r1.getFontMetricsInt(r0)
            if (r2 == r0) goto L_0x03a1
            int r2 = r2 - r0
            float r1 = (float) r2
            r0 = 1065353216(0x3f800000, float:1.0)
            r11.setLineSpacing(r1, r0)
        L_0x03a1:
            return
        L_0x03a2:
            if (r14 != 0) goto L_0x03aa
            if (r12 != 0) goto L_0x03aa
            if (r13 != 0) goto L_0x03aa
            if (r8 == 0) goto L_0x0346
        L_0x03aa:
            if (r1 < r0) goto L_0x03c6
            android.graphics.drawable.Drawable[] r2 = r11.getCompoundDrawablesRelative()
            r1 = r2[r16]
            if (r1 != 0) goto L_0x03b8
            r0 = r2[r3]
            if (r0 == 0) goto L_0x03c6
        L_0x03b8:
            if (r12 != 0) goto L_0x03bc
            r12 = r2[r6]
        L_0x03bc:
            r0 = r2[r3]
            if (r8 != 0) goto L_0x03c2
            r8 = r2[r7]
        L_0x03c2:
            r11.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r12, r0, r8)
            goto L_0x0346
        L_0x03c6:
            android.graphics.drawable.Drawable[] r0 = r11.getCompoundDrawables()
            if (r14 != 0) goto L_0x03ce
            r14 = r0[r16]
        L_0x03ce:
            if (r12 != 0) goto L_0x03d2
            r12 = r0[r6]
        L_0x03d2:
            if (r13 != 0) goto L_0x03d6
            r13 = r0[r3]
        L_0x03d6:
            if (r8 != 0) goto L_0x03da
            r8 = r0[r7]
        L_0x03da:
            r11.setCompoundDrawablesWithIntrinsicBounds(r14, r12, r13, r8)
            goto L_0x0346
        L_0x03df:
            r9 = 0
            goto L_0x0322
        L_0x03e2:
            r2 = 0
            goto L_0x0317
        L_0x03e5:
            r8 = 0
            goto L_0x030b
        L_0x03e8:
            r13 = 0
            goto L_0x0300
        L_0x03eb:
            r12 = 0
            goto L_0x02f4
        L_0x03ee:
            r14 = 0
            goto L_0x02e8
        L_0x03f1:
            r11.setAutoSizeTextTypeUniformWithPresetSizes(r1, r4)
            goto L_0x02ce
        L_0x03f6:
            r5.A03 = r4
            goto L_0x02a3
        L_0x03fa:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x0231
        L_0x03fe:
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x0226
        L_0x0402:
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x021b
        L_0x0406:
            r0 = 21
            if (r7 < r0) goto L_0x01da
            r0 = 44
            int r0 = r3.indexOf(r0)
            java.lang.String r0 = r3.substring(r8, r0)
            java.util.Locale r0 = java.util.Locale.forLanguageTag(r0)
            r11.setTextLocale(r0)
            goto L_0x01da
        L_0x041d:
            goto L_0x01c8
        L_0x041f:
            r0 = 23
            goto L_0x0146
        L_0x0423:
            r2 = 0
            goto L_0x011e
        L_0x0426:
            r3 = 0
            goto L_0x010e
        L_0x0429:
            r5 = 0
            goto L_0x00f3
        L_0x042c:
            r6 = 0
            goto L_0x00e8
        L_0x042f:
            r6 = 0
            r5 = 0
        L_0x0431:
            r4 = 0
            goto L_0x00fe
        L_0x0434:
            r16 = 0
            goto L_0x00d6
        L_0x0438:
            r2 = 0
            r6 = 0
            r3 = 0
            r5 = 0
            r4 = 0
            r16 = 0
            goto L_0x0121
        L_0x0441:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass08R.A0A(android.util.AttributeSet, int):void");
    }

    public void A0B(int[] iArr, int i2) {
        AnonymousClass08X r4 = this.A0C;
        if (!(r4.A09 instanceof AnonymousClass014)) {
            int length = iArr.length;
            int i3 = 0;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i2 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = r4.A08.getResources().getDisplayMetrics();
                    do {
                        iArr2[i3] = Math.round(TypedValue.applyDimension(i2, (float) iArr[i3], displayMetrics));
                        i3++;
                    } while (i3 < length);
                }
                r4.A07 = AnonymousClass08X.A02(iArr2);
                if (!r4.A08()) {
                    StringBuilder sb = new StringBuilder("None of the preset sizes is valid: ");
                    sb.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(sb.toString());
                }
            } else {
                r4.A05 = false;
            }
            if (r4.A07()) {
                r4.A04();
            }
        }
    }
}
