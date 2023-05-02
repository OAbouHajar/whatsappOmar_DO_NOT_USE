package X;

import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Base64;
import com.obwhatsapp.R;
import java.math.BigDecimal;
import java.util.Map;

/* renamed from: X.61j  reason: invalid class name and case insensitive filesystem */
public final class C1203661j implements AnonymousClass1IH {
    public final C16980tz A00;
    public final AnonymousClass013 A01;
    public final C18300wT A02;
    public final AnonymousClass174 A03;
    public final C18290wS A04;

    public C1203661j(C16980tz r1, AnonymousClass013 r2, C18300wT r3, AnonymousClass174 r4, C18290wS r5) {
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = r5;
        this.A02 = r3;
        this.A03 = r4;
    }

    public Class A8z() {
        return C115005ox.class;
    }

    public /* bridge */ /* synthetic */ Object AcV(Enum enumR, Object obj, Map map) {
        C30681cm A012;
        C35431lv r3;
        boolean z2;
        int i2;
        C30671cl r8 = (C30671cl) obj;
        C115005ox r7 = (C115005ox) enumR;
        boolean A19 = C110115dX.A19(r8, r7);
        boolean z3 = true;
        switch (C110115dX.A01(r7, C115445pl.A00)) {
            case 1:
                return r8.A0A;
            case 2:
                String str = r8.A07.A03;
                if (!"UNSET".equals(str)) {
                    return str;
                }
                C30681cm A013 = this.A03.A01();
                if (A013 != null) {
                    return A013.A03;
                }
                return null;
            case 3:
                return C119405xi.A05(this.A00.A00, r8, this.A04, false);
            case 4:
                return r8.A0B;
            case 5:
                int A042 = r8.A04();
                return A042 == A19 ? "DEBIT" : A042 == 2 ? "BANK" : A042 == 3 ? "WALLET" : A042 == 4 ? "CREDIT" : A042 == 5 ? "MERCHANT" : A042 == 6 ? "COMBO" : A042 == 7 ? "CARD_UNSET" : A042 == 8 ? "PREPAID" : "UNKNOWN";
            case 6:
                return "UNKNOWN";
            case 7:
                return Long.valueOf(r8.A05);
            case 8:
                return Long.valueOf(r8.A06);
            case 9:
                i2 = r8.A01;
                break;
            case 10:
                i2 = r8.A00;
                break;
            case 11:
                i2 = r8.A03;
                break;
            case 12:
                i2 = r8.A02;
                break;
            case 13:
                if (!(r8 instanceof C35371lp) || (A012 = this.A03.A01()) == null) {
                    return null;
                }
                C28411Vz r4 = A012.A02;
                BigDecimal bigDecimal = ((C35371lp) r8).A01.A00;
                int i3 = ((C35491m1) r4).A01;
                long longValue = bigDecimal.scaleByPowerOfTen(i3).longValue();
                int intValue = new BigDecimal(A19 ? 1 : 0).scaleByPowerOfTen(i3).intValue();
                if (intValue <= 0) {
                    return r3;
                }
                r3 = new C35431lv(r4, intValue, longValue);
                return r3;
            case 14:
                if (r8 instanceof C35371lp) {
                    return Long.valueOf(((C35371lp) r8).A00);
                }
                return null;
            case 15:
                byte[] bArr = r8.A0D;
                if (bArr != null) {
                    return Base64.encodeToString(bArr, 2);
                }
                if (r8 instanceof C35391lr) {
                    return C37741pe.A07(BitmapFactory.decodeResource(C16980tz.A00(this.A00), R.drawable.av_card));
                }
                if (r8 instanceof C35521m4) {
                    return C37741pe.A07(BitmapFactory.decodeResource(C16980tz.A00(this.A00), R.drawable.av_bank));
                }
                return null;
            case 16:
                C18300wT r0 = this.A02;
                String str2 = r8.A0A;
                String[] split = r0.A05().split(";");
                int length = split.length;
                int i4 = 0;
                while (true) {
                    if (i4 < length) {
                        String str3 = split[i4];
                        if (TextUtils.isEmpty(str3) || !str3.equalsIgnoreCase(str2)) {
                            i4++;
                        } else {
                            z2 = true;
                        }
                    } else {
                        z2 = false;
                    }
                }
                return Boolean.valueOf(z2);
            case 17:
                return r8.A08;
            default:
                throw new AnonymousClass2Xe();
        }
        if (i2 != 2) {
            z3 = false;
        }
        return Boolean.valueOf(z3);
    }
}
