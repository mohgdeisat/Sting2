package purdue.general;

import sessionj.runtime.*;
import sessionj.runtime.net.*;

public class Test2 {
    final private SJProtocol pDisoveryService =
      new SJProtocol(
      ("H4sIAAAAAAAAANVXTWhcVRS+M0mavzaJNm1tk9Y2JmkqZaaiCdbEajJNG+M0" +
       "GZmkRUutL+/dTF5y\n34/vnUkTERFFjIIRxR+QghulC3VRQXTnSgoKLlxIXb" +
       "iqCwu6EBEXVvCc93Pfe9PJGEQXzuLMufec\n851zzzn35334M2twHdbrctfV" +
       "LXMxA6s2dzM09LniZJHDDLLn1SvfjnxsQve1NEvlWaPBjTnuuMB2\n5heVZS" +
       "VbBl1kc5YQXAVEGl5x2EBNVE/kIzP/l/KQG9QFXWjABvKhedYzykrzbMKcPN" +
       "1R4YmoNbeI\noZAv38lrjcVLZ0pvvJdmDC122JZYLQkLAgtfZ7Tv09n8j5/f" +
       "7ut0VdGZ9lDPqzeGuvd+M/pDcx2F\n3GRbrk6rBnZbPjTyM1IIJMMrtr1iY6" +
       "r7KVsZkmWibLm9s6Zhafq8rswJntdduNHed9cnP613eCmp\nFzgDrCOWadKh" +
       "lR/+e7hofvcYe/arx3/f54Gm1CfZMyzlBdUZoeR1c4lrBL/1UPHc5BNrPXWY" +
       "DPtC\nPRUIVQ/WKGpujJf0m2pKqeyvYRUzuk+8feX9wi9rZETRpe0VdNlXs4" +
       "9MrZrDwRo2p5BXSpgXwyib\nuqqAbMRLg89ffeu57G9pVneWNXHBDW4C9vi+" +
       "s37qhWKWskVQ1KUZR1H5uK8wnGetho9JMMB2RE3g\nN6zXp3m2BRSnxLGSty" +
       "bgHN0sDYfrtctO6C5D8szN7tIn7hwZ+bPnKK3UxiUfxRx11TBQmr94p3/o\n" +
       "+xfSrP4h1iJ0k0+VafPmWZvGVaGQ/5xQXJdC2IntPK8LPqUYPBi3GBwWLE3O" +
       "kNMt+7EfI58zCw5X\ncNO2+kyGJMC24WKjaDz4PRhvF/zD8gA7UEsceN0yop" +
       "s6HJPu2mGTHQTslvjQgyOQHgl1jJheIn3A\nmtwl7BDA7RaKWyIxkYNScA8x" +
       "+4kcgESvSI3H4hrNpqXxnLDMSP41bP44BdZZMRNkphkcXolLTIZI\nlsgRKb" +
       "gaCYDVq5a9KkVvwuYuDOyQ2Eim87AEukjMIJGhDZ0TuVsKBiB21iuufzJTts" +
       "Jzfgr5oJLR\nMFh+PcQzfj/ETqVKqCDqEK2zYkauZUTCPQixo3FZx1MfYQqO" +
       "BZZqieO4zXAPmK5QwHKA7d1IFES6\nC4IZnlSU3o4QM0pkDMsquLLMc4qI5O" +
       "uYJ3l7+dGMO47lTCimhgdA6TRNUSS7q03L5Y2HgKkOYk4S\nmQDW4DmUzi7j" +
       "giqc5fAu5Csg3WxPTkgHk9JBGtieChDKtUToiI2CLG331Ma1ElZlepk7jq5F" +
       "QX1H\nzDSRAmZIakr5R2gv/VH5w1q3JnqmxbPM0ZNEml4nZpbI6RCa7kspfw" +
       "CfAQlo73Ads7RVb0/ERuE5\nGTlxeHSc/BEtgcgj1dZGpBgtKoqMyBkpeLdq" +
       "SNRSUUj+SJbm3H8Rx/Wk4FEpWMVWTARYtMqOyk/g\nTeRv59jwXwnxcryIDV" +
       "4BpOzeeEPPO9S6ppYJmq+AqcKUxUZBFeucsqxdegZiz0cJUVQXuFYWHPu5\n" +
       "TfKBeSOaE5rcEb8SA0TKvvSkpcgdnvosLm1VALhhQ0LjYqRB5Kn/q0BsJDgU" +
       "T0E7JmjGwleBjXey\nHruUP4gfLLISpKh7hdgWsmEdVH8sAV4m5kUia8C2Bl" +
       "LqRFkqdgGfdNKHoehm5hQSPBzoL8BtcPH1\nF/XYFDGvEFkn8qoU7MKQ5EVC" +
       "9lV02oh53RPgtUYO8QnYXfG5UhD46JqwhMYdfNle+/Lp8YdfWvO/\nJ8zoKZ" +
       "d4xh23yvjBACw15j1H2/4CBeMh2B8OAAA="));
    
