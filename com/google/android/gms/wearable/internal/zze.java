package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zze implements Creator {
    static void zza(AmsEntityUpdateParcelable amsEntityUpdateParcelable, Parcel parcel, int i) {
        int zzak = zzb.zzak(parcel);
        zzb.zzc(parcel, 1, amsEntityUpdateParcelable.mVersionCode);
        zzb.zza(parcel, 2, amsEntityUpdateParcelable.zzCu());
        zzb.zza(parcel, 3, amsEntityUpdateParcelable.zzCv());
        zzb.zza(parcel, 4, amsEntityUpdateParcelable.getValue(), false);
        zzb.zzH(parcel, zzak);
    }

    public Object createFromParcel(Parcel parcel) {
        return zzhq(parcel);
    }

    public Object[] newArray(int i) {
        return zzky(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable zzhq(android.os.Parcel r9) {
        /*
        r8 = this;
        r1 = 0;
        r4 = com.google.android.gms.wearable.internal.zzau.zza.a;
        r5 = com.google.android.gms.common.internal.safeparcel.zza.zzaj(r9);
        r0 = 0;
        r2 = r1;
        r3 = r1;
    L_0x000a:
        r6 = r9.dataPosition();
        if (r6 >= r5) goto L_0x0020;
    L_0x0010:
        r6 = com.google.android.gms.common.internal.safeparcel.zza.zzai(r9);
        r7 = com.google.android.gms.common.internal.safeparcel.zza.zzbH(r6);
        switch(r7) {
            case 1: goto L_0x0042;
            case 2: goto L_0x0048;
            case 3: goto L_0x004e;
            case 4: goto L_0x0054;
            default: goto L_0x001b;
        };
    L_0x001b:
        com.google.android.gms.common.internal.safeparcel.zza.zzb(r9, r6);	 Catch:{ zza -> 0x005b }
    L_0x001e:
        if (r4 == 0) goto L_0x000a;
    L_0x0020:
        r4 = r9.dataPosition();	 Catch:{ zza -> 0x0040 }
        if (r4 == r5) goto L_0x005d;
    L_0x0026:
        r0 = new com.google.android.gms.common.internal.safeparcel.zza$zza;	 Catch:{ zza -> 0x0040 }
        r1 = new java.lang.StringBuilder;	 Catch:{ zza -> 0x0040 }
        r1.<init>();	 Catch:{ zza -> 0x0040 }
        r2 = "Overread allowed size end=";
        r1 = r1.append(r2);	 Catch:{ zza -> 0x0040 }
        r1 = r1.append(r5);	 Catch:{ zza -> 0x0040 }
        r1 = r1.toString();	 Catch:{ zza -> 0x0040 }
        r0.<init>(r1, r9);	 Catch:{ zza -> 0x0040 }
        throw r0;	 Catch:{ zza -> 0x0040 }
    L_0x0040:
        r0 = move-exception;
        throw r0;
    L_0x0042:
        r3 = com.google.android.gms.common.internal.safeparcel.zza.zzg(r9, r6);
        if (r4 == 0) goto L_0x001e;
    L_0x0048:
        r2 = com.google.android.gms.common.internal.safeparcel.zza.zze(r9, r6);
        if (r4 == 0) goto L_0x001e;
    L_0x004e:
        r1 = com.google.android.gms.common.internal.safeparcel.zza.zze(r9, r6);
        if (r4 == 0) goto L_0x001e;
    L_0x0054:
        r0 = com.google.android.gms.common.internal.safeparcel.zza.zzo(r9, r6);
        if (r4 == 0) goto L_0x001e;
    L_0x005a:
        goto L_0x001b;
    L_0x005b:
        r0 = move-exception;
        throw r0;
    L_0x005d:
        r4 = new com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable;
        r4.<init>(r3, r2, r1, r0);
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.zze.zzhq(android.os.Parcel):com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable");
    }

    public AmsEntityUpdateParcelable[] zzky(int i) {
        return new AmsEntityUpdateParcelable[i];
    }
}
