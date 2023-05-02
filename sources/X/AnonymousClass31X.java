package X;

import android.content.Intent;
import com.obwhatsapp.conversation.conversationrow.album.MediaAlbumActivity;
import com.whatsapp.jid.GroupJid;
import java.util.Map;

/* renamed from: X.31X  reason: invalid class name */
public final class AnonymousClass31X extends C101544xU {
    public final MediaAlbumActivity A00;
    public final C25761La A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass31X(AnonymousClass2SQ r4, MediaAlbumActivity mediaAlbumActivity, C25761La r6) {
        super(r4.A00(mediaAlbumActivity));
        C18450wi.A0I(r4, 1, r6);
        this.A00 = mediaAlbumActivity;
        this.A01 = r6;
    }

    public boolean A8o(Map map, int i2) {
        C18450wi.A0H(map, 1);
        if (i2 == 0) {
            C16740tZ r2 = (C16740tZ) C810246n.A00(map);
            MediaAlbumActivity mediaAlbumActivity = this.A00;
            C18450wi.A0H(r2, 0);
            C28381Vw r5 = r2.A11;
            C15830rv r6 = r5.A00;
            AnonymousClass00B.A06(r6);
            C16010sH A0A = mediaAlbumActivity.A00.A07.A0A(r6);
            if ((!A0A.A0J() || mediaAlbumActivity.A00.A0O.A09((GroupJid) r6)) && !mediaAlbumActivity.A00.A0Y.A0g(A0A, r6)) {
                Intent A09 = C13680ns.A09();
                A09.setClassName(mediaAlbumActivity.getPackageName(), "com.obwhatsapp.status.playback.MessageReplyActivity");
                mediaAlbumActivity.startActivity(AnonymousClass1yL.A00(A09, r5));
                return true;
            }
            AnonymousClass00B.A0C("should not reply to systemMessage", !(r2 instanceof AnonymousClass1WU));
            C15830rv A0B = r2.A0B();
            AnonymousClass00B.A06(A0B);
            mediaAlbumActivity.A06.A00.put(A0B, r2);
            new C14750ph();
            Intent A0Q = C14750ph.A0Q(mediaAlbumActivity, A0B);
            A0Q.putExtra("extra_quoted_message_row_id", r2.A0F);
            mediaAlbumActivity.A00.A07(mediaAlbumActivity, A0Q);
            return true;
        } else if (i2 != 11) {
            return super.A8o(map, i2);
        } else {
            return this.A01.A01.A02(this.A00, (C16740tZ) C810246n.A00(map));
        }
    }
}
