package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.RunnableRunnableShape5S0100000_I0_4;
import com.obwhatsapp.R;
import com.obwhatsapp.community.CommunitySubgroupsBottomSheet;

/* renamed from: X.2jH  reason: invalid class name and case insensitive filesystem */
public class C55302jH extends AnonymousClass01X {
    public final C16050sL A00;
    public final /* synthetic */ CommunitySubgroupsBottomSheet A01;

    public C55302jH(CommunitySubgroupsBottomSheet communitySubgroupsBottomSheet, C16050sL r2) {
        this.A01 = communitySubgroupsBottomSheet;
        this.A00 = r2;
    }

    public int A0C() {
        return this.A01.A00.A03;
    }

    public long A0D(int i2) {
        CommunitySubgroupsBottomSheet communitySubgroupsBottomSheet = this.A01;
        int i3 = ((C56102ky) communitySubgroupsBottomSheet.A00.A01(i2)).A00;
        return i3 != 1 ? (long) i3 : (long) ((C39461sW) ((C56102ky) communitySubgroupsBottomSheet.A00.A01(i2)).A01).A02.hashCode();
    }

    public /* bridge */ /* synthetic */ void ANf(C005602k r2, int i2) {
        ((C65053Sr) r2).A07(((C56102ky) this.A01.A00.A01(i2)).A01, i2);
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        ViewGroup viewGroup2 = viewGroup;
        int i3 = i2;
        if (i2 == 0) {
            return new C73433o4(this.A01.A05().inflate(R.layout.layout0111, viewGroup2, false), new RunnableRunnableShape5S0100000_I0_4((Object) this, 38));
        }
        if (i3 == 1) {
            View inflate = LayoutInflater.from(viewGroup2.getContext()).inflate(R.layout.layout01f2, viewGroup2, false);
            CommunitySubgroupsBottomSheet communitySubgroupsBottomSheet = this.A01;
            C001000l A0D = communitySubgroupsBottomSheet.A0D();
            C16980tz r32 = communitySubgroupsBottomSheet.A0K;
            C16440t3 r31 = communitySubgroupsBottomSheet.A0J;
            C14710pd r42 = communitySubgroupsBottomSheet.A0W;
            C19990zK r45 = communitySubgroupsBottomSheet.A0Z;
            C16040sK r54 = communitySubgroupsBottomSheet.A05;
            C16320sq r11 = communitySubgroupsBottomSheet.A0h;
            C15810rt r35 = communitySubgroupsBottomSheet.A0N;
            C15900s5 r53 = communitySubgroupsBottomSheet.A06;
            C20260zl r43 = communitySubgroupsBottomSheet.A0X;
            C218315p r48 = communitySubgroupsBottomSheet.A0c;
            C17160ud r25 = communitySubgroupsBottomSheet.A0E;
            C16000sG r26 = communitySubgroupsBottomSheet.A0F;
            C25731Kx r24 = communitySubgroupsBottomSheet.A01;
            C18560wt r22 = communitySubgroupsBottomSheet.A0O;
            C16080sP r27 = communitySubgroupsBottomSheet.A0G;
            AnonymousClass013 r21 = communitySubgroupsBottomSheet.A0M;
            C18290wS r20 = communitySubgroupsBottomSheet.A0b;
            AnonymousClass01Y r23 = communitySubgroupsBottomSheet.A09;
            C17240ul r19 = communitySubgroupsBottomSheet.A0Y;
            C19780yz r18 = communitySubgroupsBottomSheet.A0S;
            C25781Lc r15 = communitySubgroupsBottomSheet.A0g;
            C16220sf r14 = communitySubgroupsBottomSheet.A0e;
            AnonymousClass15G r13 = communitySubgroupsBottomSheet.A0T;
            AnonymousClass15X r10 = communitySubgroupsBottomSheet.A0U;
            C15860rz r9 = communitySubgroupsBottomSheet.A0L;
            C17230uk r8 = communitySubgroupsBottomSheet.A0A;
            AnonymousClass195 r7 = communitySubgroupsBottomSheet.A0Q;
            C18090w8 r6 = communitySubgroupsBottomSheet.A0a;
            AnonymousClass15Z r5 = communitySubgroupsBottomSheet.A07;
            AnonymousClass2TP r51 = AnonymousClass2TP.A01;
            AnonymousClass2Ao r4 = communitySubgroupsBottomSheet.A0H;
            C85934Qo r3 = new C85934Qo(new AnonymousClass1WA(r11, true));
            C19580yf r2 = communitySubgroupsBottomSheet.A0V;
            AnonymousClass3FR r1 = communitySubgroupsBottomSheet.A0C;
            return new C60002zj(A0D, inflate, r24, r54, r53, r5, communitySubgroupsBottomSheet.A08, r23, r8, r25, r26, r27, r4, r3, r1, r31, r32, r9, r21, r35, r22, r7, r18, r13, r10, r2, r42, r43, r19, r45, r6, r20, r48, r14, r15, r51, r11);
        } else if (i3 == 2) {
            return new C73443o5(this.A01.A05().inflate(R.layout.layout05cf, viewGroup2, false), new RunnableRunnableShape5S0100000_I0_4((Object) this, 37));
        } else {
            StringBuilder sb = new StringBuilder("View type ");
            sb.append(i3);
            sb.append(" not recognizable");
            throw new IllegalStateException(sb.toString());
        }
    }

    public int getItemViewType(int i2) {
        return ((C56102ky) this.A01.A00.A01(i2)).A00;
    }
}
