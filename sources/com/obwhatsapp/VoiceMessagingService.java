package com.obwhatsapp;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.AnonymousClass01F;
import X.AnonymousClass135;
import X.AnonymousClass1A9;
import X.AnonymousClass2T4;
import X.AnonymousClass2T5;
import X.AnonymousClass2T6;
import X.C007503l;
import X.C13680ns;
import X.C13700nu;
import X.C14710pd;
import X.C14750ph;
import X.C15830rv;
import X.C16000sG;
import X.C16030sJ;
import X.C16150sX;
import X.C16750ta;
import X.C16760tb;
import X.C17030uP;
import X.C18210wK;
import X.C19380yL;
import X.C20260zl;
import X.C218415q;
import X.C41861wm;
import X.C41871wn;
import X.C42341xd;
import X.C45912Bp;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ClipData;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.facebook.redex.RunnableRunnableShape1S1200000_I1;
import com.facebook.redex.RunnableRunnableShape3S0300000_I1;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.obwhatsapp.yo.yo;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.IOException;

public class VoiceMessagingService extends SearchActionVerificationClientService {
    public AnonymousClass2T5 A00;
    public C16760tb A01;
    public C16000sG A02;
    public C17030uP A03;
    public C19380yL A04;
    public AnonymousClass013 A05;
    public C14710pd A06;
    public C20260zl A07;
    public C18210wK A08;
    public AnonymousClass135 A09;
    public AnonymousClass1A9 A0A;
    public final Handler A0B = AnonymousClass000.A0L();

    public void attachBaseContext(Context context) {
        AnonymousClass01F A0A2 = C13700nu.A0A(context);
        C16150sX r1 = (C16150sX) A0A2;
        this.A06 = C16150sX.A0k(r1);
        this.A01 = (C16760tb) r1.APV.get();
        this.A07 = A0A2.A1H();
        this.A08 = (C18210wK) r1.AE4.get();
        this.A02 = C16150sX.A0M(r1);
        this.A0A = (AnonymousClass1A9) r1.AE7.get();
        this.A05 = A0A2.Ai9();
        this.A09 = (AnonymousClass135) r1.AP7.get();
        this.A03 = C16150sX.A0P(r1);
        this.A04 = (C19380yL) r1.AQd.get();
        AnonymousClass2T4 r2 = new AnonymousClass2T4(C16150sX.A0Z(r1));
        this.A00 = r2;
        super.attachBaseContext(new AnonymousClass2T6(context, r2, this.A05));
    }

    public void performAction(Intent intent, boolean z2, Bundle bundle) {
        StringBuilder A0r;
        Uri uri;
        String obj;
        if (!z2) {
            obj = "VoiceMessagingService/ignoring unverified voice message";
        } else {
            String stringExtra = intent.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_CHAT_ID");
            C15830rv A022 = C15830rv.A02(stringExtra);
            if (C16030sJ.A0O(A022) || C16030sJ.A0G(A022) || C16030sJ.A0L(A022)) {
                C14710pd r2 = this.A06;
                C17030uP r1 = this.A03;
                UserJid of = UserJid.of(A022);
                if (!C41861wm.A01(r1, r2, this.A07, of)) {
                    if (!C41871wn.A00(this.A03, this.A06, this.A07, of, this.A09)) {
                        ClipData clipData = intent.getClipData();
                        if (clipData != null) {
                            if (clipData.getItemCount() == 1) {
                                ClipData.Item itemAt = clipData.getItemAt(0);
                                if (!(itemAt == null || (uri = itemAt.getUri()) == null)) {
                                    try {
                                        C16750ta r3 = new C16750ta();
                                        r3.A0F = this.A0A.A0Z(uri);
                                        StringBuilder A0o = AnonymousClass000.A0o();
                                        A0o.append("VoiceMessagingService/sending verified voice message (voice); jid=");
                                        A0o.append(A022);
                                        C13680ns.A1V(A0o);
                                        this.A0B.post(new RunnableRunnableShape3S0300000_I1(this, A022, r3, 6));
                                        return;
                                    } catch (IOException e2) {
                                        Log.w("VoiceMessagingService/IO Exception while trying to send voice message", e2);
                                        return;
                                    }
                                }
                            } else if (clipData.getItemCount() > 1 || clipData.getItemCount() < 0) {
                                A0r = AnonymousClass000.A0r("VoiceMessagingService/ignoring voice message with unexpected item count; itemCount=");
                                A0r.append(clipData.getItemCount());
                            }
                        }
                        String stringExtra2 = intent.getStringExtra("android.intent.extra.TEXT");
                        if (TextUtils.isEmpty(stringExtra2)) {
                            A0r = AnonymousClass000.A0r("VoiceMessagingService/ignoring voice message with empty contents; jid=");
                            A0r.append(A022);
                            A0r.append("; text=");
                            A0r.append(stringExtra2);
                        } else {
                            Log.i(AnonymousClass000.A0g("VoiceMessagingService/sending verified voice message (text); jid=", A022));
                            this.A0B.post(new RunnableRunnableShape1S1200000_I1(this, stringExtra2, A022, 2));
                            return;
                        }
                    }
                }
                AnonymousClass00B.A06(A022);
                Uri withAppendedId = ContentUris.withAppendedId(C45912Bp.A00, this.A02.A0A(A022).A05());
                Intent A082 = C14750ph.A08(this, 0);
                A082.setData(withAppendedId);
                A082.setAction("com.obwhatsapp.intent.action.OPEN");
                A082.addFlags(335544320);
                PendingIntent A002 = C42341xd.A00(this, 2, A082.putExtra("fromNotification", true), 0);
                C007503l A003 = C218415q.A00(this);
                A003.A0J = "other_notifications@1";
                A003.A0I = "err";
                A003.A03 = 1;
                A003.A0D(true);
                A003.A02(4);
                A003.A06 = 0;
                A003.A09 = A002;
                A003.A0A(getString(R.string.str17b9));
                A003.A09(getString(R.string.str17b8));
                A003.A07.icon = yo.getNIcon(R.drawable.notifybar);
                this.A04.A02(35, A003.A01());
                return;
            }
            A0r = AnonymousClass000.A0r("VoiceMessagingService/ignoring voice message directed at invalid jid; jid=");
            A0r.append(stringExtra);
            obj = A0r.toString();
        }
        Log.w(obj);
    }

    public void postForegroundNotification() {
        C007503l A002 = C218415q.A00(this);
        A002.A0J = "other_notifications@1";
        A002.A0A(getString(R.string.str150a));
        A002.A09 = C42341xd.A00(this, 1, C14750ph.A02(this), 0);
        A002.A03 = -2;
        A002.A07.icon = yo.getNIcon(R.drawable.notifybar);
        Notification A012 = A002.A01();
        Log.i(AnonymousClass000.A0g("VoiceMessagingService/posting assistant notif:", A012));
        startForeground(19, A012);
    }
}
