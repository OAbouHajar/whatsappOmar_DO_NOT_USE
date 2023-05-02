package X;

import android.util.Pair;
import com.obwhatsapp.jobqueue.job.RehydrateHsmJob;
import com.obwhatsapp.jobqueue.job.RehydrateTemplateJob;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.1TD  reason: invalid class name */
public class AnonymousClass1TD {
    public final C16300so A00;
    public final C19000xb A01;
    public final AnonymousClass1TC A02;
    public final C16440t3 A03;
    public final C16980tz A04;
    public final AnonymousClass013 A05;
    public final C16460t6 A06;
    public final AnonymousClass153 A07;
    public final AnonymousClass173 A08;
    public final C14710pd A09;
    public final C27541Sd A0A;
    public final C222517f A0B;
    public final AnonymousClass124 A0C;
    public final C222617g A0D;

    public AnonymousClass1TD(C16300so r1, C19000xb r2, AnonymousClass1TC r3, C16440t3 r4, C16980tz r5, AnonymousClass013 r6, C16460t6 r7, AnonymousClass153 r8, AnonymousClass173 r9, C14710pd r10, C27541Sd r11, C222517f r12, AnonymousClass124 r13, C222617g r14) {
        this.A03 = r4;
        this.A0C = r13;
        this.A0B = r12;
        this.A01 = r2;
        this.A05 = r6;
        this.A0D = r14;
        this.A06 = r7;
        this.A07 = r8;
        this.A00 = r1;
        this.A08 = r9;
        this.A0A = r11;
        this.A02 = r3;
        this.A04 = r5;
        this.A09 = r10;
    }

    public final Pair A00(C30861d5 r19, C82764Eb r20, C33211iD r21, C30161br r22) {
        AnonymousClass23S r1;
        C30161br r0 = r22;
        int i2 = r0.A01;
        if (i2 == 0) {
            r19.A08 = 1;
            C33211iD r8 = r21;
            try {
                C59022uY r4 = r8.A0k;
                if (r4 == null) {
                    r4 = C59022uY.A06;
                }
                C28381Vw r12 = r0.A0C;
                if (r12 == null) {
                    r12 = r0.A0m;
                }
                String obj = r12.toString();
                if (r4.A01 == 1) {
                    C59012uX A0c = r4.A0c();
                    if (A0c.A0c() == C800642k.A02) {
                        C41061vA.A0C(A0c.A01 == 2 ? (C455029b) A0c.A05 : C455029b.A0A, obj);
                    }
                    if ((A0c.A00 & 32) == 32) {
                        C455029b r13 = A0c.A03;
                        if (r13 == null) {
                            r13 = C455029b.A0A;
                        }
                        C41061vA.A0C(r13, obj);
                        if ((A0c.A00 & 64) == 64) {
                            C455029b r14 = A0c.A03;
                            if (r14 == null) {
                                r14 = C455029b.A0A;
                            }
                            C41061vA.A0C(r14, obj);
                        }
                        long A002 = this.A03.A00();
                        C19000xb r15 = this.A01;
                        C222617g r9 = this.A0D;
                        AnonymousClass013 r5 = this.A05;
                        String str = r0.A0o;
                        C15830rv A003 = C16030sJ.A00(r0.A0k);
                        AnonymousClass00B.A06(A003);
                        r15.A00(new RehydrateTemplateJob(r5, A003, C16030sJ.A00(r0.A08), r8, r9, r0.A0P, str, r0.A05, r0.A02, r0.A0j, 86400000 + A002));
                        return new Pair(Boolean.TRUE, Boolean.FALSE);
                    }
                    StringBuilder sb = new StringBuilder("MessageUtils/validateTemplateMessage/error no content for template message, message key=");
                    sb.append(obj);
                    Log.e(sb.toString());
                    r1 = new AnonymousClass23S(0);
                } else {
                    r1 = new AnonymousClass23S(0);
                }
                throw r1;
            } catch (AnonymousClass23S unused) {
                this.A0C.A01(C16030sJ.A00(r0.A0k), C16030sJ.A00(r0.A08), 1008, r0.A0o, "content", (String) null);
                return new Pair(Boolean.FALSE, Boolean.TRUE);
            }
        } else {
            StringBuilder sb2 = new StringBuilder("decryptioncallbackv2/invalid-edit-version edit=");
            sb2.append(i2);
            sb2.append(", type=hsm, id=");
            sb2.append(r0.A0o);
            Log.e(sb2.toString());
            r20.A00.A01(19);
            Boolean bool = Boolean.TRUE;
            return new Pair(bool, bool);
        }
    }

