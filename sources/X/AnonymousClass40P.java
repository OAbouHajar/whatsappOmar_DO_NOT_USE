package X;

import java.io.IOException;

/* renamed from: X.40P  reason: invalid class name */
public class AnonymousClass40P extends IOException {
    public final AnonymousClass3AL dataSpec;
    public final int type;

    public AnonymousClass40P(AnonymousClass3AL r1, IOException iOException, int i2) {
        super(iOException);
        this.dataSpec = r1;
        this.type = i2;
    }

    public AnonymousClass40P(AnonymousClass3AL r2, IOException iOException, String str) {
        super(str, iOException);
        this.dataSpec = r2;
        this.type = 1;
    }

    public AnonymousClass40P(AnonymousClass3AL r2, String str) {
        super(str);
        this.dataSpec = r2;
        this.type = 1;
    }
}
