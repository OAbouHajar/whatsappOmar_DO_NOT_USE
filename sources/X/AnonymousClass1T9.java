package X;

import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.1T9  reason: invalid class name */
public class AnonymousClass1T9 {
    public final AnonymousClass1T6 A00;
    public final AnonymousClass1T7 A01;
    public final AnonymousClass1T8 A02;
    public final C207811o A03;

    public AnonymousClass1T9(AnonymousClass1T6 r1, AnonymousClass1T7 r2, AnonymousClass1T8 r3, C207811o r4) {
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public C30881d7 A00(C28861Yb r94, C30861d5 r95, C30161br r96, Integer num, boolean z2) {
        int i2;
        C30161br r10 = r96;
        C30821d1 r0 = r10.A0A;
        C30861d5 r44 = r95;
        boolean z3 = z2;
        if (r0 == null && (r0 = r10.A09) == null) {
            i2 = 0;
        } else {
            i2 = r0.A01;
            if (i2 == 1) {
                if (z2) {
                    AnonymousClass00B.A0C("Only message stanza is supported for enc v1", r10 instanceof C30161br);
                    r44.A0B = 1L;
                    return new C52692eI((C16460t6) this.A01.A00.A01.A5k.get(), r10);
                }
                throw new IllegalStateException("receipt sending has been disabled for a v1 encrypted message");
            } else if (i2 == 2) {
                r44.A0B = 2L;
                C16150sX r02 = this.A02.A00.A01;
                C16440t3 r42 = (C16440t3) r02.AP2.get();
                C14710pd r41 = (C14710pd) r02.A05.get();
                C14870pt r40 = (C14870pt) r02.AB3.get();
                C16300so r39 = (C16300so) r02.A5p.get();
                C16040sK r38 = (C16040sK) r02.ADr.get();
                C16980tz r37 = (C16980tz) r02.AQB.get();
                C16320sq r36 = (C16320sq) r02.ARB.get();
                JniBridge instance = JniBridge.getInstance();
                C16340ss.A01(instance);
                C15810rt r35 = (C15810rt) r02.A43.get();
                C16490t9 r34 = (C16490t9) r02.AQz.get();
                AnonymousClass124 r33 = (AnonymousClass124) r02.ALe.get();
                C222517f r32 = (C222517f) r02.AKh.get();
                C19000xb r31 = (C19000xb) r02.AQX.get();
                C16000sG r30 = (C16000sG) r02.A4x.get();
                C18030w2 r29 = (C18030w2) r02.A6W.get();
                C18020w1 r28 = (C18020w1) r02.AF7.get();
                AnonymousClass013 r27 = (AnonymousClass013) r02.AR8.get();
                C222617g r26 = (C222617g) r02.A8a.get();
                C18290wS r25 = (C18290wS) r02.AIB.get();
                C16460t6 r24 = (C16460t6) r02.A5k.get();
                AnonymousClass1TD r23 = (AnonymousClass1TD) r02.ABp.get();
                C208211s r22 = (C208211s) r02.AMX.get();
                AnonymousClass1GF r21 = (AnonymousClass1GF) r02.AMc.get();
                C223417o r20 = (C223417o) r02.AFK.get();
                C18300wT r19 = (C18300wT) r02.AHn.get();
                AnonymousClass1TC r18 = (AnonymousClass1TC) r02.AJT.get();
                C207811o r17 = (C207811o) r02.ADe.get();
                C17030uP r16 = (C17030uP) r02.APp.get();
                C18180wH A0S = C16150sX.A0S(r02);
                C208211s r59 = r22;
                AnonymousClass1GG r60 = (AnonymousClass1GG) r02.A64.get();
                C15810rt r61 = r35;
                C16460t6 r62 = r24;
                C223417o r63 = r20;
                C221116r r64 = (C221116r) r02.AHt.get();
                AnonymousClass15H r65 = (AnonymousClass15H) r02.AQZ.get();
                AnonymousClass137 r66 = (AnonymousClass137) r02.A6f.get();
                AnonymousClass173 r67 = (AnonymousClass173) r02.AHL.get();
                C18030w2 r68 = r29;
                C27731Sx r69 = (C27731Sx) r02.A7t.get();
                C14710pd r70 = r41;
                C16490t9 r71 = r34;
                C30861d5 r72 = r44;
                C27541Sd r73 = (C27541Sd) r02.A6O.get();
                AnonymousClass1TD r74 = r23;
                C222517f r75 = r32;
                AnonymousClass124 r76 = r33;
                C207811o r77 = r17;
                AnonymousClass1GP r78 = (AnonymousClass1GP) r02.AH4.get();
                C18300wT r79 = r19;
                AnonymousClass17Y r80 = (AnonymousClass17Y) r02.AHs.get();
                AnonymousClass12K r81 = (AnonymousClass12K) r02.AI2.get();
                C18090w8 r82 = (C18090w8) r02.AI6.get();
                C18290wS r83 = r25;
                AnonymousClass1GF r84 = r21;
                C30161br r85 = r10;
                C222617g r86 = r26;
                AnonymousClass1TS r87 = (AnonymousClass1TS) r02.AGj.get();
                AnonymousClass1H2 r88 = (AnonymousClass1H2) r02.AFJ.get();
                C16320sq r89 = r36;
                return new C52702eJ(r39, r40, r38, r28, r31, (C17150uc) r02.A34.get(), r18, (C222017a) r02.APF.get(), r30, r16, A0S, r42, r37, r27, r94, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, instance, num, z3);
            }
        }
        C16150sX r2 = this.A00.A00.A01;
        return new C52682eH(r44, (C27541Sd) r2.A6O.get(), (C222517f) r2.AKh.get(), (C30841d3) this.A03.A00(0, r10.A06), r10, i2, z3);
    }
}
