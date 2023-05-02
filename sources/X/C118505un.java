package X;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.util.concurrent.Executor;

/* renamed from: X.5un  reason: invalid class name and case insensitive filesystem */
public class C118505un {
    public AnonymousClass12W A00;
    public final Context A01;
    public final C14870pt A02;
    public final C18260wP A03;
    public final C18220wL A04;
    public final C18340wX A05;
    public final C18310wU A06;
    public final C119285wq A07;
    public final C16320sq A08;

    public C118505un(Context context, C14870pt r2, C18260wP r3, C18220wL r4, C18340wX r5, C18310wU r6, C119285wq r7, C16320sq r8) {
        this.A01 = context;
        this.A02 = r2;
        this.A08 = r8;
        this.A04 = r4;
        this.A06 = r6;
        this.A03 = r3;
        this.A05 = r5;
        this.A07 = r7;
    }

    public void A00(AnonymousClass50C r18, C117475t3 r19, AnonymousClass1XK r20, File file) {
        C117475t3 r3 = r19;
        if (Build.VERSION.SDK_INT < 26) {
            this.A02.A06.execute(new C1208963k(r3));
            return;
        }
        try {
            File A002 = this.A00.A00().A00("enc");
            new FileOutputStream(A002).write(r18.A8P(Files.readAllBytes(file.toPath()), C004101u.A0E(16)));
            AnonymousClass1XP A032 = this.A04.A03(AnonymousClass1XL.A00(Uri.fromFile(A002), (AnonymousClass1XM) null, new AnonymousClass1XN(SearchActionVerificationClientService.NOTIFICATION_ID, 100, 1600, 1600), new AnonymousClass1XJ(true, false, true), r20, (AnonymousClass1XO) null, (String) null, 0, false, false, false), true);
            A032.A0U = "mms";
            A032.A0A.A03(new C1207562w(A032, this, r3), (Executor) null);
            this.A08.Acl(new AnonymousClass65F(A032, this));
        } catch (Exception unused) {
            Log.e("PAY: PaymentsComplianceMediaUploadManager encryption failure");
            this.A02.A06.execute(new C1209163m(r3));
        }
    }
}
