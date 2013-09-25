package purdue.shibboleth_con;

import sessionj.runtime.*;
import sessionj.runtime.net.*;

public class Client
{
    final private SJProtocol
      pDisoveryService =
      new SJProtocol(
      ("H4sIAAAAAAAAAO1da2wcVxW+XsdxYgfHcV4NTkoIeavYidJUaR2axK/G6cax" +
       "uk4oKW0y3r1ZTzI7\nM5m566yhQAmPplQNVNBErUCVoFUQDY+EIvoPVYgWAi" +
       "qFQlWQ+AHtDyqBEEJQJFLEOfO4d2Y9u/ay\nsbOe3Eg5PjNn7rnnPr/vzM7O" +
       "XvwrabAtstamtq0a+vEONm5SuwMPXS21L0XZMKhH0i+/vvOyzla+\nmSB1Sd" +
       "KYo7kRatmMLEseV8aUzjxTtc4eQ9NomoGnroJFNpb16phcz8T9V+d4bkiPql" +
       "qGkY1Jv3in\nU6iTF+8MFceaPlBUE0pj5DiEgnW5lTzemLrw4exXnkkQAiWW" +
       "moY2ntUM5pVwr9mz7ocHk3/+0fvc\na9ojrjngeD2SvnrbylW/3vPW/HoMeZ" +
       "5p2Cq2mpGbkn4ht0eGPEtXwTQLJnT1euytDrR1iN6y1x7U\nc0ZGPaYqIxpN" +
       "qja7unDd1h/85Wyr0yVzNDjDSGugp/EabPktk7sT51d0k4d+/sA7NztO69In" +
       "ySdJ\nnRPUEuElqeonaAbdL9iUun/f0TNr6qEzzFNzcIDg0g1lBrWnm2bVCW" +
       "OKXbm+TKlAoTu08y8/O/T3\nM1gIo0uYBahyU5nCB/LsFMwXGlXpujLlkoZh" +
       "umVO7Pv64Rf3/Tvp9vSIkRnHmuv9+rF7yjlKUT0T\nVfn2MmX2g65kYWByub" +
       "yuphXGV8KF7Z9549zpzn8mSP19ZB7VaI7qDBbZzfe5Y68perYzxZT0iWFL\n" +
       "SdM+94KuJGnOuT7RDSNLxSx0V4yzUJJkLlOsLIWp1BZyZ6l6tmuKHT6gj1iK" +
       "nh6NWLmed/SzolB+\npnRH+kgcJm2q3UtN6FNoljaOF2RwS1CgMCOLAwtgr2" +
       "KP7ldMETb+XeqEX27fuYemqToWMV2w+DLP\nTRsOu+8P/64O+Me/7XABgZoW" +
       "iXXjxdPQ+PsXf7zs6K/qSaKfNGmGkulX0sywBsh8NmpRe9TQMgVz\n126n4g" +
       "Wn5oFshf8JcLaUh+04hDmqjFAt0DsDZN4o1NJjZGiS1GvKSHgc3a0JNprn22" +
       "45z8jyPXk2\nCr3oza++QpqaqLgt27Rirw3bVfOgwQ0TWlq+Jwf0yIVXPA9Q" +
       "Lvb70+031DZM6IJ6N65F9rZ/Aahg\n8Ialfiwcux+ambf8JdGBbe+YuCQS/Z" +
       "t37nx3ze04tia4T0Fz2ssUUOb/5Kn1t/3hcwkyZwAGTtXp\nYB4RLklaMjSt" +
       "KbhGejTFdkJYAXv+MWj8oJKj3nFTjkLEGX4GK527GjZtUecwTAAFkK3ZVTrQ" +
       "wsh7\noKtENI77OyDedvZ/biGMvL+c2at17k5VV9mdvLqFbIq7HCOLgoeOO3" +
       "TSzV3diUovij5G5tknYBdj\n3tChuUmYUdzFDbeishvFHhbaz/gVh4NXzNdh" +
       "HfRohi7sr7Cpcw5GlhSd8XpmPrNokd83UBlEcYCR\nOWnDHOemjSxAPhTbpQ" +
       "oYmU88BkH3ek0celXNYcHW3R4cgmJX7obpO1scPuG5W5ZRbSU3ombzCqOi\n" +
       "Ol7BVUZWFe8xMENMmMjWQTi0nT4JneHDe5h7WVuuxQirgRaLwwhHV1H5KIr7" +
       "Q4a6ukoNZCsLYFZ0\n1/UAhPiRLZ94soL4yHZU7kXxkelqUemmrkXlCIqjM1" +
       "75TERFtrEAWyweSy8Z8QdySdGZSkbx3uBm\nMaYCTQf/Q5bBjLSh9cKWj267" +
       "85CLUAsIWEmbt/haRvCwX6VaBi/g1XSh8nEUD8LeolFljPYomrCf\nheXE8w" +
       "w3jD7LMqy9ip4BFMoewlMGRLAi6jRv8Kd4x7ai8mkUpxlpcCrklV2CHaCosh" +
       "7IWmiB8WoW\nh0/wCj7LK0gw8t4iJ9j73ENr4MjrnMXOZX2ZLIzTgTFqWWpg" +
       "W/odKo+g+AL0EL+S278N5Xl9OCH8\n0W8O7X5NTskeTB550bdR+SKKL/muMb" +
       "Ph9l2QsIVcOwjfDTkA+m8NHPlgLSqxqMC0/4gmoHg0qm0o\nHhONEpGheJwb" +
       "no4MCaeUCMk94kNzfjrieDts+DI3jMNUDAWYMvJWmvYDZri7fuDwmoR4KTiI" +
       "Dc4A\ncNuO4IQ+ZuHU1TMd3uQbgq6CLgsceaNYb+X52CWGWSDR5y5S6VGayW" +
       "u49Fu47hVvhOLoja+If6Dy\nHRTfda13GQpf4XUvBK3NCmM0Z7LQFV8VV6B4" +
       "XhpmxKCVMmwKjthCGM9hA1kR8Fg1QGSfC+6DfOL4\n9An2Cl/1p03aPeYOnH" +
       "n+UxQ/Y2SBZ8WFw2cWOQUpHq8jp6h6x34QsJfhH89vgw35llgSDk99BcUv\n" +
       "UbzKDcshJA54WD7imhZUXnMMQE+xQkibVhbdBxvSIFHZayD4HUlfePPKg313" +
       "P3LGvX2ii/SHedmx\nk/p0GwYgEQSeSA1Nln+aeVR2ODmbF9fc1ajsRPEhFC" +
       "JvaUfFTQlQiCxkYflcIHQfwCESoTOl0po/\novgTCpG3NJUy3BqObV9UHoMi" +
       "KRIYVNxEA8VQVAaC4h6Rf6AyjOIgikMim0ClEpI6E8ySbEXFmSHH\nphiVJN" +
       "vTSrZROYWiMMXxcIbC5bMoPhFFdFFwQkrOouIS0pAhyFRRcIbpIv7nUTwcMt" +
       "QlUJlmfrML\nlSdQnEMxLeTqaVQcXPratNVRmsCh8g0Uz1Rb+aVwHd8UvAyV" +
       "b6F4DsVFwbZQEZj7vSgOheJyFH1C\nUSPc4cY1TIU1oXhJECVUXJ6D4koUAU" +
       "LxC0F7UIniMKXJDSqvRRhawobfOobXQ/dl3Q9AAtzknRde\nugJX9BVM1aKZ" +
       "CXefJxKV4WqICiqCPtQI4ZBMRDIRyUQkE5nWBkomIg03LhMBUbeNkfqBzNC1" +
       "IxLi\ng9XID2RRFBGJST6KRTEFIvFBVPyPSN1HuCSXkFziukQluQSRXEJyCW" +
       "mowBAfLlFwbmQ4gtOK/TGg\nFdjEJyfnFNeTbNQmHNZmVBKkiQRpCdLSUIEh" +
       "HiAdBGaOdLPtg4PKgVnib01FJfGXSPyV+CsNFRji\ngb9ekhy67141DscgQa" +
       "4cuVeV/9KY+I4t/zJQ6JtWzpdtubM2VsEXfRlZWnzKf2QzIXa1Rjx8EsVT\n" +
       "YcMDeIgbfeJcuDuvYa9dy34OhRtoR1upBs5Ey0uG+wSb2gsFGGkNHPFHbkVM" +
       "uBElcAtJXJxi1SW5\npLOYBdsRht0s8EXlyK8BWYpua4rz1ZZVpUzejF7OvD" +
       "M0fCGvbQs25jKK7+MpyZQkU0IhmdJkhvhQ\nD8457q6Wc8ye3D8ukCfBfiLY" +
       "nwxh9AyD98kgnCb4riBxtoLKJc5KnI0zznJEi39uP8tARcKphFMJ\npxJOSW" +
       "1hoITTcnDaUy2cxiBtlfgk8Unik8SnWW+IBz4Fn6jimBL/bE+ikEQhiUIShW" +
       "a9ITYoVOrd\n1gnn/CZzx7P4Hspe1U4bY9Ryn32JeLe4f168YKS/WlSbPS8Y" +
       "uYYwMQNPFssncomEIglFNQossTfE\nBDl7U5Mg58P9N/2GkSbdYPjiXdV7pX" +
       "W78yMVm8s/NRr9cyXuFruyzO9ReDWveavvKCPLBo2BzFCK\n4g/pBN4I5v2W" +
       "xunNW7Yw0hy4wkd0geCD1SL49cpLaxN2a/KVG9c1KslEiGQikonUKFDH3hAb" +
       "JlKY\nhBC827Xkv4wsgSTe1JTxISVLp/7TWoIOVP1GjppL6GfiZV4S9SXqS9" +
       "SXqE9qC/tuXEN8UN+RLn6/\nesXYwEij6d5pMF0TR+6+apE7Bh8wyzvuEvEk" +
       "4knEuwENsUE8Dmi91QLa7HmgV+KWxC2JWxK3bkBD\nTHDL/4mmQwcf+hsjzb" +
       "rBH6YyC+EHgXdXC2uzJ0+Tj/XKx3olQkqErDFDbCDH2Sla/gdnVO3KLI0A\n" +
       "AA=="));
    
