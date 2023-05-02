package X;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.mod2.fblibs.FacebookFacade;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.10k  reason: invalid class name and case insensitive filesystem */
public class C205110k extends C205210l {
    public final C16040sK A00;
    public final C16000sG A01;
    public final C16080sP A02;
    public final AnonymousClass01V A03;
    public final C16980tz A04;
    public final C15810rt A05;
    public final C16100sR A06;
    public final C204910i A07;
    public final C19990zK A08;
    public final C17020u3 A09;
    public final C16220sf A0A;

    public C205110k(C16040sK r1, C16000sG r2, C16080sP r3, AnonymousClass01V r4, C16980tz r5, C15810rt r6, C16100sR r7, C204910i r8, C19990zK r9, C17020u3 r10, C16220sf r11) {
        this.A04 = r5;
        this.A08 = r9;
        this.A00 = r1;
        this.A05 = r6;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
        this.A0A = r11;
        this.A09 = r10;
        this.A06 = r7;
        this.A07 = r8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
        if (r0.isBlocked() != false) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C46812Gi A00(X.C16740tZ r7, X.C15880s3 r8) {
        /*
            r6 = this;
            X.1Vw r0 = r7.A11
            X.0rv r4 = r0.A00
            X.AnonymousClass00B.A06(r4)
            X.0sf r1 = r6.A0A
            boolean r0 = r1.A0Q(r4)
            r3 = 0
            if (r0 != 0) goto L_0x004c
            int r5 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r5 < r0) goto L_0x004d
            java.lang.String r0 = r4.getRawString()
            X.1WS r0 = r1.A07(r0)
            X.1v2 r0 = (X.C41001v2) r0
            java.lang.String r1 = r0.A0C()
            X.01V r0 = r6.A03
            android.app.NotificationManager r2 = r0.A08()
            if (r2 == 0) goto L_0x004d
            android.app.NotificationChannel r1 = r2.getNotificationChannel(r1)
            if (r1 == 0) goto L_0x004d
            int r0 = r1.getImportance()
            if (r0 == 0) goto L_0x004c
            r0 = 28
            if (r5 < r0) goto L_0x004d
            java.lang.String r0 = r1.getGroup()
            android.app.NotificationChannelGroup r0 = r2.getNotificationChannelGroup(r0)
            if (r0 == 0) goto L_0x004d
            boolean r0 = r0.isBlocked()
            if (r0 == 0) goto L_0x004d
        L_0x004c:
            return r3
        L_0x004d:
            X.0rt r0 = r6.A05
            boolean r0 = r0.A0G(r4)
            if (r0 != 0) goto L_0x004c
            org.json.JSONObject r1 = r6.A02(r7, r8)
            if (r1 == 0) goto L_0x004c
            java.lang.String r0 = "incoming_message"
            X.2Gi r3 = new X.2Gi
            r3.<init>(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C205110k.A00(X.0tZ, X.0s3):X.2Gi");
    }

    public final String A01(String str, List list) {
        CharSequence A032 = C45922Bq.A03(this.A03, this.A09, C40651uT.A03(str));
        SpannableStringBuilder spannableStringBuilder = A032;
        if (list != null) {
            spannableStringBuilder = A032;
            if (!list.isEmpty()) {
                boolean isEmpty = TextUtils.isEmpty(A032);
                spannableStringBuilder = A032;
                if (!isEmpty) {
                    SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(A032);
                    ArrayList arrayList = new ArrayList();
                    this.A08.A03(valueOf, new C102914zj(arrayList), list);
                    Collections.sort(arrayList, Collections.reverseOrder());
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        int intValue = ((Number) it.next()).intValue();
                        valueOf.delete(intValue, intValue + 1);
                    }
                    spannableStringBuilder = valueOf;
                }
            }
        }
        CharSequence A022 = AnonymousClass1ZW.A02(spannableStringBuilder);
        if (A022 == null) {
            return null;
        }
        return A022.toString();
    }

    public JSONObject A02(C16740tZ r10, C15880s3 r11) {
        C16010sH r7;
        C16000sG r0;
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            C28381Vw r5 = r10.A11;
            C15830rv r6 = r5.A00;
            if (!C16030sJ.A0Q(r6)) {
                if (!(r10 instanceof C30581cc) || r10.A10 != 0) {
                    if (r10 instanceof C38891ra) {
                        jSONObject.put("text", A01(r10.A0I(), r10.A0q));
                        A03(r10, jSONObject);
                    } else {
                        if (!(r10 instanceof C38981rj) && !(r10 instanceof C30591cd)) {
                            if (r10 instanceof C38681rF) {
                                A03(r10, jSONObject);
                                A04(r10, jSONObject);
                            } else if (r10 instanceof C38701rH) {
                                jSONObject.put("type", "audio");
                            } else {
                                if (r10 instanceof C38711rI) {
                                    A03(r10, jSONObject);
                                    A04(r10, jSONObject);
                                } else if (r10 instanceof C38641rB) {
                                    jSONObject.put("type", "sticker");
                                } else if (r10 instanceof C38801rR) {
                                    A03(r10, jSONObject);
                                    A04(r10, jSONObject);
                                    jSONObject.put("type", "gif");
                                } else if (r10 instanceof C30901d9) {
                                    A03(r10, jSONObject);
                                    jSONObject.put("type", "location");
                                } else if ((r10 instanceof C38741rL) || (r10 instanceof C38811rS)) {
                                    jSONObject.put("type", "contact");
                                } else if (r10 instanceof C38631rA) {
                                    jSONObject.put("type", "document");
                                } else if (!(r10 instanceof C38991rk)) {
                                    if (r10 instanceof C39011rm) {
                                    }
                                }
                                jSONObject.put("type", "video");
                            }
                        }
                        return null;
                    }
                    jSONObject.put("type", "image");
                } else {
                    String str2 = "text";
                    String str3 = str2;
                    AnonymousClass1Vt r3 = r10.A0L;
                    if (r3 != null) {
                        if (r3.A03 != 5 && this.A00.A0I(r3.A0D)) {
                            str2 = "payment";
                        }
                    } else if (!TextUtils.isEmpty(((C30581cc) r10).A06)) {
                        str2 = FacebookFacade.RequestParameter.LINK;
                    }
                    jSONObject.put(str3, A01(r10.A0I(), r10.A0q));
                    A04(r10, jSONObject);
                    jSONObject.put("type", str2);
                }
                C15830rv A0B = r10.A0B();
                boolean A0L = C16030sJ.A0L(r6);
                if (!A0L || A0B == null) {
                    r0 = this.A01;
                    AnonymousClass00B.A06(r6);
                    r7 = r0.A0A(r6);
                } else {
                    r0 = this.A01;
                    r7 = r0.A0A(A0B);
                }
                if (A0L) {
                    AnonymousClass00B.A06(r6);
                    str = this.A02.A08(r0.A0A(r6));
                } else {
                    str = null;
                }
                jSONObject.putOpt("group_name", str);
                jSONObject.put("author_name", this.A02.A07(r7, false).A01);
                C16100sR r1 = this.A06;
                C15830rv r02 = r7.A0E;
                AnonymousClass00B.A06(r02);
                AnonymousClass10U r2 = r1.A01;
                jSONObject.put("author_id", r2.A03(r11, r02.getRawString()));
                AnonymousClass00B.A06(r6);
                jSONObject.put("chat_id", r2.A03(r11, r6.getRawString()));
                jSONObject.put("message_id", this.A07.A00(r5, r11));
                return jSONObject;
            }
            return null;
        } catch (JSONException unused) {
        }
    }

    public final void A03(C16740tZ r3, JSONObject jSONObject) {
        jSONObject.put("text", A01(C218415q.A06(this.A04.A00, r3), r3.A0q));
    }

    public final void A04(C16740tZ r5, JSONObject jSONObject) {
        jSONObject.put("user_mentioned", false);
        List<C15830rv> list = r5.A0q;
        if (list != null) {
            for (C15830rv A0I : list) {
                if (this.A00.A0I(A0I)) {
                    jSONObject.put("user_mentioned", true);
                    return;
                }
            }
        }
    }
}
