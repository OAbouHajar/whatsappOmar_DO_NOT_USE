package X;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: X.1ta  reason: invalid class name and case insensitive filesystem */
public class C40111ta implements Serializable {
    public static final long serialVersionUID = 1;
    public final int actualActors;
    public final int hostStorage;
    public final long privacyModeTs;

    public C40111ta() {
        this.hostStorage = 0;
        this.actualActors = 0;
        this.privacyModeTs = 0;
    }

    public C40111ta(int i2, long j2, int i3) {
        this.hostStorage = i2;
        this.actualActors = i3;
        this.privacyModeTs = j2;
    }

    public C40111ta(C40111ta r3) {
        long j2;
        if (r3 == null) {
            this.hostStorage = 0;
            this.actualActors = 0;
            j2 = 0;
        } else {
            this.hostStorage = r3.hostStorage;
            this.actualActors = r3.actualActors;
            j2 = r3.privacyModeTs;
        }
        this.privacyModeTs = j2;
    }

    public C40111ta(String str, String str2, String str3) {
        this.hostStorage = AnonymousClass4Y1.A01(str);
        this.actualActors = AnonymousClass4Y1.A00(str2);
        this.privacyModeTs = C29501aj.A01(str3, 0);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C40111ta r7 = (C40111ta) obj;
            if (!(this.hostStorage == r7.hostStorage && this.actualActors == r7.actualActors && this.privacyModeTs == r7.privacyModeTs)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.hostStorage), Integer.valueOf(this.actualActors), Long.valueOf(this.privacyModeTs)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PrivacyMode{hostStorage=");
        sb.append(this.hostStorage);
        sb.append(", actualActors=");
        sb.append(this.actualActors);
        sb.append(", privacyModeTs=");
        sb.append(this.privacyModeTs);
        sb.append('}');
        return sb.toString();
    }
}
