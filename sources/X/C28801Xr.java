package X;

import android.content.Context;
import java.io.File;
import java.util.LinkedList;
import org.whispersystems.jobqueue.Job;
import org.whispersystems.jobqueue.JobParameters;

/* renamed from: X.1Xr  reason: invalid class name and case insensitive filesystem */
public class C28801Xr extends Job implements C28791Xq {
    public transient C221516v A00;
    public final File fileToDelete;
    public final byte messageType;

    public C28801Xr(File file, byte b2) {
        super(new JobParameters("delete-media-file-job", new LinkedList(), true));
        this.fileToDelete = file;
        this.messageType = b2;
    }

    public void Adl(Context context) {
        this.A00 = (C221516v) ((C16150sX) ((AnonymousClass01F) AnonymousClass01I.A00(context, AnonymousClass01F.class))).AEU.get();
    }
}
