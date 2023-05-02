package X;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxLListenerShape146S0100000_3_I1;
import com.facebook.redex.IDxTListenerShape33S0000000_3_I1;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.obwhatsapp.KeyboardPopupLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.components.Button;
import com.obwhatsapp.components.FloatingActionButton;
import com.obwhatsapp.payments.ui.widget.PaymentAmountInputField;
import java.util.List;

/* renamed from: X.5fm  reason: invalid class name and case insensitive filesystem */
public class C111325fm extends AnonymousClass2JI implements C1220468b {
    public int A00;
    public Handler A01;
    public View A02;
    public TextView A03;
    public ConstraintLayout A04;
    public RecyclerView A05;
    public ShimmerFrameLayout A06;
    public Button A07;
    public C35361lo A08;
    public C110875ey A09;
    public final ImageView A0A;
    public final TextView A0B;
    public final TextView A0C;
    public final TextView A0D;
    public final FloatingActionButton A0E;
    public final C209512f A0F;
    public final C209712h A0G;
    public final PaymentAmountInputField A0H;
    public final C1205762e A0I;
    public final C117685tO A0J;
    public final List A0K = AnonymousClass000.A0u();

    public C111325fm(Activity activity, ImageView imageView, TextView textView, TextView textView2, TextView textView3, C16300so r14, C15430qs r15, FloatingActionButton floatingActionButton, AnonymousClass01V r17, C15860rz r18, C209512f r19, C209712h r20, PaymentAmountInputField paymentAmountInputField, C1205762e r22, C117685tO r23, C23061Ai r24) {
        super(activity, r14, r15, r17, r18, r24);
        this.A0G = r20;
        this.A0F = r19;
        this.A0E = floatingActionButton;
        this.A0I = r22;
        this.A0H = paymentAmountInputField;
        this.A0B = textView;
        this.A0C = textView2;
        this.A0J = r23;
        this.A0D = textView3;
        this.A0A = imageView;
    }

    public static /* synthetic */ void A00(C111325fm r2) {
        r2.A06.setVisibility(8);
        r2.A05.setVisibility(8);
        r2.A03.setText(R.string.str0c8b);
        r2.A04.setVisibility(0);
        C110105dW.A0r(r2.A07, r2, 107);
    }

    public int A03(int i2) {
        return this.A00;
    }

