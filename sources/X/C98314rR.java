package X;

/* renamed from: X.4rR  reason: invalid class name and case insensitive filesystem */
public final class C98314rR implements C32591gd {
    public final AnonymousClass45F A00;
    public final AnonymousClass5UZ A01;
    public final AnonymousClass45G A02;

    public C98314rR(AnonymousClass45F r1, AnonymousClass5UZ r2, AnonymousClass45G r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public static int A00(C84184Jo r2, byte[] bArr, int i2, int i3, int i4) {
        if ((i2 >>> 3) != 0) {
            int i5 = i2 & 7;
            if (i5 == 0) {
                return C90724eh.A02(r2, bArr, i3);
            }
            if (i5 == 1) {
                return i3 + 8;
            }
            if (i5 == 2) {
                return C90724eh.A01(r2, bArr, i3) + r2.A00;
            }
            if (i5 == 3) {
                int i6 = (i2 & -8) | 4;
                int i7 = 0;
                while (i3 < i4) {
                    i3 = C90724eh.A01(r2, bArr, i3);
                    i7 = r2.A00;
                    if (i7 == i6) {
                        break;
                    }
                    i3 = A00(r2, bArr, i7, i3, i4);
                }
                if (i3 <= i4 && i7 == i6) {
                    return i3;
                }
                throw new AnonymousClass40G("Failed to parse the message.");
            } else if (i5 == 5) {
                return i3 + 4;
            }
        }
        throw new AnonymousClass40G("Protocol message contained an invalid tag (zero).");
    }

    public final boolean A8b(Object obj, Object obj2) {
        return ((AnonymousClass3Z1) obj).zzjp.equals(((AnonymousClass3Z1) obj2).zzjp);
    }

    public final int AHj(Object obj) {
        return ((AnonymousClass3Z1) obj).zzjp.hashCode();
    }

    public final Object ALj() {
        return ((C98294rP) ((AnonymousClass3Z1) this.A01).A07(5)).AjB();
    }

    public final void Aiv(C107915Lx r2, Object obj) {
        throw AnonymousClass000.A0W("zzjv");
    }

    public final void Aiw(C84184Jo r14, Object obj, byte[] bArr, int i2, int i3) {
        int i4;
        int i5 = i2;
        C90134dY A012 = AnonymousClass3Z1.A01(obj);
        while (true) {
            i4 = i3;
            if (i5 >= i4) {
                break;
            }
            C84184Jo r7 = r14;
            byte[] bArr2 = bArr;
            i5 = C90724eh.A01(r14, bArr2, i5);
            int i6 = r14.A00;
            if (i6 != 11) {
                i5 = (i6 & 7) == 2 ? C90724eh.A00(r7, A012, bArr2, i6, i5, i4) : A00(r14, bArr2, i6, i5, i4);
            } else {
                int i7 = 0;
                Object obj2 = null;
                while (i5 < i4) {
                    i5 = C90724eh.A01(r14, bArr2, i5);
                    int i8 = r14.A00;
                    int i9 = i8 >>> 3;
                    int i10 = i8 & 7;
                    if (i9 != 2) {
                        if (i9 == 3 && i10 == 2) {
                            i5 = C90724eh.A03(r14, bArr2, i5);
                            obj2 = r14.A02;
                        }
                    } else if (i10 == 0) {
                        i5 = C90724eh.A01(r14, bArr2, i5);
                        i7 = r14.A00;
                    }
                    if (i8 == 12) {
                        break;
                    }
                    i5 = A00(r14, bArr2, i8, i5, i4);
                }
                if (obj2 != null) {
                    A012.A01((i7 << 3) | 2, obj2);
                }
            }
        }
        if (i5 != i4) {
            throw new AnonymousClass40G("Failed to parse the message.");
        }
    }

    public final void AjE(Object obj) {
        ((AnonymousClass3Z1) obj).zzjp.A02 = false;
        throw AnonymousClass000.A0W("zzjv");
    }

    public final void AjF(Object obj, Object obj2) {
        C90954f8.A0R(obj, obj2);
    }

    public final int AjN(Object obj) {
        C90134dY r7 = ((AnonymousClass3Z1) obj).zzjp;
        int i2 = r7.A01;
        if (i2 == -1) {
            i2 = 0;
            for (int i3 = 0; i3 < r7.A00; i3++) {
                i2 += 2 + 1 + C32561ga.A00(r7.A03[i3] >>> 3) + C32561ga.A02((AnonymousClass556) r7.A04[i3], 3);
            }
            r7.A01 = i2;
        }
        return i2;
    }

    public final boolean AjP(Object obj) {
        throw AnonymousClass000.A0W("zzjv");
    }
}
