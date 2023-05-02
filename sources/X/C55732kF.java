package X;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.obwhatsapp.R;
import com.obwhatsapp.status.playback.fragment.StatusPlaybackBaseFragment;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape0S0200000_I0;

/* renamed from: X.2kF  reason: invalid class name and case insensitive filesystem */
public class C55732kF extends AnonymousClass2B3 {
    public AnonymousClass36H A00;
    public final C18940xV A01 = new AnonymousClass31n(this);
    public final C19150xq A02;
    public final C14710pd A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C55732kF(X.C17100uX r36, X.C19980zJ r37, X.C16300so r38, X.C14870pt r39, com.whatsapp.Mp4Ops r40, X.AnonymousClass10X r41, X.C17130ua r42, X.C16760tb r43, X.AnonymousClass2Ao r44, X.AnonymousClass01V r45, X.C16440t3 r46, X.C16980tz r47, X.AnonymousClass013 r48, X.C16460t6 r49, X.C19150xq r50, X.C26081Mg r51, X.AnonymousClass1HF r52, X.AnonymousClass11G r53, X.C18030w2 r54, X.C14710pd r55, X.C16490t9 r56, X.AnonymousClass1P7 r57, X.AnonymousClass1HE r58, X.AnonymousClass1P8 r59, X.C16740tZ r60, X.C16220sf r61, X.AnonymousClass1L1 r62, X.AnonymousClass1BM r63, X.AnonymousClass1PB r64, X.AnonymousClass4L6 r65, X.AnonymousClass1PD r66, X.C16320sq r67, X.C25981Lw r68) {
        /*
            r35 = this;
            r29 = r63
            r28 = r62
            r27 = r61
            r26 = r60
            r25 = r59
            r10 = r43
            r11 = r44
            r12 = r45
            r13 = r46
            r14 = r47
            r30 = r64
            r2 = r35
            r31 = r65
            r3 = r36
            r7 = r40
            r32 = r66
            r4 = r37
            r8 = r41
            r33 = r67
            r5 = r38
            r9 = r42
            r34 = r68
            r6 = r39
            r15 = r48
            r16 = r49
            r17 = r51
            r18 = r52
            r19 = r53
            r20 = r54
            r1 = r55
            r22 = r56
            r23 = r57
            r24 = r58
            r21 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            X.31n r0 = new X.31n
            r0.<init>(r2)
            r2.A01 = r0
            r2.A03 = r1
            r0 = r50
            r2.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55732kF.<init>(X.0uX, X.0zJ, X.0so, X.0pt, com.whatsapp.Mp4Ops, X.10X, X.0ua, X.0tb, X.2Ao, X.01V, X.0t3, X.0tz, X.013, X.0t6, X.0xq, X.1Mg, X.1HF, X.11G, X.0w2, X.0pd, X.0t9, X.1P7, X.1HE, X.1P8, X.0tZ, X.0sf, X.1L1, X.1BM, X.1PB, X.4L6, X.1PD, X.0sq, X.1Lw):void");
    }

    public void A01() {
        super.A01();
        this.A02.A03(this.A01);
    }

    public void A0B() {
        super.A0B();
        AnonymousClass36H r1 = this.A00;
        if (r1 != null) {
            r1.A06(true);
            this.A00 = null;
        }
        C16740tZ r2 = this.A0B;
        AnonymousClass53F r4 = new AnonymousClass53F(r2, A0A());
        C16460t6 r3 = this.A0H;
        C25981Lw r12 = this.A0Y;
        C15830rv A0B = r2.A0B();
        AnonymousClass00B.A06(A0B);
        AnonymousClass36H r22 = new AnonymousClass36H(r3, A0B, r4, r12);
        this.A00 = r22;
        this.A0X.Ack(r22, new Void[0]);
    }

    public void A0D() {
        super.A0D();
        BottomSheetBehavior bottomSheetBehavior = this.A00;
        if (bottomSheetBehavior.A0B != 4) {
            bottomSheetBehavior.A0M(4);
        } else {
            this.A01.A06.setVisibility(8);
            this.A01.A06.setAlpha(0.0f);
        }
        this.A01.A0D.setVisibility(0);
    }

    public void A0I(int i2) {
        super.A0I(i2);
        if (i2 == 3) {
            A0Q();
        }
    }

    public void A0L(View view) {
        super.A0L(view);
        C55722kE A0A = A0A();
        ViewGroup viewGroup = A0A.A08;
        int i2 = 0;
        if (C16030sJ.A0P(this.A0B.A0B())) {
            i2 = 8;
        }
        viewGroup.setVisibility(i2);
        AnonymousClass1UP.A06(A0A.A0D);
        A0A.A0D.setText(R.string.str0e57);
        A0A.A0D.setOnClickListener(new ViewOnClickCListenerShape0S0200000_I0(A0A, 28, this));
        A0O(false);
        A0H();
        this.A02.A02(this.A01);
    }

    public final void A0Q() {
        StringBuilder sb = new StringBuilder("playbackPage/reply page=");
        sb.append(this);
        sb.append("; host=");
        StatusPlaybackBaseFragment statusPlaybackBaseFragment = this.A0R.A01;
        sb.append(statusPlaybackBaseFragment);
        Log.i(sb.toString());
        View view = this.A00;
        AnonymousClass00B.A04(view);
        C14550pN r0 = (C14550pN) AnonymousClass22N.A01(view.getContext(), C14550pN.class);
        if (r0 == null || !r0.AIm()) {
            A0C();
            this.A01.A0D.setVisibility(8);
            View view2 = this.A00;
            AnonymousClass00B.A04(view2);
            Context context = view2.getContext();
            Intent intent = new Intent();
            intent.setClassName(context.getPackageName(), "com.obwhatsapp.status.playback.StatusReplyActivity");
            AnonymousClass1yL.A00(intent, this.A0B.A11);
            intent.putExtra("isStatusReply", true);
            C001000l A0C = statusPlaybackBaseFragment.A0C();
            if (A0C == null || A0C.isFinishing()) {
                View view3 = this.A00;
                AnonymousClass00B.A04(view3);
                view3.getContext().startActivity(intent);
                return;
            }
            if (this.A03.A0E(C16620tM.A02, 1455)) {
                A0C.getWindow().setSoftInputMode(48);
            }
            A0C.startActivityForResult(intent, 10);
            return;
        }
        StringBuilder sb2 = new StringBuilder("playbackPage/reply reply-already-ended page=");
        sb2.append(this);
        sb2.append("; host=");
        sb2.append(statusPlaybackBaseFragment);
        Log.i(sb2.toString());
    }
}
