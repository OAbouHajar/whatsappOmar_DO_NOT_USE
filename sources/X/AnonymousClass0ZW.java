package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* renamed from: X.0ZW  reason: invalid class name */
public class AnonymousClass0ZW implements C13250li {
    public static Method A0N;
    public static Method A0O;
    public static Method A0P;
    public int A00 = 0;
    public int A01;
    public int A02;
    public int A03 = -2;
    public Context A04;
    public DataSetObserver A05;
    public Rect A06;
    public View A07;
    public AdapterView.OnItemClickListener A08;
    public ListAdapter A09;
    public PopupWindow A0A;
    public AnonymousClass0CV A0B;
    public Runnable A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public final Rect A0H = AnonymousClass000.A0J();
    public final Handler A0I;
    public final C09300fH A0J = new C09300fH(this);
    public final AnonymousClass0Z0 A0K = new AnonymousClass0Z0(this);
    public final C06930Ym A0L = new C06930Ym(this);
    public final C09310fI A0M = new C09310fI(this);

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            Class<PopupWindow> cls = PopupWindow.class;
            try {
                A0O = AnonymousClass000.A0t(cls, Boolean.TYPE, "setClipToScreenEnabled", new Class[1], 0);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                A0P = AnonymousClass000.A0t(PopupWindow.class, Rect.class, "setEpicenterBounds", new Class[1], 0);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            Class<PopupWindow> cls2 = PopupWindow.class;
            try {
                Class[] clsArr = new Class[3];
                clsArr[0] = View.class;
                clsArr[1] = Integer.TYPE;
                A0N = AnonymousClass000.A0t(cls2, Boolean.TYPE, "getMaxAvailableHeight", clsArr, 2);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public AnonymousClass0ZW(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.A04 = context;
        this.A0I = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass05L.A0D, i2, i3);
        this.A01 = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.A02 = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.A0D = true;
        }
        obtainStyledAttributes.recycle();
        AnonymousClass0CY r0 = new AnonymousClass0CY(context, attributeSet, i2, i3);
        this.A0A = r0;
        r0.setInputMethodMode(1);
    }

    public AnonymousClass0CV A00(Context context, boolean z2) {
        return new AnonymousClass0CV(context, z2);
    }

    public void A01(int i2) {
        Drawable background = this.A0A.getBackground();
        if (background != null) {
            Rect rect = this.A0H;
            background.getPadding(rect);
            this.A03 = rect.left + rect.right + i2;
            return;
        }
        this.A03 = i2;
    }

    public Drawable AA0() {
        return this.A0A.getBackground();
    }

    public int ACe() {
        return this.A01;
    }

    public ListView ADA() {
        return this.A0B;
    }

    public int AGt() {
        if (!this.A0D) {
            return 0;
        }
        return this.A02;
    }

    public boolean AJh() {
        return this.A0A.isShowing();
    }