    public void
      run(
      int singleSession)
          throws Exception {
        final SJService c =
          SJService.
            create(
            pDisoveryService,
            "localhost",
            1000);
        c.
          participantName(
          "Client");
        c.
          addParticipant(
          "IdP",
          "mc05.cs.purdue.edu",
          7100);
        c.
          addParticipant(
          "SP",
          "sslab05.cs.purdue.edu",
          7101);
        long startTime =
          System.
            nanoTime();
        SJSocketGroup s =
          null;
        try {
            s =
              c.
                request();
            boolean doAgain =
              true;
            boolean ex =
              false;
            Boolean doAgain2 =
              new Boolean(
              true);
            String req =
              "hi";
            String res =
              "";
            String ticket =
              "";
            int count =
              1000000;
            int i =
              count;
            String str =
              this.
                repeat(
                "a",
                1000);
            {
                SJRuntime.
                  negotiateOutsync(
                  false,
                  s);
                while (SJRuntime.
                         outsync(
                         i-- >
                           0,
                         s)) {
                    SJRuntime.
                      send(
                      str,
                      "SP",
                      s);
                    {
                        String _sjbranch_$2 =
                          SJRuntime.
                            inlabel(
                            "SP",
                            s);
                        if (_sjbranch_$2.
                              equals(
                              "Discovery")) {
                            {
                                SJRuntime.
                                  send(
                                  str,
                                  "DS",
                                  s);
                                res =
                                  (String)
                                    SJRuntime.
                                      receive(
                                      "SP",
                                      s);
                                {
                                    String _sjbranch_$1 =
                                      SJRuntime.
                                        inlabel(
                                        "DS",
                                        s);
                                    if (_sjbranch_$1.
                                          equals(
                                          "notPassive")) {
                                        {
                                            {
                                                String _sjbranch_$0 =
                                                  SJRuntime.
                                                    inlabel(
                                                    "DS",
                                                    s);
                                                if (_sjbranch_$0.
                                                      equals(
                                                      "DisplayPageException")) {
                                                    {
                                                        
                                                    }
                                                } else
                                                          if (_sjbranch_$0.
                                                                equals(
                                                                "NoException")) {
                                                              {
                                                                  res =
                                                                    (String)
                                                                      SJRuntime.
                                                                        receive(
                                                                        "DS",
                                                                        s);
                                                              }
                                                          } else {
                                                              throw new SJIOException(
                                                                "Unexpected inbranch label: " +
                                                                _sjbranch_$0);
                                                          }
                                            }
                                            if (!ex) {
                                                {
                                                    SJRuntime.
                                                      outlabel(
                                                      "IdPSelected",
                                                      s);
                                                    SJRuntime.
                                                      send(
                                                      str,
                                                      "DS",
                                                      s);
                                                }
                                            } else {
                                                {
                                                    SJRuntime.
                                                      outlabel(
                                                      "NoIdPSelectedException",
                                                      s);
                                                }
                                            }
                                        }
                                    } else
                                              if (_sjbranch_$1.
                                                    equals(
                                                    "passive")) {
                                                  {
                                                      
                                                  }
                                              } else {
                                                  throw new SJIOException(
                                                    "Unexpected inbranch label: " +
                                                    _sjbranch_$1);
                                              }
                                }
                                res =
                                  (String)
                                    SJRuntime.
                                      receive(
                                      "DS",
                                      s);
                            }
                        } else
                                  if (_sjbranch_$2.
                                        equals(
                                        "noDiscovery")) {
                                      {
                                          
                                      }
                                  } else {
                                      throw new SJIOException(
                                        "Unexpected inbranch label: " +
                                        _sjbranch_$2);
                                  }
                    }
                    SJRuntime.
                      send(
                      str,
                      "SP",
                      s);
                    res =
                      (String)
                        SJRuntime.
                          receive(
                          "SP",
                          s);
                    {
                        SJRuntime.
                          negotiateOutsync(
                          false,
                          s);
                        while (SJRuntime.
                                 outsync(
                                 doAgain,
                                 s)) {
                            doAgain =
                              false;
                            SJRuntime.
                              send(
                              req,
                              "IdP",
                              s);
                            SJRuntime.
                              send(
                              req,
                              "IdP",
                              s);
                            res =
                              (String)
                                SJRuntime.
                                  receive(
                                  "IdP",
                                  s);
                            {
                                String _sjbranch_$4 =
                                  SJRuntime.
                                    inlabel(
                                    "IdP",
                                    s);
                                if (_sjbranch_$4.
                                      equals(
                                      "AuthenticationException")) {
                                    {
                                        doAgain =
                                          true;
                                    }
                                } else
                                          if (_sjbranch_$4.
                                                equals(
                                                "NoException")) {
                                              {
                                                  str =
                                                    (String)
                                                      SJRuntime.
                                                        receive(
                                                        "IdP",
                                                        s);
                                                  SJRuntime.
                                                    send(
                                                    str,
                                                    "SP",
                                                    s);
                                                  {
                                                      SJRuntime.
                                                        negotiateNormalInwhile(
                                                        "SP",
                                                        s);
                                                      while (SJRuntime.
                                                               insync(
                                                               "SP",
                                                               s)) {
                                                          {
                                                              String _sjbranch_$3 =
                                                                SJRuntime.
                                                                  inlabel(
                                                                  "SP",
                                                                  s);
                                                              if (_sjbranch_$3.
                                                                    equals(
                                                                    "AuthorizationException")) {
                                                                  {
                                                                      doAgain =
                                                                        true;
                                                                      SJRuntime.
                                                                        pass(
                                                                        new Boolean(
                                                                          doAgain),
                                                                        "SP",
                                                                        s);
                                                                  }
                                                              } else
                                                                        if (_sjbranch_$3.
                                                                              equals(
                                                                              "ExpiredException")) {
                                                                            {
                                                                                SJRuntime.
                                                                                  send(
                                                                                  req,
                                                                                  "IdP",
                                                                                  s);
                                                                                ticket =
                                                                                  (String)
                                                                                    SJRuntime.
                                                                                      receive(
                                                                                      "IdP",
                                                                                      s);
                                                                            }
                                                                        } else
                                                                                  if (_sjbranch_$3.
                                                                                        equals(
                                                                                        "NoException")) {
                                                                                      {
                                                                                          str =
                                                                                            (String)
                                                                                              SJRuntime.
                                                                                                receive(
                                                                                                "SP",
                                                                                                s);
                                                                                      }
                                                                                  } else {
                                                                                      throw new SJIOException(
                                                                                        "Unexpected inbranch label: " +
                                                                                        _sjbranch_$3);
                                                                                  }
                                                          }
                                                      }
                                                  }
                                              }
                                          } else {
                                              throw new SJIOException(
                                                "Unexpected inbranch label: " +
                                                _sjbranch_$4);
                                          }
                            }
                        }
                    }
                }
            }
            long duration =
              System.
                nanoTime() -
              startTime;
            System.
              out.
              println(
              "Each request has an average latency of: " +
              duration /
                (count *
                   1000.0) +
              " microseconds");
        }
        finally {
            SJRuntime.
              close(
              s);
        }
    }
    