    public final C16740tZ A01(C30861d5 r19, C59022uY r20, C30161br r21, C222617g r22) {
        r19.A08 = 1;
        C30161br r0 = r21;
        C28381Vw r1 = r0.A0C;
        if (r1 == null) {
            r1 = r0.A0m;
        }
        String obj = r1.toString();
        C59022uY r6 = r20;
        if ((r6.A00 & 16) == 16) {
            C59032uZ r4 = r6.A03;
            if (r4 == null) {
                r4 = C59032uZ.A07;
            }
            if (r4.A0c() == C800742l.A02 && r4.A01 != 2) {
                StringBuilder sb = new StringBuilder("MessageUtil/validateHydratedTemplateMessage/error no title with text title, message key=");
                sb.append(obj);
                Log.w(sb.toString());
                throw new AnonymousClass23S(0);
            } else if ((r4.A00 & 32) == 32) {
                String str = r0.A0o;
                Jid jid = r0.A0k;
                C15830rv A002 = C16030sJ.A00(jid);
                AnonymousClass00B.A06(A002);
                long j2 = r0.A0j;
                C222617g r7 = r22;
                C16740tZ A012 = C439021z.A01(A002, UserJid.of(C16030sJ.A00(r0.A08)), r6, r7, r0.A0P, r0.A0M, str, r0.A0W, r0.A05, r0.A02, j2, false, false);
                if (A012 != null) {
                    return A012;
                }
                this.A0C.A01(C16030sJ.A00(jid), C16030sJ.A00(r0.A08), (Integer) null, str, (String) null, (String) null);
                return null;
            } else {
                StringBuilder sb2 = new StringBuilder("MessageUtil/validateHydratedTemplateMessage/error no content, message key=");
                sb2.append(obj);
                Log.w(sb2.toString());
                throw new AnonymousClass23S(0);
            }
        } else {
            throw new AnonymousClass23S(0);
        }
    }

    public final boolean A02(C30861d5 r20, C82764Eb r21, C33211iD r22, C30161br r23) {
        C30161br r1 = r23;
        int i2 = r1.A01;
        if (i2 == 0) {
            r20.A08 = 1;
            C28381Vw r0 = r1.A0C;
            if (r0 == null) {
                r0 = r1.A0m;
            }
            String obj = r0.toString();
            C33211iD r8 = r22;
            if (r8.A0e()) {
                C455029b r02 = r8.A0M;
                if (r02 == null) {
                    r02 = C455029b.A0A;
                }
                C41061vA.A0C(r02, obj);
                long A002 = this.A03.A00();
                C19000xb r03 = this.A01;
                AnonymousClass013 r5 = this.A05;
                C222617g r9 = this.A0D;
                String str = r1.A0o;
                C15830rv A003 = C16030sJ.A00(r1.A0k);
                AnonymousClass00B.A06(A003);
                r03.A00(new RehydrateHsmJob(r5, A003, C16030sJ.A00(r1.A08), r8, r9, r1.A0P, (Long) null, str, r1.A05, r1.A02, r1.A0j, 86400000 + A002));
                return false;
            }
            throw new AnonymousClass23S(0);
        }
        StringBuilder sb = new StringBuilder("decryptioncallbackv2/invalid-edit-version edit=");
        sb.append(i2);
        sb.append(", type=hsm, id=");
        sb.append(r1.A0o);
        Log.e(sb.toString());
        r21.A00.A01(19);
        return true;
    }
}
