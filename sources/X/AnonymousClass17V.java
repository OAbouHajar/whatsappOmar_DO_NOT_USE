package X;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.redex.RunnableRunnableShape0S0400000_I0;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* renamed from: X.17V  reason: invalid class name */
public class AnonymousClass17V {
    public C14870pt A00;
    public AnonymousClass01V A01;
    public C16440t3 A02;
    public C14710pd A03;
    public C16490t9 A04;
    public C17020u3 A05;
    public C216014s A06;
    public C16320sq A07;
    public final AnonymousClass17U A08;

    public AnonymousClass17V(C14870pt r1, AnonymousClass01V r2, C16440t3 r3, C14710pd r4, C16490t9 r5, AnonymousClass17U r6, C17020u3 r7, C216014s r8, C16320sq r9) {
        this.A00 = r1;
        this.A03 = r4;
        this.A07 = r9;
        this.A01 = r2;
        this.A04 = r5;
        this.A06 = r8;
        this.A08 = r6;
        this.A05 = r7;
        this.A02 = r3;
    }

    public Intent A00(Context context, C16740tZ r9) {
        C39731sy A012 = A01(r9);
        String A022 = A02(A012);
        Intent intent = new Intent();
        String str = A012.A05;
        intent.setPackage(Uri.parse(str).getQueryParameter("package_name"));
        intent.setAction("com.obwhatsapp.otp.OTP_RETRIEVED");
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        if (queryIntentActivities.isEmpty()) {
            StringBuilder sb = new StringBuilder("messageOTP/autofill: no activity for ");
            sb.append(Uri.parse(str).getQueryParameter("cta_display_name"));
            Log.e(sb.toString());
            return null;
        }
        intent.setClassName(Uri.parse(str).getQueryParameter("package_name"), queryIntentActivities.get(0).activityInfo.name);
        intent.putExtra("code", A022);
        intent.setFlags(268435456);
        PendingIntent A013 = C42341xd.A01(context, 0, new Intent(), 0);
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.putParcelable("_ci_", A013);
        intent.putExtras(extras);
        return intent;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C39731sy A01(X.C16740tZ r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof X.C30571cb
            if (r0 == 0) goto L_0x002b
            X.1cb r5 = (X.C30571cb) r5
            X.1cf r0 = r5.A00
            java.util.List r0 = r0.A05
            if (r0 == 0) goto L_0x002b
            java.util.Iterator r3 = r0.iterator()
        L_0x0010:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x002b
            java.lang.Object r2 = r3.next()
            X.1sy r2 = (X.C39731sy) r2
            X.0pd r1 = r4.A03
            boolean r0 = X.C38621r6.A0a(r1, r2)
            if (r0 != 0) goto L_0x002a
            boolean r0 = X.C38621r6.A0b(r1, r2)
            if (r0 == 0) goto L_0x0010
        L_0x002a:
            return r2
        L_0x002b:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass17V.A01(X.0tZ):X.1sy");
    }

    public String A02(C39731sy r5) {
        String queryParameter;
        String str;
        C14710pd r3 = this.A03;
        if (C38621r6.A0a(r3, r5)) {
            str = r3.A06(C16620tM.A02, 1024);
            queryParameter = r5.A05;
        } else if (!C38621r6.A0b(r3, r5)) {
            return null;
        } else {
            queryParameter = Uri.parse(r5.A05).getQueryParameter("code");
            str = "otp";
        }
        return queryParameter.replace(str, "");
    }

    public final ArrayList A03() {
        JSONArray jSONArray = new JSONArray(this.A05.A00("otp.logging.dedup").getString("otp.logging.dedup.messageIds", "[]"));
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            arrayList.add(jSONArray.getString(i2));
        }
        return arrayList;
    }

    public void A04(Context context, C30571cb r9, Integer num) {
        this.A06.A05(r9.A0C(), 1);
        AnonymousClass17U r6 = this.A08;
        r6.A01(r9, 1, num);
        Intent A002 = A00(context, r9);
        if (A002 != null) {
            context.startActivity(A002);
            C42331xc r5 = new C42331xc();
            r5.A03 = 3;
            r5.A02 = num;
            r5.A01 = 1;
            r5.A05 = Long.valueOf(Long.parseLong(r9.A0C().user));
            r5.A04 = 0;
            r5.A06 = Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - r9.A0I));
            r5.A07 = AnonymousClass17U.A00(r9);
            r6.A01.A06(r5);
        }
    }

    public void A05(C30571cb r4, Integer num) {
        C30601ce r2 = new C30601ce();
        r2.A00 = num;
        r2.A01 = 1;
        r2.A03 = r4.A00.A04;
        r2.A02 = Long.valueOf(Long.parseLong(r4.A0C().user));
        this.A04.A06(r2);
    }

    public void A06(C30571cb r10, Integer num) {
        C30571cb r7 = r10;
        C39731sy A012 = A01(r10);
        this.A06.A05(r10.A0C(), 1);
        String A022 = A02(A012);
        try {
            this.A01.A0B().setPrimaryClip(ClipData.newPlainText(A022, A022));
            this.A00.A0A(R.string.str05ff, 1);
        } catch (NullPointerException | SecurityException e2) {
            Log.e("messageOTP/copycode", e2);
        }
        this.A07.Acl(new RunnableRunnableShape0S0400000_I0(this, num, A012, r7, 19));
    }

    public boolean A07(C39731sy r3) {
        C14710pd r1 = this.A03;
        if (!C38621r6.A0a(r1, r3)) {
            return C38621r6.A0b(r1, r3) && r3.A06.get() == 2;
        }
        return true;
    }

    public boolean A08(C39731sy r3) {
        return C38621r6.A0b(this.A03, r3) && r3.A06.get() == 1;
    }
}
