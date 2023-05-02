package X;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* renamed from: X.3Em  reason: invalid class name and case insensitive filesystem */
public class C62673Em implements AnonymousClass5Uj {
    public boolean A00;
    public final OutputStream A01;
    public final ZipOutputStream A02;
    public final /* synthetic */ AnonymousClass2G5 A03;

    public C62673Em(AnonymousClass2G5 r6) {
        this.A03 = r6;
        AnonymousClass00B.A0D("prefix has not been initialized", AnonymousClass000.A1V(r6.A00));
        OutputStream AEA = r6.A00.AEA();
        this.A01 = AEA;
        r6.A00.A03(AEA);
        AnonymousClass12V r3 = r6.A04;
        C16960tx A0B = r6.A0B();
        AnonymousClass2G6 r0 = r6.A00;
        this.A02 = r3.A04(A0B, AEA, r0.A06(), r0.A05());
    }

    public void AiC(File file) {
        if (file != null && file.isFile() && file.exists()) {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                ZipOutputStream zipOutputStream = this.A02;
                zipOutputStream.putNextEntry(new ZipEntry(file.getName()));
                AnonymousClass1XI.A0H(fileInputStream, zipOutputStream);
                zipOutputStream.closeEntry();
                fileInputStream.close();
                return;
            } catch (Throwable unused) {
            }
        } else {
            return;
        }
        throw th;
    }

    public void AiE(AnonymousClass03O r7, AnonymousClass1WE r8, File file, String str, long j2) {
        if (file.isFile() && file.exists() && str != null) {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                ZipOutputStream zipOutputStream = this.A02;
                zipOutputStream.putNextEntry(new ZipEntry(str));
                C40691uX.A0B(r7, r8, fileInputStream, zipOutputStream, j2);
                zipOutputStream.closeEntry();
                fileInputStream.close();
                return;
            } catch (Throwable unused) {
            }
        } else {
            return;
        }
        throw th;
    }

    public void close() {
        if (!this.A00) {
            this.A02.close();
            this.A01.close();
            this.A00 = true;
        }
    }
}
