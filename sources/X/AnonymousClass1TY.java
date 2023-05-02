package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.facebook.redex.RunnableRunnableShape12S0100000_I0_11;
import com.mod2.fblibs.FacebookFacade;
import com.obwhatsapp.push.RegistrationIntentService;
import com.whatsapp.util.Log;
import java.util.HashMap;

/* renamed from: X.1TY  reason: invalid class name */
public class AnonymousClass1TY implements C19420yP {
    public final C15900s5 A00;
    public final C25941Ls A01;
    public final C16440t3 A02;
    public final C16980tz A03;
    public final C15860rz A04;
    public final C16490t9 A05;
    public final AnonymousClass17L A06;
    public final AnonymousClass124 A07;
    public final C229419w A08;
    public final C16320sq A09;

    public AnonymousClass1TY(C15900s5 r1, C25941Ls r2, C16440t3 r3, C16980tz r4, C15860rz r5, C16490t9 r6, AnonymousClass17L r7, AnonymousClass124 r8, C229419w r9, C16320sq r10) {
        this.A03 = r4;
        this.A02 = r3;
        this.A09 = r10;
        this.A05 = r6;
        this.A07 = r8;
        this.A00 = r1;
        this.A08 = r9;
        this.A06 = r7;
        this.A04 = r5;
        this.A01 = r2;
    }

    public int[] ACW() {
        return new int[]{6, 27, 250, 87, 159, 174, 18};
    }

    public boolean AHS(Message message, int i2) {
        Message message2 = message;
        int i3 = i2;
        if (i3 == 6) {
            Bundle bundle = (Bundle) message2.obj;
            String string = bundle.getString("gcmToken");
            String string2 = bundle.getString("fbnsToken");
            String string3 = bundle.getString("mutedChatsHash");
            String string4 = bundle.getString("appMuteConfig");
            StringBuilder sb = new StringBuilder("AppMessagingXmppHandler/received client config from server; gcmToken=");
            int i4 = 0;
            sb.append(string != null ? string.length() : 0);
            sb.append(" bytes; fbnsToken=");
            if (string2 != null) {
                i4 = string2.length();
            }
            sb.append(i4);
            sb.append(" bytes: mutedChatsHash=");
            sb.append(string3);
            sb.append(" appMuteConfig:");
            sb.append(string4);
            Log.i(sb.toString());
            RegistrationIntentService.A03(this.A03.A00, string, string3, string4);
            C229419w r2 = this.A08;
            if (r2.A01()) {
                r2.A00(string2);
                return true;
            } else if (!TextUtils.isEmpty(string2)) {
                AnonymousClass124 r1 = this.A07;
                if (r1.A01.A05) {
                    r1.A02.A09(Message.obtain((Handler) null, 0, 263, 0), false);
                    return true;
                }
            }
        } else if (i3 != 18) {
            if (i3 == 27) {
                int i5 = message2.arg2;
                StringBuilder sb2 = new StringBuilder("AppMessagingXmppHandler/clientConfigError/");
                sb2.append(i5);
                Log.e(sb2.toString());
                if (i5 == 404) {
                    RegistrationIntentService.A03(this.A03.A00, (String) null, (String) null, (String) null);
                    C229419w r12 = this.A08;
                    if (r12.A01()) {
                        r12.A00((String) null);
                        return true;
                    }
                }
            } else if (i3 != 87) {
                if (i3 == 159) {
                    this.A01.A01(((Bundle) message2.obj).getLong("timestampMs"));
                    return true;
                } else if (i3 != 174) {
                    return false;
                } else {
                    C28371Vv r22 = (C28371Vv) message2.obj;
                    int A002 = C29501aj.A00(r22.A0N("version", (String) null), 0);
                    int A003 = C29501aj.A00(r22.A0N("protocol", (String) null), 1);
                    HashMap hashMap = new HashMap();
                    for (C28371Vv r4 : r22.A0O("prop")) {
                        hashMap.put(r4.A0M(FacebookFacade.RequestParameter.NAME), r4.A0N("value", (String) null));
                    }
                    if (A003 == 2) {
                        this.A00.A04(this.A02, r22.A0N("hash", (String) null), r22.A0N("key", (String) null), hashMap, A002, A003, C29501aj.A01(r22.A0N("refresh", (String) null), 86400) * 1000);
                    } else {
                        this.A00.A04(this.A02, (String) null, (String) null, hashMap, A002, 1, 86400000);
                    }
                    this.A09.Acl(new RunnableRunnableShape12S0100000_I0_11((Object) this, 32));
                }
            } else if (((Boolean) message2.obj).booleanValue()) {
                this.A06.A00();
                return true;
            }
        }
        return true;
    }
}
