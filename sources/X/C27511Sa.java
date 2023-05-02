package X;

import android.os.Message;
import com.facebook.redex.RunnableRunnableShape9S0200000_I0_7;
import com.mod2.fblibs.FacebookFacade;
import com.whatsapp.util.Log;
import java.util.Set;

/* renamed from: X.1Sa  reason: invalid class name and case insensitive filesystem */
public class C27511Sa implements C19420yP {
    public final C18930xU A00;
    public final C16900tq A01;
    public final C17240ul A02;
    public final AnonymousClass124 A03;
    public final AnonymousClass134 A04;
    public final C16320sq A05;

    public C27511Sa(C18930xU r1, C16900tq r2, C17240ul r3, AnonymousClass124 r4, AnonymousClass134 r5, C16320sq r6) {
        this.A05 = r6;
        this.A03 = r4;
        this.A00 = r1;
        this.A02 = r3;
        this.A04 = r5;
        this.A01 = r2;
    }

    public int[] ACW() {
        return new int[]{8};
    }

    public boolean AHS(Message message, int i2) {
        String str;
        boolean contains;
        if (8 != i2) {
            return false;
        }
        C49432Td r4 = (C49432Td) message.obj;
        String str2 = r4.A01;
        if ("groups".equals(str2)) {
            if (this.A01.A00) {
                Log.i("DirtyBitHandler/onGroupsDirty call refetchGroups");
                C17240ul r2 = this.A02;
                r2.A05.set(true);
                if (r2.A13) {
                    return true;
                }
                r2.A0E(3, true, true);
                return true;
            }
            str = "DirtyBitHandler/onGroupsDirty/no-db-access/skip";
        } else if ("account_sync".equals(str2)) {
            if (this.A01.A00) {
                AnonymousClass134 r3 = this.A04;
                Set set = r4.A02;
                AnonymousClass29X r1 = new AnonymousClass29X();
                if (set.isEmpty()) {
                    contains = true;
                    r1.A05 = true;
                    r1.A03 = true;
                    r1.A04 = true;
                    r1.A02 = true;
                } else {
                    r1.A02 = set.contains("device");
                    r1.A05 = set.contains("status");
                    r1.A03 = set.contains(FacebookFacade.RequestParameter.PICTURE);
                    r1.A04 = set.contains("privacy");
                    contains = set.contains("blocklist");
                }
                r1.A01 = contains;
                r3.A00(new AnonymousClass29Y(r1), true, false, true);
                return true;
            }
            str = "DirtyBitHandler/onAccountDirty/no-db-access/skip";
        } else if ("syncd_app_state".equals(str2)) {
            Log.i("OnDirtyMessageHandler/onSyncDDirty");
            this.A05.Acl(new RunnableRunnableShape9S0200000_I0_7(this, 42, r4));
            return true;
        } else {
            StringBuilder sb = new StringBuilder("OnDirtyMessageHandler/onDirty received unknown dirty bit category: ");
            sb.append(str2);
            Log.w(sb.toString());
            this.A03.A04(str2, (Long) null);
            return true;
        }
        Log.i(str);
        return true;
    }
}
