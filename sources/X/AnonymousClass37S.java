package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.redex.IDxRCallbackShape12S0300000_1_I1;
import com.facebook.redex.RunnableRunnableShape1S1101000_I1;
import com.mod2.fblibs.FacebookFacade;
import com.obwhatsapp.group.GroupChatInfoActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: X.37S  reason: invalid class name */
public class AnonymousClass37S extends C16690tT {
    public final C14870pt A00;
    public final C16040sK A01;
    public final C16440t3 A02;
    public final AnonymousClass11A A03;
    public final C16010sH A04;
    public final C17780vd A05;
    public final String A06;
    public final WeakReference A07;

    public AnonymousClass37S(C14870pt r2, C16040sK r3, C16440t3 r4, AnonymousClass11A r5, C16010sH r6, GroupChatInfoActivity groupChatInfoActivity, C17780vd r8, String str) {
        this.A02 = r4;
        this.A00 = r2;
        this.A01 = r3;
        this.A05 = r8;
        this.A03 = r5;
        this.A04 = r6;
        this.A06 = str;
        this.A07 = C13690nt.A0h(groupChatInfoActivity);
    }

    public static Void A03(C14870pt r12, C16040sK r13, C16440t3 r14, AnonymousClass11A r15, C16010sH r16, C17780vd r17, C108805Pk r18, String str) {
        String str2 = str;
        String str3 = null;
        if (!TextUtils.isEmpty(str2)) {
            byte[] A012 = C224718b.A01(r13, r14, false);
            AnonymousClass00B.A06(A012);
            str3 = C004101u.A04(A012);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C16010sH r142 = r16;
        AnonymousClass4NK r11 = new AnonymousClass4NK(r12, r15, r142, r18, str2);
        Jid A08 = r142.A08(C16050sL.class);
        AnonymousClass00B.A06(A08);
        String str4 = r142.A0H.A03;
        C17780vd r5 = r17;
        C17190ug r122 = r5.A02;
        String A022 = r122.A02();
        ArrayList A0u = AnonymousClass000.A0u();
        if (!TextUtils.isEmpty(str4)) {
            A0u.add(new C35081lL("prev", str4));
        }
        if (!TextUtils.isEmpty(str3)) {
            A0u.add(new C35081lL("id", str3));
        }
        C28371Vv r8 = null;
        if (TextUtils.isEmpty(str2)) {
            A0u.add(new C35081lL("delete", "true"));
        } else {
            r8 = new C28371Vv("body", str2, (C35081lL[]) null);
        }
        C28371Vv r7 = new C28371Vv(r8, FacebookFacade.RequestParameter.DESCRIPTION, (C35081lL[]) A0u.toArray(C17780vd.A05));
        C35081lL[] r6 = new C35081lL[4];
        C35081lL.A02("id", A022, r6, 0);
        C35081lL.A02("xmlns", "w:g2", r6, 1);
        C35081lL.A02("type", "set", r6, 2);
        C28371Vv A032 = C28371Vv.A03(A08, r7, r6, 3);
        C29951bV r3 = new C29951bV();
        r122.A0A(new IDxRCallbackShape12S0300000_1_I1(r3, r5, r11, 2), A032, A022, 134, 32000);
        try {
            r3.get(32000, TimeUnit.MILLISECONDS);
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            if (elapsedRealtime2 < 500) {
                SystemClock.sleep(500 - elapsedRealtime2);
            }
            return null;
        } catch (Exception e2) {
            Log.w("groupinfo/setgroupdescription/timeout", e2);
            r11.A00.A0K(new RunnableRunnableShape1S1101000_I1(r11.A03, r11.A04, 0, 1));
            return null;
        }
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        String str = this.A06;
        C16010sH r4 = this.A04;
        C62953Fo r6 = new C62953Fo(this);
        C16440t3 r2 = this.A02;
        return A03(this.A00, this.A01, r2, this.A03, r4, this.A05, r6, str);
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) this.A07.get();
        if (groupChatInfoActivity != null) {
            groupChatInfoActivity.A01.setVisibility(8);
            groupChatInfoActivity.A1Z.setVisibility(0);
        }
    }
}
