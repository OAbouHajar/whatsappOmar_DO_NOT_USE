package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.facebook.redex.RunnableRunnableShape0S1200100_I0;
import com.obwhatsapp.Conversation;
import com.obwhatsapp.R;
import com.obwhatsapp.RequestPermissionActivity;
import com.whatsapp.util.Log;
import java.util.HashMap;

/* renamed from: X.1Qp  reason: invalid class name and case insensitive filesystem */
public class C27141Qp extends C27151Qq {
    public long A00 = -1;
    public String A01;
    public final C27131Qo A02;
    public final C14710pd A03;
    public final AnonymousClass1P7 A04;

    public C27141Qp(C20190ze r3, C27131Qo r4, C14710pd r5, AnonymousClass1P7 r6) {
        super(r3);
        this.A04 = r6;
        this.A03 = r5;
        this.A02 = r4;
    }

    public final void A05(Activity activity, C35071lK r21, String str, String str2, long j2) {
        boolean A0U;
        Activity activity2 = activity;
        String str3 = str;
        long j3 = j2;
        super.A05(activity2, r21, str3, str2, j3);
        this.A01 = str3;
        this.A00 = j3;
        C27131Qo r3 = this.A02;
        RunnableRunnableShape0S1200100_I0 runnableRunnableShape0S1200100_I0 = new RunnableRunnableShape0S1200100_I0(this, activity2, str3, 2, j3);
        if (r3.A02.A0E(C16620tM.A02, 2767)) {
            C15860rz r0 = r3.A01;
            String[] strArr = AnonymousClass1GE.A07;
            if (RequestPermissionActivity.A0Z(r0, strArr)) {
                A0U = RequestPermissionActivity.A0U(activity2, r3.A00, strArr, 0, 0, 904, true);
            }
            runnableRunnableShape0S1200100_I0.run();
        }
        C16260sj r5 = r3.A00;
        C15860rz r02 = r3.A01;
        String[] strArr2 = AnonymousClass1GE.A07;
        if (RequestPermissionActivity.A0Z(r02, strArr2) || RequestPermissionActivity.A0W(activity2, strArr2)) {
            A0U = RequestPermissionActivity.A0U(activity2, r5, strArr2, R.string.str11d0, 0, 904, false);
        }
        runnableRunnableShape0S1200100_I0.run();
        if (!A0U) {
            return;
        }
        runnableRunnableShape0S1200100_I0.run();
    }

    public final void A06(Activity activity, String str, long j2) {
        String str2;
        Activity A002 = AnonymousClass22N.A00(activity);
        if (A002 == null) {
            str2 = "SendLocationAction/execute/findActivityContextResultedNull";
        } else if (A002 instanceof AnonymousClass1yP) {
            Conversation conversation = (Conversation) ((AnonymousClass1yP) A002);
            String A032 = C16030sJ.A03(conversation.A00.A2l.A08(C15830rv.class));
            if (A032 != null) {
                boolean A05 = this.A04.A05(A002.getApplicationContext());
                boolean z2 = conversation.A00.A4Y;
                Context applicationContext = activity.getApplicationContext();
                boolean A0E = this.A03.A0E(C16620tM.A02, 2570);
                Intent intent = new Intent();
                intent.putExtra("jid", A032);
                intent.putExtra("quoted_message_row_id", j2);
                intent.putExtra("has_number_from_url", z2);
                intent.putExtra("start_in_fullscreen_mode", A0E);
                intent.setClassName(applicationContext.getPackageName(), A05 ? "com.obwhatsapp.location.LocationPicker2" : "com.obwhatsapp.location.LocationPicker");
                HashMap hashMap = new HashMap();
                hashMap.put("message_id", str);
                hashMap.put("chat_id", A032);
                intent.putExtra("carry_forward_extras", hashMap);
                A002.startActivityForResult(intent, 904);
                this.A01 = null;
                return;
            }
            str2 = "SendLocationAction/execute/jidIsNull";
        } else {
            str2 = "SendLocationAction/execute/findActivityContextIsNotConversationInterface";
        }
        Log.e(str2);
    }
}
