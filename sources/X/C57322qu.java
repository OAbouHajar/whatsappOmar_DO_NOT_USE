package X;

import android.content.Context;
import android.os.Environment;
import com.facebook.redex.IDxComparatorShape184S0100000_2_I1;
import java.io.File;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.io.FileUtils;

/* renamed from: X.2qu  reason: invalid class name and case insensitive filesystem */
public class C57322qu extends AnonymousClass0F8 {
    public List A00;
    public final AnonymousClass013 A01;
    public final C14710pd A02;
    public final File[] A03;

    public C57322qu(Context context, C16180sb r5, AnonymousClass013 r6, C14710pd r7) {
        super(context);
        this.A02 = r7;
        this.A01 = r6;
        File file = r5.A05().A02;
        C16180sb.A04(file, false);
        this.A03 = new File[]{C13700nu.A0C(Environment.getExternalStorageDirectory(), "Download"), Environment.getExternalStorageDirectory(), file, C13700nu.A0C(Environment.getExternalStorageDirectory(), "Documents")};
    }

    public void A01() {
        A00();
        this.A00 = null;
    }

    public void A02() {
        A00();
    }

    public void A03() {
        List list = this.A00;
        if (list != null && !this.A05) {
            this.A00 = list;
            if (this.A06) {
                super.A04(list);
            }
        }
        boolean z2 = this.A03;
        this.A03 = false;
        this.A04 |= z2;
        if (z2 || this.A00 == null) {
            A09();
        }
    }

    public /* bridge */ /* synthetic */ void A04(Object obj) {
        List list = (List) obj;
        if (!this.A05) {
            this.A00 = list;
            if (this.A06) {
                super.A04(list);
            }
        }
    }

    public /* bridge */ /* synthetic */ Object A06() {
        ArrayList A0i = C13690nt.A0i(128);
        for (File listFiles : this.A03) {
            File[] listFiles2 = listFiles.listFiles(new AnonymousClass54Y());
            if (listFiles2 != null) {
                long A032 = ((long) this.A02.A03(C16620tM.A02, 542)) * FileUtils.ONE_MB;
                for (File r0 : listFiles2) {
                    C34201js r3 = new C34201js(r0);
                    if (r3.A01 <= A032) {
                        A0i.add(r3);
                    }
                }
            }
        }
        Collator instance = Collator.getInstance(C13690nt.A0m(this.A01));
        instance.setDecomposition(1);
        Collections.sort(A0i, new IDxComparatorShape184S0100000_2_I1(instance, 8));
        return A0i;
    }
}
