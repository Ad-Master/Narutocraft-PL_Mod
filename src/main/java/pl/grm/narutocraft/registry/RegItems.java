package pl.grm.narutocraft.registry;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;
import pl.grm.narutocraft.NarutoCraft;
import pl.grm.narutocraft.items.DScroll;
import pl.grm.narutocraft.items.EScroll;
import pl.grm.narutocraft.items.FScroll;
import pl.grm.narutocraft.items.HScroll;
import pl.grm.narutocraft.items.KScroll;
import pl.grm.narutocraft.items.NScroll;
import pl.grm.narutocraft.items.RScroll;
import pl.grm.narutocraft.items.Rin;
import pl.grm.narutocraft.items.SScroll;
import pl.grm.narutocraft.items.armor.HelmetAnbu;
import pl.grm.narutocraft.items.weapons.BigKunai;
import pl.grm.narutocraft.items.weapons.BigScroll;
import pl.grm.narutocraft.items.weapons.Bijuudama;
import pl.grm.narutocraft.items.weapons.BushidoKatana;
import pl.grm.narutocraft.items.weapons.ChioRyuuGatana;
import pl.grm.narutocraft.items.weapons.DoubleKusarigama;
import pl.grm.narutocraft.items.weapons.ExplosiveNote;
import pl.grm.narutocraft.items.weapons.FoodMilitaryPill;
import pl.grm.narutocraft.items.weapons.Hiramekarei;
import pl.grm.narutocraft.items.weapons.HyuugaSalve;
import pl.grm.narutocraft.items.weapons.IchirakuRamen;
import pl.grm.narutocraft.items.weapons.IronGlove;
import pl.grm.narutocraft.items.weapons.KabutowariAxe;
import pl.grm.narutocraft.items.weapons.KabutowariHammer;
import pl.grm.narutocraft.items.weapons.Kama;
import pl.grm.narutocraft.items.weapons.Katana;
import pl.grm.narutocraft.items.weapons.Kiba;
import pl.grm.narutocraft.items.weapons.Knuckleduster;
import pl.grm.narutocraft.items.weapons.Kubikiribocho;
import pl.grm.narutocraft.items.weapons.Kurosawa;
import pl.grm.narutocraft.items.weapons.Kusanagi;
import pl.grm.narutocraft.items.weapons.KusanagiOrochimaru;
import pl.grm.narutocraft.items.weapons.KusariFuuboo;
import pl.grm.narutocraft.items.weapons.Kusarigama;
import pl.grm.narutocraft.items.weapons.Kusarigamawithpiston;
import pl.grm.narutocraft.items.weapons.LightBomb;
import pl.grm.narutocraft.items.weapons.LullingBomb;
import pl.grm.narutocraft.items.weapons.Machete;
import pl.grm.narutocraft.items.weapons.MetalCable;
import pl.grm.narutocraft.items.weapons.Mine;
import pl.grm.narutocraft.items.weapons.NarutoMaki;
import pl.grm.narutocraft.items.weapons.Nuibari;
import pl.grm.narutocraft.items.weapons.Nunchaku;
import pl.grm.narutocraft.items.weapons.Pasta;
import pl.grm.narutocraft.items.weapons.PillWithCoagulatedBlood;
import pl.grm.narutocraft.items.weapons.Raitanto;
import pl.grm.narutocraft.items.weapons.Ramen;
import pl.grm.narutocraft.items.weapons.RikudouStaff;
import pl.grm.narutocraft.items.weapons.Ringtones;
import pl.grm.narutocraft.items.weapons.Ryo;
import pl.grm.narutocraft.items.weapons.RyuuKatana;
import pl.grm.narutocraft.items.weapons.Samehada;
import pl.grm.narutocraft.items.weapons.SamuraiSword;
import pl.grm.narutocraft.items.weapons.Scalpel;
import pl.grm.narutocraft.items.weapons.ShellRockMace;
import pl.grm.narutocraft.items.weapons.Shibuki;
import pl.grm.narutocraft.items.weapons.SmokeBomb;
import pl.grm.narutocraft.items.weapons.StoneSword;
import pl.grm.narutocraft.items.weapons.TaishouSword;
import pl.grm.narutocraft.items.weapons.Tanto;
import pl.grm.narutocraft.items.weapons.ThreeProngedKnife;
import pl.grm.narutocraft.items.weapons.Wakizashi;
import pl.grm.narutocraft.items.weapons.WarKunai;
import pl.grm.narutocraft.items.weapons.Weights;
import pl.grm.narutocraft.items.weapons.projectiles.BigShuriken;
import pl.grm.narutocraft.items.weapons.projectiles.DoubleKunai;
import pl.grm.narutocraft.items.weapons.projectiles.ExplodeKunai;
import pl.grm.narutocraft.items.weapons.projectiles.FuumaShuriken;
import pl.grm.narutocraft.items.weapons.projectiles.KumoShuriken;
import pl.grm.narutocraft.items.weapons.projectiles.Kunai;
import pl.grm.narutocraft.items.weapons.projectiles.PoisonedSenbon;
import pl.grm.narutocraft.items.weapons.projectiles.Senbon;
import pl.grm.narutocraft.items.weapons.projectiles.Shuriken;
import pl.grm.narutocraft.jutsu.bukijutsu.FumaNinken;
import pl.grm.narutocraft.jutsu.bukijutsu.Hadan;
import pl.grm.narutocraft.jutsu.bukijutsu.Iaido;
import pl.grm.narutocraft.jutsu.bukijutsu.Issen;
import pl.grm.narutocraft.jutsu.bukijutsu.MikazukiKiri;
import pl.grm.narutocraft.jutsu.bukijutsu.MikazukiNoMai;
import pl.grm.narutocraft.jutsu.bukijutsu.Omotegiri;
import pl.grm.narutocraft.jutsu.bukijutsu.SamuraiSabreTechnique;
import pl.grm.narutocraft.jutsu.bukijutsu.Yosakugiri;
import pl.grm.narutocraft.jutsu.fuuinjutsu.JikukanKekkai;
import pl.grm.narutocraft.jutsu.genjutsu.Haykkaroran;
import pl.grm.narutocraft.jutsu.genjutsu.KokuangyoNoJutsu;
import pl.grm.narutocraft.jutsu.genjutsu.Koukongarasu;
import pl.grm.narutocraft.jutsu.genjutsu.RaigenRaikochu;
import pl.grm.narutocraft.jutsu.iryojutsu.Byakugo;
import pl.grm.narutocraft.jutsu.iryojutsu.ChakuraNoMesu;
import pl.grm.narutocraft.jutsu.iryojutsu.Dokugiri;
import pl.grm.narutocraft.jutsu.iryojutsu.InyuShometsu;
import pl.grm.narutocraft.jutsu.iryojutsu.Ranshinsho;
import pl.grm.narutocraft.jutsu.iryojutsu.SaikanChushutsuNoJutsu;
import pl.grm.narutocraft.jutsu.ninjutsu.ChioOdamaRasengan;
import pl.grm.narutocraft.jutsu.ninjutsu.Enmakugire;
import pl.grm.narutocraft.jutsu.ninjutsu.FukimiHari;
import pl.grm.narutocraft.jutsu.ninjutsu.HariJizo;
import pl.grm.narutocraft.jutsu.ninjutsu.Kai;
import pl.grm.narutocraft.jutsu.ninjutsu.KawarimiNoJutsu;
import pl.grm.narutocraft.jutsu.ninjutsu.KuchiyoseRashomon;
import pl.grm.narutocraft.jutsu.ninjutsu.Meisaigakure;
import pl.grm.narutocraft.jutsu.ninjutsu.NanKaizou;
import pl.grm.narutocraft.jutsu.ninjutsu.NawanukeNoJutsu;
import pl.grm.narutocraft.jutsu.ninjutsu.OdamaRasengan;
import pl.grm.narutocraft.jutsu.ninjutsu.Rasengan;
import pl.grm.narutocraft.jutsu.ninjutsu.Sharingan;
import pl.grm.narutocraft.jutsu.ninjutsu.ShunshinNoJutsu;
import pl.grm.narutocraft.jutsu.taijutsu.AsaKujaku;
import pl.grm.narutocraft.jutsu.taijutsu.Hirudora;
import pl.grm.narutocraft.jutsu.taijutsu.KageBuyo;
import pl.grm.narutocraft.jutsu.taijutsu.KosaHo;
import pl.grm.narutocraft.jutsu.taijutsu.OmoteRenge;
import pl.grm.narutocraft.jutsu.taijutsu.UraRenge;
import pl.grm.narutocraft.libs.config.Materials;
import pl.grm.narutocraft.libs.config.References;

