package X;

import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.1ZJ  reason: invalid class name */
public final class AnonymousClass1ZJ {
    public AnonymousClass1ZT A00;
    public List A01;
    public boolean A02;
    public final C16010sH A03;
    public final UserJid A04;
    public final Boolean A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;

    public AnonymousClass1ZJ(C16010sH r2, UserJid userJid, Boolean bool, String str, String str2, String str3, List list, boolean z2) {
        this.A02 = false;
        this.A09 = z2;
        this.A04 = userJid;
        this.A07 = str;
        this.A08 = str2;
        this.A06 = str3;
        this.A05 = bool;
        this.A03 = r2;
        this.A01 = list;
    }

    public AnonymousClass1ZJ(UserJid userJid, boolean z2) {
        this((C16010sH) null, userJid, (Boolean) null, (String) null, (String) null, (String) null, (List) null, z2);
    }

    public UserJid A00() {
        return this.A04;
    }

    public String A01() {
        return this.A06;
    }

    public String A02() {
        return this.A07;
    }

    public boolean A03() {
        return this.A09;
    }
}
