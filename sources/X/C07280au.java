package X;

import android.app.Notification;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0au  reason: invalid class name and case insensitive filesystem */
public class C07280au implements C11840jQ {
    public int A00;
    public RemoteViews A01;
    public final Notification.Builder A02;
    public final Context A03;
    public final Bundle A04 = new Bundle();
    public final C007503l A05;
    public final List A06 = AnonymousClass000.A0u();

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x021e, code lost:
        if (r4 >= 20) goto L_0x0220;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C07280au(X.C007503l r14) {
        /*
            r13 = this;
            r13.<init>()
            java.util.ArrayList r0 = X.AnonymousClass000.A0u()
            r13.A06 = r0
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r13.A04 = r0
            r13.A05 = r14
            android.content.Context r1 = r14.A0B
            r13.A03 = r1
            int r8 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r8 < r2) goto L_0x018d
            java.lang.String r0 = r14.A0J
            android.app.Notification$Builder r3 = new android.app.Notification$Builder
            r3.<init>(r1, r0)
        L_0x0023:
            r13.A02 = r3
            android.app.Notification r7 = r14.A07
            long r0 = r7.when
            android.app.Notification$Builder r3 = r3.setWhen(r0)
            int r1 = r7.icon
            int r0 = r7.iconLevel
            android.app.Notification$Builder r1 = r3.setSmallIcon(r1, r0)
            android.widget.RemoteViews r0 = r7.contentView
            android.app.Notification$Builder r3 = r1.setContent(r0)
            java.lang.CharSequence r1 = r7.tickerText
            r0 = 0
            android.app.Notification$Builder r1 = r3.setTicker(r1, r0)
            long[] r0 = r7.vibrate
            android.app.Notification$Builder r4 = r1.setVibrate(r0)
            int r3 = r7.ledARGB
            int r1 = r7.ledOnMS
            int r0 = r7.ledOffMS
            android.app.Notification$Builder r1 = r4.setLights(r3, r1, r0)
            int r0 = r7.flags
            r0 = r0 & 2
            r5 = 1
            r6 = 0
            boolean r0 = X.AnonymousClass000.A1O(r0)
            android.app.Notification$Builder r1 = r1.setOngoing(r0)
            int r0 = r7.flags
            r0 = r0 & 8
            boolean r0 = X.AnonymousClass000.A1O(r0)
            android.app.Notification$Builder r1 = r1.setOnlyAlertOnce(r0)
            int r0 = r7.flags
            r0 = r0 & 16
            boolean r0 = X.AnonymousClass000.A1O(r0)
            android.app.Notification$Builder r1 = r1.setAutoCancel(r0)
            int r0 = r7.defaults
            android.app.Notification$Builder r1 = r1.setDefaults(r0)
            java.lang.CharSequence r0 = r14.A0H
            android.app.Notification$Builder r1 = r1.setContentTitle(r0)
            java.lang.CharSequence r0 = r14.A0G
            android.app.Notification$Builder r1 = r1.setContentText(r0)
            r0 = 0
            android.app.Notification$Builder r1 = r1.setContentInfo(r0)
            android.app.PendingIntent r0 = r14.A09
            android.app.Notification$Builder r1 = r1.setContentIntent(r0)
            android.app.PendingIntent r0 = r7.deleteIntent
            android.app.Notification$Builder r3 = r1.setDeleteIntent(r0)
            android.app.PendingIntent r1 = r14.A0A
            int r0 = r7.flags
            r0 = r0 & 128(0x80, float:1.794E-43)
            boolean r0 = X.AnonymousClass000.A1O(r0)
            android.app.Notification$Builder r1 = r3.setFullScreenIntent(r1, r0)
            android.graphics.Bitmap r0 = r14.A0C
            android.app.Notification$Builder r1 = r1.setLargeIcon(r0)
            int r0 = r14.A02
            android.app.Notification$Builder r4 = r1.setNumber(r0)
            int r3 = r14.A05
            int r1 = r14.A04
            boolean r0 = r14.A0U
            r4.setProgress(r3, r1, r0)
            r3 = 21
            if (r8 >= r3) goto L_0x00cb
            android.app.Notification$Builder r4 = r13.A02
            android.net.Uri r1 = r7.sound
            int r0 = r7.audioStreamType
            r4.setSound(r1, r0)
        L_0x00cb:
            r8 = 20
            android.app.Notification$Builder r1 = r13.A02
            r0 = 0
            android.app.Notification$Builder r1 = r1.setSubText(r0)
            boolean r0 = r14.A0W
            android.app.Notification$Builder r1 = r1.setUsesChronometer(r0)
            int r0 = r14.A03
            android.app.Notification$Builder r1 = r1.setPriority(r0)
            com.obwhatsapp.yo.yo.Pop_Heds(r1)
            java.util.ArrayList r0 = r14.A0N
            java.util.Iterator r12 = r0.iterator()
        L_0x00e9:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0194
            java.lang.Object r10 = r12.next()
            X.04E r10 = (X.AnonymousClass04E) r10
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r8) goto L_0x0180
            androidx.core.graphics.drawable.IconCompat r1 = r10.A00()
            r0 = 23
            r11 = 0
            if (r4 < r0) goto L_0x016e
            if (r1 == 0) goto L_0x016c
            android.graphics.drawable.Icon r4 = r1.A08()
        L_0x0108:
            java.lang.CharSequence r1 = r10.A03
            android.app.PendingIntent r0 = r10.A01
            android.app.Notification$Action$Builder r9 = new android.app.Notification$Action$Builder
            r9.<init>(r4, r1, r0)
        L_0x0111:
            X.04G[] r0 = r10.A09
            if (r0 == 0) goto L_0x0124
            android.app.RemoteInput[] r4 = X.AnonymousClass04G.A01(r0)
            int r1 = r4.length
        L_0x011a:
            if (r11 >= r1) goto L_0x0124
            r0 = r4[r11]
            r9.addRemoteInput(r0)
            int r11 = r11 + 1
            goto L_0x011a
        L_0x0124:
            android.os.Bundle r0 = r10.A07
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>(r0)
            boolean r11 = r10.A04
            java.lang.String r0 = "android.support.allowGeneratedReplies"
            r4.putBoolean(r0, r11)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L_0x013b
            r9.setAllowGeneratedReplies(r11)
        L_0x013b:
            int r11 = r10.A06
            java.lang.String r0 = "android.support.action.semanticAction"
            r4.putInt(r0, r11)
            r0 = 28
            if (r1 < r0) goto L_0x0157
            r9.setSemanticAction(r11)
            r0 = 29
            if (r1 < r0) goto L_0x0157
            r9.setContextual(r6)
            r0 = 31
            if (r1 < r0) goto L_0x0157
            r9.setAuthenticationRequired(r6)
        L_0x0157:
            boolean r1 = r10.A05
            java.lang.String r0 = "android.support.action.showsUserInterface"
            r4.putBoolean(r0, r1)
            r9.addExtras(r4)
            android.app.Notification$Builder r1 = r13.A02
            android.app.Notification$Action r0 = r9.build()
            r1.addAction(r0)
            goto L_0x00e9
        L_0x016c:
            r4 = 0
            goto L_0x0108
        L_0x016e:
            if (r1 == 0) goto L_0x017e
            int r4 = r1.A04()
        L_0x0174:
            java.lang.CharSequence r1 = r10.A03
            android.app.PendingIntent r0 = r10.A01
            android.app.Notification$Action$Builder r9 = new android.app.Notification$Action$Builder
            r9.<init>(r4, r1, r0)
            goto L_0x0111
        L_0x017e:
            r4 = 0
            goto L_0x0174
        L_0x0180:
            java.util.List r1 = r13.A06
            android.app.Notification$Builder r0 = r13.A02
            android.os.Bundle r0 = X.C06480Wd.A00(r0, r10)
            r1.add(r0)
            goto L_0x00e9
        L_0x018d:
            android.app.Notification$Builder r3 = new android.app.Notification$Builder
            r3.<init>(r1)
            goto L_0x0023
        L_0x0194:
            android.os.Bundle r1 = r14.A0D
            if (r1 == 0) goto L_0x019d
            android.os.Bundle r0 = r13.A04
            r0.putAll(r1)
        L_0x019d:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 >= r8) goto L_0x01cd
            boolean r0 = r14.A0T
            if (r0 == 0) goto L_0x01ac
            android.os.Bundle r1 = r13.A04
            java.lang.String r0 = "android.support.localOnly"
            r1.putBoolean(r0, r5)
        L_0x01ac:
            java.lang.String r4 = r14.A0K
            if (r4 == 0) goto L_0x01c2
            android.os.Bundle r1 = r13.A04
            java.lang.String r0 = "android.support.groupKey"
            r1.putString(r0, r4)
            boolean r0 = r14.A0S
            android.os.Bundle r1 = r13.A04
            if (r0 == 0) goto L_0x02a2
            java.lang.String r0 = "android.support.isGroupSummary"
        L_0x01bf:
            r1.putBoolean(r0, r5)
        L_0x01c2:
            java.lang.String r4 = r14.A0M
            if (r4 == 0) goto L_0x01cd
            android.os.Bundle r1 = r13.A04
            java.lang.String r0 = "android.support.sortKey"
            r1.putString(r0, r4)
        L_0x01cd:
            android.widget.RemoteViews r0 = r14.A0E
            r13.A01 = r0
            int r4 = android.os.Build.VERSION.SDK_INT
            r0 = 17
            if (r4 < r0) goto L_0x023d
            android.app.Notification$Builder r1 = r13.A02
            boolean r0 = r14.A0V
            r1.setShowWhen(r0)
            r0 = 19
            if (r4 < r0) goto L_0x023d
            if (r4 >= r3) goto L_0x0220
            java.util.ArrayList r0 = r14.A0Q
            java.util.List r9 = A00(r0)
            java.util.ArrayList r5 = r14.A0P
            int r1 = r9.size()
            int r0 = r5.size()
            int r1 = r1 + r0
            X.01i r0 = new X.01i
            r0.<init>((int) r1)
            r0.addAll(r9)
            r0.addAll(r5)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x021e
            android.os.Bundle r5 = r13.A04
            int r0 = r1.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r1 = r1.toArray(r0)
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.lang.String r0 = "android.people"
            r5.putStringArray(r0, r1)
        L_0x021e:
            if (r4 < r8) goto L_0x023d
        L_0x0220:
            android.app.Notification$Builder r1 = r13.A02
            boolean r0 = r14.A0T
            android.app.Notification$Builder r1 = r1.setLocalOnly(r0)
            java.lang.String r0 = r14.A0K
            android.app.Notification$Builder r1 = r1.setGroup(r0)
            boolean r0 = r14.A0S
            android.app.Notification$Builder r1 = r1.setGroupSummary(r0)
            java.lang.String r0 = r14.A0M
            r1.setSortKey(r0)
            int r0 = r14.A01
            r13.A00 = r0
        L_0x023d:
            r5 = 28
            if (r4 < r3) goto L_0x0306
            android.app.Notification$Builder r1 = r13.A02
            java.lang.String r0 = r14.A0I
            android.app.Notification$Builder r1 = r1.setCategory(r0)
            int r0 = r14.A00
            android.app.Notification$Builder r1 = r1.setColor(r0)
            int r0 = r14.A06
            android.app.Notification$Builder r1 = r1.setVisibility(r0)
            android.app.Notification r0 = r14.A08
            android.app.Notification$Builder r3 = r1.setPublicVersion(r0)
            android.net.Uri r1 = r7.sound
            android.media.AudioAttributes r0 = r7.audioAttributes
            r3.setSound(r1, r0)
            if (r4 >= r5) goto L_0x029f
            java.util.ArrayList r0 = r14.A0Q
            java.util.List r4 = A00(r0)
            java.util.ArrayList r3 = r14.A0P
            int r1 = r4.size()
            int r0 = r3.size()
            int r1 = r1 + r0
            X.01i r0 = new X.01i
            r0.<init>((int) r1)
            r0.addAll(r4)
            r0.addAll(r3)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
        L_0x0285:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x02a6
            java.util.Iterator r3 = r1.iterator()
        L_0x028f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x02a6
            java.lang.String r1 = X.AnonymousClass000.A0m(r3)
            android.app.Notification$Builder r0 = r13.A02
            r0.addPerson(r1)
            goto L_0x028f
        L_0x029f:
            java.util.ArrayList r1 = r14.A0P
            goto L_0x0285
        L_0x02a2:
            java.lang.String r0 = "android.support.useSideChannel"
            goto L_0x01bf
        L_0x02a6:
            java.util.ArrayList r10 = r14.A0O
            int r0 = r10.size()
            if (r0 <= 0) goto L_0x0306
            android.os.Bundle r0 = r14.A0D
            if (r0 != 0) goto L_0x02b9
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r14.A0D = r0
        L_0x02b9:
            java.lang.String r8 = "android.car.EXTENSIONS"
            android.os.Bundle r9 = r0.getBundle(r8)
            if (r9 != 0) goto L_0x02c6
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
        L_0x02c6:
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>(r9)
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            r3 = 0
        L_0x02d1:
            int r0 = r10.size()
            if (r3 >= r0) goto L_0x02eb
            java.lang.String r1 = java.lang.Integer.toString(r3)
            java.lang.Object r0 = r10.get(r3)
            X.04E r0 = (X.AnonymousClass04E) r0
            android.os.Bundle r0 = X.C06480Wd.A01(r0)
            r4.putBundle(r1, r0)
            int r3 = r3 + 1
            goto L_0x02d1
        L_0x02eb:
            java.lang.String r0 = "invisible_actions"
            r9.putBundle(r0, r4)
            r7.putBundle(r0, r4)
            android.os.Bundle r0 = r14.A0D
            if (r0 != 0) goto L_0x02fe
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r14.A0D = r0
        L_0x02fe:
            r0.putBundle(r8, r9)
            android.os.Bundle r0 = r13.A04
            r0.putBundle(r8, r7)
        L_0x0306:
            int r4 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r4 < r0) goto L_0x038a
            r0 = 24
            if (r4 < r0) goto L_0x038a
            android.app.Notification$Builder r1 = r13.A02
            android.os.Bundle r0 = r14.A0D
            android.app.Notification$Builder r1 = r1.setExtras(r0)
            r0 = 0
            r1.setRemoteInputHistory(r0)
            android.widget.RemoteViews r1 = r14.A0E
            if (r1 == 0) goto L_0x0325
            android.app.Notification$Builder r0 = r13.A02
            r0.setCustomContentView(r1)
        L_0x0325:
            r3 = 0
            if (r4 < r2) goto L_0x038a
            android.app.Notification$Builder r0 = r13.A02
            android.app.Notification$Builder r0 = r0.setBadgeIconType(r6)
            android.app.Notification$Builder r1 = r0.setSettingsText(r3)
            java.lang.String r0 = r14.A0L
            android.app.Notification$Builder r2 = r1.setShortcutId(r0)
            r0 = 0
            android.app.Notification$Builder r1 = r2.setTimeoutAfter(r0)
            int r0 = r14.A01
            r1.setGroupAlertBehavior(r0)
            java.lang.String r0 = r14.A0J
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x035c
            android.app.Notification$Builder r0 = r13.A02
            android.app.Notification$Builder r0 = r0.setSound(r3)
            android.app.Notification$Builder r0 = r0.setDefaults(r6)
            android.app.Notification$Builder r0 = r0.setLights(r6, r6, r6)
            r0.setVibrate(r3)
        L_0x035c:
            if (r4 < r5) goto L_0x038a
            java.util.ArrayList r0 = r14.A0Q
            java.util.Iterator r2 = r0.iterator()
        L_0x0364:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x037a
            java.lang.Object r0 = r2.next()
            X.04K r0 = (X.AnonymousClass04K) r0
            android.app.Notification$Builder r1 = r13.A02
            android.app.Person r0 = r0.A01()
            r1.addPerson(r0)
            goto L_0x0364
        L_0x037a:
            r0 = 29
            if (r4 < r0) goto L_0x038a
            android.app.Notification$Builder r1 = r13.A02
            boolean r0 = r14.A0R
            r1.setAllowSystemGeneratedContextualActions(r0)
            android.app.Notification$Builder r0 = r13.A02
            r0.setBubbleMetadata(r3)
        L_0x038a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07280au.<init>(X.03l):void");
    }

    public static List A00(List list) {
        ArrayList A0w = AnonymousClass000.A0w(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass04K r1 = (AnonymousClass04K) it.next();
            String str = r1.A03;
            if (str == null) {
                CharSequence charSequence = r1.A01;
                str = charSequence != null ? AnonymousClass000.A0g("name:", charSequence) : "";
            }
            A0w.add(str);
        }
        return A0w;
    }

    public Notification A01() {
        RemoteViews remoteViews;
        Notification build;
        Notification notification;
        C007503l r7 = this.A05;
        C007603n r6 = r7.A0F;
        if (r6 != null) {
            r6.A08(this);
            remoteViews = r6.A04(this);
        } else {
            remoteViews = null;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            notification = this.A02.build();
        } else {
            if (i2 >= 24) {
                build = this.A02.build();
            } else if (i2 >= 21 || i2 >= 20) {
                Notification.Builder builder = this.A02;
                builder.setExtras(this.A04);
                build = builder.build();
                RemoteViews remoteViews2 = this.A01;
                if (remoteViews2 != null) {
                    build.contentView = remoteViews2;
                }
            } else {
                if (i2 >= 19) {
                    List list = this.A06;
                    int size = list.size();
                    SparseArray sparseArray = null;
                    for (int i3 = 0; i3 < size; i3++) {
                        Object obj = list.get(i3);
                        if (obj != null) {
                            if (sparseArray == null) {
                                sparseArray = new SparseArray();
                            }
                            sparseArray.put(i3, obj);
                        }
                    }
                    if (sparseArray != null) {
                        this.A04.putSparseParcelableArray("android.support.actionExtras", sparseArray);
                    }
                    Notification.Builder builder2 = this.A02;
                    builder2.setExtras(this.A04);
                    notification = builder2.build();
                } else {
                    notification = this.A02.build();
                    Bundle A002 = AnonymousClass03V.A00(notification);
                    Bundle bundle = this.A04;
                    Bundle bundle2 = new Bundle(bundle);
                    Iterator it = bundle.keySet().iterator();
                    while (it.hasNext()) {
                        String A0m = AnonymousClass000.A0m(it);
                        if (A002.containsKey(A0m)) {
                            bundle2.remove(A0m);
                        }
                    }
                    A002.putAll(bundle2);
                    List list2 = this.A06;
                    int size2 = list2.size();
                    SparseArray sparseArray2 = null;
                    for (int i4 = 0; i4 < size2; i4++) {
                        Object obj2 = list2.get(i4);
                        if (obj2 != null) {
                            if (sparseArray2 == null) {
                                sparseArray2 = new SparseArray();
                            }
                            sparseArray2.put(i4, obj2);
                        }
                    }
                    if (sparseArray2 != null) {
                        AnonymousClass03V.A00(notification).putSparseParcelableArray("android.support.actionExtras", sparseArray2);
                    }
                }
                RemoteViews remoteViews3 = this.A01;
                if (remoteViews3 != null) {
                    notification.contentView = remoteViews3;
                }
            }
            if (this.A00 != 0) {
                notification.getGroup();
                if (notification.getGroup() != null && (notification.flags & 512) == 0) {
                    notification.sound = null;
                    notification.vibrate = null;
                    int i5 = notification.defaults & -2;
                    notification.defaults = i5;
                    notification.defaults = i5 & -3;
                }
            }
        }
        if (!(remoteViews == null && (remoteViews = r7.A0E) == null)) {
            notification.contentView = remoteViews;
        }
        if (r6 != null) {
            RemoteViews A032 = r6.A03(this);
            if (A032 != null) {
                notification.bigContentView = A032;
            }
            Bundle A003 = AnonymousClass03V.A00(notification);
            if (A003 != null) {
                r6.A06(A003);
            }
        }
        return notification;
    }
}
