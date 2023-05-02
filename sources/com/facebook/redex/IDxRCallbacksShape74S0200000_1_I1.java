package com.facebook.redex;

import X.AnonymousClass14R;
import X.AnonymousClass1I5;
import X.AnonymousClass1Z6;
import X.AnonymousClass2JT;
import X.AnonymousClass2JU;
import X.AnonymousClass2JV;
import X.AnonymousClass4R8;
import X.C13680ns;
import X.C13690nt;
import X.C14870pt;
import X.C16320sq;
import X.C16460t6;
import X.C18450wi;
import X.C19750yw;
import X.C25271Jd;
import X.C25371Jn;
import X.C25381Jo;
import X.C25911Lp;
import X.C448025p;
import X.C62743Et;
import X.C62753Eu;
import X.C813047q;
import android.app.Activity;
import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public class IDxRCallbacksShape74S0200000_1_I1 implements C448025p {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxRCallbacksShape74S0200000_1_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A01 = obj2;
        this.A00 = obj;
    }

    public void A5s(AnonymousClass2JT r34) {
        C14870pt r0;
        RunnableRunnableShape0S3410000_I1 runnableRunnableShape0S3410000_I1;
        C14870pt r02;
        RunnableRunnableShape0S3410000_I1 runnableRunnableShape0S3410000_I12;
        AnonymousClass2JT r5 = r34;
        switch (this.A02) {
            case 0:
                C19750yw r4 = (C19750yw) this.A00;
                AnonymousClass2JU r3 = (AnonymousClass2JU) this.A01;
                AnonymousClass1I5 r1 = (AnonymousClass1I5) r5.A02;
                if (r5.A00 == 0) {
                    try {
                        AnonymousClass2JV A012 = r1.A01((JSONObject) r1.A00);
                        r4.A02(A012);
                        Log.i("BanAppealRepository/clearFormReviewDraft");
                        C13690nt.A0v(r4.A04.A0K(), "support_ban_appeal_form_review_draft");
                        r3.AYA(A012);
                        return;
                    } catch (Exception unused) {
                        r4.A01(r5, r3);
                        return;
                    }
                } else {
                    r4.A01(r5, r3);
                    return;
                }
            case 1:
                C18450wi.A0H(r5, 0);
                if (r5.A00 == 0) {
                    C25911Lp r42 = (C25911Lp) r5.A02;
                    C62743Et r52 = (C62743Et) this.A01;
                    C25381Jo r32 = r52.A06;
                    Object obj = r42.A00;
                    C18450wi.A0F(obj);
                    C18450wi.A0B(obj);
                    String A002 = r32.A00((String) obj, r52.A07, r52.A0C);
                    if (A002 == null) {
                        Activity activity = r52.A00;
                        AnonymousClass4R8 r43 = r52.A03;
                        r0 = r52.A02;
                        runnableRunnableShape0S3410000_I1 = new RunnableRunnableShape0S3410000_I1(activity, r43, r52, (Object) null, (String) null, A002, "extensions-decryption-failed-exception", 0, true);
                    } else if (r42.A00 == 0) {
                        Activity activity2 = r52.A00;
                        AnonymousClass4R8 r11 = r52.A03;
                        r02 = r52.A02;
                        runnableRunnableShape0S3410000_I12 = new RunnableRunnableShape0S3410000_I1(activity2, r11, r52, (Object) null, (String) null, A002, (String) null, 0, false);
                        break;
                    } else {
                        String A003 = C813047q.A00(A002);
                        if (A003 == null) {
                            A003 = C18450wi.A04(r52.A00, R.string.str0514);
                        }
                        Activity activity3 = r52.A00;
                        AnonymousClass4R8 r44 = r52.A03;
                        r0 = r52.A02;
                        runnableRunnableShape0S3410000_I1 = new RunnableRunnableShape0S3410000_I1(activity3, r44, r52, (Object) null, A003, (String) null, "extensions-custom-business-error", 0, true);
                    }
                    r0.Acq(runnableRunnableShape0S3410000_I1);
                    return;
                }
                C62743Et r7 = (C62743Et) this.A01;
                UserJid userJid = (UserJid) this.A00;
                AnonymousClass14R r8 = r5.A03;
                Map map = r8.A00;
                Set set = null;
                Set keySet = map == null ? null : map.keySet();
                C18450wi.A0F(keySet);
                String str = keySet.contains(2498061) ? "extensions-business-decryption-error" : "extensions-business-endpoint-response-error";
                if (r7.A0D) {
                    Map map2 = r8.A00;
                    if (map2 != null) {
                        set = map2.keySet();
                    }
                    C18450wi.A0F(set);
                    if (set.contains(2498061)) {
                        Activity activity4 = r7.A00;
                        AnonymousClass4R8 r6 = r7.A03;
                        String str2 = r7.A0B;
                        String str3 = r7.A0A;
                        String str4 = r7.A09;
                        String str5 = r7.A08;
                        boolean z2 = r7.A0E;
                        String str6 = r7.A07;
                        String str7 = r7.A0C;
                        C25381Jo r9 = r7.A06;
                        r9.A01(new C62743Et(activity4, r7.A01, r7.A02, r6, r7.A04, r7.A05, r9, str2, str3, str4, str5, str6, str7, false, z2), userJid, str5, str6, str7, true);
                        return;
                    }
                }
                r7.A02.Acq(new RunnableRunnableShape0S3410000_I1(r7.A00, r7.A03, r7, r8, (String) null, (String) null, str, 0, true));
                return;
            default:
                C18450wi.A0H(r5, 0);
                if (r5.A00 == 0) {
                    C25911Lp r45 = (C25911Lp) r5.A02;
                    C62753Eu r53 = (C62753Eu) this.A01;
                    C25381Jo r33 = r53.A07;
                    Object obj2 = r45.A00;
                    C18450wi.A0F(obj2);
                    C18450wi.A0B(obj2);
                    String A004 = r33.A00((String) obj2, r53.A08, r53.A0D);
                    if (A004 != null) {
                        if (r45.A00 != 0) {
                            String A005 = C813047q.A00(A004);
                            if (A005 == null) {
                                A005 = C18450wi.A04(r53.A00, R.string.str0514);
                            }
                            Activity activity5 = r53.A00;
                            AnonymousClass1Z6 r62 = r53.A04;
                            r02 = r53.A02;
                            runnableRunnableShape0S3410000_I12 = new RunnableRunnableShape0S3410000_I1(activity5, r53, r62, (Object) null, A005, (String) null, "extensions-custom-business-error", 1, true);
                            break;
                        } else {
                            Activity activity6 = r53.A00;
                            AnonymousClass1Z6 r63 = r53.A04;
                            r02 = r53.A02;
                            runnableRunnableShape0S3410000_I12 = new RunnableRunnableShape0S3410000_I1(activity6, r53, r63, (Object) null, (String) null, A004, (String) null, 1, false);
                            break;
                        }
                    } else {
                        Activity activity7 = r53.A00;
                        AnonymousClass1Z6 r64 = r53.A04;
                        r02 = r53.A02;
                        runnableRunnableShape0S3410000_I12 = new RunnableRunnableShape0S3410000_I1(activity7, r53, r64, (Object) null, (String) null, A004, "extensions-decryption-failed-exception", 1, true);
                        break;
                    }
                } else {
                    C62753Eu r13 = (C62753Eu) this.A01;
                    UserJid userJid2 = (UserJid) this.A00;
                    AnonymousClass14R r15 = r5.A03;
                    Map map3 = r15.A00;
                    Set set2 = null;
                    Set keySet2 = map3 == null ? null : map3.keySet();
                    C18450wi.A0F(keySet2);
                    String str8 = keySet2.contains(2498061) ? "extensions-business-decryption-error" : "extensions-business-endpoint-response-error";
                    if (r13.A0E) {
                        Map map4 = r15.A00;
                        if (map4 != null) {
                            set2 = map4.keySet();
                        }
                        C18450wi.A0F(set2);
                        if (set2.contains(2498061)) {
                            Activity activity8 = r13.A00;
                            AnonymousClass1Z6 r112 = r13.A04;
                            C25271Jd r10 = r13.A03;
                            String str9 = r13.A0C;
                            String str10 = r13.A0B;
                            String str11 = r13.A0A;
                            String str12 = r13.A09;
                            boolean z3 = r13.A0F;
                            String str13 = r13.A08;
                            String str14 = r13.A0D;
                            C25381Jo r35 = r13.A07;
                            C25371Jn r2 = r13.A01;
                            C14870pt r12 = r13.A02;
                            String str15 = str9;
                            C25381Jo r24 = r35;
                            C16320sq r23 = r13.A06;
                            C16460t6 r22 = r13.A05;
                            AnonymousClass1Z6 r21 = r112;
                            C25271Jd r20 = r10;
                            C14870pt r19 = r12;
                            C25371Jn r18 = r2;
                            Activity activity9 = activity8;
                            r35.A01(new C62753Eu(activity9, r18, r19, r20, r21, r22, r23, r24, str15, str10, str11, str12, str13, str14, false, z3), userJid2, str12, str13, str14, true);
                            return;
                        }
                    }
                    r13.A02.Acq(new RunnableRunnableShape0S3410000_I1(r13.A00, r13, r13.A04, r15, (String) null, (String) null, str8, 1, true));
                    return;
                }
        }
        r02.Acq(runnableRunnableShape0S3410000_I12);
    }

    public void APZ(IOException iOException) {
        C14870pt r0;
        RunnableRunnableShape0S3410000_I1 runnableRunnableShape0S3410000_I1;
        switch (this.A02) {
            case 0:
                ((AnonymousClass2JU) this.A01).AQv(C13680ns.A0Z());
                return;
            case 1:
                C62743Et r4 = (C62743Et) this.A01;
                Activity activity = r4.A00;
                AnonymousClass4R8 r3 = r4.A03;
                r0 = r4.A02;
                runnableRunnableShape0S3410000_I1 = new RunnableRunnableShape0S3410000_I1(activity, r3, r4, (Object) null, (String) null, (String) null, "extensions-data-exchange-graphql-response-error", 0, true);
                break;
            default:
                C62753Eu r32 = (C62753Eu) this.A01;
                Activity activity2 = r32.A00;
                AnonymousClass1Z6 r42 = r32.A04;
                r0 = r32.A02;
                runnableRunnableShape0S3410000_I1 = new RunnableRunnableShape0S3410000_I1(activity2, r32, r42, (Object) null, (String) null, (String) null, "extensions-data-exchange-graphql-response-error", 1, true);
                break;
        }
        r0.Acq(runnableRunnableShape0S3410000_I1);
    }

    public void AQa(Exception exc) {
        C14870pt r0;
        RunnableRunnableShape0S3410000_I1 runnableRunnableShape0S3410000_I1;
        switch (this.A02) {
            case 0:
                ((AnonymousClass2JU) this.A01).AQv(C13680ns.A0Z());
                return;
            case 1:
                C62743Et r4 = (C62743Et) this.A01;
                Activity activity = r4.A00;
                AnonymousClass4R8 r3 = r4.A03;
                r0 = r4.A02;
                runnableRunnableShape0S3410000_I1 = new RunnableRunnableShape0S3410000_I1(activity, r3, r4, (Object) null, (String) null, (String) null, "extensions-data-exchange-graphql-response-error", 0, true);
                break;
            default:
                C62753Eu r32 = (C62753Eu) this.A01;
                Activity activity2 = r32.A00;
                AnonymousClass1Z6 r42 = r32.A04;
                r0 = r32.A02;
                runnableRunnableShape0S3410000_I1 = new RunnableRunnableShape0S3410000_I1(activity2, r32, r42, (Object) null, (String) null, (String) null, "extensions-data-exchange-graphql-response-error", 1, true);
                break;
        }
        r0.Acq(runnableRunnableShape0S3410000_I1);
    }
}