    boolean
      isAuthenticationExceptionResponse(
      String str) {
        return str.
                 equals(
                 "AuthenticationException");
    }
    
    boolean
      isExpiredExceptionResponse(
      String str) {
        return str.
                 equals(
                 "ExpiredException");
    }
    
    public static void
      main(
      String[] args)
          throws Exception {
        Client a =
          new Client(
          );
        a.
          run(
          1);
    }
    
    String
      repeat(
      String str,
      int n) {
        String str2 =
          new String(
          );
        for (int i =
               0;
             i <
               n;
             ++i) {
            str2 +=
              str;
        }
        return str2;
    }
    
    public Client() {
        super();
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.3.0";
    final public static long
      jlc$SourceLastModified$jl =
      1379181318000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAAO1dC3AcxZnuXUmrZ2xJlo3fTwE2MRIk4ILIibFlCcusZVmS" +
       "HSMqkWdnW9qxZmfG\nMz3SypejHKjEDqkjx4FxIAmuukpC3V1SFZOQo/LO8U" +
       "rIg8DdOdzVkaoruAtUwt1RVxeoO0Pu/7vn\nrdVaQn7I8qhqf/X03/33393/" +
       "4+vd2Z2vvUEqLJO0WNSyFF072MLGDWpxqmcOUplZLX07eyTTotl2\nVbKsfm" +
       "AMygfeVfadarhrR5IkBkijpm9VFcnqz5m6PZzrzylWwSSrDV0dH1Z15kicIO" +
       "ND686M/fzo\nzmVlZP4Ama9ofUxiityua4wW2ACpy9N8hprW1myWZgdIg0Zp" +
       "to+aiqQqh6GhrsHAljKsScw2qdVL\nLV0dxYaNlm1Qk4/pVqZJnaxrFjNtme" +
       "mmxUh9+qA0KrXaTFFb04rF2tIkNaRQNWsdIneSZJpUDKnS\nMDRclHZn0col" +
       "tnZiPTSvUUBNc0iSqdulfETRsoysivbwZtx8GzSArpV5ynK6N1S5JkEFaRQq" +
       "qZI2\n3NrHTEUbhqYVug2jMLJ0UqHQqMqQ5BFpmA4ysjjarkewoFU1Xxbsws" +
       "jCaDMuCfZsaWTPAru1O1X3\nzj09b62GHQeds1RWUf8UdFoZ6dRLh6hJNZmK" +
       "jm/bLQ903W4vTxICjRdGGos2W6/8273p1364SrRZ\nVqTNbm6Lg/KZTctXvL" +
       "j11eoyVKPK0C0FTSE0c76rPQ6nrWCAdS/yJCKzxWX+qPeZ24/8Nf1dklR1\n" +
       "kZSsq3Ze6yLVVMu2O+VKKKcVjYra3UNDFmVdpFzlVSmdX8NyDCkqxeWogLIh" +
       "sRwvFwxCSCW8EvD6\nOhF/1UgYqW5XFaqxFusgI22MWsxqtUy51bDNrE1brZ" +
       "ySyegqmEkr2O0oNARlJXXQ8VHcfqd3AUea\nN5ZIwCSXRx1OBevcoatZag7K" +
       "j77y3Cc6bvvMMbF9aHKOjgz68VFb/FEHYdQWMQZJJLjwBWidYvW2\nmqY0jl" +
       "5T+OSLKx56VvoS7AWsiaUcpnzKibFypNDpAyWDSrvvkl1QksBiBuWmI68tff" +
       "jv/+rpJCkr\nGljSXmWnbuYlFW3D9aRGZ7goB0yqOWrYxcb+j3t2ffP0z15e" +
       "75s4I80TPG9iT/SctdHFN3WZZiEy\n+eJP/O+O/7q/4ubHk6Qc3BGWmElgRu" +
       "DdK6NjhDyozY1GOJeyNKkdmjDxGgYLNBaYMNI6JPXCQGAv\nmiIK8kD29t2p" +
       "6379vdqn+YzdmDc/EBz7KBMe1ODvf79JKdS//Pme+4+/cfSOMvBZwxB7zkjK" +
       "sDOq\nIhegyxVhp0P1smg2v3+srf7ea61v8y2uVvJ5m0kZlUKQllRVH6PZQc" +
       "ajVEMgIvJABCtRl4GABrFx\nUAVBYq5GYhTMs0jIaFnc9MCDG774awwqBl+Y" +
       "Reh8XFNS4BXNCaTrJzDxegVacJM/bQgDI2ICdRv6\nPrbzwLG1fOZBcRudi4" +
       "In0PeFG0r6QicmH7AZpkMU8k3mwGdf2rNr/0dbRVy8vqSIbvDpLJfj9z/e\n" +
       "pW35wcLTWhKtJGUd9Pw+TZIWY2R92hXpWB5eilLfzj7BcnPDxrNPwB9Y+cQf" +
       "PvnY88frYOABUqlY\nnQrEL9xtq1t4b5G8ERFx+Ad7H3n7F+w33DZ9d0H1lx" +
       "cmRrt9UsCTbzo92pD6xsl8klQOkHqe+yWN\n7ZNUGy13ALK31e5Upsn7Qvxw" +
       "JhZpp80LB8ujrhoYNuqo5YHVLsfWWK4SvsnbzP+j+HsXX2g4eCHy\nQ2O7nj" +
       "cgqZirb6UwaYnRrFFIJAzsdhPvvJLTNcL+kgyGxiVmpNIwlVEJIRSpN7Yrlj" +
       "5KzXHATaOK\nA1UWMLLM20rThtySpwjxHOPj8SLB/WILmG1zZNc9A2lBA2Ei" +
       "fT97evNjGlv+Ct+qSge3IXjyAwkk\nVBVWkmdkEzyulFTP7AZlJ2smRICSc4" +
       "qaRc0+ADLWlbRH0f2+yr5HPzr8wJeTjk/XGjyYXeV7ta+X\n1bxXy+tZZUjh" +
       "0Qj8/Mz8K69//Pf31ot84Ecc8IWzC/Drl2wjR3728bdWcjEJGWW0OwFpoxce" +
       "ri6x\nIu3b6LAyYUEwIlxVoleg04fUE89+pefNY+4ybDcwPm8o0Xm3zcZgsW" +
       "mxQa8s0S+t64boM7LzLwd+\nvPPttFi8jJ4dFxvnjI/bUEpQH8CtYoPfWKLP" +
       "LigD2AXXyduaIvNDgpDx6I13v/TgXa3/AynnDlJF\nVZoHaAMWuvKOEOqG3N" +
       "JvAmjqEA3AoWvzQma/674QRplkDlMm4NPUVrNLy5gQIXJFbDokrbQZbCsq\n" +
       "A+Jro2JtpwYsGOisjos8C84iQWdGFgSccIdk5XZJRpunNv7fw9Uv5ZG9VKbK" +
       "aBFbwO69jphuw7Hp\nPU7FQEA+/t8LDUgYSTj6VFT+84+fXHTghTKS7CQ1qi" +
       "5lOyWOr0g1ABtq5QDDFowtt/CB68aqgNZj\n0ANhCz21uUAwQClD1cDqdJGq" +
       "HIzSrmcBYJSpUgZV2VQwvtW48QQjV2y1WQ7htTCWjoJMDSyImchL\ndliAgG" +
       "u7dY8xYWalV65LK+pF0X1HuttdP7FOWJImTLlM6NVgffAPEF5Red10TsNhFU" +
       "E1QPWufbeg\nfbdMtO9k5zWbN7+z9maOkEB8H0xnWYkOUvXTD1+16eVPAYLt" +
       "go2CdNxtY6xPk3mYHiU8tXKk5mS9\nKjwXdftZsEacfLv90wchqdWQqPwxAe" +
       "pTCY7RtaLQghxG3gdL5WvDxVug7zL2HuMBI2tKsZ1RU5sV\nTWEf8Yabz6YY" +
       "sgC7Bi+5OBTyJ56oj2DhT5HcyUiVNQIhiTlbh+wan43kiMe4AQs8kh5moeDk" +
       "tRgI\ntqjWwO7bVV3z+b9kU8++jDRFapyVqWZwBgjLfQkLR5EcY6Rc1o1xj7" +
       "WeBZK1ZAnEhpq5ibobys6q\n+ZfOUBw5eaJuDm5BVJQIkK6wBeEKR9yirGJJ" +
       "+YwybANG8ofzBjjDyIpoTHGx2F64tPiahGq87b3f\nk9JcasaYIwMz9i+LCD" +
       "qDheNIHgwxBECbDoNczwI5qvjStUPKcDW7YmLlNPQjN2LhPiR/cb5mNPlU\n" +
       "m7HweSQPXfDBL4RW5IMsAP2ie+nAcncjmyI109nF/cFgMapYCgucFLZDyEex" +
       "22wF32MCNDUpz3G+\neRm85Oc8bOAN04aFbyF5HGKLSqVR2i6pPv9ecCfvuC" +
       "fU6DBN3dwhaVnIQsP7sEoHDZYUq/Ym/IS3\nsPVY+A6S78LJiQ/oDXYKIkBk" +
       "MOc9aW+YBeEKb4DvewPAgWxpRAiuviehPnDlLM4C3qwjOwz7tBsO\nbaYSCE" +
       "v/hIW/Q/IkrJDX0uN/nQXeAkGDcHe/NhT9anjPdjxGeV1fx8JPkPzUFY2HH4" +
       "+/hZHFIdE8\nw28DQI/y6wNXbrL2BzGpn9P+z58CkqeKzQ3JM/6kfM2QPOcx" +
       "ThZVCU3KV0lceVvzq/Ohx+thxs89\nxjiYYkjBPt02ZdoJOUNE/cDlOVHxVH" +
       "ATK/gGeLybggY9ZKLpatkWx/h6YKlgyQJXzi6Wmba3d8l+\nFnhT3hPRJ+do" +
       "1lbR9ed5Zad7JXRHaZ5H/DcWfovkNcG9VZc8D088EeTWSozRvMFCLb7ot0Dy" +
       "Rsy4\nIAx1MsaG4I7Nh/3s1xEVAY5VAkD2b4Jx0DMcFz5BrHCLrtnI4toTcA" +
       "8UeB7EkFrncNFxPMsiY4w0\nemPkJUVr2QUEYhn+c+RWWHDe8l2iGwVWIqlC" +
       "Uu0xrgCVvISH/Yu0mYeXdZwB8BQHdN9Xa/DPMdt0\nHdIKaJHs6znbYdKwsX" +
       "CIH8CcQVKrscDrR5GM+WceLAh8j8Q/UswvDexDh3iOCkI1k5xREkuQLMUq\n" +
       "/xBSMxnjhrBudxc7lCD5lH8awYI4NSD5TLHjBJLP+ocJLPwZknuRfM4/GmBh" +
       "OojzQsBEcj0WHkFy\ncopaxcj5vCJnLHwDyakp7sd+LAhwiuTbxVArEg9dCs" +
       "MU6DLECMJOJB5cFLr8EMmPQoxEEgvnGaxs\nwQJ3xOeRnBekxI3/H5GcPm9j" +
       "TI7GsPAvSF6e6eCnwmP8qw+ysPAKkleR/JsPnbDgJ9DXiwEiJL8r\nhoWQzB" +
       "IgcPkypgKBkPzRRz2HPNCCpKwYmkFS4WOYQ5MAksmRyiEPhRyaDJ4gmeeCk/" +
       "rgG7v4Tm0A\nm7z1xDPPQYuOgqGYNDvhreSJQKV/JkDlUAg+zBLAESORGInE" +
       "SCRGIud1gjESiRmXLxJBMsJIWVe2\n55wBicCnpEU/XUUSBhJn+1wVyRSAxL" +
       "VYcD/vFHcmxVgixhIXRasYS5AYS8RYImZMgzF3sESBv5HB\niQcrds0BWIFT" +
       "fOHsmOJigo3ZmQ5np1ZxkiZxko6TdMyYBmNuJOlgYk7PMDFftA8Opp+Y4/w7" +
       "q7SK\n8y+J82+cf2PGNBhzI/86h+TQ++4zutMQC3PggDz9zL2i9DfA/G+/et" +
       "/sCX1tin8N1hPWyKbxFVxG\nFkar3Fs2k897ItFaki8geTHM+Dhe/gLJL8PL" +
       "eQ5X7Vyuc0jdwDwaJ5vghZj5pOoeZ1P7njwj9YEr\n75ZbXycMRElMJclXpz" +
       "j0pFjyw1jw0Y7PuB0LMaiJQU0Mai5PxtwBNR6a6Z0hmrmE3lWYK8k0hhET\n" +
       "YcShUPaPYUEMC6YzwRgWxIwYFgRhwZ4ZwoJL6E2OSywHxtk/zv5x9o+zP5ld" +
       "OfDyZczB7L9zhtl/\nLrwpEKfTOJ3G6TROpzEjTqczu3Gva4bZ9BI6S8dJM0" +
       "6acdKMk2bMiJPme0qak/18e5LXy8ZNX/lz\nRqq3K5bMn87Ba4v8XL5b7//s" +
       "TucMk/Al9LM7l9b33eL71EmcOePMOUsTy5xnzJHMub3vLJnzaOfi\nf2CkRt" +
       "MZ/ra04vxq+17+HJZrSt9LXfwJPOIZNvtKPHLFGXntqx0HGFnUrXdle/ooPt" +
       "kp8Dt5zuNi\n7rrmuusYqQ20cDO6n8G7Z5jBL9oxenam3Vn5QzQXVasYiZAY" +
       "icRIZJYm6jnPmDNIpHAWQPBOW9O7\njDTBId5QpfEeaZhO/elxPhzYNUM4MP" +
       "sO9BfiJ+7irB9n/Tjrx1mfzK7cd/ky5k7W51Tk7189p1+N\nz9MW7zQYguVl" +
       "7o4ZZu658Hl4/I57nPHijBdnvMuQMWcynpfQts8woV1Ct0vHeSvOW3HeivPW" +
       "ZciY\nI3nLfXDZvr1H/pORWk33bqYyCuH7lm+dYVq7hM5p8V3I8V3IcYaMM2" +
       "TMiDMkpEB+a9NOcRfxSk7X\nGGPl0IWfJ9YJRjNBup6XN3IuwZupVngPVBe3" +
       "ULWrkmXhzVPNtyla9uj+N+s+LT31Mbx/ygw8fN1m\nitrSodn5G0++RDfcUi" +
       "cnSSJNyjUpT1F+RcFgpJrpxrUqHaUqH3MRDFjBx62AYa+N3MOFVM8cpDLD\n" +
       "u7h2UZbTs12axSRNpoNyWd+WDVdvrP1tkpQPkEZN36oqktWfM3V7ONefU6w0" +
       "aXAqeymzTQ31xzGr\n0thaQkanbuYlFRlcmyRwHBWiHJjoqsiiRPVpGF22py" +
       "yn/CRJymDWWSqrjKxKu51aeafWcKe24PKk\nSY0ZVpRv4TKuwHxYIvwIeh28" +
       "NhPxx/8jswFJI2+NBpDaJPY24e8trnNC7D6s88rITHpMJa8w72Hw\n96388r" +
       "9/85XeJrF9I7DjjKyLTiTUh5tFG1eglt+Nt6bUCLz1U+9f87U7e3+TcW7CS7" +
       "UxUqZorFBS\ndbxewMgC/1m23ofrXMg2EGLa/IP2VKe4gz7VxUj5qK5kUWRq" +
       "T8DSecWOQvGa1BZv2RPw2gSvE86y\nnyi27BPdjJScCvfT4i2I0x212MfIGs" +
       "XaarMc1ZgiSzhTb8q91DJ0zaLR6VZmdF2lksanMxiZnzvq\nhJrIjFvh9QVn" +
       "xl+YzND2n4MpgnEtVazos4fdufEpvOeJ4OtqBCTORE5Obes4DlvHSAq8FFa9" +
       "tE2a\nZGnE2LeapjQuXOmxsuY3k99d1AwxClwpI1luBEoNKdR5ZCBEnRqwfG" +
       "oOSbIXhyrzPFA4wQdpjTer\nJfBaVXpWiZGivoPHkNRoIUEMLBTJDXzmHxYJ" +
       "AuavUm2Y5bhXILELntSkaF7EI9tVXaNSRqUur4nz\nFL2lj5oKhN3DyCwU0y" +
       "91i9CPjzV5ICOl/CtoWnfhoxlRHVeVwEOwd/O8Ujibk6a6uaQ8BJG8pGg8\n" +
       "hhSPJPaESGIX86s18Pqqs3FfnZ5fJb0tSowEYlepFfgcbKJJDSox3ivhm8bG" +
       "4sImVqMdtKsKxB8D\nbH1xNLBL8og0DJa+9sUD6580Gn4qLB2zH4qrTJOqIV" +
       "tVA0kumPBShkmHFD7vSk7rDK72w4wsNGwz\na9MWK6dkMhDOWG5Q1jUG7hqq" +
       "4Cv8kOj1JdBU9MKrR7iNHysk/h/fjQS946IAAA==");
}
