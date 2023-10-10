package c.a.a;
/* loaded from: classes.dex */
class x implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final v f58a;

    /* renamed from: b  reason: collision with root package name */
    private final Exception f59b;
    private static int[] aZ = {55374130, 81871748, 34656557};
    private static int[] aY = {6011401, 27954663, 46974780, 18270453};

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(v vVar, Exception exc) {
        this.f58a = vVar;
        this.f59b = exc;
    }

    private static String A(String str) {
        int i;
        int i2;
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();
        for (int i3 = 0; i3 < charArray.length; i3++) {
            switch (i3 % 4) {
                case 0:
                    sb.append((char) (charArray[i3] ^ 9404));
                    int i4 = aY[1];
                    if (i4 >= 0) {
                        do {
                            i2 = i4 % (32035246 ^ i4);
                            i4 = 1860657;
                        } while (i2 != 1860657);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    sb.append((char) (charArray[i3] ^ 28525));
                    int i5 = aY[2];
                    if (i5 >= 0) {
                        do {
                            i = i5 & (99404073 ^ i5);
                            i5 = 33555988;
                        } while (i != 33555988);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    sb.append((char) (charArray[i3] ^ 19934));
                    int i6 = aY[3];
                    if (i6 >= 0 && (i6 & (27584508 ^ i6)) != 1181697) {
                    }
                    break;
                default:
                    sb.append((char) (charArray[i3] ^ 65535));
                    int i7 = aY[0];
                    if (i7 >= 0 && i7 % (6311545 ^ i7) != 2082201) {
                    }
                    break;
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0079 A[LOOP:2: B:14:0x0079->B:15:0x0080, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0083 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0039 A[LOOP:1: B:9:0x0039->B:10:0x0043, LOOP_START, PHI: r6 
      PHI: (r6v6 int) = (r6v3 int), (r6v7 int) binds: [B:8:0x0037, B:10:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r9 = this;
            r3 = r9
            c.a.a.v r0 = r3.f58a
            c.a.a.g r0 = c.a.a.v.a(r0)
            android.widget.TextView r0 = c.a.a.g.c(r0)
            r1 = 0
            r0.setVisibility(r1)
            int[] r5 = c.a.a.x.aZ
            r6 = 0
            r6 = r5[r6]
            if (r6 < 0) goto L23
        L19:
            r5 = 85703376(0x51bbad0, float:7.322377E-36)
            r5 = r5 ^ r6
            int r5 = r6 % r5
            if (r5 > 0) goto L23
            goto L19
        L23:
            c.a.a.v r0 = r3.f58a
            c.a.a.g r0 = c.a.a.v.a(r0)
            android.widget.ProgressBar r0 = r0.d
            r1 = 8
            r0.setVisibility(r1)
            int[] r5 = c.a.a.x.aZ
            r6 = 1
            r6 = r5[r6]
            if (r6 < 0) goto L46
        L39:
            r5 = 40259610(0x266501a, float:1.6920719E-37)
            r5 = r5 ^ r6
            int r5 = r6 % r5
            r6 = 81871748(0x4e14384, float:5.295925E-36)
            if (r5 == r6) goto L46
            goto L39
        L46:
            android.widget.TextView r0 = c.a.a.g.f34c
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "Ⓣ漝䶺ﾞⓈ漈䷾ﾉⓙ漟䶭ﾖⓓ漃䷾ﾖⓒ漋䶱\uffdfⓚ漌䶷ﾓⓙ漉䷤\uffdf"
            java.lang.String r2 = A(r2)
            java.lang.String r2 = r2.intern()
            java.lang.StringBuffer r1 = r1.append(r2)
            java.lang.Exception r2 = r3.f59b
            java.lang.String r2 = r2.getMessage()
            java.lang.String r2 = r2.toString()
            java.lang.StringBuffer r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            int[] r5 = c.a.a.x.aZ
            r6 = 2
            r6 = r5[r6]
            if (r6 < 0) goto L83
        L79:
            r5 = 2926151(0x2ca647, float:4.100411E-39)
            r5 = r5 ^ r6
            int r5 = r6 % r5
            if (r5 > 0) goto L83
            goto L79
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.x.run():void");
    }
}
