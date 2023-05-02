package X;

/* renamed from: X.4sa  reason: invalid class name and case insensitive filesystem */
public final class C98544sa implements AnonymousClass5TK {
    public final AnonymousClass45K A00;
    public final C109905Uc A01;
    public final AnonymousClass45M A02;

    public C98544sa(AnonymousClass45K r1, C109905Uc r2, AnonymousClass45M r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final int Ail(Object obj) {
        return ((C67293bJ) obj).zzb.hashCode();
    }

    public final Object Ain() {
        return ((C98524sY) ((C67293bJ) this.A01).A08(5)).AjK();
    }

    public final boolean Ais(Object obj, Object obj2) {
        return ((C67293bJ) obj).zzb.equals(((C67293bJ) obj2).zzb);
    }

    public final void Aix(AnonymousClass5M8 r2, Object obj) {
        throw AnonymousClass000.A0W("zzc");
    }

    public final void Aiy(C88174a4 r3, Object obj, byte[] bArr, int i2, int i3) {
        C67293bJ r4 = (C67293bJ) obj;
        if (r4.zzb == C90144dZ.A05) {
            r4.zzb = C90144dZ.A00();
        }
        throw AnonymousClass000.A0W("zza");
    }

    public final int Aj1(Object obj) {
        C90144dZ r7 = ((C67293bJ) obj).zzb;
        int i2 = r7.A01;
        if (i2 == -1) {
            i2 = 0;
            for (int i3 = 0; i3 < r7.A00; i3++) {
                i2 += 2 + 1 + C32531gX.A00(r7.A03[i3] >>> 3) + C32531gX.A03((AnonymousClass557) r7.A04[i3], 3);
            }
            r7.A01 = i2;
        }
        return i2;
    }

    public final void Aj9(Object obj, Object obj2) {
        C90944f7.A0S(obj, obj2);
    }

    public final void AjE(Object obj) {
        ((C67293bJ) obj).zzb.A02 = false;
        throw AnonymousClass000.A0W("zzc");
    }

    public final boolean AjI(Object obj) {
        throw AnonymousClass000.A0W("zzc");
    }
}
