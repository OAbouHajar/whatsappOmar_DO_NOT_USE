package com.facebook.redex;

import X.AnonymousClass00B;
import X.AnonymousClass02C;
import X.AnonymousClass11Q;
import X.AnonymousClass11S;
import X.AnonymousClass124;
import X.AnonymousClass13O;
import X.AnonymousClass1CB;
import X.AnonymousClass1HE;
import X.AnonymousClass1TV;
import X.AnonymousClass1WE;
import X.AnonymousClass1XP;
import X.AnonymousClass1ZT;
import X.AnonymousClass29T;
import X.AnonymousClass2B7;
import X.AnonymousClass2C0;
import X.AnonymousClass2JF;
import X.AnonymousClass3w0;
import X.AnonymousClass4I7;
import X.AnonymousClass500;
import X.AnonymousClass52U;
import X.C001000l;
import X.C13700nu;
import X.C15830rv;
import X.C16030sJ;
import X.C16040sK;
import X.C16730tY;
import X.C16740tZ;
import X.C16750ta;
import X.C18220wL;
import X.C19000xb;
import X.C209212c;
import X.C219215y;
import X.C26691Ot;
import X.C27711Sv;
import X.C28371Vv;
import X.C28381Vw;
import X.C30621cg;
import X.C42881yp;
import X.C43241zg;
import X.C453428a;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import com.obwhatsapp.jobqueue.job.SendMediaErrorReceiptJob;
import com.obwhatsapp.mediaview.MediaViewFragment;
import com.obwhatsapp.support.ReportSpamDialogFragment;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class IDxNConsumerShape39S0200000_2_I0 implements AnonymousClass1WE {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxNConsumerShape39S0200000_2_I0(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void accept(Object obj) {
        Object obj2;
        AnonymousClass11Q r0;
        String str;
        C16750ta r02;
        byte[] bArr;
        Object obj3 = obj;
        switch (this.A02) {
            case 0:
                obj2 = this.A01;
                r0 = ((AnonymousClass11S) this.A00).A01;
                break;
            case 1:
                obj2 = this.A01;
                r0 = ((AnonymousClass1CB) this.A00).A0G;
                break;
            case 2:
                AnonymousClass2JF r1 = (AnonymousClass2JF) this.A00;
                C30621cg r03 = r1.A0B;
                C15830rv r2 = r1.A00;
                r03.A0A.A08(r2, new AnonymousClass52U((AnonymousClass02C) this.A01, r03, r2));
                return;
            case 3:
                C18220wL r12 = (C18220wL) this.A00;
                Number number = (Number) obj3;
                if (((AnonymousClass1XP) this.A01).A0U != null) {
                    r12.A02.A06(number.intValue());
                    return;
                }
                return;
            case 4:
                ((AtomicInteger) obj3).addAndGet(((C43241zg) this.A01).A01.size());
                return;
            case 5:
                AnonymousClass1HE r5 = (AnonymousClass1HE) this.A00;
                C16730tY r4 = (C16730tY) this.A01;
                if (C27711Sv.A01(r4, false)) {
                    r5.A06.A0a(r4);
                    r5.A0O.Acl(new RunnableRunnableShape0S0211000_I0(r5, r4, 6, true));
                    return;
                }
                return;
            case 6:
                C16730tY r42 = (C16730tY) this.A01;
                AnonymousClass4I7 r52 = (AnonymousClass4I7) obj3;
                synchronized (r42) {
                    C16750ta r3 = r42.A02;
                    AnonymousClass00B.A06(r3);
                    r3.A0P = false;
                    r3.A0Z = true;
                    r3.A0C = 0;
                    r3.A0L = true;
                    r3.A0X = r52.A00;
                    r3.A0Y = r52.A01;
                }
                return;
            case 7:
                C209212c r32 = (C209212c) this.A00;
                C16730tY r6 = (C16730tY) this.A01;
                C28381Vw r53 = r6.A11;
                r32.A0K.A01((AnonymousClass2C0) null, r53, 11);
                C16040sK r22 = r32.A06;
                boolean A0G = r22.A0G();
                AnonymousClass124 r13 = r32.A0b;
                if (A0G) {
                    AnonymousClass1ZT A05 = r22.A05();
                    if (!C16030sJ.A0K(r53.A00) && (r02 = r6.A02) != null && (bArr = r02.A0U) != null) {
                        C19000xb r14 = r13.A00;
                        AnonymousClass00B.A06(r02);
                        AnonymousClass00B.A06(bArr);
                        r14.A00(new SendMediaErrorReceiptJob(A05, r6, (String) null, bArr));
                        return;
                    }
                    return;
                }
                r13.A03(r6);
                return;
            case 8:
                C209212c r7 = (C209212c) this.A00;
                C16730tY r43 = (C16730tY) this.A01;
                Number number2 = (Number) obj3;
                C16750ta r62 = r43.A02;
                AnonymousClass00B.A06(r62);
                long j2 = r43.A01;
                r62.A0C = j2 == 0 ? 0 : (number2.longValue() * 100) / j2;
                r62.A09 = number2.longValue();
                r7.A0J.A08(r43, 8);
                long uptimeMillis = SystemClock.uptimeMillis();
                long j3 = r7.A00;
                if (j3 == 0 || uptimeMillis - j3 >= 500) {
                    r7.A00 = uptimeMillis;
                    r7.A06();
                    return;
                }
                return;
            case 9:
                HashMap hashMap = ((C219215y) this.A00).A0A;
                synchronized (hashMap) {
                    hashMap.remove(obj3);
                }
                return;
            case 10:
                C26691Ot r44 = (C26691Ot) this.A00;
                C16730tY r33 = (C16730tY) this.A01;
                File file = (File) obj3;
                r44.A07.remove(r33);
                C16750ta r23 = r33.A02;
                AnonymousClass00B.A06(r23);
                r23.A0Z = false;
                AnonymousClass00B.A06(r23);
                r23.A0L = false;
                r23.A0F = file;
                r23.A0A = file.length();
                r23.A0O = true;
                C16750ta r15 = r33.A02;
                AnonymousClass00B.A06(r15);
                r23.A0P = (r33.A08 == null || r15.A0F == null) ? C42881yp.A02(r33.A0C, 2) : true;
                r44.A04.A0a(r33);
                return;
            case 11:
                ((C26691Ot) this.A00).A01((C16730tY) this.A01, (Throwable) obj3);
                return;
            case 12:
                MediaViewFragment mediaViewFragment = (MediaViewFragment) this.A00;
                mediaViewFragment.A0I.A05();
                Intent A022 = C13700nu.A02("android.intent.action.VIEW");
                A022.setDataAndType((Uri) obj3, ((C16730tY) this.A01).A06);
                A022.setFlags(1);
                Context A023 = mediaViewFragment.A02();
                AnonymousClass2B7 r04 = mediaViewFragment.A1C;
                if (r04 != null) {
                    r04.ATs();
                }
                mediaViewFragment.A0E.A06(A023, A022);
                return;
            case 13:
                MediaViewFragment mediaViewFragment2 = (MediaViewFragment) this.A00;
                Uri uri = (Uri) obj3;
                mediaViewFragment2.A0I.A05();
                Intent A024 = C13700nu.A02("android.intent.action.VIEW");
                byte b2 = ((C16740tZ) this.A01).A10;
                if (b2 == 1) {
                    str = "image/*";
                    A024.setDataAndType(uri, str);
                } else if (b2 == 3 || b2 == 13) {
                    str = "video/*";
                    A024.setDataAndType(uri, str);
                } else if (b2 != 42 && b2 != 43) {
                    A024.setData(uri);
                } else {
                    return;
                }
                A024.setFlags(1);
                Context A025 = mediaViewFragment2.A02();
                AnonymousClass2B7 r05 = mediaViewFragment2.A1C;
                if (r05 != null) {
                    r05.ATs();
                }
                mediaViewFragment2.A0E.A06(A025, A024);
                return;
            case 14:
                MediaViewFragment mediaViewFragment3 = (MediaViewFragment) this.A00;
                C16740tZ r24 = (C16740tZ) this.A01;
                Boolean bool = (Boolean) obj3;
                C001000l A0C = mediaViewFragment3.A0C();
                if (A0C != null && !AnonymousClass29T.A03(A0C)) {
                    ReportSpamDialogFragment A012 = ReportSpamDialogFragment.A01(mediaViewFragment3.A13, r24.A0C(), new IDxAListenerShape432S0100000_2_I1(mediaViewFragment3, 1), "media_viewer", 0, bool.booleanValue(), false, false, false, true, false);
                    A012.A0C = r24;
                    C453428a.A00(A012, mediaViewFragment3.A0F());
                    return;
                }
                return;
            case 15:
                AnonymousClass3w0 r16 = (AnonymousClass3w0) this.A00;
                r16.A00 = (List) obj3;
                ((AnonymousClass1TV) this.A01).AWJ(r16);
                return;
            default:
                AnonymousClass13O r34 = (AnonymousClass13O) this.A00;
                r34.A0D.A08(new AnonymousClass500(r34, (C28371Vv) this.A01));
                return;
        }
        r0.A03(obj2);
    }
}
