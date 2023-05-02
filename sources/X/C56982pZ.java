package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageButton;
import com.obwhatsapp.emoji.EmojiDescriptor;
import com.whatsapp.util.ViewOnClickCListenerShape0S0301000_I1;
import com.whatsapp.util.ViewOnClickCListenerShape1S0300000_I1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.2pZ  reason: invalid class name and case insensitive filesystem */
public class C56982pZ extends PopupWindow {
    public int A00 = -1;
    public int A01 = -1;
    public final Context A02;
    public final Resources A03;
    public final Drawable A04;
    public final Drawable A05;
    public final Drawable A06;
    public final LinearLayout A07;
    public final C61733Ac A08;
    public final C108715Pb A09;
    public final C17250um A0A;
    public final int[] A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56982pZ(View view, C108715Pb r22, C17250um r23, int[] iArr) {
        super(new LinearLayout(view.getContext()), -2, -2);
        int i2;
        boolean z2;
        Drawable[] drawableArr;
        Drawable[] drawableArr2;
        LinearLayout linearLayout = (LinearLayout) getContentView();
        this.A07 = linearLayout;
        Context context = view.getContext();
        this.A02 = context;
        C17250um r6 = r23;
        this.A0A = r6;
        this.A03 = context.getResources();
        int[] iArr2 = (int[]) iArr.clone();
        C61733Ac r8 = new C61733Ac(C62153Bw.A05(iArr));
        int i3 = 2;
        char c2 = 1;
        if (r8.A01().size() == 2) {
            List list = r8.A01;
            this.A00 = 0 < list.size() ? AnonymousClass000.A0D(((Pair) list.get(0)).second) : -1;
            this.A01 = 1 < list.size() ? AnonymousClass000.A0D(((Pair) list.get(1)).second) : -1;
        }
        int[] A072 = C62153Bw.A07(iArr2);
        this.A0B = A072;
        this.A08 = new C61733Ac(C62153Bw.A05(A072));
        this.A09 = r22;
        LayoutInflater A012 = AnonymousClass01V.A01(context);
        AnonymousClass00B.A06(A012);
        A012.inflate(R.layout.layout03f0, linearLayout, true);
        linearLayout.setOrientation(1);
        ViewGroup A0K = C13690nt.A0K(linearLayout, R.id.skin_tone_selector);
        AnonymousClass00B.A04(A0K);
        int[] iArr3 = C62153Bw.A05;
        Drawable A022 = A02(iArr3[0]);
        Drawable A062 = A022 == null ? null : AnonymousClass2SR.A06(A022, C13680ns.A0D(this.A07).getColor(R.color.color01ef));
        this.A05 = A062;
        Drawable A032 = A03(iArr3[0]);
        Drawable A063 = A032 == null ? null : AnonymousClass2SR.A06(A032, C13680ns.A0D(this.A07).getColor(R.color.color01ef));
        this.A06 = A063;
        AnonymousClass00B.A06(A062);
        AnonymousClass00B.A06(A063);
        C434420a r12 = new C434420a(AnonymousClass45T.A00((Collection) this.A08.A00.get(0)));
        this.A04 = this.A0A.A05(this.A03, r12, EmojiDescriptor.A00(r12, false));
        int length = iArr3.length;
        ArrayList A0i = C13690nt.A0i(length);
        int i4 = 0;
        while (true) {
            i2 = 3;
            if (i4 >= length) {
                break;
            }
            int i5 = iArr3[i4];
            WaImageButton waImageButton = (WaImageButton) A012.inflate(R.layout.layout03f1, A0K, false);
            Drawable A023 = A02(i5);
            AnonymousClass00B.A06(A023);
            Drawable drawable = this.A04;
            if (drawable == null) {
                drawableArr2 = new Drawable[2];
                drawableArr2[0] = A023;
                drawableArr2[c2] = this.A06;
            } else {
                drawableArr2 = new Drawable[3];
                drawableArr2[0] = A023;
                drawableArr2[c2] = this.A06;
                drawableArr2[2] = drawable;
            }
            String A013 = A01(this.A02, this.A0B, i5, -1);
            Resources resources = this.A03;
            Bitmap A002 = C435120i.A00(drawableArr2);
            waImageButton.setImageDrawable(A002 != null ? new BitmapDrawable(resources, A002) : null);
            waImageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
            waImageButton.setContentDescription(A013);
            waImageButton.setSelected(AnonymousClass000.A1R(i5, this.A00));
            waImageButton.setOnClickListener(new ViewOnClickCListenerShape0S0301000_I1(this, waImageButton, A0i, i5, 0));
            A0K.addView(waImageButton);
            A0i.add(waImageButton);
            i4++;
            c2 = 1;
        }
        ArrayList A0i2 = C13690nt.A0i(length);
        int i6 = 0;
        while (i6 < length) {
            int i7 = iArr3[i6];
            WaImageButton waImageButton2 = (WaImageButton) A012.inflate(R.layout.layout03f1, A0K, false);
            Drawable A033 = A03(i7);
            AnonymousClass00B.A06(A033);
            Drawable drawable2 = this.A04;
            if (drawable2 == null) {
                drawableArr = new Drawable[i3];
                drawableArr[0] = this.A05;
                z2 = true;
                drawableArr[1] = A033;
            } else {
                z2 = true;
                drawableArr = new Drawable[i2];
                drawableArr[0] = this.A05;
                drawableArr[1] = A033;
                drawableArr[2] = drawable2;
            }
            String A014 = A01(this.A02, this.A0B, -1, i7);
            Resources resources2 = this.A03;
            Bitmap A003 = C435120i.A00(drawableArr);
            waImageButton2.setImageDrawable(A003 != null ? new BitmapDrawable(resources2, A003) : null);
            waImageButton2.setScaleType(ImageView.ScaleType.FIT_CENTER);
            waImageButton2.setContentDescription(A014);
            if (i7 != this.A01) {
                z2 = false;
            }
            waImageButton2.setSelected(z2);
            waImageButton2.setOnClickListener(new ViewOnClickCListenerShape0S0301000_I1(this, waImageButton2, A0i2, i7, 1));
            A0K.addView(waImageButton2);
            A0i2.add(waImageButton2);
            i6++;
            i2 = 3;
            i3 = 2;
        }
        ImageView A0K2 = C13680ns.A0K(this.A07, R.id.default_emoji);
        AnonymousClass00B.A04(A0K2);
        A0K2.setImageDrawable(r6.A04(view.getResources(), new C434420a(this.A0B), 1.0f, -1));
        A0K2.setContentDescription(C37781pj.A00(this.A0B));
        C34331k5.A01(A0K2, this, 0);
        A04();
        this.A07.setFocusableInTouchMode(true);
        this.A07.setFocusable(true);
        C13680ns.A12(this.A07);
        setTouchable(true);
        setFocusable(true);
        setOutsideTouchable(true);
        setInputMethodMode(i3);
        setBackgroundDrawable(AnonymousClass2SR.A02(view.getContext(), R.drawable.panel, R.color.color0727));
        this.A07.requestFocus();
        view.getParent().requestDisallowInterceptTouchEvent(true);
    }

