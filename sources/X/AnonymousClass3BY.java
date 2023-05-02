package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.util.WeakHashMap;

/* renamed from: X.3BY  reason: invalid class name */
public class AnonymousClass3BY {
    public static final AnonymousClass422 A00 = AnonymousClass422.TEXT_START;
    public static final WeakHashMap A01 = new WeakHashMap();
    public static final TextUtils.TruncateAt[] A02 = TextUtils.TruncateAt.values();

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        if (r1 != 8388613) goto L_0x0003;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0026, code lost:
        return X.AnonymousClass422.LAYOUT_END;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0029, code lost:
        return X.AnonymousClass422.LAYOUT_START;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0032, code lost:
        return X.AnonymousClass422.CENTER;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        return A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass422 A00(int r0, int r1) {
        /*
            switch(r0) {
                case 0: goto L_0x0006;
                case 1: goto L_0x0006;
                case 2: goto L_0x001e;
                case 3: goto L_0x0021;
                case 4: goto L_0x0030;
                case 5: goto L_0x0027;
                case 6: goto L_0x0024;
                default: goto L_0x0003;
            }
        L_0x0003:
            X.422 r0 = A00
            return r0
        L_0x0006:
            r0 = 8388615(0x800007, float:1.1754953E-38)
            r1 = r1 & r0
            r0 = 1
            if (r1 == r0) goto L_0x0030
            r0 = 3
            if (r1 == r0) goto L_0x002d
            r0 = 5
            if (r1 == r0) goto L_0x002a
            r0 = 8388611(0x800003, float:1.1754948E-38)
            if (r1 == r0) goto L_0x0027
            r0 = 8388613(0x800005, float:1.175495E-38)
            if (r1 == r0) goto L_0x0024
            goto L_0x0003
        L_0x001e:
            X.422 r0 = X.AnonymousClass422.TEXT_START
            return r0
        L_0x0021:
            X.422 r0 = X.AnonymousClass422.TEXT_END
            return r0
        L_0x0024:
            X.422 r0 = X.AnonymousClass422.LAYOUT_END
            return r0
        L_0x0027:
            X.422 r0 = X.AnonymousClass422.LAYOUT_START
            return r0
        L_0x002a:
            X.422 r0 = X.AnonymousClass422.RIGHT
            return r0
        L_0x002d:
            X.422 r0 = X.AnonymousClass422.LEFT
            return r0
        L_0x0030:
            X.422 r0 = X.AnonymousClass422.CENTER
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3BY.A00(int, int):X.422");
    }

    public static AnonymousClass3HU A01(Context context) {
        AnonymousClass3HU r3;
        TypedArray typedArray;
        TypedArray typedArray2;
        TypedArray typedArray3;
        TypedArray typedArray4;
        Resources.Theme theme = context.getTheme();
        WeakHashMap weakHashMap = A01;
        synchronized (weakHashMap) {
            r3 = (AnonymousClass3HU) weakHashMap.get(theme);
        }
        if (r3 == null) {
            r3 = new AnonymousClass3HU();
            C89644cb.A01("LoadTextStyle");
            Resources.Theme theme2 = context.getTheme();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 <= 22) {
                synchronized (theme2) {
                    typedArray = context.obtainStyledAttributes((AttributeSet) null, C82024Au.A01, 0, 0);
                }
            } else {
                typedArray = context.obtainStyledAttributes((AttributeSet) null, C82024Au.A01, 0, 0);
            }
            int resourceId = typedArray.getResourceId(0, -1);
            typedArray.recycle();
            if (resourceId != -1) {
                if (i2 <= 22) {
                    synchronized (theme2) {
                        typedArray4 = theme2.obtainStyledAttributes(resourceId, C82024Au.A00);
                    }
                } else {
                    typedArray4 = theme2.obtainStyledAttributes(resourceId, C82024Au.A00);
                }
                A02(typedArray4, r3);
                typedArray4.recycle();
            }
            if (i2 <= 22) {
                synchronized (theme2) {
                    typedArray2 = context.obtainStyledAttributes((AttributeSet) null, C82024Au.A02, 0, 0);
                }
            } else {
                typedArray2 = context.obtainStyledAttributes((AttributeSet) null, C82024Au.A02, 0, 0);
            }
            int resourceId2 = typedArray2.getResourceId(0, -1);
            typedArray2.recycle();
            if (resourceId2 != -1) {
                if (i2 <= 22) {
                    synchronized (theme2) {
                        typedArray3 = theme2.obtainStyledAttributes(resourceId2, C82024Au.A00);
                    }
                } else {
                    typedArray3 = theme2.obtainStyledAttributes(resourceId2, C82024Au.A00);
                }
                A02(typedArray3, r3);
                typedArray3.recycle();
            }
            C89644cb.A00();
            synchronized (weakHashMap) {
                weakHashMap.put(theme, r3);
            }
        }
        return r3.A00();
    }

    public static void A02(TypedArray typedArray, AnonymousClass3HU r10) {
        int indexCount = typedArray.getIndexCount();
        int i2 = 1;
        int i3 = 0;
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = typedArray.getIndex(i4);
            if (index == 2) {
                r10.A0Q = typedArray.getColorStateList(index);
                r10.A0N = 0;
            } else if (index == 0) {
                r10.A0O = typedArray.getDimensionPixelSize(index, 0);
            } else if (index == 5) {
                int integer = typedArray.getInteger(index, 0);
                if (integer > 0) {
                    r10.A0S = A02[integer - 1];
                }
            } else if (index == 25) {
                if (Build.VERSION.SDK_INT >= 17) {
                    i2 = typedArray.getInt(index, -1);
                    r10.A0U = A00(i2, i3);
                }
            } else if (index == 6) {
                i3 = typedArray.getInt(index, -1);
                r10.A0U = A00(i2, i3);
                int i5 = i3 & 112;
                r10.A0V = i5 != 16 ? (i5 == 48 || i5 != 80) ? AnonymousClass41S.TOP : AnonymousClass41S.BOTTOM : AnonymousClass41S.CENTER;
            } else if (index == 15) {
                r10.A0X = typedArray.getBoolean(index, false);
            } else if (index == 11) {
                r10.A0K = typedArray.getInteger(index, -1);
            } else if (index == 10) {
                r10.A0H = typedArray.getInteger(index, -1);
            } else if (index == 14) {
                r10.A0Y = typedArray.getBoolean(index, false);
            } else if (index == 4) {
                r10.A0D = typedArray.getColor(index, 0);
            } else if (index == 3) {
                r10.A09 = typedArray.getColor(index, 0);
            } else if (index == 1) {
                r10.A0P = typedArray.getInteger(index, 0);
            } else if (index == 20) {
                r10.A04 = (float) typedArray.getDimensionPixelOffset(index, 0);
            } else if (index == 21) {
                r10.A03 = typedArray.getFloat(index, 0.0f);
            } else if (index == 17) {
                r10.A05 = typedArray.getFloat(index, 0.0f);
            } else if (index == 18) {
                r10.A06 = typedArray.getFloat(index, 0.0f);
            } else if (index == 19) {
                r10.A07 = typedArray.getFloat(index, 0.0f);
            } else if (index == 16) {
                r10.A0M = typedArray.getColor(index, 0);
            } else if (index == 13) {
                r10.A0J = typedArray.getInteger(index, -1);
            } else if (index == 12) {
                r10.A0G = typedArray.getInteger(index, -1);
            } else if (index == 8) {
                r10.A0L = typedArray.getDimensionPixelSize(index, 0);
            } else if (index == 7) {
                r10.A0I = typedArray.getDimensionPixelSize(index, Integer.MAX_VALUE);
            } else if (index == 24) {
                String string = typedArray.getString(index);
                if (string != null) {
                    r10.A0R = Typeface.create(string, 0);
                }
            } else if (index == 26) {
                if (Build.VERSION.SDK_INT >= 23) {
                    r10.A08 = typedArray.getInt(index, 0);
                }
            } else if (index == 27) {
                if (Build.VERSION.SDK_INT >= 23) {
                    r10.A0B = typedArray.getInt(index, 0);
                }
            } else if (index == 28 && Build.VERSION.SDK_INT >= 26) {
                r10.A0C = typedArray.getInt(index, 0);
            }
        }
    }
}
