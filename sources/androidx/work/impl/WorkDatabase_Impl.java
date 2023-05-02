package androidx.work.impl;

import X.AnonymousClass000;
import X.AnonymousClass0PS;
import X.C02870Fy;
import X.C02880Fz;
import X.C08120d7;
import X.C08130d8;
import X.C08140d9;
import X.C08150dA;
import X.C08160dB;
import X.C08170dC;
import X.C08180dD;
import X.C12090jp;
import X.C12100jq;
import X.C12110jr;
import X.C12600kf;
import X.C12610kg;
import X.C13130lW;
import X.C13140lX;
import X.C13360lu;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class WorkDatabase_Impl extends WorkDatabase {
    public volatile C12600kf A00;
    public volatile C13130lW A01;
    public volatile C12090jp A02;
    public volatile C13140lX A03;
    public volatile C12100jq A04;
    public volatile C12110jr A05;
    public volatile C13360lu A06;
    public volatile C12610kg A07;

    public List A03(Map map) {
        return Arrays.asList(new AnonymousClass0PS[]{new C02870Fy(), new C02880Fz()});
    }

    public Map A04() {
        HashMap A0x = AnonymousClass000.A0x();
        A0x.put(C13360lu.class, Collections.emptyList());
        A0x.put(C12600kf.class, Collections.emptyList());
        A0x.put(C12610kg.class, Collections.emptyList());
        A0x.put(C13140lX.class, Collections.emptyList());
        A0x.put(C12100jq.class, Collections.emptyList());
        A0x.put(C12110jr.class, Collections.emptyList());
        A0x.put(C13130lW.class, Collections.emptyList());
        A0x.put(C12090jp.class, Collections.emptyList());
        return A0x;
    }

    public Set A05() {
        return new HashSet();
    }

    public C12600kf A0E() {
        C12600kf r0;
        if (this.A00 != null) {
            return this.A00;
        }
        synchronized (this) {
            if (this.A00 == null) {
                this.A00 = new C08120d7(this);
            }
            r0 = this.A00;
        }
        return r0;
    }

    public C13130lW A0F() {
        C13130lW r0;
        if (this.A01 != null) {
            return this.A01;
        }
        synchronized (this) {
            if (this.A01 == null) {
                this.A01 = new C08130d8(this);
            }
            r0 = this.A01;
        }
        return r0;
    }

    public C13140lX A0G() {
        C13140lX r0;
        if (this.A03 != null) {
            return this.A03;
        }
        synchronized (this) {
            if (this.A03 == null) {
                this.A03 = new C08140d9(this);
            }
            r0 = this.A03;
        }
        return r0;
    }

    public C12100jq A0H() {
        C12100jq r0;
        if (this.A04 != null) {
            return this.A04;
        }
        synchronized (this) {
            if (this.A04 == null) {
                this.A04 = new C08150dA(this);
            }
            r0 = this.A04;
        }
        return r0;
    }

    public C12110jr A0I() {
        C12110jr r0;
        if (this.A05 != null) {
            return this.A05;
        }
        synchronized (this) {
            if (this.A05 == null) {
                this.A05 = new C08160dB(this);
            }
            r0 = this.A05;
        }
        return r0;
    }

    public C13360lu A0J() {
        C13360lu r0;
        if (this.A06 != null) {
            return this.A06;
        }
        synchronized (this) {
            if (this.A06 == null) {
                this.A06 = new C08170dC(this);
            }
            r0 = this.A06;
        }
        return r0;
    }

    public C12610kg A0K() {
        C12610kg r0;
        if (this.A07 != null) {
            return this.A07;
        }
        synchronized (this) {
            if (this.A07 == null) {
                this.A07 = new C08180dD(this);
            }
            r0 = this.A07;
        }
        return r0;
    }
}
