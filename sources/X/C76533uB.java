package X;

import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.3uB  reason: invalid class name and case insensitive filesystem */
public class C76533uB extends AnonymousClass2NX {
    public final /* synthetic */ C17240ul A00;
    public final /* synthetic */ File A01;
    public final /* synthetic */ File A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76533uB(C16440t3 r9, AnonymousClass11A r10, C16460t6 r11, C17240ul r12, C17240ul r13, AnonymousClass4OC r14, AnonymousClass122 r15, File file, File file2) {
        super(r9, r10, r11, r13, r14, r15);
        this.A00 = r12;
        this.A01 = file;
        this.A02 = file2;
    }

    public void AYI(AnonymousClass4MJ r10, C16050sL r11) {
        super.AYI(r10, r11);
        C17240ul r6 = this.A00;
        C16010sH A0A = r6.A0E.A0A(r11);
        AnonymousClass120 r8 = r6.A0H;
        File A002 = r8.A00(A0A);
        AnonymousClass00B.A06(A002);
        File file = this.A01;
        if (!file.renameTo(A002)) {
            StringBuilder A0q = AnonymousClass000.A0q("group/create again, failed to rename ");
            A0q.append(file.getAbsolutePath());
            A0q.append(" to ");
            Log.w(AnonymousClass000.A0h(A002.getAbsolutePath(), A0q));
        }
        File A012 = r8.A01(A0A);
        AnonymousClass00B.A06(A012);
        File file2 = this.A02;
        if (!file2.renameTo(A012)) {
            StringBuilder A0q2 = AnonymousClass000.A0q("group/create again, failed to rename ");
            A0q2.append(file2.getAbsolutePath());
            A0q2.append(" to ");
            Log.w(AnonymousClass000.A0h(A012.getAbsolutePath(), A0q2));
        }
        r6.A0w.A09(A0A);
    }
}
