package X;

import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.view.GravityCompat;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.facebook.redex.IDxTListenerShape63S0200000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.reactions.ReactionsTrayViewModel;

/* renamed from: X.2pX  reason: invalid class name and case insensitive filesystem */
public class C56962pX extends PopupWindow {
    public final View A00;
    public final C14550pN A01;
    public final C53802gK A02;
    public final AnonymousClass013 A03;

    public C56962pX(View view, C14550pN r12, AnonymousClass013 r13, C16740tZ r14, ReactionsTrayViewModel reactionsTrayViewModel, boolean z2) {
        this.A03 = r13;
        this.A01 = r12;
        this.A00 = view;
        C53802gK r6 = new C53802gK(r12, reactionsTrayViewModel);
        this.A02 = r6;
        FrameLayout frameLayout = new FrameLayout(r12);
        int dimensionPixelOffset = r12.getResources().getDimensionPixelOffset(R.dimen.dimen0767);
        int i2 = !z2 ? r14.A11.A02 ? GravityCompat.END : GravityCompat.START : GravityCompat.START;
        reactionsTrayViewModel.A01 = C13700nu.A03(r12).orientation;
        Rect A0J = AnonymousClass000.A0J();
        C13690nt.A0J(r12).getWindowVisibleDisplayFrame(A0J);
        boolean z3 = false;
        frameLayout.setPadding(dimensionPixelOffset, 0, (reactionsTrayViewModel.A01 == 2 ? C13690nt.A0J(r12).getWidth() - (A0J.right - A0J.left) : 0) + dimensionPixelOffset, 0);
        frameLayout.setClipToPadding(false);
        frameLayout.addView(r6, new FrameLayout.LayoutParams(-2, -2, i2));
        setContentView(frameLayout);
        setBackgroundDrawable(new ColorDrawable(r12.getResources().getColor(R.color.color0792)));
        setTouchable(true);
        AccessibilityManager A0P = r12.A08.A0P();
        if (A0P != null && A0P.isTouchExplorationEnabled()) {
            z3 = true;
        }
        setFocusable(z3);
        setOutsideTouchable(true);
        setWidth(-1);
        setHeight(-2);
        setInputMethodMode(2);
        setTouchInterceptor(new IDxTListenerShape63S0200000_2_I1(frameLayout, 1, this));
    }
}
