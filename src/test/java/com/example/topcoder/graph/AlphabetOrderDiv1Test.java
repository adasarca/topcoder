package com.example.topcoder.graph;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/*
 * Created by AdelaSarca
 * Date: 1/29/2020
 */
public class AlphabetOrderDiv1Test {

    private AlphabetOrderDiv1 alphabetOrderDiv1;

    @BeforeMethod
    public void setup() {
        this.alphabetOrderDiv1 = new AlphabetOrderDiv1();
    }

    @Test
    public void testIsOrdered0() {
        //setup
        String[] words = new String[]{
                "single",
                "round",
                "match"
        };
        String expected = "Possible";

        //test
        String result = this.alphabetOrderDiv1.isOrdered(words);

        //verify
        assertEquals(result, expected);
    }

    @Test
    public void testIsOrdered1() {
        //setup
        String[] words = new String[]{
                "topcoder","topcoder"
        };
        String expected = "Impossible";

        //test
        String result = this.alphabetOrderDiv1.isOrdered(words);

        //verify
        assertEquals(result, expected);
    }

    @Test
    public void testIsOrdered2() {
        //setup
        String[] words = new String[]{
                "algorithm", "contest"
        };
        String expected = "Impossible";

        //test
        String result = this.alphabetOrderDiv1.isOrdered(words);

        //verify
        assertEquals(result, expected);
    }

    @Test
    public void testIsOrdered3() {
        //setup
        String[] words = new String[]{
                "pink","floyd"
        };
        String expected = "Possible";

        //test
        String result = this.alphabetOrderDiv1.isOrdered(words);

        //verify
        assertEquals(result, expected);
    }

    @Test
    public void testIsOrdered4() {
        //setup
        String[] words = new String[]{
                "gimnasia","y","esgrima","la","plata"
        };
        String expected = "Impossible";

        //test
        String result = this.alphabetOrderDiv1.isOrdered(words);

        //verify
        assertEquals(result, expected);
    }

