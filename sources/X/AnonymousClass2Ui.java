package X;

import com.AssemMods.fakechat.utils.AppUtils;
import com.facebook.redex.IDxCallableShape148S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape0S0200100_I0;
import com.facebook.redex.RunnableRunnableShape0S0510000_I0;
import com.facebook.redex.RunnableRunnableShape6S0100000_I0_5;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

/* renamed from: X.2Ui  reason: invalid class name */
public class AnonymousClass2Ui {
    public AnonymousClass1WF A00;
    public AnonymousClass2UO A01;
    public final C16300so A02;
    public final C14870pt A03;
    public final AnonymousClass27H A04;
    public final AnonymousClass2UP A05 = new AnonymousClass2UP(this);
    public final C19540yb A06;
    public final C23521Ch A07;
    public final C18930xU A08;
    public final AnonymousClass19E A09;
    public final C16440t3 A0A;
    public final C15860rz A0B;
    public final C208211s A0C;
    public final AnonymousClass16P A0D;
    public final C19410yO A0E;
    public final C17190ug A0F;
    public final C49602Uf A0G;
    public final AnonymousClass133 A0H;
    public final C16320sq A0I;

    public AnonymousClass2Ui(C16300so r8, C14870pt r9, C19540yb r10, C23521Ch r11, C18930xU r12, AnonymousClass19E r13, C16440t3 r14, C15860rz r15, C208211s r16, AnonymousClass16P r17, C19410yO r18, C17190ug r19, C49602Uf r20, AnonymousClass133 r21, C16320sq r22) {
        this.A0A = r14;
        this.A03 = r9;
        this.A02 = r8;
        C16320sq r6 = r22;
        this.A0I = r6;
        this.A08 = r12;
        this.A0F = r19;
        AnonymousClass16P r4 = r17;
        this.A0D = r4;
        this.A0G = r20;
        this.A09 = r13;
        C208211s r3 = r16;
        this.A0C = r3;
        this.A0B = r15;
        C19410yO r5 = r18;
        this.A0E = r5;
        this.A04 = new AnonymousClass27H(r14, r15, r3, r4, r5, r6);
        this.A06 = r10;
        this.A07 = r11;
        this.A0H = r21;
    }

    public void A00() {
        this.A0G.APg();
        C16440t3 r4 = this.A0A;
        C14870pt r2 = this.A03;
        this.A01 = new AnonymousClass2UO(this.A02, r2, this.A05, r4, this.A0F);
    }

    public void A01(AnonymousClass4M6 r9) {
        long A012 = this.A04.A01();
        if (A012 == -1) {
            Log.e("CompanionDeviceQrHandler/startPairDevice invalid local ts");
            this.A0G.ASJ();
            return;
        }
        A00();
        this.A0I.Acl(new RunnableRunnableShape0S0200100_I0(this, r9, 0, A012));
    }

