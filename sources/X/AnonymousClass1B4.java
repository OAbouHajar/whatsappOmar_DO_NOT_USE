package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.format.DateUtils;
import android.widget.RemoteViews;
import com.obwhatsapp.R;
import com.obwhatsapp.service.BackgroundMediaControlService;

/* renamed from: X.1B4  reason: invalid class name */
public class AnonymousClass1B4 {
    public long A00;
    public C007503l A01;
    public C16740tZ A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final C16040sK A07;
    public final C17160ud A08;
    public final C16000sG A09;
    public final C16080sP A0A;
    public final C17200uh A0B;
    public final C19610yi A0C;
    public final AnonymousClass01V A0D;
    public final C16980tz A0E;
    public final C19380yL A0F;

    public AnonymousClass1B4(C16040sK r1, C17160ud r2, C16000sG r3, C16080sP r4, C17200uh r5, C19610yi r6, AnonymousClass01V r7, C16980tz r8, C19380yL r9) {
        this.A0E = r8;
        this.A07 = r1;
        this.A0B = r5;
        this.A08 = r2;
        this.A09 = r3;
        this.A0D = r7;
        this.A0A = r4;
        this.A0F = r9;
        this.A0C = r6;
    }

    public final void A00(RemoteViews remoteViews, boolean z2) {
        int i2;
        int i3;
        int i4;
        String str = this.A03;
        if (str != null) {
            remoteViews.setTextViewText(R.id.ongoing_media_text, str);
        }
        Context context = this.A0E.A00;
        Intent intent = new Intent(context, BackgroundMediaControlService.class);
        if (z2) {
            intent.setAction("com.obwhatsapp.service.BackgroundMediaControlService.STOP");
            i2 = R.id.ongoing_media_control_btn;
            i3 = R.id.ongoing_media_control_btn;
            remoteViews.setImageViewResource(R.id.ongoing_media_control_btn, R.drawable.inline_audio_pause);
            i4 = R.string.str0f30;
        } else {
            intent.setAction("com.obwhatsapp.service.BackgroundMediaControlService.START");
            i2 = R.id.ongoing_media_control_btn;
            i3 = R.id.ongoing_media_control_btn;
            remoteViews.setImageViewResource(R.id.ongoing_media_control_btn, R.drawable.inline_audio_play);
            i4 = R.string.str1d62;
        }
        remoteViews.setContentDescription(i2, context.getString(i4));
        this.A01.A0E(z2);
        this.A05 = z2;
        int i5 = 134217728;
        if (C42341xd.A00) {
            i5 = 201326592;
        }
        remoteViews.setOnClickPendingIntent(i3, PendingIntent.getService(context, 0, intent, i5));
        C007503l r0 = this.A01;
        r0.A0E = remoteViews;
        this.A0F.A02(14, r0.A01());
    }

    public void A01(AnonymousClass2DT r8) {
        boolean A0J = r8.A0J();
        if (!this.A04) {
            RemoteViews remoteViews = new RemoteViews(this.A0E.A00.getPackageName(), R.layout.layout0426);
            int A032 = r8.A03();
            remoteViews.setProgressBar(R.id.ongoing_media_audio_seekbar, r8.A03, A032, false);
            remoteViews.setTextViewText(R.id.ongoing_media_timeLeft, DateUtils.formatElapsedTime((long) (A032 / 1000)));
            A00(remoteViews, A0J);
            return;
        }
        boolean z2 = this.A05;
        if (!A0J ? !z2 : z2) {
            if (!this.A06) {
                return;
            }
        }
        A00(new RemoteViews(this.A0E.A00.getPackageName(), R.layout.layout0427), A0J);
        this.A06 = false;
    }
}
