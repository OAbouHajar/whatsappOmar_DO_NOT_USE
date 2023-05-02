package X;

import java.io.File;
import org.apache.commons.io.FileUtils;

/* renamed from: X.5Es  reason: invalid class name and case insensitive filesystem */
public final class C106665Es extends AnonymousClass1DR implements AnonymousClass1DU {
    public final /* synthetic */ String $directoryName = "avatar_profile_photo_poses";
    public final /* synthetic */ C16980tz $waContext;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106665Es(C16980tz r2) {
        super(0);
        this.$waContext = r2;
    }

    public /* bridge */ /* synthetic */ Object AIT() {
        return new C43201zV(new File(this.$waContext.A00.getCacheDir(), this.$directoryName), FileUtils.ONE_MB);
    }
}
