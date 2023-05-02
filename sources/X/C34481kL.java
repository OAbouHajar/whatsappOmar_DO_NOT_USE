package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1kL  reason: invalid class name and case insensitive filesystem */
public class C34481kL {
    public long A00;
    public Jid A01;
    public Jid A02;
    public UserJid A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public final Map A09 = new HashMap();

    public C30641ci A00() {
        Map map = this.A09;
        return new C30641ci(this.A01, this.A02, this.A03, this.A05, this.A07, this.A08, this.A04, this.A06, map.isEmpty() ? null : new ArrayList(map.values()), this.A00);
    }

    public void A01(String str, String str2) {
        this.A09.put(str, new C35081lL(str, str2));
    }
}