    public void run(int singleSession) throws Exception {
        final SJService c =
          SJService.create(pDisoveryService, "localhost", 1000);
        c.participantName("A");
        c.addParticipant("B", "localhost", 7100);
        SJSocketGroup s = null;
        try {
            s = c.request();
            Double d = new Double(5.0);
            SJRuntime.send(d, "B", s);
        }
        finally {
            SJRuntime.close(s);
        }
    }
    
    public static void main(String[] args) throws Exception {
        Test2 a = new Test2();
        a.run(1);
    }
    
    String repeat(String str, int n) {
        String str2 = new String();
        for (int i = 0; i < n; ++i) { str2 += str; }
        return str2;
    }
    
    public Test2() { super(); }
    
    final public static String jlc$CompilerVersion$jl = "2.3.0";
    final public static long jlc$SourceLastModified$jl = 1378677977000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAO0ZbZAcRbVn927vk9xHjgC5fOdIcpjsAQUUcIGQXC7kwuZy" +
       "3F0CuQiXuZm+vbnM\nzowzvZs9pBCCCoQySpEQpdD8wUqp+JEgapUWWiUIiI" +
       "oFVSH8gB/GD1KAZcoPUAP6XvdMz+zs3hIt\n9ZdXtX3d/V6/fv2++vWbJ94h" +
       "tZ5L0h71PMO2ptNsxqEeb+2JaaoxLz2yZUh1Par3marnjQJgXNv9\ngbHjWN" +
       "u+zQmijJF2y15vGqo3OuXa+ezU6JThFV2yxLHNmaxpM59iGY1rl5/d+7P7tn" +
       "QmScsYaTGs\nEaYyQ+uzLUaLbIw052hugrreel2n+hhpsyjVR6hrqKZxByDa" +
       "FmzsGVlLZXmXesPUs80CIrZ7eYe6\nfM9gMkOaNdvymJvXmO16jLRmptWC2p" +
       "NnhtmTMTzWmyGpSYOauvcxchdJZEjtpKlmAXFeJjhFD6fY\nswnnAb3RADbd" +
       "SVWjwZKaPYalM7I4vkKeuOsmQICldTnKpmy5VY2lwgRpFyyZqpXtGWGuYWUB" +
       "tdbO\nwy6MzJ+VKCDVO6q2R83ScUYujOMNCRBgNXCx4BJGzo+jcUqgs/kxnU" +
       "W0tS3V/P7+oXeXgMaBZ51q\nJvKfgkWLYouG6SR1qaVRsfC9fPrgwM78ggQh" +
       "gHx+DFngrL/4u9szb/5wscDprICzjdviuHb2qgUL\nX17/64YkslHv2J6Bpl" +
       "Bycq7VIR/SW3TAuudJighMB8AfDf9k591fpW8lSP0ASWm2mc9ZA6SBWnqf\n" +
       "36+DfsawqJjdNjnpUTZAakw+lbL5GMQxaZgUxVELfUdlU7xfdAghdfBT4Hcp" +
       "EX8N2DBSP0o9dnna\nm2ZkKYOu1+O5Wo+Td/U87clSi7qq2RPgFJHcnL2KAi" +
       "dZEPcqE0xws23q1B3Xjp766Z39Nz1wv9AR\n2pXPCCMdgnbap53mtImicKJz" +
       "0fSEaNa7rjqDLlG85+WFX3hO/SIIGg7sGXdQfh5lbw22sOjyqhGj\nL/S3Ae" +
       "ipYA7jWsfdb85/9JWvPJsgyYpRIyMnN9luTjVR8YGbtPvbxSFgL11xq6209+" +
       "/3b33yxIuv\nrwrtl5GuMrcqX4lusSwudNfWqA5hJyR/+G+b//Bw7TVPJUgN" +
       "+BpEG6aCjYDrLorvUeIevUGowbMk\nM6RpsuzgjQwEtDdyYGybsWkVhgG66I" +
       "gxyKPUe/emLn31B03P8hMHAa0lEvlGKBPu0Rbqf9SlFOZf\n//zQw4feuW9X" +
       "EhzScYTOGUk5+QnT0Iqw5IJSj0L2dDSbt4/3th5Y432Hq7jByOXyTJ0wKURg" +
       "1TTt\nvVQfZzwEtUXCHY8yIInmCYhWEPjGTSAkzuooBTDPCvEgfWHHwUe6H3" +
       "sVI4bDBTMPPYtzSop8okvB\ndlUZEMcL0YI7wmODj+8RB2juHrlty+77l/GT" +
       "R8mt9gdFSTD0hSuq+sImvFnAZpgNISY0md0Pnrx5\n66239Iigd1lVEoPgyz" +
       "qnE64/NGCte/r8E1YCrSTlTUt/z5CExxhZlQlI+paHQ9Eb2TIiQEHgX/3h\n" +
       "Bwg3Nu78yz3HXzrUDBuPkTrD22RYqona9gaF91a4FGIk7nh6+5fe+zl7g9tm" +
       "6C7I/oJieZTboUY8\n+eoThbbUt47kEqRujLTyi1212A7VzKPljsHV7PX5kx" +
       "lyXgm89JoVd0qvDAcL4q4a2TbuqDURadcg\nNvbrhW9ynJZ/iL8P8IeGgwMR" +
       "/Nv77JwDN4a75EYejRnVnaKiOLjsar54EW+XCvtLMNgaRcxIneMa\nBRXzI9" +
       "LqbDQ8u0DdGUiKCoafh8xlpFOq0s1bzMhRzN984+PxQuF+sQ7MtiumdWkgaT" +
       "QQJu7m506s\nPW6xBae4qur8pAwzozCQwG1pgiT5deuCx1WjKs1uXPOvREUE" +
       "KG3KMHXk7HKgsbyqPYrlD9WNHL0l\ne/DxhO/TTQ4PZitCrw758rq2WzlbNy" +
       "YNHo3Az8+2XHzZU28faBX3QRhxwBc+nEA4f9EGcveLt7+7\niJNRNKTR5wek" +
       "1TI8rKwikb4NNGuUCQQjwooqqyKLrjUPP/floTP3B2LY6GB8vriqEiy90oZX" +
       "Vlmz\nFfqQSILl5vKWofEEXNA4euW9Jx/Z1/NniPi7SD01aY5aDAxk0a6SjB" +
       "ZC+6gLuUq/QAB/asoJmqOB\n90AUY6qbpUxkLf5hIHEJaKWRVrqcVmLTJWvX" +
       "vr/sGn4ZwHluAAF0VlmgNjz76IqrXv8UXNYDpBGT\nucE8mnWGzMFIoGL2zS" +
       "8l38HrMb8bDB2+UWTwg2GCRUhqCfhkuCdkNVSF50CT6KQRwsh5cLiQG05+\n" +
       "FPjtZP+m7CF7rAb2d02tNSyDXS+3a2HnaB5wTUeHnBwS+agkdT12bscGXh/1" +
       "3h5QPwNnCcCNIRgb\nVQKuwM4YNrtYiSFIjLEoRoNl67TPtK0Q/gt27oEG0t" +
       "/YjC+ZBgbpTowudngCb2AzLQEnQwAjNZrt\nzEjQIXZuoRQsJDKS4pyUhB7D" +
       "jo2NM+vm2OQkYBWLxErVExcmSiuIk4PQ9zUZDv3j84tLkrqORUJO\nnJTPdU" +
       "CtIzYjz1KQ5HZGFVQw4MUVuYg2gpvh6g15A58uEC1mhfm8zpnAIU8jEEFu04" +
       "udj2NzJ+jT\npGqB9kGqKeEHQEAymxBs9Luu7W5WLR08P7sDp2zg4KJK0/Jc" +
       "nwgIKq3YuQebfXAx8w3lZscYWRjb\nzK9nyG3mlk7IDT4pN4D7fn6MCApZUm" +
       "iNjHzhzOVo/XoW1LENcgLX0EOmXsPOA9jsBwlJTAn/Ootk\n2Kj3QMlNJcbS" +
       "yFf24S0tl57Gzmex+VxAGu9WCV8HD/MS0jyqbrD1Ge4MkVEQIMNN4I0k6fw9" +
       "PAI2\nD1Y6GzafCQ8VcobNQxJwpCJLaFIhS2IkVXP4v8HH6VLAwxIwA6ZYwu" +
       "CInXc1ugmuIOHHkeF/hMVj\nUSXWcgVI2NVRg5500XQtPe0b3xCICkQWGfla" +
       "TELmGZBIjLJIQUeSGNGm4AVtouvPkX1/eR0sR2rS\nI/6InW9g800BvdFWpY" +
       "cr34tCm1TGaM5hJRiPhRjYfPv/gP8JwJwN0B3VWAvoc9TGJxHkDkYkefha\n" +
       "NA5KwwneThArgm5gNpoYSwLczp/H5gWGFWAORceRlkX2wmtM7pGDN2h6KzQQ" +
       "y/CfT7cWXoBu6BKD\n2OFZwkvY/FICLgCW5IWH6yvgzMHOKxwA1y9uGDzbIr" +
       "njRjsPbwxGlA08B95SLH8T8ifccr/OQbBd\nVVKkgAR44Wy1XF6Hvu/WM82f" +
       "Vp+5TWT+7aXVnH4rn7vyyEnafUOzVqGW2MBsZ41JC9SUpZAk3zcJ\n266p+n" +
       "LbyhPn8C2fHFnXvXJ10+8gE5+lItjmTw5TlnetyFsBsNV/uVS4OCaUOD9thc" +
       "6bk1PG8wn+\nxhdlgbKKfumi3tJiQKNbyihXYacoCYCI6uG3HH7t/tOL/0dg" +
       "GzbtoqKHzWsVa1hhySleYBlyjZzB\njIJfdX9o0eO/ffLUcIdQn/g0sbzs60" +
       "B0jfg8EbykYYel1Xbg2M98ZOkTdw2/MRE8Pd+A0A/eU7n8\nFrDu2/vc0N77" +
       "ixp10PU5kd9E7o/TjqD1NjhLwTZ0TvJP0dc1dt8qzjLzKyl2/K2E3zJf7Msq" +
       "ib1C\n6YW7GbygPP5tqvrByj+f8GK60MfxZNeZxPfndfH6cM2E6sknb8l3p/" +
       "LPSiVfizifjfJUF8FvcZVT\nVYgt4tNSRaXgm0xJFBX+9lBSs0jjOhF5QCYm" +
       "tbLiU8dbuEAJC6MJgV5B1fythRWUACZqsIadlp/2\nAFheYsXxKcEf32t2Dz" +
       "nXErDSCpFdk0+/UimJymCxqr5xeIYr5K9+KOfGWdFEA+GUz4Qmil+JlsKv\n" +
       "21dm97mZ6CwnTUiNKcmIR1QTyELQqUsdqjK+inOZjLBdRqx8Gsyiln9ZwkLc" +
       "hfH44X+m1Ja9vHvV\nj522F4QvBJ8S67DOkjfNaGE10k85Lp00uBTqRJnV4V" +
       "xfAglk6bctyAT8HnKpdAu8NfzzBeLhKM1t\nfF5R+SdQU12h/x4AAA==");
}