    public static int A00(int i2) {
        switch (i2) {
            case 127995:
                return R.string.str0785;
            case 127996:
                return R.string.str0788;
            case 127997:
                return R.string.str0786;
            case 127998:
                return R.string.str0787;
            case 127999:
                return R.string.str0784;
            default:
                throw AnonymousClass000.A0T(C13680ns.A0c(i2, "Invalid skin tone: "));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        if (r9 == -1) goto L_0x0008;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A01(android.content.Context r6, int[] r7, int r8, int r9) {
        /*
            r5 = 0
            r4 = 1
            r1 = -1
            if (r8 == r1) goto L_0x0008
            r0 = 0
            if (r9 != r1) goto L_0x0009
        L_0x0008:
            r0 = 1
        L_0x0009:
            X.AnonymousClass00B.A0G(r0)
            java.lang.String r3 = X.C37781pj.A00(r7)
            r0 = 2
            if (r8 == r1) goto L_0x0027
            r2 = 2131888009(0x7f120789, float:1.9410641E38)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r1[r5] = r3
            int r0 = A00(r8)
        L_0x001e:
            java.lang.String r0 = r6.getString(r0)
            java.lang.String r0 = X.C13680ns.A0d(r6, r0, r1, r4, r2)
            return r0
        L_0x0027:
            if (r9 == r1) goto L_0x0035
            r2 = 2131888010(0x7f12078a, float:1.9410643E38)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r1[r5] = r3
            int r0 = A00(r9)
            goto L_0x001e
        L_0x0035:
            r0 = 2131888011(0x7f12078b, float:1.9410645E38)
            java.lang.String r0 = r6.getString(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56982pZ.A01(android.content.Context, int[], int, int):java.lang.String");
    }

    public final Drawable A02(int i2) {
        C434420a r4 = new C434420a(this.A08.A00(1, i2).A02());
        return this.A0A.A05(this.A03, r4, EmojiDescriptor.A00(r4, false));
    }

    public final Drawable A03(int i2) {
        C434420a r4 = new C434420a(this.A08.A00(2, i2).A02());
        return this.A0A.A05(this.A03, r4, EmojiDescriptor.A00(r4, false));
    }

    public final void A04() {
        String A012;
        int i2;
        ImageView A0K = C13680ns.A0K(this.A07, R.id.selected_emoji);
        AnonymousClass00B.A04(A0K);
        Drawable drawable = this.A04;
        int i3 = 2;
        if (drawable != null) {
            i3 = 3;
        }
        Drawable[] drawableArr = new Drawable[i3];
        int i4 = this.A00;
        drawableArr[0] = i4 == -1 ? this.A05 : A02(i4);
        int i5 = this.A01;
        drawableArr[1] = i5 == -1 ? this.A06 : A03(i5);
        if (drawable != null) {
            drawableArr[2] = drawable;
        }
        Resources resources = this.A03;
        Bitmap A002 = C435120i.A00(drawableArr);
        A0K.setImageDrawable(A002 != null ? new BitmapDrawable(resources, A002) : null);
        A0K.setBackgroundResource(R.drawable.multi_skin_tone_emoji_selector);
        int i6 = this.A00;
        if (i6 == -1 || (i2 = this.A01) == -1) {
            A0K.setOnClickListener((View.OnClickListener) null);
            A012 = A01(this.A02, this.A0B, this.A00, this.A01);
        } else {
            int[] A022 = this.A08.A00(1, i6).A00(2, i2).A02();
            A0K.setOnClickListener(new ViewOnClickCListenerShape1S0300000_I1(this, A022, A0K, 0));
            A012 = C37781pj.A00(A022);
        }
        A0K.setContentDescription(A012);
    }
}