    public void AdW(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.A05;
        if (dataSetObserver == null) {
            this.A05 = new AnonymousClass0AN(this);
        } else {
            ListAdapter listAdapter2 = this.A09;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.A09 = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.A05);
        }
        AnonymousClass0CV r1 = this.A0B;
        if (r1 != null) {
            r1.setAdapter(this.A09);
        }
    }

    public void Adb(Drawable drawable) {
        this.A0A.setBackgroundDrawable(drawable);
    }

    public void Ae1(int i2) {
        this.A01 = i2;
    }

    public void Aex(int i2) {
        this.A02 = i2;
        this.A0D = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0117  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AfT() {
        /*
            r19 = this;
            r3 = r19
            X.0CV r0 = r3.A0B
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r11 = 1
            if (r0 != 0) goto L_0x0080
            android.content.Context r1 = r3.A04
            X.0fG r0 = new X.0fG
            r0.<init>(r3)
            r3.A0C = r0
            boolean r0 = r3.A0E
            r0 = r0 ^ 1
            X.0CV r1 = r3.A00(r1, r0)
            r3.A0B = r1
            android.widget.ListAdapter r0 = r3.A09
            r1.setAdapter(r0)
            X.0CV r1 = r3.A0B
            android.widget.AdapterView$OnItemClickListener r0 = r3.A08
            r1.setOnItemClickListener(r0)
            X.0CV r0 = r3.A0B
            r0.setFocusable(r11)
            X.0CV r0 = r3.A0B
            r0.setFocusableInTouchMode(r11)
            X.0CV r4 = r3.A0B
            r1 = 0
            com.facebook.redex.IDxSListenerShape318S0100000_I1 r0 = new com.facebook.redex.IDxSListenerShape318S0100000_I1
            r0.<init>(r3, r1)
            r4.setOnItemSelectedListener(r0)
            X.0CV r1 = r3.A0B
            X.0Z0 r0 = r3.A0K
            r1.setOnScrollListener(r0)
            X.0CV r0 = r3.A0B
            r12 = 0
            android.widget.PopupWindow r13 = r3.A0A
            r13.setContentView(r0)
        L_0x004d:
            android.graphics.drawable.Drawable r0 = r13.getBackground()
            android.graphics.Rect r7 = r3.A0H
            if (r0 == 0) goto L_0x007b
            r0.getPadding(r7)
            int r1 = r7.top
            int r4 = r7.bottom
            int r4 = r4 + r1
            boolean r0 = r3.A0D
            if (r0 != 0) goto L_0x0064
            int r0 = -r1
            r3.A02 = r0
        L_0x0064:
            int r0 = r13.getInputMethodMode()
            r10 = 2
            if (r0 == r10) goto L_0x006c
            r11 = 0
        L_0x006c:
            android.view.View r9 = r3.A07
            int r8 = r3.A02
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 > r0) goto L_0x00a1
            java.lang.reflect.Method r5 = A0N
            if (r5 == 0) goto L_0x00ad
            goto L_0x0087
        L_0x007b:
            r7.setEmpty()
            r4 = 0
            goto L_0x0064
        L_0x0080:
            android.widget.PopupWindow r13 = r3.A0A
            r13.getContentView()
            r12 = 0
            goto L_0x004d
        L_0x0087:
            r0 = 3
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x00a6 }
            r1[r12] = r9     // Catch:{ Exception -> 0x00a6 }
            r0 = 1
            X.AnonymousClass000.A1M(r1, r8, r0)     // Catch:{ Exception -> 0x00a6 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)     // Catch:{ Exception -> 0x00a6 }
            r1[r10] = r0     // Catch:{ Exception -> 0x00a6 }
            java.lang.Object r0 = r5.invoke(r13, r1)     // Catch:{ Exception -> 0x00a6 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x00a6 }
            int r5 = r0.intValue()     // Catch:{ Exception -> 0x00a6 }
            goto L_0x00b1
        L_0x00a1:
            int r5 = r13.getMaxAvailableHeight(r9, r8, r11)
            goto L_0x00b1
        L_0x00a6:
            java.lang.String r1 = "ListPopupWindow"
            java.lang.String r0 = "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version."
            android.util.Log.i(r1, r0)
        L_0x00ad:
            int r5 = r13.getMaxAvailableHeight(r9, r8)
        L_0x00b1:
            int r1 = r3.A03
            r0 = -2
            if (r1 == r0) goto L_0x01b2
            r6 = 1073741824(0x40000000, float:2.0)
            if (r1 == r2) goto L_0x01b2
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r6)
        L_0x00be:
            X.0CV r0 = r3.A0B
            r6 = -1
            int r5 = r0.A00(r1, r5)
            if (r5 <= 0) goto L_0x00d6
            X.0CV r0 = r3.A0B
            int r1 = r0.getPaddingTop()
            X.0CV r0 = r3.A0B
            int r0 = r0.getPaddingBottom()
            int r1 = r1 + r0
            int r4 = r4 + r1
            int r12 = r12 + r4
        L_0x00d6:
            int r5 = r5 + r12
            r13.getInputMethodMode()
            r0 = 1002(0x3ea, float:1.404E-42)
            X.AnonymousClass0Vw.A01(r13, r0)
            boolean r0 = r13.isShowing()
            r4 = 1
            r2 = -2
            r7 = 0
            if (r0 == 0) goto L_0x0117
            android.view.View r0 = r3.A07
            boolean r0 = X.C004601z.A0t(r0)
            if (r0 == 0) goto L_0x010d
            int r1 = r3.A03
            if (r1 != r6) goto L_0x010e
            r1 = -1
        L_0x00f5:
            r13.setOutsideTouchable(r4)
            android.view.View r14 = r3.A07
            int r15 = r3.A01
            int r0 = r3.A02
            if (r1 >= 0) goto L_0x0101
            r1 = -1
        L_0x0101:
            if (r5 >= 0) goto L_0x0104
            r5 = -1
        L_0x0104:
            r16 = r0
            r17 = r1
            r18 = r5
            r13.update(r14, r15, r16, r17, r18)
        L_0x010d:
            return
        L_0x010e:
            if (r1 != r2) goto L_0x00f5
            android.view.View r0 = r3.A07
            int r1 = r0.getWidth()
            goto L_0x00f5
        L_0x0117:
            int r0 = r3.A03
            if (r0 != r6) goto L_0x012e
            r0 = -1
        L_0x011c:
            r13.setWidth(r0)
            r13.setHeight(r5)
            r5 = 1
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 > r0) goto L_0x0143
            java.lang.reflect.Method r2 = A0O
            if (r2 == 0) goto L_0x014e
            goto L_0x0137
        L_0x012e:
            if (r0 != r2) goto L_0x011c
            android.view.View r0 = r3.A07
            int r0 = r0.getWidth()
            goto L_0x011c
        L_0x0137:
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0147 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)     // Catch:{ Exception -> 0x0147 }
            r1[r7] = r0     // Catch:{ Exception -> 0x0147 }
            r2.invoke(r13, r1)     // Catch:{ Exception -> 0x0147 }
            goto L_0x014e
        L_0x0143:
            r13.setIsClippedToScreen(r4)
            goto L_0x014e
        L_0x0147:
            java.lang.String r1 = "ListPopupWindow"
            java.lang.String r0 = "Could not call setClipToScreenEnabled() on PopupWindow. Oh well."
            android.util.Log.i(r1, r0)
        L_0x014e:
            r13.setOutsideTouchable(r4)
            X.0Ym r0 = r3.A0L
            r13.setTouchInterceptor(r0)
            boolean r0 = r3.A0G
            if (r0 == 0) goto L_0x015f
            boolean r0 = r3.A0F
            X.AnonymousClass0Vw.A02(r13, r0)
        L_0x015f:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 > r0) goto L_0x017c
            java.lang.reflect.Method r2 = A0P
            if (r2 == 0) goto L_0x0181
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0173 }
            android.graphics.Rect r0 = r3.A06     // Catch:{ Exception -> 0x0173 }
            r1[r7] = r0     // Catch:{ Exception -> 0x0173 }
            r2.invoke(r13, r1)     // Catch:{ Exception -> 0x0173 }
            goto L_0x0181
        L_0x0173:
            r2 = move-exception
            java.lang.String r1 = "ListPopupWindow"
            java.lang.String r0 = "Could not invoke setEpicenterBounds on PopupWindow"
            android.util.Log.e(r1, r0, r2)
            goto L_0x0181
        L_0x017c:
            android.graphics.Rect r0 = r3.A06
            r13.setEpicenterBounds(r0)
        L_0x0181:
            android.view.View r4 = r3.A07
            int r2 = r3.A01
            int r1 = r3.A02
            int r0 = r3.A00
            X.AnonymousClass0Vw.A00(r4, r13, r2, r1, r0)
            X.0CV r0 = r3.A0B
            r0.setSelection(r6)
            boolean r0 = r3.A0E
            if (r0 == 0) goto L_0x019d
            X.0CV r0 = r3.A0B
            boolean r0 = r0.isInTouchMode()
            if (r0 == 0) goto L_0x01a6
        L_0x019d:
            X.0CV r0 = r3.A0B
            if (r0 == 0) goto L_0x01a6
            r0.A0B = r5
            r0.requestLayout()
        L_0x01a6:
            boolean r0 = r3.A0E
            if (r0 != 0) goto L_0x010d
            android.os.Handler r1 = r3.A0I
            X.0fH r0 = r3.A0J
            r1.post(r0)
            return
        L_0x01b2:
            android.content.Context r0 = r3.A04
            android.util.DisplayMetrics r0 = X.AnonymousClass000.A0M(r0)
            int r2 = r0.widthPixels
            int r1 = r7.left
            int r0 = r7.right
            int r1 = r1 + r0
            int r2 = r2 - r1
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r6)
            goto L_0x00be
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0ZW.AfT():void");
    }

    public void dismiss() {
        PopupWindow popupWindow = this.A0A;
        popupWindow.dismiss();
        popupWindow.setContentView((View) null);
        this.A0B = null;
        this.A0I.removeCallbacks(this.A0M);
    }
}