    public final void A02(AnonymousClass4M6 r18, long j2, boolean z2) {
        C15860rz r0 = this.A0B;
        int A022 = r0.A02();
        int A012 = r0.A01();
        AnonymousClass27H r4 = this.A04;
        AnonymousClass27I A002 = AnonymousClass27H.A00(A022, A012, j2);
        AnonymousClass4M6 r11 = r18;
        try {
            AnonymousClass1WL r02 = r11.A00;
            AnonymousClass00B.A06(r02);
            byte[] bArr = r02.A00.A01;
            C36431nX r03 = (C36431nX) r4.A03.A00.submit(new IDxCallableShape148S0100000_2_I0(r4, 8)).get();
            AnonymousClass00B.A06(r03);
            C36671nv r8 = r03.A00;
            C30351cD r9 = r03.A01.A00;
            byte[] A042 = C28641Wx.A04(AnonymousClass01S.A0B, A002.A02(), bArr);
            C53952gZ r3 = (C53952gZ) AnonymousClass27T.A05.A0U();
            C28631Ww A003 = A002.A00();
            r3.A03();
            AnonymousClass27T r1 = (AnonymousClass27T) r3.A00;
            r1.A00 |= 1;
            r1.A03 = A003;
            byte[] bArr2 = r9.A01;
            C28631Ww A013 = C28631Ww.A01(bArr2, 0, bArr2.length);
            r3.A03();
            AnonymousClass27T r12 = (AnonymousClass27T) r3.A00;
            r12.A00 |= 2;
            r12.A01 = A013;
            byte[] A062 = C28851Ya.A06(r8, A042);
            C28631Ww A014 = C28631Ww.A01(A062, 0, A062.length);
            r3.A03();
            AnonymousClass27T r13 = (AnonymousClass27T) r3.A00;
            r13.A00 |= 4;
            r13.A02 = A014;
            AnonymousClass27T r2 = (AnonymousClass27T) r3.A02();
            byte[] bArr3 = r11.A02;
            AnonymousClass00B.A06(bArr3);
            byte[] A004 = C40481uC.A00(r2.A02(), bArr3);
            C68253d8 r32 = (C68253d8) C53932gX.A03.A0U();
            C28631Ww A005 = r2.A00();
            r32.A03();
            C53932gX r14 = (C53932gX) r32.A00;
            r14.A00 |= 1;
            r14.A01 = A005;
            C28631Ww A015 = C28631Ww.A01(A004, 0, A004.length);
            r32.A03();
            C53932gX r15 = (C53932gX) r32.A00;
            r15.A00 |= 2;
            r15.A02 = A015;
            AnonymousClass27J A023 = r4.A02(A002);
            this.A03.A0K(new RunnableRunnableShape0S0510000_I0(this, r11, A023, (C53932gX) r32.A02(), r4.A03(A023), 3, z2));
        } catch (Exception e2) {
            throw new RuntimeException("Failed to calculate hmac-sha256", e2);
        } catch (Exception e3) {
            Log.e("CompanionDeviceQrHandler/handleQrCode", e3);
            if ((e3 instanceof ExecutionException) || (e3 instanceof InterruptedException)) {
                this.A03.A0K(new RunnableRunnableShape6S0100000_I0_5(this, 5));
                return;
            }
            throw new RuntimeException("Failed to generate adv protobufs", e3);
        }
    }

    public final void A03(AnonymousClass4M6 r17, AnonymousClass27J r18, C53932gX r19, AnonymousClass27K r20, boolean z2) {
        AnonymousClass2UO r10 = this.A01;
        if (r10 == null) {
            Log.e("CompanionDeviceQrHandler/No devicePairRequestProtocolHelper created");
            return;
        }
        C17190ug r9 = r10.A08;
        String A022 = r9.A02();
        AnonymousClass4M6 r2 = r17;
        r10.A00 = r2;
        AnonymousClass27J r1 = r18;
        r10.A01 = r1;
        r10.A03 = z2;
        String str = r2.A01;
        byte[] bArr = r2.A03;
        long j2 = r18 != null ? r1.A04 : -1;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C28371Vv("ref", str, (C35081lL[]) null));
        arrayList.add(new C28371Vv("pub-key", bArr, (C35081lL[]) null));
        if (!(r19 == null || r20 == null)) {
            arrayList.add(new C28371Vv("device-identity", r19.A02(), (C35081lL[]) null));
            arrayList.add(new C28371Vv("key-index-list", r20.A02(), new C35081lL[]{new C35081lL((String) AppUtils.HANDLER_TS_KEY, j2)}));
        }
        r9.A0A(r10, new C28371Vv(new C28371Vv("pair-device", new C35081lL[0], (C28371Vv[]) arrayList.toArray(new C28371Vv[0])), "iq", new C35081lL[]{new C35081lL((Jid) C34791ks.A00, "to"), new C35081lL("id", A022), new C35081lL("xmlns", "md"), new C35081lL("type", "set")}), A022, 219, 32000);
    }
}
