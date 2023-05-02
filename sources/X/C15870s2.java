package X;

import android.content.ContentProvider;
import android.content.Context;
import android.content.UriMatcher;
import com.obwhatsapp.contentprovider.MediaProvider;
import com.obwhatsapp.instrumentation.api.InstrumentationProvider;
import com.obwhatsapp.migration.export.api.ExportMigrationContentProvider;
import com.obwhatsapp.registration.directmigration.MigrationContentProvider;
import com.whatsapp.stickers.storage.WhitelistPackQueryContentProvider;
import com.whatsapp.util.Log;

/* renamed from: X.0s2  reason: invalid class name and case insensitive filesystem */
public abstract class C15870s2 extends ContentProvider {
    public boolean A00;

    public synchronized void A00() {
        IllegalStateException illegalStateException;
        if (!this.A00) {
            StringBuilder sb = new StringBuilder();
            sb.append("WaBaseContentProvider/ensureInitialized called for ");
            sb.append(getClass().getSimpleName());
            Log.i(sb.toString());
            if (!AnonymousClass01E.A01()) {
                AnonymousClass00B.A00();
                AnonymousClass00B.A00.block();
            }
            if (this instanceof WhitelistPackQueryContentProvider) {
                WhitelistPackQueryContentProvider whitelistPackQueryContentProvider = (WhitelistPackQueryContentProvider) this;
                whitelistPackQueryContentProvider.A01 = (C16170sZ) ((C16150sX) ((AnonymousClass01F) AnonymousClass01I.A00(whitelistPackQueryContentProvider.getContext().getApplicationContext(), AnonymousClass01F.class))).AOv.get();
            } else if (this instanceof MigrationContentProvider) {
                MigrationContentProvider migrationContentProvider = (MigrationContentProvider) this;
                AnonymousClass01F r3 = (AnonymousClass01F) AnonymousClass01I.A00(migrationContentProvider.getContext(), AnonymousClass01F.class);
                C16150sX r2 = (C16150sX) r3;
                migrationContentProvider.A01 = (C16040sK) r2.ADr.get();
                migrationContentProvider.A00 = (C16180sb) r2.A8b.get();
                migrationContentProvider.A02 = (C15900s5) r2.ALm.get();
                migrationContentProvider.A05 = (C16190sc) r2.A8R.get();
                migrationContentProvider.A04 = (C16200sd) r2.A7h.get();
                migrationContentProvider.A0B = (C16210se) r2.AQr.get();
                migrationContentProvider.A0A = (C16220sf) r2.A3y.get();
                migrationContentProvider.A09 = (C16250si) r2.AFP.get();
                migrationContentProvider.A07 = r3.Ai3();
                migrationContentProvider.A06 = (C16260sj) r2.AQe.get();
                migrationContentProvider.A03 = (C16270sk) r2.A7g.get();
                migrationContentProvider.A0C = (C16280sl) r2.ANX.get();
                migrationContentProvider.A08 = (C16290sm) r2.AQk.get();
            } else {
                if (this instanceof ExportMigrationContentProvider) {
                    ExportMigrationContentProvider exportMigrationContentProvider = (ExportMigrationContentProvider) this;
                    Context context = exportMigrationContentProvider.getContext();
                    if (context != null) {
                        AnonymousClass01F r22 = (AnonymousClass01F) AnonymousClass01I.A00(context, AnonymousClass01F.class);
                        exportMigrationContentProvider.A02 = r22.A1G();
                        exportMigrationContentProvider.A01 = r22.A6q();
                        C16150sX r23 = (C16150sX) r22;
                        exportMigrationContentProvider.A05 = (C16310sp) r23.A82.get();
                        C16330sr r6 = (C16330sr) r23.A85.get();
                        Context context2 = r23.AS2.A00;
                        C16340ss.A01(context2);
                        C16350st r8 = new C16350st(context2);
                        exportMigrationContentProvider.A03 = new C16380sw((C16300so) r23.A5p.get(), (C16360su) r23.AFj.get(), r6, r23.A1Z(), r8, (C16320sq) r23.ARB.get());
                        exportMigrationContentProvider.A06 = (C16390sx) r23.A8D.get();
                        exportMigrationContentProvider.A04 = (C16400sy) r23.A8C.get();
                        UriMatcher uriMatcher = new UriMatcher(-1);
                        String str = C16410sz.A03;
                        uriMatcher.addURI(str, "files", 1);
                        uriMatcher.addURI(str, "file/#", 2);
                        exportMigrationContentProvider.A00 = uriMatcher;
                    } else {
                        illegalStateException = new IllegalStateException("Context is not attached.");
                    }
                } else if (this instanceof InstrumentationProvider) {
                    InstrumentationProvider instrumentationProvider = (InstrumentationProvider) this;
                    Context context3 = instrumentationProvider.getContext();
                    if (context3 != null) {
                        C16150sX r24 = (C16150sX) ((AnonymousClass01F) AnonymousClass01I.A00(context3, AnonymousClass01F.class));
                        instrumentationProvider.A02 = (C15970sD) r24.ACi.get();
                        instrumentationProvider.A00 = (C15890s4) r24.ACZ.get();
                        instrumentationProvider.A03 = (C15940sA) r24.ACj.get();
                        instrumentationProvider.A04 = (C15960sC) r24.AKz.get();
                        instrumentationProvider.A01 = (C15980sE) r24.A5M.get();
                    } else {
                        illegalStateException = new IllegalStateException("Context is not attached.");
                    }
                } else {
                    MediaProvider mediaProvider = (MediaProvider) this;
                    AnonymousClass01F r32 = (AnonymousClass01F) AnonymousClass01I.A00(mediaProvider.getContext(), AnonymousClass01F.class);
                    mediaProvider.A04 = r32.Agj();
                    mediaProvider.A09 = r32.A1G();
                    C16150sX r25 = (C16150sX) r32;
                    mediaProvider.A00 = (C16180sb) r25.A8b.get();
                    mediaProvider.A01 = (C16000sG) r25.A4x.get();
                    mediaProvider.A02 = (C16080sP) r25.AQ9.get();
                    mediaProvider.A05 = r32.Ai9();
                    mediaProvider.A06 = (C16460t6) r25.A5k.get();
                    mediaProvider.A07 = (C16480t8) r25.AEF.get();
                    mediaProvider.A08 = (C16500tA) r25.AMF.get();
                    mediaProvider.A03 = (C15800rs) r25.A5c.get();
                    mediaProvider.A0A = (C16510tB) r25.A8S.get();
                }
                throw illegalStateException;
            }
            this.A00 = true;
        }
    }

    public final boolean onCreate() {
        return true;
    }
}
