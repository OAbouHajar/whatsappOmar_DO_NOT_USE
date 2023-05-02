package X;

import android.content.UriMatcher;

/* renamed from: X.0sE  reason: invalid class name and case insensitive filesystem */
public class C15980sE {
    public final UriMatcher A00;
    public final AnonymousClass01D A01;

    public C15980sE(C16040sK r13, C16000sG r14, C16080sP r15, C16070sO r16, C16110sS r17, C16130sU r18, C16120sT r19, C16100sR r20, C16020sI r21) {
        this.A01 = new AnonymousClass01T((Object) null, new C1050658b(r13, r14, r15, r16, r17, r18, r19, r20, r21));
        UriMatcher uriMatcher = new UriMatcher(-1);
        this.A00 = uriMatcher;
        uriMatcher.addURI("com.obwhatsapp.provider.instrumentation", "contacts", 1);
    }
}
