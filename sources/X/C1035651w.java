package X;

import com.facebook.redex.IDxObserverShape116S0100000_2_I1;
import com.facebook.redex.IDxObserverShape7S0400000_2_I1;
import com.facebook.redex.IDxTFunction3Shape461S0100000_2_I1;
import com.obwhatsapp.status.playback.widget.VoiceStatusContentView;
import java.util.List;

/* renamed from: X.51w  reason: invalid class name and case insensitive filesystem */
public class C1035651w implements AnonymousClass5N0 {
    public boolean A00 = false;
    public final AnonymousClass028 A01;
    public final AnonymousClass028 A02;
    public final AnonymousClass027 A03;
    public final AnonymousClass027 A04;
    public final AnonymousClass027 A05;
    public final AnonymousClass027 A06;
    public final AnonymousClass023 A07;
    public final C47772Kk A08;
    public final List A09 = AnonymousClass000.A0u();

    public C1035651w(C38701rH r9, C47772Kk r10) {
        List list = null;
        AnonymousClass027 r4 = new AnonymousClass027((Object) null);
        this.A05 = r4;
        AnonymousClass027 r7 = new AnonymousClass027((Object) null);
        this.A03 = r7;
        AnonymousClass027 r1 = new AnonymousClass027((Object) null);
        this.A04 = r1;
        AnonymousClass028 A002 = A00(r4, r7, r1, new IDxTFunction3Shape461S0100000_2_I1(this, 0));
        this.A01 = A002;
        AnonymousClass027 r2 = new AnonymousClass027(-4);
        this.A06 = r2;
        AnonymousClass028 A003 = A00(A002, r2, r7, new IDxTFunction3Shape461S0100000_2_I1(this, 1));
        this.A02 = A003;
        IDxObserverShape116S0100000_2_I1 iDxObserverShape116S0100000_2_I1 = new IDxObserverShape116S0100000_2_I1(this, 131);
        this.A07 = iDxObserverShape116S0100000_2_I1;
        this.A08 = r10;
        VoiceStatusContentView voiceStatusContentView = (VoiceStatusContentView) r10;
        voiceStatusContentView.A08 = this;
        A003.A07(iDxObserverShape116S0100000_2_I1);
        if (r9.A10(32768)) {
            C42661yC r0 = r9.A00;
            r4.A0B(r0 != null ? r0.A00() : list);
            return;
        }
        voiceStatusContentView.A04.setVisibility(4);
        voiceStatusContentView.A02.setVisibility(0);
    }

    public static AnonymousClass028 A00(AnonymousClass028 r8, AnonymousClass028 r9, AnonymousClass028 r10, AnonymousClass5QZ r11) {
        AnonymousClass026 r4 = new AnonymousClass026();
        AnonymousClass028 r7 = r8;
        AnonymousClass028 r2 = r9;
        AnonymousClass028 r3 = r10;
        AnonymousClass5QZ r5 = r11;
        r4.A0D(C05730St.A01(r8), new IDxObserverShape7S0400000_2_I1(r2, r3, r4, r5, 1));
        AnonymousClass028 A012 = C05730St.A01(r9);
        AnonymousClass028 r82 = r10;
        AnonymousClass026 r92 = r4;
        AnonymousClass5QZ r102 = r5;
        r4.A0D(A012, new IDxObserverShape7S0400000_2_I1(r7, r82, r92, r102, 0));
        r4.A0D(C05730St.A01(r3), new IDxObserverShape7S0400000_2_I1(r7, r2, r92, r102, 2));
        return r4;
    }
}
