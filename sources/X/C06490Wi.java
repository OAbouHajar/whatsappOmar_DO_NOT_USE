package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.facebook.redex.IDxCListenerShape132S0100000_I1;
import com.obwhatsapp.R;

/* renamed from: X.0Wi  reason: invalid class name and case insensitive filesystem */
public class C06490Wi {
    public int A00;
    public int A01 = -1;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public Drawable A07;
    public Handler A08;
    public Message A09;
    public Message A0A;
    public Message A0B;
    public View A0C;
    public View A0D;
    public Button A0E;
    public Button A0F;
    public Button A0G;
    public ImageView A0H;
    public ListAdapter A0I;
    public ListView A0J;
    public TextView A0K;
    public TextView A0L;
    public NestedScrollView A0M;
    public CharSequence A0N;
    public CharSequence A0O;
    public CharSequence A0P;
    public CharSequence A0Q;
    public CharSequence A0R;
    public boolean A0S;
    public final Context A0T;
    public final View.OnClickListener A0U = new IDxCListenerShape132S0100000_I1(this, 0);
    public final Window A0V;
    public final C005802m A0W;

    public C06490Wi(Context context, Window window, C005802m r7) {
        this.A0T = context;
        this.A0W = r7;
        this.A0V = window;
        this.A08 = new AnonymousClass0BH(r7);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, AnonymousClass05L.A04, R.attr.attr0032, 0);
        this.A00 = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.A03 = obtainStyledAttributes.getResourceId(4, 0);
        this.A04 = obtainStyledAttributes.getResourceId(5, 0);
        this.A05 = obtainStyledAttributes.getResourceId(7, 0);
        this.A02 = obtainStyledAttributes.getResourceId(3, 0);
        this.A0S = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        r7.A01();
    }

    public static final ViewGroup A00(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public static void A01(View view, View view2, View view3) {
        int i2 = 0;
        if (view2 != null) {
            int i3 = 4;
            if (view.canScrollVertically(-1)) {
                i3 = 0;
            }
            view2.setVisibility(i3);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i2 = 4;
            }
            view3.setVisibility(i2);
        }
    }

    public static boolean A02(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (childCount > 0) {
                childCount--;
                if (A02(viewGroup.getChildAt(childCount))) {
                }
            }
        }
        return false;
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0144, code lost:
        if (r9.getVisibility() == 8) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0043, code lost:
        if (r11 != null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004a, code lost:
        if (A02(r11) == false) goto L_0x004c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x02c9  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03() {
        /*
            r13 = this;
            int r1 = r13.A00
            X.02m r0 = r13.A0W
            r0.setContentView((int) r1)
            android.view.Window r6 = r13.A0V
            r0 = 2131365003(0x7f0a0c8b, float:1.834986E38)
            android.view.View r1 = r6.findViewById(r0)
            r2 = 2131366682(0x7f0a131a, float:1.8353264E38)
            android.view.View r7 = r1.findViewById(r2)
            r9 = 2131362934(0x7f0a0476, float:1.8345663E38)
            android.view.View r4 = r1.findViewById(r9)
            r8 = 2131362439(0x7f0a0287, float:1.8344659E38)
            android.view.View r3 = r1.findViewById(r8)
            r0 = 2131363040(0x7f0a04e0, float:1.8345878E38)
            android.view.View r5 = r1.findViewById(r0)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            android.view.View r11 = r13.A0D
            r10 = 0
            if (r11 != 0) goto L_0x0045
            int r0 = r13.A06
            if (r0 == 0) goto L_0x033c
            android.content.Context r0 = r13.A0T
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            int r0 = r13.A06
            android.view.View r11 = r1.inflate(r0, r5, r10)
            if (r11 == 0) goto L_0x004c
        L_0x0045:
            r10 = 1
            boolean r0 = A02(r11)
            if (r0 != 0) goto L_0x031b
        L_0x004c:
            r0 = 131072(0x20000, float:1.83671E-40)
            r6.setFlags(r0, r0)
            if (r10 != 0) goto L_0x031b
            r0 = 8
            r5.setVisibility(r0)
        L_0x0058:
            android.view.View r2 = r5.findViewById(r2)
            android.view.View r1 = r5.findViewById(r9)
            android.view.View r0 = r5.findViewById(r8)
            android.view.ViewGroup r9 = A00(r2, r7)
            android.view.ViewGroup r8 = A00(r1, r4)
            android.view.ViewGroup r7 = A00(r0, r3)
            r0 = 2131365898(0x7f0a100a, float:1.8351674E38)
            android.view.View r0 = r6.findViewById(r0)
            androidx.core.widget.NestedScrollView r0 = (androidx.core.widget.NestedScrollView) r0
            r13.A0M = r0
            r1 = 0
            r0.setFocusable(r1)
            androidx.core.widget.NestedScrollView r0 = r13.A0M
            r0.setNestedScrollingEnabled(r1)
            r0 = 16908299(0x102000b, float:2.387726E-38)
            android.view.View r1 = r8.findViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r13.A0K = r1
            if (r1 == 0) goto L_0x0098
            java.lang.CharSequence r0 = r13.A0Q
            if (r0 == 0) goto L_0x02e8
            r1.setText(r0)
        L_0x0098:
            r0 = 16908313(0x1020019, float:2.38773E-38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r13.A0G = r0
            android.view.View$OnClickListener r10 = r13.A0U
            r0.setOnClickListener(r10)
            java.lang.CharSequence r0 = r13.A0P
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r4 = 1
            r3 = 8
            r2 = 0
            if (r0 == 0) goto L_0x02d9
            android.widget.Button r0 = r13.A0G
            r0.setVisibility(r3)
            r11 = 0
        L_0x00ba:
            r0 = 16908314(0x102001a, float:2.3877302E-38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r13.A0E = r0
            r0.setOnClickListener(r10)
            java.lang.CharSequence r0 = r13.A0N
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x02c9
            android.widget.Button r0 = r13.A0E
            r0.setVisibility(r3)
        L_0x00d5:
            r0 = 16908315(0x102001b, float:2.3877305E-38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r13.A0F = r0
            r0.setOnClickListener(r10)
            java.lang.CharSequence r0 = r13.A0O
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x02b9
            android.widget.Button r0 = r13.A0F
            r0.setVisibility(r3)
        L_0x00f0:
            android.content.Context r0 = r13.A0T
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r1 = r0.getTheme()
            r0 = 2130968625(0x7f040031, float:1.7545909E38)
            r1.resolveAttribute(r0, r2, r4)
            int r0 = r2.data
            if (r0 == 0) goto L_0x02b2
            if (r11 != r4) goto L_0x02a4
            android.widget.Button r2 = r13.A0G
        L_0x0109:
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            r1.gravity = r4
            r0 = 1056964608(0x3f000000, float:0.5)
            r1.weight = r0
            r2.setLayoutParams(r1)
        L_0x0118:
            android.view.View r0 = r13.A0C
            if (r0 == 0) goto L_0x0238
            r1 = -1
            r0 = -2
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            r2.<init>(r1, r0)
            android.view.View r1 = r13.A0C
            r0 = 0
            r9.addView(r1, r0, r2)
            r0 = 2131366657(0x7f0a1301, float:1.8353214E38)
            android.view.View r0 = r6.findViewById(r0)
            r0.setVisibility(r3)
        L_0x0133:
            int r0 = r5.getVisibility()
            r2 = 1
            r10 = 0
            r12 = 0
            if (r0 == r3) goto L_0x013d
            r12 = 1
        L_0x013d:
            if (r9 == 0) goto L_0x0146
            int r0 = r9.getVisibility()
            r5 = 1
            if (r0 != r3) goto L_0x0147
        L_0x0146:
            r5 = 0
        L_0x0147:
            int r0 = r7.getVisibility()
            r11 = 1
            if (r0 != r3) goto L_0x015b
            r11 = 0
            r0 = 2131366589(0x7f0a12bd, float:1.8353076E38)
            android.view.View r0 = r8.findViewById(r0)
            if (r0 == 0) goto L_0x015b
            r0.setVisibility(r10)
        L_0x015b:
            if (r5 == 0) goto L_0x022f
            androidx.core.widget.NestedScrollView r0 = r13.A0M
            if (r0 == 0) goto L_0x0164
            r0.setClipToPadding(r2)
        L_0x0164:
            java.lang.CharSequence r0 = r13.A0Q
            if (r0 != 0) goto L_0x016c
            android.widget.ListView r0 = r13.A0J
            if (r0 == 0) goto L_0x0178
        L_0x016c:
            r0 = 2131366641(0x7f0a12f1, float:1.8353181E38)
            android.view.View r0 = r9.findViewById(r0)
        L_0x0173:
            if (r0 == 0) goto L_0x0178
            r0.setVisibility(r10)
        L_0x0178:
            android.widget.ListView r7 = r13.A0J
            boolean r0 = r7 instanceof androidx.appcompat.app.AlertController$RecycleListView
            if (r0 == 0) goto L_0x019b
            androidx.appcompat.app.AlertController$RecycleListView r7 = (androidx.appcompat.app.AlertController$RecycleListView) r7
            if (r11 == 0) goto L_0x0184
            if (r5 != 0) goto L_0x019b
        L_0x0184:
            int r4 = r7.getPaddingLeft()
            if (r5 == 0) goto L_0x022b
            int r3 = r7.getPaddingTop()
        L_0x018e:
            int r1 = r7.getPaddingRight()
            if (r11 == 0) goto L_0x0227
            int r0 = r7.getPaddingBottom()
        L_0x0198:
            r7.setPadding(r4, r3, r1, r0)
        L_0x019b:
            if (r12 != 0) goto L_0x01ca
            android.widget.ListView r7 = r13.A0J
            if (r7 != 0) goto L_0x01a5
            androidx.core.widget.NestedScrollView r7 = r13.A0M
            if (r7 == 0) goto L_0x01ca
        L_0x01a5:
            if (r11 == 0) goto L_0x01a8
            r10 = 2
        L_0x01a8:
            r5 = r5 | r10
            r0 = 2131365897(0x7f0a1009, float:1.8351672E38)
            android.view.View r3 = r6.findViewById(r0)
            r0 = 2131365896(0x7f0a1008, float:1.835167E38)
            android.view.View r4 = r6.findViewById(r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L_0x01e1
            X.C004601z.A0g(r7, r5)
        L_0x01c0:
            if (r3 == 0) goto L_0x01c5
            r8.removeView(r3)
        L_0x01c5:
            if (r4 == 0) goto L_0x01ca
            r8.removeView(r4)
        L_0x01ca:
            android.widget.ListView r3 = r13.A0J
            if (r3 == 0) goto L_0x01e0
            android.widget.ListAdapter r0 = r13.A0I
            if (r0 == 0) goto L_0x01e0
            r3.setAdapter(r0)
            int r1 = r13.A01
            r0 = -1
            if (r1 <= r0) goto L_0x01e0
            r3.setItemChecked(r1, r2)
            r3.setSelection(r1)
        L_0x01e0:
            return
        L_0x01e1:
            r1 = 0
            if (r3 == 0) goto L_0x01ec
            r0 = r5 & 1
            if (r0 != 0) goto L_0x01ec
            r8.removeView(r3)
            r3 = r1
        L_0x01ec:
            if (r4 == 0) goto L_0x01f6
            r0 = r5 & 2
            if (r0 != 0) goto L_0x01f6
            r8.removeView(r4)
            r4 = r1
        L_0x01f6:
            if (r3 != 0) goto L_0x01fa
            if (r4 == 0) goto L_0x01ca
        L_0x01fa:
            java.lang.CharSequence r0 = r13.A0Q
            if (r0 == 0) goto L_0x0210
            androidx.core.widget.NestedScrollView r1 = r13.A0M
            X.0bJ r0 = new X.0bJ
            r0.<init>(r3, r4, r13)
            r1.A0E = r0
            X.0ge r0 = new X.0ge
            r0.<init>(r3, r4, r13)
            r1.post(r0)
            goto L_0x01ca
        L_0x0210:
            android.widget.ListView r1 = r13.A0J
            if (r1 == 0) goto L_0x01c0
            X.0Z1 r0 = new X.0Z1
            r0.<init>(r3, r4, r13)
            r1.setOnScrollListener(r0)
            android.widget.ListView r1 = r13.A0J
            X.0gf r0 = new X.0gf
            r0.<init>(r3, r4, r13)
            r1.post(r0)
            goto L_0x01ca
        L_0x0227:
            int r0 = r7.A00
            goto L_0x0198
        L_0x022b:
            int r3 = r7.A01
            goto L_0x018e
        L_0x022f:
            r0 = 2131366590(0x7f0a12be, float:1.8353078E38)
            android.view.View r0 = r8.findViewById(r0)
            goto L_0x0173
        L_0x0238:
            r0 = 16908294(0x1020006, float:2.3877246E-38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r13.A0H = r0
            java.lang.CharSequence r0 = r13.A0R
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0290
            boolean r0 = r13.A0S
            if (r0 == 0) goto L_0x0290
            r0 = 2131361998(0x7f0a00ce, float:1.8343764E38)
            android.view.View r1 = r6.findViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r13.A0L = r1
            java.lang.CharSequence r0 = r13.A0R
            r1.setText(r0)
            android.graphics.drawable.Drawable r1 = r13.A07
            if (r1 == 0) goto L_0x026c
            android.widget.ImageView r0 = r13.A0H
            r0.setImageDrawable(r1)
            goto L_0x0133
        L_0x026c:
            android.widget.TextView r10 = r13.A0L
            android.widget.ImageView r0 = r13.A0H
            int r4 = r0.getPaddingLeft()
            android.widget.ImageView r0 = r13.A0H
            int r2 = r0.getPaddingTop()
            android.widget.ImageView r0 = r13.A0H
            int r1 = r0.getPaddingRight()
            android.widget.ImageView r0 = r13.A0H
            int r0 = r0.getPaddingBottom()
            r10.setPadding(r4, r2, r1, r0)
            android.widget.ImageView r0 = r13.A0H
            r0.setVisibility(r3)
            goto L_0x0133
        L_0x0290:
            r0 = 2131366657(0x7f0a1301, float:1.8353214E38)
            android.view.View r0 = r6.findViewById(r0)
            r0.setVisibility(r3)
            android.widget.ImageView r0 = r13.A0H
            r0.setVisibility(r3)
            r9.setVisibility(r3)
            goto L_0x0133
        L_0x02a4:
            r0 = 2
            if (r11 != r0) goto L_0x02ab
            android.widget.Button r2 = r13.A0E
            goto L_0x0109
        L_0x02ab:
            r0 = 4
            if (r11 != r0) goto L_0x02b2
            android.widget.Button r2 = r13.A0F
            goto L_0x0109
        L_0x02b2:
            if (r11 != 0) goto L_0x0118
            r7.setVisibility(r3)
            goto L_0x0118
        L_0x02b9:
            android.widget.Button r1 = r13.A0F
            java.lang.CharSequence r0 = r13.A0O
            r1.setText(r0)
            android.widget.Button r0 = r13.A0F
            r0.setVisibility(r2)
            r11 = r11 | 4
            goto L_0x00f0
        L_0x02c9:
            android.widget.Button r1 = r13.A0E
            java.lang.CharSequence r0 = r13.A0N
            r1.setText(r0)
            android.widget.Button r0 = r13.A0E
            r0.setVisibility(r2)
            r11 = r11 | 2
            goto L_0x00d5
        L_0x02d9:
            android.widget.Button r1 = r13.A0G
            java.lang.CharSequence r0 = r13.A0P
            r1.setText(r0)
            android.widget.Button r0 = r13.A0G
            r0.setVisibility(r2)
            r11 = 1
            goto L_0x00ba
        L_0x02e8:
            r2 = 8
            r1.setVisibility(r2)
            androidx.core.widget.NestedScrollView r1 = r13.A0M
            android.widget.TextView r0 = r13.A0K
            r1.removeView(r0)
            android.widget.ListView r0 = r13.A0J
            if (r0 == 0) goto L_0x0316
            androidx.core.widget.NestedScrollView r0 = r13.A0M
            android.view.ViewParent r4 = r0.getParent()
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            androidx.core.widget.NestedScrollView r0 = r13.A0M
            int r3 = r4.indexOfChild(r0)
            r4.removeViewAt(r3)
            android.widget.ListView r2 = r13.A0J
            r1 = -1
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r1, r1)
            r4.addView(r2, r3, r0)
            goto L_0x0098
        L_0x0316:
            r8.setVisibility(r2)
            goto L_0x0098
        L_0x031b:
            r0 = 2131363039(0x7f0a04df, float:1.8345876E38)
            android.view.View r10 = r6.findViewById(r0)
            android.widget.FrameLayout r10 = (android.widget.FrameLayout) r10
            r1 = -1
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r1, r1)
            r10.addView(r11, r0)
            android.widget.ListView r0 = r13.A0J
            if (r0 == 0) goto L_0x0058
            android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            r0 = 0
            r1.weight = r0
            goto L_0x0058
        L_0x033c:
            r11 = 0
            goto L_0x004c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06490Wi.A03():void");
    }
}
