package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape317S0100000_I1;
import com.facebook.redex.IDxLListenerShape143S0100000_I1;
import com.obwhatsapp.R;

/* renamed from: X.0Cz  reason: invalid class name */
public final class AnonymousClass0Cz extends AnonymousClass0ZU implements C13350lt, PopupWindow.OnDismissListener, View.OnKeyListener, AdapterView.OnItemClickListener {
    public int A00;
    public int A01 = 0;
    public View A02;
    public View A03;
    public ViewTreeObserver A04;
    public PopupWindow.OnDismissListener A05;
    public C12940lD A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final Context A0D;
    public final View.OnAttachStateChangeListener A0E = new IDxCListenerShape317S0100000_I1(this, 1);
    public final ViewTreeObserver.OnGlobalLayoutListener A0F = new IDxLListenerShape143S0100000_I1(this, 1);
    public final AnonymousClass0C5 A0G;
    public final C016607w A0H;
    public final AnonymousClass0DE A0I;
    public final boolean A0J;

    public AnonymousClass0Cz(Context context, View view, C016607w r6, int i2, int i3, boolean z2) {
        this.A0D = context;
        this.A0H = r6;
        this.A0J = z2;
        this.A0G = new AnonymousClass0C5(LayoutInflater.from(context), r6, R.layout.layout0013, z2);
        this.A0B = i2;
        this.A0C = i3;
        Resources resources = context.getResources();
        this.A0A = Math.max(resources.getDisplayMetrics().widthPixels >> 1, resources.getDimensionPixelSize(R.dimen.dimen0017));
        this.A02 = view;
        this.A0I = new AnonymousClass0DE(context, i2, i3);
        r6.A09(context, this);
    }

    public void A01(int i2) {
        this.A01 = i2;
    }

    public void A02(int i2) {
        this.A0I.A01 = i2;
    }

    public void A03(int i2) {
        this.A0I.Aex(i2);
    }

    public void A04(View view) {
        this.A02 = view;
    }

    public void A05(PopupWindow.OnDismissListener onDismissListener) {
        this.A05 = onDismissListener;
    }

    public void A06(C016607w r1) {
    }

    public void A07(boolean z2) {
        this.A0G.A02 = z2;
    }

    public void A08(boolean z2) {
        this.A08 = z2;
    }

    public boolean A97() {
        return false;
    }

    public ListView ADA() {
        return this.A0I.A0B;
    }

    public boolean AJh() {
        return !this.A09 && this.A0I.A0A.isShowing();
    }

    public void AOk(C016607w r2, boolean z2) {
        if (r2 == this.A0H) {
            dismiss();
            C12940lD r0 = this.A06;
            if (r0 != null) {
                r0.AOk(r2, z2);
            }
        }
    }

    public boolean AY0(AnonymousClass0Cw r14) {
        AnonymousClass0Cw r9 = r14;
        if (r14.hasVisibleItems()) {
            C05500Rr r6 = new C05500Rr(this.A0D, this.A03, r9, this.A0B, this.A0C, this.A0J);
            C12940lD r1 = this.A06;
            r6.A04 = r1;
            AnonymousClass0ZU r0 = r6.A03;
            if (r0 != null) {
                r0.Ade(r1);
            }
            int size = r14.size();
            boolean z2 = false;
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                MenuItem item = r14.getItem(i2);
                if (item.isVisible() && item.getIcon() != null) {
                    z2 = true;
                    break;
                }
                i2++;
            }
            r6.A05 = z2;
            AnonymousClass0ZU r02 = r6.A03;
            if (r02 != null) {
                r02.A07(z2);
            }
            r6.A02 = this.A05;
            this.A05 = null;
            this.A0H.A0G(false);
            AnonymousClass0DE r03 = this.A0I;
            int i3 = r03.A01;
            int AGt = r03.AGt();
            if ((Gravity.getAbsoluteGravity(this.A01, C004601z.A06(this.A02)) & 7) == 5) {
                i3 += this.A02.getWidth();
            }
            AnonymousClass0ZU r04 = r6.A03;
            if (r04 == null || !r04.AJh()) {
                if (r6.A01 != null) {
                    AnonymousClass0ZU A002 = r6.A00();
                    A002.A08(true);
                    if ((C05570Sc.A00(r6.A00, C004601z.A06(r6.A01)) & 7) == 5) {
                        i3 -= r6.A01.getWidth();
                    }
                    A002.A02(i3);
                    A002.A03(AGt);
                    int i4 = (int) ((AnonymousClass000.A0M(r6.A08).density * 48.0f) / 2.0f);
                    A002.A00 = new Rect(i3 - i4, AGt - i4, i3 + i4, AGt + i4);
                    A002.AfT();
                }
            }
            C12940lD r05 = this.A06;
            if (r05 == null) {
                return true;
            }
            r05.AUB(r14);
            return true;
        }
        return false;
    }

    public void Ade(C12940lD r1) {
        this.A06 = r1;
    }

    public void AfT() {
        View view;
        if (AJh()) {
            return;
        }
        if (this.A09 || (view = this.A02) == null) {
            throw AnonymousClass000.A0V("StandardMenuPopup cannot be used without an anchor");
        }
        this.A03 = view;
        AnonymousClass0DE r6 = this.A0I;
        PopupWindow popupWindow = r6.A0A;
        popupWindow.setOnDismissListener(this);
        r6.A08 = this;
        r6.A0E = true;
        popupWindow.setFocusable(true);
        View view2 = this.A03;
        boolean A1W = AnonymousClass000.A1W(this.A04);
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.A04 = viewTreeObserver;
        if (A1W) {
            viewTreeObserver.addOnGlobalLayoutListener(this.A0F);
        }
        view2.addOnAttachStateChangeListener(this.A0E);
        r6.A07 = view2;
        r6.A00 = this.A01;
        if (!this.A07) {
            this.A00 = AnonymousClass0ZU.A00(this.A0D, this.A0G, this.A0A);
            this.A07 = true;
        }
        r6.A01(this.A00);
        popupWindow.setInputMethodMode(2);
        Rect rect = this.A00;
        r6.A06 = rect != null ? new Rect(rect) : null;
        r6.AfT();
        AnonymousClass0CV r4 = r6.A0B;
        r4.setOnKeyListener(this);
        if (this.A08) {
            C016607w r3 = this.A0H;
            if (r3.A05 != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.A0D).inflate(R.layout.layout0012, r4, false);
                TextView textView = (TextView) frameLayout.findViewById(16908310);
                if (textView != null) {
                    textView.setText(r3.A05);
                }
                frameLayout.setEnabled(false);
                r4.addHeaderView(frameLayout, (Object) null, false);
            }
        }
        r6.AdW(this.A0G);
        r6.AfT();
    }

    public void AhS(boolean z2) {
        this.A07 = false;
        AnonymousClass0C5 r0 = this.A0G;
        if (r0 != null) {
            r0.notifyDataSetChanged();
        }
    }

    public void dismiss() {
        if (AJh()) {
            this.A0I.dismiss();
        }
    }

    public void onDismiss() {
        this.A09 = true;
        this.A0H.close();
        ViewTreeObserver viewTreeObserver = this.A04;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.A04 = this.A03.getViewTreeObserver();
            }
            this.A04.removeGlobalOnLayoutListener(this.A0F);
            this.A04 = null;
        }
        this.A03.removeOnAttachStateChangeListener(this.A0E);
        PopupWindow.OnDismissListener onDismissListener = this.A05;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }
}
