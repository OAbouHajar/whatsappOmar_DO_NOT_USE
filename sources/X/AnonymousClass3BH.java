package X;

import android.content.Context;
import android.graphics.Paint;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AbsListView;
import android.widget.ImageView;
import androidx.viewpager.widget.ViewPager;
import com.facebook.redex.IDxLListenerShape145S0100000_2_I1;
import com.facebook.redex.IDxSListenerShape99S0200000_2_I1;
import com.facebook.redex.IDxTListenerShape63S0200000_2_I1;
import com.facebook.redex.ViewOnClickCListenerShape3S0300000_I1;
import com.obwhatsapp.R;
import java.util.HashMap;

/* renamed from: X.3BH  reason: invalid class name */
public class AnonymousClass3BH {
    public static HandlerThread A0T;
    public static C56422nc A0U;
    public static C56452nf A0V;
    public static final int A0W = ViewConfiguration.getKeyRepeatDelay();
    public static final int A0X = ViewConfiguration.getKeyRepeatTimeout();
    public static final HashMap A0Y = AnonymousClass000.A0x();
    public int A00;
    public int A01;
    public AnonymousClass5RN A02;
    public C56982pZ A03;
    public C56972pY A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final Context A09;
    public final Paint A0A = C13700nu.A05();
    public final LayoutInflater A0B;
    public final View.OnClickListener A0C;
    public final View A0D;
    public final View A0E;
    public final ViewGroup A0F;
    public final ViewTreeObserver.OnGlobalLayoutListener A0G = new IDxLListenerShape145S0100000_2_I1(this, 0);
    public final AbsListView.OnScrollListener A0H;
    public final AbsListView.OnScrollListener A0I = new AnonymousClass3DC(this);
    public final ImageView A0J;
    public final ViewPager A0K;
    public final C16300so A0L;
    public final C15860rz A0M;
    public final C206711d A0N;
    public final C17250um A0O;
    public final C17020u3 A0P;
    public final boolean A0Q;
    public final C56702oM[] A0R;
    public final C88984bP[] A0S;

    public AnonymousClass3BH(Context context, View view, ViewGroup viewGroup, AbsListView.OnScrollListener onScrollListener, C16300so r19, C15860rz r20, AnonymousClass013 r21, C206711d r22, C17250um r23, C14710pd r24, C17020u3 r25) {
        int length;
        AbsListView.OnScrollListener onScrollListener2 = onScrollListener;
        this.A0H = onScrollListener2;
        this.A0Q = AnonymousClass000.A1V(onScrollListener2);
        this.A0E = view;
        this.A09 = context;
        this.A0L = r19;
        this.A0O = r23;
        C206711d r10 = r22;
        this.A0N = r10;
        C15860rz r8 = r20;
        this.A0M = r8;
        C17020u3 r7 = r25;
        this.A0P = r7;
        this.A06 = AnonymousClass00T.A00(context, R.color.color01f5);
        this.A08 = AnonymousClass00T.A00(context, R.color.color05b1);
        ViewGroup viewGroup2 = viewGroup;
        this.A0F = C13690nt.A0K(viewGroup2, R.id.emoji_group_layout);
        C16620tM r11 = C16620tM.A02;
        C14710pd r13 = r24;
        C88984bP[] r1 = new C88984bP[((r13.A0E(r11, 2880) ? AnonymousClass2HT.A08 : AnonymousClass2HT.A09).length + 1)];
        this.A0S = r1;
        r1[0] = new C70433gg(r10);
        int i2 = 1;
        while (true) {
            C88984bP[] r4 = this.A0S;
            length = r4.length;
            if (i2 >= length) {
                break;
            }
            r4[i2] = new C88984bP((r13.A0E(r11, 2880) ? AnonymousClass2HT.A08 : AnonymousClass2HT.A09)[i2 - 1], i2);
            i2++;
        }
        C56702oM[] r12 = new C56702oM[length];
        this.A0R = r12;
        AnonymousClass013 r42 = r21;
        r12[0] = new C56702oM(context, this, r42, 0);
        this.A00 = r10.A00() > 0 ? 0 : 1;
        ViewPager viewPager = (ViewPager) viewGroup2.findViewById(R.id.pager);
        this.A0K = viewPager;
        viewPager.setAdapter(new C59192v1(this, r42));
        viewPager.A0G(new C95464mg(context, this, r42, r7));
        this.A0B = AnonymousClass01V.A01(context);
        this.A05 = context.getResources().getDimensionPixelSize(R.dimen.dimen035b);
        this.A07 = context.getResources().getDimensionPixelSize(R.dimen.dimen0359);
        for (C88984bP r9 : this.A0S) {
            View findViewById = this.A0F.findViewById(r9.A00);
            C13680ns.A0t(context, findViewById, r9.A03);
            C13690nt.A1B(findViewById, this, r42, r9, 1);
        }
        this.A0K.A0F(C13680ns.A1Z(r42) ? this.A00 : (this.A0R.length - 1) - this.A00, false);
        A00(this.A00);
        this.A0C = new ViewOnClickCListenerShape3S0300000_I1((Object) this, (Object) r7, (Object) r8, 2);
        ImageView A0K2 = C13680ns.A0K(viewGroup2, R.id.delete_symbol_tb);
        this.A0J = A0K2;
        if (A0K2 != null) {
            C63773Ll r14 = new C63773Ll(Looper.getMainLooper(), this);
            A0K2.setClickable(true);
            A0K2.setLongClickable(true);
            A0K2.setOnTouchListener(new IDxTListenerShape63S0200000_2_I1(r14, 0, this));
            C13680ns.A1A(A0K2, this, 7);
            C447725m.A01(this.A09, A0K2, r42, R.drawable.emoji_x);
            C13680ns.A0t(context, A0K2, R.string.str014e);
        }
        View findViewById2 = viewGroup2.findViewById(R.id.emoji_tip);
        this.A0D = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
            C13680ns.A1A(findViewById2.findViewById(R.id.ok), this, 6);
            C13680ns.A1A(findViewById2, this, 5);
        }
    }

    public final void A00(int i2) {
        for (C88984bP r3 : this.A0S) {
            ViewGroup viewGroup = this.A0F;
            View findViewById = viewGroup.findViewById(r3.A01);
            View findViewById2 = viewGroup.findViewById(r3.A00);
            if (findViewById2 != null) {
                if (r3.A02 == i2) {
                    findViewById2.setSelected(true);
                    C13680ns.A0u(findViewById.getContext(), findViewById, R.color.color061d);
                } else {
                    findViewById2.setSelected(false);
                    findViewById.setBackgroundColor(0);
                }
            }
        }
    }

    public final void A01(C56562nu r5) {
        if (C62153Bw.A02(r5.A07)) {
            C56982pZ r1 = new C56982pZ(r5, new IDxSListenerShape99S0200000_2_I1(r5, this, 1), this.A0O, r5.A07);
            this.A03 = r1;
            C37941pz.A01(r5, this.A0E, r1);
        }
    }

    public final void A02(int[] iArr) {
        if (iArr == null) {
            this.A0L.AcB("EmojiPicker/onEmojiSelected/emoji being added is null", (String) null, true);
            return;
        }
        this.A0N.A07(iArr);
        if (this.A00 != 0) {
            this.A0R[0].notifyDataSetChanged();
        }
        AnonymousClass5RN r0 = this.A02;
        if (r0 != null) {
            r0.AQH(iArr);
        }
    }
}
