package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1ph  reason: invalid class name and case insensitive filesystem */
public final class C37761ph {
    public long A00;
    public long A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public List A0L;
    public List A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;

    public C37771pi A00() {
        if (TextUtils.isEmpty(this.A0D)) {
            this.A0D = this.A04;
        }
        if (TextUtils.isEmpty(this.A0F)) {
            this.A0F = this.A06;
        }
        if (TextUtils.isEmpty(this.A0H)) {
            this.A0H = this.A07;
        }
        if (TextUtils.isEmpty(this.A02)) {
            this.A02 = this.A03;
        }
        if (!this.A0S) {
            AnonymousClass00B.A07(this.A0D, "sticker pack id cannot be null");
            AnonymousClass00B.A07(this.A0F, "sticker pack name cannot be null");
            AnonymousClass00B.A07(this.A0H, "sticker pack publisher cannot be null");
        }
        if (this.A0L == null) {
            this.A0L = new ArrayList();
        }
        if (this.A0M == null) {
            this.A0M = new ArrayList();
        }
        return new C37771pi(this);
    }
}
