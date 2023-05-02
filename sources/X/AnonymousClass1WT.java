package X;

import com.whatsapp.jid.UserJid;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: X.1WT  reason: invalid class name */
public class AnonymousClass1WT extends AnonymousClass1WU {
    public UserJid A00;
    public UserJid A01;
    public transient long A02;
    public final transient C16300so A03;

    public AnonymousClass1WT(C16300so r1, C28381Vw r2, int i2, long j2) {
        super(r2, i2, j2);
        this.A03 = r1;
    }

    public final String A13() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        StringBuilder sb = new StringBuilder("id=");
        sb.append(this.A13);
        sb.append(", created=");
        sb.append(simpleDateFormat.format(Long.valueOf(this.A0I)));
        return sb.toString();
    }
}
