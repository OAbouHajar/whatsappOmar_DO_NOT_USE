package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.obwhatsapp.R;
import java.util.ArrayList;

/* renamed from: X.2VQ  reason: invalid class name */
public final class AnonymousClass2VQ {
    public View A00;
    public AnonymousClass2VR A01;
    public AnonymousClass2p9 A02;
    public AnonymousClass2VS A03;
    public C73883pF A04;
    public C73893pG A05;
    public ArrayList A06;
    public boolean A07;
    public boolean A08;
    public final ViewGroup A09;
    public final ViewGroup A0A;
    public final ListView A0B;
    public final C000900k A0C;
    public final C14600pS A0D;
    public final C16040sK A0E;
    public final C15900s5 A0F;
    public final AnonymousClass01Y A0G;
    public final C16000sG A0H;
    public final AnonymousClass4E7 A0I;
    public final C55442jc A0J;
    public final C15810rt A0K;
    public final C223217m A0L;
    public final C14710pd A0M;
    public final C20260zl A0N;
    public final C17240ul A0O;
    public final C15830rv A0P;
    public final C216014s A0Q;
    public final C613238l A0R;

    public AnonymousClass2VQ(ViewGroup viewGroup, ListView listView, C000900k r6, C14600pS r7, C16040sK r8, C15900s5 r9, AnonymousClass01Y r10, C16000sG r11, AnonymousClass4E7 r12, C55442jc r13, C16820th r14, C15810rt r15, C223217m r16, C14710pd r17, C20260zl r18, C17240ul r19, C15830rv r20, C216014s r21) {
        this.A0M = r17;
        this.A0C = r6;
        this.A0E = r8;
        this.A0K = r15;
        this.A0F = r9;
        this.A0Q = r21;
        this.A0N = r18;
        this.A0H = r11;
        this.A0G = r10;
        this.A0O = r19;
        C223217m r1 = r16;
        this.A0L = r1;
        this.A0J = r13;
        this.A0D = r7;
        this.A0I = r12;
        this.A0P = r20;
        this.A0B = listView;
        this.A0A = viewGroup;
        this.A0R = new C613238l(r8, r11, r14, r1);
        ViewGroup viewGroup2 = (ViewGroup) r6.getLayoutInflater().inflate(R.layout.layout0163, listView, false);
        this.A09 = viewGroup2;
        this.A00 = viewGroup2.findViewById(R.id.progress);
        listView.addHeaderView(viewGroup2);
    }

    public final void A00(C16010sH r5, boolean z2) {
        C55442jc r3 = this.A0J;
        r3.A00 = r5;
        r3.A01 = z2;
        if (this.A03 == null) {
            AnonymousClass2VS r1 = (this.A0M.A0E(C16620tM.A02, 412) || C40561uK.A01(this.A0N, r5.A0E)) ? new C55422ja(this.A0C) : new C603631d(this.A0C);
            this.A03 = r1;
            r1.setup(r3);
            AnonymousClass2VS r2 = this.A03;
            if (r2 instanceof C603631d) {
                this.A0B.addFooterView((View) r2);
            } else if (r2 instanceof C55422ja) {
                ViewGroup viewGroup = this.A0A;
                viewGroup.setVisibility(0);
                viewGroup.addView((View) r2);
            }
        }
    }

    public void A01(boolean z2, int i2) {
        TextView textView;
        int i3;
        if (this.A02 == null) {
            this.A02 = new AnonymousClass2p9(this.A0C);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            this.A09.addView(this.A02, layoutParams);
        }
        View view = this.A00;
        int i4 = 8;
        if (z2) {
            i4 = 0;
        }
        view.setVisibility(i4);
        if (z2 || i2 == 0) {
            this.A02.setVisibility(8);
            return;
        }
        this.A02.setVisibility(0);
        AnonymousClass2p9 r1 = this.A02;
        if (i2 == 1) {
            r1.A00.setVisibility(0);
            textView = r1.A01;
            i3 = R.string.str0440;
        } else if (i2 == 2) {
            r1.A00.setVisibility(8);
            textView = r1.A01;
            i3 = R.string.str043f;
        } else {
            return;
        }
        textView.setText(i3);
    }
}