    @Test
    public void testIsOrdered5() {
        //setup
        String[] words = new String[]{
                "pprraeeuffnom", "qqiibbvvvvlllrrraayyyyyddddeeuuuuuuuuttttjjjcssfxxnngggzzzzwwwkkkkooohhhmmm", "pqqqibbblraayyyddeettjssffxgzwwkkhmm", "ydjsnnzwko", "pppqqqqqiiibbvvvvvlrraaaddddddeeuuutjjjccsssssfffxxgzzzzwwohhm", "ppppppqqqiiiibbbbvllrraayyyyyddddeeeeuuujccccssffxxnnnggzwwwwkooohhhhm", "qqbryyxxgwm", "ppqqqqiiibbbbbvvvvllllrrrraaaaaayydeeeeeuuuuuujjjjjjjccccsssssssffffnnnnnggzzzzwwwwwkkkkkoooooohmmm", "ldusno", "pqqqqqbvvllraaayyydeeeuuuutttjcccsssffffffffxxxxxnnnggzwwwkoohhmmm", "ppqqqibbvvlllraaaaayyydddeeeeeuuuuutjjjcccssffxxxnnngggzzwwkkohhhhmmm", "piiivvllrrrdduutjcccsngzm", "lldnz", "qqbllllyyyddeeetttjcccccsfxnnzzzzzwwkkkooooooh", "ppqqqqqiiiiibvvvlraaaaydddjjjccssssfffxxxxnnnngzzzzwwkkooooohhhhmm", "pqqqqqiiiiiiiiibbvvvvllrrraaaayyddddddeeeeuuuuuttttttjjjcccssssfxxxxnnnnnggggzzwwkkoohhhm", "pqqivrraayyyeuujcsffffnnngzkko", "pblrrfxgzzwhm", "prdussfgg", "qqiibbvrrraayduuttjfxxnnnggzzwkkoohhmmm", "pppppqqiiiibbbbvvvvvvllllrrrraaaaaayyyeeeuuuuuuuttjjjjjjjjccccsssfffffxxxnnngggggwwkkkoohhhhhhmm", "pppppqqiiiibbbbbbvllraaaayydddeeeeuuuuttttjjjccssfffxxxnnnnnnngggzwwwwkkkkooohhhhmmmm", "qibvlraaayyyeeuuuttcccssxxgzwwwkhmmm", "pppqqiiibbbbbvvllrrrraayyddeuuuttjjjjccsffzzwkkkohmm", "ppiiiibbvvllrrrraayyydddddddeeeeeuuuuutjjjjjcssssffxxnggggzwwwwkkkkkkooohhhhhmmmm", "vlaaddutnggzkh", "pqbvvlletjjfzwwkkkommmm", "pqqqiibbllllrrrraayddddeeeeeuuutttttjjjccsssssfffxxxxnngggzzzzzzzzzwwkkooooohhmmmm", "qiibvlllrrraadeuutsxxnnzzzhmm", "pppqqqqqqqiiiiiibbbvvvvvvllllraaayydeeuuuttjjjccssssfffxxxxxxxxxnnnnggwwwwkkooooohhmmm", "qqibbbvvvvvlllllrrrraaayyyyddeeeeeuutttjjjjjjcccssssssffxxnnnnnnnnggggzzzzzzzzwwwkoooohhhhhm", "qqqiiiivvvlrraaaaeeeeettttttccsfxxxxnngzzzzzzwwwkkommm", "pqlaayeeujfxzzk", "qivvvayyjjnzkmm", "ppppqqqqqiiiiibbvvvvlrraaayyyyyyuuutttjjjjjjccccsssssssfffffxxnnzzzwwooohhhmmm", "qqvlrraddutjjjcnnnnngzzwkhhmmm", "pqqbvdjsffghh", "an", "ppqqqibbbvvvvllraaayeuutttttjjjcccssssffffxxxxxxnzzwkooohhhmmm", "pbbvddtczwom", "qvraayduttsfxngzoh", "pppqqqqqiiibvvvvvlllrrrraaaayyyyyyyyddddddeeuuuuuttjjjccccccsssssfffxxxnnngggzwwwwkkkkkooohmmmmm", "ppqbvddngwoh", "ppibbvllllrayyydeeeuutttjjsssfxgggzzzwkoohmm", "pppqqqiiibvvlrrayyyyddeeuutttjjjjffffxxxnnggwwkoooohmmm", "qqiiibllauttjsfngkkmmm", "ppqqbvvvvllllrrrraaaaayydeeeettttjjjccssfffxxxxngggzwwwwwkhmmm", "qibvvvlraydeujxzw", "pqblryyyeeeuutjcssfxgzzzwwwkhhm", "qqiibbvvvvllrrraaaddddeeeeuutjjccsssfffffxxnnnngggzzzzwwkkkommm", "ppppppqqibbblllllrrrrayyydeeeuuutjccssfffxggzzwwkohhhmmm", "pppqqiiibbblllaayyyyyddeuuuuutttjjjjjcssssffffxxxnnnnnggzwwwkkkkkooooohhhh", "ppiibllrryyddeeuttjjccsffnnggwkkkohmm", "pppqqqiiiibbbvvvvllaayyddddeeeuuttttjjccsssffffxxxnngggzzwwwwkkkkohhhhhmm", "iydfk", "bbryejcssfngwkhm", "qbuujcfgkhm", "piiaaayyeuutsom", "pppqqqqiiibbbbvvvvvlllllrrayyddddeeeeeujjjjjccsffffffxnnnnggggggzzzzzzzzwwkkkoooohm", "pppqqqiiiivvvllrrrrrraayyydddeeeeeuuutcssfffffxxnnnggggzzzwwwwwwkkoooohhmmm", "qqibvrayttjcxnkkhm", "qqibbbvvyyddddeuucccssxxngzwwooooohmm", "pibraaaeutjsxxnnzwohm", "ppqqqiiiiibvvlrraaaayyyddeeeuuuuttjjjcccsssxxxngggggzzwwwwwkoommmm", "pbbbbvvvvvllrrraayyettttjccccsssxxxnnggggzzzwwkkkooohhmmmm", "k", "ppiiiibbvvvllllrrraaaaaayyyydddddeeeeeeeuuuujjccccsssssffxxxxnnggzzwwkkkkooohmmm", "pryuujcssfffngwommmm", "qiibblrrrrrauttttcssxxxnngzzwwwwkkmm", "ppqiblettfffgzwkoohhm", "ppppqqbblydeuttsfxxzwwkooomm", "ivlrecsnggzhm", "piiiivryyddutjffxxgwwwhmm", "ppqqqiiibbvvvlrrrrraaaayyyyyeeeeuuuuuttttttjjjjjcsffffxxxxnnngggzzzzwwwwkooohhhmmmm", "ppqiivvraayddutsfxxnnggk", "pppiilaaaujjcfnnhhmmmm", "ycwk", "ppqiibvvvlllrraaaaayyyeeuuuuttttjjccssffxngzwwkkkoooooohhmm", "ppqibvvvvraaydddjjfffxxxxngwwwhh", "pbbvryddutjjfnwwhh", "ppibvvllrrayydejfffxxggzzzwkohm", "qiivveeuxnngzzwohm"
        };
        String expected = "Possible";

        //test
        String result = this.alphabetOrderDiv1.isOrdered(words);

        //verify
        assertEquals(result, expected);
    }

