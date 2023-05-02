package X;

import android.graphics.drawable.Drawable;
import java.io.File;
import org.apache.commons.io.FileUtils;

/* renamed from: X.1qp  reason: invalid class name and case insensitive filesystem */
public final class C38461qp {
    public int A00 = Integer.MAX_VALUE;
    public long A01 = FileUtils.ONE_MB;
    public Drawable A02;
    public Drawable A03;
    public C38451qo A04;
    public boolean A05 = false;
    public final C14870pt A06;
    public final C17130ua A07;
    public final C19950zG A08;
    public final File A09;
    public final String A0A;

    public C38461qp(C14870pt r3, C17130ua r4, C19950zG r5, File file, String str) {
        this.A06 = r3;
        this.A07 = r4;
        this.A08 = r5;
        this.A09 = file;
        this.A0A = str;
    }

    public C38411qk A00() {
        return new C38411qk(this.A06, this.A08, this, this.A00);
    }
}
