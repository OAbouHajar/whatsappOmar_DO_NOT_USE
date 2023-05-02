package X;

import android.content.Intent;
import android.net.Uri;
import com.facebook.redex.RunnableRunnableShape0S0600000_I0;
import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.3HJ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3HJ implements AnonymousClass1WE {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C14550pN A03;
    public final /* synthetic */ AnonymousClass1WD A04;
    public final /* synthetic */ AnonymousClass1KX A05;
    public final /* synthetic */ C35701mM A06;
    public final /* synthetic */ C50262Yq A07;
    public final /* synthetic */ C15830rv A08;
    public final /* synthetic */ UserJid A09;
    public final /* synthetic */ List A0A;
    public final /* synthetic */ boolean A0B;

    public /* synthetic */ AnonymousClass3HJ(C14550pN r1, AnonymousClass1WD r2, AnonymousClass1KX r3, C35701mM r4, C50262Yq r5, C15830rv r6, UserJid userJid, List list, int i2, int i3, long j2, boolean z2) {
        this.A05 = r3;
        this.A00 = i2;
        this.A0A = list;
        this.A0B = z2;
        this.A03 = r1;
        this.A01 = i3;
        this.A08 = r6;
        this.A06 = r4;
        this.A09 = userJid;
        this.A02 = j2;
        this.A07 = r5;
        this.A04 = r2;
    }

    public final void accept(Object obj) {
        AnonymousClass1KX r10 = this.A05;
        int i2 = this.A00;
        List list = this.A0A;
        boolean z2 = this.A0B;
        C14550pN r8 = this.A03;
        int i3 = this.A01;
        C15830rv r7 = this.A08;
        C35701mM r11 = this.A06;
        UserJid userJid = this.A09;
        long j2 = this.A02;
        C50262Yq r24 = this.A07;
        AnonymousClass1WD r13 = this.A04;
        AnonymousClass01Q r14 = (AnonymousClass01Q) obj;
        if (i2 == list.size() - 1) {
            C31081dR r15 = (C31081dR) r10.A09.A02.get("send_product_message_tag");
            if (r15 != null) {
                r15.A07("image_upload");
            }
            if (!z2) {
                r8.Ac1();
            }
        }
        File file = (File) r14.A01;
        if (r14.A00 == Boolean.FALSE) {
            r8.Ac1();
            r8.Afg(R.string.str03e4);
            Log.w("product-details/send-product/product load failed");
            r10.A09.A05("send_product_message_tag", false);
            Log.w("product-details/send-product/temp file creation failed");
        } else {
            if (i3 == 2) {
                Intent A0x = C14750ph.A0q().A0x(r8, r7);
                A0x.putExtra("product", r11);
                A0x.putExtra("product_file", file);
                A0x.putExtra("_ci_", C42341xd.A01(r8, 0, C13680ns.A09(), 0));
                A0x.putExtra("business_jid", userJid.getRawString());
                AnonymousClass22U.A00(A0x, "CatalogUtils");
                r8.startActivity(A0x);
            } else {
                Uri fromFile = Uri.fromFile(file);
                if (i3 != 1 || r7 == null) {
                    HashSet A0o = C13680ns.A0o();
                    C13690nt.A1O(A0o, 23);
                    AnonymousClass391 r1 = new AnonymousClass391(r8);
                    r1.A0D = true;
                    r1.A0F = true;
                    r1.A0N = file.getAbsolutePath();
                    r1.A0R = C13680ns.A0n(A0o);
                    r8.startActivityForResult(r1.A00(), 3);
                } else {
                    C16740tZ r19 = null;
                    if (j2 > 0) {
                        r19 = r10.A08.A0K.A00(j2);
                    }
                    C16760tb r4 = r10.A03;
                    r4.A1Y.Acl(new RunnableRunnableShape0S0600000_I0(fromFile, r4, r11, userJid, r19, Collections.singletonList(r7)));
                    if (i2 < C13700nu.A00(list, 1)) {
                        C50262Yq r16 = r24;
                        C15830rv r17 = r7;
                        AnonymousClass1KX r142 = r10;
                        C14550pN r152 = r8;
                        r142.A02(r152, r16, r17, userJid, list, 1, i2 + 1, j2);
                    } else {
                        C13690nt.A0q(r8);
                    }
                }
            }
            r10.A09.A05("send_product_message_tag", true);
        }
        r13.A04();
    }
}