    @Test
    public void testIsOrdered6() {
        //setup
        String[] words = new String[]{
                "jjuuvvviiihssfffppnnetttxoooookmmmlll", "jjjjqquuuvzzihhhgggsfffaaddppppnnnwwccccceeeeeexoooyyyyykmmmll", "jqqquuuvvvzzzihhhrrsssffffaaaaabbbbdddddpppnwcccceeetttxooooyyyyykkmmmll", "jjjjjjqqqquuuuuuvvvvvzzzhhhhhrrrrgggggssfffaabbbddpppnnnnwwwwwwwcccceettttxxxxoooyyykkkkkkmmllllllll", "jjjjjjjqqquuuvvvzzzziiiiiihhhhhhrrrrrgggggfffffaaabbbbddddppppnnnwwwwcccccceeeeeexooyyyyykkkkmml", "juihhhfaaabdnwccetol", "jjjjjqqquuuuvvzzzziiihhhrrgggggsssssssfffaaaabbbbddppnnnnnnwwwwccceetxxxxxxxyyykkkmllll", "jjjzzzziihrgfaaadnnnntoyyykl", "quvihgfwcetook", "jjjjqqqqvvvvvvvvzzzzziiihhhhrrrgggsssssssfaabbddppppnwwwwwceeeeettxxxxxooyyykkkmll", "jjjqqquvzzziihhrrrrggsssssfaaabbbpccccccetxxoooyykkmll", "rgffnwwwxoll", "jqquuvvvzzihhrrggsaabbbddpwwetxxookmm", "qqquvvvvvvzigggggssffaabbbppnncetttxxxxxooyykll", "jjqqquuzihfffbdppnnnnwceettttxoooyyykkkkmmmmll", "jjquzzzziihhhrggsffabbbbbdpppnnnnwwcccceettxxooyykklll", "jjjjqquuuvvvvzzzzzhhhhrrrrrrgsssfbbdddpppnnnnwwccceeeeettttoooooykkmmllll", "jqqvvihhffabbdpwexxoooy", "qqvihrgabpnwwcetkkk", "qvzhhgggfbdppnnwwwccccceeettxoooyyykmmmml", "jjjjjjquuuuuvvvvzzziiiiihhhhrrrgggggssssfffaaaaabbbddppppnnnnwwwwwwccceetttxxooyyyyykmmmmmll", "jjjqqquvzzzzzzihhhrrrgggssfffaabbbbddpppnnnwwccccceeettxxoooyyyykmmmmmmlll", "jjqquuuvvvzzzzzziiiiihhhhhhhhrrrrgggssfaaabbbdpppppnnnnnnnwwwwwwccceeeeeeeeeetttttxxxoyykkkmlllll", "jjquuvzihrsffaabbbdnwwcceettxxoymmmm", "jjqquvvzzihhrrrggssfabbbbbddddpnnnnwwwccetttttxxxxxookkkmlllll", "jjqquuuvvziiiihhhrgsfaaabbdddpppppnnnwwwwccceetxooyykkkmmmmmmmllll", "uuvzzzihrrrgggssffaaaabpnwwcceexoooyyyykm", "jjjquvzzzziihhhhhrrggggsssfffaabdddppnnnwwwwwceeeetttttxxxxxooyyykkkkmmmmll", "zzirssfbbdncctxxxkml", "qqqqquvvzzzziiiihhrrrrgggggffbdpnnnwwcctooooyyyyyykmm", "jqqquuuuuvzzzhrrrrgsffffffabdpwwcccetxoyyykkkml", "jjjjqqqquuuvvzzihrrrrgggssssffaaaaabbbbdddnnnnnwwwwwwwccccceeeetxxkkkkmmmmmmml", "wc", "jqqvvvziihhhrrssffaabbddddpppppnnnnnnnnnwwceeeetttxxxoooyyyyyyykkmlllll", "qquuvvvzhhrrggsfppnnnwccttxooykm", "uir", "jjjjquvhgfabwcexoymm", "jjqquuvvziiiihhhhhrrgggggsssfffaaaaabdddddddppnnnnwcccceetttxxooooyykkmmmmllllll", "uzigdntyyk", "iab", "jqqquuvvzzzihhrrrgssssffabddpncccetttxxooyyymll", "jjuzzihrrggfabddpwwceeommmmll", "jjjqvvvzziihhrrrrgsssffffabbbdpnwwceeeeexxooykkmmmmll", "quzziihhhrrrgssffabbpnwetyyykmmmml", "jjjqquvzzziiiihrrrrrgsssffaaabbbddddpnnnwwwwcceeetttxxxxxoooyyykkkmmmmlllll", "qqqqquvzihhrrrrgfaaabdddppnnnwwwweeeeetxxooyykkkll", "uuuvzihssfaddddpnceetxxxooooykkkkm", "jzrfaadoy", "jqqquvvrfwtkm", "ht", "jjjquuviihhrrsssabddpnnwwwceettxxooooykmmmllll"
        };
        String expected = "Possible";

        //test
        String result = this.alphabetOrderDiv1.isOrdered(words);

        //verify
        assertEquals(result, expected);
    }

