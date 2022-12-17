
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.monsterbestiary.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.monsterbestiary.MonsterbestiaryMod;

public class MonsterbestiaryModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MonsterbestiaryMod.MODID);
	public static final RegistryObject<Item> MIIA = REGISTRY.register("miia_spawn_egg",
			() -> new ForgeSpawnEggItem(MonsterbestiaryModEntities.MIIA, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> RACHNERA = REGISTRY.register("rachnera_spawn_egg",
			() -> new ForgeSpawnEggItem(MonsterbestiaryModEntities.RACHNERA, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SUU = REGISTRY.register("suu_spawn_egg",
			() -> new ForgeSpawnEggItem(MonsterbestiaryModEntities.SUU, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}