    public void A06() {
        if (!isShowing()) {
            super.A06();
            C1205762e r1 = this.A0I;
            if (C23061Ai.A00(r1.A09)) {
                C15430qs r8 = this.A05;
                KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) r8;
                keyboardPopupLayout.A06 = true;
                InputMethodManager A0Q = this.A06.A0Q();
                AnonymousClass00B.A06(A0Q);
                if (!A0Q.hideSoftInputFromWindow(r1.A09.getWindowToken(), 0, new AnonymousClass3M6(AnonymousClass000.A0L(), new C1210764c(this), this.A0A))) {
                    keyboardPopupLayout.A06 = false;
                    ((View) r8).requestLayout();
                    return;
                }
                return;
            }
            A0A();
        }
    }

    public final void A0A() {
        A05();
        if (this.A02 == null) {
            Activity activity = this.A03;
            LinearLayout linearLayout = new LinearLayout(activity);
            View inflate = activity.getLayoutInflater().inflate(R.layout.layout027c, linearLayout, true);
            this.A02 = inflate;
            C110105dW.A0r(C004601z.A0E(inflate, R.id.close_button), this, AnonymousClass2EA.A03);
            this.A03 = C13680ns.A0L(this.A02, R.id.themes_title);
            this.A05 = (RecyclerView) C004601z.A0E(this.A02, R.id.expressive_themes_list);
            C110875ey r1 = new C110875ey(this.A0F, this.A0G, this);
            this.A09 = r1;
            this.A05.setAdapter(r1);
            this.A06 = (ShimmerFrameLayout) C004601z.A0E(this.A02, R.id.expressive_bg_loading_shimmer);
            ConstraintLayout constraintLayout = (ConstraintLayout) C004601z.A0E(this.A02, R.id.backgrounds_download_error_layout);
            this.A04 = constraintLayout;
            this.A07 = (Button) C004601z.A0E(constraintLayout, R.id.retry_backgrounds_download);
            setContentView(linearLayout);
            setTouchable(true);
            setOutsideTouchable(true);
            setInputMethodMode(2);
            setAnimationStyle(0);
            setBackgroundDrawable(new ColorDrawable(activity.getResources().getColor(R.color.color065f)));
            this.A02.measure(View.MeasureSpec.makeMeasureSpec(activity.getWindowManager().getDefaultDisplay().getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            this.A00 = this.A02.getMeasuredHeight();
            this.A01 = new Handler();
            setTouchInterceptor(new IDxTListenerShape33S0000000_3_I1(1));
        }
        setHeight(this.A00);
        setWidth(-1);
        C15430qs r5 = this.A05;
        r5.setKeyboardPopup(this);
        KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) r5;
        if (keyboardPopupLayout.A06) {
            View view = (View) r5;
            view.getViewTreeObserver().addOnGlobalLayoutListener(new IDxLListenerShape146S0100000_3_I1(this, 1));
            keyboardPopupLayout.A06 = false;
            view.requestLayout();
        } else if (!isShowing()) {
            showAtLocation((View) r5, 48, 0, 1000000);
            C1205762e r2 = this.A0I;
            r2.A02.setVisibility(8);
            View view2 = r2.A01;
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
        this.A0E.A03(true);
        A0B(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0042, code lost:
        if (java.lang.System.currentTimeMillis() < r8.A0J("payment_backgrounds_backoff_timestamp")) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B(boolean r11) {
        /*
            r10 = this;
            androidx.constraintlayout.widget.ConstraintLayout r1 = r10.A04
            r0 = 8
            r1.setVisibility(r0)
            com.facebook.shimmer.ShimmerFrameLayout r1 = r10.A06
            r0 = 0
            r1.setVisibility(r0)
            android.widget.TextView r1 = r10.A03
            r0 = 2131889290(0x7f120c8a, float:1.941324E38)
            r1.setText(r0)
            X.12h r4 = r10.A0G
            X.61R r3 = new X.61R
            r3.<init>(r10)
            X.12a r7 = r4.A0B
            if (r11 != 0) goto L_0x0051
            X.0rz r8 = r7.A01
            java.lang.String r9 = "payment_backgrounds_last_fetch_timestamp"
            long r5 = r8.A0J(r9)
            r1 = -1
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0051
            long r0 = X.C209012a.A02
            boolean r0 = r8.A1n(r9, r0)
            if (r0 == 0) goto L_0x0044
            java.lang.String r0 = "payment_backgrounds_backoff_timestamp"
            long r5 = java.lang.System.currentTimeMillis()
            long r1 = r8.A0J(r0)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0051
        L_0x0044:
            X.0sq r2 = r4.A0D
            r1 = 22
            com.facebook.redex.RunnableRunnableShape9S0200000_I0_7 r0 = new com.facebook.redex.RunnableRunnableShape9S0200000_I0_7
            r0.<init>(r4, r1, r3)
            r2.Acl(r0)
            return
        L_0x0051:
            X.0wP r0 = r7.A00
            boolean r0 = r0.A0A()
            if (r0 == 0) goto L_0x0044
            X.0rz r9 = r7.A01
            X.01D r0 = r9.A01
            java.lang.Object r0 = r0.get()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            java.lang.String r8 = "payment_background_backoff_attempt"
            int r0 = X.C13690nt.A01(r0, r8)
            int r7 = r0 + 1
            r5 = 720(0x2d0, double:3.557E-321)
            r0 = 1
            X.1kQ r2 = new X.1kQ
            r2.<init>(r0, r5)
            long r0 = (long) r7
            r2.A03(r0)
            long r1 = r2.A01()
            r5 = 60000(0xea60, double:2.9644E-319)
            long r1 = r1 * r5
            long r5 = java.lang.System.currentTimeMillis()
            long r1 = r1 + r5
            android.content.SharedPreferences$Editor r0 = r9.A0K()
            X.C13680ns.A0w(r0, r8, r7)
            java.lang.String r0 = "payment_backgrounds_backoff_timestamp"
            r9.A14(r0, r1)
            X.12b r2 = r4.A09
            r1 = 0
            X.2Tj r0 = new X.2Tj
            r0.<init>(r3, r4)
            r2.A00(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111325fm.A0B(boolean):void");
    }

    public void AYn(C35361lo r12) {
        this.A08 = r12;
        ImageView imageView = this.A0A;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        C35361lo r2 = this.A08;
        if (r2 != null) {
            layoutParams.height = (int) (((float) layoutParams.width) / (((float) r2.A0D) / ((float) r2.A09)));
            String str = r2.A01;
            if (!TextUtils.isEmpty(str)) {
                imageView.setContentDescription(str);
            }
            this.A0F.A00(imageView, this.A08, layoutParams.width, layoutParams.height);
            PaymentAmountInputField paymentAmountInputField = this.A0H;
            int i2 = this.A08.A0C;
            int i3 = this.A08.A0C;
            paymentAmountInputField.setHintTextColor(Color.argb((int) (((float) Color.alpha(i3)) * 0.3f), (int) ((float) Color.red(i3)), (int) ((float) Color.green(i3)), (int) ((float) Color.blue(i3))));
            TextView textView = this.A0B;
            int i4 = this.A08.A0C;
            TextView textView2 = this.A0C;
            int i5 = this.A08.A0C;
            TextView textView3 = this.A0D;
            int i6 = this.A08.A0B;
            textView3.setBackgroundColor(this.A08.A0A);
        } else {
            imageView.setImageResource(R.drawable.payment_default_background);
            PaymentAmountInputField paymentAmountInputField2 = this.A0H;
            C117685tO r10 = this.A0J;
            AnonymousClass04h.A08(paymentAmountInputField2, r10.A00);
            TextView textView4 = this.A0B;
            Pair pair = r10.A02;
            AnonymousClass04h.A08(textView4, AnonymousClass000.A0D(pair.first));
            TextView textView5 = this.A0C;
            int[] iArr = (int[]) pair.second;
            textView5.setPadding(iArr[0], iArr[1], iArr[2], iArr[3]);
            Pair pair2 = r10.A01;
            AnonymousClass04h.A08(textView5, AnonymousClass000.A0D(pair2.first));
            int[] iArr2 = (int[]) pair2.second;
            textView5.setPadding(iArr2[0], iArr2[1], iArr2[2], iArr2[3]);
            TextView textView6 = this.A0D;
            C13690nt.A0w(this.A03.getResources(), textView6, R.color.color05f5);
            textView6.setBackgroundColor(0);
        }
        imageView.setTag(R.id.selected_expressive_background_theme, this.A08);
    }

    public void dismiss() {
        this.A0E.A04(true);
        C1205762e r2 = this.A0I;
        r2.A02.setVisibility(0);
        View view = r2.A01;
        if (view != null) {
            view.setVisibility(0);
        }
        super.dismiss();
    }
}