public class RegItems extends NarutoCraft {

	public static Item FScroll = new FScroll();
	public static Item KScroll = new KScroll();
	public static Item DScroll = new DScroll();
	public static Item SScroll = new SScroll();
	public static Item RScroll = new RScroll();
	public static Item HScroll = new HScroll();
	public static Item EScroll = new EScroll();
	public static Item NScroll = new NScroll();
	public static Item Kurosawa = new Kurosawa().setUnlocalizedName("Kurosawa");
	public static Item Katana = new Katana().setUnlocalizedName("Katana");
	public static Item ChioRyuuGatana = new ChioRyuuGatana()
			.setUnlocalizedName("ChioRyuuGatana");
	public static Item StoneSword = new StoneSword()
			.setUnlocalizedName("StoneSword");
	public static Item Raitanto = new Raitanto().setUnlocalizedName("Raitanto");
	public static Item BushidoKatana = new BushidoKatana()
			.setUnlocalizedName("BushidoKatana");
	public static Item SamuraiSword = new SamuraiSword()
			.setUnlocalizedName("SamuraiSword");
	public static Item Wakizashi = new Wakizashi()
			.setUnlocalizedName("Wakizashi");
	public static Item Kubikiribocho = new Kubikiribocho()
			.setUnlocalizedName("Kubikiribocho");
	public static Item Tanto = new Tanto().setUnlocalizedName("Tanto");
	public static Item RyuuKatana = new RyuuKatana()
			.setUnlocalizedName("RyuuKatana");
	public static Item TaishouSword = new TaishouSword()
			.setUnlocalizedName("TaishouSword");
	public static Item SmokeBomb = new SmokeBomb()
			.setUnlocalizedName("SmokeBomb");
	public static Item LightBomb = new LightBomb()
			.setUnlocalizedName("LightBomb");
	public static Item Rin = new Rin().setUnlocalizedName("Rin");
	public static Item BigKunai = new BigKunai().setUnlocalizedName("BigKunai");
	public static Item Scalpel = new Scalpel().setUnlocalizedName("Scalpel");
	public static Item Kama = new Kama().setUnlocalizedName("Kama");
	public static Item KusariFuuboo = new KusariFuuboo()
			.setUnlocalizedName("KusariFuuboo");
	public static Item Kusarigama = new Kusarigama()
			.setUnlocalizedName("Kusarigama");
	public static Item Nunchaku = new Nunchaku().setUnlocalizedName("Nunchaku");
	public static Item DoubleKusarigama = new DoubleKusarigama()
			.setUnlocalizedName("DoubleKurasigama");
	public static Item ShellRockMace = new ShellRockMace()
			.setUnlocalizedName("ShellRockMace");
	public static Item Kusarigamawithpiston = new Kusarigamawithpiston()
			.setUnlocalizedName("Kusarigamawithpiston");
	public static Item Kunai = new Kunai().setUnlocalizedName("Kunai");
	public static Item Shuriken = new Shuriken().setUnlocalizedName("Shuriken");
	public static Item Senbon = new Senbon().setUnlocalizedName("Senbon");
	public static Item ExplodeKunai = new ExplodeKunai()
			.setUnlocalizedName("ExplodeKunai");
	public static Item PoisonedSenbon = new PoisonedSenbon()
			.setUnlocalizedName("PoisonedSenbon");
	public static Item BigShuriken = new BigShuriken()
			.setUnlocalizedName("BigShuriken");
	public static Item DoubleKunai = new DoubleKunai()
			.setUnlocalizedName("DoubleKunai");
	public static Item KumoShuriken = new KumoShuriken()
			.setUnlocalizedName("KumoShuriken");
	public static Item FuumaShuriken = new FuumaShuriken()
			.setUnlocalizedName("FuumaShuriken");
	public static Item Mine = new Mine().setUnlocalizedName("Mine");
	public static Item Weights = new Weights().setUnlocalizedName("Weights");
	public static Item WarKunai = new WarKunai().setUnlocalizedName("WarKunai");
	public static Item LullingBomb = new LullingBomb()
			.setUnlocalizedName("LullingBomb");
	public static Item Hiramekarei = new Hiramekarei()
			.setUnlocalizedName("Hiramekarei");
	public static Item KabutowariHammer = new KabutowariHammer()
			.setUnlocalizedName("KabutowariHammer");
	public static Item KabutowariAxe = new KabutowariAxe()
			.setUnlocalizedName("KabutowariAxe");
	public static Item Kiba = new Kiba().setUnlocalizedName("Kiba");
	public static Item KusanagiOrochimaru = new KusanagiOrochimaru()
			.setUnlocalizedName("KusanagiOrochimaru");
	public static Item Kusanagi = new Kusanagi().setUnlocalizedName("Kusanagi");
	public static Item Nuibari = new Nuibari().setUnlocalizedName("Nuibari");
	public static Item Samehada = new Samehada().setUnlocalizedName("Samehada");
	public static Item Shibuki = new Shibuki().setUnlocalizedName("Shibuki");
	public static Item Machete = new Machete().setUnlocalizedName("Machete");
	public static Item Knuckleduster = new Knuckleduster()
			.setUnlocalizedName("Knuckleduster");
	public static Item ThreeProngedKnife = new ThreeProngedKnife()
			.setUnlocalizedName("ThreeProngedKnife");
	public static Item HelmetAnbu = new HelmetAnbu()
			.setUnlocalizedName("HelmetAnbu");
	public static Item ExplosiveNote = new ExplosiveNote()
			.setUnlocalizedName("ExplosiveNote");
	public static Item Bijuudama = new Bijuudama()
			.setUnlocalizedName("Bijuudama");
	public static Item RikudouStaff = new RikudouStaff()
			.setUnlocalizedName("RikudouStaff");
	public static Item Ryo = new Ryo().setUnlocalizedName("Ryo");
	public static Item MetalCable = new MetalCable()
			.setUnlocalizedName("MetalCable");
	public static Item PillWithCoagulatedBlood = new PillWithCoagulatedBlood()
			.setUnlocalizedName("PillWithCoagulatedBlood");
	public static Item FoodMilitaryPill = new FoodMilitaryPill()
			.setUnlocalizedName("FoodMilitaryPill");
	public static Item Ringtones = new Ringtones()
			.setUnlocalizedName("Ringtones");
	public static Item HyuugaSalve = new HyuugaSalve()
			.setUnlocalizedName("HyuugaSalve");
	public static Item IronGlove = new IronGlove()
			.setUnlocalizedName("IronGlove");
	public static Item BigScroll = new BigScroll()
			.setUnlocalizedName("BigScroll");
	public static Item Ramen = new Ramen().setUnlocalizedName("Ramen");
	public static Item IchirakuRamen = new IchirakuRamen()
			.setUnlocalizedName("IchirakuRamen");
	public static Item Pasta = new Pasta().setUnlocalizedName("Pasta");
	public static Item NarutoMaki = new NarutoMaki()
			.setUnlocalizedName("NarutoMaki");
	// Jutsus
	/*public static Item AsaKujaku = new AsaKujaku()
			.setUnlocalizedName("AsaKujaku");
	public static Item Hirudora = new Hirudora().setUnlocalizedName("Hirudora");
	public static Item KageBuyo = new KageBuyo().setUnlocalizedName("KageBuyo");
	public static Item KosaHo = new KosaHo().setUnlocalizedName("KosaHo");
	public static Item OmoteRenge = new OmoteRenge()
			.setUnlocalizedName("OmoteRenge");
	public static Item UraRenge = new UraRenge().setUnlocalizedName("UraRenge");
	public static Item FumaNinken = new FumaNinken()
			.setUnlocalizedName("FumaNinken");
	public static Item Hadan = new Hadan().setUnlocalizedName("Hadan");
	public static Item Iaido = new Iaido().setUnlocalizedName("Iaido");
	public static Item Issen = new Issen().setUnlocalizedName("Issen");
	public static Item MikazukiKiri = new MikazukiKiri()
			.setUnlocalizedName("MikazukiKiri");
	public static Item MikazukiNoMai = new MikazukiNoMai()
			.setUnlocalizedName("MikazukiNoMai");
	public static Item Omotegiri = new Omotegiri()
			.setUnlocalizedName("Omotegiri");
	public static Item SamuraiSabreTechnique = new SamuraiSabreTechnique()
			.setUnlocalizedName("SamuraSabreTechnique");
	public static Item Yosakugiri = new Yosakugiri()
			.setUnlocalizedName("Yosakugiri");
	public static Item JikukanKekkai = new JikukanKekkai()
			.setUnlocalizedName("JikukanKekkai");
	public static Item Haykkaroran = new Haykkaroran()
			.setUnlocalizedName("Haykkaroran");
	public static Item KokuangyoNoJutsu = new KokuangyoNoJutsu()
			.setUnlocalizedName("KokuangyoNoJutsu");
	public static Item Koukongarasu = new Koukongarasu()
			.setUnlocalizedName("Koukongarasu");
	public static Item RaigenRaikochu = new RaigenRaikochu()
			.setUnlocalizedName("RaigenRaikochu");
	public static Item Byakugo = new Byakugo().setUnlocalizedName("Byakugo");
	public static Item ChakuraNoMesu = new ChakuraNoMesu()
			.setUnlocalizedName("ChakuraNoMesu");
	public static Item Dokugiri = new Dokugiri().setUnlocalizedName("Dokugiri");
	public static Item InyuShometsu = new InyuShometsu()
			.setUnlocalizedName("InyuShometsu");
	public static Item Ranshinsho = new Ranshinsho()
			.setUnlocalizedName("Ranshinsho");
	public static Item SaikanChushutsuNoJutsu = new SaikanChushutsuNoJutsu()
			.setUnlocalizedName("SaikanChushutsuNoJutsu");
	public static Item ChioOdamaRasengan = new ChioOdamaRasengan()
			.setUnlocalizedName("ChioOdamaRasengan");
	public static Item Enmakugire = new Enmakugire()
			.setUnlocalizedName("Enmakugire");
	public static Item FukimiHari = new FukimiHari()
			.setUnlocalizedName("FukimiHari");
	public static Item HariJizo = new HariJizo().setUnlocalizedName("HariJizo");
	public static Item Kai = new Kai().setUnlocalizedName("Kai");
	public static Item KawarimiNoJutsu = new KawarimiNoJutsu()
			.setUnlocalizedName("KawarimiNoJutsu");
	public static Item KuchiyoseRashomon = new KuchiyoseRashomon()
			.setUnlocalizedName("KuchiyoseRashomon");
	public static Item Meisaigakure = new Meisaigakure()
			.setUnlocalizedName("Meisaigakure");
	public static Item NanKaizou = new NanKaizou()
			.setUnlocalizedName("NanKaizou");
	public static Item NawanukeNoJutsu = new NawanukeNoJutsu()
			.setUnlocalizedName("NawanukeNoJutsu");
	public static Item OdamaRasengan = new OdamaRasengan()
			.setUnlocalizedName("OdamaRasengan");
	public static Item Rasengan = new Rasengan().setUnlocalizedName("Rasengan");
	public static Item Sharingan = new Sharingan()
			.setUnlocalizedName("Sharingan");
	public static Item ShunshinNoJutsu = new ShunshinNoJutsu()
			.setUnlocalizedName("ShunshinNoJutsu");*/