    @Test
    public void testIsOrdered7() {
        //setup
        String[] words = new String[]{
                "cvoqovdwzerjjopigqietkebdntpmabnnlxppttq", "emzykrtizggkyakiqvrixorafrieiqotjyoylbwhwdtfnsevslwtpdjdpyizinedgqhopsnlkbzsfuejnzyxgimbgqqyc", "whdzsxxxykupbedmcdqfojzwnzarigormalnckuxsj", "oyftjksvcxiinvns", "bbckbrepoywtmypwljmmmsdqkppsvxsnhnujvucwfwftgzqzrzkbchdibwk", "plfcxlzmwwruwaajlpignvsrlzlordmrmratxmurfkhpxqjuxewniedologynvsiswdehujxsniscyqz", "fhyxhttrhpwimdvmscymsaicom", "tmvahh", "zsrgczxwgedmlpnufrmufybjbnufbetcdq", "vtxbieutxcivdvqipyyuwkmq", "gltjcivsjwvtvtsocghfsqcybobintseuyyxaigshwhcqrcojujtrstutorygwuefosskigrjtp", "deogftvnychwftoelmckrqmwztzgeqmajbbviynedtuqunokigyrpbwzpm", "capnqicodtzoseavnfmyhilaodvonjcbjbuqenoxvcjqwymeonsxwtztosmtjahjgckzelvqbynekokqn", "kexbwkkkbzbqhjydwaqtjdcomantlvyiyvuslfg", "cnckuhvcdeqqfhspayiwpwmmrprzxsxwtmtxwhneosppijosoluzzeqhoqoecpzkzkvyavrxag", "jkcodjlps", "shpeflivhcqpfarocwrnmlouwkxpgbdhghkhgivyyssmvxkljtervbidbgizjiyfgxal", "hulvascne", "ucwamvdpmnsjnkhgrxjpaixuyzcrhhvkztfsnwcggnznzordyglmwkhglxmzdsrnqpwruboocfzrddfkvzvoyibjlgifwpnfju", "hvtppfpkovzjzxlniqwixmj", "hamsrksyppezuernrbxcawhadfmuvzthziwhzxqxphwetingsmcrjhcggqpptcpxjxxywqxhcotphqdbbaxoccguffmyczjtiyre", "qtyaejaxxnrkwwidxtpobwtxrzjczrircgkvzlp", "gcilycvldzaqbrenmmdtppatibjwlpwgwochrsgrugeimsaddbmhooeehtjeolkayygdfwkxqcrrhqzhyrc", "mfikaqsegplqbwrsgzturelmuwtwwuqagviamdvjtxxlrcfqzzdqhnhuzdqtbndooqqiizwje", "rhvvcrxozykicycqu", "uyppoekedqnoxtckgqjwxcdxxjblmtrfetapusruvpvvyhuccjzfuwrjoonwihcdgjxkfeaxcgfvskarkdydtchgwxiprhsouw", "qduetasvzydbeurgvolruiwwityxizivotndc", "nvijvscatdhopahwlotcljtakzmifbk", "noxbwwontnjgnvfiqanjkcptaqbksfslspigmchtyycranhnsaqwrlyjfreyugzgtetdtcyapsujweukatijijgxqwllpvs", "vgeifvgfdqbkfhmifyxkhovtgvgaakyobmwnafugtpibodhzdvegjmkrtivkeovkdardeyfgxdsawpcwnlbndtebveijmkl", "eaoyqyjhbfpljzybsrdmswtzwcgwsocvpizsvssmc", "psjxshqrwhpntibqhhwecnqatnpvuevdeugurizzoqvixrufkvedpzldtpqylzyjjidcprhsjzfsspiwezkotg", "zutpvqfx", "lctxuserfdnuamcipuyzcmipchvwryddznelemagcqbactrjedybtxowlmbvgnnh", "ipxbfnbshwxfolwsubyccelxvhyvhbxujkltwbljtlonguzbwzzxvedrmszvyzuudsxacdsgaqxyakubwfebsuzdzjhfju", "fzyedtoybblrfmcwnovhjxqtouyuugxigtxthwrpvbngxf", "ydbdvzmcwzsqtbardshpgkkfjqsmuwhioxrphcvqrnypbgrvmonmh", "xcpvrolhcvammydrbcxmnkhnamisjwjwhgdtyrwvrnnxrl", "bz", "sveiyraksduq", "htbxdxynmuptmogyrgitbcmxiqoavczwqhwuebpqnnbndudtgtexvnvfhprl", "nklxykrvuxwvabrxclhiiltbsqcofipmxyfisxotfyehk", "qmsrdovmzoaccjeliiywtzasbpqv", "fiigfwmo", "qrudeadhubxjtufclmvxpftvrhyjldoikdsqjbclmdpvcgkbtbrsiwlppgnsjqzlrxinmmdxxljc", "oztns", "bdtlbmapcxlhrczhozvgbrtgqfngsfeispcgeenpcjzsszgegazomdgxbjukrdaqeyvlabxjdparhddgmyhosrselcwc", "mvlksrblgribwvmkjcdinvdbkguzwmykdhxzpnkfzvqdqnlmcvspvdjkqy", "mw", "bjphotfdlrcpkpe", "zfbhnlucjdcnpb", "rjrdkbpytqjmgofmuunbimqleghxodmvfulmamomlamzbbhtjibshjrqsltwzfv", "meoadgqtaurncnfvhgferhtmtgxwzqhdnvhexphcqxhjjsznerblstavzscxi", "lobvithdqvsufshkytejlqvliusansqrlhkpddrsmdulkarrnvalryrdqvcswbfwjmepnnlvqmzcimfw", "wlcmrznvz"
        };
        String expected = "Impossible";

        //test
        String result = this.alphabetOrderDiv1.isOrdered(words);

        //verify
        assertEquals(result, expected);
    }

