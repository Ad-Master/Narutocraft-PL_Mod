package pl.grm.narutocraft.libs.registry;

import cpw.mods.fml.common.registry.GameRegistry;
import pl.grm.narutocraft.jutsu.AsaKujaku;
import pl.grm.narutocraft.jutsu.Byakugo;
import pl.grm.narutocraft.jutsu.ChakuraNoMesu;
import pl.grm.narutocraft.jutsu.Dokugiri;
import pl.grm.narutocraft.jutsu.Enmakugire;
import pl.grm.narutocraft.jutsu.FukimiHari;
import pl.grm.narutocraft.jutsu.FumaNinken;
import pl.grm.narutocraft.jutsu.Hadan;
import pl.grm.narutocraft.jutsu.HariJizo;
import pl.grm.narutocraft.jutsu.Haykkaroran;
import pl.grm.narutocraft.jutsu.Hirudora;
import pl.grm.narutocraft.jutsu.Iaido;
import pl.grm.narutocraft.jutsu.InyuShometsu;
import pl.grm.narutocraft.jutsu.Issen;
import pl.grm.narutocraft.jutsu.JikukanKekkai;
import pl.grm.narutocraft.jutsu.Jutsu;
import pl.grm.narutocraft.jutsu.KageBuyo;
import pl.grm.narutocraft.jutsu.Kai;
import pl.grm.narutocraft.jutsu.KawarimiNoJutsu;
import pl.grm.narutocraft.jutsu.KokuangyoNoJutsu;
import pl.grm.narutocraft.jutsu.KosaHo;
import pl.grm.narutocraft.jutsu.Koukongarasu;
import pl.grm.narutocraft.jutsu.KuchiyoseRashomon;
import pl.grm.narutocraft.jutsu.Meisaigakure;
import pl.grm.narutocraft.jutsu.MikazukiKiri;
import pl.grm.narutocraft.jutsu.NanKaizou;
import pl.grm.narutocraft.jutsu.NawanukeNoJutsu;
import pl.grm.narutocraft.jutsu.OmoteRenge;
import pl.grm.narutocraft.jutsu.Omotegiri;
import pl.grm.narutocraft.jutsu.RaigenRaikochu;
import pl.grm.narutocraft.jutsu.Ranshinsho;
import pl.grm.narutocraft.jutsu.Rasengan;
import pl.grm.narutocraft.jutsu.Rasengan2;
import pl.grm.narutocraft.jutsu.Rasengan3;
import pl.grm.narutocraft.jutsu.SaikanChushutsuNoJutsu;
import pl.grm.narutocraft.jutsu.SamuraiSabreTechnique;
import pl.grm.narutocraft.jutsu.Sharingan;
import pl.grm.narutocraft.jutsu.ShunshinNoJutsu;
import pl.grm.narutocraft.jutsu.UraRenge;
import pl.grm.narutocraft.jutsu.Yosakugiri;

public class RegJutsus {
	private static int id = 4600;
	public static Jutsu KawarimiNoJutsu = new KawarimiNoJutsu(id);
    public static Jutsu ShunshinNoJutsu = new ShunshinNoJutsu(id+1);
   	public static Jutsu Sharingan = new Sharingan(id+2);
   	public static Jutsu Rasengan = new Rasengan(id+3);
   	public static Jutsu Rasengan2 = new Rasengan2(id+4);
   	public static Jutsu Rasengan3 = new Rasengan3(id+5);
   	public static Jutsu AsaKujaku = new AsaKujaku(id+6);
   	public static Jutsu Byakugo = new Byakugo(id+7);
   	public static Jutsu ChakuraNoMesu = new ChakuraNoMesu(id+8);
   	public static Jutsu Dokugiri = new Dokugiri(id+9);
   	public static Jutsu Enmakugire = new Enmakugire(id+10);
   	public static Jutsu FukimiHari = new FukimiHari(id+11);
   	public static Jutsu FumaNinken = new FumaNinken(id+12);
   	public static Jutsu Hadan = new Hadan(id+13);
   	public static Jutsu HariJizo = new HariJizo(id+14);
   	public static Jutsu Haykkaroran = new Haykkaroran(id+15);
   	public static Jutsu Hirudora = new Hirudora(id+15);
   	public static Jutsu Iaido = new Iaido(id+16);
   	public static Jutsu InyuShometsu = new InyuShometsu(id+17);
   	public static Jutsu Issen = new Issen(id+18);
   	public static Jutsu JikukanKekkai = new JikukanKekkai(id+19);
   	public static Jutsu KageBuyo = new KageBuyo(id+20);
   	public static Jutsu Kai = new Kai(+21);
   	public static Jutsu KokuangyoNoJutsu = new KokuangyoNoJutsu(id+22);
   	public static Jutsu KosaHo = new KosaHo(id+23);
   	public static Jutsu Koukongarasu = new Koukongarasu(id+24);
   	public static Jutsu KuchiyoseRashomon = new KuchiyoseRashomon(id+25);
   	public static Jutsu Meisaigakure = new Meisaigakure(id+26);
   	public static Jutsu MikazukiKiri = new MikazukiKiri(id+27);
   	public static Jutsu NanKaizou = new NanKaizou(id+28);
   	public static Jutsu NawanukeNoJutsu = new NawanukeNoJutsu(id+29);
   	public static Jutsu Omotegiri = new Omotegiri(id+30);
   	public static Jutsu OmoteRenge = new OmoteRenge(id+31);
   	public static Jutsu RaigenRaikochu = new RaigenRaikochu(id+32);
   	public static Jutsu Ranshinsho = new Ranshinsho(id+33);
   	public static Jutsu SaikanChushutsuNoJutsu = new SaikanChushutsuNoJutsu(id+34);
   	public static Jutsu SamuraiSabreTechnique = new SamuraiSabreTechnique(id+35);
   	public static Jutsu UraRenge = new UraRenge(id+36);
   	public static Jutsu Yosakugiri = new Yosakugiri(id+37);

//	public static Jutsu  = new (id+);
   	