	public static ArmorMaterial Bushido = Materials.armorBUSHIDO;
	public static ArmorMaterial Anbu = Materials.armorANBU;
	public static ArmorMaterial Kiri = Materials.armorKIRI;
	public static ArmorMaterial Suna = Materials.armorSUNA;
	public static ArmorMaterial Akatsuki = Materials.armorAKATSUKI;
	public static ArmorMaterial Iwa = Materials.armorIWA;
	public static ArmorMaterial Konoha = Materials.armorKONOHA;
	public static ArmorMaterial Oto = Materials.armorOTO;
	public static ArmorMaterial Old = Materials.armorOLD;
	public static ArmorMaterial Kumo = Materials.armorKUMO;
	public static ArmorMaterial Ryuu = Materials.armorRYUU;

	// public static int renderBushidoArmor = proxy.addArmor("Bushido");
	// public static Item = new (id+);

	protected static void registerItem(Item item, String name) {
		GameRegistry.registerItem(item, name);
	}

	protected static void registerRendererToItem(Item item, String name) {
		Minecraft
				.getMinecraft()
				.getRenderItem()
				.getItemModelMesher()
				.register(
						item,
						0,
						new ModelResourceLocation(References.ModTexturePath
								+ name, "inventory"));
	}

	public static void regItemsList() {
		// registerItem(, "");
		registerItem(FScroll, "FScroll");
		registerItem(KScroll, "KScroll");
		registerItem(DScroll, "DScroll");
		registerItem(SScroll, "SScroll");
		registerItem(RScroll, "RScroll");
		registerItem(HScroll, "HScroll");
		registerItem(EScroll, "EScroll");
		registerItem(NScroll, "NScroll");
		registerItem(Kurosawa, "Kurosawa");
		registerItem(Katana, "Katana");
		registerItem(ChioRyuuGatana, "ChioRyuuGatana");
		registerItem(StoneSword, "StoneSword");
		registerItem(Raitanto, "Raitanto");
		registerItem(BushidoKatana, "BushidoKatana");
		registerItem(SamuraiSword, "SamuraiSword");
		registerItem(Wakizashi, "Wakizashi");
		registerItem(Kubikiribocho, "Kubikiribocho");
		registerItem(Tanto, "Tanto");
		registerItem(RyuuKatana, "RyuuKatana");
		registerItem(TaishouSword, "TaishouSword");
		registerItem(SmokeBomb, "SmokeBomb");
		registerItem(LightBomb, "LightBomb");
		registerItem(Rin, "Rin");
		registerItem(BigKunai, "BigKunai");
		registerItem(Scalpel, "Scalpel");
		registerItem(Kama, "Kama");
		registerItem(KusariFuuboo, "KusariFuuboo");
		registerItem(Kusarigama, "Kusarigama");
		registerItem(Nunchaku, "Nunchaku");
		registerItem(DoubleKusarigama, "DoubleKusarigama");
		registerItem(ShellRockMace, "ShellRockMace");
		registerItem(Kusarigamawithpiston, "Kusarigamawithpiston");
		registerItem(Kunai, "Kunai");
		registerItem(Shuriken, "Shuriken");
		registerItem(Senbon, "Senbon");
		registerItem(ExplodeKunai, "ExplodeKunai");
		registerItem(PoisonedSenbon, "PoisonedSenbon");
		registerItem(DoubleKunai, "DoubleKunai");
		registerItem(KumoShuriken, "KumoShuriken");
		registerItem(FuumaShuriken, "FuumaShuriken");
		registerItem(BigShuriken, "BigShuriken");
		registerItem(Mine, "Mine");
		registerItem(WarKunai, "WarKunai");
		registerItem(Weights, "Weights");
		registerItem(Shibuki, "Shibuki");
		registerItem(Samehada, "Samehada");
		registerItem(Nuibari, "Nuibari");
		registerItem(Kusanagi, "Kusanagi");
		registerItem(KusanagiOrochimaru, "KusanagiOrochimaru");
		registerItem(Kiba, "Kiba");
		registerItem(KabutowariAxe, "KabutowariAxe");
		registerItem(KabutowariHammer, "KabutowariHammer");
		registerItem(Hiramekarei, "Hiramekarei");
		registerItem(LullingBomb, "LullingBomb");
		registerItem(Machete, "Machete");
		registerItem(Knuckleduster, "Knuckleduster");
		registerItem(ThreeProngedKnife, "ThreeProngedKnife");
		registerItem(HelmetAnbu, "HelmetAnbu");
		registerItem(ExplosiveNote, "ExplosiveNote");
		registerItem(Bijuudama, "Bijuudama");
		registerItem(RikudouStaff, "RikudouStaff");
		registerItem(Ryo, "Ryo");
		registerItem(MetalCable, "MetalCable");
		registerItem(PillWithCoagulatedBlood, "PillWithCoagulatedBlood");
		registerItem(FoodMilitaryPill, "FoodMilitaryPill");
		registerItem(Ringtones, "Ringtones");
		registerItem(HyuugaSalve, "HyuugaSalve");
		registerItem(IronGlove, "IronGlove");
		registerItem(BigScroll, "BigScroll");
		registerItem(Ramen, "Ramen");
		registerItem(IchirakuRamen, "IchirakuRamen");
		registerItem(Pasta, "Pasta");
		registerItem(NarutoMaki, "NarutoMaki");
		/*registerItem(AsaKujaku, "AsaKujaku");
		registerItem(Hirudora, "Hirudora");
		registerItem(KageBuyo, "KageBuyo");
		registerItem(KosaHo, "KosaHo");
		registerItem(OmoteRenge, "OmoteRenge");
		registerItem(UraRenge, "UraRenge");
		registerItem(FumaNinken, "FumaNinken");
		registerItem(Hadan, "Hadan");
		registerItem(Iaido, "Iaido");
		registerItem(Issen, "Issen");
		registerItem(MikazukiKiri, "MikazukiKiri");
		registerItem(MikazukiNoMai, "MikazukiNoMai");
		registerItem(Omotegiri, "Omotegiri");
		registerItem(SamuraiSabreTechnique, "SamuraiSabreTechnique");
		registerItem(Yosakugiri, "Yosakugiri");
		registerItem(JikukanKekkai, "JikukanKekkai");
		registerItem(Haykkaroran, "Haykkaroran");
		registerItem(KokuangyoNoJutsu, "KokuangyoNoJutsu");
		registerItem(Koukongarasu, "Koukongarasu");
		registerItem(RaigenRaikochu, "RaigenRaikochu");
		registerItem(Byakugo, "Byakugo");
		registerItem(ChakuraNoMesu, "ChakuraNoMesu");
		registerItem(Dokugiri, "Dokugiri");
		registerItem(InyuShometsu, "InyuShometsu");
		registerItem(Ranshinsho, "Ranshinsho");
		registerItem(SaikanChushutsuNoJutsu, "SaikanChushutsuNoJutsu");
		registerItem(ChioOdamaRasengan, "ChioOdamaRasengan");
		registerItem(Enmakugire, "Enmakugire");
		registerItem(FukimiHari, "FukimiHari");
		registerItem(HariJizo, "HariJizo");
		registerItem(Kai, "Kai");
		registerItem(KawarimiNoJutsu, "KawarimiNoJutsu");
		registerItem(KuchiyoseRashomon, "KuchiyoseRashomon");
		registerItem(Meisaigakure, "Meisaigakure");
		registerItem(NanKaizou, "NanKaizou");
		registerItem(NawanukeNoJutsu, "NawanukeNoJutsu");
		registerItem(OdamaRasengan, "OdamaRasengan");
		registerItem(Rasengan, "Rasengan");
		registerItem(Sharingan, "Sharingan");
		registerItem(ShunshinNoJutsu, "ShunshinNoJutsu");*/

		// registerItem(, "");
	}