    @Test
    public void testIsOrdered8() {
        //setup
        String[] words = new String[]{
                "mrinhecyyimxwiwoszlveunwhmncidekyljnoakquybjrktyxnuhvwmvogxdyeplnhypwlmlmrdubdvquvjzxfcgett", "ihtvykirukflzivkyhylepylroaurleuvinyzdrbagrvumsjuuaemrymdvbiluuig", "snfuqkvzbiutauwwitexzkbojqfvbdktmzaaykvmzvubrgsreauykazkweakydnodkzkdmntcgutblsvsdkb", "psuxgkyyidakhrfvurmvwujgpzyyfjhzzzgzghlftqombqoqaodamaixameclkzvc", "atvimrcxmxrybrbvtupoklzurcvzlynislia", "kjrqkpswddrtwssfrnrwgjwtqzvhifkzvpycadgjjlfjjgpmdbxsmshqiudknzbmbjkgoqyegddbozhndbc", "wupfekqlmxbwpibbvdqvigkydwbz", "zujnijapjzshfpoltounykinclqaqwdjqumvmpgihlmqforkpdpahjipmnwonzqqntcsgrlzfgrnwwjudprdpnrnablwnoaiug", "hwerfqztmbeldiveqysfyspyuqbeeosqpghs", "pjurkvtoqvgsiitrxljhjrvyzxafyemkdzprjgxezydwakoombbyoccbekpwl", "jeuougoyqheqzpjtmaguslipkvpisequrfowzbckwayzpfqklmpwz", "quoddqtkrmtoxnneafyzjpamcvtasnllczkryymsjohrmsgtahibqlqucitefxtgmtarsyaulolywmthy", "mkeb", "cuoqgabbrykbzexbydteohenxesuypghefqaqqooajcnnishwwcamztjfirqvidoswafijnkremaignyzpzytbmnfip", "rcaobfokvvjobqyoyounwp", "fultlsglucvrtnvkdydqzrjrnexmrrudovsbeywwagpmmm", "qaeggtqavjbdmxzymbyxsfqseuhiwmhysgcrkfyyydkjpap", "vrkbchricjcavjelyecqwst", "lkqvswrycfyuetlotuouczvvyiomyzqrmjsiolsxsrabxj", "avuoazlfycttneprznmfiyumtizkpbvpzpdedmzybfrmcqrbgvhgwskuxrzjds", "qhfmgpznleomlbifvmmoqrctwqvrpnqxhormndlxwwjdzvfczkvpobbqgdxaxyzaywxlpvzhaobnshxhbjmkgwuosmz", "ouuqnjllhylrlljrohpoqxvikbymuwbrignxuvtgtzztwymxllthbugsbyajayusfywl", "hfmexxbszqtjislqkpydcpaovaxzdrocxupoetdxalfqgtvsgcbnwjoheabgeyulnldltvubnzk", "nnxyuxwakbbjivxtoqckpuppooarauqvsxwuwzppfnsyhgsdaretklqlpegdiwjhteyikzsvnvqfscvgayf", "xvjqxqdmbfykhgvyqfntbuqmgkwznrsfovxnhdfmvuwxaevvm", "aotmmptwjkmpahhhlpiigjqqguedewmisokurjwtxlnxjmtxyjifixtlrry", "oypmidkxydovfngtqvxpzfmhppxzspokjbaykjuyqkjqxzhpembdtvvhwzuqrcfmlnstrpz", "gcpwfyihualvstqoxwcvucdtjzrighktzvhwrekkuqlsitieprenhaoujmwinhrsdhvilvkuplfuaopjuolsgpot", "nwc", "wiyuhahzo", "vkpfgjyh", "sxvdxfykywoduckdpnoqxbgmhekgilcuquhbulaswnlafkpdofilmuvlpctiqglhlcubeygzetnz", "ahuzskyjrrmghyuesnletdhxczmyakwzwuaawpmj", "poljsowmnimtuafzlzvprzclapyjlevdvcfipsm", "pxtxkhvrbjpcaxfchmdmxljjtzsyvrnsgilnxzttulnlcsoqdiyek", "epqfrretkkadawdfaazbrlpkkeuzdihcrdzltpwxmvfvpuosoasvaimnvzvo", "yfxcujxmsyqzexzcqbwiikzqpjbmrbsqqujnlwdzjmfkuvemvaoprtdbqrhbvtjk", "zvnvknmtjqbqtizzlsxrbqlqumhfjsnzsvsawstiwidt", "jcmihbzvdwd", "xjqrzqhnasgvyynxcaurzfttthypkatwvoizensmn", "jxhyjnlrdubwfaxsfcoqn", "chgbnfumkxgrodywutszlwldjoljosxszphmirnzuhyry", "bcktmawobrwmigotrwhksmzvwqbyafemjognvjtsssfmmyzcydxmzrypybzvwcosbqlhwxhxxcbrzpkgrcg", "npplwvkhjfevbjzuxcoaertehuvnsalzakcprgvoumkki", "oljzkxiiyfavgywezbpgpftkuxvdfstcliyijzuhdwnuaasozhtyspptfvxcfbol", "ydfdaqtgygobhthposzznqgsnbzuzsuhjxcwkyskwqtaykmponubjxsof", "rpxwilgokikienrbgwoomfyobwcmpqupvevtpzhtvcsqwrdfli", "ylodihyupyxeisxrkqvbcbqteogzqeoflmwgongduylonbudxqbwztgfgimcemcldxkbqkpryl", "ssehwfqnvitrqdwuooqjsosdfnnymozbrvzrksngr", "urbmbsyzwrfgpisuioyptcpqmyeedfqvcidccxpjtowycymqrywxc", "fnzzqeurfymjwquwzxosbdcbkfmpkndziclgittnidxdzpodjuhpou", "alvwxcacnwyhteryqugruvgpzzlhwrwwlniqogdyqqkxv", "zeohigvbbrgaevivtpgwgxjxwrrxyueglxuvfpugwhdjklgclujs", "afpajfutiaehvfcydwbdpguxtebsawqkbmkhthquvpbwhcnpogl"
        };
        String expected = "Impossible";

        //test
        String result = this.alphabetOrderDiv1.isOrdered(words);

        //verify
        assertEquals(result, expected);
    }
}