   	public static void RegPowersList() {
		GameRegistry.registerItem(KawarimiNoJutsu, "KawarimiNoJutsu");
		GameRegistry.registerItem(ShunshinNoJutsu, "ShunshinNoJutsu");
		GameRegistry.registerItem(Sharingan, "Sharingan");
		GameRegistry.registerItem(Rasengan, "Rasengan");
		GameRegistry.registerItem(Rasengan2, "OdamaRasengan");
		GameRegistry.registerItem(Rasengan3, "ChioOdamaRasengan");
		GameRegistry.registerItem(AsaKujaku, "Asa Kujaku");
		GameRegistry.registerItem(Byakugo, "Byakugo");
		GameRegistry.registerItem(ChakuraNoMesu, "Chakura No Mesu");
		GameRegistry.registerItem(Dokugiri, "Dokugiri");
		GameRegistry.registerItem(Enmakugire, "Enmakugire");
		GameRegistry.registerItem(FukimiHari, "FukimiHari");
		GameRegistry.registerItem(FumaNinken, "Fuma Ninken");
		GameRegistry.registerItem(Hadan, "Hadan");
		GameRegistry.registerItem(HariJizo, "HariJizo");
		GameRegistry.registerItem(Haykkaroran, "Haykkaroran");
		GameRegistry.registerItem(Hirudora, "Hirudora");
		GameRegistry.registerItem(Iaido, "Iaido");
		GameRegistry.registerItem(InyuShometsu, "InyuShometsu");
		GameRegistry.registerItem(Issen, "Issen");
		GameRegistry.registerItem(JikukanKekkai, "Jikukan Kekkai");
		GameRegistry.registerItem(KageBuyo, "Kage Buyo");
		GameRegistry.registerItem(Kai, "Kai");
		GameRegistry.registerItem(KokuangyoNoJutsu, "KokouangyoNo Jutsu");
		GameRegistry.registerItem(KosaHo, "KosaHo");
		GameRegistry.registerItem(Koukongarasu, "Koukongarasu");
		GameRegistry.registerItem(KuchiyoseRashomon, "KuchiyoseRashomon");
		GameRegistry.registerItem(Meisaigakure, "Meisaigakure");
		GameRegistry.registerItem(MikazukiKiri, "Mikazuki Kiri");
		GameRegistry.registerItem(NanKaizou, "Nan Kaizou");
		GameRegistry.registerItem(NawanukeNoJutsu, "Nawanuke No Jutsu");
		GameRegistry.registerItem(Omotegiri, "Omotegiri");
		GameRegistry.registerItem(OmoteRenge, "Omote Renge");
		GameRegistry.registerItem(RaigenRaikochu, "RaigenRaikochi");
		GameRegistry.registerItem(Ranshinsho, "Ranshinsho");
		GameRegistry.registerItem(SaikanChushutsuNoJutsu, "Saikan Chushutsu No Jutsu");
		GameRegistry.registerItem(SamuraiSabreTechnique, "SamuraiSabreTehcnique");
		GameRegistry.registerItem(UraRenge, "Ura Renge");
		GameRegistry.registerItem(Yosakugiri, "Yosakugiri");
		//GameRegistry.registerItem(, "");
   	}
}