	public static void regRenderers() {
		registerRendererToItem(KScroll, "KScroll");
		registerRendererToItem(RScroll, "RScroll");
		registerRendererToItem(DScroll, "DScroll");
		registerRendererToItem(FScroll, "FScroll");
		registerRendererToItem(SScroll, "SScroll");
		registerRendererToItem(HScroll, "HScroll");
		registerRendererToItem(EScroll, "EScroll");
		registerRendererToItem(NScroll, "NScroll");
		registerRendererToItem(Kurosawa, "Kurosawa");
		registerRendererToItem(Katana, "Katana");
		registerRendererToItem(ChioRyuuGatana, "ChioRyuuGatana");
		registerRendererToItem(StoneSword, "StoneSword");
		registerRendererToItem(Raitanto, "Raitanto");
		registerRendererToItem(BushidoKatana, "BushidoKatana");
		registerRendererToItem(SamuraiSword, "SamuraiSword");
		registerRendererToItem(Wakizashi, "Wakizashi");
		registerRendererToItem(Kubikiribocho, "Kubikiribocho");
		registerRendererToItem(Tanto, "Tanto");
		registerRendererToItem(RyuuKatana, "RyuuKatana");
		registerRendererToItem(TaishouSword, "TaishouSword");
		registerRendererToItem(SmokeBomb, "SmokeBomb");
		registerRendererToItem(LightBomb, "LightBomb");
		registerRendererToItem(Rin, "Rin");
		registerRendererToItem(BigKunai, "BigKunai");
		registerRendererToItem(Scalpel, "Scalpel");
		registerRendererToItem(Kama, "Kama");
		registerRendererToItem(KusariFuuboo, "KusariFuuboo");
		registerRendererToItem(Kusarigama, "Kusarigama");
		registerRendererToItem(Nunchaku, "Nunchaku");
		registerRendererToItem(DoubleKusarigama, "DoubleKusarigama");
		registerRendererToItem(ShellRockMace, "ShellRockMace");
		registerRendererToItem(Kusarigamawithpiston, "Kusarigamawithpiston");
		registerRendererToItem(Kunai, "Kunai");
		registerRendererToItem(Shuriken, "Shuriken");
		registerRendererToItem(ExplodeKunai, "ExplodeKunai");
		registerRendererToItem(Senbon, "Senbon");
		registerRendererToItem(BigShuriken, "BigShuriken");
		registerRendererToItem(FuumaShuriken, "FuumaShuriken");
		registerRendererToItem(KumoShuriken, "KumoShuriken");
		registerRendererToItem(DoubleKunai, "DoubleKunai");
		registerRendererToItem(PoisonedSenbon, "PoisonedSenbon");
		registerRendererToItem(Mine, "Mine");
		registerRendererToItem(Weights, "Weights");
		registerRendererToItem(WarKunai, "WarKunai");
		registerRendererToItem(Shibuki, "Shibuki");
		registerRendererToItem(Samehada, "Samehada");
		registerRendererToItem(Nuibari, "Nuibari");
		registerRendererToItem(Kusanagi, "Kusanagi");
		registerRendererToItem(KusanagiOrochimaru, "KusanagiOrochimaru");
		registerRendererToItem(Kiba, "Kiba");
		registerRendererToItem(KabutowariAxe, "KabutowariAxe");
		registerRendererToItem(KabutowariHammer, "KabutowariHammer");
		registerRendererToItem(Hiramekarei, "Hiramekarei");
		registerRendererToItem(LullingBomb, "LullingBomb");
		registerRendererToItem(Machete, "Machete");
		registerRendererToItem(Knuckleduster, "Knuckleduster");
		registerRendererToItem(ThreeProngedKnife, "ThreeProngedKnife");
		registerRendererToItem(HelmetAnbu, "HelmetAnbu");
		registerRendererToItem(ExplosiveNote, "ExplosiveNote");
		registerRendererToItem(Bijuudama, "Bijuudama");
		registerRendererToItem(RikudouStaff, "RikudouStaff");
		registerRendererToItem(Ryo, "Ryo");
		registerRendererToItem(MetalCable, "MetalCable");
		registerRendererToItem(PillWithCoagulatedBlood,
				"PillWithCoagulatedBlood");
		registerRendererToItem(FoodMilitaryPill, "FoodMilitaryPill");
		registerRendererToItem(Ringtones, "Ringtones");
		registerRendererToItem(HyuugaSalve, "HyuugaSalve");
		registerRendererToItem(IronGlove, "IronGlove");
		registerRendererToItem(BigScroll, "BigScroll");
		registerRendererToItem(Ramen, "Ramen");
		registerRendererToItem(IchirakuRamen, "IchirakuRamen");
		registerRendererToItem(Pasta, "Pasta");
		registerRendererToItem(NarutoMaki, "NarutoMaki");
		/*registerRendererToItem(AsaKujaku, "AsaKujaku");
		registerRendererToItem(Hirudora, "Hirudora");
		registerRendererToItem(KageBuyo, "KageBuyo");
		registerRendererToItem(KosaHo, "KosaHo");
		registerRendererToItem(OmoteRenge, "OmoteRenge");
		registerRendererToItem(UraRenge, "UraRenge");
		registerRendererToItem(FumaNinken, "FumaNinken");
		registerRendererToItem(Hadan, "Hadan");
		registerRendererToItem(Iaido, "Iaido");
		registerRendererToItem(Issen, "Issen");
		registerRendererToItem(MikazukiKiri, "MikazukiKiri");
		registerRendererToItem(MikazukiNoMai, "MikazukiNoMai");
		registerRendererToItem(Omotegiri, "Omotegiri");
		registerRendererToItem(SamuraiSabreTechnique, "SamuraiSabreTechnique");
		registerRendererToItem(JikukanKekkai, "JikukanKekkai");
		registerRendererToItem(Haykkaroran, "Haykkaroran");
		registerRendererToItem(KokuangyoNoJutsu, "KokuangyoNoJutsu");
		registerRendererToItem(Koukongarasu, "Koukongarasu");
		registerRendererToItem(RaigenRaikochu, "RaigenRaikochu");
		registerRendererToItem(Byakugo, "Byakugo");
		registerRendererToItem(ChakuraNoMesu, "ChakuraNoMesu");
		registerRendererToItem(Dokugiri, "Dokugiri");
		registerRendererToItem(InyuShometsu, "InyuShometsu");
		registerRendererToItem(Ranshinsho, "Ranshinsho");
		registerRendererToItem(SaikanChushutsuNoJutsu, "SaikanChushutsuNoJutsu");
		registerRendererToItem(ChioOdamaRasengan, "ChioOdamaRasengan");
		registerRendererToItem(Enmakugire, "Enmakugire");
		registerRendererToItem(FukimiHari, "FukimiHari");
		registerRendererToItem(HariJizo, "HariJizo");
		registerRendererToItem(Kai, "Kai");
		registerRendererToItem(KawarimiNoJutsu, "KawarimiNoJutsu");
		registerRendererToItem(KuchiyoseRashomon, "KuchiyoseRashomon");
		registerRendererToItem(Meisaigakure, "Meisaigakure");
		registerRendererToItem(NanKaizou, "NanKaizou");
		registerRendererToItem(NawanukeNoJutsu, "NawanukeNoJutsu");
		registerRendererToItem(OdamaRasengan, "OdamaRasengan");
		registerRendererToItem(Rasengan, "Rasengan");
		registerRendererToItem(Sharingan, "Sharingan");
		registerRendererToItem(ShunshinNoJutsu, "ShunshinNoJutsu");*/
	}
}
