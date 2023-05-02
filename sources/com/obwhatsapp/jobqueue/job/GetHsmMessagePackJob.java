package com.obwhatsapp.jobqueue.job;

import X.AnonymousClass1WH;
import X.C28791Xq;
import android.content.Context;
import android.text.TextUtils;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.whispersystems.jobqueue.Job;

public final class GetHsmMessagePackJob extends Job implements C28791Xq {
    public static final HashSet A00 = new HashSet();
    public static final long serialVersionUID = 1;
    public final String elementName;
    public final Locale[] locales;
    public final String namespace;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GetHsmMessagePackJob(java.lang.String r4, java.lang.String r5, java.util.Locale[] r6) {
        /*
            r3 = this;
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement r0 = new com.obwhatsapp.jobqueue.requirement.ChatConnectionRequirement
            r0.<init>()
            r2.add(r0)
            r1 = 1
            org.whispersystems.jobqueue.JobParameters r0 = new org.whispersystems.jobqueue.JobParameters
            r0.<init>(r4, r2, r1)
            r3.<init>(r0)
            X.AnonymousClass00B.A0J(r6)
            r3.locales = r6
            X.AnonymousClass00B.A05(r4)
            r3.namespace = r4
            X.AnonymousClass00B.A05(r5)
            r3.elementName = r5
            java.util.HashSet r1 = A00
            monitor-enter(r1)
            r1.add(r3)     // Catch:{ all -> 0x002d }
            monitor-exit(r1)     // Catch:{ all -> 0x002d }
            return
        L_0x002d:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x002d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.jobqueue.job.GetHsmMessagePackJob.<init>(java.lang.String, java.lang.String, java.util.Locale[]):void");
    }

    public static boolean A00(String str, String str2, Locale[] localeArr) {
        HashSet hashSet = A00;
        synchronized (hashSet) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                GetHsmMessagePackJob getHsmMessagePackJob = (GetHsmMessagePackJob) it.next();
                if (Arrays.equals(getHsmMessagePackJob.locales, localeArr) && TextUtils.equals(getHsmMessagePackJob.namespace, str) && TextUtils.equals(getHsmMessagePackJob.elementName, str2)) {
                    return true;
                }
            }
            return false;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        Locale[] localeArr = this.locales;
        if (localeArr == null || localeArr.length == 0) {
            throw new InvalidObjectException("locales[] must not be empty");
        } else if (TextUtils.isEmpty(this.namespace)) {
            throw new InvalidObjectException("namespace must not be empty");
        } else if (!TextUtils.isEmpty(this.elementName)) {
            HashSet hashSet = A00;
            synchronized (hashSet) {
                hashSet.add(this);
            }
        } else {
            throw new InvalidObjectException("elementName must not be empty");
        }
    }

    public final String A04() {
        StringBuilder sb = new StringBuilder("; namespace=");
        sb.append(this.namespace);
        sb.append("; element=");
        sb.append(this.elementName);
        sb.append("; locales=");
        sb.append(AnonymousClass1WH.A08(this.locales));
        sb.append("; persistentId=");
        sb.append(this.A01);
        return sb.toString();
    }

    public void Adl(Context context) {
    }
}
