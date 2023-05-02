package com.obwhatsapp.yo;

import android.app.Activity;
import android.os.AsyncTask;
import com.obwhatsapp.jobqueue.job.SendReadReceiptJob;
import com.obwhatsapp.yo.autoschedreply.p;
import java.util.Arrays;

public final /* synthetic */ class p1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final int f844a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f845b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f846c;

    public /* synthetic */ p1(Activity activity, boolean z2) {
        this.f845b = z2;
        this.f846c = activity;
    }

    public /* synthetic */ p1(SendReadReceiptJob sendReadReceiptJob, boolean z2) {
        this.f846c = sendReadReceiptJob;
        this.f845b = z2;
    }

    public final void run() {
        switch (this.f844a) {
            case 0:
                SendReadReceiptJob sendReadReceiptJob = (SendReadReceiptJob) this.f846c;
                boolean z2 = this.f845b;
                String str = yo.mpack;
                synchronized (yo.class) {
                    String str2 = "ۚۨۥۡۨۘۘ۠ۛۨۨ۬ۛۤ۫ۥۗ۫۬ۘۜ۬";
                    while (true) {
                        switch (str2.hashCode() ^ 2028286923) {
                            case -1045718835:
                                if (z2) {
                                    str2 = "ۜۛۜۘۨۧۖۚ۬ۦۘۗۗ۬۫ۦۨۘۜۖۧۘ۟ۚۘۘ۠۠۬";
                                    break;
                                } else {
                                    str2 = "ۨ۟ۖ۠ۨۘۨ۟۫ۨۦۜۘۥۜ۠";
                                    continue;
                                }
                            case 678622651:
                                String arrays = Arrays.toString(sendReadReceiptJob.messageIds);
                                a aVar = yo.f126r;
                                String str3 = sendReadReceiptJob.jid;
                                aVar.getClass();
                                String str4 = "ۗۖۖ۫۠ۘۚۨۘۘۗۜ۫ۥ۬ۥۘۡۨۜۘ";
                                while (true) {
                                    switch (str4.hashCode() ^ -442403610) {
                                        case -1718668817:
                                            if (!a.c(str3, arrays)) {
                                                str4 = "ۛۤۛۨۘ۬۬ۥۦۤۘۘۖۤۨ";
                                                break;
                                            } else {
                                                str4 = "ۤۡۛۚۘۥۘۦۖۧۘۙۖ۠ۧ۫۠";
                                                continue;
                                            }
                                        case -1540071057:
                                            break;
                                        case -1104283502:
                                            yo.f126r.b(sendReadReceiptJob.jid, arrays, sendReadReceiptJob.participant);
                                            break;
                                        case -219817281:
                                            str4 = "۫ۤۘۘۖۖ۠ۘۤۥ۟ۦۥۡۚۗۙ۟ۜۘ";
                                            continue;
                                        default:
                                            continue;
                                    }
                                }
                            case 904176420:
                                str2 = "ۗۙۡ۬۫ۙ۟۟ۧۛ۟ۡۘۢۖۥۘۤۡ۠ۖۙۨ";
                                continue;
                            case 1350439879:
                                try {
                                    String str5 = sendReadReceiptJob.jid;
                                    String[] strArr = sendReadReceiptJob.messageIds;
                                    AsyncTask.THREAD_POOL_EXECUTOR.execute(new p(str5, yo.stripJID(str5), strArr, 2));
                                    break;
                                } catch (Exception e2) {
                                    break;
                                } catch (Throwable th) {
                                    Class<yo> cls = yo.class;
                                    throw th;
                                }
                        }
                    }
                }
                return;
            default:
                boolean z3 = this.f845b;
                Activity activity = (Activity) this.f846c;
                String str6 = yo.mpack;
                try {
                    new z0(activity, z3).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                    new z().execute(new Void[0]);
                    return;
                } catch (Exception e3) {
                    return;
                }
        }
    }
}
