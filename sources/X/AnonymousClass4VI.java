package X;

import com.mod2.fblibs.FacebookFacade;
import com.obwhatsapp.youbasha.ui.lockV2.LockUtils;
import java.util.List;

/* renamed from: X.4VI  reason: invalid class name */
public final class AnonymousClass4VI {
    public final C28371Vv A00;
    public final AnonymousClass4VF A01;
    public final C86454St A02;
    public final C86464Su A03;
    public final C86674Ts A04;
    public final C86684Tt A05;
    public final C86694Tu A06;
    public final C86474Sv A07;
    public final C86704Tv A08;
    public final C86484Sw A09;
    public final C86714Tw A0A;
    public final C86494Sx A0B;
    public final C86724Tx A0C;
    public final C86504Sy A0D;
    public final C86514Sz A0E;
    public final AnonymousClass4T0 A0F;
    public final C86744Tz A0G;
    public final List A0H;

    public AnonymousClass4VI(C16300so r12, C28371Vv r13) {
        Object obj;
        C28371Vv r4 = r13;
        C28371Vv.A06(r13, "group");
        this.A01 = (AnonymousClass4VF) C32271fx.A03(r13, AnonymousClass3K3.A0X(r12, 67), new String[0]);
        try {
            obj = C32271fx.A03(r13, AnonymousClass3K3.A0X(r12, 68), new String[0]);
        } catch (AnonymousClass1W9 unused) {
            obj = null;
        }
        this.A0G = (C86744Tz) obj;
        this.A04 = (C86674Ts) AnonymousClass3K2.A0e(r12, r13, new String[]{FacebookFacade.RequestParameter.DESCRIPTION}, 70);
        this.A09 = (C86484Sw) AnonymousClass3K2.A0e(r12, r13, new String[]{LockUtils.PATTERN_LOCK}, 66);
        this.A02 = (C86454St) AnonymousClass3K2.A0e(r12, r13, new String[]{"announcement"}, 75);
        this.A0C = (C86724Tx) AnonymousClass3K2.A0e(r12, r13, new String[]{"parent"}, 78);
        this.A0B = (C86494Sx) AnonymousClass3K2.A0e(r12, r13, new String[]{"no_frequently_forwarded"}, 79);
        this.A0E = (C86514Sz) AnonymousClass3K2.A0e(r12, r13, new String[]{"support"}, 77);
        this.A05 = (C86684Tt) AnonymousClass3K2.A0e(r12, r13, new String[]{"ephemeral"}, 74);
        this.A0F = (AnonymousClass4T0) AnonymousClass3K2.A0e(r12, r13, new String[]{"suspended"}, 76);
        this.A06 = (C86694Tu) AnonymousClass3K2.A0e(r12, r13, new String[]{"growth_locked"}, 80);
        this.A03 = (C86464Su) AnonymousClass3K2.A0e(r12, r13, new String[]{"default_sub_group"}, 65);
        this.A0D = (C86504Sy) AnonymousClass3K2.A0e(r12, r13, new String[]{"shadow"}, 71);
        this.A0A = (C86714Tw) AnonymousClass3K2.A0e(r12, r13, new String[]{"membership_approval_mode"}, 73);
        this.A07 = (C86474Sv) AnonymousClass3K2.A0e(r12, r13, new String[]{"incognito"}, 69);
        this.A08 = (C86704Tv) AnonymousClass3K2.A0e(r12, r13, new String[]{"linked_parent"}, 72);
        this.A0H = C32271fx.A07(r4, AnonymousClass3K3.A0X(r12, 81), new String[]{"participant"}, 0, 19999);
        this.A00 = r13;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass4VI.class != obj.getClass()) {
                return false;
            }
            AnonymousClass4VI r5 = (AnonymousClass4VI) obj;
            if (!C34901l3.A00(this.A04, r5.A04) || !C34901l3.A00(this.A09, r5.A09) || !C34901l3.A00(this.A02, r5.A02) || !C34901l3.A00(this.A0C, r5.A0C) || !C34901l3.A00(this.A0B, r5.A0B) || !C34901l3.A00(this.A0E, r5.A0E) || !C34901l3.A00(this.A05, r5.A05) || !C34901l3.A00(this.A0F, r5.A0F) || !C34901l3.A00(this.A06, r5.A06) || !C34901l3.A00(this.A03, r5.A03) || !C34901l3.A00(this.A0D, r5.A0D) || !C34901l3.A00(this.A0A, r5.A0A) || !C34901l3.A00(this.A07, r5.A07) || !C34901l3.A00(this.A08, r5.A08) || !this.A0H.equals(r5.A0H) || !this.A01.equals(r5.A01) || !C34901l3.A00(this.A0G, r5.A0G)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[17];
        objArr[0] = this.A04;
        objArr[1] = this.A09;
        objArr[2] = this.A02;
        objArr[3] = this.A0C;
        objArr[4] = this.A0B;
        objArr[5] = this.A0E;
        objArr[6] = this.A05;
        objArr[7] = this.A0F;
        objArr[8] = this.A06;
        objArr[9] = this.A03;
        objArr[10] = this.A0D;
        objArr[11] = this.A0A;
        objArr[12] = this.A07;
        objArr[13] = this.A08;
        objArr[14] = this.A0H;
        objArr[15] = this.A01;
        return AnonymousClass000.A0F(this.A0G, objArr, 16);
    }
}
